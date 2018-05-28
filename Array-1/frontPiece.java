public int[] frontPiece(int[] nums) {
  int two_elements[] = new int[2];
  if(nums.length>1){
    for(int i=0; i<2; i++){
      two_elements[i] = nums[i];
    }
    return two_elements;
  }
  return nums;
}
