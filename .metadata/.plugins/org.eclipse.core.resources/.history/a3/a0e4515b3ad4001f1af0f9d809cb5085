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

	
		System.out.println(fizzBuzz(15));
	}

 	
	public static List<String> fizzBuzz(int num) {
		List<String> storage = new ArrayList<>();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				storage.add("FizzBuzz");
			} else if(i % 3 == 0) {
				storage.add("Fizz");
			} else if(i % 5 == 0) {
				storage.add("Buzz");
			} else {
				storage.add(String.valueOf(i));
			}
		}
		return storage;
	}

}







