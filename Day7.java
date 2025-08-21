
class Day7 {
    public int trap(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int lmax = 0;
        int rmax = 0;
        int water = 0;

        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] > lmax) {
                    lmax = h[l];
                } else {
                    water += lmax - h[l];
                }
                l++;
            } else {
                if (h[r] > rmax) {
                    rmax = h[r];
                } else {
                    water += rmax - h[r];
                }
                r--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Day7 sol = new Day7();
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = sol.trap(arr);
        System.out.println("Trapped Water: " + result);
    }
}
