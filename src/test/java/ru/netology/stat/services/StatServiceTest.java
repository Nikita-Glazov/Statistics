package ru.netology.stat.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatServiceTest {
    long[] sales = {12, 34, 10, 40, 100, 87, 40, 76, 65, 23, 55, 12};

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TotalOfAllSales.csv")

    public void testTotalOfAllSales(long expected) {
        StatService service = new StatService();
        long actual = service.totalOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/AverageAmountOfSalesPerMonth.csv")
    public void testAverageAmountOfSalesPerMonth(int expected) {
        StatService service = new StatService();
        long actual = service.averageAmountOfSalesPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/PeakSales.csv")
    public void testPeakSales(int expected) {
        StatService service = new StatService();
        long actual = service.PeakSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/minSales.csv")
    public void testMinSales(long expected) {
        StatService service = new StatService();
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/salesBelowAverage.csv")
    public void testSalesBelowAverage(int expected) {
        StatService service = new StatService();
        long actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/salesAboveAverage.csv")
    public void testSalesAboveAverage(int expected) {
        StatService service = new StatService();
        long actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }


}
