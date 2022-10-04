package pt.utad.mei.aps;

public class Main {


    public static void main(String[] args) {
        var pool = new PrinterPool(5);
        pool.ListPrinters();

        var printer = pool.get();
        printer.Print();
        pool.ListPrinters();

        var printer2 = pool.get();
        printer2.Print();
        pool.ListPrinters();

        pool.release(printer);
        pool.ListPrinters();
    }
}