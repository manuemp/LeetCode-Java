package Strings;


//Contar la cantidad de palabras en un string. Para esto hay que obviar los espacios.
//Puede parecer que lo lógico sea contar la cantidad de espacios y deducir la cantidad de palabras
//Pero en realidad complica mucho el ejercicio. Lo mejor es buscar la forma de detectar cuando se está
//Dentro de una palabra y cuando se sale (espacio).

public class CountSegments {
    public int countSegments(String s) {
        int segments = 0;
        boolean flag = false;

        for(int i = 0 ; i < s.length() ; i++){
            if(!flag){
                if(s.charAt(i) != ' '){
                    flag = true;
                    segments++;
                }
            }
            else if (s.charAt(i) == ' ') flag = false;
        }

        return segments;
    }
}
