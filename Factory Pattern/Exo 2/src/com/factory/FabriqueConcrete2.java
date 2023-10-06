package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitA2;

public class FabriqueConcrete2 extends FabriqueAbstraite {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA2();
    }
}
