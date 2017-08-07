package com.example.admin.testweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    static Scanner sc = new Scanner(System.in);
    static Stack stringStack = new Stack();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String wordToCheckIfPalindrome = "madam";
        int numToCheckIfArmstrong = 153;

        System.out.println("Is " + wordToCheckIfPalindrome + " a palindrome? " + isStringPalindrome(wordToCheckIfPalindrome));
        System.out.println("Is " + numToCheckIfArmstrong + " a Armstrong Number? " + isArmstrongNumber(numToCheckIfArmstrong));

        getFourStringItems();

    }
    private static void getFourStringItems() {

        for(int i = 0; i < 4; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            String word = sc.nextLine();
            stringStack.push(word);
        }

        System.out.println("Items in stack are:");
        while(stringStack.size() > 0) {
            System.out.println(stringStack.pop());
        }

    }

    private static boolean isArmstrongNumber(int num) {
        int numLength = String.valueOf(num).length();
        int tempNum = num;
        int sum = 0;
        if(num < 1) {
            return false;
        }

        for(int i = 0; i < numLength; i++) {
            sum += Math.pow((tempNum % 10), numLength);
            tempNum = tempNum/10;
        }

        if(sum == num)
            return true;

        return false;
    }

    private static boolean isStringPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end --;
        }

        return true;
    }

}


/*Test 1:
        1.	What set of commands are executed to push a repo on Github?
        git add .
        git commit -m "Message"
        git push branchName
        2.	Where the strings.xml in the project structure?
        res -> value -> strings.xml
        3.	What is the difference between SP and DP?
        None besides sp being for text so it can scale with users preference and dp for everything else
        4.	How can you support multiple languages in your app? Explain step by step process.
        Assuming if you have all your base language strings in the strings.xml
        Create a new resource file called strings.xml
        In the “Available qualifiers” select local
        Click the arrow >>
        Select language of your choice and just interpret
        5.	What is the difference between match_parent and wrap_content?
        match_parent fill the height or width to the size of the parent
        wrap_content grows with the content inside
        6.	How can you setup a method for a button click without binding the view?
        in the xml just do the onClick property
        7.	How can you define a button click method with binding the button view?
        Button btn;
        btn = findViewByID(R.id.btnIdName);
        btn.setOnClickListener(new OnClickListener()....)
        8.	How can you change the color of the TextView?
        android:background = "color"
        9.	Where are all the colors in the android architecture saved?
        res -> value -> colors.xml
        10.	How would you add a different layout for a landscape and a language? Name the qualifiers.
        Create a new resource file
        In the “Available qualifiers” select Local & Orientation
        11.	How would you make the keyboard hide for EditText when the activity is created?
        editText.setInputType(InputType.TYPE_NULL);
        12.	What are ViewGroups and Views?
        View - basic building block of ui simple shapes like rectangle
        ViewGroups - holds multiple views an viewgroups and is the base of all layouts
        13.	What attribute is necessary in a linear layout if there are more than one child views?
        Orientation
        14.	In which case you would use a Linear layout and a Relative layout?
        If you want to align views 1 by 1 vertically or horizontally
        15.	How would you load an image in a ImageView from xml and programmatically?
        Xml -> android:src=""
        Java -> ImageViewID.setImageResource();
        16.	List all the states in an activity lifecycle.
        Create, Start, Resume, Restart, Pause, Stop, Destroy
        17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
        Activity 1: Pause, Stop, Destroy
        Activity 2: Create, Start, Resume
        18.	How to restrict an activity from changing the orientation?
        In the manifest folder in the activity tag:  android:screenOrientation="portrait"
        19.	Which method is called to persist the data before the activity is destroyed?
        sharedPreferences
        20.	What is the argument of that method?
        Key, MODE
        21.	How do we save the data in the method?
        Using editor
        22.	How to get that data back? What is the name of the method?
        getString()
        23.	What is a bundle? What can a bundle contain?
        Bundle is a Map that stores data as objects
        24.	What is the difference between onPause and onStop?
        onPause -> activity still visible
        onStop -> activity partially visible
        25.	How to start an activity for getting a result back?
        callback
        26.	Which callback is used get the result back in the above case?
        onActivityResult();
        27.	What are difference types of Intent? What are the difference between them? When do we use each of them?
        Explicit and Implicit
        Explicit parameters are given while Implicit they are not
        Explicit is used when launching an activity from another
        28.	How to communicate data between activities?
        Intent is one way
        29.	How to add data to an intent?
        intent.putExtra(key, value)
        30.	What kind of data can be added to an intent?
        String
        31.	How to get the data sent from activity one in activity two?
        intent.getStringExtra(getString(“KEY”))
        32.	What is context?
        Abstract class that lets you access specific resources, calls, and classes
        33.	Name different kinds of layouts in Android?
        Linear, Relative, Frame, Grid, Constraint, etc
        34.	How to send an object through an Intent?
        intent.putExtra(“Key”, Value);
        35.	What is Serializable?
        Java interface
        36.	What is Parcelable?
        Android interface
        37.	Which is better and why?
        Parcelable because Serializable uses reflection
        38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
        You Implement Serializable or Parcelable,
        Only Parcelable implements methods:
        describeContents() -
        writeToParcel(Parcel parcel, int i)
        Creator -
        39.	Can we avoid implementing methods using Parcelable?
        No
        40.	What are launch modes? Explain each one of them in detail.
        Allow you to designate how the new activity instance will relate to the current task.
        Standard - Just keeps adding to stack every new instance
        singleTop - only lets you stack the instance once if it's already on top of stack
        singleTask - only one instance of the task will be present in all running threads
        singleInstance- only 1 instance of that particular activity instance will be allowed in stack
        41.	What is back stack?
        Stack data structure that stores the last activity instance
        42.	How to we create a .apk file?
        Build options in navbar menus
        Select “Build APK”
        43.	How to create and signed .apk file
        Build options in the navbar menus
        Then select Generate Signed APK
        Follow directions*/

