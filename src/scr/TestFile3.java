package scr;
import java.util.Scanner;
public class TestFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("������洢����");
		int n=input.nextInt();
		double[] numbers=new double[n];
		double sum=0;
		System.out.println("������洢����");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextDouble();
			sum+=numbers[i];
		}
		double avg=sum/n;
		System.out.println("ƽ��ֵΪ��"+avg);
		System.out.println("����ƽ��ֵ"+avg+"��Ԫ���У�");
		for (int i=0;i<n;i++) {
			if(numbers[i]>avg) {
				System.out.println(numbers[i]);
			}
		}
	}

}
