import java.util.*;

public class ThreePointer{
 	public static void main(String[] args){
		int[] a = {1,2,0,0,0,1,0,0,1,0,0,2,0,2,0,2,2,2};
		sort(a);

		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a){
		if(a == null || a.length <2) return;

		int l=0;
		int m=0;
		int r=a.length-1;

		while(m<=r){
			if(a[m]==0){
				swap(a,l,m);
				l++;
				m++;
			}else if(a[m]==1){
				m++;
			}else if(a[m]==2){
				swap(a,r,m);
				r--;
			}
		}
	}

	public static void swap(int[] a, int l,int r){
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}








}

