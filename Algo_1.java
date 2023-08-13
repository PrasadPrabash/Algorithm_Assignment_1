import java.util.Scanner;

public class Algo_1 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 0){
                System.out.println("Enter Positive Number");
                break;
            }

            int y = 0;
            int x = 0;
            int temp = 1;

            loop:
                do{
                    y = x;
                    x = temp;
                    temp = y + x;
                    if(temp >= num){
                        System.out.println();
                        break loop;
                    }
                    System.out.print(temp);
                    System.out.print(" ");  

                }while(temp < num);
            System.out.println();
        } while (true);
        
    } 
    
}
