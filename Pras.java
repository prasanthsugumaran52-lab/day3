import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter day number(1-7):");
      int day=scan.nextInt();
      switch(day){
        case 1,2,3,4,5:System.out.println("weekday");break:
        case 6,7:System.out.println("weekend");break:
        default :System.out.println("invalid");break:
      }
      sc.close()
    }
}

s