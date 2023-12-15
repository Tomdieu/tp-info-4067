# Visitor Pattern

The Visitor pattern is a behavioral design pattern that allows adding new behaviors to existing class hierarchies without altering any existing code. It is one of the most complex design patterns in the GoF book.

## When to use the Visitor pattern

- When you want to add new behaviors to existing class hierarchies without altering any existing code.
- When you want to keep related behaviors together in a single class.
- When you want to define behaviors that can be applied to an entire class hierarchy.
- When you want to define behaviors that depend on complex hierarchies of objects.
- When you want to reuse behaviors across unrelated classes.

## How to implement the Visitor pattern

1. Identify the classes that will be visited by the visitor.
2. Declare the visitor interface and define the visit methods for each class.
3. Implement the visitor interface and define the visit methods for each class.
4. Add an accept method to the element hierarchy.
5. In the accept method, call the visit method on the visitor instance.

## Example

The Visitor pattern is commonly used in compilers and interpreters to add new behaviors to existing syntax trees. For example, in the following code snippet, we have a visitor interface that defines the visit methods for each node in the syntax tree. The visitor interface is implemented by a concrete visitor class that adds new behaviors to the syntax tree.

```java

public interface Visitor {
    void visit(Variable variable);
    void visit(Plus plus);
    void visit(Minus minus);
    void visit(Multiply multiply);
    void visit(Divide divide);
}

public class PrintVisitor implements Visitor {
    @Override
    public void visit(Variable variable) {
        System.out.print(variable.getName());
    }

    @Override
    public void visit(Plus plus) {
        System.out.print("(");
        plus.getLeft().accept(this);
        System.out.print("+");
        plus.getRight().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Minus minus) {
        System.out.print("(");
        minus.getLeft().accept(this);
        System.out.print("-");
        minus.getRight().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Multiply multiply) {
        System.out.print("(");
        multiply.getLeft().accept(this);
        System.out.print("*");
        multiply.getRight().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Divide divide) {
        System.out.print("(");
        divide.getLeft().accept(this);
        System.out.print("/");
        divide.getRight().accept(this);
        System.out.print(")");
    }
}

public interface Expression {
    void accept(Visitor visitor);
}

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Plus implements Expression {
    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Minus implements Expression {
    private Expression left;
    private Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Multiply implements Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Divide implements Expression {
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Expression expression = new Plus(
                new Variable("a"),
                new Minus(
                        new Variable("b"),
                        new Variable("c")
                )
        );
        expression.accept(new PrintVisitor());
        // output: (a+(b-c))
    }
}

```

## References

<https://refactoring.guru/design-patterns/visitor>
