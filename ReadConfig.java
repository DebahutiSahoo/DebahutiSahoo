package com.RMS.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public  ReadConfig() {
		prop = new Properties();
		File src= new File("./ConfigurationFiles/config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			prop.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is.."+e.getMessage());
		
		}}
		public String getApplicationURL()
		{
			String url=prop.getProperty("URL");
			return url;
		}
		public String getUserName()
		{
			String username=prop.getProperty("Username");
			return username;
		}
		public String getPassword()
		{
			String pwd=prop.getProperty("Password");
			return pwd;
		}
		public String getChromepath()
		{
			String Chromepath=prop.getProperty("ChromeDriver");
			return Chromepath;
		}
		public String getFirefoxpath()
		{
			String Firefocpath=prop.getProperty("FireFoxDriver");
			return Firefocpath;
		}
		public String getIEDriverpath()
		{
			String IEDriverpath=prop.getProperty("IEDriver");
			 return IEDriverpath;
		}
	
		
	}
	
	

