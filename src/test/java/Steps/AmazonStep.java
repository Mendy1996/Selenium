package Steps;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.fr.Lorsque;

public class AmazonStep {
	
	@Given("^Launch Amazon$")
	public void launchAmazon() {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/driver/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.fr/");
		driver.manage().window().maximize();
		//Assert.assertTrue(driver.getTitle().equals("Amazon.fr : livres, DVD, jeux vidéo, musique, high-tech, informatique, jouets, vêtements, chaussures, sport, bricolage, maison, beauté, puériculture, épicerie et plus encore !"));
	}
	


}
