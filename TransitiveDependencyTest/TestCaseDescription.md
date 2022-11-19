# Summary

This app is a minimal example which demonstrates a condition that can cause a crash.

This is done by updating a dependency, which implicitly introduces a new, transitive dependency. This new dependency imposes constraints on the app which are not checked until runtime.
As the app is not updated to meet this constraint, this results in a crash.

# Background

This app reproduces a crash in the [CycleStreets Android app](https://github.com/cyclestreets/android) in commit [a6b6272](https://github.com/cyclestreets/android/commit/a6b627246c6145838601a974cb9e0bce7f9dec5e).

The purpose of this commit was to upgrade many of the app's dependencies, including build tools and third-party libraries. Although the build as of this commit succeeded, the app began to crash on startup.

The subsequent commit [a6b6272](https://github.com/cyclestreets/android/commit/a6b627246c6145838601a974cb9e0bce7f9dec5e) fixed this, by declaring a dependency on Android's App Startup library in order to disable it.

After conducting a search by applying the dependency updates in commit a6b6272 one at a time, it was determined that the upgrade of [Iconics](https://github.com/mikepenz/Android-Iconics) from version 5.0.3 to 5.2.8 introduced the crash.
A further search over versions of this library showed that upgrading to Iconics 5.1.0 was sufficient to cause the app to crash.

In accordance with the crash being resolved by disabling the Android App Startup library, Iconics had introduced a dependency on the App Startup library [between these versions](https://github.com/mikepenz/Android-Iconics/compare/v5.0.3...v5.1.0).

[The documentation for the App Startup library](https://developer.android.com/topic/libraries/app-startup) notes that apps using it must have a class implementing an interface `Initializer<T>` from the library.

At runtime, the library looks for implementations of this interface. However, since CycleStreets only gained a dependency on this library implicitly, there were no changes made to the code to support this new requirement.

As a result, when the app is launched the App Startup library would search for implementers of `Initializer<T>`, not find any, and throw an exception which ended up unhandled.

# The Test Case

This app is a minimal running app for Android Automotive which simply shows "Hello World!" on the screen.

It declares a dependency on the Iconics library that CycleStreets uses. None of its functionality is used anywhere in the app, simply including it as a dependency is enough to demonstrate the test case.

If built with version 5.0.3 of Iconics, the app runs successfully. But, if built with version 5.1.0 or higher instead, it crashes on startup.