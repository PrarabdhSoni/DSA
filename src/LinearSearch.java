public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {23, 34, 56, 78, 89, -100, 553,554};
        System.out.println(linearSearch(arr, 56));
        System.out.println(linearSearch(arr, 28));
    }

    static boolean linearSearch(int[] arr, int target){

        if (arr.length ==0 ){
            return false;
        }

        for (int element : arr) {

            if (element == target) {
                return true;
            }

        }

        return false;
    }
}
