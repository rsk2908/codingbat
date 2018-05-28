public int[] swapEnds(int[] nums) {
  int temp;
  temp = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  
  return nums;
}
