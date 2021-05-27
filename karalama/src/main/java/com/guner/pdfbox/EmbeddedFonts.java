package com.guner.pdfbox;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

/**
 * An example of using an embedded TrueType font with Unicode text.
 *
 * @author Keiji Suzuki
 * @author John Hewson
 */
public final class EmbeddedFonts
{

    private EmbeddedFonts()
    {
    }

    public static void main(String[] args) throws IOException
    {

        EmbeddedFonts embeddedFonts = new EmbeddedFonts();
        embeddedFonts.execute();

    }

    private void execute() throws IOException {
        System.out.println("Current dir:" + System.getProperty("user.dir"));

        try (PDDocument document = new PDDocument())
        {
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            //String dir = "../pdfbox/src/main/resources/org/apache/pdfbox/resources/ttf/";
            //String dir = System.getProperty("user.dir") + "/target/classes/";
            String dir=Paths.get("").toAbsolutePath().toString() +"/target/classes/";
            System.out.println("Current path is: " + dir);
            String resourcePath=getClass().getClassLoader().getResource("LiberationSans-Regular.ttf").toString();
            System.out.println("Resource Path:" + resourcePath);
            PDType0Font font = PDType0Font.load(document, new File(dir + "LiberationSans-Regular.ttf"));

            try (PDPageContentStream stream = new PDPageContentStream(document, page))
            {
                stream.beginText();
                stream.setFont(font, 12);
                stream.setLeading(12 * 1.2f);

                stream.newLineAtOffset(50, 800);
                stream.showText("PDFBox's Unicode with Embedded TrueType Font");
                stream.newLine();

                stream.showText("Supports full Unicode text ☺");
                stream.newLine();

                stream.showText("English русский язык Tiếng Việt");
                stream.newLine();

                stream.showText("Türkçe Karakter DenemesiİiIıÖöÇçÜüŞş");
                stream.newLine();

                // ligature
                stream.showText("Ligatures: \uFB01lm \uFB02ood");

                stream.endText();
            }

            document.save("example.pdf");
        }
    }
}