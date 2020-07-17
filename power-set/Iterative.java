public class Iterative{
  public static void main(String[] args){
    powerSet("ABC");
  }

  public static void powerSet(String s){
    System.out.println("");  // EMPTY SET

    //int l=0;   // Left Pointer
    //int r=0;   // Right Pointer
    for(int l=0;l<=s.length();l++){
      for(int r=l+1;r<=s.length();r++){
        System.out.println(s.substring(l,r));

      }
    }

  }
}
