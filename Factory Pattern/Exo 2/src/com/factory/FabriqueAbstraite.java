package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitB;

public abstract class FabriqueAbstraite {
    public abstract ProduitA createProduitA();
    public abstract ProduitB createProduitB();
}
