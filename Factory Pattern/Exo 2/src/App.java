import com.factory.FabriqueAbstraite;
import com.factory.FabriqueConcrete1;
import com.produit.ProduitA;
import com.produit.ProduitB;

public class App {
    public static void main(String[] args) throws Exception {

        FabriqueAbstraite fabriqueAbstraite = new FabriqueConcrete1();

        ProduitA produitA = fabriqueAbstraite.createProduitA();
        produitA.methodA();
        ProduitB produitB = fabriqueAbstraite.createProduitB();
        produitB.methodB();
    }
}
