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
	String hey = "Hello my name is Duong!";
	
	System.out.println(reverseSentence(hey));
	
	}
	
	
	
	public static String reverseSentence(String str) {
		//put input into a string array
		String[] words = str.split(" ");
		//new string to store new value in
		String result = "";
		
		//iterate trough the sentence and store each word
		for(int i = words.length-1; i >= 0; i--) {
			result += words[i];
			if(i > 0) {
				result += " ";
			}
		}
		
		return result;
	}

}







