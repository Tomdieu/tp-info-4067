import com.factory.FabriqueAbstraite;
import com.factory.FabriqueConcrete1;
import com.factory.FabriqueConcrete2;
import com.factory.FabriqueConcrete3;
import com.produit.ProduitA;

public class App {
    public static void main(String[] args) throws Exception {

        // For Produit A1

        FabriqueAbstraite fabriqueAbstraite1 = new FabriqueConcrete1();

        ProduitA produitA = fabriqueAbstraite1.createProduitA();
        produitA.methodA();

        // For Produit A2

        FabriqueAbstraite fabriqueAbstraite2 = new FabriqueConcrete2();

        ProduitA produitA2 = fabriqueAbstraite2.createProduitA();
        produitA2.methodA();

        // For Produit A3

        FabriqueAbstraite fabriqueAbstraite3 = new FabriqueConcrete3();
        ProduitA produitA3 = fabriqueAbstraite3.createProduitA();
        produitA3.methodA();

    }
}
