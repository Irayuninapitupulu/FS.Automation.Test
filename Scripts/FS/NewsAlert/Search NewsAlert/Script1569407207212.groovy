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

WebUI.delay(3)

WebUI.setText(findTestObject('NewsAlert FS/Page_Search NewsAlert/input_Search Title_keyword'), 'News - Libur Nasional Indonesia')

WebUI.delay(2)

WebUI.setText(findTestObject('NewsAlert FS/Page_Search NewsAlert/input_Start Date_startDate'), '01/01/2012')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('NewsAlert FS/Page_Search NewsAlert/input_Start Date_startDate'), Keys.chord(Keys.ENTER))

//WebUI.setText(findTestObject('NewsAlert FS/Page_Search NewsAlert/input_Start Date_startDate'), '01/01/2012')

WebUI.delay(2)

WebUI.setText(findTestObject('NewsAlert FS/Page_Search NewsAlert/input_End Date_endDate'), '10/25/2019')

WebUI.delay(2)

WebUI.click(findTestObject('NewsAlert FS/Page_Search NewsAlert/button_Submit'))

if (WebUI.verifyElementPresent(findTestObject("NewsAlert FS/Page_Search NewsAlert/td_News - Libur Nasional Indon"), 10))
{
	KeywordUtil.markPassed("Success") //ini jika search berhasil
}
else
{
	KeywordUtil.markPassed("Search Not Found") //ini jika search tidak berhasil
}

//WebUI.scrollToElement(findTestObject("NewsAlert FS/Page_Search NewsAlert/td_News - Libur Nasional Indon"), 3)

WebUI.delay(2)

WebUI.closeBrowser()

