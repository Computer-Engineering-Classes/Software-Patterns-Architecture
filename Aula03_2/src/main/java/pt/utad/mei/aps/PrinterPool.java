package pt.utad.mei.aps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrinterPool extends Pool<Printer> {
    public PrinterPool(int size) {
        super(size);
    }

    @Override
    public Printer get() {
        Printer printer = null;
        try {
            printer = this.objects.take();
        } catch (InterruptedException e) {
            Logger.getLogger(PrinterPool.class.getName()).log(Level.SEVERE, null, e);
        }
        return printer;
    }

    @Override
    public void release(Printer printer) {
        if (printer == null) {
            throw new NullPointerException("Null printer???");
        }
        var result = this.objects.offer(printer);
        if (!result) {
            System.err.println("Error: too many printers!");
        }
    }

    @Override
    protected void addObject() {
        this.objects.add(new Printer("Epson WF-2630WF"));
    }

    public void ListPrinters() {
        System.out.println("Available printers:");
        for (var printer : this.objects) {
            System.out.println("\t" + printer);
        }
    }
}
