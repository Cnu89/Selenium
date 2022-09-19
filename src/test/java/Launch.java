import org.openqa.selenium.By;

public class Launch {
    public static void main(String[] args) {
        Launchbrowser obj=new Launchbrowser();
        obj.Browserchrome();

        obj.Openurl("https://www.amazon.in");

       obj.Verifyelement(By.xpath("//a[text()='Sell']"));

       obj.Clickelement(By.xpath("//a[text()='Mobiles']"));
       obj.Clickelement(By.xpath("//span[text()='OnePlus']/../div/label/i"));
       obj.Clickelement(By.xpath("//div[@data-index='1']//h2/a"));

       obj.Switchtonewwindow();

       obj.Verifyelement(By.cssSelector("#productTitle"));

       obj.Clickelement(By.xpath("//input[@id='add-to-cart-button']"));
       obj.Clickelement(By.xpath("//input[@name='proceedToRetailCheckout']"));

    }
}
