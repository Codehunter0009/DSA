class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();

        // Map will store:
        // element -> its next greater element
        //
        // Example:
        // 1 -> 3
        // 3 -> 4
        // 4 -> -1
        Map<Integer, Integer> map = new HashMap<>();


        // Traverse nums2 from RIGHT to LEFT
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove all elements that are smaller than
            // or equal to the current element.
            //
            // They can NEVER be the next greater element
            // for nums2[i].
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }


            // After removing smaller/equal elements:
            //
            // If stack is empty, there is no greater element
            // on the right side.
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            }

            // Otherwise, the element at the top of the stack
            // is the nearest greater element.
            else {
                map.put(nums2[i], stack.peek());
            }


            // Now push the CURRENT element into the stack.
            //
            // It can potentially be the next greater element
            // for elements that come before it.
            stack.push(nums2[i]);
        }


        // nums1 contains the elements for which we actually
        // need to find the next greater element.
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            // Look up the answer directly from the map.
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}