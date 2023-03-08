package com.array;

public class MajorityElement {

	
	public static void main(String[] args) {
		
		int a[]= {2,3,3,3,1,5,3,3};
		int count;
		int maxCount=-1;
		
		for(int i=0;i<a.length;i++) {
			count = 1;
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>a.length/2) {
				maxCount=a[i];
				break;
			}
			System.out.println(maxCount);
		}
		System.out.println(maxCount);
	}
	
}
