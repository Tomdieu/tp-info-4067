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
