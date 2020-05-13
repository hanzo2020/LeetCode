package pers.cb;
/*
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/container-with-most-water
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No11 {

	public static void main(String[] args) {
		No11 eleven = new No11();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(eleven.maxArea(height));

	}
	public static int min(int i,int j){
		if(i > j){
			return j;
		}else{
			return i;
		}
	}
	//双指针妙啊
	public int maxArea(int[] height){
		int i = 0;
		int j = height.length - 1;
		int maxArea = 0;
		while(i < j){
			if(min(height[i],height[j]) * (j - i) > maxArea){
				maxArea = min(height[i],height[j]) * (j - i);
			}
			if(height[i] < height[j]){
				i++;
			}else{
				j--;
			}
		}
		return maxArea;
	}
//	public int maxArea(int[] height) {
//		int maxArea = 0;
//		for (int i = 0; i < height.length; i++) {
//			for (int j = i + 1; j < height.length; j++) {
//				if(min(height[i], height[j]) * (j - i) > maxArea){
//					maxArea = min(height[i], height[j]) * (j - i);
//				}
//			}
//		}
//		return maxArea;
//    }

}
