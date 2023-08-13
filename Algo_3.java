public class Algo_3 {
    public static void main(String[] args) {
       
        int[] nums = {10, 20, 30, 40, 50};
        int n = nums.length;
        int j = n;
        int[] newNum = new int[n];

        for (int i = 0; i < n; i++) {
            newNum[j-1] = nums[i];
            j--;
        }
        
        System.out.println(newNum);

        nums = newNum;
        System.out.println(nums);
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
            
        }
    }
}
