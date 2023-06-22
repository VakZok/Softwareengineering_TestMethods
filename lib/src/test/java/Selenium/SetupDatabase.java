package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetupDatabase {
    public static void main(String[] args) {
    	// Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "/opt/homebrew/bin/geckodriver");

        // Create an instance of FirefoxDriver
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false); // Run the browser with GUI (not headless)
        WebDriver driver = new FirefoxDriver(options);

        // Perform actions or navigate to a specific URL
        driver.get("localhost:8081/index.html");

        // Perform actions or test scenarios for each movie
        try {
        	// Movie 1 - Parasite
        	setMovieInput(driver, "Parasite", "A darkly comedic tale of two families from different social classes that intertwine in unexpected ways.", "15", "Drama");

        	// Movie 2 - Joker
        	setMovieInput(driver, "Joker", "An origin story of the iconic Batman villain that delves into the psyche of a troubled man.", "18", "Crime, Drama");

        	// Movie 3 - 1917
        	setMovieInput(driver, "1917", "Two young British soldiers are sent on a dangerous mission to deliver a message during World War I.", "15", "War, Drama");

        	// Movie 4 - Knives Out
        	setMovieInput(driver, "Knives Out", "A renowned detective investigates the death of a wealthy crime novelist's family.", "12", "Mystery, Comedy");

        	// Movie 5 - The Irishman
        	setMovieInput(driver, "The Irishman", "A mob hitman reflects on his involvement in the disappearance of union boss Jimmy Hoffa.", "18", "Crime, Drama");

        	// Movie 6 - Once Upon a Time... in Hollywood
        	setMovieInput(driver, "Once Upon a Time... in Hollywood", "A faded TV actor and his stunt double navigate the changing landscape of late 1960s Hollywood.", "18", "Comedy, Drama");

        	// Movie 7 - Marriage Story
        	setMovieInput(driver, "Marriage Story", "A heartfelt exploration of a couple's journey through the trials of divorce.", "15", "Drama");

        	// Movie 8 - Little Women
        	setMovieInput(driver, "Little Women", "Four sisters come of age in America in the aftermath of the Civil War.", "7", "Drama, Romance");

        	// Movie 9 - Jojo Rabbit
        	setMovieInput(driver, "Jojo Rabbit", "A young boy in Hitler's army finds out his mother is hiding a Jewish girl in their attic.", "12", "Comedy, Drama");

        	// Movie 10 - Ford v Ferrari
        	setMovieInput(driver, "Ford v Ferrari", "The true story of the visionary American car designer Carroll Shelby and the fearless British driver Ken Miles.", "12", "Biography, Drama");

        	// Movie 11 - The Gentlemen
        	setMovieInput(driver, "The Gentlemen", "A British drug lord tries to sell off his highly profitable empire to a dynasty of Oklahoma billionaires.", "18", "Crime, Action");

        	// Movie 12 - The Farewell
        	setMovieInput(driver, "The Farewell", "A Chinese family keeps their matriarch's terminal illness a secret during a family gathering.", "PG", "Comedy, Drama");

        	// Movie 13 - Rocketman
        	setMovieInput(driver, "Rocketman", "A musical fantasy about the uncensored human story of Elton John's breakthrough years.", "15", "Biography, Drama");

        	// Movie 14 - Uncut Gems
        	setMovieInput(driver, "Uncut Gems", "A charismatic jeweler makes a high-stakes bet that could lead to the windfall of a lifetime.", "18", "Crime, Drama");

        	// Movie 15 - Portrait of a Lady on Fire
        	setMovieInput(driver, "Portrait of a Lady on Fire", "A forbidden affair between an artist and her subject unfolds on an isolated island in 18th-century France.", "15", "Drama, Romance");

        	// Movie 16 - Bombshell
        	setMovieInput(driver, "Bombshell", "The real-life story of the women who brought down Fox News CEO Roger Ailes for sexual harassment.", "15", "Drama, Biography");

        	// Movie 17 - Waves
        	setMovieInput(driver, "Waves", "The journey of a suburban African-American family as they navigate love, forgiveness, and coming together in the face of tragedy.", "15", "Drama");

        	// Movie 18 - Honey Boy
        	setMovieInput(driver, "Honey Boy", "A young actor struggles to reconcile with his abusive past and confront his inner demons.", "15", "Drama");

        	// Movie 19 - The Lighthouse
        	setMovieInput(driver, "The Lighthouse", "Two lighthouse keepers on a remote island descend into madness as they face isolation and supernatural occurrences.", "15", "Drama, Fantasy");

        	// Movie 20 - Pain and Glory
        	setMovieInput(driver, "Pain and Glory", "A film director reflects on his life choices and artistic achievements as his health deteriorates.", "15", "Drama");

        	// Movie 21 - The Two Popes
        	setMovieInput(driver, "The Two Popes", "A fictionalized account of Pope Benedict XVI and Pope Francis' relationship and their differing visions for the Church.", "12", "Biography, Drama");

        	// Movie 22 - Judy
        	setMovieInput(driver, "Judy", "A biographical drama following the legendary performer Judy Garland during her final concerts in London.", "12", "Biography, Drama");

        	// Movie 23 - Midsommar
        	setMovieInput(driver, "Midsommar", "A couple travels to a Swedish village for a festival that takes a sinister turn.", "18", "Horror, Drama");

        	// Movie 24 - Dark Waters
        	setMovieInput(driver, "Dark Waters", "A corporate defense attorney takes on an environmental lawsuit against a chemical company.", "12", "Biography, Drama");

        	// Movie 25 - Richard Jewell
        	setMovieInput(driver, "Richard Jewell", "The story of a security guard who became a hero after saving lives during the 1996 Olympics bombing, only to be wrongly accused.", "15", "Biography, Drama");

        	// Movie 26 - The King
        	setMovieInput(driver, "The King", "Hal, a wayward prince, ascends the throne and must navigate the palace politics, chaos, and war.", "15", "Biography, Drama");

        	// Movie 27 - Just Mercy
        	setMovieInput(driver, "Just Mercy", "A young lawyer fights to prove the innocence of a man sentenced to death row.", "12", "Drama, Biography");

        	// Movie 28 - Queen & Slim
        	setMovieInput(driver, "Queen & Slim", "A couple's first date takes an unexpected turn when they are pulled over by a police officer.", "15", "Drama, Crime");

        	// Movie 29 - Atlantics
        	setMovieInput(driver, "Atlantics", "In a suburb of Dakar, a young woman's lover goes missing after attempting to migrate to Europe by sea.", "15", "Drama, Fantasy");

        	// Movie 30 - The Invisible Man
        	setMovieInput(driver, "The Invisible Man", "A woman believes she is being stalked by her abusive and invisible ex-boyfriend.", "15", "Horror, Mystery");

            // Wait to view results
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void setMovieInput(WebDriver driver, String title, String description, String ageRating, String genre) {
        // Set the title
        WebElement textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[1]"));
        textField.click();
        textField.sendKeys(title);
        sleep(1000);

        // Set description
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/textarea"));
        textField.sendKeys(description);
        sleep(1000);

        // Set age rating
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[2]"));
        textField.sendKeys(ageRating);
        sleep(1000);

        // Set genre
        textField = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[3]"));
        textField.sendKeys(genre);
        sleep(1000);

        // Submit input
        WebElement buttonElement = driver.findElement(By.xpath("/html/body/div/section[1]/form/input[2]"));
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
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

