# Terminal Calculator
Your task is to implement a basic terminal calculator. You must read in two numbers and perform according to the user's input different calculations. It should be possible to choose between floating-point and integer calculations.

Your calculator should have at least the following operations:

1.   addition
2.   subtraction
3.   divide
4.   modulo
5.   pythagoras (calculate the hypotenuse c). You can take a look [here](https://de.wikipedia.org/wiki/Satz_des_Pythagoras).

Of course, you can add more :smile:

>**NOTE:** Please pay attention to a clean style &#x2192; do not repeat yourself.
>
>**Use the provided code skeleton**

Take a look at this example output of the program:

~~~
Would you like to make floating point calculations?
type y for yes and anything else for integer calculations

y
Type in the first number: 
3
Type in the second number: 
7
You can make the following calculations:
1.   addition
2.   subtraction
3.   divide
4.   modulo
5.   pythagoras you can calculate the hypotenuse c

To select a calculation please press the corresponding number.

5
Calculating c = sqrt(3.0^2 + 7.0^2 )
The solution is = 7.615773105863909
Would you like to calculate again?
Press y for yes or any other key for abort.

y
Would you like to make floating point calculations?
type y for yes and anything else for integer calculations

1
Type in the first number: 
7
x = 7
Type in the second number: 
7
y = 7
You can make the following calculations:
1.   addition
2.   subtraction
3.   divide
4.   modulo
5.   pythagoras you can calculate the hypotenuse c

To select a calculation please press the corresponding number.

1
Calculating 7 + 7
The solution is = 14
Would you like to calculate again?
Press y for yes or any other key for abort.

y
Would you like to make floating point calculations?
type y for yes and anything else for integer calculations

y
Type in the first number: 
3
Type in the second number: 
8
You can make the following calculations:
1.   addition
2.   subtraction
3.   divide
4.   modulo
5.   pythagoras you can calculate the hypotenuse c

To select a calculation please press the corresponding number.

4
Calculating 3.0 % 8.0
The solution is = 3.0
Would you like to calculate again?
Press y for yes or any other key for abort.


Thank you for using the calculator. See you soon!
~~~

# Helpful Ressources

## Switch Expression

~~~java
int x = 6;

switch (x) {
case 1:
  System.out.println("case1");
  break;
case 2:
  System.out.println("case2");
  break;
case 6:
  System.out.println("case6");
  break;
default:
  System.out.println("I am the default");
}

~~~

~~~java
String block = """
               This is a nice text block.
               1.  It can even handle tabs.
               2.  This is the second tab.
               """;
~~~

## Convert Strings to Numbers

~~~java
int x = Integer.parseInt("3");

double y = Double.parseDouble("4");

float f = Float.parseFloat("5");
~~~
