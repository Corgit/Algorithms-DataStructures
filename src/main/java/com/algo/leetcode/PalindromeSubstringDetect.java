package com.algo.leetcode;

import java.util.List;

/**
 * @Description： 回文字符子串检测，题号1177
 *      判断输入字符串s中经过变换是否可能存在子串是回文字符串，同时输入数组为 queries[[start, end, k], ...]
 *      截取子串为s中的[start, end]部分，子串可以任意重新排列，其中可以选择k个字符替换为任意字符
 *      进过任意排列和k个字符替换后，如果字符为回文字符串，则结果为true，否则为false
 *      对queries数组的每个组合进行探测，返回true/false的结果数组
 * @Author: Ryan_Wuyx
 * @Date: 2023/6/15 15:00
 */
public class PalindromeSubstringDetect {

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        // 思路：stack

        return null;
    }

    // 测试
    public static void main(String[] args) {
        PalindromeSubstringDetect palin = new PalindromeSubstringDetect();
        palin.canMakePaliQueries(null, null);
    }
}
