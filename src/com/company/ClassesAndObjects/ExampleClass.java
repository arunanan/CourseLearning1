package com.company.ClassesAndObjects;
/*Classes:
        A class is a blueprint of an application, where you implement methods (to perform certain actions/functionalities)
        and declare variables (that describe the properties of the application). For example, Payments could be an entire
        class in itself in the Ola App example you saw earlier.

        The whole idea behind classes is to have independent modules in the program, each class representing one particular entity*/

/*Objects:
        Class is a blueprint and objects are the blocks built upon this blueprint with certain state and behaviour.*/

/*The 'this' keyword is often used in classes to refer to instance variables. The 'this' keyword is used to distinguish
        the instance variables from parameters that have the names as the instance variable, and makes declaring of a constructor easier.*/

/*Static variables are useful if you need to share the same set of information across all objects of a class,
        such as the University name in our example.
        The static variable is allocated memory only once, at the time of loading a class.
        Static methods cannot access non-static variables, or call non-static methods.
        But static methods can access any static variable and change its value.

        When you try to call static methods using an object, it will give you a warning, but you can still call that method.
        The reason for this is that static methods are common to all the objects and any particular object can call those methods.
         But it is not recommended to call these methods using the objects.*/
public class ExampleClass {
    public static float radius = 10f;
    public static void main(String[] args) {
        System.out.println(Circle.circumference(2*radius)); // passing arguments : argument is the actual value
                                                                    // that goes as an input while calling that method

    }
}

class Circle {
    public static float circumference(float diameter) {    // Declaring parameter while method declaration
                                                           //A parameter is the variable that goes as an input during
                                                           // the declaration of a method

        return 3.14f * diameter;
    }
}
