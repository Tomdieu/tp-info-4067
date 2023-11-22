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
