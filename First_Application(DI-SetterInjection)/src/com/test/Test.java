package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\First_App\\bean.xml");
		Object obj=beanFactory.getBean("addr");
		Address ad=(Address)obj;
		String str=ad.toString();
		System.out.println(str);
		System.out.println(ad.hashCode());
		
		Address ad1=(Address) beanFactory.getBean("addr1");
		System.out.println(ad1.toString());
		System.out.println(ad1.hashCode());
		
		Product product=(Product) beanFactory.getBean("prod");
		System.out.println(product.toString());
		System.out.println(product.hashCode());
	}
}
