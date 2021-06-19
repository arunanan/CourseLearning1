package com.company.OOPS;

/*considerations while overriding a method :
        The access modifier of the method in the subclass cannot be more restrictive than the one in the superclass
        Methods defined as private, static, or final cannot be overridden.*/

//Static polymorphism:
/*       Method overloading is also known as early binding as the type of the object is determined at the time of compilation.
               Two important considerations while using method overloading are:

               The return type of a method may or may not be different.

               The parameter list MUST be different (either lengthwise or datatype wise) for each version of a method in a class.

Note:Having the same parameter list(same number of variables and type) but a different return type for a method will result in a compilation error.*/
/*  ERROR: Ambiguous method call. Both  add(int,int) in Addition and   add(int, int)   in Addition match*/

 /**The order of access modifiers in the increasing order of their restrictive nature is:
public > protected > default > private**/
/*
A more restrictive access modifier can be converted into a less restrictive access modifier but not vice versa,
                which means that a protected method can be made public but a public method cannot be made protected.
        Similarly, in this option, you can override a default method to either public or protected
because it is less restrictive.*/
class Addition
{
    int add(int a, int b)
    {
        return a+b;
    }
    float  add(int a, int b)
    {
        return (float)a+b+c;
    }
}
public class Polymorphism
{
    public static void main(String args[])
    {
        Addition obj = new Addition();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10));
    }
}

/** Polymorphism: It refers to the ability that allows methods with similar names to behave differently. Polymorphism can be either static or dynamic. 
It allows you to create extensible and flexible programs.
 
Method overriding: When a subclass decides to provide its own implementation of a method defined in its superclass,
it is said to override the base version of the method. Method overriding is used to implement a specific type of polymorphism called dynamic polymorphism. 
In order to invoke the superclass version of an overridden method, you can use the super keyword.
 
Method overloading: When a class defines several methods with the same name, which perform the similar or the same tasks, 
but on different types or different numbers of parameters, the methods are said to be overloaded. Method overloading is commonly used to implement a 
specific type of polymorphism, known as compile time polymorphism.
 
Compile-time polymorphism: Whenever there exist two or more methods with identical names but with different parameter lists in the same class, 
which version of the method is to be invoked is decided at compile time. The decision is based on the parameters that are passed to the method.
 
Run-time polymorphism: Whenever a call to an overridden method is made, the decision to invoke the superclass version or the subclass version of the method 
is taken at run-time. This is based on the type of object, whether superclass or subclass, that is being used to invoke the method.
 
Abstract classes: The purpose of an abstract class is to share a common design or template, which other classes can inherit from or use to provide their own implementations. 
An abstract class consists of abstract methods (methods with no definition) and/or non-abstract methods and cannot be instantiated. 
They can only act as superclasses for other classes in the program. The definition of all the abstract methods of an abstract class must be provided by its subclasses.
 
Interfaces: An interface is considered to be a pure or a completely abstract class. They define a programming contract that must be fulfilled by the 
classes that implement the interface. In other words, all the abstract methods of an interface have to be defined in the classes that implement the interfaces. 
The interface keyword is used to define a new interface, while the implements keyword is used for implementing the interface in a class. **/

/*Interface : System requirement service.

In interface, variable are by default assign by public,static,final access modifier. Because :

public : It happen some-times that interface might placed in some other package. So it need to access the variable from anywhere in project.

static : As such incomplete class can not create object. So in project we need to access the variable without object so we can access with the help of interface_filename.variable_name

final : Suppose one interface implements by many class and all classes try to access and update the interface variable. So it leads to inconsistent of changing data 
and affect every other class. So it need to declare access modifier with final.*/



