public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int midpoint = nums.length / 2;
        
        for (int i = 0; i < midpoint; i++) {
            int changenum = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = changenum;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
