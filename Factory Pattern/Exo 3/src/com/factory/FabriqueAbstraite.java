package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitB;
import com.produit.ProduitC;

public abstract class FabriqueAbstraite {
    public abstract ProduitA createProduitA();

    public abstract ProduitB createProduitB();

    public abstract ProduitC createProduitC();

}
