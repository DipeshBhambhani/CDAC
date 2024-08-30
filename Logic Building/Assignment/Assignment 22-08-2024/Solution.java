public class Solution {
    public static void main(String[] args) {
        int rows = 6;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;         }
    }
}