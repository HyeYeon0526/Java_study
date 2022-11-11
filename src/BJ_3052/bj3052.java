package BJ_3052;
import java.util.*;
public class bj3052 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int [10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = scn.nextInt() % 42;
		}
		
		for (int i = 0 ; i < 10; i++) {
			for(int j = i+1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
