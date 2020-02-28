# Timetable-App

## Introduction-
It is a mobile app which would be used by students to make a visual timetable for their daily routines. It would have a week view in 1 screen with 7 columns for 7 days of the week. and the rows will be according to the time of the day. Mostly like the weekly view of the google calender. Google calendar has almost same features but it doesnt have a recurring event like classes gym times etc. This app would be helpful to students as with a single glance the students would know what is his/her routine for the day. Also he/she would know the free times he/she has throughout the day. 

## Timetable Activity (Activity 1)- 
This would have the routine is full view. The user would have to scroll down a bit to view the rest of the hours of each day. 

### Main Buttons-
Each of the columns(days of the week) would be separarted by 30 mins from 6 AM to 10 PM (16 hours/ 32 segments of 30 mins). Each of the segments would be a button which would take the user to the next activity and will also trigger a bolean value by which the app would know which segment was pressed to get to this activity. 

## Event Activity ( Activity 2)-
This would be where the user would set the events of the routine. Whatever the events would be saved in this activity will be shown of the 1st activity. This Activity would have a few features. 
1. Starting time
2. Duration
3. End time (to show)
4. Name
5. Location
6. Type
7. Color code. 
8. Confirm Button

### 1. Starting time- 
The starting time would be found by the app through the bolean value sent by the 1st activity. It would be the default time for the time picker for better UX. The final value of the starting time would be sent to the 1st activity for further application.

### 2. Duration-
The duration of the event will be selected by 6 option in the duration field. It will be a drop-down/ item selection type of thing to select 6 options which are- 30 mins, 1 hour, 1 hour 30 mins, 2 hours, 2 hour 30 mins, 3 hours. The selected duraction from the items will be added to the starting time and be show in the next section which is the End time text view. The idea of making this duration to be options is also for better UX. The selected option value will also be sent to the 1st activity for further application. 

### 3. End time(to show)-
This text view will show the time value which will be added to the starting selected time. This is just to show the user the end time of the event and this adds nothing to the program. 

### 4. Name-
This is an input field where the user will put in the name of the event. This string value will be send to the 1st activity for further application. 

### 5. Location-
Another input field where the user will put in the location of the event. This string will be sent to the 1st activity for further application. 

### 6. Type-
Another input field where the user will put in the type for the event. This string will be sent to the 1st activity for further application. This value will have a bit more functionality in the 1st activity. 

### 7. Color code-
This is where the users will select a color to color code their events on the timetable. The selected color will have a hex code which will be sent to the 1st activity for further application. 

### 8. Confirm button-
This button will send the above values to the 1st activity. this will always reset the bolean value to the initial value for the user to input again for another event. 

## 1st activity functionality- 
After the values from the 2nd activity is sent to the 1st activity. The app will show blocks of color. The colored block will be from the starting time to the end time and above the colored block there will be text views to show the Name and Location of the event. 
