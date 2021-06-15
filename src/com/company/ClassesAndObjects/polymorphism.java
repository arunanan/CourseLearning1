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




