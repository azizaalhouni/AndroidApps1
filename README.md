# AndroidApps1
Lab2
Lesson – 3 – Programming Homework
Problem – 1: Design the Dinner Decider app as per the requirement either hard coding or drag and drop.
Components need to be added are • ImageView
• TextView
• EditText
• Two Buttons for ADD FOOD and DECIDE!
To create ImageView Button use the given code in your xml file. Copy dd_logo image on your res\drawable folder. The dd_logo.png file is available on your Lesson3 homework assignment folder.
For More Info refer : https://developer.android.com/guide/topics/ui/controls/button.html
   <ImageButton
android:layout_width="wrap_content" android:layout_height="wrap_content" android:src="@drawable/dd_logo"
... />
  
Task A:
In your MainActivity.kt, add an ArrayList with default values { Hamburger, Pizza, Mexican, American, Chinese }.
If the user clicks the DECIDE! Button, randomly select the stored values from the ArrayList and then change the TextView with the random value.
Task B:
If the user is not happy with the default vales, they could add the food by typing in the EditText component and add the value by clicking the ADD FOOD button into ArrayList food.
2. Work with your team to learn how to integrate GitHub and Android Studio. Everyday homework should be submitted on Sakai.
Refer github_integration_with_android.pdf attachment file on your Lesson homework assignment folder will help you to setup GitHub and Android studio
