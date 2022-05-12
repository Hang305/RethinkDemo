package support.utils;

import au.com.bytecode.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import model.showroom.CSVCalculatingInsurancePremium;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CSVReaderUtils {
    private static final String CSV_FILE_PATH = "./src/test/resources/Data/DataQuestionsForCalculatingInsurancePremium.csv";
    private static final char DEFAULT_SEPARATOR = ',';

    public void readerCSVFile() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
                CSVReader csvReader = new CSVReader(reader);
                com.opencsv.CSVReader csvReaderBuilder = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("==========================");
            }

            // Reading All Records at once into a List<String[]>
            List<String[]> records = csvReader.readAll();
            for (String[] record : records) {
                System.out.println("Name : " + record[0]);
                System.out.println("Email : " + record[1]);
                System.out.println("Phone : " + record[2]);
                System.out.println("Country : " + record[3]);
                System.out.println("---------------------------");
            }
        }
    }

    public static void OpenCSVReadAndParseToBean() {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
        ) {
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVCalculatingInsurancePremium.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CSVCalculatingInsurancePremium> csvUserIterator = csvToBean.iterator();

            while (csvUserIterator.hasNext()) {
                CSVCalculatingInsurancePremium csvCalculatingInsurancePremium = csvUserIterator.next();
                System.out.println("Question 1 : " + csvCalculatingInsurancePremium.getQ1());
                System.out.println("Question 2 : " + csvCalculatingInsurancePremium.getQ2());
                System.out.println("Question 3 : " + csvCalculatingInsurancePremium.getQ3());
                System.out.println("Question 4 : " + csvCalculatingInsurancePremium.getQ4());
                System.out.println("Question 5 : " + csvCalculatingInsurancePremium.getQ5());
                System.out.println("Question 6 : " + csvCalculatingInsurancePremium.getQ6());
                System.out.println("Question 7 : " + csvCalculatingInsurancePremium.getQ7());
                System.out.println("Question 8 : " + csvCalculatingInsurancePremium.getQ8());
                System.out.println("Question 9 : " + csvCalculatingInsurancePremium.getQ9());
                System.out.println("Question 10 : " + csvCalculatingInsurancePremium.getQ10());
                System.out.println("Question 11 : " + csvCalculatingInsurancePremium.getQ8());
                System.out.println("Question 12: " + csvCalculatingInsurancePremium.getQ9());
                System.out.println("Total premium : " + csvCalculatingInsurancePremium.getTotalPremium());
                System.out.println("================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void readCSVFileByIndex() throws FileNotFoundException {
//        List<String[]> listData = null;
//        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
//            listData = reader.readAll();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        int listIndex = 0;
//        for (String[] arrays : listData) {
//            System.out.println("\nString[" + listIndex++ + "] : " + Arrays.toString(arrays));
//
//            int index = 0;
//            for (String array : arrays) {
//                System.out.println(index++ + " : " + array);
//            }
//        }
//    }

    public static void main(String[] args) {
        OpenCSVReadAndParseToBean();
    }
}
