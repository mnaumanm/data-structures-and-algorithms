import java.util.*;

public class BackTrackStringLong{
  public static void main(String[] args){
    permutate("ABC");
  }

  public static void permutate(String s){
    permutate(s,"");
  }

  public static void permutate(String s, String p){
    if(s.length() == 0 ){
      System.out.println(p);
      return;
    }
    for(int j=0;j<s.length();j++){

      // SWAP
      char c = s.charAt(j);
      s = s.substring(0,j)+s.substring(j+1,s.length());
      p = p+c;

      // Permutate
      permutate(s,p);

      // BackTreck
      s = s.substring(0,j)+c+s.substring(j,s.length());
      p = p.substring(0,p.length()-1);

    }
  }
}
