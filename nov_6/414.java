/*
Third Maximum Number
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
*/

public class Solution {
    public int thirdMax(int[] nums) {
        int f=nums[0], s = Integer.MIN_VALUE, t=Integer.MIN_VALUE;
        
        for(int i=1;i<nums.length;i++) {
            if(nums[i] > f) {t=s; s=f; f = nums[i];}
            else if(nums[i] > s) {t=s; s = nums[i];}
            else if(nums[i] > t) t = nums[i];    
        }
        if(t == Integer.MIN_VALUE) return f;
        return t;    
    }
}

