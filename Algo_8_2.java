public class Algo_8_2 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        // A ∪ B

        for (int item : numA) {
            System.out.print(item + " ");
        }

        for (int i = 0; i < numA.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
               if(numB[i] == numA[j]){
                count += 1;
                break;
                } 
            } 
            if (count == 0) System.out.print(numB[i]+" ");
        } 
    }
}
