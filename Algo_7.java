import java.util.Arrays;
import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        final String GREEN_COLOR_BOLD = "\033[32;1m";
        final String YELLOW_COLOR_BOLD = "\033[33;1m";
        final String RESET_COLOUR = "\033[30;0m";

        String sentence = "";

        do{
            System.out.print("Enter Your name: ");
            sentence = scanner.nextLine();

            if (sentence.isBlank()){
            System.out.println("Name cant be empty");
            }

            for (int item = 0; item < sentence.length(); item++) {
                if ((int) sentence.charAt(item) > 127){
                    break;
                } 
            }
        }
        while(sentence.isBlank());
        
        
        String[] wordsArray = sentence.split(" ");
        
        // Print the words array
        //System.out.println(Arrays.toString(wordsArray));

        String maxlenstr = wordsArray[0];
        String shrtlenstr = wordsArray[0];

        for( String words : wordsArray){
            if (words.length()> maxlenstr.length()){
                maxlenstr = words;

            }else if(words.length()< shrtlenstr.length()){
                shrtlenstr = words;
            }
        }

        System.out.printf("This is the \033[34;1mLongest\033[30;0m word: %s%s%s length is: %d \n",YELLOW_COLOR_BOLD,maxlenstr,RESET_COLOUR , maxlenstr.length());
        System.out.printf("This is the \033[34;1mShortest\033[30;0m word: %s%s%s length is: %d \n",GREEN_COLOR_BOLD,shrtlenstr,RESET_COLOUR , shrtlenstr.length());
    }
        
    
}
