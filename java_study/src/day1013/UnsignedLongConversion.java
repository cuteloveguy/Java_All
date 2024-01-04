package day1013;

import java.math.BigInteger;

public class UnsignedLongConversion {
    public static void main(String[] args) {
        // 正数
        long signedLong1 = 12345L;
        // 负数
        long signedLong2 = -1L;

        // 转化为无符号数值
        BigInteger unsignedBigInt1 = convertToUnsigned(signedLong1);
        BigInteger unsignedBigInt2 = convertToUnsigned(signedLong2);

        System.out.println("正无符号数值: " + unsignedBigInt1);
        System.out.println("负无符号数值: " + unsignedBigInt2);
    }

    // 将有符号 long 转化为无符号 BigInteger
    public static BigInteger convertToUnsigned(long signedLong) {
        // 如果是正数，直接转化
        if (signedLong >= 0) {
            return BigInteger.valueOf(signedLong);
        } else {
            // 对于负数，使用位运算和 Long.MAX_VALUE 转化为无符号 BigInteger
            return BigInteger.valueOf(signedLong & Long.MAX_VALUE).setBit(63);
        }
    }
}