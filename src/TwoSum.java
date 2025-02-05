import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        AnotherSolution.twoSum(new int[]{2,7,11,15}, 9);
    }

    class Solution {
        public static int[] twoSum(int[] nums, int target){

            int reminder;
            int [] solution = new int[2];
            List<Integer> matchers = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                reminder = target - nums[i];
                if (!matchers.contains(reminder)) {
                    matchers.add(nums[i]);
                } else {
                    solution = new int[]{i, matchers.indexOf(reminder)};
                }
            }
            return solution;
        }
    }

    class AnotherSolution {

        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int diff;

            for (int i = 0; i < nums.length; i++) {
                diff = target - nums[i];
                if (!map.containsKey(diff)) {
                    map.put(nums[i], i);
                } else {
                    return new int[]{map.get(diff), i};
                }
            }
            return new int[]{};
        }
    }
}
