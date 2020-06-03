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
        long sum = 0;
        for (long month : months) {
            sum = sum + month;
        }
        long average = sum / 12;
        return average;


    }

    public long maxSalesMonth(long[] months) {
        long count = 0;
        long maxMonth = 0;
        long max = months[0];
        for (long month : months) {
            count++;
            if (max <= month) {
                max = month;
                maxMonth = count;
            }

        }

        return maxMonth;
    }

    public long minSalesMonth(long[] months) {
        long count = 0;
        long minMonth = 0;
        long max = months[0];
        for (long month : months) {
            count++;
            if (month <= max) {
                max = month;
                minMonth = count;
            }
        }


        return minMonth;
    }

    public long lowerMiddle(long[] months) {
        long sum = 0;
        long count = 0;
        for (long month : months) {
            sum = sum + month;
        }
        long average = sum / 12;
        for (long month : months) {
            if (average > month) {
                count++;
            }

        }


        return count;
    }

    public long upperMiddle(long[] months) {
        long sum = 0;
        long count = 0;
        for (long month : months) {
            sum = sum + month;
        }
        long average = sum / 12;
        for (long month : months) {
            if (average < month) {
                count++;
            }

        }


        return count;
    }
}