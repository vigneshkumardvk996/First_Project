package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemoApp;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;


public class TestCase1 extends BaseClass{
	@Test
	public void tc1() {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton().click();
		s.skillrraydemoapp();
		
		SkillraryDemoApp d=new SkillraryDemoApp(driver);
		 utilies.switchTabs(driver);
		 utilies.mouseHover(driver,d.getCousetab());
		 d.seleniumtrainingtab();
		 
		 AddtocartPage ad=new AddtocartPage(driver);
		 utilies.doubleClick(driver,ad.getAdd());
		 ad.addtocartbutton();
		 utilies.alertPopup(driver);
		 Reporter.log(driver.getTitle(),true);
	}

}
