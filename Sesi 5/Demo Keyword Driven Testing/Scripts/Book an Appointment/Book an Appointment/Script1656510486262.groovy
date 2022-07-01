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

WebUI.callTestCase(findTestCase('Login/Login_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Success Login')

WebUI.selectOptionByValue(findTestObject('Spy Mode/Page Book Appointment/select_Healthcare Center'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Spy Mode/Page Book Appointment/checkBox_Apply for hospital readmission'))

WebUI.click(findTestObject('Spy Mode/Page Book Appointment/input_None_programs'))

WebUI.setText(findTestObject('Spy Mode/Page Book Appointment/inputText_Visit Date'), '02/07/2022')

WebUI.setText(findTestObject('Spy Mode/Page Book Appointment/textarea_Comment'), 'I need Paracetamol')

WebUI.click(findTestObject('Spy Mode/Page Book Appointment/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Spy Mode/Page Appointment Confirmation/headerPage_Appointment Confirmation'), 
    0)

WebUI.comment('Success if Directed to Appointment Confirmation Page')

