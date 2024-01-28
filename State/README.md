# State Design Patterns

The State pattern is a behavioral design pattern that allows an object to change its behavior at runtime. It does so by changing the object's internal state. This pattern is close to the concept of finite-state machines.

## When to use the State pattern

- When you want to change the behavior of an object based on its internal state.

- When you want to encapsulate state-specific behavior and share it across multiple objects.

- When you want to decouple the state-specific behavior from the object and extract it to a separate class.

## How to implement the State pattern

1. Identify the context class that will have the state-specific behavior.

2. Declare the state interface with a set of abstract methods that represent the state-specific behavior.

3. Implement the state interface with concrete state classes.

4. In the context class, add a reference field of the state interface type.

5. In the context class, add a setter method for changing the state.

6. In the context class, add a method that delegates the state-specific behavior to the state object.

## Example

In the following example, we have a context class that represents a TCP connection. The TCP connection can be in one of the following states: closed, established, listening, or closed-wait. The TCP connection has a reference to the state interface. The state interface declares the state-specific behavior. The state-specific behavior is implemented by concrete state classes. The TCP connection delegates the state-specific behavior to the state object.

```java

public interface TCPState {
    void open();
    void close();
    void acknowledge();
}

public class TCPClosed implements TCPState {
    @Override
    public void open() {
        System.out.println("Opening connection");
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("Acknowledging");
    }
}

public class TCPEstablished implements TCPState {
    @Override
    public void open() {
        System.out.println("Opening connection");
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("Acknowledging");
    }
}

public class TCPListening implements TCPState {
    @Override
    public void open() {
        System.out.println("Opening connection");
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("Acknowledging");
    }
}

public class TCPClosedWait implements TCPState {
    @Override
    public void open() {
        System.out.println("Opening connection");
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("Acknowledging");
    }
}

public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        state = new TCPClosed();
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void acknowledge() {
        state.acknowledge();
    }
}

```
