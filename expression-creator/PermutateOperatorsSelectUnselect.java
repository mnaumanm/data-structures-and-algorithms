import java.util.*;

public class PermutateOperatorsSelectUnselect{
  public static void main(String[] args){
    permutateOperators("123", new char[]{' ','*','+'});

    /*  OUTPUT:
    //  [ , *, +]
    //  [ , +, *]
    //  [*,  , +]
    //  [*, +,  ]
    //  [+, *,  ]
    //  [+,  , *]
    */

  }

  public static void permutateOperators(String s, char[] o){
    permutateOperators(s,o,0);
  }

  public static void permutateOperators(String s, char[] o,int i){
    if(i>=o.length){
      System.out.println(Arrays.toString(o));
      return;
    }
    for(int j=i;j<o.length;j++){
      swap(o,i,j);
      permutateOperators(s,o,i+1);
      swap(o,i,j);
    }
  }


  public static void swap(char[] a, int i, int j){
    char temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
