package pers.cb;
/*
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，
 * 判断 nums 中是否存在四个元素 a，b，c 和 d ，
 * 使得 a + b + c + d 的值与 target 相等？
 * 找出所有满足条件且不重复的四元组。
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No18 {

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		System.out.println(fourSum(nums, 0));

	}
	public static int isE(int[] nums,int target,int i,int j,int left,int right){
		if((nums[i] + nums[j] + nums[left] + nums[right]) == target){
			return 0;
		}else if((nums[i] + nums[j] + nums[left] + nums[right]) > target){
			return 1;
		}else{
			return -1;
		}
	}
	/*
	 * 大于返回1，可以直接退出
	 */
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		int l = nums.length;
		if (nums == null || l < 4) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if(i > 0 && nums[i] == nums[i - 1]){
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				int right = nums.length - 1;
				int left = j + 1;
				if(j > i + 1 && nums[j] == nums[j - 1]){
					continue;
				}
				while (left < right) {
					if (isE(nums, target, i, j, left, right) == 0) {
						list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						right--;
						while(right > left && nums[right] == nums[right + 1]){
							right--;
						}
						left++;
						while(left < right && nums[left] == nums[left - 1]){
							left++;
						}
					} else if (isE(nums, target, i, j, left, right) == 1) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		return list;
	}
}
