package ru.netology.stat.services;

public class StatService {
    public long totalOfAllSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales = allSales + sale;
        }
        return allSales;
    }

    public long averageAmountOfSalesPerMonth(long[] sales) {
        long averageSales = totalOfAllSales(sales) / 12;
        return averageSales;
    }

    public int PeakSales(long[] sales) {
        int PeakMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[PeakMonth]) {
                PeakMonth = month;
            }
            month = month + 1;
        }
        return PeakMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int monthBelowAverage = 0;
        long averageSales = averageAmountOfSalesPerMonth(sales);
        for (long sale : sales) {
            if (sale <= averageSales) {
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public int salesAboveAverage(long[] sales) {
        int monthAboveAverage = 0;
        long averageSales = averageAmountOfSalesPerMonth(sales);
        for (long sale : sales) {
            if (sale >= averageSales) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }

}
