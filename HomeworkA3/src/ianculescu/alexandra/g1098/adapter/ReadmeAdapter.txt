Location-driven web solution for promoting tourism in Romania

Problem:
There is a new way to make a payment for which you will receive a confirmation of that payment.
The 2 ways should be integrated without modifing them, creating a new interface that acts as
an intermediar layer, an adapter, modifing the data from one format to another.

Advantages:
Only an intermediate layer is added
Adapters for any context can be easily defined

Disadvantages:
Adapter cannot be used with subclasses of Adaptee or Target .
Multiple inheritance may be required. In Java: At least one of Target and Adaptee
must be an Interface.