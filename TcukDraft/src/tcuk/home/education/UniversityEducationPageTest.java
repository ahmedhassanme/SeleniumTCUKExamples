package tcuk.home.education;

import org.testng.annotations.Test;

import tcuk.GlobalTests;

public class UniversityEducationPageTest extends GlobalTests
{
//////////////////////////
//////CLASS SPECIFIC METHODS/////////////////////////////////////
	//////////////////////////
	
	@Test
	public void openPage() throws InterruptedException
	{
		selenium.open("/");
		selenium.click("link=News");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Education");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=University Education");
		selenium.waitForPageToLoad("30000");
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void header()
	{
		checkHeader();
		assertEquals("University education news", selenium.getText("//div[@id='tmglPageTitleImageLeft']/h1"));
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
	public void topBar()
	{
		checkTopBar();
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
	public void secondaryNavigation() throws Exception
	{
		checkSecondaryNavigationNews();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void tertiaryNavigation() throws Exception
	{
		checkTertiaryNavigationEducation();
	}
	
	/*@Test(dependsOnMethods = { "openPage" })
	public void puff()
	{
		checkPuff();
	}*/
	
	@Test(dependsOnMethods = { "openPage" })
	public void mpu()
	{
		checkMpu();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void mostViewed()
	{
		checkMostViewed();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void adSky()
	{
		checkAd();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void editorsChoice()
	{
		checkEditorsChoice();
	}
	
	/*@Test(dependsOnMethods = { "openPage" })
	public void googleAds()
	{
		checkGoogleAds();
	}*/
	
	@Test(dependsOnMethods = { "openPage" })
	public void moreFromTelegraph()
	{
		checkMoreFromTelegraph();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void backToTop()
	{
		checkBackToTop();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void hotTopics()
	{
		checkHotTopics();
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
