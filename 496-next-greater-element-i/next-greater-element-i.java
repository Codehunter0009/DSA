import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack stores elements from nums2.
        // We use it to find the next greater element.
        Stack<Integer> st = new Stack<>();

        // Map stores:
        // element -> next greater element
        Map<Integer, Integer> map = new HashMap<>();


        // Traverse nums2 from RIGHT to LEFT
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove elements that are smaller than
            // or equal to the current element.
            //
            // They cannot be the next greater element.
            while (!st.isEmpty() && st.peek() <= nums2[i])
                st.pop();


            // If stack is empty:
            //     no greater element exists -> -1
            //
            // Otherwise:
            //     stack.peek() is the next greater element.
            map.put(nums2[i],
                   st.isEmpty() ? -1 : st.peek());


            // Push current element into the stack.
            // It may be the next greater element
            // for an element to its LEFT.
            st.push(nums2[i]);
        }


        // Create the final answer array.
        int[] ans = new int[nums1.length];


        // Find the answer for every element in nums1.
        for (int i = 0; i < nums1.length; i++) {

            // Directly get the next greater element
            // from the map.
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}