# Chain of responsibility pattern

Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

## When to use the Chain of responsibility pattern

- When you want to decouple a request’s sender and receiver.

- When you want to issue a request to one of several objects without specifying the receiver explicitly.

- When the set of objects that can handle a request should be specified dynamically.

- When you want to send a request to one of several objects without having to know which object handles the request.

- When you don’t want to specify handlers explicitly in your code.

## How to implement the Chain of responsibility pattern

1. Identify the successor and base classes.

2. Declare the successor interface and define the successor setter method in the base class.

3. Implement the successor interface in the successor class.

4. In the base class, implement the request method that forwards the request to the successor.

5. In the successor class, implement the request method.

## Example

In the following example, we have a base class that defines the successor setter method and the request method. The successor setter method is used to set the successor object. The request method is used to forward the request to the successor object.

```java

public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void request(int value) {
        if (successor != null) {
            successor.handle(value);
        }
    }

    protected abstract void handle(int value);
}

```

The successor interface is implemented by a concrete successor class. The successor class implements the request method to handle the request.

```java

public class ConcreteHandler extends Handler {
    @Override
    protected void handle(int value) {
        System.out.println("ConcreteHandler: Handling " + value);
    }
}

```

The following code snippet shows how to use the chain of responsibility pattern.

```java

Handler handler1 = new ConcreteHandler();

Handler handler2 = new ConcreteHandler();

handler1.setSuccessor(handler2);

handler1.request(1);



// Output:

// ConcreteHandler: Handling 1

```

## Applicability

Use the Chain of responsibility pattern when

- more than one object may handle a request, and the handler isn’t known a priori. The handler should be ascertained automatically.

- you want to issue a request to one of several objects without specifying the receiver explicitly.

- the set of objects that can handle a request should be specified dynamically.

## References

https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern