package excelproject.mavenproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileinfromexcel {
	public static void main(String[] args) throws IOException {
		
		FileInputStream filein=new FileInputStream("E:\\Example\\ReadXLEclipse.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(filein);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		Iterator<Row> rowIt= sheet.iterator();
		
		while(rowIt.hasNext()) {
			Row row=rowIt.next();
			
			Iterator<Cell> cellIt=row.cellIterator();
			
			while(cellIt.hasNext()) {
				Cell cell=cellIt.next();
				System.out.println(cell.toString()+";");
			}
			System.out.println();
		}
		workbook.close();
		filein.close();
		
	}

}
