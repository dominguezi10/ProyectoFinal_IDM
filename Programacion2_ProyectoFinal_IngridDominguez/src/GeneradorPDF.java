/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;

public class GeneradorPDF implements Serializable {
     private static final long SerialVersionUID = 777L;
    // private File archivo = null;
    public GeneradorPDF() {
    }

    public void CrearPDF(Component panel, String path, String titulo) {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));

            document.open();
            document.add(new Paragraph(titulo + "\n"));

            PdfContentByte cb = writer.getDirectContent();

            cb.saveState();
            Graphics2D g2 = cb.createGraphicsShapes(650, 770);

            Shape oldClip = g2.getClip();

            g2.clipRect(0, 0, 650, 770);

            panel.print(g2);
            g2.setClip(oldClip);

            //g2.rotate(180);
            g2.dispose();
            cb.restoreState();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        document.close();
    }// fin del metodo

}// fin de la clase
