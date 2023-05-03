package cc11;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class q11 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriverManager.firefoxdriver().setup();
				//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
				//firefoxOptions =new ChromeOptions();
				//co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.saucedemo.com/");

					driver.get ("https://www.saucedemo.com/");
					driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
					driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
					String initial = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
					driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
					String cart =  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
					if(cart.equals(initial)) {
						System.out.println("successfully product added to the cart");
						
					}
					else {
						System.out.println("oops");
						
					}
					String check_cart = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).getText();
					System.out.println(check_cart);
					if(check_cart.equals("Continue Shopping")) {
						System.out.println("hey ! cart is open smoothly ");
						
					}
					else {
						System.out.println("oops");
						
					}
					driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
					String checkout = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
					if(checkout.equals("Checkout: Your Information")) {
						System.out.println("my information displayed");
						
					}
					else {
						System.out.println("oops");
						
					}
					driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("TharigaSri");
					driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("p r");
					driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("641008");
					driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
					String product_name = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText(); 
					String product_price = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
					if(product_name.equals(cart)) {
						System.out.println("entire product overview is displayed");
						System.out.println("product Name"+product_name);
						System.out.println("product price"+product_price);
					}
					else {
						System.out.println(cart);
						System.out.println(product_name);
					}
					String title = driver.getTitle();
					if(title.equals("Swag Labs")) {
						System.out.println("title matched");
					}
					else {
						System.out.println("title mismatched");
					}
					if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
						System.out.println("url matched");
					}
					else {
						System.out.println("url mismatched");

			}
			}
		}
			

