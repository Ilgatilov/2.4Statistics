package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumOfAllSales() {
        StatsService service = new StatsService();

        long actual = service.sumOfAllSales(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumSales() {
        StatsService service = new StatsService();

        long actual = service.averageSumSales(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinAverageSales() {
        StatsService service = new StatsService();

        long actual = service.minAverageSales(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverageSales() {
        StatsService service = new StatsService();

        long actual = service.maxAverageSales(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

}
