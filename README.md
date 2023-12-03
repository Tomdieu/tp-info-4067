# TP INFO 4067

This is where I will store all my java related code for the course `INFO 4067`

## Design Patterns

Design patterns are typical solutions to common problems
in software design. Each pattern is like a blueprint
that you can customize to solve a particular
design problem in your code.

## Topic

- [**Creational Pattern**](#creational-patterns)

  - [Factory Method](#factory-pattern)
  - [Abstract Factory](#abstract-factory)
  - [Singleton](#singleton-factory)
  - [Builder](#builder-pattern)

- [**Structural Pattern**](#structural-pattern)

  - [Adapter](#adapter)
  - [Composite](#composite)
  - [Bridge](#bridge)
  - [Decorator](#decorator)
  - [Facade](#facade)
  - [Proxy](#proxy)

- [**Behaviour Pattern**](#behavoir-pattern)

  - [Observer](#observer)
  - [Strategy](#strategy)
  - [Command](#command)
  - [Iterator](#iterator)
  - [Mediator](#mediator)
  - [Memento](#memento)
  - [State](#state)
  - [Template Method](#template-method)
  - [Visitor](#visitor)
  - [Chain of Responsibility](#chain-of-responsibility)


<details>

<summary>

## Creational Patterns

</summary>

### 1. Factory Method

The Factory Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It involves an interface for creating objects, with its subclasses deciding which class to instantiate.

![Factory Method](https://refactoring.guru/images/patterns/diagrams/factory-method/example.png "Factory Method")

### 2. Abstract Factory

The Abstract Factory Pattern is a creational pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It involves a single interface to create objects of related types.

![Abstract Factory](https://refactoring.guru/images/patterns/diagrams/abstract-factory/example.png "Abstract Factory")

### 3. Singleton

The Singleton Pattern is a creational pattern that ensures a class has only one instance and provides a global point to that instance. It is useful when exactly one object is needed to coordinate actions across the system.

![Singleton](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en.png "Singleton")

### 4. Builder Pattern

The Builder Pattern is a creational pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It involves a director class and various builder classes for constructing different parts of the object.

![Builder](https://refactoring.guru/images/patterns/diagrams/builder/structure.png "Builder")

</details>

<details>

<summary>

## Structural Pattern

</summary>

### Adapter

The Adapter Pattern is a structural pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

![Adapter](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png "Adapter")

### Composite

The Composite Pattern is a structural pattern that lets you compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

![Composite](https://refactoring.guru/images/patterns/diagrams/composite/example.png "Composite")

### Bridge

The Bridge Pattern is a structural pattern that separates an abstraction from its implementation so that the two can vary independently. It involves creating a bridge interface that uses composition to separate the abstraction and its implementation.

![Bridge](https://refactoring.guru/images/patterns/diagrams/bridge/example-en.png "Bridge")

### Decorator

The Decorator Pattern is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It involves a set of decorator classes that are used to wrap concrete components.

![Decorator](https://refactoring.guru/images/patterns/diagrams/decorator/example.png "Decorator")

### Facade

The Facade Pattern is a structural pattern that provides a simplified interface to a library, a framework, or any other complex set of classes. It involves a single wrapper class that contains a set of members required by the client.

![Facade](https://refactoring.guru/images/patterns/diagrams/facade/example.png "Facade")

### Proxy

The Proxy Pattern is a structural pattern that provides an object that acts as a substitute for a real service object used by a client. It involves a communication between the real object and the proxy object, which forwards the request to the real object.

![Proxy](https://refactoring.guru/images/patterns/diagrams/proxy/example.png "Proxy")

</details>

<details>

<summary>

## Behaviour Pattern

</summary>

### Observer

The Observer Pattern is a behavioral pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It involves an observable object and observer objects.

![Observer](https://refactoring.guru/images/patterns/diagrams/observer/example.png "Observer")

### Strategy

The Strategy Pattern is a behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from clients that use it. It involves a strategy interface declaring an operation common to all supported algorithms. Context uses this interface to call the algorithm defined by a concrete strategy.

![Strategy](https://refactoring.guru/images/patterns/diagrams/strategy/example-en.png "Strategy")

### Command

The Command Pattern is a behavioral pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method argument, delay or queue a request’s execution, and support undoable operations. It involves an invoker class that contains the execute method and a set of commands implementing the same interface.

![Command](https://refactoring.guru/images/patterns/diagrams/command/example-en.png "Command")

### Iterator

The Iterator Pattern is a behavioral pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It involves an iterator interface with methods like hasNext, next, etc., and a collection interface with methods like iterator or getIterator.

![Iterator](https://refactoring.guru/images/patterns/diagrams/iterator/example-en.png "Iterator")

### Mediator

The Mediator Pattern is a behavioral pattern that defines an object that encapsulates how a set of objects interact. It involves a mediator class that exposes methods that communicate with colleague objects. Each colleague class knows its mediator object, and communicates with it whenever needed.

![Mediator](https://refactoring.guru/images/patterns/diagrams/mediator/example-en.png "Mediator")

### Memento

The Memento Pattern is a behavioral pattern that allows an object to return to one of its previous states. It involves three parts, the originator, the memento, and the caretaker. The originator is the object whose state needs to be saved and restored and it creates and stores states in the memento object. The caretaker object is responsible for the memento's safekeeping, but never operates on or examines the contents of the memento.

![Memento](https://refactoring.guru/images/patterns/diagrams/memento/example-en.png "Memento")

### State

The State Pattern is a behavioral pattern that allows an object to alter its behavior when its internal state changes. It involves a set of concrete states inheriting from a state interface. The context class contains a state instance that is initialized to a concrete state.

![State](https://refactoring.guru/images/patterns/diagrams/state/example-en.png "State")

### Template Method

The Template Method Pattern is a behavioral pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. It involves an abstract class defining the skeleton, the template method, and concrete classes implementing the steps.

![Template Method](https://refactoring.guru/images/patterns/diagrams/template-method/example-en.png "Template Method")

### Visitor

The Visitor Pattern is a behavioral pattern that lets you separate algorithms from the objects on which they operate. It involves a visitor class that changes the executing algorithm of an element class. It allows adding new behaviors to existing class hierarchies without altering any existing code.

![Visitor](https://refactoring.guru/images/patterns/diagrams/visitor/example-en.png "Visitor")

### Chain of Responsibility

The Chain of Responsibility Pattern is a behavioral pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain. It involves a set of handler objects and a client object that is responsible for sending requests to the first handler in the chain.

![Chain of Responsibility](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/example-en.png "Chain of Responsibility")

</details>

## References

images from [refactoring.guru](https://refactoring.guru/design-patterns)

- [Design Patterns](https://refactoring.guru/design-patterns)
- [Design Patterns in Java](https://www.baeldung.com/java-design-patterns)
