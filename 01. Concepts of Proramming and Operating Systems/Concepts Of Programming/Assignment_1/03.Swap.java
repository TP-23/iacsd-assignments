import java.util.Scanner;

public class Swap{

public static void main(String[] args){

 int a,b;
  //object of scanner class to take input from user
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two nymber");
  a=sc.nextInt();
  b=sc.nextInt();
  
  System.out.println("values before swap:");
  System.out.println("A="+a+" "+"B="+b);
  
 //logic for swapping
  a=a+b;
  b=a-b;
  a=a-b;
  
  System.out.println("values after swap:");
  System.out.println("A="+a+" "+"B="+b);
}

}
