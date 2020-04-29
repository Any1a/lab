public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " -> " + isPalindrome(args[i]));
        }
    }

    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }

    public static String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
