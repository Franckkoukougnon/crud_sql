package org.example;

import java.util.ArrayList;
import java.util.List;

public class FunctionList {

    // creation de la liste des etudiants
    List<String> etudiants = new ArrayList<>();

    // methode pour ajouter un etudiant
    public void addEtudiant(String etudiant) {
        etudiants.add(etudiant);
    }

    // methode pour afficher la liste des etudiants
    public void showEtudiants(){
        System.out.println("Liste des etudiants : ");
        for (String etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    //methode pour supprimer un etudiant
    public void deleteEtudiant(String etudiant){
        etudiants.remove(etudiant);
        System.out.println(etudiant + "a été supprimé de la liste");
    }

    //methode pour faire une mise a jour d'un etudiant
    public void updateEtudiant(String etudiant, String newEtudiant){
        etudiants.set(etudiants.indexOf(etudiant), newEtudiant);
        System.out.println(etudiant + " a été remplacé par " + newEtudiant);
    }

}
