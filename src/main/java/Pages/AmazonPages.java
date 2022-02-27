package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AmazonPages extends BasePage{
	
    private By champRechercheLocator = By.id("twotabsearchtextbox");
    private By bouttonRechercher = By.xpath("//input[@value='Go']");

    public AmazonPages(WebDriver driver) {
        super(driver);
        //verifier La page
    }

    public void rechercher(String recherche){
        setText(champRechercheLocator,recherche);
        clickElement(bouttonRechercher);
        
        
    }

}
