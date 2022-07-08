package pom.pagefactoryexution;

import org.openqa.selenium.By;

import pom.pagefactory.BookAHotelPageFactory;
import pom.pagefactory.LoginPageFactory;
import pom.pagefactory.SearchHotelPageFactory;

public class LoginPageFactoryExexution extends BookAHotelPageFactory{
	
	public static void username() {
		readPropertyGetData(findElementByID(userName), "adactinusername");
		
	}
	
	public static void password() {
		readPropertyGetData(findElementByID(passWord), "adactinpassword");
	}
	
	public static void click() {
		clickElement(findElementByID(click));
	}

}
