# sofe3650-assign3
## Ontario Tech University 
### SOFE 3650U Software Design and Architecture Assignment #3
Completed for Dr. Ramiro Liscano <br/>
Model-View-Controller Design/Architecture Pattern for Cash Register Interface

_Group 23: Adris Azimi, Abida Choudhury, Daniel Gohara Kamel, Jessica Leishman_
# Table of Contents
- ## Code
    - ### [Exercise 1](https://github.com/jessica-leishman/sofe3650-assign3/tree/main/Exercise%201)
        - [CashRegister.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/CashRegister.java)
        - [Display.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/Display.java)
        - [Keyboard.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/Keyboard.java)
        - [Product.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/Product.java)
        - [ProductDatabase.txt](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/ProductDatabase.txt)
        - [ProductDB.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/ProductDB.java)
        - [Scanner.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/Scanner.java)
        - [TestCashRegisterApp.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/TestCashRegisterApp.java)
        - [TicketPrinter](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%201/TicketPrinter.java)
    - ### [Exercise 2](https://github.com/jessica-leishman/sofe3650-assign3/tree/main/Exercise%202)
        - [CashRegister.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/CashRegister.java)
        - [Display.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/Display.java)
        - [Keyboard.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/Keyboard.java)
        - [Product.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/Product.java)
        - [ProductDatabase.txt](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/ProductDatabase.txt)
        - [ProductDB.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/ProductDB.java)
        - [Scanner.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/Scanner.java)
        - [TestCashRegisterApp.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/TestCashRegisterApp.java)
        - [TicketPrinter](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/TicketPrinter.java)
        - [View.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%202/View.java)
    - ### [Exercise 3](https://github.com/jessica-leishman/sofe3650-assign3/tree/main/Exercise%203)
        - [CashRegister.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/CashRegister.java)
        - [Display.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/Display.java)
        - [Keyboard.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/Keyboard.java)
        - [Observer.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/Observer.java)
        - [Product.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/Product.java)
        - [ProductDatabase.txt](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/ProductDatabase.txt)
        - [ProductDB.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/ProductDB.java)
        - [Scanner.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/Scanner.java)
        - [TestCashRegisterApp.java](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/TestCashRegisterApp.java)
        - [TicketPrinter](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/Exercise%203/TicketPrinter.java) 
- ## [Assignment Overview](https://github.com/jessica-leishman/sofe3650-assign3#assignment-overview-1)
- ## [Output](## Output)
  -  [Output Screenshot](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/README.md#output-screenshot)
  -  [Expected Output](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/README.md#expected-output)

- ## [Advantages and Disadvantages of Each MVC Approach](https://github.com/jessica-leishman/sofe3650-assign3#advantages-and-disadvantages-of-each-mvc-approach-1)
  - [Exercise 1: Generic MVC](https://github.com/jessica-leishman/sofe3650-assign3#exercise-1-generic-mvc)
  - [Exercise 2: MVC - Inverted Model and View with Interface](https://github.com/jessica-leishman/sofe3650-assign3#exercise-2-inverted-model-and-view-with-interface)
  - [Exercise 3: MVC - Inverted Model and View with Observer](https://github.com/jessica-leishman/sofe3650-assign3#exercise-3-inverted-model-and-view-with-observer)
     
     
---
# Assignment Overview
## Exercise 1
A Cash register application is implemented using the components outlined in the above table of contents.  Input is processed from the Keyboard and/or Scanner components, which are serving as the Controllers.  The product information is output to the Display and TicketPrinter, the Views for the system, by interacting with the CashRegister Model component. The Keyboard and Scanner components depend on the CashRegister operators, and the CashRegister depends on the View operators.

## Exercise 2
A View interface is created for the Display and TicketPrinter.  This interface contains the operator displayProduct(Product).  This operator is inherited by both the Display and TicketPrinter and subsequently implemented.  Alterations are made to the CashRegister component to utilize the  displayProduct() operator.  Interfaces are used during this implementation in order to invert the dependency that exists between the Model and the View.

## Exercise 3
Components from Exercise 1 are modified to implement the Observer pattern.  The Display and TicketPrinter components are observers to the CashRegister components.  The observers are notified when the current scanned product's name and price have been updated.  A Subject/Observer pattern is used for this approach to invert the dependency between the Model and the View.

## Output
### Output Screenshot
![png screencap of the project output](https://github.com/jessica-leishman/sofe3650-assign3/blob/main/TestCashRegisterAppOutput.png)

### Expected Output
```
Display
Product{UPCCode=3, name='Daniel', price=500.0}
Ticket Printer
Product{UPCCode=3, name='Daniel', price=500.0}
Display
Product{UPCCode=3, name='Adris', price=500.0}
Ticket Printer
Product{UPCCode=3, name='Adris', price=500.0}
Display
Product{UPCCode=3, name='Abida', price=500.0}
Ticket Printer
Product{UPCCode=3, name='Abida', price=500.0}
Display
Product{UPCCode=3, name='Jesse', price=500.0}
Ticket Printer
Product{UPCCode=3, name'Jesse', price=500.0}
```
# Advantages and Disadvantages of Each MVC Approach
## Exercise 1: Generic MVC
#### Advantages
The main benefit seen in all three MVC implementation is that different views can be added without any necessary changes to the architecture.
#### Disadvatages
The primary disadvantage of all three MVC implementations is that the views and models are linked.  In this implementation, the model needs to call the view's operators.

##  Exercise 2: Inverted Model and View with Interface
#### Advantages
In addition to the general MVC advantage, the Inverted Model and View with Interface also allows for different types of views to be implemented by obveriding displayProduct() for the view component.

#### Disadvatages
However, in this implementation, the Views are additionally limited to utilizing the displayProduct() method, which does not allow them to display any new information to different users.


##  Exercise 3: Inverted Model and View with Observer
#### Advantages
The Inverted Model and View with Observer has the advantages of the above two implementations (different views without architecture changes, implementation of different views), but also includes the added benefit of allowing views to utilize updates in different ways

#### Disadvatages
This approach has the view and model linked as explained for all three MVC implementations. The model updates all of it's observers, and the views are dependent on receiving these updates.
