package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

     private static WebDriver driver;

     public static void initialize() {
          if (driver == null) {
               driver = new ChromeDriver();
               driver.manage().window().maximize();
          }
     }

     public static WebDriver getDriver() {
          return driver;
     }

     public static void quitDriver() {
          if (driver != null) {
               driver.quit();
               driver = null;
          }
     }
}