
package com.siebel.selfservice.common.account.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountModId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CalculatedAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CellularPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactOrganizationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contacted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSRUpdatesFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FaxAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InviteToSeminars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Keylastupdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastClnseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastKeyGenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdate-SDQ" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnedById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferredCommunications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressModId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternateEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternatePhoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalPaymentProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryResponsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryServiceAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SessionPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneNameTranslation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserBuyer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XModId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListOfContactCommunicationAddress" type="{http://www.siebel.com/SelfService/Common/Account/Data}ListOfContactCommunicationAddressData" minOccurs="0"/>
 *         &lt;element name="ListOfContactAlternatePhone" type="{http://www.siebel.com/SelfService/Common/Account/Data}ListOfContactAlternatePhoneData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactData", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountCurrencyCode",
    "accountId",
    "accountIntegrationId",
    "accountModId",
    "accountPriceListId",
    "accountPrimaryBillToAddressId",
    "accountPrimaryBillToPersonId",
    "accountPrimaryShipToAddressId",
    "accountPrimaryShipToPersonId",
    "activeStatus",
    "alias",
    "approvalStatus",
    "birthDate",
    "calculatedAccountId",
    "call",
    "cellularPhone",
    "challengeAnswer",
    "challengeQuestion",
    "comment",
    "contactOrganizationIntegrationId",
    "contacted",
    "createdByName",
    "currencyCode",
    "dunsNumber",
    "disableDataCleansing",
    "emailAddress",
    "emailSRUpdatesFlag",
    "employeeFlag",
    "employeeId",
    "employeeLoginName",
    "employeeNumber",
    "endDate",
    "faxAddress",
    "faxPhone",
    "firstName",
    "fullName",
    "homePhone",
    "integrationId",
    "inviteToSeminars",
    "keylastupdated",
    "lastClnseDate",
    "lastKeyGenDate",
    "lastName",
    "lastNameFirstName",
    "lastNameFirstNameENU",
    "lastNameFirstNameJPN",
    "lastUpdateSDQ",
    "loginName",
    "middleName",
    "mode",
    "ownedBy",
    "ownedById",
    "partyName",
    "partyTypeCode",
    "partyUId",
    "password",
    "personUId",
    "personalContact",
    "preferredCommunications",
    "preferredLanguageCode",
    "priceList",
    "priceListId",
    "priceListIntegrationId",
    "primaryAccountName",
    "primaryAddressCounty",
    "primaryAddressId",
    "primaryAddressIntegrationId",
    "primaryAddressModId",
    "primaryAddressName",
    "primaryAddressStreetAddress2",
    "primaryAddressStreetAddress3",
    "primaryAlternateEmailId",
    "primaryAlternatePhoneId",
    "primaryCity",
    "primaryCountry",
    "primaryOrganization2",
    "primaryOrganizationId",
    "primaryPersonalAddressId",
    "primaryPersonalPaymentProfileId",
    "primaryPostalCode",
    "primaryResponsibilityId",
    "primaryServiceAgreementId",
    "primaryState",
    "primaryStreetAddress",
    "projectAccountId",
    "responsibilities",
    "rowId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "sendPromotions",
    "sessionPassword",
    "startDate",
    "status",
    "timeZone",
    "timeZoneId",
    "timeZoneName",
    "timeZoneNameTranslation",
    "userBuyer",
    "userStatus",
    "userType",
    "verifyPassword",
    "workPhone",
    "workPhoneExtension",
    "xModId",
    "listOfContactCommunicationAddress",
    "listOfContactAlternatePhone"
})
public class ContactData
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "AccountCurrencyCode")
    protected String accountCurrencyCode;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "AccountModId")
    protected Integer accountModId;
    @XmlElement(name = "AccountPriceListId")
    protected String accountPriceListId;
    @XmlElement(name = "AccountPrimaryBillToAddressId")
    protected String accountPrimaryBillToAddressId;
    @XmlElement(name = "AccountPrimaryBillToPersonId")
    protected String accountPrimaryBillToPersonId;
    @XmlElement(name = "AccountPrimaryShipToAddressId")
    protected String accountPrimaryShipToAddressId;
    @XmlElement(name = "AccountPrimaryShipToPersonId")
    protected String accountPrimaryShipToPersonId;
    @XmlElement(name = "ActiveStatus")
    protected Boolean activeStatus;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "ApprovalStatus")
    protected String approvalStatus;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "CalculatedAccountId")
    protected String calculatedAccountId;
    @XmlElement(name = "Call")
    protected Boolean call;
    @XmlElement(name = "CellularPhone")
    protected String cellularPhone;
    @XmlElement(name = "ChallengeAnswer")
    protected String challengeAnswer;
    @XmlElement(name = "ChallengeQuestion")
    protected String challengeQuestion;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ContactOrganizationIntegrationId")
    protected String contactOrganizationIntegrationId;
    @XmlElement(name = "Contacted")
    protected Boolean contacted;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "DisableDataCleansing")
    protected Boolean disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "EmailSRUpdatesFlag")
    protected Boolean emailSRUpdatesFlag;
    @XmlElement(name = "EmployeeFlag")
    protected Boolean employeeFlag;
    @XmlElement(name = "EmployeeId")
    protected String employeeId;
    @XmlElement(name = "EmployeeLoginName")
    protected String employeeLoginName;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "FaxAddress")
    protected String faxAddress;
    @XmlElement(name = "FaxPhone")
    protected String faxPhone;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InviteToSeminars")
    protected Boolean inviteToSeminars;
    @XmlElement(name = "Keylastupdated")
    protected XMLGregorianCalendar keylastupdated;
    @XmlElement(name = "LastClnseDate")
    protected XMLGregorianCalendar lastClnseDate;
    @XmlElement(name = "LastKeyGenDate")
    protected XMLGregorianCalendar lastKeyGenDate;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LastNameFirstName")
    protected String lastNameFirstName;
    @XmlElement(name = "LastNameFirstNameENU")
    protected String lastNameFirstNameENU;
    @XmlElement(name = "LastNameFirstNameJPN")
    protected String lastNameFirstNameJPN;
    @XmlElement(name = "LastUpdate-SDQ")
    protected XMLGregorianCalendar lastUpdateSDQ;
    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElement(name = "OwnedBy")
    protected String ownedBy;
    @XmlElement(name = "OwnedById")
    protected String ownedById;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyTypeCode")
    protected String partyTypeCode;
    @XmlElement(name = "PartyUId")
    protected String partyUId;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "PersonUId")
    protected String personUId;
    @XmlElement(name = "PersonalContact")
    protected Boolean personalContact;
    @XmlElement(name = "PreferredCommunications")
    protected String preferredCommunications;
    @XmlElement(name = "PreferredLanguageCode")
    protected String preferredLanguageCode;
    @XmlElement(name = "PriceList")
    protected String priceList;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected String priceListIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected String primaryAccountName;
    @XmlElement(name = "PrimaryAddressCounty")
    protected String primaryAddressCounty;
    @XmlElement(name = "PrimaryAddressId")
    protected String primaryAddressId;
    @XmlElement(name = "PrimaryAddressIntegrationId")
    protected String primaryAddressIntegrationId;
    @XmlElement(name = "PrimaryAddressModId")
    protected Integer primaryAddressModId;
    @XmlElement(name = "PrimaryAddressName")
    protected String primaryAddressName;
    @XmlElement(name = "PrimaryAddressStreetAddress2")
    protected String primaryAddressStreetAddress2;
    @XmlElement(name = "PrimaryAddressStreetAddress3")
    protected String primaryAddressStreetAddress3;
    @XmlElement(name = "PrimaryAlternateEmailId")
    protected String primaryAlternateEmailId;
    @XmlElement(name = "PrimaryAlternatePhoneId")
    protected String primaryAlternatePhoneId;
    @XmlElement(name = "PrimaryCity")
    protected String primaryCity;
    @XmlElement(name = "PrimaryCountry")
    protected String primaryCountry;
    @XmlElement(name = "PrimaryOrganization2")
    protected String primaryOrganization2;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPersonalAddressId")
    protected String primaryPersonalAddressId;
    @XmlElement(name = "PrimaryPersonalPaymentProfileId")
    protected String primaryPersonalPaymentProfileId;
    @XmlElement(name = "PrimaryPostalCode")
    protected String primaryPostalCode;
    @XmlElement(name = "PrimaryResponsibilityId")
    protected String primaryResponsibilityId;
    @XmlElement(name = "PrimaryServiceAgreementId")
    protected String primaryServiceAgreementId;
    @XmlElement(name = "PrimaryState")
    protected String primaryState;
    @XmlElement(name = "PrimaryStreetAddress")
    protected String primaryStreetAddress;
    @XmlElement(name = "ProjectAccountId")
    protected String projectAccountId;
    @XmlElement(name = "Responsibilities")
    protected String responsibilities;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "S-SInstance")
    protected String ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected String ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected String ssKeyId;
    @XmlElement(name = "SendPromotions")
    protected Boolean sendPromotions;
    @XmlElement(name = "SessionPassword")
    protected String sessionPassword;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "TimeZoneId")
    protected String timeZoneId;
    @XmlElement(name = "TimeZoneName")
    protected String timeZoneName;
    @XmlElement(name = "TimeZoneNameTranslation")
    protected String timeZoneNameTranslation;
    @XmlElement(name = "UserBuyer")
    protected Boolean userBuyer;
    @XmlElement(name = "UserStatus")
    protected String userStatus;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "VerifyPassword")
    protected String verifyPassword;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkPhoneExtension")
    protected String workPhoneExtension;
    @XmlElement(name = "XModId")
    protected Integer xModId;
    @XmlElement(name = "ListOfContactCommunicationAddress")
    protected ListOfContactCommunicationAddressData listOfContactCommunicationAddress;
    @XmlElement(name = "ListOfContactAlternatePhone")
    protected ListOfContactAlternatePhoneData listOfContactAlternatePhone;
    @XmlAttribute
    protected String operation;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCurrencyCode() {
        return accountCurrencyCode;
    }

    /**
     * Sets the value of the accountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCurrencyCode(String value) {
        this.accountCurrencyCode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountModId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountModId() {
        return accountModId;
    }

    /**
     * Sets the value of the accountModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountModId(Integer value) {
        this.accountModId = value;
    }

    /**
     * Gets the value of the accountPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPriceListId() {
        return accountPriceListId;
    }

    /**
     * Sets the value of the accountPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPriceListId(String value) {
        this.accountPriceListId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryBillToAddressId() {
        return accountPrimaryBillToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryBillToAddressId(String value) {
        this.accountPrimaryBillToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryBillToPersonId() {
        return accountPrimaryBillToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryBillToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryBillToPersonId(String value) {
        this.accountPrimaryBillToPersonId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryShipToAddressId() {
        return accountPrimaryShipToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryShipToAddressId(String value) {
        this.accountPrimaryShipToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryShipToPersonId() {
        return accountPrimaryShipToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryShipToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryShipToPersonId(String value) {
        this.accountPrimaryShipToPersonId = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveStatus(Boolean value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the calculatedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedAccountId() {
        return calculatedAccountId;
    }

    /**
     * Sets the value of the calculatedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedAccountId(String value) {
        this.calculatedAccountId = value;
    }

    /**
     * Gets the value of the call property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCall() {
        return call;
    }

    /**
     * Sets the value of the call property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCall(Boolean value) {
        this.call = value;
    }

    /**
     * Gets the value of the cellularPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellularPhone() {
        return cellularPhone;
    }

    /**
     * Sets the value of the cellularPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellularPhone(String value) {
        this.cellularPhone = value;
    }

    /**
     * Gets the value of the challengeAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeAnswer() {
        return challengeAnswer;
    }

    /**
     * Sets the value of the challengeAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeAnswer(String value) {
        this.challengeAnswer = value;
    }

    /**
     * Gets the value of the challengeQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeQuestion() {
        return challengeQuestion;
    }

    /**
     * Sets the value of the challengeQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeQuestion(String value) {
        this.challengeQuestion = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contactOrganizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOrganizationIntegrationId() {
        return contactOrganizationIntegrationId;
    }

    /**
     * Sets the value of the contactOrganizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOrganizationIntegrationId(String value) {
        this.contactOrganizationIntegrationId = value;
    }

    /**
     * Gets the value of the contacted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContacted() {
        return contacted;
    }

    /**
     * Sets the value of the contacted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContacted(Boolean value) {
        this.contacted = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByName(String value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableDataCleansing(Boolean value) {
        this.disableDataCleansing = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailSRUpdatesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailSRUpdatesFlag() {
        return emailSRUpdatesFlag;
    }

    /**
     * Sets the value of the emailSRUpdatesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailSRUpdatesFlag(Boolean value) {
        this.emailSRUpdatesFlag = value;
    }

    /**
     * Gets the value of the employeeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeeFlag() {
        return employeeFlag;
    }

    /**
     * Sets the value of the employeeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeeFlag(Boolean value) {
        this.employeeFlag = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLoginName() {
        return employeeLoginName;
    }

    /**
     * Sets the value of the employeeLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLoginName(String value) {
        this.employeeLoginName = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the faxAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxAddress() {
        return faxAddress;
    }

    /**
     * Sets the value of the faxAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxAddress(String value) {
        this.faxAddress = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhone(String value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the inviteToSeminars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviteToSeminars() {
        return inviteToSeminars;
    }

    /**
     * Sets the value of the inviteToSeminars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviteToSeminars(Boolean value) {
        this.inviteToSeminars = value;
    }

    /**
     * Gets the value of the keylastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKeylastupdated() {
        return keylastupdated;
    }

    /**
     * Sets the value of the keylastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKeylastupdated(XMLGregorianCalendar value) {
        this.keylastupdated = value;
    }

    /**
     * Gets the value of the lastClnseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClnseDate() {
        return lastClnseDate;
    }

    /**
     * Sets the value of the lastClnseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClnseDate(XMLGregorianCalendar value) {
        this.lastClnseDate = value;
    }

    /**
     * Gets the value of the lastKeyGenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastKeyGenDate() {
        return lastKeyGenDate;
    }

    /**
     * Sets the value of the lastKeyGenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastKeyGenDate(XMLGregorianCalendar value) {
        this.lastKeyGenDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameFirstName() {
        return lastNameFirstName;
    }

    /**
     * Sets the value of the lastNameFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameFirstName(String value) {
        this.lastNameFirstName = value;
    }

    /**
     * Gets the value of the lastNameFirstNameENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameFirstNameENU() {
        return lastNameFirstNameENU;
    }

    /**
     * Sets the value of the lastNameFirstNameENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameFirstNameENU(String value) {
        this.lastNameFirstNameENU = value;
    }

    /**
     * Gets the value of the lastNameFirstNameJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameFirstNameJPN() {
        return lastNameFirstNameJPN;
    }

    /**
     * Sets the value of the lastNameFirstNameJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameFirstNameJPN(String value) {
        this.lastNameFirstNameJPN = value;
    }

    /**
     * Gets the value of the lastUpdateSDQ property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateSDQ() {
        return lastUpdateSDQ;
    }

    /**
     * Sets the value of the lastUpdateSDQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateSDQ(XMLGregorianCalendar value) {
        this.lastUpdateSDQ = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the ownedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedBy() {
        return ownedBy;
    }

    /**
     * Sets the value of the ownedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedBy(String value) {
        this.ownedBy = value;
    }

    /**
     * Gets the value of the ownedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnedById() {
        return ownedById;
    }

    /**
     * Sets the value of the ownedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnedById(String value) {
        this.ownedById = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Sets the value of the partyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTypeCode(String value) {
        this.partyTypeCode = value;
    }

    /**
     * Gets the value of the partyUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUId() {
        return partyUId;
    }

    /**
     * Sets the value of the partyUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUId(String value) {
        this.partyUId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the personUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonUId() {
        return personUId;
    }

    /**
     * Sets the value of the personUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonUId(String value) {
        this.personUId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalContact(Boolean value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the preferredCommunications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCommunications() {
        return preferredCommunications;
    }

    /**
     * Sets the value of the preferredCommunications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCommunications(String value) {
        this.preferredCommunications = value;
    }

    /**
     * Gets the value of the preferredLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    /**
     * Sets the value of the preferredLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguageCode(String value) {
        this.preferredLanguageCode = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIntegrationId(String value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountName(String value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the primaryAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressCounty() {
        return primaryAddressCounty;
    }

    /**
     * Sets the value of the primaryAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressCounty(String value) {
        this.primaryAddressCounty = value;
    }

    /**
     * Gets the value of the primaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressId() {
        return primaryAddressId;
    }

    /**
     * Sets the value of the primaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressId(String value) {
        this.primaryAddressId = value;
    }

    /**
     * Gets the value of the primaryAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressIntegrationId() {
        return primaryAddressIntegrationId;
    }

    /**
     * Sets the value of the primaryAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressIntegrationId(String value) {
        this.primaryAddressIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAddressModId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryAddressModId() {
        return primaryAddressModId;
    }

    /**
     * Sets the value of the primaryAddressModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryAddressModId(Integer value) {
        this.primaryAddressModId = value;
    }

    /**
     * Gets the value of the primaryAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressName() {
        return primaryAddressName;
    }

    /**
     * Sets the value of the primaryAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressName(String value) {
        this.primaryAddressName = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressStreetAddress2() {
        return primaryAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressStreetAddress2(String value) {
        this.primaryAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressStreetAddress3() {
        return primaryAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressStreetAddress3(String value) {
        this.primaryAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryAlternateEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAlternateEmailId() {
        return primaryAlternateEmailId;
    }

    /**
     * Sets the value of the primaryAlternateEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAlternateEmailId(String value) {
        this.primaryAlternateEmailId = value;
    }

    /**
     * Gets the value of the primaryAlternatePhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAlternatePhoneId() {
        return primaryAlternatePhoneId;
    }

    /**
     * Sets the value of the primaryAlternatePhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAlternatePhoneId(String value) {
        this.primaryAlternatePhoneId = value;
    }

    /**
     * Gets the value of the primaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCity() {
        return primaryCity;
    }

    /**
     * Sets the value of the primaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCity(String value) {
        this.primaryCity = value;
    }

    /**
     * Gets the value of the primaryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCountry() {
        return primaryCountry;
    }

    /**
     * Sets the value of the primaryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCountry(String value) {
        this.primaryCountry = value;
    }

    /**
     * Gets the value of the primaryOrganization2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization2() {
        return primaryOrganization2;
    }

    /**
     * Sets the value of the primaryOrganization2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization2(String value) {
        this.primaryOrganization2 = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPersonalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPersonalAddressId() {
        return primaryPersonalAddressId;
    }

    /**
     * Sets the value of the primaryPersonalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPersonalAddressId(String value) {
        this.primaryPersonalAddressId = value;
    }

    /**
     * Gets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPersonalPaymentProfileId() {
        return primaryPersonalPaymentProfileId;
    }

    /**
     * Sets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPersonalPaymentProfileId(String value) {
        this.primaryPersonalPaymentProfileId = value;
    }

    /**
     * Gets the value of the primaryPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    /**
     * Sets the value of the primaryPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPostalCode(String value) {
        this.primaryPostalCode = value;
    }

    /**
     * Gets the value of the primaryResponsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryResponsibilityId() {
        return primaryResponsibilityId;
    }

    /**
     * Sets the value of the primaryResponsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryResponsibilityId(String value) {
        this.primaryResponsibilityId = value;
    }

    /**
     * Gets the value of the primaryServiceAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryServiceAgreementId() {
        return primaryServiceAgreementId;
    }

    /**
     * Sets the value of the primaryServiceAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryServiceAgreementId(String value) {
        this.primaryServiceAgreementId = value;
    }

    /**
     * Gets the value of the primaryState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryState() {
        return primaryState;
    }

    /**
     * Sets the value of the primaryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryState(String value) {
        this.primaryState = value;
    }

    /**
     * Gets the value of the primaryStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStreetAddress() {
        return primaryStreetAddress;
    }

    /**
     * Sets the value of the primaryStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStreetAddress(String value) {
        this.primaryStreetAddress = value;
    }

    /**
     * Gets the value of the projectAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectAccountId() {
        return projectAccountId;
    }

    /**
     * Sets the value of the projectAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectAccountId(String value) {
        this.projectAccountId = value;
    }

    /**
     * Gets the value of the responsibilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the value of the responsibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilities(String value) {
        this.responsibilities = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the ssInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSInstance() {
        return ssInstance;
    }

    /**
     * Sets the value of the ssInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSInstance(String value) {
        this.ssInstance = value;
    }

    /**
     * Gets the value of the ssInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSInstanceId() {
        return ssInstanceId;
    }

    /**
     * Sets the value of the ssInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSInstanceId(String value) {
        this.ssInstanceId = value;
    }

    /**
     * Gets the value of the ssKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSKeyId() {
        return ssKeyId;
    }

    /**
     * Sets the value of the ssKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSKeyId(String value) {
        this.ssKeyId = value;
    }

    /**
     * Gets the value of the sendPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPromotions() {
        return sendPromotions;
    }

    /**
     * Sets the value of the sendPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPromotions(Boolean value) {
        this.sendPromotions = value;
    }

    /**
     * Gets the value of the sessionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the value of the sessionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionPassword(String value) {
        this.sessionPassword = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

    /**
     * Gets the value of the timeZoneNameTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneNameTranslation() {
        return timeZoneNameTranslation;
    }

    /**
     * Sets the value of the timeZoneNameTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneNameTranslation(String value) {
        this.timeZoneNameTranslation = value;
    }

    /**
     * Gets the value of the userBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserBuyer() {
        return userBuyer;
    }

    /**
     * Sets the value of the userBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserBuyer(Boolean value) {
        this.userBuyer = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the verifyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyPassword() {
        return verifyPassword;
    }

    /**
     * Sets the value of the verifyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyPassword(String value) {
        this.verifyPassword = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneExtension(String value) {
        this.workPhoneExtension = value;
    }

    /**
     * Gets the value of the xModId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXModId() {
        return xModId;
    }

    /**
     * Sets the value of the xModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXModId(Integer value) {
        this.xModId = value;
    }

    /**
     * Gets the value of the listOfContactCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactCommunicationAddressData }
     *     
     */
    public ListOfContactCommunicationAddressData getListOfContactCommunicationAddress() {
        return listOfContactCommunicationAddress;
    }

    /**
     * Sets the value of the listOfContactCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactCommunicationAddressData }
     *     
     */
    public void setListOfContactCommunicationAddress(ListOfContactCommunicationAddressData value) {
        this.listOfContactCommunicationAddress = value;
    }

    /**
     * Gets the value of the listOfContactAlternatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAlternatePhoneData }
     *     
     */
    public ListOfContactAlternatePhoneData getListOfContactAlternatePhone() {
        return listOfContactAlternatePhone;
    }

    /**
     * Sets the value of the listOfContactAlternatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAlternatePhoneData }
     *     
     */
    public void setListOfContactAlternatePhone(ListOfContactAlternatePhoneData value) {
        this.listOfContactAlternatePhone = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
