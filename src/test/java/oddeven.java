import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		if(s%2==0) {
			System.out.println("even number");
			
		}
		else
		{
			System.out.println("odd number");
		}

		
	}

}