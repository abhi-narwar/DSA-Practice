class max_consecutive_ones{
    public int findMaxConsecutiveOnes(int[] nums) {
        int pcount = 0;  
        int ncount = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                pcount++; 
                if (pcount > ncount) {
                    ncount = pcount; 
                }
            } else {
                pcount = 0; 
            }
        }

        return ncount;
    }
}
