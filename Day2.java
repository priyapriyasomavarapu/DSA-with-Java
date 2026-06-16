/*import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean opposite=((a^b)<0);
        System.out.println(opposite);
    }

}*/
/*import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }  
        System.out.println("fact");

    }
}*/
/*Spy number:
check if the sum of digits equal to product of digits fora given number.print all spy number up to N
import java.util.*;
class Day2
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,product=1;
        while(a>0)
        {
            int num=a%10;
            sum+=num;
            product*=num;
            a=a/10;
        }
        if(sum==product)
        {
            System.out.println("spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    } 
}*/
/* A number is magic if recursivelysumming its digits yields 1.check if N is a magic number or not
import java.util.*;
class Day2
{
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
              int num=n%10;
              sum+=num;
              n=n/10;
            }
        }
        n=sum;
        if(n==1)
        {
            System.out.println("magic number");
        }
        else{
            System.out.println("not a magic number");
        }
    
      }
}*/
/*Happy number
import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n>9)
        {
            int sum=0;
    
           while(n>0)
           {
             int digit=n%10;
            sum+=digit;
            n=n/10;
          }
          n=sum;
        }
        if(n==1)
        {
            System.out.println("happy number");
        }
        else{
            System.out.println("not a happy number");
        }
    }
}*/
/*perfect number
import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}*/
/*swap of a number
import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}*/
/*import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("reverse number"+rev);
    }
}*/
/*import java.util.*;
class Day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}*/
import java.util.*;








