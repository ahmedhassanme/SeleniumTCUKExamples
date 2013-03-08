package tcuk.home.comment;

import org.testng.annotations.Test;

import tcuk.GlobalTests;

public class BlogsPageTest extends GlobalTests
{
	//////////////////////////
//////CLASS SPECIFIC METHODS/////////////////////////////////////
	//////////////////////////
	
	@Test
	public void openPage() throws InterruptedException
	{
		selenium.open("/");
		selenium.click("link=Comment");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Blogs");
		selenium.waitForPageToLoad("30000");
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void topBar()
	{
		verifyTrue(selenium.isElementPresent("tmglTopBar"));
		verifyTrue(selenium.isVisible("tmglTopBar"));
		
		verifyTrue(selenium.isElementPresent("tmglTopLeft"));
		verifyTrue(selenium.isVisible("tmglTopLeft"));
		
		String temp = selenium.getText("tmglTopLeft");
		verifyTrue(temp.contains("Blog Feed"));
		verifyTrue(temp.contains("All Feeds"));
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void header()
	{
		verifyTrue(selenium.isElementPresent("//div[@class='storyHead']"));
		verifyTrue(selenium.isVisible("//div[@class='storyHead']"));
		assertEquals("Telegraph Blogs", selenium.getText("//div[@class='storyHead']"));
	}

	//////////////////////////
//////GLOBAL METHODS/////////////////////////////////////////////
	//////////////////////////
	
	@Test(dependsOnMethods = { "openPage" })
	public void banner()
	{
		checkBanner();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void brand()
	{
		checkBrand();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void primaryNavigation()
	{
		checkPrimaryNavigation();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void secondaryNavigation()
	{
		checkSecondaryNavigationComment();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void mpu()
	{
		checkMpu();
	}
	
	/*@Test(dependsOnMethods = { "openPage" })
	public void adSky()
	{
		checkAd();
	}*/
	
	@Test(dependsOnMethods = { "openPage" })
	public void backToTop()
	{
		checkBackToTop();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void footer1stColumn()
	{
		checkFooter1stColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer2ndColumn()
	{
		checkFooter2ndColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer3rdColumn()
	{
		checkFooter3rdColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer4thColumn()
	{
		checkFooter4thColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer5thColumn()
	{
		checkFooter5thColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer6thColumn()
	{
		checkFooter6thColumn();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void footerBottom()
	{
		checkFooterBottom();
	}
}
