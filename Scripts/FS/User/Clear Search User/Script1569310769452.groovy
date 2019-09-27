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

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/')

WebUI.click(findTestObject('USER FS/Page_Clear Search FS/a_User Management'))

WebUI.delay(1);

WebUI.click(findTestObject('USER FS/Page_Clear Search FS/a_User'))

WebUI.delay(1);

WebUI.waitForElementNotVisible(findTestObject("USER FS/Page_Clear Search FS/td_sbobesti0328ai.astra.co.id"), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('USER FS/Page_Clear Search FS/td_sbobesti0328ai.astra.co.id'))

WebUI.delay(1);

WebUI.setText(findTestObject('USER FS/Page_Clear Search FS/input_Search by Email_col-md-9'), 'sbobesti0328@ai.astra.co.id')


WebUI.click(findTestObject('USER FS/Page_Clear Search FS/button_Search'))
if (WebUI.verifyElementPresent(findTestObject("USER FS/Page_Clear Search FS/td_sbobesti0328ai.astra.co.id"), 5))
{
	KeywordUtil.markPassed("Clear User Succsess")
}
else
{
	KeywordUtil.markFailed("Clear Failed")
}

WebUI.delay(1);

if(WebUI.verifyElementPresent(findTestObject("USER FS/Page_Clear Search FS/button_Clear"), 10))
{
	if(WebUI.verifyElementClickable(findTestObject("USER FS/Page_Clear Search FS/button_Clear")))
	{
		WebUI.click(findTestObject("USER FS/Page_Clear Search FS/button_Clear"));
		KeywordUtil.markPassed("Clear User Succsess")
		
		def countData = Action.getCountElementInTableByTag("tbody");
		if(countData > 1)
		{
			KeywordUtil.markPassed("Success")
		}
		else
		{
			KeywordUtil.markFailed("Failed");
		}
	}
}

//WebUI.delay(1);
