import java.util.*;

public class PowersetOperatorsSelectUnselect{
  public static void main(String[] args){
    int[] o = new char[]{' ','*','+'};

  }

  public static void combinations(char[] a, int i){
    if(i>=a.length){
      System.out.println(Arrays.toString(a));
    }else{
      combinations(a,i+1);
      combinations(a,i+1);
    }
  }
}
