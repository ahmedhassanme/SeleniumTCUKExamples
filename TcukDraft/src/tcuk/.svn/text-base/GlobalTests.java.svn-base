package tcuk;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;

public class GlobalTests extends SeleneseTestCase 
{
	protected static Selenium selenium;
	
	/*@BeforeSuite
	public static void startUp()
	{
		if(selenium==null)
		 {
			 selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.telegraph.co.uk");
			 selenium.start();
			 selenium.open("http://www.telegraph.co.uk");
		 }
	}*/
	
	@BeforeSuite
	public void startUp()
	{
		if(selenium==null)
		 {
			 selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.telegraph.co.uk");
			 selenium.start();
			 selenium.open("http://www.telegraph.co.uk");
		 }
	}
	
	@AfterSuite
	public void shutDown() throws Exception
	{
		
		selenium.close();
		selenium.stop();
	}
	
	/*@AfterSuite
	public static void shutDown()
	{
		selenium.close();
		selenium.stop();
	}*/
	
	public void checkBanner()
	{
		assertTrue(selenium.isElementPresent("banner"));
		assertTrue(selenium.isVisible("banner"));
	}
	
	public void checkTopBar()
	{
		assertTrue(selenium.isElementPresent("tmglTopBar"));
		assertTrue(selenium.isVisible("tmglTopBar"));
		
		assertTrue(selenium.isElementPresent("tmglLasUpdatedDateFeed"));
		assertTrue(selenium.isVisible("tmglLasUpdatedDateFeed"));
		
		assertTrue(selenium.isElementPresent("regDetails"));
		assertTrue(selenium.isVisible("regDetails"));
	}
	
	public void checkBrand()
	{
		assertTrue(selenium.isElementPresent("tmglBrandLarge"));
		assertTrue(selenium.isVisible("tmglBrandLarge"));
		
		assertTrue(selenium.isElementPresent("brand"));
		assertTrue(selenium.isVisible("brand"));
		
		assertTrue(selenium.isElementPresent("searchBar"));
		assertTrue(selenium.isVisible("searchBar"));
	}
	
	public void checkHeader()
	{
		assertTrue(selenium.isElementPresent("tmglPageTitle"));
		assertTrue(selenium.isVisible("tmglPageTitle"));
	}
	
	public void checkPrimaryNavigation()
	{
		assertTrue(selenium.isElementPresent("link=Home"));
		assertTrue(selenium.isElementPresent("link=News"));
		assertTrue(selenium.isElementPresent("link=Sport"));
		assertTrue(selenium.isElementPresent("link=Finance"));
		assertTrue(selenium.isElementPresent("link=Comment"));
		assertTrue(selenium.isElementPresent("link=Culture"));
		assertTrue(selenium.isElementPresent("link=Travel"));
		assertTrue(selenium.isElementPresent("link=Lifestyle"));
		assertTrue(selenium.isElementPresent("link=Fashion"));
		assertTrue(selenium.isElementPresent("link=Technology"));
		assertTrue(selenium.isElementPresent("link=Jobs"));
		assertTrue(selenium.isElementPresent("link=Dating"));
		assertTrue(selenium.isElementPresent("link=Offers"));
	}
	
	public void checkSecondaryNavigationNews()
	{
		assertTrue(selenium.isElementPresent("link=UK"));
		assertTrue(selenium.isElementPresent("link=World"));
		assertTrue(selenium.isElementPresent("link=Politics"));
		assertTrue(selenium.isElementPresent("link=Obituaries"));
		assertTrue(selenium.isElementPresent("link=Royal Wedding"));
		assertTrue(selenium.isElementPresent("link=Earth"));
		assertTrue(selenium.isElementPresent("link=Science"));
		assertTrue(selenium.isElementPresent("link=Health News"));
		assertTrue(selenium.isElementPresent("link=Education"));
		assertTrue(selenium.isElementPresent("link=Celebrities"));
		assertTrue(selenium.isElementPresent("link=Weird News"));
		assertTrue(selenium.isElementPresent("link=News Blogs"));
	}
	
	public void checkSecondaryNavigationSport()
	{
		assertTrue(selenium.isElementPresent("link=Olympics"));
		assertTrue(selenium.isElementPresent("link=Football"));
		assertTrue(selenium.isElementPresent("link=Six Nations"));
		assertTrue(selenium.isElementPresent("link=Cricket"));
		assertTrue(selenium.isElementPresent("link=Formula One"));
		assertTrue(selenium.isElementPresent("link=Tennis"));
		assertTrue(selenium.isElementPresent("link=Boxing and MMA"));
		assertTrue(selenium.isElementPresent("link=Rugby Union"));
		assertTrue(selenium.isElementPresent("link=Golf"));
		assertTrue(selenium.isElementPresent("link=Racing"));
		assertTrue(selenium.isElementPresent("link=Cycling"));
		assertTrue(selenium.isElementPresent("link=Fantasy"));
	}
	
	public void checkSecondaryNavigationFinance()
	{
		assertTrue(selenium.isElementPresent("link=Companies"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglSecondNav']/ul/li[2]/a"));
		assertTrue(selenium.isElementPresent("link=Personal Finance"));
		assertTrue(selenium.isElementPresent("link=Economics"));
		assertTrue(selenium.isElementPresent("link=Markets"));
		assertTrue(selenium.isElementPresent("link=Your Business"));
		assertTrue(selenium.isElementPresent("link=Olympics business"));
		assertTrue(selenium.isElementPresent("link=Fund Game"));
		assertTrue(selenium.isElementPresent("link=Business Club"));
		assertTrue(selenium.isElementPresent("link=Blogs"));
		assertTrue(selenium.isElementPresent("link=Blogs"));
	}
	
	public void checkSecondaryNavigationComment()
	{
		assertTrue(selenium.isElementPresent("link=Blogs"));
		assertTrue(selenium.isElementPresent("link=Columnists"));
		assertTrue(selenium.isElementPresent("link=Personal View"));
		assertTrue(selenium.isElementPresent("link=Telegraph View"));
		assertTrue(selenium.isElementPresent("link=Letters"));
		assertTrue(selenium.isElementPresent("link=Cartoons Archive"));
		assertTrue(selenium.isElementPresent("link=My Telegraph"));
	}
	
	public void checkSecondaryNavigationCulture()
	{
		assertTrue(selenium.isElementPresent("link=Film"));
		assertTrue(selenium.isElementPresent("link=Music"));
		assertTrue(selenium.isElementPresent("link=Art"));
		assertTrue(selenium.isElementPresent("link=Books"));
		assertTrue(selenium.isElementPresent("link=TV and Radio"));
		assertTrue(selenium.isElementPresent("link=Hay Festival"));
		assertTrue(selenium.isElementPresent("link=Theatre"));
		assertTrue(selenium.isElementPresent("link=Dance"));
		assertTrue(selenium.isElementPresent("link=Photography"));
		assertTrue(selenium.isElementPresent("link=Comedy"));
		assertTrue(selenium.isElementPresent("link=Pictures"));
		assertTrue(selenium.isElementPresent("link=Video"));
	}
	
	public void checkSecondaryNavigationTravel()
	{
		assertTrue(selenium.isElementPresent("link=Travel News"));
		assertTrue(selenium.isElementPresent("link=Advice"));
		assertTrue(selenium.isElementPresent("link=Destinations"));
		assertTrue(selenium.isElementPresent("link=Holiday Types"));
		assertTrue(selenium.isElementPresent("link=Cities"));
		assertTrue(selenium.isElementPresent("link=Cruises"));
		assertTrue(selenium.isElementPresent("link=Hotels"));
		assertTrue(selenium.isElementPresent("link=Picture Galleries"));
		assertTrue(selenium.isElementPresent("link=Snow and Ski"));
		assertTrue(selenium.isElementPresent("link=Video"));
		assertTrue(selenium.isElementPresent("link=Expat"));
	}
	
	public void checkSecondaryNavigationLifestyle()
	{
		assertTrue(selenium.isElementPresent("link=Motoring"));
		assertTrue(selenium.isElementPresent("link=Health"));
		assertTrue(selenium.isElementPresent("link=Property"));
		assertTrue(selenium.isElementPresent("link=Gardening"));
		assertTrue(selenium.isElementPresent("link=Food and Drink"));
		assertTrue(selenium.isElementPresent("link=Family"));
		assertTrue(selenium.isElementPresent("link=Outdoors"));
		assertTrue(selenium.isElementPresent("link=Relationships"));
		assertTrue(selenium.isElementPresent("link=Expat"));
		assertTrue(selenium.isElementPresent("link=Announcements"));
		assertTrue(selenium.isElementPresent("link=Puzzles"));
	}
	
	public void checkSecondaryNavigationTechnology()
	{
		assertTrue(selenium.isElementPresent("link=Technology News"));
		assertTrue(selenium.isElementPresent("link=Technology Companies"));
		assertTrue(selenium.isElementPresent("link=Technology Reviews"));
		assertTrue(selenium.isElementPresent("link=Video Games"));
		assertTrue(selenium.isElementPresent("link=Start-Up 100"));
		assertTrue(selenium.isElementPresent("link=Technology Video"));
		assertTrue(selenium.isElementPresent("link=Technology Blogs"));
	}
	
	public void checkTertiaryNavigationUk()
	{
		assertTrue(selenium.isElementPresent("link=Royal Family"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[2]/a"));
		assertTrue(selenium.isElementPresent("link=Religion"));
		assertTrue(selenium.isElementPresent("link=Road and Rail"));
		assertTrue(selenium.isElementPresent("link=Defence"));
		assertTrue(selenium.isElementPresent("link=Scotland"));
		assertTrue(selenium.isElementPresent("link=Northern Ireland"));
	}
	
	public void checkTertiaryNavigationPolitics()
	{
		assertTrue(selenium.isElementPresent("link=Election Results Map"));
		assertTrue(selenium.isElementPresent("link=UK Political Database"));
		assertTrue(selenium.isElementPresent("link=Political Parties"));
		assertTrue(selenium.isElementPresent("link=David Cameron"));
		assertTrue(selenium.isElementPresent("link=Nick Clegg"));
		assertTrue(selenium.isElementPresent("link=Ed Miliband"));
		assertTrue(selenium.isElementPresent("link=Local Elections 2011"));
	}
	
	public void checkTertiaryNavigationWorld()
	{
		assertTrue(selenium.isElementPresent("link=USA"));
		assertTrue(selenium.isElementPresent("link=US Politics"));
		assertTrue(selenium.isElementPresent("link=Asia"));
		assertTrue(selenium.isElementPresent("link=China"));
		assertTrue(selenium.isElementPresent("link=Central Asia"));
		assertTrue(selenium.isElementPresent("link=Europe"));
		assertTrue(selenium.isElementPresent("link=Australasia"));
		assertTrue(selenium.isElementPresent("link=Middle East"));
		assertTrue(selenium.isElementPresent("link=Africa"));
		assertTrue(selenium.isElementPresent("link=South America"));
	}
	
	public void checkTertiaryNavigationObituaries()
	{
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[1]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[2]/a"));
		assertTrue(selenium.isElementPresent("link=Military"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[5]/a"));
		assertTrue(selenium.isElementPresent("link=Religion"));
		assertTrue(selenium.isElementPresent("link=Royalty"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[8]/a"));
		assertTrue(selenium.isElementPresent("link=Medicine"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[10]/a"));
		assertTrue(selenium.isElementPresent("link=Celebrity"));
		assertTrue(selenium.isElementPresent("link=Law"));
	}
	
	public void checkTertiaryNavigationEarth()
	{
		assertTrue(selenium.isElementPresent("link=Earth News"));
		assertTrue(selenium.isElementPresent("link=Environment"));
		assertTrue(selenium.isElementPresent("link=Climate Change"));
		assertTrue(selenium.isElementPresent("link=Wildlife"));
		assertTrue(selenium.isElementPresent("link=Outdoors"));
		assertTrue(selenium.isElementPresent("link=Picture Galleries"));
	}
	
	public void checkTertiaryNavigationScience()
	{
		assertTrue(selenium.isElementPresent("link=Science News"));
		assertTrue(selenium.isElementPresent("link=Space"));
		assertTrue(selenium.isElementPresent("link=Roger Highfield"));
		assertTrue(selenium.isElementPresent("link=Dinosaurs"));
		assertTrue(selenium.isElementPresent("link=Evolution"));
		assertTrue(selenium.isElementPresent("link=Steve Jones"));
		assertTrue(selenium.isElementPresent("link=Science Picture Galleries"));
	}
	
	public void checkTertiaryNavigationHealth()
	{
		assertTrue(selenium.isElementPresent("link=Health News"));
		assertTrue(selenium.isElementPresent("link=Health Advice"));
		assertTrue(selenium.isElementPresent("link=Diet and Fitness"));
		assertTrue(selenium.isElementPresent("link=Wellbeing"));
		assertTrue(selenium.isElementPresent("link=Expat Health"));
		assertTrue(selenium.isElementPresent("link=Flu"));
		assertTrue(selenium.isElementPresent("link=Swine Flu"));
	}
	
	public void checkTertiaryNavigationEducation()
	{
		assertTrue(selenium.isElementPresent("link=Primary Education"));
		assertTrue(selenium.isElementPresent("link=Secondary Education"));
		assertTrue(selenium.isElementPresent("link=University Education"));
		assertTrue(selenium.isElementPresent("link=League Tables"));
		assertTrue(selenium.isElementPresent("link=Expat Education"));
	}
	
	public void checkTertiaryNavigationCompanies()
	{
		assertTrue(selenium.isElementPresent("link=Banks and Finance"));
		assertTrue(selenium.isElementPresent("link=Media and Telecoms"));
		assertTrue(selenium.isElementPresent("link=Retail"));
		assertTrue(selenium.isElementPresent("link=Transport"));
		assertTrue(selenium.isElementPresent("link=Construction"));
		assertTrue(selenium.isElementPresent("link=Industry"));
		assertTrue(selenium.isElementPresent("link=Energy"));
		assertTrue(selenium.isElementPresent("link=Pharmaceuticals"));
	}
	
	public void checkTertiaryNavigationComment()
	{
		assertTrue(selenium.isElementPresent("link=Evans-Pritchard"));
		assertTrue(selenium.isElementPresent("link=Jeff Randall"));
		assertTrue(selenium.isElementPresent("link=Damian Reece"));
		assertTrue(selenium.isElementPresent("link=Edmund Conway"));
		assertTrue(selenium.isElementPresent("link=Jeremy Warner"));
		assertTrue(selenium.isElementPresent("link=Richard Fletcher"));
		assertTrue(selenium.isElementPresent("link=Kamal Ahmed"));
	}
	
	public void checkTertiaryNavigationPersonalFinance()
	{
		assertTrue(selenium.isElementPresent("link=ISAs"));
		assertTrue(selenium.isElementPresent("link=Money-Saving Tips"));
		assertTrue(selenium.isElementPresent("link=Investing"));
		assertTrue(selenium.isElementPresent("link=Savings"));
		assertTrue(selenium.isElementPresent("link=Gold"));
		assertTrue(selenium.isElementPresent("link=Mortgages"));
		assertTrue(selenium.isElementPresent("link=Pensions"));
		assertTrue(selenium.isElementPresent("link=Personal Finance Video"));
		assertTrue(selenium.isElementPresent("link=Funds"));
		assertTrue(selenium.isElementPresent("link=Offshore Finance"));
	}
	
	public void checkTertiaryNavigationMarkets()
	{
		assertTrue(selenium.isElementPresent("link=Shares"));
		assertTrue(selenium.isElementPresent("link=Questor"));
		assertTrue(selenium.isElementPresent("link=Market Report"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[5]/a"));
	}
	
	public void checkTertiaryNavigationYourBusiness()
	{
		assertTrue(selenium.isElementPresent("link=Starting Out"));
		assertTrue(selenium.isElementPresent("link=Bright Ideas"));
		assertTrue(selenium.isElementPresent("link=Business Thinking"));
		assertTrue(selenium.isElementPresent("link=National Business Awards"));
	}
	
	public void checkTertiaryNavigationLondonOlympicsBusiness()
	{
		assertTrue(selenium.isElementPresent("link=People"));
		assertTrue(selenium.isElementPresent("link=Money"));
		assertTrue(selenium.isElementPresent("link=Sales"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[4]/a"));
		assertTrue(selenium.isElementPresent("link=Gloombusters"));
		assertTrue(selenium.isElementPresent("link=Business Club Video"));
		assertTrue(selenium.isElementPresent("link=Your Business Video"));
		assertTrue(selenium.isElementPresent("link=National Business Awards"));
	}
	
	public void checkTertiaryNavigationColumnists()
	{
		assertTrue(selenium.isElementPresent("link=Boris Johnson"));
		assertTrue(selenium.isElementPresent("link=Peter Oborne"));
		assertTrue(selenium.isElementPresent("link=Benedict Brogan"));
		assertTrue(selenium.isElementPresent("link=Charles Moore"));
		assertTrue(selenium.isElementPresent("link=Simon Heffer"));
		assertTrue(selenium.isElementPresent("link=Allison Pearson"));
		assertTrue(selenium.isElementPresent("link=Matthew d'Ancona"));
	}
	
	public void checkTertiaryNavigationFilm()
	{
		assertTrue(selenium.isElementPresent("link=Baftas"));
		assertTrue(selenium.isElementPresent("link=Oscars"));
		assertTrue(selenium.isElementPresent("link=Film Reviews"));
		assertTrue(selenium.isElementPresent("link=Cinema Trailers"));
		assertTrue(selenium.isElementPresent("link=Coming Soon"));
		assertTrue(selenium.isElementPresent("link=Talking Movies"));
		assertTrue(selenium.isElementPresent("link=Interviews"));
		assertTrue(selenium.isElementPresent("link=DVDs"));
		assertTrue(selenium.isElementPresent("link=Film Life"));
		assertTrue(selenium.isElementPresent("link=Film Video"));
	}
	
	public void checkTertiaryNavigationVideo()
	{
		assertTrue(selenium.isElementPresent("link=Culture Minute"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[2]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[3]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[4]/a"));
		assertTrue(selenium.isElementPresent("//a[contains(text(),'TV & Radio')]"));
		assertTrue(selenium.isElementPresent("//a[contains(text(),'Stage')]"));
		assertTrue(selenium.isElementPresent("//a[contains(text(),'Theatre Trailers')]"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[8]/a"));
	}
	
	public void checkTertiaryNavigationMusic()
	{
		assertTrue(selenium.isElementPresent("link=Music Reviews"));
		assertTrue(selenium.isElementPresent("link=Music Interviews"));
		assertTrue(selenium.isElementPresent("link=Music News"));
		assertTrue(selenium.isElementPresent("link=Classical Music"));
		assertTrue(selenium.isElementPresent("link=World, Folk and Jazz"));
		assertTrue(selenium.isElementPresent("link=Music Tickets"));
	}
	
	public void checkTertiaryNavigationArt()
	{
		assertTrue(selenium.isElementPresent("link=Art Sales"));
		assertTrue(selenium.isElementPresent("link=Art Video"));
		assertTrue(selenium.isElementPresent("link=Turner Prize"));
	}
	
	public void checkTertiaryNavigationBooks()
	{
		assertTrue(selenium.isElementPresent("link=Book Reviews"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[2]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[3]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[5]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[6]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[7]/a"));
	}
	
	public void checkTertiaryNavigationTvAndRadio()
	{
		assertTrue(selenium.isElementPresent("link=TV Guide"));
		assertTrue(selenium.isElementPresent("link=Gillian Reynolds"));
		assertTrue(selenium.isElementPresent("link=BBC"));
		assertTrue(selenium.isElementPresent("link=Doctor Who"));
		assertTrue(selenium.isElementPresent("link=X Factor"));
		assertTrue(selenium.isElementPresent("link=The Apprentice"));
		assertTrue(selenium.isElementPresent("link=Strictly Come Dancing"));
		assertTrue(selenium.isElementPresent("link=Telegraph TV"));
	}
	
	public void checkTertiaryNavigationTheatre()
	{
		assertTrue(selenium.isElementPresent("link=Drama"));
		assertTrue(selenium.isElementPresent("link=Telegraph Box Office"));
		assertTrue(selenium.isElementPresent("link=Stage Video"));
		assertTrue(selenium.isElementPresent("link=Theatre Trailers"));
	}
	
	public void checkTertiaryNavigationMotoring()
	{
		assertTrue(selenium.isElementPresent("link=Winter Road Safety"));
		assertTrue(selenium.isElementPresent("link=James May"));
		assertTrue(selenium.isElementPresent("link=Mike Rutherford"));
		assertTrue(selenium.isElementPresent("link=Honest John"));
		assertTrue(selenium.isElementPresent("link=Neil Lyndon"));
		assertTrue(selenium.isElementPresent("link=Motoring News"));
		assertTrue(selenium.isElementPresent("link=Top Gear"));
		assertTrue(selenium.isElementPresent("link=Car Reviews"));
	}
	
	public void checkTertiaryNavigationProperty()
	{
		assertTrue(selenium.isElementPresent("link=Property News"));
		assertTrue(selenium.isElementPresent("link=Overseas Property"));
		assertTrue(selenium.isElementPresent("link=Expat Property"));
		assertTrue(selenium.isElementPresent("link=UK Property Search"));
		assertTrue(selenium.isElementPresent("link=Overseas Property Search"));
		assertTrue(selenium.isElementPresent("link=Picture Galleries"));
	}
	
	public void checkTertiaryNavigationGardening()
	{
		assertTrue(selenium.isElementPresent("link=Garden Shop"));
		assertTrue(selenium.isElementPresent("link=Gardening Advice"));
		assertTrue(selenium.isElementPresent("link=Helen Yemm"));
		assertTrue(selenium.isElementPresent("link=How to Grow"));
		assertTrue(selenium.isElementPresent("link=Gardens to Visit"));
		assertTrue(selenium.isElementPresent("link=Beekeeping"));
		assertTrue(selenium.isElementPresent("link=Gardening Video"));
	}
	
	public void checkTertiaryNavigationFoodAndDrink()
	{
		assertTrue(selenium.isElementPresent("link=Wine Shop"));
		assertTrue(selenium.isElementPresent("link=Wine"));
		assertTrue(selenium.isElementPresent("link=Pubs"));
		assertTrue(selenium.isElementPresent("link=Restaurant Reviews"));
		assertTrue(selenium.isElementPresent("link=Recipes"));
		assertTrue(selenium.isElementPresent("link=Food & Drink Video"));
	}
	
	public void checkTertiaryNavigationFamily()
	{
		assertTrue(selenium.isElementPresent("link=Family Activity Planner"));
		assertTrue(selenium.isElementPresent("link=Sister2Sister"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[3]/a"));
		assertTrue(selenium.isElementPresent("link=Family Video"));
	}
	
	public void checkTertiaryNavigationRelationships()
	{
		assertTrue(selenium.isElementPresent("link=Online Dating"));
		assertTrue(selenium.isElementPresent("link=Valentine's Day"));
		assertTrue(selenium.isElementPresent("link=Relationship Advice and Romance"));
		assertTrue(selenium.isElementPresent("link=Self Help"));
		assertTrue(selenium.isElementPresent("link=Divorce"));
		assertTrue(selenium.isElementPresent("link=Sexual Health and Advice"));
	}
	
	public void checkTertiaryNavigationOlympics()
	{
		assertTrue(selenium.isElementPresent("link=London 2012 Schedule"));
		assertTrue(selenium.isElementPresent("link=Ticket Guide"));
		assertTrue(selenium.isElementPresent("link=Venue Guide"));
		assertTrue(selenium.isElementPresent("link=Sport Guides"));
		assertTrue(selenium.isElementPresent("link=The Olympic Blog"));
		assertTrue(selenium.isElementPresent("link=Paralympic Sport"));
		assertTrue(selenium.isElementPresent("link=Olympics Video"));
		assertTrue(selenium.isElementPresent("link=Sport A-Z"));
	}
	
	public void checkTertiaryNavigationFootball()
	{
		assertTrue(selenium.isElementPresent("link=Live Scores"));
		assertTrue(selenium.isElementPresent("link=Transfers"));
		assertTrue(selenium.isElementPresent("link=Teams"));
		assertTrue(selenium.isElementPresent("link=Fixtures"));
		assertTrue(selenium.isElementPresent("link=Results"));
		assertTrue(selenium.isElementPresent("link=Tables"));
		assertTrue(selenium.isElementPresent("link=Statistics"));
		assertTrue(selenium.isElementPresent("link=Blog"));
		assertTrue(selenium.isElementPresent("link=Video"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[10]/a"));
		assertTrue(selenium.isElementPresent("link=Tickets"));
		assertTrue(selenium.isElementPresent("link=Games"));
	}
	
	public void checkTertiaryNavigationRugbyUnion()
	{
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[1]/a"));
		assertTrue(selenium.isElementPresent("link=Live"));
		assertTrue(selenium.isElementPresent("link=International"));
		assertTrue(selenium.isElementPresent("link=Club"));
		assertTrue(selenium.isElementPresent("link=Fixtures"));
		assertTrue(selenium.isElementPresent("link=Results"));
		assertTrue(selenium.isElementPresent("link=Statistics"));
		assertTrue(selenium.isElementPresent("link=Tables"));
		assertTrue(selenium.isElementPresent("link=Blog"));
		assertTrue(selenium.isElementPresent("link=Tickets"));
	}
	
	public void checkTertiaryNavigationSixNations()
	{
		assertTrue(selenium.isElementPresent("link=Live"));
		assertTrue(selenium.isElementPresent("link=Six Nations Fixtures"));
		assertTrue(selenium.isElementPresent("link=Six Nations Results"));
		assertTrue(selenium.isElementPresent("link=Tables"));
		assertTrue(selenium.isElementPresent("link=Statistics"));
		assertTrue(selenium.isElementPresent("link=Video Highlights"));
		assertTrue(selenium.isElementPresent("link=Rugby Blog"));
		assertTrue(selenium.isElementPresent("link=International"));
		assertTrue(selenium.isElementPresent("//div[@id='tmglThirdNav']/ul/li[9]/a"));
	}
	
	public void checkTertiaryNavigationCricket()
	{
		assertTrue(selenium.isElementPresent("link=Cricket World Cup 2011"));
		assertTrue(selenium.isElementPresent("link=England"));
		assertTrue(selenium.isElementPresent("link=International"));
		assertTrue(selenium.isElementPresent("link=Counties"));
		assertTrue(selenium.isElementPresent("link=The Ashes 2010-2011"));
		assertTrue(selenium.isElementPresent("link=Fixtures"));
		assertTrue(selenium.isElementPresent("link=Results"));
		assertTrue(selenium.isElementPresent("link=Blog"));
		assertTrue(selenium.isElementPresent("link=Cricket Video"));
	}
	
	public void checkTertiaryNavigationFormulaOne()
	{
		assertTrue(selenium.isElementPresent("link=Live F1"));
		assertTrue(selenium.isElementPresent("link=Standings"));
		assertTrue(selenium.isElementPresent("link=Teams"));
		assertTrue(selenium.isElementPresent("link=Jenson Button"));
		assertTrue(selenium.isElementPresent("link=Lewis Hamilton"));
		assertTrue(selenium.isElementPresent("link=Michael Schumacher"));
		assertTrue(selenium.isElementPresent("link=Action Photos"));
		assertTrue(selenium.isElementPresent("link=F1 Blog"));
	}
	
	public void checkTertiaryNavigationTennis()
	{
		assertTrue(selenium.isElementPresent("link=Australian Open"));
		assertTrue(selenium.isElementPresent("link=Andy Murray"));
		assertTrue(selenium.isElementPresent("link=Roger Federer"));
		assertTrue(selenium.isElementPresent("link=Rafael Nadal"));
		assertTrue(selenium.isElementPresent("link=Action Photos"));
		assertTrue(selenium.isElementPresent("link=ATP Tour"));
		assertTrue(selenium.isElementPresent("link=WTA Tour"));
		assertTrue(selenium.isElementPresent("link=Tickets"));
	}
	
	public void checkTertiaryNavigationBoxingAndMma()
	{
		assertTrue(selenium.isElementPresent("link=David Haye"));
		assertTrue(selenium.isElementPresent("link=Manny Pacquiao"));
		assertTrue(selenium.isElementPresent("link=Gareth A Davies"));
		assertTrue(selenium.isElementPresent("link=Action Photos"));
		assertTrue(selenium.isElementPresent("link=Blog"));
		assertTrue(selenium.isElementPresent("link=Video"));
	}
	
	public void checkTertiaryNavigationGolf()
	{
		assertTrue(selenium.isElementPresent("link=Leaderboards"));
		assertTrue(selenium.isElementPresent("link=Ryder Cup 2010"));
		assertTrue(selenium.isElementPresent("link=European Tour"));
		assertTrue(selenium.isElementPresent("link=US Tour"));
		assertTrue(selenium.isElementPresent("link=Tiger Woods"));
		assertTrue(selenium.isElementPresent("link=European Calendar"));
		assertTrue(selenium.isElementPresent("link=US Calendar"));
		assertTrue(selenium.isElementPresent("link=Golf Shop"));
	}
	
	public void checkTertiaryNavigationHorseRacing()
	{
		assertTrue(selenium.isElementPresent("link=Race Cards and Form"));
		assertTrue(selenium.isElementPresent("link=Cheltenham Festival"));
	}
	
	public void checkTertiaryNavigationCycling()
	{
		assertTrue(selenium.isElementPresent("link=Video Highlights"));
		assertTrue(selenium.isElementPresent("link=Lance Armstrong"));
		assertTrue(selenium.isElementPresent("link=Bradley Wiggins"));
		assertTrue(selenium.isElementPresent("link=Mark Cavendish"));
		assertTrue(selenium.isElementPresent("link=Blogs"));
	}
	
	public void checkTertiaryNavigationAdvice()
	{
		assertTrue(selenium.isElementPresent("link=Nick Trend: Savvy Traveller"));
		assertTrue(selenium.isElementPresent("link=Sophie Butler"));
		assertTrue(selenium.isElementPresent("link=Gill Charlton"));
		assertTrue(selenium.isElementPresent("link=Fiona Duncan: Hotel Guru"));
	}
	
	public void checkTertiaryNavigationDestinations()
	{
		assertTrue(selenium.isElementPresent("link=UK"));
		assertTrue(selenium.isElementPresent("link=Europe"));
		assertTrue(selenium.isElementPresent("link=North America"));
		assertTrue(selenium.isElementPresent("link=Central America/Caribbean"));
		assertTrue(selenium.isElementPresent("link=S America"));
		assertTrue(selenium.isElementPresent("link=Africa/Indian Ocean"));
		assertTrue(selenium.isElementPresent("link=Asia"));
		assertTrue(selenium.isElementPresent("link=Australia/Pacific"));
		assertTrue(selenium.isElementPresent("link=Middle East"));
	}
	
	public void checkPuff()
	{
		assertTrue(selenium.isElementPresent("//div[@class='puff']"));
		assertTrue(selenium.isVisible("//div[@class='puff']"));
	}
	
	public void checkMpu()
	{
		assertTrue(selenium.isElementPresent("mpu"));
		assertTrue(selenium.isVisible("mpu"));
	}
	
	public void checkMostViewed()
	{
		assertTrue(selenium.isElementPresent("mostPopular"));
		
		//Check TODAY tab is present
		assertTrue(selenium.isElementPresent("TODAY"));
		assertEquals("TODAY", selenium.getText("//li[@id='TODAY']/a/span"));
		//Check TODAY items are present
		assertTrue(selenium.isElementPresent("//div[@id='div-TODAY']/ol/li[1]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-TODAY']/ol/li[2]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-TODAY']/ol/li[3]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-TODAY']/ol/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-TODAY']/ol/li[5]/a"));
		//Check TODAY items are visible
		assertTrue(selenium.isVisible("//div[@id='div-TODAY']/ol/li[1]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-TODAY']/ol/li[2]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-TODAY']/ol/li[3]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-TODAY']/ol/li[4]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-TODAY']/ol/li[5]/a"));
		
		//Check PAST WEEK tab is present
		assertTrue(selenium.isElementPresent("THIS_WEEK"));
		assertEquals("PAST WEEK", selenium.getText("//li[@id='THIS_WEEK']/a/span"));
		//Click PAST WEEK tab
		selenium.click("//li[@id='THIS_WEEK']/a/span");
		//Check PAST WEEK items are present
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_WEEK']/ol/li[1]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_WEEK']/ol/li[2]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_WEEK']/ol/li[3]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_WEEK']/ol/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_WEEK']/ol/li[5]/a"));
		//Check PAST WEEK items are visible
		assertTrue(selenium.isVisible("//div[@id='div-THIS_WEEK']/ol/li[1]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_WEEK']/ol/li[2]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_WEEK']/ol/li[3]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_WEEK']/ol/li[4]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_WEEK']/ol/li[5]/a"));
		
		//Check PAST MONTH tab is present
		assertTrue(selenium.isElementPresent("THIS_MONTH"));
		assertEquals("PAST MONTH", selenium.getText("//li[@id='THIS_MONTH']/a/span"));
		//Click PAST MONTH tab
		selenium.click("//li[@id='THIS_MONTH']/a/span");
		//Check PAST MONTH items are present
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_MONTH']/ol/li[1]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_MONTH']/ol/li[2]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_MONTH']/ol/li[3]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_MONTH']/ol/li[4]/a"));
		assertTrue(selenium.isElementPresent("//div[@id='div-THIS_MONTH']/ol/li[5]/a"));
		//Check PAST MONTH items are visible
		assertTrue(selenium.isVisible("//div[@id='div-THIS_MONTH']/ol/li[1]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_MONTH']/ol/li[2]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_MONTH']/ol/li[3]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_MONTH']/ol/li[4]/a"));
		assertTrue(selenium.isVisible("//div[@id='div-THIS_MONTH']/ol/li[5]/a"));
	}
	
	public void checkAd()
	{
		assertTrue(selenium.isElementPresent("//div[@class='adsky']"));
		assertTrue(selenium.isVisible("//div[@class='adsky']"));
	}
	
	public void checkEditorsChoice()
	{
		assertTrue(selenium.isElementPresent("//div[@class='editorsChoice']"));
		assertTrue(selenium.isVisible("//div[@class='editorsChoice']"));
	}
	
	public void checkGoogleAds()
	{
		assertTrue(selenium.isElementPresent("google-ads-container"));
		assertTrue(selenium.isVisible("google-ads-container"));
	}
	
	public void checkMoreFromTelegraph()
	{
		assertTrue(selenium.isElementPresent("trafficDrivers"));
		assertTrue(selenium.isVisible("trafficDrivers"));
	}
	
	public void checkBackToTop()
	{
		assertTrue(selenium.isElementPresent("//div[@class='backtotop']"));
		assertTrue(selenium.isVisible("//div[@class='backtotop']"));
	}
	
	public void checkHotTopics()
	{
		assertTrue(selenium.isElementPresent("tmglHotTopics"));
		assertTrue(selenium.isVisible("tmglHotTopics"));
	}
	
	public void checkFooter1stColumn()
	{
		//Check 1st column
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[1]/a"));//News
		 assertEquals("News", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[2]/a"));//Politics
		 assertEquals("Politics", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[2]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[3]/a"));//World News
		 assertEquals("World News", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[3]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[4]/a"));//Obituaries
		 assertEquals("Obituaries", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[4]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li/a"));//Travel
		 assertEquals("Travel", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li[1]/a"));//Health
		 assertEquals("Health", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li[2]/a"));//Jobs
		 assertEquals("Jobs", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li[2]/a"));
	}
	
	public void checkFooter2ndColumn()
	 {
		//Check 2nd column
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[1]/a"));//Sport
		 assertEquals("Sport", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[2]/a"));//Football
		 assertEquals("Football", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[2]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[3]/a"));//Olympics
		 assertEquals("Olympics", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[3]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[4]/a"));//Cricket
		 assertEquals("Cricket", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[4]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li/a"));//Culture
		 assertEquals("Culture", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li[1]/a"));//Motoring
		 assertEquals("Motoring", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li[2]/a"));//Dating
		 assertEquals("Dating", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li[2]/a"));
	 }
	
	public void checkFooter3rdColumn()
	 {
		//Check 3rd column
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[1]/a"));//Finance
		 assertEquals("Finance", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[2]/a"));//Personal Finance
		 assertEquals("Personal Finance", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[2]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[3]/a"));//Economics
		 assertEquals("Economics", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[3]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[4]/a"));//Markets
		 assertEquals("Markets", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[4]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li/a"));//Fashion
		 assertEquals("Fashion", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li[1]/a"));//Property
		 assertEquals("Property", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li[1]/a"));
		 
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li[2]/a"));//Puzzles
		 assertEquals("Puzzles", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li[2]/a"));
	 }
	
	public void checkFooter4thColumn()
	 {
		 //Check 4th column
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[1]/a"));//Comment
		 assertEquals("Comment", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[1]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[2]/a"));//Blogs
		 assertEquals("Blogs", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[2]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[3]/a"));//My Telegraph
		 assertEquals("My Telegraph", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[3]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[4]/a"));//Letters
		 assertEquals("Letters", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[4]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li/a"));//Technology
		 assertEquals("Technology", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li[1]/a"));//Food and Drink
		 assertEquals("Food and Drink", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li[1]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li[2]/a"));//Telegraph Journalists
		 assertEquals("Telegraph Journalists", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li[2]/a"));
	 }
	
	public void checkFooter5thColumn()
	 {
		 //Check 5th column
		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[1]/a"));//Contact Us
		 assertEquals("Contact Us", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[1]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[2]/a"));//Privacy Policy
		 assertEquals("Privacy Policy", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[2]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[3]/a"));//Advertising
		 assertEquals("Advertising", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[3]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[4]/a"));//A to Z
		 assertEquals("A to Z", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[4]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li/a"));//Tickets
		 assertEquals("Tickets", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[1]/a"));//Announcements
		 assertEquals("Announcements", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[1]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[2]/a"));//Promotions
		 assertEquals("Promotions", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[2]/a"));

		 assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[3]/a"));//Reader Prints
		 assertEquals("Reader Prints", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[3]/li[3]/a"));
	 }
	
	public void checkFooter6thColumn()
	{
		//Check 6th column
		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[1]/li[1]/a"));//RSS feeds
		assertEquals("RSS feeds", selenium.getText("//div[@id='footercolumn_last']/ul[1]/li[1]/a"));

		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[1]/li[2]/a"));//Mobile
		assertEquals("Mobile", selenium.getText("//div[@id='footercolumn_last']/ul[1]/li[2]/a"));

		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[1]/li[3]/a"));//Epaper
		assertEquals("Epaper", selenium.getText("//div[@id='footercolumn_last']/ul[1]/li[3]/a"));

		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[2]/li[1]/a"));//Expat
		assertEquals("Expat", selenium.getText("//div[@id='footercolumn_last']/ul[2]/li[1]/a"));

		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[2]/li[2]/a"));//Subscriber
		assertEquals("Subscriber", selenium.getText("//div[@id='footercolumn_last']/ul[2]/li[2]/a"));

		assertTrue(selenium.isElementPresent("//div[@id='footercolumn_last']/ul[2]/li[3]/a"));//Syndication
		assertEquals("Syndication", selenium.getText("//div[@id='footercolumn_last']/ul[2]/li[3]/a"));
	}
	
	public void checkFooterBottom()
	{
		//Check bottom of footer
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[1]"));
		assertEquals("© Copyright of Telegraph Media Group Limited 2011", selenium.getText("//div[@id='footerinfo']/p[1]"));
		
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[2]/a"));
		assertEquals("Terms and Conditions", selenium.getText("//div[@id='footerinfo']/p[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[3]/a"));
		assertEquals("Today's News", selenium.getText("//div[@id='footerinfo']/p[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[4]/a"));
		assertEquals("Archive", selenium.getText("//div[@id='footerinfo']/p[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[5]/a"));
		assertEquals("Style Book", selenium.getText("//div[@id='footerinfo']/p[5]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='footerinfo']/p[6]/a"));
		assertEquals("Weather Forecast", selenium.getText("//div[@id='footerinfo']/p[6]/a"));
	}

	public void checkSportFooter1stColumn()
	{
		//Check 1st column
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[1]/a"));//Football
		assertEquals("Football", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[2]/a"));//Teams
		assertEquals("Teams", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[3]/a"));//Fixtures
		assertEquals("Fixtures", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[4]/a"));//Results
		assertEquals("Results", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[1]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[1]/a"));//Rugby Union
		assertEquals("Rugby Union", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[2]/a"));//Six Nations
		assertEquals("Six Nations", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[3]/a"));//England
		assertEquals("England", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[4]/a"));//CLub
		assertEquals("Club", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[2]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li/a"));//News
		assertEquals("News", selenium.getText("//div[@id='tmglFooterLargeItems']/div[1]/ul[3]/li/a"));
	}
	
	public void checkSportFooter2ndColumn()
	{
		//Check 2nd column
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[1]/a"));//Cricket
		assertEquals("Cricket", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[2]/a"));//World Cup 2011
		assertEquals("World Cup 2011", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[3]/a"));//England
		assertEquals("England", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[4]/a"));//Live Scoreboards
		assertEquals("Live Scoreboards", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[1]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[1]/a"));//Fomula One
		assertEquals("Formula One", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[2]/a"));//Lewis Hamilton
		assertEquals("Lewis Hamilton", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[3]/a"));//Jenson Button
		assertEquals("Jenson Button", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[4]/a"));//F1 Live
		assertEquals("F1 Live", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[2]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li/a"));//Finance
		assertEquals("Finance", selenium.getText("//div[@id='tmglFooterLargeItems']/div[2]/ul[3]/li/a"));
	}
	
	public void checkSportFooter3rdColumn()
	{
		//Check 3rd column
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[1]/a"));//Olympics
		assertEquals("Olympics", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[2]/a"));//London 2012 Schedule
		assertEquals("London 2012 Schedule", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[3]/a"));//Cycling
		assertEquals("Cycling", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[4]/a"));//Triathlon
		assertEquals("Triathlon", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[1]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[1]/a"));//Athletics
		assertEquals("Athletics", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[2]/a"));//Boxing and MMA
		assertEquals("Boxing and MMA", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[3]/a"));//Swimming
		assertEquals("Swimming", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[4]/a"));//Hockey
		assertEquals("Hockey", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[2]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li/a"));//Lifestyle
		assertEquals("Lifestyle", selenium.getText("//div[@id='tmglFooterLargeItems']/div[3]/ul[3]/li/a"));
	}
	
	public void checkSportFooter4thColumn()
	{
		//Check 4th column
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[1]/a"));//Tennis
		assertEquals("Tennis", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[2]/a"));//Andy Murray
		assertEquals("Andy Murray", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[3]/a"));//Roger Federer
		assertEquals("Roger Federer", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[4]/a"));//ATP Tour
		assertEquals("ATP Tour", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[1]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[1]/a"));//Golf
		assertEquals("Golf", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[2]/a"));//Tiger Woods
		assertEquals("Tiger Woods", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[3]/a"));//European Tour
		assertEquals("European Tour", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[4]/a"));//US Tour
		assertEquals("US Tour", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[2]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li/a"));//Comment
		assertEquals("Comment", selenium.getText("//div[@id='tmglFooterLargeItems']/div[4]/ul[3]/li/a"));	
	}
	
	public void checkSportFooter5thColumn()
	{
		//Check 5th column
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[1]/a"));//Contact Us
		assertEquals("Contact Us", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[2]/a"));//Telegraph Journalists
		assertEquals("Telegraph Journalists", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[3]/a"));//Advertising
		assertEquals("Advertising", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[3]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[4]/a"));//A to Z
		assertEquals("A to Z", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[1]/li[4]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[1]/a"));//Announcements
		assertEquals("Announcements", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[1]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[2]/a"));//Promotions
		assertEquals("Promotions", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[2]/a"));
		
		assertTrue(selenium.isElementPresent("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[3]/a"));//Reader Prints
		assertEquals("Reader Prints", selenium.getText("//div[@id='tmglFooterLargeItems']/div[5]/ul[2]/li[3]/a"));
	}
}
