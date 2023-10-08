# TP INFO 4067

Nom : **Tomdieu TchadieuKo Ivan Gottfried**

Matricule : **20U2947**

## Exercice

### Factory Pattern : Abstract Factory And Abstract Products

- **Diagram UML**

    ![Image Du Diagram UML](diagram.png "UML Class Diagram")

\newpage

## Codes

### Fabrique

#### Fabrique Abstraite

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

#### Fabrique Concrete 1

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

#### Fabrique Concrete 2

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

#### Fabrique Concrete 3

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

\newpage

### Produit

#### Produit Abstrait A

```java
package com.produit;

public abstract class ProduitA {
    public abstract void methodA();
}
```

#### Produit Abstrait B

```java
package com.produit;

public abstract class ProduitB{
    public abstract void methodB();
}
```

#### Produit Abstrait C

```java
package com.produit;

public abstract class ProduitC {
    public abstract void methodA();
}
```
