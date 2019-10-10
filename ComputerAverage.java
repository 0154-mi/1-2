import java.util.Scanner;
public class ComputerAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter three number: ");
		double numbers1=input.nextDouble();
		double numbers2=input.nextDouble();
		double numbers3=input.nextDouble();
		double average=(numbers1+numbers2+numbers3)/3;
		System.out.println("The average of radius "+numbers1+" "+numbers2+" "+numbers3+" is "+average);
	}
}
