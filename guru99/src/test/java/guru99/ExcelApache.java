package guru99;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelApache {
	public static int sum = 0;
	public static int datai = 0;

	public static void main(String[] args) throws Exception {

		File src = new File("‪E:\\testing.xls");

		FileInputStream file = new FileInputStream(src);

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheetAt(1);

		int LastRow = sheet.getLastRowNum();

		for (int i = 1; i < LastRow; i++)

		{
			int datai = (int) wb.getSheetAt(0).getRow(i).getCell(1).getNumericCellValue();

			sum = sum + datai;
		}

		System.out.println("total population is:" + sum);

	}

}
