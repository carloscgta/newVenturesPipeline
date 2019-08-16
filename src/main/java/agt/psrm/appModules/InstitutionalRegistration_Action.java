package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.Registration_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class InstitutionalRegistration_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	Registration_Page.Menu_Registration().click();
    	Log.info("Menu tab has been clicked");
    	
    	Registration_Page.Forms_Registration().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	Registration_Page.RegistrationForm().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	Registration_Page.Add_Registration().click();
    	Log.info("Add new registration form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);
    	
    	Boolean DocumentLocator = Registration_Page.DocumentLocator_Registration().isEnabled();
    	if(DocumentLocator== false) {
    	Reporter.log("DocumentLocator field is disabled: Validation Successful ");
    	}
    	else
    	{
    		Reporter.log("DocumentLocator field is Enabled: Validation failed ");
    	}
    	Select OriginofRegistration = new Select(Registration_Page.OriginofRegistration_Registration());
        String OriginofRegistrationValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_OrigemdoRegisto);
        OriginofRegistration.selectByVisibleText(OriginofRegistrationValue);
        Log.info(OriginofRegistrationValue+" value has been selected in dropdown" );
        
        Select Taxpayertype = new Select(Registration_Page.Taxpayertype_Registration());
        String TaxpayertypeValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContribuinte);
        Taxpayertype.selectByVisibleText(TaxpayertypeValue);
        Log.info(TaxpayertypeValue+" value has been selected in dropdown" ); 
        
        Registration_Page.Name_Institutional().clear();	
    	String Name = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
    	Registration_Page.Name_Institutional().sendKeys(Name);
        Log.info(Name+" is entered in Name text box" );
        
        Registration_Page.PublishedinOfficialGazette_Institutional().clear();	
    	String PublishedinOfficialGazette = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PublicadonoDiariodaRepublica);
    	Registration_Page.PublishedinOfficialGazette_Institutional().sendKeys(PublishedinOfficialGazette);
        Log.info(PublishedinOfficialGazette+" is entered in Name text box" );
        
        Registration_Page.DRnumber_Institutional().clear();	
    	String DRnumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdoDiariodaRepublica);
    	Registration_Page.DRnumber_Institutional().sendKeys(DRnumber);
        Log.info(DRnumber + " is entered in Name text box" );
        
        Registration_Page.DatepublishedinGazette_Instititional().clear();	
    	String DatepublishedinGazette = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadePublicacaonoDiariodaRepublica);
    	Registration_Page.DatepublishedinGazette_Instititional().sendKeys(DatepublishedinGazette);
        Log.info(DatepublishedinGazette+" is entered in DatepublishedinGazette text box" ); 
        
        Registration_Page.NIF_Institutional().clear();	
    	String NIF = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.NIF_Institutional().sendKeys(NIF);
        Log.info(NIF+" is entered in NIFIR_Collective text box" );
        Registration_Page.NIF_Institutional().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.NIFPerson_Institutional().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        else
        {
        	Log.info("NIF person details are not displayed");
        }
        
        Select Responsibilitytype_Institutional = new Select(Registration_Page.Responsibilitytype_Institutional());
        String Responsibilitytype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeResponsabilidade);
        Responsibilitytype_Institutional.selectByVisibleText(Responsibilitytype);
        Log.info(Responsibilitytype+" value has been selected in dropdown" );
        
        Select Primarycontacttype_Registration = new Select(Registration_Page.Primarycontacttype_Registration());
        String Primarycontacttype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContactoPrincipal );
        Primarycontacttype_Registration.selectByVisibleText(Primarycontacttype);
        Log.info(Primarycontacttype+" value has been selected in dropdown" );
        
        Registration_Page.Contactnumber_Registration().clear();	
    	String Contactnumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdeContacto);
    	Registration_Page.Contactnumber_Registration().sendKeys(Contactnumber);
        Log.info(Contactnumber+" is entered in Contactnumber text box" );
        
       /* Registration_Page.AddContactDetail_Singular().click();
        Log.info("Add contact detials button has been clicked" );
        
        Registration_Page.RemoveContactDetail_Singular().click();
        Log.info("Remove contact detials button has been clicked" );
        
        Select Phonetype_Reg = new Select(Registration_Page.Phonetype_Registration());
        String Phonetype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        Phonetype_Reg.selectByVisibleText(Phonetype);
        Log.info(Phonetype+" value has been selected in dropdown" );
        
        Registration_Page.Phonenumber_Singular().clear();	
    	String Phonenumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodeContacto);
    	Registration_Page.Phonenumber_Singular().sendKeys(Phonenumber);
        Log.info(Phonenumber+" is entered in Contactnumber text box" );
        
        
        Registration_Page.AddEmail_Singular().click();
        Log.info("Add Email button has been clicked" );
        
        Registration_Page.RemoveEmail_Singular().click();
        Log.info("Remove Email button has been clicked" );
        
        Registration_Page.Email_Singular().clear();	
    	String Email = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
    	Registration_Page.Email_Singular().sendKeys(Email);
        Log.info(Email+" is entered in Email text box" );*/
        
        Select ProvinceAddressDetail_Registration = new Select(Registration_Page.ProvinceAddressDetail_Registration());
        String ProvinceAddressDetail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProvinciaInformacoes);
        ProvinceAddressDetail_Registration.selectByVisibleText(ProvinceAddressDetail);
        Log.info(ProvinceAddressDetail+" value has been selected in dropdown" );
        
        Select MunicipalityAddressDetail_Registration = new Select(Registration_Page.MunicipalityAddressDetail_Registration());
        String MunicipalityAddressDetail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MunicipioInformacoes);
        MunicipalityAddressDetail_Registration.selectByVisibleText(MunicipalityAddressDetail);
        Log.info(MunicipalityAddressDetail+" value has been selected in dropdown" );
        
        Select CommuneAddressDetail_Registration = new Select(Registration_Page.CommuneAddressDetail_Registration());
        String CommuneAddressDetail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ComunaInformacoes);
        CommuneAddressDetail_Registration.selectByVisibleText(CommuneAddressDetail);
        Log.info(CommuneAddressDetail+" value has been selected in dropdown" );
        
        Registration_Page.Neighbourhood_Registration().clear();	
    	String Neighbourhood = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Bairro);
    	Registration_Page.Neighbourhood_Registration().sendKeys(Neighbourhood);
        Log.info(Neighbourhood+" is entered in Neighbourhood text box" );
        
        Registration_Page.Physicaladdress_Registration().clear();	
    	String Physicaladdress = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EnderecoFisico);
    	Registration_Page.Physicaladdress_Registration().sendKeys(Physicaladdress);
        Log.info(Physicaladdress+" is entered in Physicaladdress text box" );
        
        Registration_Page.PlaceofReference_Registration().clear();	
    	String PlaceofReference = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LocaldeReferencia);
    	Registration_Page.PlaceofReference_Registration().sendKeys(PlaceofReference);
        Log.info(PlaceofReference+" is entered in PlaceofReference text box" );
        
        Select Taxofficeofdomicile_Registration = new Select(Registration_Page.Taxofficeofdomicile_Registration());
        String Taxofficeofdomicile = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ReparticaoFiscaldeDomicilio);
        Taxofficeofdomicile_Registration.selectByVisibleText(Taxofficeofdomicile);
        Log.info(Taxofficeofdomicile+" value has been selected in dropdown" );
        
        Registration_Page.CheckForm_Registration().click();
        Log.info("check form button has been clicked" );
        
        Thread.sleep(10000);
    	
        Registration_Page.Save_Registration().click();
        Log.info("Save form button has been clicked" );
        
        Thread.sleep(12000);
        BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        Registration_Page.Validar_Registration().click();
        Log.info("Validar form button has been clicked" );
        
        Thread.sleep(10000);
        BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        Registration_Page.Publicar_Registration().click();
        Log.info("Validar form button has been clicked" );
        
        Thread.sleep(10000);
        BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        Registration_Page.ImprimirComprovativodeCadastro_Registration().click();
        Log.info("ImprimirComprovativodeCadastro form button has been clicked" );
        
    }
}
