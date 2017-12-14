
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.Serializable;

public class PrintActionListener implements Runnable, Serializable {
    private static final long SerialVersionUID = 777L;
    private final BufferedImage image;

    public PrintActionListener(BufferedImage image) {
        this.image = image;
    }

    @Override
    public void run() {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(new ImagePrintable(printJob, image));
        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException prt) {
            }
        }
    }
}
