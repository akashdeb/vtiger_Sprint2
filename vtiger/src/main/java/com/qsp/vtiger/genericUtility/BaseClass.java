package com.qsp.vtiger.genericUtility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qsp.vtiger.pomRepository.HomePage;
import com.qsp.vtiger.pomRepository.LoginPage;
import com.mysql.jdbc.Driver;
import com.qsp.vtiger.genericUtility.WebDriverUtility;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	public WebDriverUtility wUtils = new WebDriverUtility();
	public DataBaseUtility dbUtils = new DataBaseUtility();

	public static WebDriver sDriver;
	public Connection connection;

	@BeforeSuite(groups = {"smoke", "regression"})
	public void bsConfig() throws SQLException {
		// 1. Creating an object of Driver of MY SQL vendor
		Driver dataBaseDriver = new Driver();
		// 2. Registering driver to JDBC API
		DriverManager.registerDriver(dataBaseDriver);
		// 3. Establishing connection with the data base
		connection = DriverManager.getConnection(IPathConstant.DATABASE_URL, IPathConstant.DATABASE_USERNAME, IPathConstant.DATABASE_PASSWORD);
		System.out.println("Data Base Connection has been exstablish");
	}

	@BeforeTest(groups = {"smoke", "regression"})
	public void btConfig() {
		System.out.println("Parallel Execution has been started");
	}
	
	@Parameters("browser")
	@BeforeClass(groups = {"smoke", "regression"})
	public void bcConfig(String browser) throws IOException {
		
		System.out.println("The parameter value ==================== "+browser);
		//String browser = fUtils.fetchDataFromPropertyFile("browser");
		String url = fUtils.fetchDataFromPropertyFile("url");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		else
			System.out.println("The browser is not present");
		sDriver = driver;
		wUtils.maximizeTheWindow(driver);
		wUtils.implicitWait(driver);
		driver.get(url);

	}

	@BeforeMethod(groups = {"smoke", "regression"})
	public void bmConfig() throws IOException {

		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");

		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);

		System.out.println("Login is Successfull");

	}

	@AfterMethod(groups = {"smoke", "regression"})
	public void amConfig() {
		HomePage home = new HomePage(driver);
		home.logoutAction();

	}

	@AfterClass(groups = {"smoke", "regression"})
	public void acConfig() {
		driver.quit();
	}

	@AfterTest(groups = {"smoke", "regression"})
	public void atConfig() {
		System.out.println("Close the Parallel Execution");
	}

	@AfterSuite(groups = {"smoke", "regression"})
	public void asConfig() throws SQLException {
		connection.close();

		System.out.println("The Data base has been closed");
	}
}
