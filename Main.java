import java.util.*;
public class Main{
public static void main(String[]args){
int mark[]=new int[5];
Scanner scan=new Scanner(System.in);
for(int i=0;i<mark.length;i++){
System.out.println("Enter the "+i+" index:");
  mark[i]=scan.nextInt();
}
System.out.println(Arrays.toString(mark));

}
}