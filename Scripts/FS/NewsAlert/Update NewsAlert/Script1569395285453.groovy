import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.util.KeywordUtil
import groovy.time.TimeCategory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/news/list')

WebUI.click(findTestObject('NewsAlert FS/Page_Update NewsAlert/a_asdasd_btn btn-link'))

WebUI.setText(findTestObject('NewsAlert FS/Page_Update NewsAlert/input_group a_ng-star-inserted'), 'Group Astra International')

WebUI.sendKeys(findTestObject('NewsAlert FS/Page_Update NewsAlert/input_group a_ng-star-inserted'), Keys.chord(Keys.ENTER)) //ada librarynya ya

WebUI.setText(findTestObject('NewsAlert FS/Page_Update NewsAlert/input_Title_title'), 'News - Libur Nasional Indonesia')



if (WebUI.verifyElementPresent(findTestObject("NewsAlert FS/Page_Update NewsAlert/input_Today_startDate"), 5))
{
//	WebUI.click(findTestObject("NewsAlert FS/Page_Update NewsAlert/input_Today_startDate"))
	use (TimeCategory,
		{
			today = new Date();
			//nextDay = (today + 1.days)
			nextWeek = (today + 7.days)
//			
//			month = today.getMonth();
//			year = today.getYear();
//			
//			nextDay = (today + 1.days)
//			nextWeek = (today + 1.week)
//			sevenmonthAgo = (year - 7.year)
		}
		)
		WebUI.setText(findTestObject("NewsAlert FS/Page_Update NewsAlert/input_Today_startDate"), nextWeek.format('MM/dd/yyyy'))
		KeywordUtil.markPassed("Success") //ada library-nya ya
}
else
{
	KeywordUtil.markFailed("Failed")
}



if (WebUI.verifyElementPresent(findTestObject("NewsAlert FS/Page_Create NewsAlert/input_Never_endDate"), 5))
{
//	WebUI.click(findTestObject("NewsAlert FS/Page_Create NewsAlert/input_Never_endDate"))
	use (TimeCategory,
	{
		today = new Date();
		//nextDay = (today + 1.days)
		nextWeek = (today + 1.week + 2.days)
	}
	)
	WebUI.setText(findTestObject("NewsAlert FS/Page_Update NewsAlert/input_Never_endDate"), nextWeek.format('MM/dd/yyyy'))
	KeywordUtil.markPassed("Success")
}
else
{
	KeywordUtil.markFailed("Failed")
}

WebUI.delay(5)

WebUI.setText(findTestObject('NewsAlert FS/Page_Update NewsAlert/textarea_Body News_content'), 'Libur mulai diberlakukan start hari ini, mohon di perhatikan')

WebUI.click(findTestObject('NewsAlert FS/Page_Update NewsAlert/button_Send'))

WebUI.delay(1)

WebUI.closeBrowser()

