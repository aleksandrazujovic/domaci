package domaci22;

//Napisati program koji iz fajla test.xslx cita kombinacije username/password
// i proverava da li su isti. Ako su isti u ćeliji pored upisati INVALID
// jer program ne dozvoljava da username i password budu identični.
// Ako se razlikuju, u ćeliji pored kombinacije upisati VALID. Urađen projekat postaviti na git.

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class domaci22 {
    public static void main(String[] args) throws IOException {

            writeExcel();
            printExcel();
            Faker faker = new Faker();
            writeFaker(faker);

            }
    public static void printExcel() {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("domaci22.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet("Test");

            for (int i = 0; i < 100; i++) {
                XSSFRow row = sheet.getRow(i);
                if (row == null) {
                    break;
                } else {
                    for (int j = 0; j < 2; j++) {
                        XSSFCell cell = row.getCell(j);
                        System.out.print(cell.getStringCellValue() + " ");
                    }
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeExcel() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("domaci22.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Test");

        for (int i = 0; i < 1; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 1; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue("Aleksandra");
            }
            for (int j = 1; j < 2; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue("Zujovic");
            }
        }

        for (int i = 1; i < 2; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 1; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue("Milan");
            }
            for (int j = 1; j < 2; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue("Djurdjevic");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("domaci22.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

    public static void writeFaker(Faker faker) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("domaci22.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Test");

        for (int i = 2; i < 10; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 1; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(faker.name().firstName());
            }
            for (int j = 1; j < 2; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(faker.name().lastName());
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("domaci22.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

}