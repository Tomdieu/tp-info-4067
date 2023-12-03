import com.fichier.Dossier;
import com.fichier.Fichier;
import com.fichier.SystemFichier;
import com.fichier.TypeFichier;

public class Main {
    public static void main(String[] args) {
    SystemFichier fichier = new Fichier();
    fichier.setNom("text.pdf");
    fichier.setType(TypeFichier.PDF);
    fichier.decrire();
    Dossier dossier = new Dossier();
    dossier.setNom("INFO4067");
    dossier.setType(TypeFichier.DOSSIER);

    dossier.ajouter(fichier);

    dossier.decrire();


    }
}