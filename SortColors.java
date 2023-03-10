class SortColors {
    public void sort(int[] nums) {
        int count=0, count1=nums.length-1;
        int i=0;
        while(i<count1+1){
            if(nums[i]==0){
                int tmp = nums[i];
                nums[i] = nums[count];
                nums[count] = tmp;
                count++;
                i++;
                continue;
            }
            if(nums[i] ==2){
                int tmp = nums[i];
                nums[i] = nums[count1];
                nums[count1] = tmp;
                count1--;
                continue;
            }
            i++;
        }
    }
}
