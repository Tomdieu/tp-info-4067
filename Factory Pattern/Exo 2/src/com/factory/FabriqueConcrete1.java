package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitA1;

public class FabriqueConcrete1 extends FabriqueAbstraite {

    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }
    
}
