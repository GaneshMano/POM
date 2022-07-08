package pom.pagefactoryexution;

import javax.lang.model.element.Element;

import pom.pagefactory.BookAHotelPageFactory;

public class BookAHotelPageFactoryExecution extends SearchHotelPageFactoryExecution{

	public static void firstname() {
     readexcel(findElementByID(firstname), 14, 1);
	}

	public static void lastname() {
		readexcel(findElementByID(lastname), 15, 1);
	}

	public static void billingaddress() {
		readexcel(findElementByID(billingaddress), 16, 1);
	}

	public static void creditcardnumber() {
		readexcel(findElementByID(creditcardnumber), 17, 1);
	}

	public static void creditcardtype() {
		readexcel(findElementByID(creditcardtype), 18, 1);
	}

	public static void expirymonth() {
		readexcel(findElementByID(expirymonth), 19, 1);
	}

	public static void expiryyear() {
		readexcel(findElementByID(expiryyear), 20, 1);
	}

	public static void cvvnumber() {
		readexcel(findElementByID(cvvnumber), 21, 1);
	}

	public static void booknowclick() {
       clickElement(findElementByID(booknowclick));
	}
	
	public static void getTextValue() {
		getText(findElementByID(getTextValue));
	}
	
	public static void writeExcel() {
		writeExcel(findElementByID(getTextValue), 2, 2, "POM1");
	}
	
	public static void writePropertyFile() {
		writeProperties(findElementByID(writeText));
	}

}
