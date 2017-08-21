
package com.siebel.selfservice.common.contact.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountCurrencyCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountModId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPriceListId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToAddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillToPersonId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToAddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryShipToPersonId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountSurveyType" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActiveStatus" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssistantPhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedAccountId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Call" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CellularPhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChallengeQuestion" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactOrganizationIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeduplicationMatchScore" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisableDataCleansing" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmailSRUpdatesFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FaxAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FaxPhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullNameForOutlookENU" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullNameForOutlookJPN" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullNameNoSpace" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncomeCurrencyCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IncomeExchangeDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Keylastupdated" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastClnseDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastKeyGenDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameENU" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameJPN" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastUpdate-SDQ" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrgStatus" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnedBy" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnedById" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartnershipContactFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreferredCommunications" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreferredLanguageCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCounty" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressModId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressStreetAddress3" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternateEmailId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAlternatePhoneId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentDenormFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentManualFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignmentSystemFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryCity" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryCountry" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryGroupHouseholdId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOpportunityId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalAddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPersonalPaymentProfileId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPostalCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryResponsibilityId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryState" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryStreetAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProjectAccountId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProjectRole" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProspectFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RegistrationSourceAppName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SRReadFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SendPromotions" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SessionPassword" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZoneId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZoneName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZoneNameTranslation" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserBuyer" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VerifyPassword" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WorkPhoneExtension" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="XModId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfContactAccount" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactAccountQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContactCommunicationAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactCommunicationAddressQuery" minOccurs="0"/>
 *         &lt;element name="ListOfAccount" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfAccountQuery" minOccurs="0"/>
 *         &lt;element name="ListOfPersonalAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfPersonalAddressQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContactAlternatePhone" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactAlternatePhoneQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContactBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactBusinessAddressQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContactOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactOrganizationQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContactPersonalAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfContactPersonalAddressQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactQuery", propOrder = {
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
    "accountSurveyType",
    "activeStatus",
    "alias",
    "approvalStatus",
    "assistantPhone",
    "calculatedAccountId",
    "call",
    "cellularPhone",
    "challengeAnswer",
    "challengeQuestion",
    "comment",
    "contactOrganizationIntegrationId",
    "createdByName",
    "currencyCode",
    "dunsNumber",
    "deduplicationMatchScore",
    "disableDataCleansing",
    "emailAddress",
    "emailSRUpdatesFlag",
    "employeeFlag",
    "endDate",
    "faxAddress",
    "faxPhone",
    "firstName",
    "fullName",
    "fullNameForOutlookENU",
    "fullNameForOutlookJPN",
    "fullNameNoSpace",
    "homePhone",
    "incomeCurrencyCode",
    "incomeExchangeDate",
    "integrationId",
    "jobTitle",
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
    "orgStatus",
    "ownedBy",
    "ownedById",
    "partnershipContactFlag",
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
    "primaryAssignmentDenormFlag",
    "primaryAssignmentManualFlag",
    "primaryAssignmentSystemFlag",
    "primaryCategoryId",
    "primaryCity",
    "primaryCountry",
    "primaryGroupHouseholdId",
    "primaryOpportunityId",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPersonalAddressId",
    "primaryPersonalPaymentProfileId",
    "primaryPositionId",
    "primaryPostalCode",
    "primaryResponsibilityId",
    "primaryState",
    "primaryStreetAddress",
    "projectAccountId",
    "projectRole",
    "prospectFlag",
    "registrationSourceAppName",
    "rowId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "srReadFlag",
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
    "listOfContactAccount",
    "listOfContactCommunicationAddress",
    "listOfAccount",
    "listOfPersonalAddress",
    "listOfContactAlternatePhone",
    "listOfContactBusinessAddress",
    "listOfContactOrganization",
    "listOfContactPersonalAddress"
})
public class ContactQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "CreatedBy")
    protected QueryType createdBy;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "UpdatedBy")
    protected QueryType updatedBy;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "AccountCurrencyCode")
    protected QueryType accountCurrencyCode;
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected QueryType accountIntegrationId;
    @XmlElement(name = "AccountModId")
    protected QueryType accountModId;
    @XmlElement(name = "AccountPriceListId")
    protected QueryType accountPriceListId;
    @XmlElement(name = "AccountPrimaryBillToAddressId")
    protected QueryType accountPrimaryBillToAddressId;
    @XmlElement(name = "AccountPrimaryBillToPersonId")
    protected QueryType accountPrimaryBillToPersonId;
    @XmlElement(name = "AccountPrimaryShipToAddressId")
    protected QueryType accountPrimaryShipToAddressId;
    @XmlElement(name = "AccountPrimaryShipToPersonId")
    protected QueryType accountPrimaryShipToPersonId;
    @XmlElement(name = "AccountSurveyType")
    protected QueryType accountSurveyType;
    @XmlElement(name = "ActiveStatus")
    protected QueryType activeStatus;
    @XmlElement(name = "Alias")
    protected QueryType alias;
    @XmlElement(name = "ApprovalStatus")
    protected QueryType approvalStatus;
    @XmlElement(name = "AssistantPhone")
    protected QueryType assistantPhone;
    @XmlElement(name = "CalculatedAccountId")
    protected QueryType calculatedAccountId;
    @XmlElement(name = "Call")
    protected QueryType call;
    @XmlElement(name = "CellularPhone")
    protected QueryType cellularPhone;
    @XmlElement(name = "ChallengeAnswer")
    protected QueryType challengeAnswer;
    @XmlElement(name = "ChallengeQuestion")
    protected QueryType challengeQuestion;
    @XmlElement(name = "Comment")
    protected QueryType comment;
    @XmlElement(name = "ContactOrganizationIntegrationId")
    protected QueryType contactOrganizationIntegrationId;
    @XmlElement(name = "CreatedByName")
    protected QueryType createdByName;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "DUNSNumber")
    protected QueryType dunsNumber;
    @XmlElement(name = "DeduplicationMatchScore")
    protected QueryType deduplicationMatchScore;
    @XmlElement(name = "DisableDataCleansing")
    protected QueryType disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected QueryType emailAddress;
    @XmlElement(name = "EmailSRUpdatesFlag")
    protected QueryType emailSRUpdatesFlag;
    @XmlElement(name = "EmployeeFlag")
    protected QueryType employeeFlag;
    @XmlElement(name = "EndDate")
    protected QueryType endDate;
    @XmlElement(name = "FaxAddress")
    protected QueryType faxAddress;
    @XmlElement(name = "FaxPhone")
    protected QueryType faxPhone;
    @XmlElement(name = "FirstName")
    protected QueryType firstName;
    @XmlElement(name = "FullName")
    protected QueryType fullName;
    @XmlElement(name = "FullNameForOutlookENU")
    protected QueryType fullNameForOutlookENU;
    @XmlElement(name = "FullNameForOutlookJPN")
    protected QueryType fullNameForOutlookJPN;
    @XmlElement(name = "FullNameNoSpace")
    protected QueryType fullNameNoSpace;
    @XmlElement(name = "HomePhone")
    protected QueryType homePhone;
    @XmlElement(name = "IncomeCurrencyCode")
    protected QueryType incomeCurrencyCode;
    @XmlElement(name = "IncomeExchangeDate")
    protected QueryType incomeExchangeDate;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "JobTitle")
    protected QueryType jobTitle;
    @XmlElement(name = "Keylastupdated")
    protected QueryType keylastupdated;
    @XmlElement(name = "LastClnseDate")
    protected QueryType lastClnseDate;
    @XmlElement(name = "LastKeyGenDate")
    protected QueryType lastKeyGenDate;
    @XmlElement(name = "LastName")
    protected QueryType lastName;
    @XmlElement(name = "LastNameFirstName")
    protected QueryType lastNameFirstName;
    @XmlElement(name = "LastNameFirstNameENU")
    protected QueryType lastNameFirstNameENU;
    @XmlElement(name = "LastNameFirstNameJPN")
    protected QueryType lastNameFirstNameJPN;
    @XmlElement(name = "LastUpdate-SDQ")
    protected QueryType lastUpdateSDQ;
    @XmlElement(name = "LoginName")
    protected QueryType loginName;
    @XmlElement(name = "MiddleName")
    protected QueryType middleName;
    @XmlElement(name = "Mode")
    protected QueryType mode;
    @XmlElement(name = "OrgStatus")
    protected QueryType orgStatus;
    @XmlElement(name = "OwnedBy")
    protected QueryType ownedBy;
    @XmlElement(name = "OwnedById")
    protected QueryType ownedById;
    @XmlElement(name = "PartnershipContactFlag")
    protected QueryType partnershipContactFlag;
    @XmlElement(name = "PartyName")
    protected QueryType partyName;
    @XmlElement(name = "PartyTypeCode")
    protected QueryType partyTypeCode;
    @XmlElement(name = "PartyUId")
    protected QueryType partyUId;
    @XmlElement(name = "Password")
    protected QueryType password;
    @XmlElement(name = "PersonUId")
    protected QueryType personUId;
    @XmlElement(name = "PersonalContact")
    protected QueryType personalContact;
    @XmlElement(name = "PreferredCommunications")
    protected QueryType preferredCommunications;
    @XmlElement(name = "PreferredLanguageCode")
    protected QueryType preferredLanguageCode;
    @XmlElement(name = "PriceList")
    protected QueryType priceList;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected QueryType priceListIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected QueryType primaryAccountName;
    @XmlElement(name = "PrimaryAddressCounty")
    protected QueryType primaryAddressCounty;
    @XmlElement(name = "PrimaryAddressId")
    protected QueryType primaryAddressId;
    @XmlElement(name = "PrimaryAddressIntegrationId")
    protected QueryType primaryAddressIntegrationId;
    @XmlElement(name = "PrimaryAddressModId")
    protected QueryType primaryAddressModId;
    @XmlElement(name = "PrimaryAddressName")
    protected QueryType primaryAddressName;
    @XmlElement(name = "PrimaryAddressStreetAddress2")
    protected QueryType primaryAddressStreetAddress2;
    @XmlElement(name = "PrimaryAddressStreetAddress3")
    protected QueryType primaryAddressStreetAddress3;
    @XmlElement(name = "PrimaryAlternateEmailId")
    protected QueryType primaryAlternateEmailId;
    @XmlElement(name = "PrimaryAlternatePhoneId")
    protected QueryType primaryAlternatePhoneId;
    @XmlElement(name = "PrimaryAssignmentDenormFlag")
    protected QueryType primaryAssignmentDenormFlag;
    @XmlElement(name = "PrimaryAssignmentManualFlag")
    protected QueryType primaryAssignmentManualFlag;
    @XmlElement(name = "PrimaryAssignmentSystemFlag")
    protected QueryType primaryAssignmentSystemFlag;
    @XmlElement(name = "PrimaryCategoryId")
    protected QueryType primaryCategoryId;
    @XmlElement(name = "PrimaryCity")
    protected QueryType primaryCity;
    @XmlElement(name = "PrimaryCountry")
    protected QueryType primaryCountry;
    @XmlElement(name = "PrimaryGroupHouseholdId")
    protected QueryType primaryGroupHouseholdId;
    @XmlElement(name = "PrimaryOpportunityId")
    protected QueryType primaryOpportunityId;
    @XmlElement(name = "PrimaryOrganization")
    protected QueryType primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected QueryType primaryOrganizationId;
    @XmlElement(name = "PrimaryPersonalAddressId")
    protected QueryType primaryPersonalAddressId;
    @XmlElement(name = "PrimaryPersonalPaymentProfileId")
    protected QueryType primaryPersonalPaymentProfileId;
    @XmlElement(name = "PrimaryPositionId")
    protected QueryType primaryPositionId;
    @XmlElement(name = "PrimaryPostalCode")
    protected QueryType primaryPostalCode;
    @XmlElement(name = "PrimaryResponsibilityId")
    protected QueryType primaryResponsibilityId;
    @XmlElement(name = "PrimaryState")
    protected QueryType primaryState;
    @XmlElement(name = "PrimaryStreetAddress")
    protected QueryType primaryStreetAddress;
    @XmlElement(name = "ProjectAccountId")
    protected QueryType projectAccountId;
    @XmlElement(name = "ProjectRole")
    protected QueryType projectRole;
    @XmlElement(name = "ProspectFlag")
    protected QueryType prospectFlag;
    @XmlElement(name = "RegistrationSourceAppName")
    protected QueryType registrationSourceAppName;
    @XmlElement(name = "RowId")
    protected QueryType rowId;
    @XmlElement(name = "S-SInstance")
    protected QueryType ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected QueryType ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected QueryType ssKeyId;
    @XmlElement(name = "SRReadFlag")
    protected QueryType srReadFlag;
    @XmlElement(name = "SendPromotions")
    protected QueryType sendPromotions;
    @XmlElement(name = "SessionPassword")
    protected QueryType sessionPassword;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "TimeZone")
    protected QueryType timeZone;
    @XmlElement(name = "TimeZoneId")
    protected QueryType timeZoneId;
    @XmlElement(name = "TimeZoneName")
    protected QueryType timeZoneName;
    @XmlElement(name = "TimeZoneNameTranslation")
    protected QueryType timeZoneNameTranslation;
    @XmlElement(name = "UserBuyer")
    protected QueryType userBuyer;
    @XmlElement(name = "UserStatus")
    protected QueryType userStatus;
    @XmlElement(name = "UserType")
    protected QueryType userType;
    @XmlElement(name = "VerifyPassword")
    protected QueryType verifyPassword;
    @XmlElement(name = "WorkPhone")
    protected QueryType workPhone;
    @XmlElement(name = "WorkPhoneExtension")
    protected QueryType workPhoneExtension;
    @XmlElement(name = "XModId")
    protected QueryType xModId;
    @XmlElement(name = "ListOfContactAccount")
    protected ListOfContactAccountQuery listOfContactAccount;
    @XmlElement(name = "ListOfContactCommunicationAddress")
    protected ListOfContactCommunicationAddressQuery listOfContactCommunicationAddress;
    @XmlElement(name = "ListOfAccount")
    protected ListOfAccountQuery listOfAccount;
    @XmlElement(name = "ListOfPersonalAddress")
    protected ListOfPersonalAddressQuery listOfPersonalAddress;
    @XmlElement(name = "ListOfContactAlternatePhone")
    protected ListOfContactAlternatePhoneQuery listOfContactAlternatePhone;
    @XmlElement(name = "ListOfContactBusinessAddress")
    protected ListOfContactBusinessAddressQuery listOfContactBusinessAddress;
    @XmlElement(name = "ListOfContactOrganization")
    protected ListOfContactOrganizationQuery listOfContactOrganization;
    @XmlElement(name = "ListOfContactPersonalAddress")
    protected ListOfContactPersonalAddressQuery listOfContactPersonalAddress;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedBy(QueryType value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdatedBy(QueryType value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConflictId(QueryType value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setModId(QueryType value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountCurrencyCode() {
        return accountCurrencyCode;
    }

    /**
     * Sets the value of the accountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountCurrencyCode(QueryType value) {
        this.accountCurrencyCode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountId(QueryType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountIntegrationId(QueryType value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountModId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountModId() {
        return accountModId;
    }

    /**
     * Sets the value of the accountModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountModId(QueryType value) {
        this.accountModId = value;
    }

    /**
     * Gets the value of the accountPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPriceListId() {
        return accountPriceListId;
    }

    /**
     * Sets the value of the accountPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPriceListId(QueryType value) {
        this.accountPriceListId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryBillToAddressId() {
        return accountPrimaryBillToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryBillToAddressId(QueryType value) {
        this.accountPrimaryBillToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryBillToPersonId() {
        return accountPrimaryBillToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryBillToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryBillToPersonId(QueryType value) {
        this.accountPrimaryBillToPersonId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryShipToAddressId() {
        return accountPrimaryShipToAddressId;
    }

    /**
     * Sets the value of the accountPrimaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryShipToAddressId(QueryType value) {
        this.accountPrimaryShipToAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryShipToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryShipToPersonId() {
        return accountPrimaryShipToPersonId;
    }

    /**
     * Sets the value of the accountPrimaryShipToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryShipToPersonId(QueryType value) {
        this.accountPrimaryShipToPersonId = value;
    }

    /**
     * Gets the value of the accountSurveyType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountSurveyType() {
        return accountSurveyType;
    }

    /**
     * Sets the value of the accountSurveyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountSurveyType(QueryType value) {
        this.accountSurveyType = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActiveStatus(QueryType value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAlias(QueryType value) {
        this.alias = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovalStatus(QueryType value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the assistantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets the value of the assistantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssistantPhone(QueryType value) {
        this.assistantPhone = value;
    }

    /**
     * Gets the value of the calculatedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAccountId() {
        return calculatedAccountId;
    }

    /**
     * Sets the value of the calculatedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAccountId(QueryType value) {
        this.calculatedAccountId = value;
    }

    /**
     * Gets the value of the call property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCall() {
        return call;
    }

    /**
     * Sets the value of the call property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCall(QueryType value) {
        this.call = value;
    }

    /**
     * Gets the value of the cellularPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCellularPhone() {
        return cellularPhone;
    }

    /**
     * Sets the value of the cellularPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCellularPhone(QueryType value) {
        this.cellularPhone = value;
    }

    /**
     * Gets the value of the challengeAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChallengeAnswer() {
        return challengeAnswer;
    }

    /**
     * Sets the value of the challengeAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChallengeAnswer(QueryType value) {
        this.challengeAnswer = value;
    }

    /**
     * Gets the value of the challengeQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChallengeQuestion() {
        return challengeQuestion;
    }

    /**
     * Sets the value of the challengeQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChallengeQuestion(QueryType value) {
        this.challengeQuestion = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setComment(QueryType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contactOrganizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactOrganizationIntegrationId() {
        return contactOrganizationIntegrationId;
    }

    /**
     * Sets the value of the contactOrganizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactOrganizationIntegrationId(QueryType value) {
        this.contactOrganizationIntegrationId = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedByName(QueryType value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrencyCode(QueryType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDUNSNumber(QueryType value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the deduplicationMatchScore property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeduplicationMatchScore() {
        return deduplicationMatchScore;
    }

    /**
     * Sets the value of the deduplicationMatchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeduplicationMatchScore(QueryType value) {
        this.deduplicationMatchScore = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisableDataCleansing(QueryType value) {
        this.disableDataCleansing = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmailAddress(QueryType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailSRUpdatesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmailSRUpdatesFlag() {
        return emailSRUpdatesFlag;
    }

    /**
     * Sets the value of the emailSRUpdatesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmailSRUpdatesFlag(QueryType value) {
        this.emailSRUpdatesFlag = value;
    }

    /**
     * Gets the value of the employeeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmployeeFlag() {
        return employeeFlag;
    }

    /**
     * Sets the value of the employeeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmployeeFlag(QueryType value) {
        this.employeeFlag = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEndDate(QueryType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the faxAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFaxAddress() {
        return faxAddress;
    }

    /**
     * Sets the value of the faxAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFaxAddress(QueryType value) {
        this.faxAddress = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFaxPhone(QueryType value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFirstName(QueryType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullName(QueryType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the fullNameForOutlookENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullNameForOutlookENU() {
        return fullNameForOutlookENU;
    }

    /**
     * Sets the value of the fullNameForOutlookENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullNameForOutlookENU(QueryType value) {
        this.fullNameForOutlookENU = value;
    }

    /**
     * Gets the value of the fullNameForOutlookJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullNameForOutlookJPN() {
        return fullNameForOutlookJPN;
    }

    /**
     * Sets the value of the fullNameForOutlookJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullNameForOutlookJPN(QueryType value) {
        this.fullNameForOutlookJPN = value;
    }

    /**
     * Gets the value of the fullNameNoSpace property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullNameNoSpace() {
        return fullNameNoSpace;
    }

    /**
     * Sets the value of the fullNameNoSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullNameNoSpace(QueryType value) {
        this.fullNameNoSpace = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHomePhone(QueryType value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the incomeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncomeCurrencyCode() {
        return incomeCurrencyCode;
    }

    /**
     * Sets the value of the incomeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncomeCurrencyCode(QueryType value) {
        this.incomeCurrencyCode = value;
    }

    /**
     * Gets the value of the incomeExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncomeExchangeDate() {
        return incomeExchangeDate;
    }

    /**
     * Sets the value of the incomeExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncomeExchangeDate(QueryType value) {
        this.incomeExchangeDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setJobTitle(QueryType value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the keylastupdated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getKeylastupdated() {
        return keylastupdated;
    }

    /**
     * Sets the value of the keylastupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setKeylastupdated(QueryType value) {
        this.keylastupdated = value;
    }

    /**
     * Gets the value of the lastClnseDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastClnseDate() {
        return lastClnseDate;
    }

    /**
     * Sets the value of the lastClnseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastClnseDate(QueryType value) {
        this.lastClnseDate = value;
    }

    /**
     * Gets the value of the lastKeyGenDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastKeyGenDate() {
        return lastKeyGenDate;
    }

    /**
     * Sets the value of the lastKeyGenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastKeyGenDate(QueryType value) {
        this.lastKeyGenDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastName(QueryType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastNameFirstName() {
        return lastNameFirstName;
    }

    /**
     * Sets the value of the lastNameFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastNameFirstName(QueryType value) {
        this.lastNameFirstName = value;
    }

    /**
     * Gets the value of the lastNameFirstNameENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastNameFirstNameENU() {
        return lastNameFirstNameENU;
    }

    /**
     * Sets the value of the lastNameFirstNameENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastNameFirstNameENU(QueryType value) {
        this.lastNameFirstNameENU = value;
    }

    /**
     * Gets the value of the lastNameFirstNameJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastNameFirstNameJPN() {
        return lastNameFirstNameJPN;
    }

    /**
     * Sets the value of the lastNameFirstNameJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastNameFirstNameJPN(QueryType value) {
        this.lastNameFirstNameJPN = value;
    }

    /**
     * Gets the value of the lastUpdateSDQ property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastUpdateSDQ() {
        return lastUpdateSDQ;
    }

    /**
     * Sets the value of the lastUpdateSDQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastUpdateSDQ(QueryType value) {
        this.lastUpdateSDQ = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLoginName(QueryType value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMiddleName(QueryType value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMode(QueryType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the orgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrgStatus() {
        return orgStatus;
    }

    /**
     * Sets the value of the orgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrgStatus(QueryType value) {
        this.orgStatus = value;
    }

    /**
     * Gets the value of the ownedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnedBy() {
        return ownedBy;
    }

    /**
     * Sets the value of the ownedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnedBy(QueryType value) {
        this.ownedBy = value;
    }

    /**
     * Gets the value of the ownedById property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnedById() {
        return ownedById;
    }

    /**
     * Sets the value of the ownedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnedById(QueryType value) {
        this.ownedById = value;
    }

    /**
     * Gets the value of the partnershipContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartnershipContactFlag() {
        return partnershipContactFlag;
    }

    /**
     * Sets the value of the partnershipContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartnershipContactFlag(QueryType value) {
        this.partnershipContactFlag = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartyName(QueryType value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Sets the value of the partyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartyTypeCode(QueryType value) {
        this.partyTypeCode = value;
    }

    /**
     * Gets the value of the partyUId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartyUId() {
        return partyUId;
    }

    /**
     * Sets the value of the partyUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartyUId(QueryType value) {
        this.partyUId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPassword(QueryType value) {
        this.password = value;
    }

    /**
     * Gets the value of the personUId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonUId() {
        return personUId;
    }

    /**
     * Sets the value of the personUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonUId(QueryType value) {
        this.personUId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalContact(QueryType value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the preferredCommunications property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreferredCommunications() {
        return preferredCommunications;
    }

    /**
     * Sets the value of the preferredCommunications property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreferredCommunications(QueryType value) {
        this.preferredCommunications = value;
    }

    /**
     * Gets the value of the preferredLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    /**
     * Sets the value of the preferredLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreferredLanguageCode(QueryType value) {
        this.preferredLanguageCode = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceList(QueryType value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListId(QueryType value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListIntegrationId(QueryType value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountName(QueryType value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the primaryAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressCounty() {
        return primaryAddressCounty;
    }

    /**
     * Sets the value of the primaryAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressCounty(QueryType value) {
        this.primaryAddressCounty = value;
    }

    /**
     * Gets the value of the primaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressId() {
        return primaryAddressId;
    }

    /**
     * Sets the value of the primaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressId(QueryType value) {
        this.primaryAddressId = value;
    }

    /**
     * Gets the value of the primaryAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressIntegrationId() {
        return primaryAddressIntegrationId;
    }

    /**
     * Sets the value of the primaryAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressIntegrationId(QueryType value) {
        this.primaryAddressIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAddressModId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressModId() {
        return primaryAddressModId;
    }

    /**
     * Sets the value of the primaryAddressModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressModId(QueryType value) {
        this.primaryAddressModId = value;
    }

    /**
     * Gets the value of the primaryAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressName() {
        return primaryAddressName;
    }

    /**
     * Sets the value of the primaryAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressName(QueryType value) {
        this.primaryAddressName = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressStreetAddress2() {
        return primaryAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressStreetAddress2(QueryType value) {
        this.primaryAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAddressStreetAddress3() {
        return primaryAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAddressStreetAddress3(QueryType value) {
        this.primaryAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryAlternateEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAlternateEmailId() {
        return primaryAlternateEmailId;
    }

    /**
     * Sets the value of the primaryAlternateEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAlternateEmailId(QueryType value) {
        this.primaryAlternateEmailId = value;
    }

    /**
     * Gets the value of the primaryAlternatePhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAlternatePhoneId() {
        return primaryAlternatePhoneId;
    }

    /**
     * Sets the value of the primaryAlternatePhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAlternatePhoneId(QueryType value) {
        this.primaryAlternatePhoneId = value;
    }

    /**
     * Gets the value of the primaryAssignmentDenormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAssignmentDenormFlag() {
        return primaryAssignmentDenormFlag;
    }

    /**
     * Sets the value of the primaryAssignmentDenormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAssignmentDenormFlag(QueryType value) {
        this.primaryAssignmentDenormFlag = value;
    }

    /**
     * Gets the value of the primaryAssignmentManualFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAssignmentManualFlag() {
        return primaryAssignmentManualFlag;
    }

    /**
     * Sets the value of the primaryAssignmentManualFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAssignmentManualFlag(QueryType value) {
        this.primaryAssignmentManualFlag = value;
    }

    /**
     * Gets the value of the primaryAssignmentSystemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAssignmentSystemFlag() {
        return primaryAssignmentSystemFlag;
    }

    /**
     * Sets the value of the primaryAssignmentSystemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAssignmentSystemFlag(QueryType value) {
        this.primaryAssignmentSystemFlag = value;
    }

    /**
     * Gets the value of the primaryCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    /**
     * Sets the value of the primaryCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryCategoryId(QueryType value) {
        this.primaryCategoryId = value;
    }

    /**
     * Gets the value of the primaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryCity() {
        return primaryCity;
    }

    /**
     * Sets the value of the primaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryCity(QueryType value) {
        this.primaryCity = value;
    }

    /**
     * Gets the value of the primaryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryCountry() {
        return primaryCountry;
    }

    /**
     * Sets the value of the primaryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryCountry(QueryType value) {
        this.primaryCountry = value;
    }

    /**
     * Gets the value of the primaryGroupHouseholdId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryGroupHouseholdId() {
        return primaryGroupHouseholdId;
    }

    /**
     * Sets the value of the primaryGroupHouseholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryGroupHouseholdId(QueryType value) {
        this.primaryGroupHouseholdId = value;
    }

    /**
     * Gets the value of the primaryOpportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOpportunityId() {
        return primaryOpportunityId;
    }

    /**
     * Sets the value of the primaryOpportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOpportunityId(QueryType value) {
        this.primaryOpportunityId = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganization(QueryType value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganizationId(QueryType value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPersonalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPersonalAddressId() {
        return primaryPersonalAddressId;
    }

    /**
     * Sets the value of the primaryPersonalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPersonalAddressId(QueryType value) {
        this.primaryPersonalAddressId = value;
    }

    /**
     * Gets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPersonalPaymentProfileId() {
        return primaryPersonalPaymentProfileId;
    }

    /**
     * Sets the value of the primaryPersonalPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPersonalPaymentProfileId(QueryType value) {
        this.primaryPersonalPaymentProfileId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPositionId(QueryType value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    /**
     * Sets the value of the primaryPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPostalCode(QueryType value) {
        this.primaryPostalCode = value;
    }

    /**
     * Gets the value of the primaryResponsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryResponsibilityId() {
        return primaryResponsibilityId;
    }

    /**
     * Sets the value of the primaryResponsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryResponsibilityId(QueryType value) {
        this.primaryResponsibilityId = value;
    }

    /**
     * Gets the value of the primaryState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryState() {
        return primaryState;
    }

    /**
     * Sets the value of the primaryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryState(QueryType value) {
        this.primaryState = value;
    }

    /**
     * Gets the value of the primaryStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryStreetAddress() {
        return primaryStreetAddress;
    }

    /**
     * Sets the value of the primaryStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryStreetAddress(QueryType value) {
        this.primaryStreetAddress = value;
    }

    /**
     * Gets the value of the projectAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProjectAccountId() {
        return projectAccountId;
    }

    /**
     * Sets the value of the projectAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProjectAccountId(QueryType value) {
        this.projectAccountId = value;
    }

    /**
     * Gets the value of the projectRole property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProjectRole() {
        return projectRole;
    }

    /**
     * Sets the value of the projectRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProjectRole(QueryType value) {
        this.projectRole = value;
    }

    /**
     * Gets the value of the prospectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProspectFlag() {
        return prospectFlag;
    }

    /**
     * Sets the value of the prospectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProspectFlag(QueryType value) {
        this.prospectFlag = value;
    }

    /**
     * Gets the value of the registrationSourceAppName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRegistrationSourceAppName() {
        return registrationSourceAppName;
    }

    /**
     * Sets the value of the registrationSourceAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRegistrationSourceAppName(QueryType value) {
        this.registrationSourceAppName = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRowId(QueryType value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the ssInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSInstance() {
        return ssInstance;
    }

    /**
     * Sets the value of the ssInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSInstance(QueryType value) {
        this.ssInstance = value;
    }

    /**
     * Gets the value of the ssInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSInstanceId() {
        return ssInstanceId;
    }

    /**
     * Sets the value of the ssInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSInstanceId(QueryType value) {
        this.ssInstanceId = value;
    }

    /**
     * Gets the value of the ssKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSKeyId() {
        return ssKeyId;
    }

    /**
     * Sets the value of the ssKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSKeyId(QueryType value) {
        this.ssKeyId = value;
    }

    /**
     * Gets the value of the srReadFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSRReadFlag() {
        return srReadFlag;
    }

    /**
     * Sets the value of the srReadFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSRReadFlag(QueryType value) {
        this.srReadFlag = value;
    }

    /**
     * Gets the value of the sendPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSendPromotions() {
        return sendPromotions;
    }

    /**
     * Sets the value of the sendPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSendPromotions(QueryType value) {
        this.sendPromotions = value;
    }

    /**
     * Gets the value of the sessionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the value of the sessionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSessionPassword(QueryType value) {
        this.sessionPassword = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStartDate(QueryType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatus(QueryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeZone(QueryType value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeZoneId(QueryType value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeZoneName(QueryType value) {
        this.timeZoneName = value;
    }

    /**
     * Gets the value of the timeZoneNameTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeZoneNameTranslation() {
        return timeZoneNameTranslation;
    }

    /**
     * Sets the value of the timeZoneNameTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeZoneNameTranslation(QueryType value) {
        this.timeZoneNameTranslation = value;
    }

    /**
     * Gets the value of the userBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserBuyer() {
        return userBuyer;
    }

    /**
     * Sets the value of the userBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserBuyer(QueryType value) {
        this.userBuyer = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserStatus(QueryType value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserType(QueryType value) {
        this.userType = value;
    }

    /**
     * Gets the value of the verifyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVerifyPassword() {
        return verifyPassword;
    }

    /**
     * Sets the value of the verifyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVerifyPassword(QueryType value) {
        this.verifyPassword = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWorkPhone(QueryType value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWorkPhoneExtension(QueryType value) {
        this.workPhoneExtension = value;
    }

    /**
     * Gets the value of the xModId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getXModId() {
        return xModId;
    }

    /**
     * Sets the value of the xModId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setXModId(QueryType value) {
        this.xModId = value;
    }

    /**
     * Gets the value of the listOfContactAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAccountQuery }
     *     
     */
    public ListOfContactAccountQuery getListOfContactAccount() {
        return listOfContactAccount;
    }

    /**
     * Sets the value of the listOfContactAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAccountQuery }
     *     
     */
    public void setListOfContactAccount(ListOfContactAccountQuery value) {
        this.listOfContactAccount = value;
    }

    /**
     * Gets the value of the listOfContactCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactCommunicationAddressQuery }
     *     
     */
    public ListOfContactCommunicationAddressQuery getListOfContactCommunicationAddress() {
        return listOfContactCommunicationAddress;
    }

    /**
     * Sets the value of the listOfContactCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactCommunicationAddressQuery }
     *     
     */
    public void setListOfContactCommunicationAddress(ListOfContactCommunicationAddressQuery value) {
        this.listOfContactCommunicationAddress = value;
    }

    /**
     * Gets the value of the listOfAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountQuery }
     *     
     */
    public ListOfAccountQuery getListOfAccount() {
        return listOfAccount;
    }

    /**
     * Sets the value of the listOfAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountQuery }
     *     
     */
    public void setListOfAccount(ListOfAccountQuery value) {
        this.listOfAccount = value;
    }

    /**
     * Gets the value of the listOfPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPersonalAddressQuery }
     *     
     */
    public ListOfPersonalAddressQuery getListOfPersonalAddress() {
        return listOfPersonalAddress;
    }

    /**
     * Sets the value of the listOfPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPersonalAddressQuery }
     *     
     */
    public void setListOfPersonalAddress(ListOfPersonalAddressQuery value) {
        this.listOfPersonalAddress = value;
    }

    /**
     * Gets the value of the listOfContactAlternatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAlternatePhoneQuery }
     *     
     */
    public ListOfContactAlternatePhoneQuery getListOfContactAlternatePhone() {
        return listOfContactAlternatePhone;
    }

    /**
     * Sets the value of the listOfContactAlternatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAlternatePhoneQuery }
     *     
     */
    public void setListOfContactAlternatePhone(ListOfContactAlternatePhoneQuery value) {
        this.listOfContactAlternatePhone = value;
    }

    /**
     * Gets the value of the listOfContactBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactBusinessAddressQuery }
     *     
     */
    public ListOfContactBusinessAddressQuery getListOfContactBusinessAddress() {
        return listOfContactBusinessAddress;
    }

    /**
     * Sets the value of the listOfContactBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactBusinessAddressQuery }
     *     
     */
    public void setListOfContactBusinessAddress(ListOfContactBusinessAddressQuery value) {
        this.listOfContactBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfContactOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactOrganizationQuery }
     *     
     */
    public ListOfContactOrganizationQuery getListOfContactOrganization() {
        return listOfContactOrganization;
    }

    /**
     * Sets the value of the listOfContactOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactOrganizationQuery }
     *     
     */
    public void setListOfContactOrganization(ListOfContactOrganizationQuery value) {
        this.listOfContactOrganization = value;
    }

    /**
     * Gets the value of the listOfContactPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactPersonalAddressQuery }
     *     
     */
    public ListOfContactPersonalAddressQuery getListOfContactPersonalAddress() {
        return listOfContactPersonalAddress;
    }

    /**
     * Sets the value of the listOfContactPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactPersonalAddressQuery }
     *     
     */
    public void setListOfContactPersonalAddress(ListOfContactPersonalAddressQuery value) {
        this.listOfContactPersonalAddress = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
