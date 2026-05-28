package com.pluralsight.service;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static javax.swing.UIManager.get;


public class ReceiptFileManager {

    public static void saveReceipt(Order order) {
        try {
            File folder = new File("Receipts");
            if (!folder.exists()) {
                folder.mkdirs();
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = LocalDateTime.now().format(formatter) + ".txt";
            File file = new File(folder, fileName);
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(order.getReceiptText());

                System.out.println("Receipt saved: " + file.getAbsolutePath());
            } catch (IOException e) {

                System.out.println("Error saving receipt.");
                e.printStackTrace();
            }
        }catch (Exception e){
            System.out.println("Error saving receipt.");
            e.printStackTrace();
        }
    }
}


