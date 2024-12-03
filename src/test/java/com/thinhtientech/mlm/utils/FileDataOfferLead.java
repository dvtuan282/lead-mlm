package com.thinhtientech.mlm.utils;

import com.thinhtientech.mlm.models.LeadModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileDataOfferLead {
    public void updateLeadInFile(List<LeadModel> leadModels) {
        File file = new File("dataLeadOffer.xlsx");
        // Tạo một workbook (file Excel)
        try (FileInputStream fis = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(fis)) {
            // Lấy sheet đầu tiên từ file Excel
            Sheet sheet = workbook.getSheetAt(0);
            // Kiểm tra xem sheet đã có dữ liệu chưa
//            int rowNum = sheet.getPhysicalNumberOfRows(); // Lấy số dòng hiện tại
            for (int i = 0; i < leadModels.size(); i++) {
                LeadModel leadModel = leadModels.get(i);
                Row rowToUpdate = sheet.getRow(i + 1); // Dòng thứ 2 (chỉ số dòng bắt đầu từ 0)
                if (rowToUpdate != null) {
                    rowToUpdate.getCell(0).setCellValue(leadModel.customerName);
                    rowToUpdate.getCell(1).setCellValue(leadModel.phoneNumber1);
                    rowToUpdate.getCell(2).setCellValue(leadModel.campaignCodeCRM);
                    rowToUpdate.getCell(3).setCellValue(leadModel.phoneNumber2);
                    rowToUpdate.getCell(4).setCellValue(leadModel.nationalId1);
                }
                // Lưu lại file Excel sau khi cập nhật
                try (FileOutputStream fileOut = new FileOutputStream(file)) {
                    workbook.write(fileOut);
                    System.out.println("File Excel đã được cập nhật.");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
