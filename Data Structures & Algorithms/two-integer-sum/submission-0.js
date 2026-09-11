class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const map = new Map();

        for (let i = 0; i < nums.length; i++) {
            map.set(nums[i], i);
        }

        for (let i = 0; i < nums.length; i++) {
            let difference = target - nums[i];

            if (map.has(difference) && map.get(difference) !== i) {
                let res = [];
                res[0] = i;
                res[1] = map.get(difference);
                return res.sort((a, b) => a - b);
            }
        }
        return [0, 0]
    }
}