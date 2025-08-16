public class day2 {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1; 
        int total = n * (n + 1) / 2;  

        int sum = 0;
        for (int num : arr) {
            sum =sum+ num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissing(arr));  
    }
}
