import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();  
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;  
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int c = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    c++;
                } 
                longest = Math.max(longest, c);
            }
        } 
        return longest;
    }
}