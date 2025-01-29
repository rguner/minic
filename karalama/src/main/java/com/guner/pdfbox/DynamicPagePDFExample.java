package com.guner.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class DynamicPagePDFExample {

    public static void main(String[] args) {
        try (PDDocument document = new PDDocument()) {
            // Create a content stream with auto-page handling
            /*
            PDPageContentStream contentStream = new PDPageContentStream(document, new org.apache.pdfbox.pdmodel.PDPage(),
                    PDPageContentStream.AppendMode.OVERWRITE, true, true);


             */

            // Variables for page layout
            float margin = 50; // Margin on each side
            float yPosition = 750; // Start writing at the top of the page
            float lineHeight = 15; // Space between lines
            float pageBottom = margin; // Bottom margin

            // Write multiple lines of content
            for (int i = 1; i <= 200; i++) { // Example: 200 lines of text
                if (yPosition <= pageBottom) {
                    // Close the current content stream and start a new page
                    //contentStream.close();
                    /*
                    contentStream = new PDPageContentStream(document, new org.apache.pdfbox.pdmodel.PDPage(),
                            PDPageContentStream.AppendMode.APPEND, true, true);

                     */

                    yPosition = 750; // Reset Y position for the new page
                }

                PDPage page = new PDPage(PDRectangle.A4);
                document.addPage(page);

                try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                    // Write text
                    contentStream.beginText();
                    contentStream.setFont(PDType1Font.HELVETICA, 12);
                    contentStream.newLineAtOffset(margin, yPosition);
                    contentStream.showText("This is line " + i);
                    contentStream.newLineAtOffset(margin + 100 , 0);
                    contentStream.showText("2This is line " + i);
                    contentStream.endText();
                }

                // Move Y position
                yPosition -= lineHeight;
            }

            // Close the last content stream
            // contentStream.close();

            // Save the document to a file
            String filePath = "DynamicMultiPageDocument.pdf";
            document.save(filePath);
            //document.close();

            System.out.println("PDF created successfully at: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
