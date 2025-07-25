public class BinarySearch {

    public static void main(String[] args) {

        int[] num = {1 ,2 ,3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println( "The index of target element is: "+ binarySearch(num, 3));

    }

    public static int binarySearch(int[] nums , int target){

        int start = 0;
        int end = nums.length -1;
        int mid = 0;

        while(start <= end){

            mid = start + (end - start) /2;

            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid +1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
