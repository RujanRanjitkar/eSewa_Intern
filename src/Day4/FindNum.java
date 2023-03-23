package Day4;

public class FindNum {
    public static int singNum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 1) {
                result=num;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] num = {1, 1, 2, 3, 4, 3, 4};
        System.out.println(singNum(num));
    }
}
