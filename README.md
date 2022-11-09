# Automotive Case Study

This folder can be used for the automive case study. 
We could use it to track our progress, as well as upload the code for our apps.

Here is the road map that we have.

## Deadline
**28. Nov - 13. Dec** is the window of completion. We will be presenting this to GM.
**While no exact deadline is given Nov 28 should be assumed**


## TODO
#### Step 1 **Nov 9th**
- [X] Configure different cars--start with a produce line.
    
    - [X] Install Android Studio **Nov 4**
    
    Set up all four emulators from [GM Developers](https://developer.gm.com) **Nov 9**
    
    - [X] MY23 GMC Yukon    
    - [X] MY23 GMC Hummer EV SUV    
    - [X] MY24 CADILLAC Lyriq Freeform SUV    
    - [X] MY24 GM SUV

#### Step 2 **Nov 10**
- [ ] Understand what makes them different
    We want the apps to find these and research them.
    
    - [ ] Read android automotive [documentation](https://developer.android.com/training/cars) **Nov 6**
    - [ ] Identify what sensors or actuators we can have access through Android Automotive OS [doc](https://developer.android.com/jetpack/androidx/releases/car-app) **Nov 7**
    - [ ] Read through [Audio Attributes](https://developer.android.com/reference/androidx/media/AudioAttributesCompat#getFlags()) **Nov 7**    
    - [ ] Identify product specific sensors (sensors that are only available for one vehicle and not for others) **Nov 8**
       

#### Step 3 **Nov 10**
- [ ] Create one app on these products (that could have) different behaviour on these products.

    - [ ] Start with a messaging app template **Nov 10**
    - [ ] Start with a media service app template **Nov 10**
    - [ ] Learn how to display a text or an image on the screen **Nov 10**
    - [ ] Play a music file through the media service **Nov 10**

#### Step 4 **Nov 17**
- [ ] Access a feature (e.g. sensor) that only one product has.
    - [ ] Detirmine product specific sensors identified previously to be used in the media service app **Nov 14**

#### Step 5 **Nov 24**
- [ ] Find a second app that interacts with the first app under some condition. 

### Questions to be answered

- [ ] Can these emulators be used with a car simulator such as CARLA? **Nov 11**
    - [X] Set up a meeting with Huaken **Nov 7**
    - [ ] Receive back answer from Huaken **Nov 10**
    - [ ] If CARLA or another simulator can be used, ask team if this is useful for our project **Nov 11**

- [ ] A car doesn't have a sensor. An app uses that sensor. What happens? 
    Can the app still be installed?
    Does the app crash?
    Does the system crash?


### Ultimate Goal

Here is a scenario that must hold. There is a beep from a sensor or a drive assist that is critically important. 

This sensor uses the same resource (the speakers) as a lower priority app such as spotify. 

How can we ensure that an update to the product line does ensures this?
    What do we need to test, verify, model, analyse to ensure it?

We use this case study to find an examplar to better see the problem and identify by example its solution.
