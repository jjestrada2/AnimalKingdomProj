# AnimalKingdomProj

Part A: Complete the Animal Class
(10 points) equals: Add an equals method.
Two animals are considered logically equivalent if they have the same id and the same name (ignoring capitalization).
(10 points) Comparable: Modify the Animal class to implement the Comparable interface.
Update the class header.
Write the compareTo method.
Order animals by name (in alphabetic order).
Make no other changes to the Animal class. Do not make any changes to the BirthType enum.

Back to Top

Part B: The Animal Hierarchy
Write 14 classes or interfaces to represent the following animals or category of animals:

BelugaWhale    Bird    BlueWhale    CaliforniaCondor    DuckbilledPlatypus    Elephant    Fish

Goldfish    GreatWhiteShark    Horse    Mammal    Ostrich    Parakeet    Whale

Also write 3 interface or classes to describe animals that are Endangered, WaterDwellers, and Winged, using this specification:

Endangered animals have a void method displayConservationInformation() that outputs information about conservation (you can choose a very simple output).
WaterDweller animals have a boolean method breathesAir() that indicates whether an animal that lives in water breathes air or not.
Winged animals have a boolean method canFly() that indicates whether an animal that has wings can fly or not.
With the above, you will have 17 new classes/interfaces. With my 3 provided files, you will have a total of 20 classes/interfaces for this project.

(40 points) Design the Hierarchy
Make logical design decisions for the 17 classes/interfaces you write. To get full credit, your class hierarchy should make sense and match the characteristics of the animals (using the provided animal characteristics). Consider:

Which should be an abstract class? a concrete class?
Which should be an interface?
How should the classes be related through inheritance?
In what classes should method be overridden?
Which methods should be overridden?
Which overridden methods should invoke the parent version?
What information should be taken in as a parameter and what information can be hard-coded into a class?
Note that this part of the assignment isn't necessarily difficult from a programming perspective. Spend your time carefully considering the design of your classes and how they should be related through inheritance or through interfaces.

For Full Credit
Place common code as high up in the hierarchy as possible.
Reduce duplicated/repeated code.
Allow each class to be "in charge of" its own functionality.
Declare classes that should not be instantiated as abstract.
In abstract classes, methods that must be implemented by all subclasses should be declared abstract.
Follow general principles of object oriented programming and good code design.
Use Java naming conventions accurately. 
Remember that classes can only have one parent but can implement multiple interfaces.
(20 points) Implement the Classes
Each class should have the following. A class can have each requirement either through inheritance or by directly including the code in the class.

A constructor: This will be used to initialize the id, name, and birthType variables.
Consider whether information should be taken in as a parameter or hard-coded into each class:
Things that vary between objects should be taken in as parameters.
Things that are shared between all objects should most likely be hard-coded into the class. (Remember to use constants!)
For example, does the birthType vary for objects of a class (take it in as a parameter) or is it always the same for all objects of that class (hard-code it using a constant)?
An isWarmBlooded() method
Same as above, consider whether this should be hard-coded or taken in as a parameter.
A getDescription() method
This method should return all names that describe an animal and any extra characteristics about that animal (related to being endangered, dwelling in water, and being winged).
Example: The getDescription() method for the animal Round Island Boa (not part of this project) might return the String:
Reptile     Snake     Round Island Boa     (endangered)

Example: For a Sea Turtle class (also not in this project), the method might return the String:
Reptile     Turtle     Sea Turtle     (lives in water, breathes air, endangered)

Run the driver program to test your code so far. Do not move onto Part C until this part of your code is working! A summary of output is included in the driver and I've also included a print out of the complete output for reference.

Back to Top

Part C: Driver Program
(20 points) Complete the two missing sections in the driver program. These sections will be similar to the section that runs the tests for animals with wings. Un-comment out the Part C section of the driver program when you are ready to write the code.

Complete the section to count the number of water dwellers, water dwellers that breathe air, and water dwellers that do not breathe air (they breathe water). Output the names of all water dwelling animals and what they breathe.
Complete the section to count the number of endangered animals. Then print all of the conservation information for all endangered animals.
For full credit, use instanceof as part of your solution to Part C.

