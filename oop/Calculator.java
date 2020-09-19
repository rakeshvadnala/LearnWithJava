import java.util.Scanner;
public class Calculator{
	int n1,n2;
	public void getUserInput(){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter first Int: ");
		n1=inp.nextInt();
		System.out.print("Enter Second Int: ");
		n2=inp.nextInt();
	}
	public void Add(){
		System.out.printf("The Addition is %d \n",n1+n2);
	}
	public void Sub(){
		System.out.printf("The Substraction is %d \n",n1-n2);
	}
	public void Mul(){
		System.out.printf("The Multiplication is %d \n",n1*n2);
	}
	public void Div(){
		System.out.printf("The Division is %d \n",n1/n2);
	}
	
}