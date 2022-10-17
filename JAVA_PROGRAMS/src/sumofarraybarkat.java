import java.util.Scanner;

public class sumofarraybarkat {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i]= sc.nextInt();
			
		}
		int sum = 0;
		for(int i=0; i<n;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		
		

	}

}
