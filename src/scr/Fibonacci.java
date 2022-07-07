package scr;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=1;
		int num2=1;
		int count=1;
		int temp=0;
		System.out.print("1 1 ");
		while(count<=10) {
			temp=num1;
			num1=num2;
			num2+=temp;
			System.out.print(num2 + " ");
			count +=1;
		}
	}

}
