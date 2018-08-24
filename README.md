Builder Pattern in Java
=====

# What is Builder Pattern

Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under **creational** pattern as this pattern provides one of the best ways to create an object.

# Where to use

1) Too Many arguments to pass from client program and it becomes challenging to maintain order of the parameters

2) Some of the parameters might be optional but we are forced to send all the parameters and optional parameters need to send as NULL.

3) If the object is heavy and its creation is complex

# How to implement

1) First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Driver then builder class should be named as DriverBuilder.

2) Java Builder class should have a public constructor with all the required attributes as parameters.

3) Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.

4) The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.