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

			String name = "mmimm";
			
			System.out.println(checkIfStringIsPalindrome(name));
	}
	
	
	public static boolean checkIfStringIsPalindrome(String str) {
		//create a empty string to store new store
		String rev = "";
		
		//iterate trough input and store the character in new string in reverse
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if(rev.equals(str)) {
			return true;
		}
		return false;
	}

}







