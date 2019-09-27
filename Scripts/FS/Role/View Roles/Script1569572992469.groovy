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

WebUI.navigateToUrl('https://astra-ai-fs-admin.azurewebsites.net/#/role')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Search Roles/input_Role Name_col-md-9 ng-un'), 'Head Office')

WebUI.delay(2)



WebUI.click(findTestObject('Page_Search Roles/button_Search'))
if(WebUI.verifyElementPresent(findTestObject("Page_Search Roles/td_Head Office"), 0))
{
	KeywordUtil.markPassed("Clear User Succsess")
}
else
{
	KeywordUtil.markFailed("Clear Failed")
}

WebUI.delay(2)


if(WebUI.verifyElementPresent(findTestObject("Page_Search Roles/button_Clear"), 10))
{
	if(WebUI.verifyElementClickable(findTestObject("Page_Search Roles/button_Clear")))
	{
		WebUI.click(findTestObject('Page_Search Roles/button_Clear'))
		KeywordUtil.markPassed("Success")
		
		def countData = Action.getCountElementInTableByTag("tbody");
		if(countData > 1)
		{
			KeywordUtil.markPassed("Success")
		}
		else
		{
			KeywordUtil.markPassed("Failed")
		}
	}
}


WebUI.delay(2)

WebUI.closeBrowser()

