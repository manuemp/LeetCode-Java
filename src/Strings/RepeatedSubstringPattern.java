package Strings;

//Verificar si un string puede ser dividido en x cantidad de substrings iguales.

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        //La cantidad mínima en la que puedo dividir algo es 2. Después veo si puedo dividirlo
        //en más partes
        int divisor = 2;

        while(divisor <= len){
            //Si "divisor" puede dividir al string en partes iguales creo un string repitiendo
            //ese fragmento en una cantidad de veces igual a "divisor"
            if(len % divisor == 0){
                int count = divisor;
                while(count-- > 0){
                    sb.append(s.substring(0, len / divisor));
                }
            }

            //Si el string que creé es igual al string original, entonces puede ser
            //dividido en partes iguales
            if(sb.toString().equals(s)) return true;
            else {
                //Si encontré un divisor, pero no me genera el string, reinicio
                //la variable y aumento el divisor
                sb.setLength(0);
                divisor++;
            }
        }

        return false;
    }
}
