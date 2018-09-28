public class ArrayDemo{
  public static void main(String[] args){
    int [] arrry = {1,2,3,4,5,6};
    printArray(arrry);
    System.out.println ("-------------------");
    int[][]zero = new int [5][5];
    printArray(zero);
    System.out.println ("-------------------");
    System.out.println (countZeros2D(zero));
    System.out.println ("-------------------");
    fill2D(zero);
    printArray(zero);
    System.out.println ("-------------------");
    int [][]neg = new int [3][3];
    neg[1][2] = -2;
    neg[2][2] = -3;
    neg[0][2] = -1;
    printArray(neg);
    printArray(fill2DCopy(neg));



  }
  public static void printArray(int[]ary){
    String ans = "[";
    for (int x = 0; x < ary.length; x ++){
      ans += ary[x];
      if (x< ary.length -1 ){
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
        ans += ary[r][c];
        if (c < ary[r].length - 1){
        ans += ", ";
      }
        }
        ans = ans + "]" +"\n";
    }
    System.out.println (ans);}
    public static int countZeros2D(int[][] nums){
      int ans = 0;
      for (int r = 0; r < nums.length; r ++){
        for (int c = 0; c < nums[r].length; c++){
          if (nums[r][c] == 0){
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

      public static int[][] fill2DCopy(int[][] vals){
        int [][] ans;
        ans = new int [vals.length][vals[0].length];
        for (int r = 0; r < vals.length; r ++){
          for (int c = 0; c < vals[r].length; c++){
            if (vals[r][c] < 0){
              ans[r][c] = 3;
            }
            else {
              ans[r][c] = 1;
            }
          }}
          return ans;


}


}
