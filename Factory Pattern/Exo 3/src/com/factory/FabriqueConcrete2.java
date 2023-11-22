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
