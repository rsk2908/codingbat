public int maxTriple(int[] nums) {
  int mid = nums.length/2;
  int len = nums.length;
  int res = nums[0]>nums[mid] ? nums[0]>nums[len-1] ? nums[0]:nums[len-1] : nums[mid]>nums[len-1] ? nums[mid]:nums[len-1];
  return res;
}
