import java.util.*;

public class SelectUnselectLC{
  public static void main(String[] args){
    int[] a = new int[]{1,2,3};
    System.out.println(powerSet(a));
  }
  public static List<List<Integer>> powerSet(int[] a){
    List<List<Integer>> o = new ArrayList<>();

    powerSet(a,new ArrayList<>(),0,o);
    return o;
  }

  public static void powerSet(int[] a,List<Integer> l,int i,List<List<Integer>> o){
    if(i >=  a.length){
      //System.out.println(l);
      o.add(new ArrayList(l));
    }else{
      l.add(a[i]);
      powerSet(a,l,i+1,o);

      l.remove(l.size()-1);
      powerSet(a,l,i+1,o);
    }
  }

}
