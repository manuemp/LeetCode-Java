package Strings;
import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] arr = s.split(" ");

        //La cantidad de caracteres del patrón tiene que ser la misma cantidad de letras que la oración
        if(arr.length != pattern.length()) return false;

        //Por cada letra del patrón
        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            //Corroboro que no exista ya la letra en el map
            if(!map.containsKey(c)){
                //Verifico que la palabra no esté ya en otro key
                if(!map.containsValue(arr[i]))
                    //Agrego el par clave-valor
                    map.put(c, arr[i]);
                else return false;
            }
            else{
                //Si la clave existe, verifico que la palabra en cuestión sea la misma que el valor de esa clave
                if(!arr[i].equals(map.get(c))) return false;
            }
        }
        return true;
    }
}
