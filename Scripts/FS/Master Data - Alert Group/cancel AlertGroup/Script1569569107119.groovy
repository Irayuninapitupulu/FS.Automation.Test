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

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/button_Create Alert'))

WebUI.delay(2)

WebUI.setText(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/input_Alert Group Name_alertGr'), 'grup astra')

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/button_Add New User'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/input_Email_ng-untouched ng-pr'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/input_ifan.marfiandiai.astra.c'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Master Data - Alert Group/Page_Cancel AlertGroup/button_Cancel'))

WebUI.delay(2)

WebUI.closeBrowser()

