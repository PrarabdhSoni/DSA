public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {23, 34, 56, 78, 89, -100, 553,554};
        System.out.println(linearSearch(arr, 56));
        System.out.println(linearSearch(arr, 28));
    }

    static int linearSearch(int[] arr, int target){

        if (arr.length ==0 ){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){

            int element = arr[index];

            if (element == target){
                return index;
            }

        }

        return -1;
    }
}
