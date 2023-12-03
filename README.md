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

  - [Adapter Pattern](#adapter-pattern)
  - [Composite Pattern](#composite-pattern)
  - [Bridge Pattern](#bridge-pattern)
  - [Decorator Pattern](#decorator-pattern)
  - [Facade Pattern](#facade-pattern)
  - [Proxy Pattern](#proxy-pattern)

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

### Adapter Pattern

The Adapter Pattern is a structural pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

![Adapter](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png "Adapter")

### Composite Pattern

The Composite Pattern is a structural pattern that lets you compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

![Composite](https://refactoring.guru/images/patterns/diagrams/composite/example.png "Composite")

### Bridge Pattern

The Bridge Pattern is a structural pattern that separates an abstraction from its implementation so that the two can vary independently. It involves creating a bridge interface that uses composition to separate the abstraction and its implementation.

![Bridge](https://refactoring.guru/images/patterns/diagrams/bridge/example-en.png "Bridge")

### Decorator Pattern

The Decorator Pattern is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It involves a set of decorator classes that are used to wrap concrete components.

![Decorator](https://refactoring.guru/images/patterns/diagrams/decorator/example.png "Decorator")

### Facade Pattern

The Facade Pattern is a structural pattern that provides a simplified interface to a library, a framework, or any other complex set of classes. It involves a single wrapper class that contains a set of members required by the client.

![Facade](https://refactoring.guru/images/patterns/diagrams/facade/example.png "Facade")

### Proxy Pattern

The Proxy Pattern is a structural pattern that provides an object that acts as a substitute for a real service object used by a client. It involves a communication between the real object and the proxy object, which forwards the request to the real object.

![Proxy](https://refactoring.guru/images/patterns/diagrams/proxy/example.png "Proxy")

</details>

## References

images from [refactoring.guru](https://refactoring.guru/design-patterns)

- [Design Patterns](https://refactoring.guru/design-patterns)
- [Design Patterns in Java](https://www.baeldung.com/java-design-patterns)
