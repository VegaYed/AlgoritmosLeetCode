package arrays;

public class Solution {
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 //Encontrar la media de 2 arrays ordenadas
		 //se presume que cada array tiene al menos 1 valor
		int cont=0;
		int co=0;
		double media=0;
		cont=nums1.length+nums2.length;
		int[] arrm = new int[cont];
		for(int i=0;i<nums1.length;i++) {
			arrm[co]=nums1[i];
			co++;
		}
		for(int i=0;i<nums2.length;i++) {
			arrm[co]=nums2[i];
			co++;
		}
		buble(arrm);
		partArr(arrm,nums1,nums2);
		
	    return media=setMedia(nums1,nums2);
	 }

	 public static void buble(int arr[]) {
		int i,j;		
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) { 
					int temp=arr[j];  
					arr[j]=arr[j+1];  
					arr[j+1]=temp;    
				}
			}		
		}
	}
	public static void partArr(int arr[], int nums1[], int nums2[]) {
		int co=0;
		for(int i=0;i<nums1.length;i++) {
			nums1[i]=arr[co];
			co++;
		}
		for(int i=0;i<nums2.length;i++) {
			nums2[i]=arr[co];
			co++;
		}
	}
	
	public static double setMedia(int nums1[], int nums2[]) {
		double media;
		if(nums1.length>nums2.length) {
			media=nums1[nums1.length-1];
		}else if(nums1.length<nums2.length) {
			media=nums2[0];
		}else {
			media=(nums1[nums1.length-1]+nums2[0]);
			media/=2;
		}
		return media;
	}
	 
}