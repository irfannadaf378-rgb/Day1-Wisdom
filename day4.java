import java.util.*;

public class day4{ 
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int len = m + n;
        int gap = (len / 2) + (len % 2);  

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
              
                if (left < m && right < m) {
                if (arr1[left] > arr1[right]) { 
                        int temp = arr1[left];
                        arr1[left] = arr1[right];
                        arr1[right] = temp;
                    }
                }
                
                else if (left < m && right >= m) {
                    if (arr1[left] > arr2[right - m]) {
                        int temp = arr1[left];
                        arr1[left] = arr2[right - m];
                        arr2[right - m] = temp;
                    }
                }
              
                else {
                    if (arr2[left - m] > arr2[right - m]) {
                        int temp = arr2[left - m];
                        arr2[left - m] = arr2[right - m];
                        arr2[right - m] = temp;
                    }
                }

                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2); 
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int m = arr1.length;
        int n = arr2.length;

        merge(arr1, arr2, m, n);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
