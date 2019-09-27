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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.microsoft.sqlserver.jdbc.format

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.time.TimeCategory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/news/list')

WebUI.delay(1)

WebUI.click(findTestObject('NewsAlert FS/Page_Create NewsAlert/button_Add New Data'))

WebUI.click(findTestObject('NewsAlert FS/Page_Create NewsAlert/div_Send to All_ng-value-conta'))

WebUI.delay(1)

WebUI.setText(findTestObject('NewsAlert FS/Page_Create NewsAlert/input_Send to All_ng-star-inse'), 'group a')

WebUI.sendKeys(findTestObject('NewsAlert FS/Page_Create NewsAlert/input_Send to All_ng-star-inse'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('NewsAlert FS/Page_Create NewsAlert/input_Title_title'), 'News - Libur Nasional')

WebUI.click(findTestObject('NewsAlert FS/Page_Create NewsAlert/input_Today_checkStartDateToda'))

WebUI.delay(1)

WebUI.click(findTestObject("NewsAlert FS/Page_Create NewsAlert/input_Never_endDate"))
if (WebUI.verifyElementPresent(findTestObject("NewsAlert FS/Page_Create NewsAlert/input_Never_endDate"), 0))
{
	use (TimeCategory,
	{
		today = new Date();
		nextDay = (today + 1.days)
	}
	)
	WebUI.setText(findTestObject("NewsAlert FS/Page_Create NewsAlert/input_Never_endDate"), nextDay.format('MM/dd/yyyy'))
	KeywordUtil.markPassed("Success")
}
else
{
	KeywordUtil.markFailed("Failed")
}

WebUI.delay(5)

WebUI.setText(findTestObject('NewsAlert FS/Page_Create NewsAlert/textarea_Body News_content'), 'Libur mulai diberlakukan start hari ini')

WebUI.delay(1)

WebUI.click(findTestObject('NewsAlert FS/Page_Create NewsAlert/button_Send'))

WebUI.delay(1)

WebUI.closeBrowser()

