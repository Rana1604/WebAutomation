package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage1 {


        static String url = "https://www.google.com/";
        static String amazonUrl = "https://www.amazon.com/";

        public static void main(String[] args) {


//        // For Firefox
//        System.setProperty("webdriver.gecko.driver", "BrowserDriver/geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get(url);
//        // close the Browser
//        driver1.close();
//
//        // For InternetExplorer
//        System.setProperty("webdriver.ie.driver", "BrowserDriver/IEDriverServer.exe");
//        WebDriver driver2 = new InternetExplorerDriver();
//        driver2.get(url);
//        // close the Browser
//        //driver2.close();
//        driver2.quit();

            // nevigateTo(url);
            nevigateTo(amazonUrl);
            //Thread.sleep(5000);

        }

        public static void nevigateTo(String url){
            // For Chrome Browser
            System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
            // create a object for chromeDriver
            WebDriver driver = new ChromeDriver();
            // Navigate to Url
            //driver.get(url);
            driver.navigate().to(url);
            driver.findElement(By.xpath("#twotabsearchtextbox")).sendKeys("Mobile phone");
            driver.findElement(By.xpath("#nav-search > form > div.nav-right > div > input")).click();
            driver.findElement(By.xpath("#anonCarousel1 > ol > li:nth-child(1) > div > div > span > a > div > img")).click();
            driver.findElement(By.xpath("#createAccountSubmit")).click();

            //driver.navigate().back();
            // close the Browser
            //driver.close();
        }



    }








