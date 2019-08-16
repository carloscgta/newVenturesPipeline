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

public class SingularRegistration_Action {
	
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
        
        Registration_Page.Simple_Singular().click();
        Log.info("Simple checkbox has been selected" );
        
        Registration_Page.WorkforownAccount_Singular().click();
        Log.info("WorkforownAccount checkbox has been selected");
        
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
        
        Select Profissao_Registration = new Select(Registration_Page.Profissao_Registration());
        String ProfissaoReg = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Profissao);
        Profissao_Registration.selectByVisibleText(ProfissaoReg);
        Log.info(ProfissaoReg+" value has been selected in dropdown" );
        
        Select CodigodeActividade_Registration = new Select(Registration_Page.CodigodeActividade_Registration());
        String CodigodeActividade = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CodigodeActividade);
        CodigodeActividade_Registration.selectByVisibleText(CodigodeActividade);
        Log.info(CodigodeActividade+" value has been selected in dropdown" );
        
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
        
        Registration_Page.WorkforanotherAccount_Singular().click();
        Log.info("WorkforanotherAccount checkbox has been selected" );
        
        Registration_Page.Pensioner_Singular().click();
        Log.info("Pensioner checkbox has been selected" );
        
        Select Identificationtype = new Select(Registration_Page.Identificationtype_Singular());
        String IdentificationtypeValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificacao);
        Identificationtype.selectByVisibleText(IdentificationtypeValue);
        Log.info(IdentificationtypeValue+" value has been selected in dropdown" );
        
        Registration_Page.IdentificationDocumentNumber_Singular().clear();
        String IdentificationDocumentNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdoDocumentodeIdentificacao);
        Registration_Page.IdentificationDocumentNumber_Singular().sendKeys(IdentificationDocumentNumber);
        Log.info(IdentificationDocumentNumber+"has been inserted" );
        
        if ((!IdentificationtypeValue.equalsIgnoreCase("BI Legado")) && (!IdentificationtypeValue.equalsIgnoreCase("Certidao de Nascimento")))
        {
        Registration_Page.ExpiryDate_Singular().clear();
        String ExpiryDate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadaConstituicao);
        Registration_Page.ExpiryDate_Singular().sendKeys(ExpiryDate);
        Log.info(ExpiryDate+"has been inserted" );
        }
        if (IdentificationtypeValue == "Passaporte") 
        { Select Passportcountry_Singular = new Select(Registration_Page.Passportcountry_Singular());
        String Passportcountry = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PaisNacionalidade);
        Passportcountry_Singular.selectByVisibleText(Passportcountry);
        Log.info(Passportcountry+" value has been selected in dropdown" );
        }
        
        Registration_Page.Firstname_Singular().clear();
    	String FirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
    	Registration_Page.Firstname_Singular().sendKeys(FirstName);
        Log.info(FirstName+" is entered in FirstName text box" );
        
        Registration_Page.Middlename_Singular().clear();	
    	String Middlename = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_IntermedioNome);
    	Registration_Page.Middlename_Singular().sendKeys(Middlename);
        Log.info(Middlename+" is entered in FirstName text box" );
        
        Registration_Page.Lastname_Singular().clear();	
    	String LastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UltimoNome);
    	Registration_Page.Lastname_Singular().sendKeys(LastName);
        Log.info(LastName+" is entered in FirstName text box" );
        
        Select Gender_Singular = new Select(Registration_Page.Gender_Singular());
        String Gender = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Genero);
        Gender_Singular.selectByVisibleText(Gender);
        Log.info(Gender+" value has been selected in dropdown" );
        
        Registration_Page.Dateofbirth_Singular().clear();	
    	String Dateofbirth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeIniciodoVinculo);
    	Registration_Page.Dateofbirth_Singular().sendKeys(Dateofbirth);
        Log.info(Dateofbirth+" is entered in Dateofbirth text box" );
        
        Select NationalityCountry_Singular = new Select(Registration_Page.NationalityCountry_Singular());
        String NationalityCountry = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PaisNaturalidade);
        NationalityCountry_Singular.selectByVisibleText(NationalityCountry);
        Log.info(NationalityCountry+" value has been selected in dropdown" );
        
        Select CountryofBirth_Singular = new Select(Registration_Page.CountryofBirth_Singular());
        String CountryofBirth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PaisNacionalidade);
        CountryofBirth_Singular.selectByVisibleText(CountryofBirth);
        Log.info(CountryofBirth+" value has been selected in dropdown" );
        
        if (CountryofBirth.contains("ANGOLA")) {
			Select ProvinceofBirth_Singular = new Select(Registration_Page.ProvinceofBirth_Singular());
			String ProvinceofBirth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Provincia);
			ProvinceofBirth_Singular.selectByVisibleText(ProvinceofBirth);
			Log.info(ProvinceofBirth + " value has been selected in dropdown");
			Select MunicipalityofBirth_Singular = new Select(Registration_Page.MunicipalityofBirth_Singular());
			String MunicipalityofBirth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Municipio);
			MunicipalityofBirth_Singular.selectByVisibleText(MunicipalityofBirth);
			Log.info(MunicipalityofBirth + " value has been selected in dropdown");
		}
		Registration_Page.FatherName_Singular().clear();	
    	String FatherName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomedoPai);
    	Registration_Page.FatherName_Singular().sendKeys(FatherName);
        Log.info(FatherName+" is entered in FatherName text box" );
        
        Registration_Page.MotherName_Singular().clear();	
    	String MotherName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomedoMae);
    	Registration_Page.MotherName_Singular().sendKeys(MotherName);
        Log.info(MotherName+" is entered in MotherName text box" );
        
        Select Civilstatus_Singular = new Select(Registration_Page.Civilstatus_Singular());
        String Civilstatus = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EstadoCivil);
        Civilstatus_Singular.selectByVisibleText(Civilstatus);
        Log.info(Civilstatus+" value has been selected in dropdown" );
        
        Registration_Page.SpouseID_Singular().clear();	
    	String SpouseID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.SpouseID_Singular().sendKeys(SpouseID);
        Log.info(SpouseID+" is entered in MotherName text box" );
        Registration_Page.SpouseID_Singular().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.Spouseperson_Singular().getText()))
        {
        	Log.info("Spouse details are displayed");
        }
        
        Registration_Page.IBAN_Singular().clear();	
    	String IBAN_Singular = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_IBAN);
    	Registration_Page.IBAN_Singular().sendKeys(IBAN_Singular);
        Log.info(IBAN_Singular+" is entered in IBAN text box" );
        
        Registration_Page.LegalrepresentativeNIF_Singular().clear();	
    	String LegalrepresentativeNIF = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.LegalrepresentativeNIF_Singular().sendKeys(LegalrepresentativeNIF);
        Log.info(LegalrepresentativeNIF+" is entered in LegalrepresentativeNIF text box" );
        Registration_Page.LegalrepresentativeNIF_Singular().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.NIFperson_Singular().getText()))
        {
        	Log.info("NIF person details are displayed");
        }

        Registration_Page.Degreeofinvalidity_Singular().clear();	
    	String Degreeofinvalidity = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_GraudeInvalidez);
    	Registration_Page.Degreeofinvalidity_Singular().sendKeys(Degreeofinvalidity);
        Log.info(Degreeofinvalidity+" is entered in Degreeofinvalidity text box" );
        
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
        Log.info("Remove contact detials button has been clicked" );
        
        Select Phonetype_Reg = new Select(Registration_Page.Phonetype_Registration());
        String Phonetype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeContacto );
        Phonetype_Reg.selectByIndex(3);
        Log.info(Phonetype+" value has been selected in dropdown" );
        
        Registration_Page.Phonenumber_Singular().clear();	
    	String Phonenumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NUmerodeContacto);
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
        
        Registration_Page.Entidadeempregadora_Registration().clear();	
    	String Entidadeempregadora = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoRepresentanteLegal);
    	Registration_Page.Entidadeempregadora_Registration().sendKeys(Entidadeempregadora);
        Log.info(Entidadeempregadora+" is entered in LegalrepresentativeNIF text box" );
        Registration_Page.Entidadeempregadora_Registration().sendKeys(Keys.TAB);
        
        if(!"".equalsIgnoreCase(Registration_Page.Pessoa_Registration().getText()))
        {
        	Log.info("NIF person details are displayed");
        }
        
        Registration_Page.DatadeiniciodoVinculo_Registration().clear();
        String DatadeiniciodoVinculo = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadaConstituicao);
        Registration_Page.DatadeiniciodoVinculo_Registration().sendKeys(DatadeiniciodoVinculo);
        Log.info(DatadeiniciodoVinculo+"has been inserted" );
        
        Registration_Page.Funcao_Registration().clear();	
    	String Funcao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Funcao);
    	Registration_Page.Funcao_Registration().sendKeys(Funcao);
        Log.info(Funcao+" is entered in Funcao text box" );
        
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
