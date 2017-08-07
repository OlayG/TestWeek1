Test 1:
1.	git add .
	git commit -m "Message"
	git push branchName
2.	res -> value -> strings.xml
3.	None besides sp being for text so it can scale with users preference and dp for everything else
4.	Assuming if you have all your base language strings in the strings.xml
	Create a new resource file called strings.xml
	In the “Available qualifiers” select local
	Click the arrow >>
	Select language of your choice and just interpret
5.	match_parent fill the height or width to the size of the parent
	wrap_content grows with the content inside
6.	in the xml just do the onClick property
7.	Button btn;
	btn = findViewByID(R.id.btnIdName);
	btn.setOnClickListener(new OnClickListener()....)
8.	android:background = "color"
9.	res -> value -> colors.xml
10.	Create a new resource file
	In the “Available qualifiers” select Local & Orientation
11.	editText.setInputType(InputType.TYPE_NULL);
12.	View - basic building block of ui simple shapes like rectangle
	ViewGroups - holds multiple views an viewgroups and is the base of all layouts
13.	Orientation
14.	If you want to align views 1 by 1 vertically or horizontally
15.	Xml -> android:src=""
Java -> ImageViewID.setImageResource();
16.	Create, Start, Resume, Restart, Pause, Stop, Destroy
17.	Activity 1: Pause, Stop, Destroy
	Activity 2: Create, Start, Resume
18.	In the manifest folder in the activity tag:  android:screenOrientation="portrait"
19.	sharedPreferences
20.	Key, MODE
21.	Using editor
22.	getString()
23.	Bundle is a Map that stores data as objects
24.	onPause -> activity still visible
	onStop -> activity partially visible
25.	callback
26.	onActivityResult();
27.	Explicit and Implicit
	Explicit parameters are given while Implicit they are not
	Explicit is used when launching an activity from another
28.	Intent is one way
29.	intent.putExtra(key, value)
30.	String
31.	intent.getStringExtra(getString(“KEY”))
32.	Abstract class that lets you access specific resources, calls, and classes
33.	Linear, Relative, Frame, Grid, Constraint, etc
34.	intent.putExtra(“Key”, Value);
35.	Java interface
36.	Android interface
37.	Parcelable because Serializable uses reflection
38.	You Implement Serializable or Parcelable,
	Only Parcelable implements methods:
describeContents() -
writeToParcel(Parcel parcel, int i)
Creator -
39.	No
40.	Allow you to designate how the new activity instance will relate to the current task.
	Standard - Just keeps adding to stack every new instance
	singleTop - only lets you stack the instance once if it's already on top of stack
	singleTask - only one instance of the task will be present in all running threads
	singleInstance- only 1 instance of that particular activity instance will be allowed in stack
41.	Stack data structure that stores the last activity instance
42.	Build options in navbar menus
	Select “Build APK”
43.	Build options in the navbar menus
	Then select Generate Signed APK
	Follow directions

