package pom.pagefactoryexution;

import pom.pagefactory.SearchHotelPageFactory;

public class SearchHotelPageFactoryExecution extends LoginPageFactoryExexution {

	public static void location() {
		findSelect(findElementByID(location), 4, 1);
	}

	public static void hotesl() {
		findSelect(findElementByID(hotels), 5, 1);
	}

	public static void roomType() {
		findSelect(findElementByID(roomType), 6, 1);
	}

	public static void numberofrooms() {
		findSelect(findElementByID(numberofrooms), 7, 1);
	}

	public static void checkindate() {
		readexcel(findElementByID(checkindate), 8, 1);
	}

	public static void checkoutdate() {
		readexcel(findElementByID(checkoutdate), 9, 1);
	}

	public static void adultperroom() {
		findSelect(findElementByID(adultperroom), 10, 1);
	}

	public static void cholderenperroom() {
		findSelect(findElementByID(cholderenperroom), 11, 1);
	}

	public static void search() {
		clickElement(findElementByID(search));
	}

	public static void radioButton() {
		clickElement(findElementByID(radioButton));
	}

	public static void continueclick() {
		clickElement(findElementByID(continueclick));
	}
	
	public static void checkindateclear() {
		clear(findElementByID(checkindate));
	}
	
	public static void checkoutclearclear() {
		clear(findElementByID(checkoutdate));
	}
}
