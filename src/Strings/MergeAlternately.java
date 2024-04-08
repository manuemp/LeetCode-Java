package Strings;

public class MergeAlternately
{
    public static String mergeAlternately(String word1, String word2) {

        String longestStr = word1.length() > word2.length() ? word1 : word2;
        StringBuilder res = new StringBuilder();
        int i = 0;

        for(i = 0 ; i < Math.min(word1.length(), word2.length()) ; i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        for(int j = 0 ; j < longestStr.length() - i ; j++){
            res.append(longestStr.charAt(j + i));
        }

        return res.toString();
    }
}
