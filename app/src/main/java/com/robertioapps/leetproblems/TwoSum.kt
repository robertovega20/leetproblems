package com.robertioapps.leetproblems

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

fun main() {
    val tests = arrayOf(intArrayOf(2, 7, 11, 15), intArrayOf(3, 2, 4), intArrayOf(3, 3))
    val targets = listOf(9, 6, 6)
    tests.forEachIndexed { index, item ->
        println(twoSum(item, targets[index]).toList().toString())
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { index1, element1 ->
        nums.forEachIndexed { index2, element2 ->
            if (nums[index1] + element2 == target && index1 != index2) return intArrayOf(
                index1,
                index2
            )
        }
    }
    return intArrayOf()
}