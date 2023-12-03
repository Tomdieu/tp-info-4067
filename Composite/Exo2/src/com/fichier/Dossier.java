package com.fichier;

import java.util.LinkedList;

public class Dossier extends SystemFichier{

    private LinkedList<SystemFichier> sousRepertoire;


    @Override
    public void decrire() {
        System.out.println("Je Suis un dossier avec nom "+getNom()+" et fichier : ");
        for(SystemFichier systemFichier:sousRepertoire){
            systemFichier.decrire();
        }
    }

    @Override
    public void ajouter(SystemFichier fichier) {
        super.ajouter(fichier);
        if (this.sousRepertoire == null){
            this.sousRepertoire = new LinkedList<SystemFichier>();
        }
        this.sousRepertoire.add(fichier);
    }

    @Override
    public void supprimer() {
        super.supprimer();
    }

    @Override
    public SystemFichier obtenir(int index) {
        return super.obtenir(index);
    }
}
