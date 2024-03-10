public class LunZhuan {
    public static void main(String[] args) {

    }

}

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        if (k == 0) {
            return;
        }
        int temp = nums[size - 1];
        changeNums(nums, temp, size);
        k--;
        rotate(nums, k);

    }

    public void changeNums(int[] nums, int temp, int size) {
        for (int i = 1; i < size; i++) {
            nums[size - i] = nums[size - 1 - i];
        }
        nums[0] = temp;
    }
}