package com.example;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  public static void main(String[] args)throws InterruptedException{
    AddTrarrifPlan();
  }






      public static void AddTrarrifPlan() throws InterruptedException{
       Alldata obj1 = new Alldata("300","400","500","600","700","800","900");
       Alldata obj2 = new Alldata("1000","2000","3000","4000","5000","6000","700");
       Alldata obj3 = new Alldata("","","","","","","");
       ArrayList <Alldata> myAlldata = new ArrayList <Alldata>();
       
       myAlldata.add(obj1);
       myAlldata.add(obj2);
       myAlldata.add(obj3);
      
       for( int i = 0 ; i < myAlldata.size(); i++ )
       {
       
         WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);
        driver.get("https://demo.guru99.com/telecom/addtariffplans.php");
        WebElement monthlyRental = driver.findElement(By.id("rental1"));
        monthlyRental.sendKeys(myAlldata.get(i).mRental);
        WebElement freelocalminutes = driver.findElement(By.id("local_minutes"));
        freelocalminutes.sendKeys(myAlldata.get(i).fLMinutes);
        WebElement freeinternatialminutes = driver.findElement(By.id("inter_minutes"));
        freeinternatialminutes.sendKeys(myAlldata.get(i).fIntMinutes);
        WebElement freesmspack = driver.findElement(By.id("sms_pack"));
        freesmspack.sendKeys(myAlldata.get(i).fSPack);
        WebElement localpermicharges = driver.findElement(By.id("minutes_charges"));
        localpermicharges.sendKeys(myAlldata.get(i).lPerMCharge);
        WebElement interpermicharges = driver.findElement(By.id("inter_charges"));
        interpermicharges.sendKeys(myAlldata.get(i).iPMcharge);
        WebElement smspercharges = driver.findElement(By.id("sms_charges"));
        smspercharges.sendKeys(myAlldata.get(i).sPerCharge);
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        driver.quit();}}

    }
