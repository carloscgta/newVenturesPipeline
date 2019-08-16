package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class Registration_Page extends BaseClass{
    private static WebElement element = null;
   
public Registration_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement CheckForm_Registration() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("input.oraButton.oraDefault"));
    
        Log.info("Check Form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Check Form is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Save_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Gravar']"));
    
        Log.info("Save button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Save button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement SavenContinue_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Save & Continue']"));
    
        Log.info("Save & Continue button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Save & Continue button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		
	
public static WebElement Cancel_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Cancel']"));
    
        Log.info("Tipo de Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Identificação field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		

public static WebElement Validar_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Validar']"));
    
        Log.info("Validar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Validar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Publicar_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Publicar']"));
    
        Log.info("Publicar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Publicar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement ImprimirComprovativodeCadastro_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Imprimir Comprovativo de Cadastro']"));
    
        Log.info("Imprimir Comprovativo de Cadastro button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Imprimir Comprovativo de Cadastro button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Menu_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Forms_Registration() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("#CI_MAINMENU_topMenuItem0x3 > span"));
    
        Log.info("Forms Navigation button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Forms Navigation button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("#CI_FORM_subMenuItem1x1 > span"));
    
        Log.info("Registration form Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Registration form Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Add_Registration() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("#c1regFormTabMenuAdd > span"));
        Log.info("Add Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Add Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement DocumentLocator_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("documentLocator"));
        Log.info("Document Locator field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Document Locator field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement OriginofRegistration_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_originOfTheRegistration_asCurrent"));
        Log.info("Origin of Registration dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Origin of Registration dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement TaxpayerLegacyNIF_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_taxpayerLegacyNIF_asCurrent"));
        Log.info("Taxpayer Legacy NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Taxpayer Legacy NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Taxpayertype_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_taxpayerType_asCurrent"));
        Log.info("Taxpayer type field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Taxpayer type field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Simple_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_singularSimple_asCurrent"));
        Log.info("Simple checkbox is found on the Home Page");
    }catch (Exception e){
    	Log.error("Simple checkbox is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement WorkforownAccount_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_singularOwnAccount_asCurrent"));
        Log.info("Work for own Account checkbox is found on the Home Page");
    }catch (Exception e){
    	Log.error("Work for own Account check box is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement WorkforanotherAccount_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_singularOtherAccount_asCurrent"));
        Log.info("Work for another's Account checkbox is found on the Home Page");
    }catch (Exception e){
    	Log.error("Work for another's Account checkbox is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Pensioner_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_registrationDetails_singularPensioner_asCurrent"));
        Log.info("Pensioner checkbox is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pensioner checkbox is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Identificationtype_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerIdDetails_idType_asCurrent"));
        Log.info("Identification type dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Identification type dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement IdentificationDocumentNumber_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerIdDetails_idDocumentNumber_asCurrent"));
        Log.info("Identification Document Number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Identification Document Number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ExpiryDate_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerIdDetails_passportExpiryDate_asCurrent"));
        Log.info("Expiry Date field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Expiry Date field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Passportcountry_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerIdDetails_passportCountry_asCurrent"));
        Log.info("Passport country dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Passport country dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Firstname_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_firstName_asCoraErrorurrent"));
        Log.info("First Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("First Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Middlename_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_middleName_asCurrent"));
        Log.info("Middle Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Middle name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Lastname_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_lastName_asCurrent"));
        Log.info("Last name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Last name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Gender_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_gender_asCurrent"));
        Log.info("Gender Dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Gender Dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Dateofbirth_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_dateOfBirth_asCurrent"));
        Log.info("Date of birth field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date of birth field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NationalityCountry_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_countryOfBirth_asCurrent"));
        Log.info("Country Dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Country Dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement CountryofBirth_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_country_asCurrent"));
        Log.info("Country of Birth Dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Country of Birth Dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ProvinceofBirth_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_singularTaxpayerDetails_province_asCurrent"));
        Log.info("Province Dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Province Dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement MunicipalityofBirth_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_singularTaxpayerDetails_municipality_asCurrent"));
        Log.info("Municipality Dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Municipality Dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement MotherName_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_mothersName_asCurrent"));
        Log.info("MotherName field is found on the Home Page");
    }catch (Exception e){
    	Log.error("MotherName field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement FatherName_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_singularTaxpayerDetails_fathersName_asCurrent"));
        Log.info("FatherName field is found on the Home Page");
    }catch (Exception e){
    	Log.error("FatherName field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Civilstatus_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_civilStatus_asCurrent"));
        Log.info("Civil status dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Civil status dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement SpouseID_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_idNumberOfSpouse_asCurrent"));
        Log.info("Spouse ID field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Spouse ID field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Spouseperson_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_idNumberOfSpousePerId_asCurrent_fkReferenceInfo"));
        Log.info("Spouse person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Spouse person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement IBAN_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_numberOfBankIdentifierIBAN_asCurrent"));
        Log.info("IBAN field is found on the Home Page");
    }catch (Exception e){
    	Log.error("IBAN field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement LegalrepresentativeNIF_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_legalRepresentative_asCurrent"));
        Log.info("Legal representative NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Legal representative NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIFperson_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_legalRepresentativePerId_asCurrent_fkReferenceInfo"));
        Log.info("NIF person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Degreeofinvalidity_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_degreeOfInvalidity_asCurrent"));
        Log.info("Degree of invalidity field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Degree of invalidity field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Primarycontacttype_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_contactInformation_primaryContactType_asCurrent"));
        Log.info("Primary contact type dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Primary contact type dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Contactnumber_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_contactInformation_contactNumber_asCurrent"));
        Log.info("Contact number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Contact number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Phonetype_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("phoneType_asCurrent_0"));
        Log.info("Phone type field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone type field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Phonenumber_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("phoneNumber_asCurrent_0"));
        Log.info("Phone number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Email_Singular() throws Exception{
    try{
    	element = driver.findElement(By.id("email_asCurrent_0"));
        Log.info("Email field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Email field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement AddContactDetail_Singular() throws Exception{
    try{
    	element = driver.findElement(By.xpath("(//img[@alt='Add'])[9]"));
        Log.info("Add Contact Detail button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Add Contact Detail button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RemoveContactDetail_Singular() throws Exception{
    try{
    	element = driver.findElement(By.xpath("(//img[@alt='Delete'])[15]"));
        Log.info("Remove Contact Detail button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Remove Contact Detail button field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement AddEmail_Singular() throws Exception{
    try{
    	element = driver.findElement(By.xpath("(//img[@alt='Add'])[9]"));
        Log.info("Add Email button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Add Email button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RemoveEmail_Singular() throws Exception{
    try{
    	element = driver.findElement(By.xpath("(//img[@alt='Delete'])[15]"));
        Log.info("Remove Email button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Remove Email button field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ProvinceAddressDetail_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_addressInformation_addressProvince_asCurrent"));
        Log.info("Province dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Province dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement MunicipalityAddressDetail_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_addressInformation_addressMunicipality_asCurrent"));
        Log.info("Municipality dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Municipality dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement CommuneAddressDetail_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_addressInformation_addressCommune_asCurrent"));
        Log.info("Commune dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Commune dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Neighbourhood_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_addressInformation_addressNeighbourhood_asCurrent"));
        Log.info("Neighbourhood field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Neighbourhood field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Physicaladdress_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_addressInformation_addressPhysicalAddress_asCurrent"));
        Log.info("Physical address field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Physical address field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PlaceofReference_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_addressInformation_addressPlaceOfReference_asCurrent"));
        Log.info("Place of Reference field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Place of Reference field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Taxofficeofdomicile_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_select_addressInformation_addressTaxOfficeOfDomicile_asCurrent"));
        Log.info("Tax office of domicile field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tax office of domicile field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement ActividadePrincipal_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("isPrincipalActivity_asCurrent_0"));
        Log.info("Actividade Principal field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Actividade Principal field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DesignacaoComercial_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("commercialDesignation_asCurrent_0"));
        Log.info("Designação Comercial field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Designação Comercial field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DatadeInicio_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("dateOfInitialisation_asCurrent_0"));
        Log.info("Data de Início field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de Início field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Profissao_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("profession_asCurrent_0"));
        Log.info("Profissão field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Profissão field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement CodigodeActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("CAEPrincipal_asCurrent_0"));
        Log.info("Código de Actividade field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Código de Actividade field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ProvinciaActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("province_select_0"));
        Log.info("ProvínciaActividade field is found on the Home Page");
    }catch (Exception e){
    	Log.error("ProvínciaActividade field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement MunicipioActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("municipality_select_0"));
        Log.info("Tax office of domicile field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tax office of domicile field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ComunaActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("commune_select_0"));
        Log.info("Tax office of domicile field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tax office of domicile field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement BairroActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("neighbourhood_asCurrent_0"));
        Log.info("neighbourhood field is found on the Home Page");
    }catch (Exception e){
    	Log.error("neighbourhood field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement EnderecofisicoActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("physicalAddress_asCurrent_0"));
        Log.info("physicalAddress field is found on the Home Page");
    }catch (Exception e){
    	Log.error("physicalAddress field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement LocaldeReferenciaActividade_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("placeofReference_asCurrent_0"));
        Log.info("placeofReference field is found on the Home Page");
    }catch (Exception e){
    	Log.error("placeofReference field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Entidadeempregadora_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_activityData_activityDataEntityOfEmployment_asCurrent"));
        Log.info("Entidade empregadora field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Entidade empregadora field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Pessoa_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_activityData_activityDataEntityOfEmployPer_asCurrent_fkReferenceInfo"));
        Log.info("Pessoa field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pessoa field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement DatadeiniciodoVinculo_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_activityData_activityDataIniDateOfCommence_asCurrent"));
        Log.info("Data de ínicio do Vínculo field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de ínicio do Vínculo field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Funcao_Registration() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_activityData_activityDataFunction_asCurrent"));
        Log.info("Função field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Função field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

/*-------------------------------------------------Collective--------------------------------------------------------------------*/

public static WebElement Commercialregistrationnumber_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_collectiveTaxpayerIdDetails_collCommercialRegNumber_asCurrent"));
        Log.info("Commercial registration number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Commercial registration number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Denomination_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_collectiveTaxpayerIdDetails_collName_asCurrent"));
        Log.info("Denomination field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Denomination field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Commercialdesignation_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_collectiveTaxpayerIdDetails_collCommercialDesignation_asCurrent"));
        Log.info("Denomination field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Denomination field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Legalnature_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_collectiveTaxpayerIdDetails_collLegalNature_asCurrent"));
        Log.info("Legal nature field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Legal nature field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PublishedinOfficialGazette_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollPublishedInOffGazette_asCurrent"));
        Log.info("Published in Official Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Published in Official Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DRnumber_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollDRNumber_asCurrent"));
        Log.info("DR number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("DR number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Dateofconstitution_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollDateOfConstitution_asCurrent"));
        Log.info("Date of constitution field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date of constitution field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DatepublishedinGazette_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollDatePublishInGazette_asCurrent"));
        Log.info("Date published in Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date published in Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement SocialCapital_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollSocialCapitalAOA_asCurrent"));
        Log.info("Social Capital field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Social Capital field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Numberofemployees_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollNumberOfEmployees_asCurrent"));
        Log.info("Date published in Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date published in Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Volumeofbusiness_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollVolumeOfBusiness_asCurrent"));
        Log.info("Volume of business field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Volume of business field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement IBAN_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollNumberOfBankIdIBAN_asCurrent"));
        Log.info("Date published in Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date published in Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIFIOA_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollRespInRegarTheFirmNIF_asCurrent"));
        Log.info("NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement TipodeResponsabilidade_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollResponsibilityType_asCurrent"));
        Log.info("Tipo de Responsabilidade field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Responsabilidade field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PersonIOA_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherCollectiveDetails_otherCollAccountantPerId_asCurrent_fkReferenceInfo"));
        Log.info("Person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIFIOR_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollNIF_asCurrent_0"));
        Log.info("NIF IR field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF IR field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PersonIR_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollNIFPerId_asCurrent_fkReferenceInfo_0"));
        Log.info("Person IR field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person IR field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ParnterNIF_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollIdNumber_asCurrent_0"));
        Log.info("Partner NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Partner NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ParnterPerson_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollIdPerId_asCurrent_fkReferenceInfo_0"));
        Log.info("Partner Person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Partner Person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Account_Collective() throws Exception{
    try{
    	element =driver.findElement(By.id("otherCollAccountId_asCurrent_0"));
        Log.info(" Account field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Account field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Number_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollNumber_asCurrent_0"));
        Log.info("Number field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Number field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DenominationOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollDenomination_asCurrent_0"));
        Log.info("Denomination field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Denomination field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ProvinceOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSelectSubAndBranchProvince_asCurrent_0"));
        Log.info("Province field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Province field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement MunicipalityOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSelectSubAndBranchMunicipality_asCurrent_0"));
        Log.info("Municipality field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Municipality field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement CommuneOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSelectSubsCommune_asCurrent_0"));
        Log.info("Commune field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Commune field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NeighbourhoodOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSubsNeighbourhood_asCurrent_0"));
        Log.info("Neighbourhood field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Neighbourhood field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhysicalAddressOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSubsPhysicalAddress_asCurrent_0"));
        Log.info("Physical Address field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Physical Address field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PlaceofReferenceOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSubsPlaceOfReference_asCurrent_0"));
        Log.info("Place of Reference field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Place of Reference field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement TaxOfficeOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollSubsTaxOffice_asCurrent_0"));
        Log.info("Tax office dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tax office dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NumberofemployeesOther_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollOfficialSubsidiaryNum_asCurrent_0"));
        Log.info("Number of employees dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Number of employees dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneType1_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneType1_asCurrent_0"));
        Log.info("Phone type 1 dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone type 1 dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneNumber1_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneNumber1_asCurrent_0"));
        Log.info("Phone Number 1 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone Number 1 is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneType2_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneType2_asCurrent_0"));
        Log.info("Phone type 2 dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone type 2 dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneNumber2_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneNumber2_asCurrent_0"));
        Log.info("Phone Number 2 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone Number 2 is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneType3_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneType3_asCurrent_0"));
        Log.info("Phone type 3 dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone type 3 dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PhoneNumber3_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPhoneNumber3_asCurrent_0"));
        Log.info("Phone Number 3 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Phone Number 3 is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Email1_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollEmail1_asCurrent_0"));
        Log.info("Email 1 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Email 1 field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Email2_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollEmail2_asCurrent_0"));
        Log.info("Email 2 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Email 2 field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Email3_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollEmail3_asCurrent_0"));
        Log.info("Email 3 field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Email 3 field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIFConsolidatedGroup_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollNIFHoldCompConsGrp_asCurrent_0"));
        Log.info("NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PersonConsolidatedGroup_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollHoldCompConsGrpPerId_asCurrent_fkReferenceInfo_0"));
        Log.info("Person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Percentageofparticipation_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("otherCollPercentParticipation_asCurrent_0"));
        Log.info("Percentage of participation field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Percentage of participation field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ActivityID_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("activityId_asCurrent_0"));
        Log.info("Activity ID field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Activity ID field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PrincipalActivity_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("isPrincipalActivity_asCurrent_0"));
        Log.info("Principal Activity field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Principal Activity field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement CommercialdesignationActivities_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("commercialDesignation_asCurrent_0"));
        Log.info("Commercial designation field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Commercial designation field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Dateofinitialisation_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("dateOfInitialisation_asCurrent_0"));
        Log.info("Date of initialisation field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date of initialisation field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement ActivityCode_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("CAEPrincipal_asCurrent_0"));
        Log.info("Activity Code field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Activity Code field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Province_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("province_select_0"));
        Log.info("Province field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Province field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Municipality_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("municipality_select_0"));
        Log.info("Municipality field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Municipality field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Commune_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("commune_select_0"));
        Log.info("Commune field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Commune field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Neighbourhood_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("neighbourhood_asCurrent_0"));
        Log.info("Neighbourhood field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Neighbourhood field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Physicaladdress_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("physicalAddress_asCurrent_0"));
        Log.info("Physical address field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Physical address field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PlaceofReference_Collective() throws Exception{
    try{
    	element = driver.findElement(By.id("placeofReference_asCurrent_0"));
        Log.info("Place of Reference field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Place of Reference field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}


/*-------------------------------------------Institutional-----------------------------------------------------------------------------------*/



public static WebElement Name_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_name_asCurrent"));
        Log.info("Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement PublishedinOfficialGazette_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_publishedInOfficialGazette_asCurrent"));
        Log.info("Published in Official Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Published in Official Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DRnumber_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_drNumber_asCurrent"));
        Log.info("DRnumber field is found on the Home Page");
    }catch (Exception e){
    	Log.error("DRnumber field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement DatepublishedinGazette_Instititional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_datePublishedInGazette_asCurrent"));
        Log.info("Date published in Gazette field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date published in Gazette field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIF_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_responsibInRegardsToTheFirmNIF_asCurrent"));
        Log.info("NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement NIFPerson_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_responsInRegardsToTheFirmPerId_asCurrent_fkReferenceInfo"));
        Log.info("Person field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement Responsibilitytype_Institutional() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_institutionalTaxpayerDetails_responsibilityType_asCurrent"));
        Log.info("Place of Reference field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Place of Reference field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
//--------------------------NIF Search------------------------------------------------------------------------------------------------------



public static WebElement NIFdoRepresentanteLegal_Search() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherSingularTaxpayerDetails_legalRepresentative_asCurrent_search"));
        Log.info("NIF do Representante Legal button is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF do Representante Legal button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

}
