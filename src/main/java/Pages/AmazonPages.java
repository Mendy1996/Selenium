package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AmazonPages extends BasePage{
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement champRechercheLocator;
	
	
	@FindBy(xpath = "//input[@value='Go']")
	private WebElement bouttonRechercher;
    
 

    public AmazonPages() {
        super();
        PageFactory.initElements(getDriver(), this);
        //verifier La page
    }

    public void rechercher(String recherche){
    	champRechercheLocator.getTagName();
        this.champRechercheLocator.sendKeys(recherche);
        this.bouttonRechercher.click();
        
        
    }

}
