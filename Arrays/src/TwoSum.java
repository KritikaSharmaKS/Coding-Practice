import java.util.*;
public class TwoSum {

	
	static int[] twoSum(int[] nums, int target) { //2 7 11 5 => 9
		int [] result = new int[2]; boolean match = false;
		for(int i = 0; i < nums.length; i++) {
			int secondNum = target - nums[i];
			for(int j = i + 1; j < nums.length; j++) {
				if(secondNum == nums[j]) {
					result[1] = j;
					match = true;
					break;
				}
			}
			if(match) {
				result[0] = i;
				break;
			}
			
		} 
		return result;
	}
	
	public static void main(String[] args) {
		int [] numArray = {2, 7, 11, 5};
		int [] returnValue = TwoSum.twoSum(numArray, 9);
		for(int i = 0; i < returnValue.length; i++) {
			System.out.println(returnValue[i]);
		}
	}

}
