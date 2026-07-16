class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        
        // Case where there are only two stones: 
        // The frog must jump directly there and back [5].
        if (n == 2) {
            return stones[1] - stones[0];
        }
        
        int maxAlternateDistance = 0;
        
        // Iterate from the first stone to the third-to-last stone [5].
        // Calculate the distance to the stone at index i + 2 [5].
        for (int i = 0; i <= n - 3; i++) {
            int currentDistance = stones[i + 2] - stones[i];
            
            // Track the maximum distance seen so far [5].
            if (currentDistance > maxAlternateDistance) {
                maxAlternateDistance = currentDistance;
            }
        }
        
        return maxAlternateDistance;
    }
 }