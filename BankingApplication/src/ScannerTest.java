import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		//int a = sc.nextInt();
		
		char c = sc.next().charAt(0);
		System.out.println("value = "+c);
		
		
		
	}

}
