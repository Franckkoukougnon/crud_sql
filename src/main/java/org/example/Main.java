package org.example;

public class Main {
    public static void main(String[] args) {



        //Creation of an object of the FunctionList class
        FunctionList functionList = new FunctionList();

        //Method to add students
        functionList.addEtudiant("Ange Koukougnon");
        functionList.addEtudiant("Leila Nabintou Cisse");
        functionList.addEtudiant("Issac Koukougnon");

        //Method to show the list of students
        functionList.showEtudiants();

        //Method to delete a student
        functionList.deleteEtudiant("Issac Koukougnon");

       //Method to show the list of students
        functionList.showEtudiants();

        //Method to update a student
        functionList.updateEtudiant("Ange Koukougnon", "Ange Koukougnon Junior");

        //Method to show the list of students
        functionList.showEtudiants();




    }
}