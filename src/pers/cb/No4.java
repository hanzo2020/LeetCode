package pers.cb;
/*
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

你可以假设 nums1 和 nums2 不会同时为空

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No4 {
	public static void main(String[] args) {
		No4 n = new No4();
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(n.findmid(nums1, nums2));
		
	}
	public double findmid(int[] nums1,int[] nums2){
		int m = nums1.length;
		int n = nums2.length;
		int[] arr = new int[m + n];
		int i = 0;
		int head1 = 0;
		int head2 = 0;
		while(head1 != m && head2 != n){
			if(nums1[head1] <= nums2[head2]){
				arr[i] = nums1[head1];
				head1++;
			}else{
				arr[i] = nums2[head2];
				head2++;
			}
			i++;
			
		}
		if(head1 == m){
			while(i < (m + n)){
				arr[i] = nums2[head2];
				head2++;
				i++;
			}
		}else{
			while(i < (m + n)){
				arr[i] = nums1[head1];
				head1++;
				i++;
			}
		}
		int len = 0;
		if(arr.length % 2 == 0){
			len = arr.length / 2;
			return (double)(arr[len] + arr[len - 1]) / 2;
		}else{
			len = (arr.length - 1)/ 2;
			return arr[len];
		}
		

		
		
	}
}
