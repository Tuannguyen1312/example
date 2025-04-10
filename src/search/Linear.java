package search;

import java.util.Scanner;


public class Linear {
	//khai báo 1 mảng số nguyên nhập từ bàn phím 
	// viết thuật toán tìm tuyến tính để tìm một phần tử mảng 
	
	
	public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Trả về vị trí tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhập số phần tử mảng: ");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		 // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Nhập phần tử cần tìm
        System.out.print("Nhập phần tử cần tìm: ");
        int x = sc.nextInt();

        // Gọi hàm tìm kiếm tuyến tính
        int index = linearSearch(arr, x);

        // In kết quả
        if (index != -1) {
            System.out.println("Phần tử " + x + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Phần tử " + x + " không có trong mảng.");
        }
		sc.close();
	}
	
}
