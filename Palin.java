public class Palin {

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        System.out.println("\"" + input + "\" is a palindrome: " + result);
    }
}
