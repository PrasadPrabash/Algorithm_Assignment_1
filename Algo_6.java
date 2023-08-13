import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = "";
        
        do{
            System.out.print("Enter sentence: ");
            sentence = scanner.nextLine();

            if (sentence.isBlank()){
            System.out.println("Sentence can't be empty");
                
            }
            for (int item = 0; item < sentence.length(); item++) {
                if ((int) sentence.charAt(item) > 127) {
                    break;
                }
                
            }
        }while(sentence.isBlank());  
        
        String[] wordsArray = sentence.split(" ");
        
        int n = wordsArray.length;
        int j = n;
        String[] newArray = new String[n];

        for (int i = 0; i < n; i++) {
            newArray[j-1] = wordsArray[i];
            j--;
        }

        for (String eachWord : newArray) {
            System.out.print(eachWord + " ");
        }
        System.out.println();
    }
}
