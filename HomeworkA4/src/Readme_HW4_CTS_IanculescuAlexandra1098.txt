1. The weather station collects the data by going through a series of predefined steps,
 which must be executed in this exact order: connect to sensor, read sensor data, 
store sensor data in local database, publish sensor data. Your solution must allow 
other companies to develop other types of stations (for example for lakes monitoring),
 but their solution must follow the same process.

Design pattern: Chain of Responsibility

Why: There are dependency links between use cases. The management of all cases would 
involve a complex structure to check all particular cases.
-pass requests along a chain of handlers
-the request travels along the chain until all handlers have had a chance to process it
-all handlers are given the opportunity to process the request
-manages a sequence of actions that can process a event or object
- ! When it is critical to execute several handlers in a specific order, 
we use this pattern

2. The weather station can send the data to its clients, by different means:
 by SMS, by REST services, by publishing them on a web site, etc.
 This should be implemented in a way that will allow other to switch between 
these means efficiently and easy

Design pattern: Strategy

Why: The algorithm can be chosen based on conditions described at execution 
depending on the context of the input data. Run-time choice of algorithm / function
to be used for processing data. The choice of the data processing method is made
dynamically, at run-time. 
-when we have a lot of similar classes that only differ in how they execute some behavior
-allows us to change the object's behavior indirectly at runtime by associating it 
with different sub-objects that can perform specific sub-tasks in different ways
-clients are provided with a simple interface for executing algorithms and switching 
them at runtime
- ! a conditional operator that switches between various variants of the same algorithm

3. All clients (local meteo service, a weather mobile application,
 local alerting system, etc) are notified (push notification) everytime new data
 is recorded

Design pattern: Observer

Why: There are components that must be notified when producing a
event. Multiple components can be notified when an event occurs. The objects are
interconnected by notifications. 
-notify multiple objects of any events that occur on the object under observation

4. When the local alerting system receives updated weather data will process it and it will 
send alerts based on next scenarios:
a. if the air humidity is less than 30%, wind speed is above 30km/h and air temperature 
is above 39 degrees, they will alert the local fire department for possible wildfires
b. if the air temperature is less than -15 degrees, it will publish a general 
“stay at home” alert to people
c. if wind speed is above 90km/h, it will publish a general “storm alert” to people
d. if the air humidity is less than 30%, wind speed is less than 5km/h and air
temperature is above 39 degrees, it will notify the ice cream department

Design pattern: State

Why: The application treats a certain event differently depending on the state of an 
object. The number of possible states can also increase, their unitary treatment 
can influence the complexity of the solution
-state machines are typically implemented with a large number of conditional operators
(if or switch) that select the appropriate behavior based on the object's current state
-massive conditionals that alter how the class behaves

5. When the local fire department receives an alert from the local alerting system 
it will start a process that involves some asynchronous actions that must be started 
in the same time
a. sending SMS messages to the voluntary firemens to get to the station
b. launching the fire department monitoring drone in the air, 
to check for visible signs of possible wildfires
c. starting filling up the fire truck with water

Design pattern: Command and Observer

Why observer: Use the pattern when some objects in your app must observe others.
There are components that must be notified when producing a
event. Multiple components can be notified when an event occurs. The objects are
interconnected by notifications. 

Why command: Stand-alone object that contains all information about the request.
The 3 actions are independent one from another. They don't what the other action (class)
is doing.

6. The fire department monitoring drone can fly autonomously and make decisions on 
its own. Normally will follow a grid based path, but when will detect smoke trails, 
will move to the spot to investigate

Design pattern: Command

Why: The application defines what parameterizable actions can be
executed later without requesting the client knowledge of the internal details necessary
for execution. The object of command type encapsulates all necessary information
execution of the action later by the person in charge. 
The client is disconnected from the one performing the action.
- stand-alone object that contains all information about the request.
