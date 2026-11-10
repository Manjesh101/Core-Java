import java.util.Scanner;

class MAN{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); // how take input in java 

        System.out.print("Enter first number: "); 
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));

        sc.close();
    }
}
