import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (int num : nums) {
            unique.put(num, unique.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : unique.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
