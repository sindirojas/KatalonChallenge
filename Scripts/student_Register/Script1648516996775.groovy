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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ToolsQA/h5_Student Registration Form'), 0)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/img'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_firstName'), 'Name')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_lastName'), 'Lastname')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail'), 'name.test@mailinator.com')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Other'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_(10 Digits)_userNumber'), '1234567890')

WebUI.scrollToElement(findTestObject('Page_ToolsQA/input_Date of Birth_dateOfBirthInput'), 0)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_190019011902190319041905190619071908_246ee1'), 
    '1981', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_11'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Subjects_subjectsInput'), 'm')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Maths_1'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Subjects_subjectsInput'), 'ch')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Chemistry'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Reading'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Current Address_currentAddress'), 'calle 34')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_option Haryana focused, 3 of 4. 4 resul_2bc384'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_option Agra focused, 1 of 3. 3 results _907529'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Lucknow'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_Name Lastname'), 'Name Lastname')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_name.testmailinator.com'), 'name.test@mailinator.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_Other'), 'Other')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_1234567890'), '1234567890')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_11 May,1981'), '11 May,1981')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_Maths, Chemistry'), 'Maths, Chemistry')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_Reading'), 'Reading')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_calle 34'), 'calle 34')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/td_Uttar Pradesh Lucknow'), 'Uttar Pradesh Lucknow')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Close'))

WebUI.closeBrowser()

