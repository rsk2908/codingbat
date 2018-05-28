public int diff21(int n) {
  if(n>21){
    return 2*Math.abs(21-n);//return double the abs value 
  }
  
  return Math.abs(n-21);//abs value
}
