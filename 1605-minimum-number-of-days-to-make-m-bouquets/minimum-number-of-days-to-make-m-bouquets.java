class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers
        if ((long) bloomDay.length < (long) m * k) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        int low = minDay;
        int high = maxDay;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    boolean possible(int[] arr, int mid, int m, int k) {

        int count = 0;
        int totalBouquets = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= mid) {
                count++;
            } else {
                totalBouquets += count / k;
                count = 0;
            }
        }

        // Handle flowers at the end
        totalBouquets += count / k;

        return totalBouquets >= m;
    }
}