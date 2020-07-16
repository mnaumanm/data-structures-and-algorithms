

public class SelectUnselect{
  public static void main(String[] args){

    System.out.println("TRUE=="+ (groupSum(0, new int[]{2, 4, 8}, 10)==true));
    System.out.println("TRUE=="+ (groupSum(0, new int[]{2, 4, 8}, 14)==true));
    System.out.println("TRUE=="+ (groupSum(0, new int[]{2, 4, 8}, 9)==false));
  }

  public static boolean groupSum(int i, int[] a, int t) {
    if(i>a.length-1) return t==0;

    return  groupSum(i+1,a,t-a[i])
         || groupSum(i+1,a,t     );
  }
}
