package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SSLCertificateErrorHandler {

    public static void handleSSLCertificate(WebDriver driver) {


        WebElement info_sec = driver.findElement(By.linkText("Informations"));

        if (info_sec.isDisplayed())
            info_sec.click();
        driver.get("javascript:document.getElementById('overridelink').click();");

    }

}
