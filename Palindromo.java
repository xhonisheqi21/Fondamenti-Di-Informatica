import java.lang.Character;;

public class Palindromo {
    public static boolean isPalindrome(String text , int start , int end) {
            if (start >= end) {return true;} // caso 0 e 1
            else {
                char first = Character.toLowerCase(text.charAt(start));
                char last = Character.toLowerCase(text.charAt(end));

                if (Character.isLetter(first) && Character.isLetter(last)) {
                    if (first == last) {
                        return isPalindrome(text, start + 1, end - 1);
                    }
                    else {
                        return false;
                    }
                }
                else if (!Character.isLetter(last)) {
                    return isPalindrome(text, start, end - 1);
                }
                else {
                    return isPalindrome(text, start + 1, end);
                }
            }
        }

    // override del metodo
    public static boolean isPalindrome(String text) {
        return isPalindrome(text , 0 , text.length() - 1);
    }
    public static void main(String[] args) {
        
        String str1 = "Madam , I'm Adam";
        String str2 = "Sir, I'Eve";
        String str3 = "Lana";
        String str4 = "";
        String str5 = "aa";
        String str6 = "af";
        String str7 = "afe";

        System.out.println("E' Palindromo ? : " + isPalindrome(str1));
        System.out.println("E' Palindromo ? : " + isPalindrome(str2));
        System.out.println("E' Palindromo ? : " + isPalindrome(str3));
        System.out.println("E' Palindromo ? : " + isPalindrome(str4));
        System.out.println("E' Palindromo ? : " + isPalindrome(str5));
        System.out.println("E' Palindromo ? : " + isPalindrome(str6));
        System.out.println("E' Palindromo ? : " + isPalindrome(str7));

    }

}
