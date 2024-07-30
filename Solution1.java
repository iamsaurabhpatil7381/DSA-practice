import java.util.*;

class Solution1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int n = 5;
        int s = 12;
        System.out.println(subarraySum(arr, n, s));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s) {
                    list.add(i + 1); // +1 for 1-based index
                    list.add(j + 1); // +1 for 1-based index
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
}
