import java.util.*;

public class BackTrackArray{
  public static void main(String[] args){
    permutate();
  }

  public static void permutate(){
    permutate(new char[]{'A','B','C'}, 0);
  }
  public static void permutate(char[] a, int i){
    if(i>=a.length){
      System.out.println(Arrays.toString(a));
    }
    for(int j=i;j<a.length;j++){

      //Swap
      swap(a,i,j);

      // Permutate
      permutate(a,i+1);

      //Backtrack
      swap(a,i,j);
    }
  }

  public static void swap(char[] a, int i, int j){
    char temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
