package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitA1;
import com.produit.ProduitB;
import com.produit.ProduitB1;

public class FabriqueConcrete1 extends FabriqueAbstraite {

    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB createProduitB() {
        return new ProduitB1();
    }
    
}
