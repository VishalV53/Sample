package excelproject.mavenproject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) throws IOException {
    	
    	//String[] columns= {"Employee Name","Emp ID","Contact Number","Designation","Date of Birth","Blood Group","Date of Joining"};
    	
    	List<EmployeeDetails> details=new ArrayList<>();
    	
    	details.add(new EmployeeDetails("Damon", 7896, 9876543210l, "Software Developer", "10/07/1992", "O+ve", "01/08/2021"));
    	details.add(new EmployeeDetails("Stefan", 7383, 9536638743l, "System Engineer", "15/02/1994", "A+ve", "09/10/2019"));
    	details.add(new EmployeeDetails("Steve",8937, 8838196866l, "Junior Developer", "18/03/1996", "B+ve", "03/05/2021"));
    	details.add(new EmployeeDetails("Dustin", 4893, 993733773l, "Tech Support", "20/09/1999", "A+ve", "11/09/2020"));
    	details.add(new EmployeeDetails("Hayley", 2934, 9009386333l, "Product Designer", "25/09/1995", "O-ve", "24/01/2019"));
    	details.add(new EmployeeDetails("Klaus", 5783, 8939767574l, "Project Manager", "01/01/1992", "B-ve", "19/12/2017"));
    	details.add(new EmployeeDetails("Elijah", 4536, 9234527282l, "Full stack developer", "05/03/1990", "B+ve", "15/05/2018"));
    	details.add(new EmployeeDetails("Marcel", 6767, 7500173645l, "Technical writer", "14/11/1995", "A-ve", "15/12/2020"));
    	
    	XSSFWorkbook workbook=new XSSFWorkbook();  //It Creates a blank workbook
    	XSSFSheet sheet=workbook.createSheet("EmployeeData");  //It  Create a blank spreadsheet 
    	
    	Row headerRow = sheet.createRow(0);   //It is used to set Header row in Excel
    	headerRow.createCell(0).setCellValue("Employee Name");
    	headerRow.createCell(1).setCellValue("Emp ID");
    	headerRow.createCell(2).setCellValue("Contact Number");
    	headerRow.createCell(3).setCellValue("Designation");
    	headerRow.createCell(4).setCellValue("Date of Birth");
    	headerRow.createCell(5).setCellValue("Blood Group");
    	headerRow.createCell(6).setCellValue("Date of Joining");
    	
    	int rowNum=1;
    	
    	for(EmployeeDetails empDetail:details) {     //Enchanced for Loop
    		Row row=sheet.createRow(rowNum++);
    		
    		row.createCell(0).setCellValue(empDetail.employeeName);
    		row.createCell(1).setCellValue(empDetail.empId);
    		row.createCell(2).setCellValue(empDetail.contactNumber);
    		row.createCell(3).setCellValue(empDetail.designation);
    		row.createCell(4).setCellValue(empDetail.dateOfBirth);
    		row.createCell(5).setCellValue(empDetail.bloodGroup);
    		row.createCell(6).setCellValue(empDetail.dateOfJoining);
    	}

    	try {
    	FileOutputStream fileOut = new FileOutputStream("E:\\Example\\details.xlsx");   
    	workbook.write(fileOut);  //FileOutputStream is used to write data (in bytes) to the files
    	fileOut.close();
    	workbook.close();
    	}catch(Exception e) {
    		e.printStackTrace(); //(printStackTrace() method  is used to print the Throwable along with other details like 
    							 // classname and line number where the exception occurred.)
   
    	}
    	
  
    }
}
