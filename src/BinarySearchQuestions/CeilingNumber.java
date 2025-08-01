package BinarySearchQuestions;

public class CeilingNumber {

    //Ceiling = smallest element in an array greater or = to target

    public static void main(String[] args) {

        int[] num = {1, 4, 5, 10, 20, 45, 100};
        System.out.println(ceilingNumber(num,45));
        System.out.println(ceilingNumber(num,3));
    }

    public static int ceilingNumber(int[] num, int target){
        int start = 0;
        int end = num.length -1;

        while(start <= end){
            int mid =start + (end - start) /2;

            if(num[mid] == target){
                return num[mid];
            } else if (num[mid] < target) {
                start = mid+1;
            } else{
                end = mid -1;
            }
        }



        return num[start];
    }
}
