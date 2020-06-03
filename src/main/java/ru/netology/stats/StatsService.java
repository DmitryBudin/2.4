package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] months) {
        long sum = 0;
        for (long month : months) {
            sum = sum + month;
        }

        return sum;
    }

    public long averageAmount(long[] months) {
        long sum = salesAmount(months);
        long average = sum / 12;
        return average;


    }

    public long maxSalesMonth(long[] months) {
        long count = 0;
        long maxSales = 0;
        long currentMonth = months[0];
        for (long month : months) {
            count++;
            if (currentMonth <= month) {
                currentMonth = month;
                maxSales = count;

            }
        }

        return maxSales;
    }

    public long minSalesMonth(long[] months) {
        long count = 0;
        long minSales = 0;
        long currentMonth = months[0];
        for (long month : months) {
            count++;
            if (month <= currentMonth) {
                currentMonth = month;
                minSales = count;
            }
        }
        return minSales;
    }

    public long lowerMiddle(long[] months) {
        long count = 0;
        long average = averageAmount(months);
        for (long month : months) {
            if (average > month) {
                count++;
            }

        }
        return count;
    }

    public long upperMiddle(long[] months) {
        long count = 0;
        long average = averageAmount(months);
        for (long month : months) {
            if (average < month) {
                count++;
            }

        }
        return count;
    }
}