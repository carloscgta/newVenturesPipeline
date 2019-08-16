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

public class CollectiveRegistration_Action {
	
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
        
        Registration_Page.Commercialregistrationnumber_Collective().clear();
        String Commercialregistrationnumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdoDocumentodeIdentificacao);
        Registration_Page.Commercialregistrationnumber_Collective().sendKeys(Commercialregistrationnumber);
        Log.info(Commercialregistrationnumber+"has been inserted" );
        
        Registration_Page.Denomination_Collective().clear();
        String Denomination = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Denominacao);
        Registration_Page.Denomination_Collective().sendKeys(Denomination);
        Log.info(Denomination+"has been inserted" );
        
        Registration_Page.Commercialdesignation_Collective().clear();
        String Commercialdesignation = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DesignacaoComercial);
        Registration_Page.Commercialdesignation_Collective().sendKeys(Commercialdesignation);
        Log.info(Commercialdesignation+"has been inserted" );
        
        Select Legalnature_Collective = new Select(Registration_Page.Legalnature_Collective());
        String Legalnature = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NaturezaLegal);
        Legalnature_Collective.selectByVisibleText(Legalnature);
        Log.info(Legalnature+" value has been selected in dropdown" );
        
        Registration_Page.PublishedinOfficialGazette_Collective().clear();
        String PublishedinOfficialGazette = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PublicadonoDiariodaRepublica);
        Registration_Page.PublishedinOfficialGazette_Collective().sendKeys(PublishedinOfficialGazette);
        Log.info(PublishedinOfficialGazette+"has been inserted" );
        
        Registration_Page.DRnumber_Collective().clear();
        String DRnumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdoDiariodaRepublica);
        Registration_Page.DRnumber_Collective().sendKeys(DRnumber);
        Log.info(DRnumber+"has been inserted" );
        
        Registration_Page.DatepublishedinGazette_Collective().clear();
        String DatepublishedinGazette = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeIniciodoVinculo);
        Registration_Page.DatepublishedinGazette_Collective().sendKeys(DatepublishedinGazette);
        Log.info(DatepublishedinGazette+"has been inserted" );
        
        Registration_Page.Dateofconstitution_Collective().clear();
        String Dateofconstitution = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadaConstituicao);
        Registration_Page.Dateofconstitution_Collective().sendKeys(Dateofconstitution);
        Log.info(Dateofconstitution+"has been inserted" );
        
        Registration_Page.SocialCapital_Collective().clear();
        String SocialCapital = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CapitalSocial);
        Registration_Page.SocialCapital_Collective().sendKeys(SocialCapital);
        Log.info(SocialCapital+"has been inserted" );
        
        Registration_Page.Numberofemployees_Collective().clear();
        String Numberofemployees = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdoDocumentodeIdentificacao);
        Registration_Page.Numberofemployees_Collective().sendKeys(Numberofemployees);
        Log.info(Numberofemployees+"has been inserted" );
        
        Registration_Page.Volumeofbusiness_Collective().clear();
        String Volumeofbusiness = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Funcao);
        Registration_Page.Volumeofbusiness_Collective().sendKeys(Volumeofbusiness);
        Log.info(Volumeofbusiness+"has been inserted" );
        

        Registration_Page.IBAN_Collective().clear();	
    	String IBAN_Collective = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_IBAN);
    	Registration_Page.IBAN_Collective().sendKeys(IBAN_Collective);
        Log.info(IBAN_Collective+" is entered in IBAN text box" );
        
        Registration_Page.NIFIOA_Collective().clear();	
    	String NIFIOA_Collective = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.NIFIOA_Collective().sendKeys(NIFIOA_Collective);
        Log.info(NIFIOA_Collective+" is entered in LegalrepresentativeNIF text box" );
        Registration_Page.NIFIOA_Collective().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.PersonIOA_Collective().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        else
        {
        	Log.info("NIF person details are not displayed");
        }
        
        Select TipodeResponsabilidade_Collective = new Select(Registration_Page.TipodeResponsabilidade_Collective());
        String TipodeResponsabilidade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeResponsabilidade);
        TipodeResponsabilidade_Collective.selectByVisibleText(TipodeResponsabilidade);
        Log.info(TipodeResponsabilidade+" value has been selected in dropdown" ); 
        
        Select Phonetype_Registration = new Select(Registration_Page.Phonetype_Registration());
        String Phonetype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        Phonetype_Registration.selectByVisibleText(Phonetype);
        Log.info(Phonetype+" value has been selected in dropdown" );
        
        Registration_Page.Phonenumber_Singular().clear();	
    	String Phonenumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodeContacto);
    	Registration_Page.Phonenumber_Singular().sendKeys(Phonenumber);
        Log.info(Phonenumber+" is entered in Contactnumber text box" );
        
        Registration_Page.Email_Singular().clear();	
    	String Email = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
    	Registration_Page.Email_Singular().sendKeys(Email);
        Log.info(Email+" is entered in Email text box" );
        
        Registration_Page.NIFIOR_Collective().clear();	
    	String NIFIOR_Collective = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.NIFIOR_Collective().sendKeys(NIFIOR_Collective);
        Log.info(NIFIOR_Collective+" is entered in NIFIR_Collective text box" );
        
        if(!"".equalsIgnoreCase(Registration_Page.PersonIR_Collective().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        else
        {
        	Log.info("NIF person details are not displayed");
        }
        
        Registration_Page.ParnterNIF_Collective().clear();	
    	String ParnterNIF_Collective = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.ParnterNIF_Collective().sendKeys(ParnterNIF_Collective);
        Log.info(ParnterNIF_Collective+" is entered in ParnterNIF_Collective text box" );
        Registration_Page.ParnterNIF_Collective().sendKeys(Keys.TAB);
        if(!"".equalsIgnoreCase(Registration_Page.ParnterPerson_Collective().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        else
        {
        	Log.info("NIF person details are not displayed");
        }
        
        /*Registration_Page.Number_Collective().clear();	
    	String Number_Collective = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.Number_Collective().sendKeys(Number_Collective);
        Log.info(Number_Collective+" is entered in ParnterNIF_Collective text box" );*/
        
        Registration_Page.DenominationOther_Collective().clear();	
    	String DenominationOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Denominacao);
    	Registration_Page.DenominationOther_Collective().sendKeys(DenominationOther);
        Log.info(DenominationOther+" is entered in DenominationOther text box" );
        
        Select ProvinceOther_Collective = new Select(Registration_Page.ProvinceOther_Collective());
        String ProvinceOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProvinciaInformacoes);
        ProvinceOther_Collective.selectByVisibleText(ProvinceOther);
        Log.info(ProvinceOther+" value has been selected in dropdown" );
        
        Select MunicipalityOther_Collective = new Select(Registration_Page.MunicipalityOther_Collective());
        String MunicipalityOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MunicipioInformacoes);
        MunicipalityOther_Collective.selectByVisibleText(MunicipalityOther);
        Log.info(MunicipalityOther+" value has been selected in dropdown" );
        
        Select CommuneOther_Collective = new Select(Registration_Page.CommuneOther_Collective());
        String CommuneOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ComunaInformacoes);
        CommuneOther_Collective.selectByVisibleText(CommuneOther);
        Log.info(CommuneOther+" value has been selected in dropdown" );
        
        Registration_Page.NeighbourhoodOther_Collective().clear();	
    	String NeighbourhoodOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Bairro);
    	Registration_Page.NeighbourhoodOther_Collective().sendKeys(NeighbourhoodOther);
        Log.info(NeighbourhoodOther+" is entered in Neighbourhood text box" );
        
        Registration_Page.PhysicalAddressOther_Collective().clear();	
    	String PhysicalAddressOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EnderecoFisico);
    	Registration_Page.PhysicalAddressOther_Collective().sendKeys(PhysicalAddressOther);
        Log.info(PhysicalAddressOther+" is entered in Physicaladdress text box" );
        
        Registration_Page.PlaceofReferenceOther_Collective().clear();	
    	String PlaceofReferenceOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LocaldeReferencia);
    	Registration_Page.PlaceofReferenceOther_Collective().sendKeys(PlaceofReferenceOther);
        Log.info(PlaceofReferenceOther+" is entered in PlaceofReference text box" );
        
        Select TaxOfficeOther_Collective = new Select(Registration_Page.TaxOfficeOther_Collective());
        String TaxOfficeOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ReparticaoFiscaldeDomicilio);
        TaxOfficeOther_Collective.selectByVisibleText(TaxOfficeOther);
        Log.info(TaxOfficeOther+" value has been selected in dropdown" );
        
        Registration_Page.NumberofemployeesOther_Collective().clear();	
    	String NumberofemployeesOther = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdeEmpregados);
    	Registration_Page.NumberofemployeesOther_Collective().sendKeys(NumberofemployeesOther);
        Log.info(NumberofemployeesOther+" is entered in PlaceofReference text box" );
        
        Select PhoneType1_Collective = new Select(Registration_Page.PhoneType1_Collective());
        String PhoneType1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        PhoneType1_Collective.selectByVisibleText(PhoneType1);
        Log.info(PhoneType1+" value has been selected in dropdown" );
        
        Registration_Page.PhoneNumber1_Collective().clear();	
    	String PhoneNumber1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodeContacto1);
    	Registration_Page.PhoneNumber1_Collective().sendKeys(PhoneNumber1);
        Log.info(PhoneNumber1+" is entered in Contactnumber text box" );
        
        Select PhoneType2_Collective = new Select(Registration_Page.PhoneType2_Collective());
        String PhoneType2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        PhoneType2_Collective.selectByVisibleText(PhoneType2);
        Log.info(PhoneType2+" value has been selected in dropdown" );
        
        Registration_Page.PhoneNumber2_Collective().clear();	
    	String PhoneNumber2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodeContacto2);
    	Registration_Page.PhoneNumber2_Collective().sendKeys(PhoneNumber2);
        Log.info(PhoneNumber2+" is entered in Contactnumber text box" );
        
        Select PhoneType3_Collective = new Select(Registration_Page.PhoneType3_Collective());
        String PhoneType3 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        PhoneType3_Collective.selectByVisibleText(PhoneType3);
        Log.info(PhoneType3+" value has been selected in dropdown" );
        
        Registration_Page.PhoneNumber3_Collective().clear();	
    	String PhoneNumber3 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodeContacto3);
    	Registration_Page.PhoneNumber3_Collective().sendKeys(PhoneNumber3);
        Log.info(PhoneNumber3+" is entered in Contactnumber text box" );
        
        Registration_Page.Email1_Collective().clear();	
    	String Email1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email1);
    	Registration_Page.Email1_Collective().sendKeys(Email1);
        Log.info(Email1+" is entered in Email text box" );
        
        Registration_Page.Email2_Collective().clear();	
    	String Email2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email2);
    	Registration_Page.Email2_Collective().sendKeys(Email2);
        Log.info(Email2+" is entered in Email text box" );
        
        Registration_Page.Email3_Collective().clear();	
    	String Email3 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email3);
    	Registration_Page.Email3_Collective().sendKeys(Email3);
        Log.info(Email3 +" is entered in Email text box" );
        
        Registration_Page.NIFConsolidatedGroup_Collective().clear();	
    	String NIFConsolidatedGroup = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.NIFConsolidatedGroup_Collective().sendKeys(NIFConsolidatedGroup);
        Log.info(NIFConsolidatedGroup+" is entered in NIFIR_Collective text box" );
        Registration_Page.NIFConsolidatedGroup_Collective().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.PersonConsolidatedGroup_Collective().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        else
        {
        	Log.info("NIF person details are not displayed");
        }
        
        Registration_Page.Percentageofparticipation_Collective().clear();	
    	String Percentageofparticipation = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Funcao);
    	Registration_Page.Percentageofparticipation_Collective().sendKeys(Percentageofparticipation);
        Log.info(Percentageofparticipation +" is entered in Percentage of participation text box" );
        
        Select Primarycontacttype_Registration = new Select(Registration_Page.Primarycontacttype_Registration());
        String Primarycontacttype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContactoPrincipal );
        Primarycontacttype_Registration.selectByVisibleText(Primarycontacttype);
        Log.info(Primarycontacttype+" value has been selected in dropdown" );
        
        Registration_Page.Contactnumber_Registration().clear();	
    	String Contactnumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdeContacto);
    	Registration_Page.Contactnumber_Registration().sendKeys(Contactnumber);
        Log.info(Contactnumber+" is entered in Contactnumber text box" );
        
        /*Registration_Page.AddContactDetail_Singular().click();
        Log.info("Add contact detials button has been clicked" );
        
        Registration_Page.RemoveContactDetail_Singular().click();
        Log.info("Remove contact detials button has been clicked" );*/
        
        /*Select Phonetype_Reg = new Select(Registration_Page.Phonetype_Registration());
        //String Phonetype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        Phonetype_Reg.selectByVisibleText(Phonetype);
        Log.info(Phonetype+" value has been selected in dropdown" );
        
        Registration_Page.Phonenumber_Singular().clear();	
    	//String Phonenumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NúmerodeContacto);
    	Registration_Page.Phonenumber_Singular().sendKeys(Phonenumber);
        Log.info(Phonenumber+" is entered in Contactnumber text box" );
        
        
        Registration_Page.AddEmail_Singular().click();
        Log.info("Add Email button has been clicked" );
        
        Registration_Page.RemoveEmail_Singular().click();
        Log.info("Remove Email button has been clicked" );
        
        Registration_Page.Email_Singular().clear();	
    	//String Email = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
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
        
        Registration_Page.ActividadePrincipal_Registration().click();
        Log.info("ActividadePrincipal checkbox has been selected");
        
        Registration_Page.DesignacaoComercial_Registration().clear();
        String DesignacaoComercial = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DesignacaoComercial);
        Registration_Page.DesignacaoComercial_Registration().sendKeys(DesignacaoComercial);
        Log.info(DesignacaoComercial+"has been inserted" );
        
        Registration_Page.DatadeInicio_Registration().clear();
        String DatadeInicio = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadaConstituicao);
        Registration_Page.DatadeInicio_Registration().sendKeys(DatadeInicio);
        Log.info(DatadeInicio+"has been inserted" );
        

        
        Select CodigodeActividade_Registration = new Select(Registration_Page.CodigodeActividade_Registration());
        String CódigodeActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CodigodeActividade);
        CodigodeActividade_Registration.selectByVisibleText(CódigodeActividade);
        Log.info(CódigodeActividade+" value has been selected in dropdown" );
        
        Select ProvinciaActividade_Registration = new Select(Registration_Page.ProvinciaActividade_Registration());
        String ProvinciaActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProvinciaInformacoes);
        ProvinciaActividade_Registration.selectByVisibleText(ProvinciaActividade);
        Log.info(ProvinciaActividade+" value has been selected in dropdown" );
        
        Select MunicipioActividade_Registration = new Select(Registration_Page.MunicipioActividade_Registration());
        String MunicipioActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MunicipioInformacoes);
        MunicipioActividade_Registration.selectByVisibleText(MunicipioActividade);
        Log.info(MunicipioActividade+" value has been selected in dropdown" );
        
        Select ComunaActividade_Registration = new Select(Registration_Page.ComunaActividade_Registration());
        String ComunaActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ComunaInformacoes);
        ComunaActividade_Registration.selectByVisibleText(ComunaActividade);
        Log.info(ComunaActividade+" value has been selected in dropdown" );
        
        Registration_Page.BairroActividade_Registration().clear();	
    	String BairroActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Bairro);
    	Registration_Page.BairroActividade_Registration().sendKeys(BairroActividade);
        Log.info(BairroActividade+" is entered in Neighbourhood text box" );
        
        Registration_Page.EnderecofisicoActividade_Registration().clear();	
    	String EnderecofisicoActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EnderecoFisico);
    	Registration_Page.EnderecofisicoActividade_Registration().sendKeys(EnderecofisicoActividade);
        Log.info(EnderecofisicoActividade+" is entered in Physicaladdress text box" );
        
        Registration_Page.LocaldeReferenciaActividade_Registration().clear();	
    	String LocaldeReferenciaActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LocaldeReferencia);
    	Registration_Page.LocaldeReferenciaActividade_Registration().sendKeys(LocaldeReferenciaActividade);
        Log.info(LocaldeReferenciaActividade+" is entered in PlaceofReference text box" );
        
        Registration_Page.CheckForm_Registration().click();
        Log.info("check form button has been clicked" );
        
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
