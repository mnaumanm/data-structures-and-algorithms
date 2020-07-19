import java.util.*;

public class BacktrackList{
  public static void main(String[] args){
    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    powerset(a);
  }


  public static void powerset(List<Integer> a){
    powerset(a,0);
  }

  public static void powerset(List<Integer> a, int i){
    if(i >= a.size()){
      System.out.println(a);
    }else{
      for(int j=i;j<a.size();j++){
        swap(a,i,j);
        powerset(a,i+1);
        swap(a,i,j);
      }
    }
  }

  public static void swap(List<Integer> a, int i,int j){
    Integer temp = a.get(i);
    a.set(i,a.get(j));
    a.set(j,temp);
  }




}
