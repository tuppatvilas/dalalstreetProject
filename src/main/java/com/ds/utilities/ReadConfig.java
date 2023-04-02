package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
   {
	String path ="C:\\sft testing\\DalalstreetFrameWork\\src\\test\\resources\\configs\\configuration.properties";

	try {
		File file = new File(path);
		FileInputStream fis =new FileInputStream(file);
	    pro =new Properties();
		pro.load(fis);
	}
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
   }
	@Test
	public String geturl()
	{
		String url=pro.getProperty("url");
		//System.out.println(url);
		return url;
	}
	public String getemailadd()
	{
		return pro.getProperty("emailadd");
		//System.out.println(url);
		
	}
	public String getpassword()
	{
		return pro.getProperty("password");
		//System.out.println(url);
		
	}
}
