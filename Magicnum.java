import java.util.*;
class Main{
public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   int n= sc.nextInt();
    while(n>9)
    {
        int sum=0;
        while(n>0)
        { 
           sum= sum+(n%10);
          n=n/10;
         }
         num= sum;
    }
    if(num==1)
    { 
       System.out.println("magic number");
     }
     else
     {
        System.out.println("not a magic number");
      }
}
