package com.example.quizapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<Question> questions; //List<Question> is a declaration of a list that can hold objects of type Question

    public QuestionBank() {
        questions = new ArrayList<>(); //initializes the questions variable with a new, empty ArrayList of Question objects.

        //This line adds a new Question object to the questions
//      This line of code creates a new Question object   then adds it to the questions list.
        questions.add(new Question("What is the blueprint from which individual objects are created?", "extends", "class", "subclass", "super", "class"));
        questions.add(new Question("Which keyword is used to access the superclass constructor from a subclass?", "this", "super", "extends", "subclass", "super"));
        questions.add(new Question("Which keyword is used to define a constant in Java?", "static", "final", "const", "constant", "final"));
        questions.add(new Question("Which keyword is used to prevent method overriding in Java?", "final", "private", "protected", "static", "final"));
        questions.add(new Question("Which access modifier allows a member to be accessed only within its own package and by subclasses?", "public", "private", "protected", "package-private", "protected"));
        questions.add(new Question("Which keyword is used to implement interface methods in a class?", "interface", "implements", "extends", "abstract", "implements"));
        questions.add(new Question("Which keyword is used to refer to the current instance of a class?", "this", "current", "self", "me", "this"));
        questions.add(new Question("Which concept is used to hide the internal implementation of an object and only expose the necessary functionalities?", "inheritance", "encapsulation", "polymorphism", "abstraction", "encapsulation"));
        questions.add(new Question("What is the blueprint from which individual objects are created?", "Object", "Class", "Method", "Constructor", "Class"));
        questions.add(new Question("Which keyword is used to create an object in Java?", "create", "new", "class", "object", "new"));
        questions.add(new Question("Which of these is not a principle of Object-Oriented Programming?", "Inheritance", "Encapsulation", "Abstraction", "Compilation", "Compilation"));
        questions.add(new Question("Which method is used to compare two strings for equality in Java?", "==", "equals()", "compare()", "isEqual()", "equals()"));
        questions.add(new Question("Which keyword is used to inherit a class in Java?", "implement", "extend", "inherit", "derive", "extend"));
        questions.add(new Question("Which of these is used to call the constructor of the parent class?", "this", "parent", "super", "base", "super"));
        questions.add(new Question("What is the term for the concept of wrapping data and code together as a single unit?", "Inheritance", "Polymorphism", "Abstraction", "Encapsulation", "Encapsulation"));
        questions.add(new Question("Which keyword is used to define a class in Java?", "define", "class", "create", "public", "class"));
        questions.add(new Question("What is used to achieve polymorphism in Java?", "Inheritance", "Interfaces", "Method Overloading", "All of the above", "All of the above"));
        questions.add(new Question("Which keyword prevents a class from being subclassed?", "final", "static", "abstract", "protected", "final"));
        questions.add(new Question("What do you call a method that has no body in a superclass but is implemented in a subclass?", "final method", "abstract method", "static method", "concrete method", "abstract method"));
        questions.add(new Question("Which access modifier makes a member visible only within its own package?", "public", "private", "protected", "default", "default"));
        questions.add(new Question("Which keyword is used to indicate that a method cannot be overridden?", "final", "static", "private", "abstract", "final"));
        questions.add(new Question("Which type of inheritance is not supported in Java?", "Single", "Multiple", "Hierarchical", "Multilevel", "Multiple"));
        questions.add(new Question("What is the default value of a reference variable in Java?", "0", "null", "undefined", "\"\"", "null"));
        questions.add(new Question("Which keyword is used to exit from a method in Java?", "stop", "return", "stop", "break", "return"));
        questions.add(new Question("What is the result of '10' + 10 in Java?", "20", "1010", "11", "Compile error", "1010"));
        questions.add(new Question("Which keyword is used to create an instance of an array in Java?", "array", "instance", "create", "new", "new"));
        questions.add(new Question("Which operator is used to increment a variable in Java?", "++", "--", "+=", "-=", "++"));
        questions.add(new Question("Which keyword is used to define a subclass in Java?", "super", "sub", "extends", "parent", "extends"));
        questions.add(new Question("Which operator is used to perform logical AND in Java?", "and", "||", "&", "&&", "&&"));
        questions.add(new Question("What is the result of 5 + 7 * 2 in Java?", "24", "19", "14", "17", "19"));
        questions.add(new Question("What is the default value of a boolean variable in Java?", "true", "false", "0", "null", "false"));
        questions.add(new Question("Which operator is used to compare two values for equality in Java?", "=", "==", "===", "!=", "=="));
        questions.add(new Question("Which data structure uses FIFO (First In First Out) order?", "queue", "list", "stack", "set", "queue"));
        questions.add(new Question("Which keyword is used to create an object in Java?", "create", "object", "new", "instantiate", "new"));
        questions.add(new Question("What type of loop is guaranteed to execute at least once in Java?", "while", "do-while", "while", "if", "do-while"));
        questions.add(new Question("Which operator is used to concatenate strings in Java?", "&", "+", "*", "||", "+"));
        questions.add(new Question("What does the 'throws' keyword indicate in a method declaration?", "arguments", "variables", "exceptions", "return type", "exceptions"));
        questions.add(new Question("What is the maximum value of a byte variable in Java?", "225", "127", "64K", "1", "127"));
        questions.add(new Question("Which access modifier restricts access the least in Java?", "default", "private", "public", "protected", "public"));
        questions.add(new Question("Which keyword is used to prevent a method from being overridden in a subclass?", "private", "static", "abstract", "final", "final"));
        questions.add(new Question("What is the default value of a double variable in Java?", "0.0", "0", "null", "1.0", "0.0"));
        questions.add(new Question("Which operator is used to perform bitwise AND in Java?", "&", "&&", "|", "^", "&"));
        questions.add(new Question("What is the default value of a long variable in Java?", "0", "false", "null", "0L", "0"));
        questions.add(new Question("Which keyword is used to implement multiple interfaces in Java?", "implements", "interface", "extends", "inherit", "implements"));
        questions.add(new Question("Which method is called when an object is instantiated in Java?", "destructor", "constructor", "initialize", "finalize", "constructor"));
        questions.add(new Question("What is the default value of a float variable in Java?", "0.0f", "0.0", "1.0", "null", "0.0f"));
        questions.add(new Question("Which keyword is used to exit from a method in Java?", "exit", "return", "stop", "break", "return"));
        questions.add(new Question("Which operator is used to increment a variable in Java?", "++", "--", "+=", "-=", "++"));
        questions.add(new Question("Which keyword is used to define a subclass in Java?", "sub", "extends", "super", "parent", "extends"));
        questions.add(new Question("What is the result of 5 + 7 * 2 in Java?", "19", "24", "14", "17", "19"));
        questions.add(new Question("What is the default value of a boolean variable in Java?", "0", "true", "false", "null", "false"));
        questions.add(new Question("What does the 'super' keyword refer to in Java?", "parent class", "current instance", "child class", "static method", "parent class"));
        questions.add(new Question("What is the default value of a long variable in Java?", "0", "false", "null", "0L", "0"));
        questions.add(new Question("Which keyword is used to implement multiple interfaces in Java?", "interface", "implements", "extends", "inherit", "implements"));
        questions.add(new Question("Which method is called when an object is instantiated in Java?", "finalize", "destructor", "initialize", "constructor", "constructor"));
        questions.add(new Question("What is the default value of a float variable in Java?", "0.0f", "0.0", "1.0", "null", "0.0f"));
        questions.add(new Question("What is a blueprint of a class in Java?", "object", "method", "class", "interface", "class"));
        questions.add(new Question("Which keyword is used to declare a class that cannot be instantiated?", "static", "final", "abstract", "private", "abstract"));
        questions.add(new Question("What is the process of hiding the implementation details of an object?", "encapsulation", "inheritance", "polymorphism", "abstraction", "encapsulation"));
        questions.add(new Question("Which keyword is used to implement inheritance in Java?", "super", "implements", "inherit", "extends", "extends"));
        questions.add(new Question("What is a collection of methods with an empty body in Java?", "interface", "abstract class", "object", "constructor", "interface"));
        questions.add(new Question("Which keyword is used to refer to the current instance of an object?", "new", "super", "this", "null", "this"));
        questions.add(new Question("Which keyword is used to define constants in Java?", "define", "static", "const", "final", "final"));
        questions.add(new Question("What is a special type of method used to initialize objects in Java?", "constructor", "destructor", "initializer", "finalize", "constructor"));
        questions.add(new Question("Which keyword is used to prevent method overriding in a subclass?", "private", "static", "abstract", "final", "final"));
        questions.add(new Question("What is the process of accessing methods from the superclass in Java?", "inheritance", "encapsulation", "polymorphism", "abstraction", "inheritance"));
        questions.add(new Question("What does the 'super' keyword refer to in Java?", "subclass", "current instance", "superclass", "static method", "superclass"));
        questions.add(new Question("What is the process of combining data and methods into a single unit called a class?", "encapsulation", "inheritance", "polymorphism", "abstraction", "encapsulation"));
        questions.add(new Question("Which keyword is used to implement method overriding in Java?", "@super", "@extends", "@overriding", "@override", "@override"));
        questions.add(new Question("What is the ability of an object to take many forms in Java?", "inheritance", "polymorphism", "encapsulation", "abstraction", "polymorphism"));
        questions.add(new Question("Which keyword is used to implement an interface in Java?", "inherit", "extends", "interface", "implements", "implements"));
        questions.add(new Question("What is a special type of method used to perform operations on an object in Java?", "initializer", "destructor", "method", "finalize", "method"));
        questions.add(new Question("Which concept in OOP describes the bundling of data and methods that operate on the data?", "abstraction", "inheritance", "polymorphism", "encapsulation", "encapsulation"));
        questions.add(new Question("What feature of Java allows one class to inherit the properties and methods of another class?", "polymorphism", "encapsulation", "inheritance", "abstraction", "inheritance"));
        questions.add(new Question("Which OOP concept allows a class to have multiple methods with the same name but different parameters?", "encapsulation", "overriding", "inheritance", "overloading", "overloading"));
        questions.add(new Question("What is the process of creating a new object based on an existing object called?", "copying", "casting", "cloning", "duplicating", "cloning"));
        questions.add(new Question("Which keyword in Java is used to implement inheritance?", "implements", "extends", "inherits", "superclass", "extends"));
        questions.add(new Question("In Java, what is the method name used to initialize an object?", "initialize", "constructor", "create", "new", "constructor"));
        questions.add(new Question("Which OOP concept allows a subclass to provide a specific implementation of a method that is already provided by its superclass?", "overriding", "overloading", "inheritance", "encapsulation", "overriding"));
        questions.add(new Question("What is the process of combining data and methods into a single unit called?", "abstraction", "inheritance", "encapsulation", "polymorphism", "encapsulation"));
        questions.add(new Question("Which keyword in Java is used to prevent method overriding?", "abstract", "final", "static", "private", "final"));
        questions.add(new Question("Which keyword in Java is used to create an interface?", "interface", "implements", "extends", "abstract", "interface"));
        questions.add(new Question("What allows a method to have different implementations based on the object that is invoking it?", "polymorphism", "overloading", "overriding", "inheritance", "polymorphism"));
        questions.add(new Question("In Java, what is the process of hiding the implementation details and showing only the functionality called?", "abstraction", "encapsulation", "inheritance", "polymorphism", "abstraction"));
        questions.add(new Question("Which keyword is used to refer to the current instance of an object in Java?", "this", "super", "instance", "current", "this"));
        questions.add(new Question("In Java, what is a special type of method that is automatically called when an object is destroyed?", "destructor", "finalize", "dispose", "clean", "finalize"));
        questions.add(new Question("Which OOP concept allows a class to have more than one method with the same name, if their parameter lists are different?", "overloading", "overriding", "inheritance", "encapsulation", "overloading"));
        questions.add(new Question("What allows the same method name to be used for different types of objects?", "overloading", "polymorphism", "overriding", "inheritance", "polymorphism"));
        questions.add(new Question("What is a blueprint or template for creating objects in Java?", "method", "object", "class", "constructor", "class"));
        questions.add(new Question("Which keyword in Java is used to access the superclass method from a subclass?", "extends", "this", "super", "parent", "super"));
        questions.add(new Question("In Java, what keyword is used to define a method that belongs to the class rather than to any particular object?", "void", "final", "abstract", "static", "static"));
        questions.add(new Question("Which principle states that objects of different classes can be accessed through the same interface?", "inheritance", "polymorphism", "abstraction", "encapsulation", "polymorphism"));
        questions.add(new Question("In Java, what is the process of restricting access to certain components of an object?", "encapsulation", "inheritance", "polymorphism", "abstraction", "encapsulation"));
        questions.add(new Question("Which OOP concept allows a subclass to have its own methods and data members in addition to the superclass members?", "inheritance", "encapsulation", "polymorphism", "composition", "inheritance"));
        questions.add(new Question("What is the process of combining different types of data and methods into a single unit called?", "abstraction", "inheritance", "encapsulation", "polymorphism", "abstraction"));
        questions.add(new Question("In Java, what is the term used to describe a class that cannot be instantiated?", "static", "final", "abstract", "void", "abstract"));
        questions.add(new Question("What Java feature allows one class to inherit the properties and methods of another class?", "encapsulation", "polymorphism", "inheritance", "abstraction", "inheritance"));
        questions.add(new Question("In Java, what is the process of creating new classes from existing classes called?", "abstraction", "composition", "polymorphism", "inheritance", "inheritance"));
        questions.add(new Question("Which OOP concept is used to create a blueprint of a class?", "object", "class", "constructor", "interface", "class"));
        questions.add(new Question("What is the process of hiding the internal details of an object and showing only the necessary functionalities to the user called?", "abstraction", "inheritance", "encapsulation", "polymorphism", "abstraction"));
        questions.add(new Question("Which keyword in Java is used to define a blueprint of a class that cannot be instantiated?", "void", "final", "static", "abstract", "abstract"));
        questions.add(new Question("In Java, what allows one method to have multiple implementations?", "abstraction", "inheritance", "polymorphism", "encapsulation", "polymorphism"));
        questions.add(new Question("Which keyword in Java is used to implement multiple interfaces?", "interface", "extends", "implements", "inheritance", "implements"));

    }

    public List<Question> getQuestions() {    //  List<Question> --> Hold list of type Question
        return questions;
    }
}
