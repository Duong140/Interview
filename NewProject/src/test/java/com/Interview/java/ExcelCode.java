package com.Interview.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelCode {


	public static FileInputStream ip;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static ChromeOptions options;
	public static WebDriver driver;


	public static void main(String[] args){
	String name = "Mike";
		System.out.println(reverseString(name));
	
	}
	
	public static String reverseString(String str) {
		//create empty string to store new string
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		return rev;
	}
	
	
	

}







