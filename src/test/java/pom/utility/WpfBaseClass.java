package pom.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WpfBaseClass {
	public static WebDriver driver;
	public static File f = new File(
			"C:\\Users\\Mukesh\\eclipse-workspace1\\POM.Adanctin\\src\\test\\resources\\property\\LoginCredential.properties");
	public static FileReader file;
	public static File excelFile = new File("C:\\Users\\Mukesh\\eclipse-workspace1\\POM.Adanctin\\src\\test\\resources\\TestData\\Testing.xlsx");
	public static FileInputStream efile;
	public static Properties prop;
	public static String val;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void getUrl(String val) {
		driver.get(val);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static WebElement findElementByID(String id) {
		return driver.findElement(By.id(id));

	}

	public static WebElement findElementByName(String name) {
		return driver.findElement(By.name(name));

	}

	public static WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static void sendData(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void readPropertyGetUrl(String value) {
		try {
			file = new FileReader(f);
			prop = new Properties();
			prop.load(file);
			val = prop.getProperty(value);
			getUrl(val);

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		
	}
	public static void readPropertyGetData(WebElement element, String data) {
		
		try {
			file = new FileReader(f);
			prop = new Properties();
			prop.load(file);
			val = prop.getProperty(data);
			element.sendKeys(val);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void findSelect(WebElement element, int row1, int cell1) {
		
		try {
			efile = new FileInputStream(excelFile);
			Workbook wb = new XSSFWorkbook(efile);
			Sheet sheet = wb.getSheet("Adactin");
			Row row = sheet.getRow(row1);
			Cell cell = row.getCell(cell1);
			val = cell.getStringCellValue();
			
			Select sc = new Select(element);
			sc.selectByVisibleText(val);
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public static void readexcel(WebElement element, int row1, int cell1) {
		
		try {
			efile = new FileInputStream(excelFile);
			Workbook wb = new XSSFWorkbook(efile);
			Sheet sheet = wb.getSheet("Adactin");
			Row row = sheet.getRow(row1);
			Cell cell = row.getCell(cell1);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				val = cell.getStringCellValue();
				element.sendKeys(val);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = (Date) cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
					val = sim.format(dateCellValue);
					element.sendKeys(val);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					val = String.valueOf(numericCellValue);
					element.sendKeys(val);
				}
			}
			
			
			
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

public static void clear(WebElement element) {
	element.clear();
}

public static void getText(WebElement element) {
	val = element.getAttribute("Value");
	System.out.println("Booking Id:"+ val);
	
}

public static void writeExcel(WebElement element,int row1, int cell1, String sheet) {
	
	try {
		efile = new FileInputStream(excelFile);
		Workbook wb = new XSSFWorkbook(efile);
		Sheet createSheet = wb.createSheet(sheet);
		Row createRow = createSheet.createRow(row1);
		Cell createCell = createRow.createCell(cell1);
		getText(element);
		createCell.setCellValue(val);
		FileOutputStream f2 = new FileOutputStream(excelFile);
		wb.write(f2);
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void writeProperties(WebElement element) {
	try {
		FileWriter f = new FileWriter("C:\\Users\\Mukesh\\eclipse-workspace1\\POM.Adanctin\\src\\test\\resources\\property\\BookingID.properties");
		prop = new Properties();
		getText(element);
		prop.setProperty("BookingID", val);
		prop.store(f, "Adactin Booking ID Details");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
		
	}

