package org.test;

public class Facebook1 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserConChrome();
		openApplication("https://www.facebook.com");
		maximizeWindow();
		Login1 l =new Login1();
		inputText(l.getTxtEmail(),"welcome");
		inputText(l.getTxtPass(),"testing");
		//driver.navigate().refresh();
		//inputText(l.getTxtEmail(),"naveen");
	
		
	}
}
