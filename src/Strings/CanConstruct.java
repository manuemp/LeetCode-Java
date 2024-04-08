package Strings;

//Determinar si con las letras de la variable magazine se puede formar la palabra
//contenida en ransomNote.
//Se crean dos arrays de longitud 28. Por cada array ubico en la posición que corresponda
//a cada letra la cantidad de repeticiones de la misma. Después comparo y averiguo
//si se puede formar la palabra o no.

//Podría usarse indexOf para simplificar

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = true;
        int[] ransomCounter = new int[28];
        int[] magazineCounter = new int[28];

        for(int i = 0 ; i < ransomNote.length() ; i++)
            ransomCounter[ransomNote.charAt(i) - 97]++;

        for(int i = 0 ; i < magazine.length() ; i++)
            magazineCounter[magazine.charAt(i) - 97]++;

        for(int i = 0 ; i < ransomNote.length() ; i++)
            if(ransomCounter[ransomNote.charAt(i) - 97] > magazineCounter[ransomNote.charAt(i) - 97]) flag = false;

        return flag;
    }
}
