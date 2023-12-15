# Strategy design pattern

The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

## When to use the Strategy pattern

- When you want to define a class that will have one behavior that is similar to other behaviors in a list.

- When you need to use one of several behaviors dynamically.

- When you want to isolate the implementation of an algorithm from the client.

- When you have a lot of conditional statements in your code.

## How to implement the Strategy pattern

1. Identify an algorithm (i.e. a behavior) that the client would prefer to access through a "flex point".

2. Specify the signature for that algorithm in an interface.

3. Bury the alternative implementation details in derived classes.

4. Clients of the algorithm couple themselves to the interface.

5. The flex point is the "place" in the client code where the algorithm is invoked.

## Example

The Strategy pattern is commonly used in Java frameworks to provide different ways to implement an algorithm. For example, in the following code snippet, we have a strategy interface that defines the algorithm for sorting a list of integers. The strategy interface is implemented by concrete strategy classes that provide different ways to sort the list of integers.

```java

public interface SortStrategy {
    void sort(List<Integer> list);
}

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Sorting using bubble sort");
    }
}

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Sorting using quick sort");
    }
}

public class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list) {
        strategy.sort(list);
    }
}

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(Arrays.asList(1, 2, 3, 4, 5));

        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(Arrays.asList(1, 2, 3, 4, 5));
    }
}

```

## References

<https://refactoring.guru/design-patterns/strategy>