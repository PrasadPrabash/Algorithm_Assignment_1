import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputText = "";
        

        do{
            System.out.print("Enter a text: ");
            inputText= scanner.nextLine();
    
            if (inputText.isBlank()){
            System.out.println("Text can't be empty");
            }else{
                for (int i = 0; i < inputText.length(); i++) {
                    if ((int) inputText.charAt(i) > 127){
                    System.out.println("Please enter a text (ASCII only): ");
                        
                    }
                    
                }
        
            }
        
        }while(inputText.isBlank() );

        char[] charArray = inputText.toCharArray();

        for( char chars : charArray){
            System.out.print(chars);
        }
        System.out.println();

        int midpoint = charArray.length / 2;
        
        for (int i = 0; i < midpoint; i++) {
            char changechar =charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = changechar;
        }

        for( char chars : charArray){
            System.out.print(chars);
        }

        System.out.println();

    }
}
