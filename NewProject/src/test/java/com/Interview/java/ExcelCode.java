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


	public static void main(String[] args) throws IOException{
	
		String name = "Mike";
		String name1 = "I K Ef m";
		System.out.println(findAnagrams(name,name1));
	}
	
	
		
	public static boolean findAnagrams(String str1, String str2) {
		//git rid of all whitespaces and convert to lower case
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		
		//check if the strings are the same size if not return false
		if(str1.length() != str2.length()) {
			return false;
		}
		
		
		//convert strigns to char arrays
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		//sort the array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
	}

}







