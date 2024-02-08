# Proxy Pattern

The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. This can be useful for implementing lazy loading, access control, logging, etc. Here's how you can implement the Proxy Pattern in Java:

1. **Define the Subject Interface:**

    Create an interface that both the real subject and the proxy will implement. This interface declares the common methods that the proxy and the real subject should have.

2. **Implement the Real Subject:**

    Create a class that implements the Subject interface. This class represents the real object that the proxy is supposed to control access to.
3. **Implement the Proxy:**

    Create a class that also implements the Subject interface, acting as a proxy for the real subject. The proxy contains a reference to the real subject and can control access to its methods.

4. **Client Code:**

    se the proxy object instead of the real subject. The proxy can intercept requests and perform additional tasks before or after delegating to the real subject.
