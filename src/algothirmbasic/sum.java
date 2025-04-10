package algothirmbasic;
import java.util.Scanner;

public class sum {
	public static int sume(int n) {
		return n*(n+1)/2;
	}
	
	public static int Recu(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+Recu(n-1);
		}
	}
	
	public static int loop(int n) {
		int suml = 0;
		for (int i =1 ; i<=n ; i++) {
			suml = suml +i;
		} return suml;
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri n:");
		int n = sc.nextInt();
		System.out.println("tinh gia tri cua tong :"+ sume(n)  );
		System.out.println("tinh gia tri cua tong kieu de quy :"+ Recu(n)  );
		System.out.println("tinh gia tri cua tong kieu vong lap :"+ loop(n)  );
		sc.close();
	}
}
