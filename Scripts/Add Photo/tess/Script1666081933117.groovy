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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/tesss/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/tesss/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/tesss/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/tesss/Page_OrangeHRM/button_Add'), FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'com.katalon.WebUICustomKeyword.uploadFile'(findTestObject('Object Repository/add_photo/button_add_photo'), 'C:\\Users\\Rizqi\\Downloads\\jan-kopriva-IZ7W626JoQs-unsplash.jpg')
WebUI.uploadFile(findTestObject('Object Repository/add_photo/button_add_photo'), 'C:\\Users\\Rizqi\\Downloads\\jan-kopriva-IZ7W626JoQs-unsplash.jpg')

CustomKeywords.'contoh.newContoh.uploadFile'(findTestObject('Object Repository/add_photo/button_add_photo'), 'C:\\Users\\Rizqi\\Downloads\\jan-kopriva-IZ7W626JoQs-unsplash.jpg')

//WebUI.uploadFile(findTestObject('Object Repository/add_photo/button_add_photo'), 'C:\\Users\\Rizqi\\Downloads\\jan-kopriva-IZ7W626JoQs-unsplash.jpg')
WebUI.verifyElementPresent(findTestObject('Object Repository/tesss/Page_OrangeHRM/span_Attachment Size Exceeded'), 0)

