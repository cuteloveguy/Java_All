package day1013;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 获取上个月的月份
        YearMonth previousMonth = YearMonth.now().minusMonths(1);
        // 将月份转换成中文格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", Locale.CHINESE);
        String chineseMonth = previousMonth.format(formatter);
        // 打印结果
        System.out.println("上个月为:"+chineseMonth);
    }
}