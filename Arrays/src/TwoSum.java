import java.util.*;
import java.util.stream.Collectors;
public class TwoSum {

	
	static int[] twoSum(int[] nums, int target) { //2 7 11 5 => 9
		//Most Efficient solution
		Map<Integer, Integer> arrayMap = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int secondNum = target - nums[i];
			if(arrayMap.containsKey(secondNum)) {
				return new int[] {arrayMap.get(secondNum), i};
			}
			arrayMap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
		
		//My First Approach
//		int [] result = new int[2]; boolean match = false;
//		for(int i = 0; i < nums.length; i++) {
//			int secondNum = target - nums[i];
//			for(int j = i + 1; j < nums.length; j++) {
//				if(secondNum == nums[j]) {
//					result[1] = j;
//					match = true;
//					break;
//				}
//			}
//			if(match) {
//				result[0] = i;
//				break;
//			}
//			
//		} 
//		return result;
		
		//Bad approach
//		int [] result = new int[2]; 
//		for(int i = 0; i < nums.length; i++) {
//			int secondNum = target - nums[i];
//			int indexOfSecondNum = Arrays.stream(nums).boxed().collect(Collectors.toList()).lastIndexOf(secondNum);
//			if((indexOfSecondNum != -1) && (indexOfSecondNum != i)) {
//				result[0] = i;
//				result[1] = indexOfSecondNum;
//				break;
//			}
//		}
//		return result;
	}
	
	public static void main(String[] args) {
		int [] numArray = {3, 2, 4};
		int [] returnValue = TwoSum.twoSum(numArray, 6);
		for(int i = 0; i < returnValue.length; i++) {
			System.out.println(returnValue[i]);
		}
	}

}
