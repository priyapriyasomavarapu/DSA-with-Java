Basic java program 
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

variable and data types 
public class Variables {
    public static void main(String[] args) {
        int age = 20;
        double salary = 50000.50;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "John";

        System.out.println(name);
    }
}

operators
int a = 10;
int b = 5;

System.out.println(a + b); // Addition
System.out.println(a - b); // Subtraction
System.out.println(a * b); // Multiplication
System.out.println(a / b); // Division

control statements
if statement 
int age = 18;

if (age >= 18) {
    System.out.println("Adult");
}


if else 
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

Loop
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

while loop
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
