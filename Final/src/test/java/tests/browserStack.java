package tests;
//
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.net.URL;
//
//import static tests.Config.region;
//
//
//public class browserStack {
//    //    private static final String APP = "/Users/lindsaywalker/Documents/Example_Tests/Android.SauceLabs.Mobile.Sample.app.2.7.0.apk";
//   // private static final String APP = "yallahood.apk";
//    private static final String APP = "iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";
//  //  private static final String APP = "Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
//    //    private static final String APPIUM = "http://localhost:4723/wd/hub"; // See the new URL declared according to region.
//    URL url; //added
//    private AndroidDriver driver;
//
////    String usernameID = "test-Username";
////    String passwordID = "test-Password";
////    String submitButtonID = "test-LOGIN";
//    String usernameID = "test-Username";
//    String passwordID = "test-Password";
//    String submitButtonID = "test-LOGIN";
//    By ProductTitle = By.xpath("//android.widget.TextView[@text='PRODUCTS']");
//
//    @BeforeMethod
//    public void setUp() throws Exception {
//        System.out.println("Sauce Android App EMU Test - BeforeMethod hook"); //added
////        String username = System.getenv("SAUCE_USERNAME");
////        String accesskey = System.getenv("SAUCE_ACCESS_KEY");
//
//
//        String username = "oauth-humaira.perveen-23a28";
//        String accesskey ="6d22cb1a-9ade-409f-aba3-1b73b008c3d9";
//        String sauceUrl;
//        if (region.equalsIgnoreCase("eu")) {
//            sauceUrl = "@ondemand.eu-central-1.saucelabs.com:443";
//        } else {
//            sauceUrl = "@ondemand.us-west-1.saucelabs.com:443";
//        }
//        String SAUCE_REMOTE_URL = "https://" + username + ":" + accesskey + "@ondemand.eu-central-1.saucelabs.com:443"+ "/wd/hub";
//        url = new URL(SAUCE_REMOTE_URL);
//        //all lines above added
//
//
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//
//
//        capabilities.setCapability("browserstack.user", "humairaperveen_eDkjAo");
//        capabilities.setCapability("browserstack.key", "D18cPwBJdBePXSBwjUSw");
//
//        // Set URL of the application under test
//        capabilities.setCapability("app", "bs://8390cca1023a959695bff7f1467d3ae3c2364245");
//
//        // Specify device and os_version for testing
//        capabilities.setCapability("device", "Google Pixel 3");
//        capabilities.setCapability("os_version", "9.0");
//
//        // Set other BrowserStack capabilities
//        capabilities.setCapability("project", "First Java Project");
//        capabilities.setCapability("build", "Java Android");
//        capabilities.setCapability("name", "first_test");
//
//        //android
////        capabilities.setCapability("deviceName", "Android GoogleAPI Emulator"); //Updated to GoogleAPI Emulator
////        capabilities.setCapability("platformName", "Android");
////        capabilities.setCapability("platformVersion", "9.0");
////        capabilities.setCapability("automationName", "UiAutomator2");
////        capabilities.setCapability("app", "storage:filename=" + APP); //updated
//
////        capabilities.setCapability("deviceName", "iPhone XS Simulator"); //Updated to GoogleAPI Emulator
////        capabilities.setCapability("platformName", "iOS");
////        capabilities.setCapability("platformVersion", "14.5");
////        capabilities.setCapability("automationName", "XCUITest");
////        capabilities.setCapability("app", "storage:filename="+APP); //updated
//       // driver = new AndroidDriver(url, capabilities); //updated
//
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
//                new URL("http://hub.browserstack.com/wd/hub"), capabilities);
//
//    }
//
//        @AfterMethod
//        public void tearDown() {
//            System.out.println("Sauce Android App EMU Test - AfterMethod hook");// added
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//
//        @Test
//        public void loginToSwagLabsTestValid () {
//            System.out.println("Sauce - Start loginToSwagLabsTestValid test");
//            System.out.println("Test case executed");
//
//            login("standard_user", "secret_sauce");
////
////            // Verification
////            Assert.assertTrue(isOnProductsPage());
//        }
//
//        @Test
//        public void loginTestValidProblem () {
//            System.out.println("Sauce - Start loginTestValidProblem test");
//
//         //  login("problem_user", "secret_sauce");
//            System.out.println("Test case executed");
//
//            // Verification - we on Product page
//            //Assert.assertTrue(isOnProductsPage());
//        }
//
//        public void login (String user, String pass){
//
//            WebDriverWait wait = new WebDriverWait(driver, 5);
//            final WebElement usernameEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAccessibilityId(usernameID)));
//
//            usernameEdit.click();
//            usernameEdit.sendKeys(user);
//
//            WebElement passwordEdit = driver.findElementByAccessibilityId(passwordID);
//            passwordEdit.click();
//            passwordEdit.sendKeys(pass);
//
//            WebElement submitButton = driver.findElementByAccessibilityId(submitButtonID);
//            submitButton.click();
//        }
//
//        public boolean isOnProductsPage () {
//            //Create an instance of a Appium explicit wait so that we can dynamically wait for an element
//            WebDriverWait wait = new WebDriverWait(driver, 5);
//
//            //wait for the product field to be visible and store that element into a variable
//            try {
//                wait.until(ExpectedConditions.visibilityOfElementLocated(ProductTitle));
//            } catch (TimeoutException e) {
//                System.out.println("*** Timed out waiting for product page to load.");
//                return false;
//            }
//            return true;
//        }
//    }
//
//
//
//
//
//
//
//
//




import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class browserStack {

    public static String userName = "humairaperveen_eDkjAo";
    public static String accessKey = "D18cPwBJdBePXSBwjUSw";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "Browser stack");
        caps.setCapability("build", "New browserstack");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("app", "bs://8390cca1023a959695bff7f1467d3ae3c2364245");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Username")));
        searchElement.sendKeys("standard_user");
        AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Password")));
        insertTextElement.sendKeys("secret_sauce");
        AndroidElement searchElement1 = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-LOGIN")));
        searchElement1.click();
        Thread.sleep(5000);

//        List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//        assert(allProductsName.size() > 0);

        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}
