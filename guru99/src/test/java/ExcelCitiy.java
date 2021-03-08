import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelCitiy {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:\\testing.xls");
		Workbook wl = Workbook.getWorkbook(file);
		Sheet s1 = wl.getSheet(0); 
		for(int j=0;j<=10;j++)
		{
			String city =s1.getCell(3,j).getContents();
			System.out.println(city);
		}
			String population =s1.getCell(4,11).getContents();
			System.out.print("Total Population :"+ population); 
	}

}
