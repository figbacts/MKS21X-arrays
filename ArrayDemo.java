public class ArrayDemo{
  public static void main(String[] args){
    int [] arrry = {1,2,3,4,5,6};
    printArray(arrry);
    System.out.println ("-------------------");
    int [][] test;
    test = new int [5][10];
    printArray(test);
    System.out.println ("-------------------");
    System.out.println (countZeros2D(test));
    System.out.println ("-------------------");
    fill2D(test);
    printArray(test);
    System.out.println ("-------------------");


  }
  public static void printArray(int[]ary){
    String ans = "[";
    for (int x = 0; x < ary.length +1 ; x ++){
      ans += x;
      if (x< ary.length){
        ans += ", ";
      }
    }
    ans += "]";
    System.out.println (ans);
  }
  public static void printArray(int[][]ary){
    String ans = "";
    for (int r = 0; r < ary.length; r ++){
      ans = ans + "[";
      for (int c = 0; c < ary[r].length; c++){
        ans += c;
        if (c < ary[r].length - 1){
        ans += ", ";
      }
        }
        ans = ans + "]" +"\n";
    }
    System.out.println (ans); }
    public static int countZeros2D(int[][] nums){
      int ans = 0;
      for (int r = 0; r < nums.length; r ++){
        for (int c = 0; c < nums[r].length; c++){
          if (c == 0){
            ans ++;
          }

        }
      }
      return ans;
    }
    public static void fill2D(int[][] vals){
      for (int r = 0; r < vals.length; r ++){
        for (int c = 0; c < vals[r].length; c++){
          if (r == c){
            vals[r][c] = 3;
          }
          else {
            vals[r][c] = 1;
          }
          }

        }
      }

}
