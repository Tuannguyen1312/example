package test;
import java.util.Scanner;




public class stack {
	
	
	public static void BubbleSort(int[] a) {
		int i ;
		int j ;
		
		int n = a.length;
		for(i=0;i < n - 1 ; i++ ) {
			for(j= n - 1 ; j > i ; j--) {
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j-1]= a[j];
					a[j-1]= temp;
					
					
				}
						
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
/*		int n = sc.nextInt() ;
		int [] a = new int[n];
		for (int i = 0; i < n-1 ; i++) {
			a[i]=sc.nextInt();
		}
		*/
		
		 // khởi tạo và cấp phát bộ nhớ cho mảng
		int n = sc.nextInt() ;
	    int a[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        a[i] = sc.nextInt();
	    }
	         
	    // Hiển thị mảng vừa nhập
	    System.out.println("Mảng ban đầu: ");
	    for (int i = 0; i < n-1; i++) {
	        System.out.print(a[i]);
	    }
	    
	BubbleSort(a);
		
		System.out.println("Mảng sau khi sắp xếp:" + a );
		//for(int i = 0 , i < n , i++) {
	//		System.out.println(a[i] +"");
	//	}
        
           
        
		 
		 sc.close();
		
		
	}
}

	
	

