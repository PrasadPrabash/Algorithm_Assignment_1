import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do
        {
            System.out.print("Enter a Word: ");
            String inputWord = scanner.next();
            if(!scanner.nextLine().trim().isEmpty()) continue;


            boolean isPalindrome = true;
            int left = 0;
            int right = inputWord.length() - 1;

            while (left < right) {
                if (inputWord.charAt(left) != inputWord.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("The word is a palindrome.");
            } else {
                System.out.println("The word is not a palindrome.");
            }

        }while(true);
        
    }
}
