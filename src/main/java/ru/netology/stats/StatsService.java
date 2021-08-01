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

    public int maxSales(long[] sales) { // 3. номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
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

    public int minSales(long[] sales) { // 4. номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
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

    public int minAverageSales(long[] sales) { // 5. кол-во месяцев, в которых продажи были ниже среднего
        int averageSales = 15; // средняя сумма продаж в месяц
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxAverageSales(long[] sales) { // 6. кол-во месяцев, в которых продажи были выше среднего
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