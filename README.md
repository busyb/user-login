Java-- two parts 

JDK --> 1. development kit --> tool to make java application

library-> build --> good change it is already built by someone --> re-use 
    --> java core library --> set tools



--> 2. running your application --> environment --> your application can run on any machine.
    --> machine(laptop/computer) --> run machine code --> tied to the operating system --> OS (apple/windows/linux) --> different machine code
    --> application (files/txt) --> (*byte code*) --> machine code
    --> JRE --> java runtime environment (reads byte code)
    --> my app --> byte code --> machine code --> runs on any computer/machine

    *write once, run everywhere 


Java, because of object oriented language.

Java --> data types --> Object / primitive types(type defined by java)

Object --> at runtime --> java uses blueprint to create Object(the machine will take up compute space/ actual memory) 
class --> compile or building time --> blueprint 

primitives-> String(special type), int, long, double, boolean(t/f), short

ex. User class
- name -> String 
- address -> Object
- phone -> long  


address class
- street
- zip code
- state
- country 


class --> 2 flavors
    - what it has? - fields
    - what does? - methods


- class in java have visibility - who can see this.
 - public - everyone can see


define data as logical groups --> Object
    --> programming --> input --> output  (on data)


-------------------
vocab:
context - what space you are talking/working on (app)

------------------------------------------------------
OOP - object oriented programming
1. encapsulation - hide data -> java uses concept class accessor level (public, private, protected, package-private)
  --> hide from other parts of you application, why?
      - 1.reduce complexity
      - 2.reduce bugs/error
      - 3. client/caller

*----------------------------------------------------*
Project: user login

goals - 1. allow a client to create an account
      --> data: personal, credentials

      2. enrich the process --> add a database (if needed)

      3. Integrate --> business application 
          --> existing warehouse application 
           --> manage products, order, create report
          --> add logging functionality to warehouse app

-------------------------------------------
tools:
git --> work on same code in a shared fashion to reduce code errors/duplication



      

