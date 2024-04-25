package ChapNineNTen;

public class Notes {
    // Chap 9
/*
The stack is where method invocations and local variables live
Ex:
go();
doStuff();
main();

The heap is where ALL OBJECTS live
Ex:
Duck object, Snowboard object, Button object

When methods are stacked the method on top is always being executed
They become stacking methods when they call upon another method in a method
 */
    //Ex:
    //Start of stacking
    public void doStuff(){
        boolean b = true;
        go(4);
    }
    public void go(int x){
        int z = x +24;
        crazy();
    }
    public void crazy(){
        char c = 'a';
    }
    //End of stacking
// If local variable is a reference to an object, only the variable (the reference/remote control) goes on the stack
    //EX look at StackRef class

    /*
Instance variables live on the Heap with the objects
When they're two primitive instance variable, they live in the object
If one is non-primitive but references an object not created you just get access to it with no benefit (YET)
When the object is created the variable is assigned to the new object

Declaring of a reference:
Duck myDuck

Creating an object:
new Duck();

Linking the object and reference:
=

Put together:
Duck myDuck = new Duck();

The “new Duck();” is not a method but instead its constructor we’re calling
If a constructor isn’t created the compiler creates one for you
Its default constructor looks like:

You know it's a constructor because it doesn’t have a return type also because its name is the same as the class name.

Want two ways to make a object:
One with a constructor that has the parameters you want and one thats default if you know what you need

Having more than one constructor in a class means you have overloaded constructors.

The compiler only makes a constructor if one isn’t created but if there is one it wont make even a default one, leaving you to create a default.

Unless you created a default already when you create more constructors you have to give them parameter to signify the difference

When using superclasses and subclasses constructors from parent class this is called Constructor Chaining

YOU CANNOT CALL A SUPER CONSTRUCTOR BY ITS NAME ONLY BY USING super()
Add super(); to the duck constructor

The child cannot come before the parent class you must put the constructor first that has the super constructor being called

A constructor can have this() or super() but never both

Life local variable:
Alive as long as its stack frame is on the stack (until method completes)

Scope:
Only within the method in which it was declared (variable) but when its own method calls another, its not in scope anymore

Same thing with primitives and references

Ways to kill objects:
Reference goes out of scope permanently
Assign reference to another object
Explicitly set the reference to null
     */
    //Chapter 10
    /*
 Math class is a class that ALL classes extend from
non-static methods behaviors can be changed while static methods can't
Call static method using class
Call non-static method using reference variable
Static method cannot udr non-static instance variables
They also cant use non-static methods either

Static variables values stay the same throughout the class
Static final vaiables are constants
Finals can be used in non-static methods also

Wrapping a primitive is used when you need to make an primitive an object like an ArryaList
Ex:
int i =288;
Integer iWrap = new Integer(i);

Unwrapping Ex:
int unWrapped = iWrap.intValue();

Wrappers have static utility methods too
Like converting a String to a primitive value

You can turn a primitive number into a String

Number formatting is to make a number easier to read or fit what is needed

Ex:
format("I have %,.2f bugs to fix." , 476578.09876);
This will read: I have 476,578.10 bugs to fix.

%,d means insert commas and format the number point as a decimal integer
%.2f means format the number as a floating point with a precision of two decimal places
%,.2f means insert commas and format by floating point with a precision of two decimal places

A format specifier can have up to 5 different parts and ORDER MATTERS
The type is the only thing mandatory, everything else optional
If you have two arguments just add them to the format string
You can do date and time(%tc), just time(%tr), day of the week, month and day(%tA, %tB, %td)

Also works with calendar objects
Java 5.0 added static imports which are methods already done for you and saves you time a making them and typing them

     */









}
