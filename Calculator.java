import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double n1 = inp.nextDouble();
        double n2 = inp.nextDouble();

        System.out.println("Choose an option \n1.Addition\n2.Substraction\n3.Multiplication\n4.Division: ");
		System.out.print("\n");
        int operator = inp.nextInt();
        double result;
        switch(operator)
        {
            case 1:
                result = n1 + n2; System.out.print("\n");
				System.out.println(n1+" + "+n2+" = "+result);
                break;
            case 2:
                result = n1 - n2; System.out.print("\n");
				System.out.println(n1+" - "+n2+" = "+result);
                break;
            case 3:
                result = n1 * n2; System.out.print("\n");
				System.out.println(n1+" * "+n2+" = "+result);
                break;
            case 4:
                result = n1 / n2; System.out.print("\n");
				System.out.println(n1+" / "+n2+" = "+result);
                break;
            default:
                System.out.print("Incorrection Choice");
                return;
        }
			System.out.print("\n");
	        System.out.println("Thank you!");
    }
}
