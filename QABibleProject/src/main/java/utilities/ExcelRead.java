package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead
{   
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	
	public static String readStringDatafromExcel( int row, int col) throws IOException {
		File loc1 = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ExcelRead\\Exceltestdata.xlsx");
		f = new FileInputStream(loc1);
		w = new XSSFWorkbook(f);
		sh = w.getSheet("login");
		XSSFRow r = sh.getRow(row);
		XSSFCell d = r.getCell(col);
		return d.getStringCellValue();

	}

	public static String readIntegerData(int row,int col) throws IOException
	 {   		
		 File loc2=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelRead\\Exceltestdata.xlsx");
		 f=new FileInputStream(loc2);
		 w=new XSSFWorkbook(f);
		 sh=w.getSheet("login");
		 XSSFRow r=sh.getRow(row);
		 XSSFCell d=r.getCell(col);
		 int x=(int) d.getNumericCellValue();
		 return String.valueOf(x);
	 }
	 
	
}
