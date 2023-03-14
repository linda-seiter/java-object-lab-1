# Object Lab 1

## Learning Goals

- Add fields (instance variables) to a class
- Declare a variable with a class data type
- Create an object in Java using the `new` operator
- Assign a variable as an object reference
- Use IntelliJ's Java Visualizer to view object state
- Assign an instance variable an initial value at variable declaration
- Use IntelliJ to auto-generate a `toString()` method for printing object state
- Use dot notation to access and update object state

## Instructions

The starter project contains a class named `Book` with a `main` method that contains comments outlining the lab tasks.

You will use IntelliJ's debugger and the Java Visualizer to view object state.
Recall that you can stop the debugger session at any point by pressing the red square icon:

![stop debugger](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/stop_debugger.png)

You can also press the green arrow icon to continue execution to the next breakpoint
or end of program:

![continue execution](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/resume_program.png)

## Task #1 - Add fields and create 3 `Book` objects

1. Edit the `Book` class to add 5 fields named `title`, `isbn`, `edition`, `pages`, and `language`.
   The title, isbn, and language are strings.  The edition and pages are integers.
2. Edit the `main()` method to create 3 instances of the `Book` class.  Declare local variables named
   `book1`, `book2`, and `book3` and assign each variable to reference a new `Book` instance.
3. Use IntelliJ's Java Visualizer to confirm the state of each object is initialized to default values based on data type.
   
   - Set a breakpoint at the first executable line of code in the `main()` method (code hidden in screen print below, your line number may be different).      
   
     ![breakpoint](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/breakpoint_line1.png)
   
   - Click the debug icon.  
   
     ![start debugger](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/start_debugger.png)
   
   - Use the Java Visualizer to step through the code.  
   
     ![lab step over](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/lab_stepover.png)

   - Confirm each object has the 5 fields using the IntelliJ Java Visualizer view:    

   ![initial object state](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/initial_state.png)

If you don't like the crossed arrows due to the horizontal layout of the objects, you can
also use the visualizer at [https://pythontutor.com/java.html](https://pythontutor.com/java.html),
which lays out the objects vertically as shown below.
NOTE: When an object is created by calling `new Book()`, you will see a frame for a method named `<init>` show up
on the call stack, which represents the constructor method being called.  Keep pressing the `Next >` button until
the `Book` object appears on the heap.

![Python tutor initial object state](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/initial_state_pythontutor.png)



## Task #2 - Edit field (instance variable) declarations to assign initial values

**Do not** modify the `main()` method for this task.

Let's assume most books are first edition and written in English.

1. Edit the `edition` instance variable declaration to assign an initial value of `1`.
2. Edit the `language` instance variable declaration to assign an initial value of "English".
3. Press the debug icon and use the Java Visualizer to confirm the edition and language are
   initialized for the 3 books.

![variables initialized](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/variable_initialized.png)

## Task #3 - Printing Object State

Edit the `main` method to add the following code.  Place this after creating the 3 `Book` objects.

```java
// print initial object state
System.out.println("Object state after instantiation:");
System.out.println(book1);
System.out.println(book2);
System.out.println(book3);
```
     
If you run the `main` method, you'll see the memory location of each object printed:

```text
Object state after instantiation:
Book@4617c264
Book@36baf30c
Book@7a81197d
```

Use IntelliJ to generate a `toString()` method to print the values of the fields.
Place the cursor before the `main` method, then right-click, select generate, select `toString()`,
select all 5 fields.

Run the `main()` method and confirm the output.  The order is based on the order the fields
were declared in the class.  You might need to reorder your fields and regenerate the `toString()`
method to match the output.

```text
Object state after instantiation:
Book{title='null', isbn='null', edition=1, pages=0, language='English'}
Book{title='null', isbn='null', edition=1, pages=0, language='English'}
Book{title='null', isbn='null', edition=1, pages=0, language='English'}
```
   
## Task #4 - Updating Object State

Edit the  `main()` method to update the state for the objects by assigning new values to the fields.

Place the new assignment statements **after** the 3 print statements that print the initial default state.

Don't add unnecessary assignment statements, i.e. when the book's language is English or the edition is 1.

First try adding the code to update the values for `book1` ("Effective Java", "978-0134685991", 3rd edition, 416 pages).

![book1 updated](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/book1_updated.png)

Then add the code to update `book2` ("Spring Boot: Up & Running", "978-1492076988";  328 pages).     

![book2 updated](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/book2_updated.png)
   
Finally, add the code to update `book3` ( "HTML para novatos", "978-1493714148", 105 pages, "Spanish").    

![book3 updated](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/book3_updated.png)
   
Edit the `main` method to add additional print statements **after** the assignment statements. The print statements
should output the state for each object.    
    
```java
// print final object state
System.out.println("Object state after assigning values to instance variables:");
System.out.println(book1);
System.out.println(book2);
System.out.println(book3);
```
   
Run the `main` method and confirm your output is as shown below:     
   
 ```text
 Object state after instantiation:
 Book{title='null', isbn='null', edition=1, pages=0, language='English'}
 Book{title='null', isbn='null', edition=1, pages=0, language='English'}
 Book{title='null', isbn='null', edition=1, pages=0, language='English'}
 Object state after assigning values to instance variables:
 Book{title='Effective Java', isbn='978-0134685991', edition=3, pages=416, language='English'}
 Book{title='Spring Boot: Up & Running', isbn='978-1492076988', edition=1, pages=328, language='English'}
 Book{title='HTML para novatos', isbn='978-1493714148', edition=1, pages=105, language='Spanish'}
 ```
   
## Task #5 - Run Junit Tests

Within the `test` folder is a Junit test class named  `BookTest`
that tests the output produced from executing the `main()` method
defined in the `Book` class.

Run `BookTest` and confirm the test passes.

![lab1 junit tests](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/lab1_junit_test.png)
