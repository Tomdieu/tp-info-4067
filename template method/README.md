# Template Method Pattern

The Template Method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in a method, called template method, which defers some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## When to use the Template Method pattern

- When you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.

- When you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.

- When you want to control the structure of an algorithm.

## How to implement the Template Method pattern

1. Identify the steps of an algorithm that can be common for all subclasses.

2. Create an abstract base class that declares the template method and defines the steps of the algorithm using abstract operations.

3. Create concrete subclasses that implement the abstract operations.

4. Clients should use the base class to access the algorithm.

## Example

The Template Method pattern is commonly used in frameworks to define the skeleton of an algorithm. For example, in the following code snippet, we have an abstract base class that defines the template method for building a house. The template method calls the buildFoundation, buildPillars, and buildWalls methods to build a house. The buildFoundation, buildPillars, and buildWalls methods are implemented by concrete subclasses that provide different ways to build a house.

```java

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        System.out.println("House is built.");
    }

    protected abstract void buildFoundation();
    protected abstract void buildPillars();
    protected abstract void buildWalls();
}

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods, and sand");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building wooden pillars with wood coating");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls");
    }
}

public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods, and sand");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building glass pillars with glass coating");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls");
    }
}   

public class Main {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}

```

## References

<https://refactoring.guru/design-patterns/template-method>
