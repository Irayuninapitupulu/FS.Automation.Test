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

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/alert-group')

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/button_Create Alert'))

WebUI.waitForElementClickable(findTestObject("Master Data - Alert Group/Page_Create AlertGroup/button_Create Alert"), 1)

WebUI.setText(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/input_Alert Group Name_alertGr'), 'AI External')

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/button_Add New User'))

WebUI.waitForElementClickable(findTestObject("Master Data - Alert Group/Page_Create AlertGroup/button_Add New User"), 1)

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/input_Email_ng-untouched ng-pr'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/input_sbobesti0328ai.astra.co.'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/input_sbofachr0327.essadevai.a'))

WebUI.delay(2)



WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/button_OK'))

//WebUI.waitForElementClickable(findTestObject("Master Data - Alert Group/Page_Create AlertGroup/button_OK"), 1)
WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Create AlertGroup/button_Save'))

//WebUI.waitForElementClickable(findTestObject("Master Data - Alert Group/Page_Create AlertGroup/button_Save"), 1)
WebUI.delay(2)

WebUI.closeBrowser()

//NOTE : Masih kurang di add new user

