import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    boolean check=true;
    boolean a=false;
    boolean b=true;
    int c=5;
    if(c<<2 > 5){
      if(b){

        a=!a;
        if(a){
          b=!b;
          if(b){
            c+=5;
          }else{
            c+=10;
          }
        }
      }
    }
    System.out.println(c);
  }
}
