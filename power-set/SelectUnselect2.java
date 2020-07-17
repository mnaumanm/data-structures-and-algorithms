import java.util.*;

public class SelectUnselect2{
  public static void main(String[] args){
    powerSet("abc");
  }


  public static void powerSet(String str){
    powerSet(str,"");
  }

  public static void powerSet(String str,String p){
    if(str.length()<=0){
      System.out.println(p);
    }else{
      powerSet(str.substring(1,str.length()),p+str.charAt(0));
      powerSet(str.substring(1,str.length()),p              );
    }
  }
}
