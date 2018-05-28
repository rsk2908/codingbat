public int[] midThree(int[] nums) {
  int mid = nums.length/2;
  
  int new_array[] = new int[3];
  new_array[0] = nums[mid-1];
  new_array[1] = nums[mid];
  new_array[2] = nums[mid+1];
  
  return new_array;
}
