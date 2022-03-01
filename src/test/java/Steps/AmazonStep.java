package Steps;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.AmazonPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Lorsque;

public class AmazonStep extends BaseStep{
	AmazonPages amazonPages = new AmazonPages();
	
	
	
	public AmazonStep() {
		super();		
	}

	@Given("^Launch Amazon$")
    public void beforeTest() throws InterruptedException
    {
    	//System.setProperty("webdriver.chrome.driver","src/test/ressources/driver/chromedriver2.exe");
		//WebDriver driver = new ChromeDriver();
		amazonPages.driver.get("https://www.amazon.fr/");
		amazonPages.driver.manage().deleteAllCookies();
		amazonPages.driver.manage().window().maximize();
		Thread.sleep(5000); 
    }


	
	@When("^le mot \\\"(.*)\\\" est recherche$")
    public void rechercheUnObjet(String produit) {
		System.out.println(produit);
		amazonPages.rechercher(produit);
    }
	
    
	
	


}
