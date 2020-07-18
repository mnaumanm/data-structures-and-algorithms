import java.util.*;

public class BackTrackString{
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
      // Permutate
      permutate(s.substring(0,j)+s.substring(j+1,s.length()),p+c);

      // BackTreck
      // IMPlicit BackTracking because of nature of String and java
    }
  }
}
