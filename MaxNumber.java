public class MaxNumber {

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // Alternatively: return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;

        int max = getMax(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}