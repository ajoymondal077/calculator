import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter an operator(+,-,*,/):");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number:");
        double num2 = sc.nextDouble();
        double result =0;
        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2!=0){
                    result = num1 / num2;
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result is:"+result);
        sc.close();
    }
}