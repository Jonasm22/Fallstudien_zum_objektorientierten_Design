import java.util.Arrays;

public class Testing {

        public static int[] twoSum(int[] nums, int target) {
                
            int [] result = nums;

            for (int i = 0; i < nums.length ; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }

                }
            }

                return new int[]{};
        }



    class Solution {
        public boolean isPalindrome(int x) {

            String numStr = Integer.toString(x);

            for(int i = 0; i < numStr.length() / 2 ; i++){
                if(numStr.charAt(i)!= numStr.charAt(numStr.length() -1 -i)){
                    return false;
                }
            }
            return true;

            }
        }



    public static void main(String[] args) {

           // twoSum( new int[]{2,7,11,15} , 9);

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 17)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));



    }
}
