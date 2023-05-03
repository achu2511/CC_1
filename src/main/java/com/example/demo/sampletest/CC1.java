package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1 {
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.className("cart_item_label")).isDisplayed();
        driver.findElement(By.id("checkout")).click();
        Boolean a= driver.findElement(By.id("first-name")).isDisplayed();
       // System.out.print(a);
        driver.findElement(By.id("first-name")).sendKeys("Mukesh");
        driver.findElement(By.id("last-name")).sendKeys("Reddy");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.className("cart_item_label")).isDisplayed();
        String name=driver.findElement(By.className("inventory_item_name")).getText();
        String price=driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println(name);
       System.out.println(price);
        String title=driver.getTitle();
        String tile="Swag Labs";
        String url=driver.getCurrentUrl();
        String ourl="https://www.saucedemo.com/checkout-step-two.html";
        if(url.equals(ourl))
        {
        	System.out.println("true");
        }
        if(title.equals(tile))
        {
        	System.out.print("true");
        }
        				

        
        
        
    }

}
