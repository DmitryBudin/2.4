package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesAmount() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(months);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmount(months);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesMonth(months);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesMonth(months);
        assertEquals(expected, actual);
    }

    @Test
    void lowerMiddle() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowerMiddle(months);
        assertEquals(expected, actual);

    }

    @Test
    void upperMiddleMiddle() {
        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upperMiddle(months);
        assertEquals(expected, actual);

    }
}


