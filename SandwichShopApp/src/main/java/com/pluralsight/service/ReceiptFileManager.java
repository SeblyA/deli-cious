package com.pluralsight.service;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptFileManager {
    public static void saveReceipt(Order order ) {
            try {
//Create folder for receipt
                File folder = new File("receipts");

              //  check if  folder exist
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                //creates time and date

                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

                String fileName =
                        LocalDateTime.now().format(formatter) + ".txt";
                File file = new File(folder, fileName);
                String receiptText = order.getReceiptText();//get receipt text

                System.out.println(receiptText);

                try (FileWriter writer = new FileWriter(file)) {

                    //write receipt text to file
                    writer.write(receiptText);

                    System.out.println("Receipt saved: " + fileName);
                }

            } catch (IOException e) {

                System.out.println("Error saving receipt.");
                e.printStackTrace();
            }
    }
}