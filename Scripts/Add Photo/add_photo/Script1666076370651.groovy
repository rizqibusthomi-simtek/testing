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

WebUI.callTestCase(findTestCase('Test Cases/Login/login'), [('username') : user, ('password') : pass], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add_photo/button_add_employee'))

//WebUI.click(findTestObject('Object Repository/add_photo/button_add_photo'))
WebUI.uploadFile(findTestObject('Object Repository/add_photo/button_add_photo'), 'C:\\\\Users\\\\Rizqi\\\\Downloads\\\\jan-kopriva-IZ7W626JoQs-unsplash.jpg', 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/add_photo/photo_profile'), 10, FailureHandling.STOP_ON_FAILURE)
'Capturing the file name after upload and storing it in a variable'
FilePath = WebUI.getAttribute(findTestObject('Object Repository/add_photo/button_add_photo'), 'value')

'Verifying the Actual path and Expected path of file'
WebUI.verifyMatch(FilePath, 'C:\\Users\\Rizqi\\Downloads\\jan-kopriva-IZ7W626JoQs-unsplash.jpg', false)

