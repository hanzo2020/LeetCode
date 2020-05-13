package pers.cb;

import java.util.Arrays;

/*
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。

来源：力扣（LeetCode）
 */
public class No16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No16 sixt = new No16();
		int[] nums = {0,1,2};
		System.out.println(sixt.threeSumClosest(nums, 3));
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int diff = Integer.MAX_VALUE;
		int threesum = 0;
		for (int i = 0; i < nums.length; i++) {
			int right = nums.length - 1;
			int left = i + 1;
			while (left < right) {
				int sum = nums[left] + nums[i] + nums[right];
				if (sum < target) {
					// 如果比这个小
					if (target - sum < diff) {
						diff = target - sum;// 判断是否更接近
						threesum = sum;
					}
					// 因为小，所以让他变大点
					left++;
				} else if (sum > target) {
					if (sum - target < diff) {
						diff = sum - target;
						threesum = sum;
					}
					right--;
				} else if (sum == target) {
					return target;
				}
			}
		}
		return threesum;
	}

}
