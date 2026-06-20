import java.util.*;
public class basicCalculator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("===Basic Calculator===");;

        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        double total; 
        switch(op){
            case '+':
                total = num1 + num2;
                System.out.println("Result: "+ total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println("Result: "+ total);
                break;
            case '/':
                total = num1 / num2;
                System.out.println("Result: "+ total);
                break;
            case '*':
                total = num1 * num2;
                System.out.println("Result: "+ total);
                break;
            case '%':
                total = num1 % num2;
                System.out.println("Result: "+ total);
                break;  
            default:
                System.out.println("Invalid Operator");      
        }
        sc.close();     
    }
}