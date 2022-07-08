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

WebUI.callTestCase(findTestCase('Login/Open Login Form'), [:], FailureHandling.OPTIONAL)

WebUI.comment('After Succeed to Login Form')

WebUI.setText(findTestObject('Spy Mode/Page Login/input_Username'), GlobalVariable.username)

WebUI.comment('Using encripted text on scenario "Set Text"')

WebUI.setText(findTestObject('Spy Mode/Page Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Spy Mode/Page Login/button_Login'))

WebUI.comment('Success if There is an alert')

if (WebUI.verifyElementPresent(findTestObject('Spy Mode/Page Login/txt_Invalid Username or Password'), 3, FailureHandling.OPTIONAL) == 
true) {
    println('Ini berhasil ya ges ya')
	WebUI.verifyElementPresent(findTestObject('Spy Mode/Page Login/txt_Invalid Username or Password'), 3, FailureHandling.OPTIONAL)
} else {
    println('Ini gagal')
}

WebUI.closeBrowser()

