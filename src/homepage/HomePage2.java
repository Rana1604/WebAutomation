package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage2 {




        // Url for Navigation
        static String url = "https://www.google.com/";
        static String amazonUrl = "https://www.amazon.com/";
        // WebDriver Reference Variable
        static WebDriver driver;
        // webDriver
        static String chromeWebDriver="webdriver.chrome.driver";
        static String chromeWebDriverPath="BrowserDriver/chromedriver.exe";

        // Web Element
        static String searchField = "#twotabsearchtextbox";
        static String searchItem = "mobile phone";
        static String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
        static String motoroMoto="//*[@id=\"anonCarousel1\"]/ol/li[2]/div/div/div[2]/h2/a/span";
        static String motoroMotoAddToCart="//*[@id=\"add-to-cart-button\"]";
        public static void main(String[] args) throws InterruptedException {

//        // For Firefox
//        System.setProperty("webdriver.gecko.driver", "BrowserDriver/geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get(url);
//        // close the Browser
//        driver1.close();

//        // For InternetExplorer
//        System.setProperty("webdriver.ie.driver", "BrowserDriver/IEDriverServer.exe");
//        WebDriver driver2 = new InternetExplorerDriver();
//        driver2.get(url);
//        // close the Browser
//        //driver2.close();
//        driver2.quit();
//            navigateTo(url);

            //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mobile phone");
            //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone");
            //driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

            // 8 Locator we use
        driver.findElement(By.id("d")).click();
        driver.findElement(By.name("dfd")).findElement(By.cssSelector("kjdlfj")).sendKeys("mac");
        driver.findElement(By.className("dfd")).click();
        driver.findElement(By.tagName("klkldjf")).click();
        driver.findElement(By.linkText("kjelfe")).click();
        driver.findElement(By.partialLinkText("kjelfe")).click();
        driver.findElement(By.cssSelector("kjelfe")).click();
        driver.findElement(By.xpath("kjelfe")).sendKeys(" i phone 11");
        driver.findElement(By.xpath("kjelfe")).clear();

            // Dynamic CSS Selector:
            // Dynamic Xpath



            navigateTo(amazonUrl,chromeWebDriver,chromeWebDriverPath);
            // Thread.sleep() method will work for wait purpose
            Thread.sleep(5000);
            // Write on SearchBox Web Edit Field
            driver.findElement(By.cssSelector(searchField)).sendKeys(searchItem);
            //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone");
            // Click on searchButton
            driver.findElement(By.xpath(searchButton)).click();
            driver.findElement(By.xpath(motoroMoto)).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(motoroMotoAddToCart)).click();
            //driver.navigate().back();

            // close the Browser which is Active/Current
            //driver.close();
            // Close all the tab open/ all the windows close
            //driver.quit();

        }

        public static void navigateTo(String url, String chromeWebDriver, String chromeWebDriverPath) {
            // For Chrome Browser
            System.setProperty(chromeWebDriver,chromeWebDriverPath );
            // create a object for chromeDriver
            driver = new ChromeDriver();
            driver.manage().window().fullscreen();

            // Navigate to Url
            //driver.get(url);
            driver.navigate().to(url);
            //driver.navigate().back();
        }

    }




