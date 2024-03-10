import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HeBing {
    public static void main(String[] args) {

        int[][] array = new int[][]{{0, 3}, {1, 9}, {2, 5}, {10, 11}, {12, 20}};

        System.out.println(Arrays.deepToString(heBing(array)));

        System.out.println("13"+6);


    }

    //合并区间

    public static int[][] heBing(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0]-o2[0]);
        System.out.println(Arrays.deepToString(intervals));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            int L = interval[0], R = interval[1];
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}
