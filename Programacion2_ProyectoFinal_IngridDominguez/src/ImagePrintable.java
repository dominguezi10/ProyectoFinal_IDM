
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.Serializable;

public class ImagePrintable implements Printable, Serializable {
    private static final long SerialVersionUID = 777L;
    private final double x, y, width;
    private final int orientation;
    private final BufferedImage image;

    ImagePrintable(PrinterJob printJob, BufferedImage image) {
        PageFormat pageFormat = printJob.defaultPage();
        this.x = pageFormat.getImageableX();
        this.y = pageFormat.getImageableY();
        this.width = pageFormat.getImageableWidth();
        this.orientation = pageFormat.getOrientation();
        this.image = image;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            int pWidth;
            int pHeight;
            if (orientation == PageFormat.PORTRAIT) {
                pWidth = (int) Math.min(width, image.getWidth());
                pHeight = pWidth * image.getHeight() / image.getWidth();
            } else {
                pHeight = (int) Math.min(width, image.getHeight());
                pWidth = pHeight * image.getWidth() / image.getHeight();
            }
            graphics.drawImage(image, (int) x, (int) y, pWidth, pHeight, null);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

}
