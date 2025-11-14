import java.util.*;
class difference_of_two_arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int x : nums1) {
            s1.add(x);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int x : nums2) {
            s2.add(x);
        }

        List<Integer> list1 = new ArrayList<>();
        for (int x : s1) {
            if (!s2.contains(x)) {
                list1.add(x);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int x : s2) {
            if (!s1.contains(x)) {
                list2.add(x);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
