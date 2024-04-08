package Strings;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int last = s.length() - 1;

        for(int i = 0 ; i < s.length() && i < last ; i++) {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                while(!Character.isLetterOrDigit(s.charAt(last)) && last > i) last--;
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(last))) return false;
                last--;
            }
        }
        return true;
    }
}
