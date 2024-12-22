package dayOnePrograms;

import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

        try {
            // Access the PDF URL using Selenium
            String pdfUrl = "https://ssc.gov.in/api/attachment/uploads/masterData/NoticeBoards/Notice_of_CGLE_2024_06_24.pdf";
            driver.get(pdfUrl);

            // Download the PDF and extract text
            @SuppressWarnings("deprecation")
			URL url = new URL(pdfUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
            PDDocument document = PDDocument.load(inputStream);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfText = pdfStripper.getText(document);

            // Print the extracted text
            System.out.println(pdfText);

            // Close resources
            document.close();
            inputStream.close();
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

	}


