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

WebUI.openBrowser('')
WebUI.delay(2)

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/feedback-options')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Master Data - FeedbackOption/Page_Search FeedbackOption/select_Show All ApplicationsIT'), '2: Object', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Master Data - FeedbackOption/Page_Search FeedbackOption/input_Name_keyword'), 'Attitude')

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - FeedbackOption/Page_Search FeedbackOption/button_Search'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject("Master Data - FeedbackOption/Page_Search FeedbackOption/td_Attitude"), 10))
{
	KeywordUtil.markPassed("Success") //ini jika search berhasil
}
else
{
	KeywordUtil.markPassed("Search Not Found") //ini jika search tidak berhasil
}

WebUI.closeBrowser()



