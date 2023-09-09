package com.qsp.vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutOption;
	
	@FindBy(linkText = "Leads")
	private WebElement leadModule;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationsModule;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsModule;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesModule;
	
	@FindBy(linkText = "Products")
	private WebElement productsModule;
	
	@FindBy(linkText = "More")
	private WebElement moreDropdown;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsModule;
	
	@FindBy(linkText = "Vendors")
	private WebElement vendorsModule;
	
	@FindBy(linkText = "Invoice")
	private WebElement invoiceModule;
	
	@FindBy(linkText = "Quotes")
	private WebElement quotesModule;

	
	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}



	public WebElement getSignOutOption() {
		return signOutOption;
	}



	public WebElement getLeadModule() {
		return leadModule;
	}



	public WebElement getOrganizationsModule() {
		return organizationsModule;
	}



	public WebElement getContactsModule() {
		return contactsModule;
	}



	public WebElement getOpportunitiesModule() {
		return opportunitiesModule;
	}



	public WebElement getProductsModule() {
		return productsModule;
	}



	public WebElement getMoreDropdown() {
		return moreDropdown;
	}



	public WebElement getCampaignsModule() {
		return campaignsModule;
	}



	public WebElement getVendorsModule() {
		return vendorsModule;
	}



	public WebElement getInvoiceModule() {
		return invoiceModule;
	}



	public WebElement getQuotesModule() {
		return quotesModule;
	}


	public void clickOnLeadModule() {
		leadModule.click();
	}
	
	public void clickOnOrganizationsModule() {
		organizationsModule.click();
	}
	
	public void clickOnContactsModule() {
		contactsModule.click();
	}
	
	public void clickOnOpportunitiesModule() {
		opportunitiesModule.click();
	}
	
	public void clickOnProductsModule() {
		productsModule.click();
	}
	
	public void mouseHoverOnMoreDropdown() {
		new Actions(driver).moveToElement(moreDropdown).perform();
	}
	
	public void clickOnCampaignModule() {
		mouseHoverOnMoreDropdown();
		campaignsModule.click();
	}
	
	public void clickOnVendorModule() {
		mouseHoverOnMoreDropdown();
		vendorsModule.click();
	}
	
	public void clickOnInvoiceModule() {
		mouseHoverOnMoreDropdown();
		invoiceModule.click();
	}
	
	public void clickOnQuotesModule() {
		mouseHoverOnMoreDropdown();
		quotesModule.click();
	}

	public void logoutAction() {
		new Actions(driver).moveToElement(administratorIcon).perform();
		signOutOption.click();
		}
	
	
}
