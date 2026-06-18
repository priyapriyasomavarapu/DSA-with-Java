/*Array*/
/* array elements---
/*import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        for(int i=0;i<=a.length;i++)
        {
             System.out.println(a[i]);
        }
    }
}*/
/* sum of the array---
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
             System.out.println(a[i]);
             sum=sum+a[i];
        }
        System.out.println(sum);
    }
}*/
/*largest value of the array
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
               max=a[i];
            }
            System.out.println(a[i]);
        }
    }
}*/
/* sum--import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
             System.out.println(a[i]);
             sum=sum+a[i];
        }
        System.out.println(sum);
    }
}*/
/*import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}*/
/*import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int min=a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            if(min>a[i])
            {
               min=a[i];
            }
            System.out.println(a[i]);
        }
    }
}*/
/*second largest
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=a[0];
            int scmax=a[0];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>max)
                {
                  scmax=max;
                  max=a[i];
                }
                else
                {
                    scmax=a[i];
                }
            }
            System.out.println(scmax);

    }
}*/
/*third largest
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=a[0];
            int thmax=a[0];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>max)
                {
                  thmax=max;
                  max=a[i];
                }
                else
                {
                    thmax=a[i];
                }
            }
            System.out.println(thmax);

    }
}*/
/*rotation of the array left rotation*/
/*import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res[]=new int[n];
        int arr[]=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]+"");
        }
        System.out.println("enter the kth position");
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<n;i++)
        {
            res[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
          System.out.println(res[i]+"");
        }
    }
}*/
/*right rotation
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res[]=new int[n];
        int arr[]=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]+"");
        }
        System.out.println("enter the kth position");
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<n;i++)
        {
            res[i]=arr[(i+k)%n];
        }
        for(int i=0;i<n;i++)
        {
          System.out.println(res[i]+"");
        }
    }
}*/
/*moving zeros
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        int arr[]={1,4,0,0,4};
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length)
        {
                arr[index++]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i]+" ");
        }
        
    }
}*/
/*subarray
import java.util.Scanner;
class Day4
{
    public static void main(String args[])
    {
        int arr={1,2,3};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[j]==sum+arr[i])
                 {
                     return new Int[] {i,j};
                 }
             }
        }
        return new Int[] {};
    }
}*/