import ru.netology.stat.services.StatService;

public class Main {
    public static void main(String[] args) {
        StatService service = new StatService();
        long[] sales = {12, 34, 10, 40, 100, 87, 40, 76, 65, 23, 55, 12};

        System.out.println(service.totalOfAllSales(sales));
        System.out.println(service.averageAmountOfSalesPerMonth(sales));
        System.out.println(service.PeakSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.salesBelowAverage(sales));
        System.out.println(service.salesAboveAverage(sales));
    }
}
