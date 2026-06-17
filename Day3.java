/*pattern
import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int col=0;col<=num;col++)
        {
            for(int row=0;row<=num;row++)
            {
                System.out.print("1");
            }
            System.out.println();
        }

    }
}*/
/*reverse of a string
import java.util.*;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="hello";
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}*/
/*import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums=1;
        for(int col=0;col<=num;col++)
        {
            for(int row=0;row<=num;row++)
            {
                System.out.print(nums+" ");
                nums++;
            }
            System.out.println();
        }
    }
}*/
/*right angle triangle
import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums=1;
        for(int col=0;col<num;col++)
        {
            for(int row=0;row<=col;row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums=1;
        for(int col=0;col<=num;col++)
        {
            for(int row=0;row<=col;row++)
            {
                System.out.print(nums +" ");
            }
            System.out.println();
        }
    }
}*/
/*import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int col=0;col<=num;col++)
        {
            for(int row=1;row<=col;row++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}*/
/*import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch='A';
        {
            for(int col=0;col<=num;col++)
            {
                ch='A';
                for(int row=0;row<=col;row++)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
            }
        }
    }
}*/
/*import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch='A';
        for(int col=1;col<=num;col++)
        {
            ch='A';
            for(int row=1;row<=num-col;row++)
            {
               
                System.out.print(" ");
            }
             for(int row=1;row<=2*col-1;row++)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
           
        }
         for(int col=num;col>=1;col--)
            {
                ch='A';
                  for(int row=1;row<=num-col;row++)
            {
               
                System.out.println();
            }

                for(int row=1;row<=num-col;row++)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
            }
    }
}*/
import java.util.Scanner;
class Day3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int col=1;col<=num;col++)
        {
            for(int row=1;row<=num-col;row++)
            {
                System.out.print("");
            }
            for(int row=1;row<=2*col-1;row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int col=num;col>=1;col--)
        {
        for(int row=1;row<=num-col;row++)
        {
            System.out.print("");
        }
        for(int row=1;row<=2*col-1;row++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    

}