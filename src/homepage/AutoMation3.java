package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.print.Book;

public class AutoMation3 {







     static  String amazonurl="https://www.amazon.com/";

        static WebDriver driver;

        static String SellPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[1]/a";
        static String SellUnderPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[2]/a";
        static String HandmadePath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[3]/a";
        static String ServicesPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[4]/a";
        static String BusinessPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[5]/a";
        static String AppsPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[6]/a";
        static String AffiliatePath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[7]/a";
        static String ProductsPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[8]/a";
        static String SelfPublishPath="/html/body/div[1]/div[4]/div[1]/div/div[3]/ul/li[9]/a";
        static String AcxPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[1]/td[11]/a";
        static String IgnitePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[3]/td[11]/a";
        static String CreateSpacePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[5]/td[11]/a";
        static String KindlePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[7]/td[11]";
        static String WootPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[9]/td[11]/a";
        static String RenewedPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[11]/td[11]/a";
        static String AudiblePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[5]/td[3]/a";
        static String FabricPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[7]/td[3]/a";
        static String VideoPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[9]/td[3]/a";
        static String WifiPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[11]/td[3]/a";
        static String DrivePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[1]/td[5]/a";
        static String FreshPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[3]/td[5]/a";
        static String BookPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[5]/td[5]/a";
        static String GoodReadsPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[7]/td[5]/a";
        static String ShopBopPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[9]/td[5]/a";
        static String NeighborsApp="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[11]/td[5]/a";
        static String GlobalApp="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[3]/td[7]/a";
        static String BoxOfficePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[5]/td[7]/a";
        static String RapidsPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[3]/td[13]/a";
        static String DPPath="/html/body/div[1]/div[4]/div[5]";
        static String PrimeNowPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[7]/td[13]/a";
        static String ZapposPath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[9]/td[13]/a";
        static String SecondChancePath="/html/body/div[1]/div[4]/div[4]/table/tbody/tr[11]/td[13]";

        public static void main(String[] args) throws InterruptedException {
            OpenBrowser(amazonurl);
            SellOnAmazon();
            SellUnderAmazon();
            HandmadeAmazon();
            ServicesAmazon();
            BusinessAmazon();
            AppsAmazon();
            AffiliateAmazon();
            ProductsAmazon();
            SelfPublishAmazon();
            AcxAmazon();
            IgniteAmazon();
            CreateSpaceAmazon();
            KindleAmazon();
            WootAmazon();
            RenewedAmazon();
            AudibleAmazon();
            FabricAmazon();
            VideoPath();
            WifiAmazon();
            DriveAmazon();
            FreshAmazon();
            BookAmazon();
            GoodReadsAmazon();
            ShopBop();
            NeighborsAmazon();
            GoodReadsAmazon();
            BoxOfficeAmazon();
            RapidsPath();
            AmazonDP();
            PrimeNowAmazon();
            ZapposAmazon();
          SecondChanceAmazon();




        }

        public static void OpenBrowser(String str){
            System.setProperty("webdriver.chrome.driver","BrowserDriver/chromedriver");
            driver=new ChromeDriver();
            driver.get(str);
        }

        public static void CheckLogin(){
            OpenBrowser(amazonurl);



        }

        public static void SellOnAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(SellPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void SellUnderAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(SellUnderPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();



        }
        public static void HandmadeAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(HandmadePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void ServicesAmazon(){
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(ServicesPath)).click();
            driver.navigate().back();
            driver.close();
        }
        public static void BusinessAmazon(){
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(BusinessPath)).click();
            driver.navigate().back();
            driver.close();
        }
        public static void AppsAmazon(){
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(AppsPath)).click();
            driver.navigate().back();
            driver.close();
        }
        public static void AffiliateAmazon(){
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(AffiliatePath)).click();
            driver.navigate().back();
            driver.close();
        }
        public static void ProductsAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(ProductsPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void SelfPublishAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(SelfPublishPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void AcxAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(AcxPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void IgniteAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(IgnitePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void CreateSpaceAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(CreateSpacePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void KindleAmazon () throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(KindlePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();


        }
        public static void WootAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(WootPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void RenewedAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(RenewedPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void AudibleAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(AudiblePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void FabricAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(FabricPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void VideoPath() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(VideoPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();


        }
        public static void WifiAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(WifiPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();


        }
        public static void DriveAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(DrivePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void FreshAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(FreshPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void BookAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(BookPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void GoodReadsAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(GoodReadsPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void ShopBop() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(ShopBopPath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void NeighborsAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(NeighborsApp)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void GlobalAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(GlobalApp)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void BoxOfficeAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(BoxOfficePath)).click();
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void RapidsPath() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(RapidsPath));
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void AmazonDP() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(DPPath));
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();
        }
        public static void PrimeNowAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(PrimeNowPath));
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();

        }
        public static void ZapposAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(ZapposPath));
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();


        }
        public static void SecondChanceAmazon() throws InterruptedException {
            OpenBrowser(amazonurl);
            driver.findElement(By.xpath(SecondChancePath));
            Thread.sleep(3500);
            driver.navigate().back();
            driver.close();


        }
    /*public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}
    public static void(){}*/










    }

