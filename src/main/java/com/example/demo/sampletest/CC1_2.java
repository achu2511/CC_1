package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1_2 {
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[. = 'Name (A to Z)']")).click();
       String name= driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println("Name (A to Z) "+name);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[. = 'Name (Z to A)']")).click();
        String title2=driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println("Name (Z to A) "+title2);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[. = 'Price (low to high)']")).click();
        String title3 = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("low to high "+title3);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[. = 'Price (high to low)']")).click();
        String title4 = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("high to low "+title4);



	
	
    }
}
