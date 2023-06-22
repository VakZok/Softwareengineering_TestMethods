package Selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTests {
	
	private static WebDriver driver;
	
	@BeforeAll
    public static void setUp() {
        // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "/opt/homebrew/bin/geckodriver");

        // Set Firefox options
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false); // Run the browser in headless mode (without GUI)

        // Create a new FirefoxDriver instance
        driver = new FirefoxDriver(options);
        
        // Navigate to a specific URL
        driver.get("localhost:8081/index.html");
        sleep(1000);
    }
    
    @Test
    public void createVideoInput() {
    	// Set the title
        WebElement textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[1]"));
        textField.click();
        textField.sendKeys("A Test Title");
        sleep(1000);

        // Set description
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/textarea"));
        textField.sendKeys("Hier könnte Ihre Werbung stehen.");
        sleep(1000);

        // Set age rating
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[2]"));
        textField.sendKeys("18");
        sleep(1000);

        // Set genre
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[3]"));
        textField.sendKeys("Action");
        sleep(1000);

        // Submit input
        WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"newVideoButton\"]"));
        buttonElement.click();
        
        // Clear all textfields
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[1]"));
        textField.clear();
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/textarea"));
        textField.clear();
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[2]"));
        textField.clear();
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[3]"));
        textField.clear();
        
        sleep(5000);
    }
    
    @Test
    public void searchForTitle() {
    	// Search for title
    	WebElement textField = driver.findElement(By.xpath("/html/body/div/section[2]/div/div[2]/label/input"));
    	textField.click();
    	textField.sendKeys("Jus");
    	sleep(6000);
    	textField.clear();
    				
    	// Search for description
    	textField.sendKeys("XVI");
    	sleep(6000);
    	textField.clear();
    				
    	// Search for age_rating
    	textField.sendKeys("12");
    	sleep(6000);
    	textField.clear();
    				
    	// Search for age_rating
    	textField.sendKeys("Action");
    							
    	sleep(5000);
    }
    
    @Test
    public void switchingSides_changingEntryAmount() {
    	// Switch to next side
    	WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"videotable_next\"]"));
    	buttonElement.click();
    	sleep(4000);
    							
    	// Switch to previous side
    	buttonElement = driver.findElement(By.xpath("//*[@id=\"videotable_previous\"]"));
    	buttonElement.click();
    	sleep(4000);
    				
    	// Change amount of entries from 10 to 50
    	buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/label/select"));
    	buttonElement.click();
    	sleep(2000);
    				
    	buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/label/select/option[3]"));
    	buttonElement.click();
    	sleep(1000);
    				
    	// Perform scrolling action using the "Down" key
    	Actions actions = new Actions(driver);
    	for(int i=0; i<=30; i++) {
    		actions.sendKeys(Keys.DOWN).perform();
    		sleep(100);
    	}
    							
    	sleep(5000);
    }
    
    @Test
    public void orderByX() {
    	// By the title asc/desc
    	WebElement buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/table/thead/tr/th[1]"));
    	sleep(2000);
    	buttonElement.click();
    	sleep(2000);
    				
    	// By the description asc/desc
    	buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/table/thead/tr/th[2]"));
    	buttonElement.click();
    	sleep(2000);
    	buttonElement.click();
    	sleep(2000);
    							
    	// By the title asc/desc
    	buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/table/thead/tr/th[3]"));
    	buttonElement.click();
    	sleep(2000);
    	buttonElement.click();
    	sleep(2000);
    							
    	// By the title asc/desc
    	buttonElement = driver.findElement(By.xpath("/html/body/div/section[2]/div/table/thead/tr/th[4]"));
    	buttonElement.click();
    	sleep(2000);
    	buttonElement.click();
    							
    	sleep(5000);
    }
    
    
    @AfterAll
    public static void tearDown() {
        // Close the browser
        driver.quit();
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
