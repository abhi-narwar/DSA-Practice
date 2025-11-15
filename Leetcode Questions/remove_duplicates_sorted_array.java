import java.util.ArrayList;

class remove_duplicates_sorted_array {
    ArrayList<Integer> remove_duplicate(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]); 

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j - 1]) {
                result.add(arr[j]);
            }
        }
        return result;
    }
}
