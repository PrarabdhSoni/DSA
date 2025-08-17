package BinarySearchQuestions;

public class FloorNumber {

    public static void main(String[] args) {

        int[] num = {2, 4, 5, 10, 20, 45, 100};
        System.out.println(floorNumber(num,45));
        System.out.println(floorNumber(num,1));
    }

    public static int floorNumber(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        if(target < num[0]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (num[mid] == target) {
                return num[mid];
            } else if (num[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return num[end];
    }
}
