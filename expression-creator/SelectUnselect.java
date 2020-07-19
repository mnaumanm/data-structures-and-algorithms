import java.util.*;

public class SelectUnselect{
  public static void main(String[] args){
    expressionGenerator("123", new char[]{' ','*','+'});

  }

  public static void expressionGenerator(String numbers,char[] o){
    String s = numbers.substring(1,numbers.length());
    String e = String.valueOf(numbers.charAt(0));
    expressionGenerator(s,e,0,o);
  }

  public static void expressionGenerator(String string,String exp,int index,char[] o){

    if(index >= string.length()){
      System.out.println(exp);
    }else{
      for(int i=0;i<o.length;i++){
        if(o[i]==' '){
          expressionGenerator(string,exp+string.charAt(index),index+1,o);
        }else{
          expressionGenerator(string,exp+o[i]+string.charAt(index),index+1,o);
        }
      }
    }
  }
}
