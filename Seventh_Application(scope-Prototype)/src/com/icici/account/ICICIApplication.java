package com.icici.account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ICICIApplication {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Seventh_Application\\bean.xml");
		
		// 1. We are calling Spring IOC container for getting Bean Object of accountDetails
		AccountDetail accountdetail=(AccountDetail) context.getBean("accountdetail");
		System.out.println(accountdetail.hashCode()+"\t"+accountdetail.getPersonName()+"\t"+accountdetail.getAccountNumber());
	
		// 2. We are calling Spring IOC container for getting Bean Object of accountDetails
		AccountDetail accountdetail2=(AccountDetail) context.getBean("accountdetail2");
		System.out.println(accountdetail2.hashCode()+"\t"+accountdetail2.getPersonName()+"\t"+accountdetail2.getAccountNumber());
		
		// 3. We are calling Spring IOC container for getting Bean Object of accountDetails
		AccountDetail accountdetail3=(AccountDetail) context.getBean("accountdetail2");
		System.out.println(accountdetail3.hashCode()+"\t"+accountdetail3.getPersonName()+"\t"+accountdetail3.getAccountNumber());
		
		// 4. We are calling Spring IOC container for getting Bean Object of accountDetails
		AccountDetail accountdetail4=(AccountDetail) context.getBean("accountdetail2");
		System.out.println(accountdetail4.hashCode()+"\t"+accountdetail4.getPersonName()+"\t"+accountdetail4.getAccountNumber());
				
		// 3. We are calling Spring IOC container for getting Bean Object of accountDetails
		AccountDetail accountdetail5=(AccountDetail) context.getBean("accountdetail2");
		System.out.println(accountdetail5.hashCode()+"\t"+accountdetail5.getPersonName()+"\t"+accountdetail5.getAccountNumber());
	}

}
