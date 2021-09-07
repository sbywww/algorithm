import java.util.HashMap;
import java.util.Map;

public class mark_TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        print(result);
    }

    public static void print(int[] result) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int j : result) {
            builder.append(j);
            builder.append(",");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        System.out.println(builder);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
