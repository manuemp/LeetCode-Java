package Strings;

public class ReverseVowels {
    public static String reverseVowels(String s) {

        // Tengo que agarrar la primera con la última.
        // Después la que le sigue a la primera con la que antecede a la última

        // Lo que puedo hacer es un while que empiece en ambas puntas de la palabra
        // y vaya salteando letras hasta que encuentre una vocal. El while
        // va a frenar cuando alguno de los dos punteros iguale la posición del siguiente

        String vowels = "aAeEiIoOuU";
        char aux;
        char arr[] = s.toCharArray();
        int first = 0;
        int last = s.length() - 1;

        while(first < last){
            while(first < last && vowels.indexOf(s.charAt(first)) == -1)
                first++;
            while(last > first && vowels.indexOf(s.charAt(last)) == -1)
                last--;

            aux = arr[first];
            arr[first] = arr[last];
            arr[last] = aux;

            first++;
            last--;
        }

        String res = new String(arr);
        return res;

    }
}
