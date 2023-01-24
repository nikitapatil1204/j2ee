package com.jspider.multithreading.Main;

import com.jspider.multithreading.resources.Account;
import com.jspider.multithreading.threads.Husband;
import com.jspider.multithreading.threads.Wife;

public class AccountMain {
	public static void main(String[] args) {
		Account account=new Account(1000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
	}

}
