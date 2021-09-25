/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    const cache = {}

    for(let i = 0; i < nums.length; i++) {
        const selectNum = nums[i];
        if (cache[target - selectNum] !== undefined) {
            return [cache[target - selectNum], i]
        } else {
            cache[selectNum] = i
        }
    }
    return []
};


// TEST CODE
const testValues = [
    {nums: [2,7,11,15], target: 9, result: [0, 1]},
    {nums: [3,2,4], target: 6, result: [1, 2]},
    {nums: [3,3], target: 6, result: [0, 1]},
    {nums: [1,2,3,4,5,6,7,7,8,9,10,3,4,5,2,3,5,2,20], target: 22, result: [1, 18]}
]

function test () {
    for (let {nums, target, result} of testValues) {
        const retValue = twoSum(nums, target);
        const condition = retValue.some((v, idx) => v === result[idx])
        if (condition) {
            console.log('PASSED', nums, target, result, retValue)
        } else {
            console.error('FAILED', nums, target, result, retValue)
        }
    }
}

test()