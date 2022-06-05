package project;

	import java.io.FileInputStream;
	import java.util.ArrayList;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 
	public class ExcelReader {
			public void ReadNSend() throws Exception {
				String ExcelFile="C:\\Users\\abc\\Desktop\\Book.xlsx -Microsoft Excel Online.Ink";
				FileInputStream fis=new FileInputStream(ExcelFile);
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet sheet=null;
				sheet=workbook.getSheetAt(0);
				int rows=sheet.getLastRowNum();
				int column=sheet.getRow(1).getLastCellNum();
				ArrayList<String>Name=new ArrayList<String>();
				ArrayList<String>EmailId=new ArrayList<String>();
				ArrayList<String>Science=new ArrayList<String>();
				for(int i=0;i<=rows;i++) {
					XSSFRow row=sheet.getRow(i);
					for(int j=0;j<=column;j++) {
						Cell Val=row.getCell(j);
						switch(j){
						case 0:Name.add(Val.getStringCellValue());
						break;
						case 1:EmailId.add(Val.getStringCellValue());
						break;
						case 2:Science.add(Val.getStringCellValue().replace("a", ""));
						break;
						default:;
						}
			}
	 }        workbook.close();
	 			for(String string:Name) {
	 				System.out.println(string);
	 			}
	 			for(String string:EmailId) {
	 				System.out.println(string);
	 			}
	 			for(String string:Science) {
	 				System.out.println(string);
	 			}
	 			EmailService ES=new EmailService();
	 			ES.sendmail(Name,EmailId);
				System.out.println("Sending Email....");
				System.out.println("Email send sucessfully.....");
			}}

