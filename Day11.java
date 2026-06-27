/*import java.util.*;
class Day11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int zeros=0;
        int deno=5;
        while(deno<=num)
        {
            zeros +=(num/deno);
            deno *=5;
        }
        System.out.print(zeros);
        sc.close();
    }
}*/
/*Stack using arrays
import java.util.*;
class Stack
{
    int[] arr;
    int top,capacity;
    public Stack(int size)
    {
        this.arr=new int[size];
        this.top=-1;
        this.capacity=size;
    }
    void push(int element)
    {
        if(this.isFull()) return;
        this.top++;
        this.arr[this.top]=element;
    }
    int pop()
    {
        if(this.isEmpty()) return -1;
        int ele=this.arr[this.top];
        top--;
        return ele;
    }
    int peek()
    {
        if(this.isEmpty()) return -1;
        return this.arr[this.top];
    }
    boolean isFull()
    {
        return this.capacity==this.top+1;
    }
    boolean isEmpty()
    {
        return this.top==-1;
    }
    void display()
    {
        for(int ind=0;ind<=top;ind++)
        {
            System.out.print(arr[ind]+" ");
        }
    }
}
public class Day11
{
    public static void main(String args[])
    {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.pop());
        s.display();

    }
}*/
/*stack using ArrayList
import java.util.*;
class Day11
{
    public static void main(String args[])
    {
        List<Integer> stack=new ArrayList<Integer>();
        stack.add(10);
        stack.add(20);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.remove(stack.size()-1));
        System.out.println(stack);
    }
}*/
/*stack uisng linkedlist
class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack
{
    Node head = null;
    public Stack()
    {
        this.head = null;
    }

    boolean isEmpty()
    {
        return this.head == null;
    }

    void push(int e)
    {
        Node new_node = new Node(e);
        new_node.next = this.head;
        this.head = new_node;
    }
    int pop()
    {
        if(this.isEmpty()) return-1 ;
        Node deletable=this.head;
        this.head=this.head.next;
        deletable.next=null;
        return deletable.data;
    }
    int peek()
    {
        if(this.isEmpty()) return-1 ;
        return this.head.data;
    }
    void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
class Day11
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.pop());
        s.display();
    }
}*/
/*valid paranthesis solution-1
import java.util.*;
class Day11
{
  public static void main(String args[])
  {
    String s="((()))";
    int open_count=0;
    int close_count=0;
    for(char symbol:s.toCharArray())
    {
        if(symbol=='(') open_count++;
        else close_count++;
    }
    System.out.println(open_count);
    System.out.println(close_count);
    System.out.println(open_count==close_count);
  }

}*/
/*valid paranthesis solution-2
import java.util.*;
class Day11
{
  public static void main(String args[])
  {
    String s=")((()))(";
    int brace_count=0;
    
    for(char symbol:s.toCharArray())
    {
        if(symbol=='(') brace_count++;
        else brace_count--;
        if(brace_count<0) break;
    }
    
    System.out.println(brace_count==0);
  }

}*/
/*valid paranthesis solution-3 using switchcase
import java.util.*;
class Day11
{
  public static void main(String args[])
  {
    String s=")((()))(";
    int brace_count=0;
    
    for(char symbol:s.toCharArray())
    {
        switch(symbol){
          case'(' -> brace_count ++; 
          default -> brace_count --;
        }
        if(brace_count<0) break;
    }
    System.out.print(brace_count==0);
  }
}*/
/*valid paranthesis solution-3 using stack
import java.util.*;
class Day11
{
  public static void main(String args[])
  {
    ArrayList<Character> stack=new ArrayList<>();
    boolean flag=false;
    String s="((()))";
    for(char ch:s.toCharArray())
    {
        if(ch=='(') stack.add('(');
        else {
            if(stack.isEmpty())
            {
                flag=true;
                break;
            }
            stack.remove(stack.size()-1);
        }
    }
    if(flag==false && stack.isEmpty())
    System.out.print(true);
    else{
        System.out.print(false);
    }
    
  }
}*/
/*valid paranthesis solution-3 using stack
import java.util.*;
class Day11
{
  public static void main(String args[])
  {
    ArrayList<Character> stack=new ArrayList<>();
    boolean flag=false;
    String s="{[()]}";
    boolean flag=false;
    for(char ch:s.toCharArray())
    {
        if(ch=='[') stack.add(']');
    }
  }
}*/




