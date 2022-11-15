package BJ_2798;

import java.util.*;

public class bj_2798 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int max = scn.nextInt();
		int newMax;
		int times = 3;
		
		int[] arr = new int [num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		
		Arrays.sort(arr);
				
		for(int i = num - 1; i > 0; i--) {
			if(times != 0) {
				if( newMax >= max) {
					continue;
				}else {
					newMax += arr[i];
					times--;
				}
			} break;
		}
		
		System.out.println(newMax - max);
	}

}
