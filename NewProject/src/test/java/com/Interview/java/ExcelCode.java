package com.Interview.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		System.out.println(countWords("Hello buddy, hows it going there"));

	}

 	
	public static int countWords(String str) {
		//convert into a string array
		String[] words = str.split(" ");
		
		int result = words.length;
		return result;
	}

}







