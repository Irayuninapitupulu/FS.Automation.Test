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

WebUI.openBrowser('')

WebUI.delay(2)

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/feedback-options')

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - FeedbackOption/Page_Create FeedbackOption/button_Add New Data'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Master Data - FeedbackOption/Page_Create FeedbackOption/select_-Choose Application-ITS'), '1: Object', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Master Data - FeedbackOption/Page_Create FeedbackOption/input_Name_form-control ng-unt'), 'Appearance')

WebUI.delay(2)

WebUI.setText(findTestObject('Master Data - FeedbackOption/Page_Create FeedbackOption/textarea_penampilan rapih'), 'penampilan rapih')

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - FeedbackOption/Page_Create FeedbackOption/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

