import java.util.HashMap;
class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int cmp=target-nums[i];
            if (mp.containsKey(cmp)){
                return new int[] {mp.get(cmp),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};

        
    }
}