# TP INFO 4067

This is where I will store all my java related code for the course `INFO 4067`

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

    ```java
    package com.produit;

    public abstract class ProduitA {
        public abstract void methodA();
        
    }

    ```

    **Classe Concrete De produit**

    - ProduitA1

    ```java
    package com.produit;

    public class ProduitA1 extends ProduitA {
        public void methodA() {
            System.out.println("ProduitA1.methodA()");
        }
    }
    ```

    ![Image](./Factory%20Pattern/Exo%201/diagram.png "diagram")
- **Exo 2**

    ![Image](./Factory%20Pattern/Exo%202/diagram.png "diagram")

## Singleton Factory

This are all the exercises for the singleton factory pattern

- **Arithmetic**

    ![Image](./Singleton%20Pattern/Arithmetic/diagram.png "diagram")

- **Singleton**

    ![Image](./Singleton%20Pattern/Singleton/diagram.png "diagram")

## Builder Pattern

This are all the exercises for the builder pattern
