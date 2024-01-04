package day1013;

public class tableMultiplication {
    public static void main(String[] args) {
        // 乘法表的大小
        int size = 9;
        int i = 1;

        // 使用 while 循环输出九九乘法表
        while (i <= size) {
            int j = 1;
            while (j <= i) {
                // 使用占位符进行格式化输出保证对齐
                System.out.printf("%d * %d = %d\t", j, i, i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}