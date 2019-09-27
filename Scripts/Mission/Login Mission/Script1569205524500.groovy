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

WebUI.navigateToUrl('https://devproxy.astra.co.id/hsohome/#/login')

WebUI.setText(findTestObject('null'), 'linday')

WebUI.setText(findTestObject('null'), 'linday004255')

WebUI.setEncryptedText(findTestObject('null'), 'ZyJNmQzJyQg=')

WebUI.setEncryptedText(findTestObject('null'), 'IBgL2bOxhsg=')

WebUI.setEncryptedText(findTestObject('null'), 'R7/hemoEPRU=')

WebUI.setEncryptedText(findTestObject('null'), 'NE3Pr6NhDjM=')

WebUI.setEncryptedText(findTestObject('null'), 'aW3DeG35uyI=')

WebUI.setEncryptedText(findTestObject('null'), 'TshWgNqLpQA=')

WebUI.setEncryptedText(findTestObject('null'), '6Vg1RN2LyoI=')

WebUI.setEncryptedText(findTestObject('null'), 'fn6MeC6/RZEJ5t6/T2lUtw==')

WebUI.setEncryptedText(findTestObject('null'), 'fn6MeC6/RZFyifX8BZgGew==')

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

