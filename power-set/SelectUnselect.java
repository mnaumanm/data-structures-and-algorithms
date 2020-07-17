import java.util.*;

public class SelectUnselect{
  public static void main(String[] args){
    powerSet("abc");
  }


  public static void powerSet(String str){
    powerSet(str,"",0);
  }

  public static void powerSet(String str,String p, int i){
    if(i>=str.length()){
      System.out.println(p);
    }else{
      powerSet(str,p+str.charAt(i ), i+1);
      powerSet(str,p , i+1);
    }
  }
}
