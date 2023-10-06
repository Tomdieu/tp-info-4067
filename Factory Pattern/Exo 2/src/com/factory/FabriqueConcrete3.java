package com.factory;

import com.produit.ProduitA;
import com.produit.ProduitA3;
public class FabriqueConcrete3 extends FabriqueAbstraite{
    @Override
    public ProduitA createProduitA() {
        return new ProduitA3();
    }
}
