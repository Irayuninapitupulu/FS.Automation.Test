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
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/track-fs-position')

WebUI.click(findTestObject('USER FS/Page_User FS/a_User Management'))

WebUI.click(findTestObject('USER FS/Page_User FS/a_User'))

WebUI.delay(5);
//WebUI.waitForElementPresent(findTestObject('USER FS/Page_User FS/input_Search by Email_col-md-9'), 5);

WebUI.setText(findTestObject('USER FS/Page_User FS/input_Search by Email_col-md-9'), 'sbodionl0337@ai.astra.co.id')

WebUI.click(findTestObject('USER FS/Page_User FS/button_Search'))

WebUI.delay(1);

if (WebUI.verifyElementPresent(findTestObject("USER FS/Page_User FS/td_sbodionl0337ai.astra.co.id"), 10))
{
	KeywordUtil.markPassed("Success") //ini jika search berhasil
}
else
{
	KeywordUtil.markPassed("Search Not Found") //ini jika search tidak berhasil
}

WebUI.delay(1);
