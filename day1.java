import java.util.*;
import java.lang.*;
class day1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String Binary=" ";
        while(n>0)
        {
            int rem=n%2;
            Binary=rem+Binary;
            n=n/2;
        }
        System.out.println(Binary);
        
    }
}