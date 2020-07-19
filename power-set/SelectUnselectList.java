import java.util.*;

public class SelectUnselectList{
  public static void main(String[] args){
    List<Character> l = new ArrayList<>();
    l.add('1');
    l.add('2');
    l.add('3');
    powerSet(l);
  }
  public static void powerSet(List<Character> a){
    powerSet(a,new ArrayList<>(),0);
  }

  public static void powerSet(List<Character> a,List<Character> l,int i){
    if(i >=  a.size()){
      System.out.println(l);
    }else{
      l.add(a.get(i));
      powerSet(a,l,i+1);

      l.remove(l.size()-1);
      powerSet(a,l,i+1);
    }
  }

}
