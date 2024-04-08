package Strings;

//Encontrar cuál es el caracter que tiene de más el string t con respecto a s

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] s_arr = new int[26];
        int[] t_arr = new int[26];

        for(int i = 0 ; i < s.length() ; i++)
            s_arr[s.charAt(i) - 97]++;

        for(int i = 0 ; i < t.length() ; i++)
            t_arr[t.charAt(i) - 97]++;

        for(int i = 0 ; i < 26 ; i++)
            if(s_arr[i] != t_arr[i]) return (char)(97 + i);

        return 'a';
    }
}

//LEETCODE
//public char findTheDifference(String s, String t) {
//    int x = 0;
//    int y = 0;
//    for (var c : s.toCharArray()) {
//        x = x ^ c;
//    }
//    for (var c : t.toCharArray()) {
//        y = y ^ c;
//    }
//    int p = x ^ y;
//    return (char) p;
//}
