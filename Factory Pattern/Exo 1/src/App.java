import com.factory.ProduitFactory;
import com.produit.ProduitA;

public class App {
    public static void main(String[] args) throws Exception {
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodA();
    }
}
