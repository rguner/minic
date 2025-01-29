package com.guner.pdfbox;

import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.util.Matrix;

import java.io.IOException;
import java.io.InputStream;

public class PdfWithWatermark {

    public static void main(String[] args) {
        String outputFile = "complex_pdf_with_watermark.pdf";

        try (PDDocument document = new PDDocument()) {
            // Add Title Page
            PDPage titlePage = new PDPage(PDRectangle.A4);
            document.addPage(titlePage);
            addTitlePageContent(document, titlePage);

            // Add Content Page with Table and Image
            PDPage contentPage = new PDPage(PDRectangle.A4);
            document.addPage(contentPage);
            addContentPageContent(document, contentPage);
            PDPage contentPage2 = new PDPage(PDRectangle.A4);
            document.addPage(contentPage2);
            addContentPageContent(document, contentPage2);
            PDPage contentPage3 = new PDPage(PDRectangle.A4);
            document.addPage(contentPage3);
            addContentPageContent(document, contentPage3);

            // Add Watermark to All Pages
            addWatermarkToAllPages(document, "CONFIDENTIAL");

            // Save the document
            document.save(outputFile);
            System.out.println("PDF created successfully with watermark: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addTitlePageContent(PDDocument document, PDPage page) throws IOException {
        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
            // Draw Title
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 30);
            contentStream.newLineAtOffset(200, 700);
            contentStream.showText("Complex PDF Example");
            contentStream.endText();

            // Draw Subtitle
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 18);
            contentStream.newLineAtOffset(100, 650);
            contentStream.showText("An example of creating a complex PDF using Apache PDFBox");
            contentStream.endText();
        }
    }

    private static void addContentPageContent(PDDocument document, PDPage page) throws IOException {
        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
            // Add Table Header
            float margin = 50;
            float yStart = 700;
            float tableWidth = page.getMediaBox().getWidth() - (2 * margin);
            float yPosition = yStart;

            drawTableHeader(contentStream, margin, yPosition, tableWidth);

            // Add Table Rows
            yPosition -= 20; // Move down
            drawTableRow(contentStream, margin, yPosition, tableWidth, "1", "Alice", "Developer");
            yPosition -= 20; // Move down
            drawTableRow(contentStream, margin, yPosition, tableWidth, "2", "Bob", "Manager");
            yPosition -= 20; // Move down
            drawTableRow(contentStream, margin, yPosition, tableWidth, "3", "Charlie", "Designer");

            /*
            // Add Image
            PDImageXObject image = PDImageXObject.createFromFile("/Users/rguner/ws/github/minic/karalama/example_image.png", document);
            float imageX = margin;
            float imageY = 400;
            float imageWidth = 200;
            float imageHeight = 100;
            contentStream.drawImage(image, imageX, imageY, imageWidth, imageHeight);

             */

            //PDImageXObject image = PDImageXObject.createFromFile("checkbox-checked.png", document);

            InputStream imageInputStream = PdfWithWatermark.class.getResourceAsStream("/checkbox-checked.png");
            PDImageXObject image = PDImageXObject.createFromByteArray(document, IOUtils.toByteArray(imageInputStream), "checkbox-checked.png" /* optional, can be null */);
            // Start a content stream to draw on the page

                contentStream.drawImage(image, 50, 400, 10, 10);

            PDImageXObject image2 = PDImageXObject.createFromFile("checkbox-unchecked.png", document);
            // Start a content stream to draw on the page

            contentStream.drawImage(image2, 50, 500, 10, 10);

            // Add Page Number
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.newLineAtOffset(page.getMediaBox().getWidth() - 100, 50);
            contentStream.showText("Page 2");
            contentStream.endText();
        }
    }

    private static void drawTableHeader(PDPageContentStream contentStream, float x, float y, float width) throws IOException {
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(x, y);
        contentStream.showText("ID");
        contentStream.newLineAtOffset(width / 3, 0);
        contentStream.showText("Name");
        contentStream.newLineAtOffset(width / 3, 0);
        contentStream.showText("Role");
        contentStream.endText();
    }

    private static void drawTableRow(PDPageContentStream contentStream, float x, float y, float width, String id, String name, String role) throws IOException {
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(x, y);
        contentStream.showText(id);
        contentStream.newLineAtOffset(width / 3, 0);
        contentStream.showText(name);
        contentStream.newLineAtOffset(width / 3, 0);
        contentStream.showText(role);
        contentStream.endText();
    }

    private static void addWatermarkToAllPages(PDDocument document, String watermarkText) throws IOException {
        for (PDPage page : document.getPages()) {
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true, true)) {
                PDExtendedGraphicsState graphicsState = new PDExtendedGraphicsState();
                graphicsState.setNonStrokingAlphaConstant(0.2f); // Transparency
                contentStream.setGraphicsStateParameters(graphicsState);

                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 50);
                contentStream.setNonStrokingColor(200, 0, 0); // Light red
                PDRectangle pageSize = page.getMediaBox();
                float centerX = pageSize.getWidth() / 2;
                float centerY = pageSize.getHeight() / 2;
                contentStream.setTextMatrix(Matrix.getRotateInstance(Math.toRadians(45), centerX, centerY));
                contentStream.showText(watermarkText);
                contentStream.endText();
            }
        }
    }
}
