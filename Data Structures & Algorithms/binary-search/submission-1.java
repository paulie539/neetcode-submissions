class Solution {
public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length;  // note: right is one past the last index

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;  // found the target, return immediately
        } else if (nums[mid] < target) {
            left = mid + 1;  // search right half
        } else {
            right = mid;     // search left half, mid excluded
        }
    }

    return -1;  // not found
}
}
