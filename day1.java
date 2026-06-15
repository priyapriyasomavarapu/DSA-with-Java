import java.util.*;
class day1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the number:");
           int a=obj.nextInt();
           if((a&1)==0)
           {
              System.out.println("even");
           }
           else
           {
             System.out.println("odd");
           }
        }
    }
}