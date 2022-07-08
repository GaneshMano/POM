package pom.execution;

import pom.pagefactory.LoginPageFactory;
import pom.pagefactoryexution.BookAHotelPageFactoryExecution;
import pom.pagefactoryexution.LoginPageFactoryExexution;
import pom.pagefactoryexution.SearchHotelPageFactoryExecution;

public class execution extends BookAHotelPageFactoryExecution{
	
	public static void main(String[] args) {
		
		browserLaunch();
		readPropertyGetUrl("url");
		username();
		password();
		click();
		
		location();
		hotesl();
		roomType();
		numberofrooms();
		checkindateclear();
		checkindate();
		checkoutclearclear();
		checkoutdate();
		adultperroom();
		cholderenperroom();
		search();
		radioButton();
		continueclick();
		
		firstname();
		lastname();
		billingaddress();
		creditcardnumber();
		creditcardtype();
		expirymonth();
		expiryyear();
		cvvnumber();
		booknowclick();
		getTextValue();
		writeExcel();
		writePropertyFile();
		
	
	}

}
