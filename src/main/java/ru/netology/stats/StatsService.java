package ru.netology.stats;

public class StatsService {

    public long sumOfAllSales(long[] sales) {  // 1. сумма всех продаж
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }


    public long averageSumSales(long[] sales) {  // 2. средняя сумма продаж в месяц
        long total = 0;
        int months = 12;
        for (long sale : sales) {
            total = total + sale;
        }
        long averageSum = total / months;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        int averageSales = 15; // средняя сумма продаж в месяц
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxAverageSales(long[] sales) {
        int averageSales = 15; // средняя сумма продаж в месяц
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

}