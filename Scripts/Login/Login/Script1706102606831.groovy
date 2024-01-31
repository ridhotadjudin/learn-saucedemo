import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Object Repository/Login/inputUsername'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/inputPassword'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

def text1 = WebUI.getText(findTestObject('Object Repository/Dashboard/txtSwagLabs'))

WebUI.verifyMatch(text1, '^Swag Labs.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/btnAddToCart'))

WebUI.click(findTestObject('Object Repository/Dashboard/btnCart'))

def text2 = WebUI.getText(findTestObject('Object Repository/Cart/txtYourCart'))

WebUI.verifyMatch(text2, '^Your Cart.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart/btnCheckout'))

def text3= WebUI.getText(findTestObject('Object Repository/Cart/txtCheckoutYourInformation'))

WebUI.verifyMatch(text3, '^Checkout: Your Information.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Cart/inputCheckoutFirstName'), 'Randu')

WebUI.setText(findTestObject('Object Repository/Cart/inputCheckoutLastName'), 'Solok')

WebUI.setText(findTestObject('Object Repository/Cart/inputCheckoutPostalCode'), '112233')

WebUI.click(findTestObject('Object Repository/Cart/input_Cancel_continue'))

def text4 = WebUI.getText(findTestObject('Object Repository/Cart/txtCheckoutOverview'))

WebUI.verifyMatch(text4, '^Checkout: Overview.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart/btnFinish'))

WebUI.click(findTestObject('Object Repository/Cart/txtThank you for your order'))

def text5 = WebUI.getText(findTestObject('Object Repository/Cart/txtThank you for your order'))

WebUI.verifyMatch(text5, '^Thank you for your order.*', true, FailureHandling.STOP_ON_FAILURE)

def text6 = WebUI.getText(findTestObject('Object Repository/Cart/txtCheckoutComplete'))

WebUI.verifyMatch(text6, '^Checkout: Complete!.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

