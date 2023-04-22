import java.util.Scanner;

public class Array{

public static void main(String... args)
{
   Scanner sc=new Scanner(System.in);
   int count=0;
   System.out.println("Enter array size");
   int size=sc.nextInt();//to take size from userfrom user
   
   int[] arr=new int[size];
   
   // to read array element from user
    System.out.println("Enter the array element");
    for(int i=0;i<size;i++)
      {
         arr[i]=sc.nextInt(); 
      }  


   //logic to calculate number of occurence

   for(int i=0;i<size;i++)
   {
      for(int j=0;j<size;j++)
      {
         
          if(j<i&&arr[i]==arr[j])
           {
             break;
           }
            else if(arr[i]==arr[j])
               {
                 
                 count++;
                 
               }

      }
      if(count>0)
      {
      System.out.println(arr[i]+" has occured:"+count);
      }   
       count=0;
   }
   
}
}
