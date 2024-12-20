package org.example;

public class CountString {

    public void countVoyelle(String str) {
        int count = 0;
        String voyelle = "aeiouyAEIOUYéèàùâêîôûäëïöü";
        for (int i = 0; i < str.length(); i++) {
            if (voyelle.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        System.out.println("Le nombre de voyelle dans cette phrase est de : " + count + " lettres");
    }

    public void replaceVoyelle(String str) {
        String voyelle = "aeiouyAEIOUYéèàùâêîôûäëïöü";
        for (int i = 0; i < str.length(); i++) {
            if (voyelle.contains(String.valueOf(str.charAt(i)))) {
                str = str.replace(str.charAt(i), '*');
            }
        }
        System.out.println(str);
    }

    public String UpperCaseFirstLetter(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        String firstLetter = str.substring(0, 1).toUpperCase();
        String restLetters = str.substring(1);
        return firstLetter + restLetters ;
    }

    public String countNumberLetter(String str) {
        int count = 0;
        String StringIgnore =" ,.;:!?/";
        for (int i = 0; i < str.length(); i++) {
            if (!StringIgnore.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return "Le nombre de lettre dans cette phrase est de : " + count + " lettres";
    }
}
