import com.singleton.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        int som = Singleton.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(5, 9);
        s2.affiche();
    }
}
