package pdfgenerator;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF_Serviceclass {
public static void main(String[] args) {
	Document document=new Document();
	try {
		PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("E://store//zak_Ins.pdf"));
		
	Font font=new Font(Font.FontFamily.TIMES_ROMAN,40,Font.BOLDITALIC,BaseColor.BLACK);
	Font font1=new Font(Font.FontFamily.HELVETICA,20,Font.ITALIC,BaseColor.GREEN);
	Font font2=new Font(Font.FontFamily.TIMES_ROMAN,16,Font.ITALIC,BaseColor.YELLOW);
	Font font3=new Font(Font.FontFamily.COURIER,32,Font.BOLDITALIC,BaseColor.BLUE);
	Font font4=new Font(Font.FontFamily.TIMES_ROMAN,16,Font.ITALIC,BaseColor.BLACK);
	System.out.println("PDF Created.....");
	
		document.open();
		Paragraph para=new Paragraph("Haris InfoTech ",font);
		para.setAlignment(Element.ALIGN_CENTER);
		document.add(para);
     	
Paragraph para1=new Paragraph("Golden Touch Programming ",font1);
		para1.setAlignment(Element.ALIGN_CENTER);
		document.add(para1);
		
		Paragraph para2=new Paragraph("Course details",font3);
		para2.setAlignment(Element.ALIGN_CENTER);
		document.add(para2);	
		Paragraph para3=new Paragraph

("Dear Learners, \n This is an attached pdf for giving you an update of upcoming courses."
 + "\n Refer the attached  course table and set your goal. "
	+"\n One Rule is compulsory for the people taking  admission.."
   +"\n \"Oath to Punchuality and Hard Work\".",font4);
		document.add(para3);
		document.add(Chunk.NEWLINE);
		
	//create table
	
	PdfPTable table=new PdfPTable(8);
			
	PdfPCell r1=new PdfPCell(new Paragraph("Sr.No"));//c1.setBackgroundColor(BaseColor.CYAN);
	
	r1.setBackgroundColor(BaseColor.CYAN);
	PdfPCell r2=new PdfPCell(new Paragraph(""));//c1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	PdfPCell r3=new PdfPCell(new Paragraph(""));
	PdfPCell r4=new PdfPCell(new Paragraph(""));
	r1=new PdfPCell(new Phrase("Course"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Batch"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Year"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Course Duration"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Registration Fee"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Monthly Fee"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	r1=new PdfPCell(new Paragraph("Total Fee"));r1.setBackgroundColor(BaseColor.CYAN);
	table.addCell(r1);
	
	r2=new PdfPCell(new Paragraph("1"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("Core Java"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("Galaxy"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("2022"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("Six Month"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("750"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("250"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	r2=new PdfPCell(new Paragraph("1500"));r2.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r2);
	
	r3=new PdfPCell(new Paragraph("2"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("Advance Java"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("Thinkers"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("2022"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("Six Month"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("800"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("250"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	r3=new PdfPCell(new Paragraph("1550"));r3.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r3);
	
	
	r4=new PdfPCell(new Paragraph("3"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("Mean n Mearn"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("champs"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("2022"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("Six Month"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("850"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("250"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	r4=new PdfPCell(new Paragraph("1600"));r4.setBackgroundColor(BaseColor.LIGHT_GRAY);
	table.addCell(r4);
	
	
	document.add(table);
	Paragraph para4=new Paragraph("(CEO-Shoaib)",font4);
	document.add(para4);
	Paragraph para5=new Paragraph("Thanxs & Regards",font4);
	document.add(para5);
	document.close();
	writer.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
