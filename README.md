# Automotive Case Study

This folder can be used for the automive case study. 
We could use it to track our progress, as well as upload the code for our apps.

Here is the road map that we have.

## Deadline
**28. Nov - 13. Dec** is the window of completion. We will be presenting this to GM.


## TODO
#### Step 1
- [ ] Configure different cars--start with a produce line.
    
    We have four emulators from GM Developers
        https://developer.gm.com/

    Emulators can be split between Ali & Alessio
        **Alessio**
            - [ ] Name: MY23 GMC Yukon
            URL: XML resource link 
                https://developer.gm.com/downloads/final_37_03042022_emulator.xml
            - [ ] Name: MY23 GMC Hummer EV SUV
            URL: XML resource link 
                https://developer.gm.com/downloads/final_38_03042022_emulator.xml
        **Ali**
            - [X] Name: MY24 CADILLAC Lyriq Freeform SUV
            URL: XML resource link 
                https://developer.gm.com/downloads/final_ff_05302022_emulator.xml
            - [ ] Name: MY24 GM SUV
            URL: XML resource link 
                https://developer.gm.com/downloads/final_31XX_06272022_emulator.xml

#### Step 2
- [ ] Understand what makes them different
    We want the apps to find these and exploit them.

#### Step 3
- [ ] Create one app on these products (that could have) different behaviour on these products.

#### Step 4
- [ ] Access a feature (e.g. sensor) that only one product has.

#### Step 5
- [ ] Find a second app that interacts with the first app under some condition. 

### Questions to be answered

- [ ] Can these emulators be used with a car simulator such as CARLA?

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