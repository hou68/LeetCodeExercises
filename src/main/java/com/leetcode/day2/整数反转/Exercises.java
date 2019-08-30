package com.leetcode.day2.整数反转;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Exercises {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));
        System.out.println(Long.parseLong("021"));
        reverse(-2147483648);
    }
    public static int reverse(int x) {
        long res=0;
        while(x!=0){
            res = res*10+x%10;
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int)res;
    }
    public int reverse2(int x){
        StringBuffer re = new StringBuffer();
        boolean h = x > 0 ? true : false;
        while(x/10 != 0){
            int c = x%10;
            re.append(Math.abs(c));
            x/=10;
        }
        re.append(Math.abs(x));
        long res = Long.parseLong(re.toString());
        res = h?res:-res;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;
        }
        return (int)res;
    }
}
