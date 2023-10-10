# TP INFO 4067

This is where I will store all my java related code for the course `INFO 4067`

## Patterns

This is where I will store all the patterns that I will be learning in the course

- [Factory Pattern](#factory-pattern)
- [Singleton Pattern](#singleton-factory)
- [Builder Pattern](#builder-pattern)

## Factory Pattern

This are all the exercises for the factory pattern

- **Exo 1**

    **Product Factory Class**

    The class below is the factory class that will be used to create the different products

    ```java
    package com.factory;

    import com.produit.ProduitA;
    import com.produit.ProduitA1;
    import com.produit.ProduitA2;
    import com.produit.ProduitA3;

    public class ProduitFactory {
        public static final int TYPE_PRODUITA1 = 1;
        public static final int TYPE_PRODUITA2 = 2;
        public static final int TYPE_PRODUITA3 = 3;

        public ProduitA geProduitA(int typeProduit) throws IllegalAccessException{
            ProduitA produitA;
            switch (typeProduit) {
                case TYPE_PRODUITA1:
                    produitA = new ProduitA1();
                    break;
                case TYPE_PRODUITA2:
                    produitA = new ProduitA2();
                    break;
                case TYPE_PRODUITA3:
                    produitA = new ProduitA3();
                    break;
                default:
                    throw new IllegalAccessException("Type de produit inconnu");
            }
            return produitA;
        }
    }
    ```

    **Classe Abstraite de produit**

  - ProduitA

    This is the abstract class that will be used to create the different products

    ```java
    package com.produit;

    public abstract class ProduitA {
        public abstract void methodA();
        
    }

    ```

    **Classe Concrete De produit**

    - ProduitA1

    This is the concrete class that will be used to create the ProduitA1 products

    ```java
    package com.produit;

    public class ProduitA1 extends ProduitA {
        public void methodA() {
            System.out.println("ProduitA1.methodA()");
        }
    }
    ```

    - ProduitA2

    This is the concrete class that will be used to create the ProduitA2 products

    ```java
    package com.produit;

    public class ProduitA2 extends ProduitA{
        public void methodA() {
            System.out.println("ProduitA2.methodA()");
        }
    }

    ```

    - ProduitA3

    This is the concrete class that will be used to create the ProduitA3 products

    ```java
    package com.produit;

    public class ProduitA3 extends ProduitA {
        public void methodA() {
            System.out.println("ProduitA3.methodA()");
        }    
    }
    ```

    Main Class

    This is the main class that will be used to test the factory pattern

    ```java
    import com.factory.ProduitFactory;
    import com.produit.ProduitA;

    public class App {
        public static void main(String[] args) throws Exception {
            ProduitFactory produitFactory = new ProduitFactory();

            ProduitA produitA = null;

            produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA1);
            produitA.methodA();

            produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA2);
            produitA.methodA();

            produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA3);
            produitA.methodA();
        }
    }

    ```

    Class Diagram

    ![Image](./Factory%20Pattern/Exo%201/diagram.png "diagram")
- **Exo 2**

    This is the updated version of the first exercise but we added a third product

    **Product Factory Class**

  - Abstract Product Factory

    This is the abstract factory class that will be used to create the different products

    ```java
    package com.factory;

    import com.produit.ProduitA;
    import com.produit.ProduitB;
    import com.produit.ProduitC;

    public abstract class FabriqueAbstraite {
        public abstract ProduitA createProduitA();

        public abstract ProduitB createProduitB();

        public abstract ProduitC createProduitC();

    }
    ```

    - Concrete Product Factory

      - FabriqueConcrete1

        ```java
        package com.factory;

        import com.produit.ProduitA;
        import com.produit.ProduitA1;
        import com.produit.ProduitB;
        import com.produit.ProduitB1;
        import com.produit.ProduitC;
        import com.produit.ProduitC1;

        public class FabriqueConcrete1 extends FabriqueAbstraite {

            @Override
            public ProduitA createProduitA() {
                return new ProduitA1();
            }

            @Override
            public ProduitB createProduitB() {
                return new ProduitB1();
            }

            @Override
            public ProduitC createProduitC() {
                return new ProduitC1();
            }
            
        }
        ```

        - FabriqueConcrete2

            ```java
            package com.factory;

            import com.produit.ProduitA;
            import com.produit.ProduitA2;
            import com.produit.ProduitB;
            import com.produit.ProduitB2;
            import com.produit.ProduitC;
            import com.produit.ProduitC2;

            public class FabriqueConcrete2 extends FabriqueAbstraite {
                @Override
                public ProduitA createProduitA() {
                    return new ProduitA2();
                }

                @Override
                public ProduitB createProduitB() {
                    return new ProduitB2();
                }

                @Override
                public ProduitC createProduitC() {
                    return new ProduitC2();
                }
            }

            ```

        - FabriqueConcrete3

            ```java
            package com.factory;

            import com.produit.ProduitA;
            import com.produit.ProduitA3;
            import com.produit.ProduitB;
            import com.produit.ProduitB3;
            import com.produit.ProduitC;
            import com.produit.ProduitC3;
            public class FabriqueConcrete3 extends FabriqueAbstraite{
                @Override
                public ProduitA createProduitA() {
                    return new ProduitA3();
                }

                @Override
                public ProduitB createProduitB() {
                    return new ProduitB3();
                }

                @Override
                public ProduitC createProduitC() {
                    return new ProduitC3();
                }
            }

            ```

    Uml Diagram

    ![Image](./Factory%20Pattern/Exo%202/diagram.png "diagram")

## Singleton Factory

This are all the exercises for the singleton factory pattern

- **Exo1**

  - **Singleton Class**

    This is the first example on Singleton

    ```java
    package com.singleton;

    public final class Singleton {
        private static Singleton instance = null;
        private int x;
        private int y;

        private Singleton() {

            super();
        }

        private Singleton(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public static Singleton getInstance(int x, int y) {
            if (instance == null) {
                instance = new Singleton(x, y);
            }
            return instance;
        }

        public int somme(int x, int y) {
            return x + y;
        }

        public float moyenne(int x, int y) {
            return somme(x, y) / 2;
        }

        public void affiche() {
            System.out.println("\nJe suis une instance mes\n" +
                    "valeurs sont x = " + x + " y = " + y);
        }

        @Override
        public Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();
        }

    }
    ```

  - App.java

    This file is use to call the Singleton Class

    ```java
    import com.singleton.Singleton;

    public class App {
        public static void main(String[] args) throws Exception {
            int som = Singleton.getInstance().somme(2, 5);
            System.out.printf("la somme est %d",som);
            Singleton s1 = Singleton.getInstance(8, 3);
            s1.affiche();

            Singleton s2 = Singleton.getInstance(5, 9);
            s2.affiche();
        }
    }
    ```

    Uml Class Diagram

    ![Image](./Singleton%20Pattern/Exo1/diagram.png "diagram")

- **Exo2**
    This is an updated version of the Singleton above another attribute `nom`

  - Arithmetic Singleton Class

    ```java
    package com.singleton;

    public final class Arithmetic {
        private static Arithmetic instance = null;
        private int x;
        private int y;
        private String nom;

        private Arithmetic() {
            super();
        }

        private Arithmetic(int x, int y, String nom) {
            this.x = x;
            this.y = y;
            this.nom = nom;
        }

        public int add(int a, int b) {
            return a + b;
        }

        public float divide(int a, int b) {
            return (float) a / b;
        }

        public float mean(int a, int b) {
            return add(a, b) / 2;
        }

        public static Arithmetic getArithmetic() {
            if (instance == null) {
                instance = new Arithmetic();
            }
            return instance;
        }

        public static Arithmetic getArithmetic(int x, int y, String nom) {
            if (instance == null) {
                instance = new Arithmetic(x, y, nom);
            }
            
            return instance;
        }

        public void affiche() {
            System.out.println("Je suis une instance avec les valeurs \n: x = " + this.x + " y = " + this.y + " nom = " + this.nom);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    ```

  - App.java

    ```java
    import com.singleton.Arithmetic;

    public class App {
        public static void main(String[] args) throws Exception {

            
            int sum = Arithmetic.getArithmetic().add(5, 1);

            System.out.println("Sum is : "+sum);

            //Output : Sum is : 6

            Arithmetic a1 = Arithmetic.getArithmetic(5,8,"ivantom");
            a1.affiche();

            //Output : Je suis une instance avec les valeurs : x = 0 y = 0 nom = null

            Arithmetic b1 = Arithmetic.getArithmetic(-52, 25, "Tomdieu");
            b1.affiche();

            //Je suis une instance avec les valeurs : x = 0 y = 0 nom = null
        }
    }

    ```

    ![Image](./Singleton%20Pattern/Exo2/diagram.png "diagram")

## Builder Pattern

This are all the exercises for the builder pattern
