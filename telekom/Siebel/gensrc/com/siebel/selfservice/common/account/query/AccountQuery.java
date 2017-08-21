
package com.siebel.selfservice.common.account.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountOrganizationIntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CityState" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DateFormed" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EAISyncErrorText" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EAISyncStatusCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullAddress-ENU" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullAddress-JPN" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InternalOrgFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Keylastupdated" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastClnseDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastKeyGenDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastUpdate-SDQ" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MainFaxNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MainPhoneNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Marketing" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NameandLocation" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAccountId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAccountIntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAccountLocation" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAccountName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartnerFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Partners" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Philosophy" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreferredShippingMethod" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListEndDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListStartDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressCounty" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressStreetAddress3" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountCity" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountCountry" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountPostalCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountState" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountStreetAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAccountId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressCounty" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressStreetAddress3" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToJobTitle" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPersonId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToStreetAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentProfileId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressCounty" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressStreetAddress3" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToJobTitle" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPersonId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToStreetAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TypeLIC" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountTypeCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfAccountBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}ListOfAccountBusinessAddressQuery" minOccurs="0"/>
 *         &lt;element name="ListOfBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}ListOfBusinessAddressQuery" minOccurs="0"/>
 *         &lt;element name="ListOfContact" type="{http://www.siebel.com/SelfService/Common/Account/Query}ListOfContactQuery" minOccurs="0"/>
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
@XmlType(name = "AccountQuery", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountOrganizationIntegrationId",
    "accountStatus",
    "alias",
    "approvalStatus",
    "cityState",
    "currencyCode",
    "dunsNumber",
    "dateFormed",
    "description",
    "division",
    "eaiSyncDate",
    "eaiSyncErrorText",
    "eaiSyncStatusCode",
    "fullAddress",
    "fullAddressENU",
    "fullAddressJPN",
    "integrationId",
    "internalOrgFlag",
    "keylastupdated",
    "languageCode",
    "lastClnseDate",
    "lastKeyGenDate",
    "lastUpdateSDQ",
    "location",
    "mainFaxNumber",
    "mainPhoneNumber",
    "marketing",
    "name",
    "nameandLocation",
    "parentAccountId",
    "parentAccountIntegrationId",
    "parentAccountLocation",
    "parentAccountName",
    "partnerFlag",
    "partners",
    "partyName",
    "partyTypeCode",
    "partyUId",
    "philosophy",
    "preferredShippingMethod",
    "priceList",
    "priceListEndDate",
    "priceListId",
    "priceListIntegrationId",
    "priceListStartDate",
    "primaryAccountAddressCounty",
    "primaryAccountAddressName",
    "primaryAccountAddressStreetAddress2",
    "primaryAccountAddressStreetAddress3",
    "primaryAccountCity",
    "primaryAccountCountry",
    "primaryAccountPostalCode",
    "primaryAccountState",
    "primaryAccountStreetAddress",
    "primaryAddressId",
    "primaryBillToAccountId",
    "primaryBillToAddressCounty",
    "primaryBillToAddressId",
    "primaryBillToAddressName",
    "primaryBillToAddressStreetAddress2",
    "primaryBillToAddressStreetAddress3",
    "primaryBillToCity",
    "primaryBillToCountry",
    "primaryBillToFirstName",
    "primaryBillToJobTitle",
    "primaryBillToLastName",
    "primaryBillToPersonId",
    "primaryBillToPostalCode",
    "primaryBillToState",
    "primaryBillToStreetAddress",
    "primaryContactId",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPaymentProfileId",
    "primaryShipToAddressCounty",
    "primaryShipToAddressId",
    "primaryShipToAddressName",
    "primaryShipToAddressStreetAddress2",
    "primaryShipToAddressStreetAddress3",
    "primaryShipToCity",
    "primaryShipToCountry",
    "primaryShipToFirstName",
    "primaryShipToJobTitle",
    "primaryShipToLastName",
    "primaryShipToPersonId",
    "primaryShipToPostalCode",
    "primaryShipToState",
    "primaryShipToStreetAddress",
    "relationshipType",
    "rowId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "startDate",
    "type",
    "typeLIC",
    "accountTypeCode",
    "listOfAccountBusinessAddress",
    "listOfBusinessAddress",
    "listOfContact"
})
public class AccountQuery
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
    @XmlElement(name = "AccountOrganizationIntegrationId")
    protected QueryType accountOrganizationIntegrationId;
    @XmlElement(name = "AccountStatus")
    protected QueryType accountStatus;
    @XmlElement(name = "Alias")
    protected QueryType alias;
    @XmlElement(name = "ApprovalStatus")
    protected QueryType approvalStatus;
    @XmlElement(name = "CityState")
    protected QueryType cityState;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "DUNSNumber")
    protected QueryType dunsNumber;
    @XmlElement(name = "DateFormed")
    protected QueryType dateFormed;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "Division")
    protected QueryType division;
    @XmlElement(name = "EAISyncDate")
    protected QueryType eaiSyncDate;
    @XmlElement(name = "EAISyncErrorText")
    protected QueryType eaiSyncErrorText;
    @XmlElement(name = "EAISyncStatusCode")
    protected QueryType eaiSyncStatusCode;
    @XmlElement(name = "FullAddress")
    protected QueryType fullAddress;
    @XmlElement(name = "FullAddress-ENU")
    protected QueryType fullAddressENU;
    @XmlElement(name = "FullAddress-JPN")
    protected QueryType fullAddressJPN;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "InternalOrgFlag")
    protected QueryType internalOrgFlag;
    @XmlElement(name = "Keylastupdated")
    protected QueryType keylastupdated;
    @XmlElement(name = "LanguageCode")
    protected QueryType languageCode;
    @XmlElement(name = "LastClnseDate")
    protected QueryType lastClnseDate;
    @XmlElement(name = "LastKeyGenDate")
    protected QueryType lastKeyGenDate;
    @XmlElement(name = "LastUpdate-SDQ")
    protected QueryType lastUpdateSDQ;
    @XmlElement(name = "Location")
    protected QueryType location;
    @XmlElement(name = "MainFaxNumber")
    protected QueryType mainFaxNumber;
    @XmlElement(name = "MainPhoneNumber")
    protected QueryType mainPhoneNumber;
    @XmlElement(name = "Marketing")
    protected QueryType marketing;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "NameandLocation")
    protected QueryType nameandLocation;
    @XmlElement(name = "ParentAccountId")
    protected QueryType parentAccountId;
    @XmlElement(name = "ParentAccountIntegrationId")
    protected QueryType parentAccountIntegrationId;
    @XmlElement(name = "ParentAccountLocation")
    protected QueryType parentAccountLocation;
    @XmlElement(name = "ParentAccountName")
    protected QueryType parentAccountName;
    @XmlElement(name = "PartnerFlag")
    protected QueryType partnerFlag;
    @XmlElement(name = "Partners")
    protected QueryType partners;
    @XmlElement(name = "PartyName")
    protected QueryType partyName;
    @XmlElement(name = "PartyTypeCode")
    protected QueryType partyTypeCode;
    @XmlElement(name = "PartyUId")
    protected QueryType partyUId;
    @XmlElement(name = "Philosophy")
    protected QueryType philosophy;
    @XmlElement(name = "PreferredShippingMethod")
    protected QueryType preferredShippingMethod;
    @XmlElement(name = "PriceList")
    protected QueryType priceList;
    @XmlElement(name = "PriceListEndDate")
    protected QueryType priceListEndDate;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected QueryType priceListIntegrationId;
    @XmlElement(name = "PriceListStartDate")
    protected QueryType priceListStartDate;
    @XmlElement(name = "PrimaryAccountAddressCounty")
    protected QueryType primaryAccountAddressCounty;
    @XmlElement(name = "PrimaryAccountAddressName")
    protected QueryType primaryAccountAddressName;
    @XmlElement(name = "PrimaryAccountAddressStreetAddress2")
    protected QueryType primaryAccountAddressStreetAddress2;
    @XmlElement(name = "PrimaryAccountAddressStreetAddress3")
    protected QueryType primaryAccountAddressStreetAddress3;
    @XmlElement(name = "PrimaryAccountCity")
    protected QueryType primaryAccountCity;
    @XmlElement(name = "PrimaryAccountCountry")
    protected QueryType primaryAccountCountry;
    @XmlElement(name = "PrimaryAccountPostalCode")
    protected QueryType primaryAccountPostalCode;
    @XmlElement(name = "PrimaryAccountState")
    protected QueryType primaryAccountState;
    @XmlElement(name = "PrimaryAccountStreetAddress")
    protected QueryType primaryAccountStreetAddress;
    @XmlElement(name = "PrimaryAddressId")
    protected QueryType primaryAddressId;
    @XmlElement(name = "PrimaryBillToAccountId")
    protected QueryType primaryBillToAccountId;
    @XmlElement(name = "PrimaryBillToAddressCounty")
    protected QueryType primaryBillToAddressCounty;
    @XmlElement(name = "PrimaryBillToAddressId")
    protected QueryType primaryBillToAddressId;
    @XmlElement(name = "PrimaryBillToAddressName")
    protected QueryType primaryBillToAddressName;
    @XmlElement(name = "PrimaryBillToAddressStreetAddress2")
    protected QueryType primaryBillToAddressStreetAddress2;
    @XmlElement(name = "PrimaryBillToAddressStreetAddress3")
    protected QueryType primaryBillToAddressStreetAddress3;
    @XmlElement(name = "PrimaryBillToCity")
    protected QueryType primaryBillToCity;
    @XmlElement(name = "PrimaryBillToCountry")
    protected QueryType primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected QueryType primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToJobTitle")
    protected QueryType primaryBillToJobTitle;
    @XmlElement(name = "PrimaryBillToLastName")
    protected QueryType primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPersonId")
    protected QueryType primaryBillToPersonId;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected QueryType primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected QueryType primaryBillToState;
    @XmlElement(name = "PrimaryBillToStreetAddress")
    protected QueryType primaryBillToStreetAddress;
    @XmlElement(name = "PrimaryContactId")
    protected QueryType primaryContactId;
    @XmlElement(name = "PrimaryOrganization")
    protected QueryType primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected QueryType primaryOrganizationId;
    @XmlElement(name = "PrimaryPaymentProfileId")
    protected QueryType primaryPaymentProfileId;
    @XmlElement(name = "PrimaryShipToAddressCounty")
    protected QueryType primaryShipToAddressCounty;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected QueryType primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToAddressName")
    protected QueryType primaryShipToAddressName;
    @XmlElement(name = "PrimaryShipToAddressStreetAddress2")
    protected QueryType primaryShipToAddressStreetAddress2;
    @XmlElement(name = "PrimaryShipToAddressStreetAddress3")
    protected QueryType primaryShipToAddressStreetAddress3;
    @XmlElement(name = "PrimaryShipToCity")
    protected QueryType primaryShipToCity;
    @XmlElement(name = "PrimaryShipToCountry")
    protected QueryType primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected QueryType primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToJobTitle")
    protected QueryType primaryShipToJobTitle;
    @XmlElement(name = "PrimaryShipToLastName")
    protected QueryType primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPersonId")
    protected QueryType primaryShipToPersonId;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected QueryType primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected QueryType primaryShipToState;
    @XmlElement(name = "PrimaryShipToStreetAddress")
    protected QueryType primaryShipToStreetAddress;
    @XmlElement(name = "RelationshipType")
    protected QueryType relationshipType;
    @XmlElement(name = "RowId")
    protected QueryType rowId;
    @XmlElement(name = "S-SInstance")
    protected QueryType ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected QueryType ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected QueryType ssKeyId;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "Type")
    protected QueryType type;
    @XmlElement(name = "TypeLIC")
    protected QueryType typeLIC;
    @XmlElement(name = "AccountTypeCode")
    protected QueryType accountTypeCode;
    @XmlElement(name = "ListOfAccountBusinessAddress")
    protected ListOfAccountBusinessAddressQuery listOfAccountBusinessAddress;
    @XmlElement(name = "ListOfBusinessAddress")
    protected ListOfBusinessAddressQuery listOfBusinessAddress;
    @XmlElement(name = "ListOfContact")
    protected ListOfContactQuery listOfContact;
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
     * Gets the value of the accountOrganizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountOrganizationIntegrationId() {
        return accountOrganizationIntegrationId;
    }

    /**
     * Sets the value of the accountOrganizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountOrganizationIntegrationId(QueryType value) {
        this.accountOrganizationIntegrationId = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountStatus(QueryType value) {
        this.accountStatus = value;
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
     * Gets the value of the cityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCityState() {
        return cityState;
    }

    /**
     * Sets the value of the cityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCityState(QueryType value) {
        this.cityState = value;
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
     * Gets the value of the dateFormed property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDateFormed() {
        return dateFormed;
    }

    /**
     * Sets the value of the dateFormed property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDateFormed(QueryType value) {
        this.dateFormed = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription(QueryType value) {
        this.description = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDivision(QueryType value) {
        this.division = value;
    }

    /**
     * Gets the value of the eaiSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEAISyncDate() {
        return eaiSyncDate;
    }

    /**
     * Sets the value of the eaiSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEAISyncDate(QueryType value) {
        this.eaiSyncDate = value;
    }

    /**
     * Gets the value of the eaiSyncErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEAISyncErrorText() {
        return eaiSyncErrorText;
    }

    /**
     * Sets the value of the eaiSyncErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEAISyncErrorText(QueryType value) {
        this.eaiSyncErrorText = value;
    }

    /**
     * Gets the value of the eaiSyncStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEAISyncStatusCode() {
        return eaiSyncStatusCode;
    }

    /**
     * Sets the value of the eaiSyncStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEAISyncStatusCode(QueryType value) {
        this.eaiSyncStatusCode = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullAddress(QueryType value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the fullAddressENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullAddressENU() {
        return fullAddressENU;
    }

    /**
     * Sets the value of the fullAddressENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullAddressENU(QueryType value) {
        this.fullAddressENU = value;
    }

    /**
     * Gets the value of the fullAddressJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFullAddressJPN() {
        return fullAddressJPN;
    }

    /**
     * Sets the value of the fullAddressJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFullAddressJPN(QueryType value) {
        this.fullAddressJPN = value;
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
     * Gets the value of the internalOrgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInternalOrgFlag() {
        return internalOrgFlag;
    }

    /**
     * Sets the value of the internalOrgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInternalOrgFlag(QueryType value) {
        this.internalOrgFlag = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLanguageCode(QueryType value) {
        this.languageCode = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLocation(QueryType value) {
        this.location = value;
    }

    /**
     * Gets the value of the mainFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMainFaxNumber() {
        return mainFaxNumber;
    }

    /**
     * Sets the value of the mainFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMainFaxNumber(QueryType value) {
        this.mainFaxNumber = value;
    }

    /**
     * Gets the value of the mainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * Sets the value of the mainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMainPhoneNumber(QueryType value) {
        this.mainPhoneNumber = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMarketing(QueryType value) {
        this.marketing = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setName(QueryType value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameandLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNameandLocation() {
        return nameandLocation;
    }

    /**
     * Sets the value of the nameandLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNameandLocation(QueryType value) {
        this.nameandLocation = value;
    }

    /**
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAccountId(QueryType value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the parentAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAccountIntegrationId() {
        return parentAccountIntegrationId;
    }

    /**
     * Sets the value of the parentAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAccountIntegrationId(QueryType value) {
        this.parentAccountIntegrationId = value;
    }

    /**
     * Gets the value of the parentAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAccountLocation() {
        return parentAccountLocation;
    }

    /**
     * Sets the value of the parentAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAccountLocation(QueryType value) {
        this.parentAccountLocation = value;
    }

    /**
     * Gets the value of the parentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAccountName() {
        return parentAccountName;
    }

    /**
     * Sets the value of the parentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAccountName(QueryType value) {
        this.parentAccountName = value;
    }

    /**
     * Gets the value of the partnerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartnerFlag() {
        return partnerFlag;
    }

    /**
     * Sets the value of the partnerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartnerFlag(QueryType value) {
        this.partnerFlag = value;
    }

    /**
     * Gets the value of the partners property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartners() {
        return partners;
    }

    /**
     * Sets the value of the partners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartners(QueryType value) {
        this.partners = value;
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
     * Gets the value of the philosophy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPhilosophy() {
        return philosophy;
    }

    /**
     * Sets the value of the philosophy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPhilosophy(QueryType value) {
        this.philosophy = value;
    }

    /**
     * Gets the value of the preferredShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreferredShippingMethod() {
        return preferredShippingMethod;
    }

    /**
     * Sets the value of the preferredShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreferredShippingMethod(QueryType value) {
        this.preferredShippingMethod = value;
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
     * Gets the value of the priceListEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListEndDate() {
        return priceListEndDate;
    }

    /**
     * Sets the value of the priceListEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListEndDate(QueryType value) {
        this.priceListEndDate = value;
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
     * Gets the value of the priceListStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListStartDate() {
        return priceListStartDate;
    }

    /**
     * Sets the value of the priceListStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListStartDate(QueryType value) {
        this.priceListStartDate = value;
    }

    /**
     * Gets the value of the primaryAccountAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountAddressCounty() {
        return primaryAccountAddressCounty;
    }

    /**
     * Sets the value of the primaryAccountAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountAddressCounty(QueryType value) {
        this.primaryAccountAddressCounty = value;
    }

    /**
     * Gets the value of the primaryAccountAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountAddressName() {
        return primaryAccountAddressName;
    }

    /**
     * Sets the value of the primaryAccountAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountAddressName(QueryType value) {
        this.primaryAccountAddressName = value;
    }

    /**
     * Gets the value of the primaryAccountAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountAddressStreetAddress2() {
        return primaryAccountAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryAccountAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountAddressStreetAddress2(QueryType value) {
        this.primaryAccountAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryAccountAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountAddressStreetAddress3() {
        return primaryAccountAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryAccountAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountAddressStreetAddress3(QueryType value) {
        this.primaryAccountAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountCity() {
        return primaryAccountCity;
    }

    /**
     * Sets the value of the primaryAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountCity(QueryType value) {
        this.primaryAccountCity = value;
    }

    /**
     * Gets the value of the primaryAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountCountry() {
        return primaryAccountCountry;
    }

    /**
     * Sets the value of the primaryAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountCountry(QueryType value) {
        this.primaryAccountCountry = value;
    }

    /**
     * Gets the value of the primaryAccountPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountPostalCode() {
        return primaryAccountPostalCode;
    }

    /**
     * Sets the value of the primaryAccountPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountPostalCode(QueryType value) {
        this.primaryAccountPostalCode = value;
    }

    /**
     * Gets the value of the primaryAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountState() {
        return primaryAccountState;
    }

    /**
     * Sets the value of the primaryAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountState(QueryType value) {
        this.primaryAccountState = value;
    }

    /**
     * Gets the value of the primaryAccountStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountStreetAddress() {
        return primaryAccountStreetAddress;
    }

    /**
     * Sets the value of the primaryAccountStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountStreetAddress(QueryType value) {
        this.primaryAccountStreetAddress = value;
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
     * Gets the value of the primaryBillToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAccountId() {
        return primaryBillToAccountId;
    }

    /**
     * Sets the value of the primaryBillToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAccountId(QueryType value) {
        this.primaryBillToAccountId = value;
    }

    /**
     * Gets the value of the primaryBillToAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressCounty() {
        return primaryBillToAddressCounty;
    }

    /**
     * Sets the value of the primaryBillToAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressCounty(QueryType value) {
        this.primaryBillToAddressCounty = value;
    }

    /**
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressId(QueryType value) {
        this.primaryBillToAddressId = value;
    }

    /**
     * Gets the value of the primaryBillToAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressName() {
        return primaryBillToAddressName;
    }

    /**
     * Sets the value of the primaryBillToAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressName(QueryType value) {
        this.primaryBillToAddressName = value;
    }

    /**
     * Gets the value of the primaryBillToAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressStreetAddress2() {
        return primaryBillToAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryBillToAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressStreetAddress2(QueryType value) {
        this.primaryBillToAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryBillToAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddressStreetAddress3() {
        return primaryBillToAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryBillToAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddressStreetAddress3(QueryType value) {
        this.primaryBillToAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCity(QueryType value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCountry(QueryType value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToFirstName(QueryType value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToJobTitle() {
        return primaryBillToJobTitle;
    }

    /**
     * Sets the value of the primaryBillToJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToJobTitle(QueryType value) {
        this.primaryBillToJobTitle = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToLastName(QueryType value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToPersonId() {
        return primaryBillToPersonId;
    }

    /**
     * Sets the value of the primaryBillToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToPersonId(QueryType value) {
        this.primaryBillToPersonId = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToPostalCode(QueryType value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToState(QueryType value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToStreetAddress() {
        return primaryBillToStreetAddress;
    }

    /**
     * Sets the value of the primaryBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToStreetAddress(QueryType value) {
        this.primaryBillToStreetAddress = value;
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryContactId(QueryType value) {
        this.primaryContactId = value;
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
     * Gets the value of the primaryPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPaymentProfileId() {
        return primaryPaymentProfileId;
    }

    /**
     * Sets the value of the primaryPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPaymentProfileId(QueryType value) {
        this.primaryPaymentProfileId = value;
    }

    /**
     * Gets the value of the primaryShipToAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressCounty() {
        return primaryShipToAddressCounty;
    }

    /**
     * Sets the value of the primaryShipToAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressCounty(QueryType value) {
        this.primaryShipToAddressCounty = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressId(QueryType value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressName() {
        return primaryShipToAddressName;
    }

    /**
     * Sets the value of the primaryShipToAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressName(QueryType value) {
        this.primaryShipToAddressName = value;
    }

    /**
     * Gets the value of the primaryShipToAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressStreetAddress2() {
        return primaryShipToAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryShipToAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressStreetAddress2(QueryType value) {
        this.primaryShipToAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryShipToAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressStreetAddress3() {
        return primaryShipToAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryShipToAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressStreetAddress3(QueryType value) {
        this.primaryShipToAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCity(QueryType value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCountry(QueryType value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToFirstName(QueryType value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToJobTitle() {
        return primaryShipToJobTitle;
    }

    /**
     * Sets the value of the primaryShipToJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToJobTitle(QueryType value) {
        this.primaryShipToJobTitle = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToLastName(QueryType value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToPersonId() {
        return primaryShipToPersonId;
    }

    /**
     * Sets the value of the primaryShipToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToPersonId(QueryType value) {
        this.primaryShipToPersonId = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToPostalCode(QueryType value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToState(QueryType value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToStreetAddress() {
        return primaryShipToStreetAddress;
    }

    /**
     * Sets the value of the primaryShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToStreetAddress(QueryType value) {
        this.primaryShipToStreetAddress = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRelationshipType(QueryType value) {
        this.relationshipType = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setType(QueryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeLIC property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTypeLIC() {
        return typeLIC;
    }

    /**
     * Sets the value of the typeLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTypeLIC(QueryType value) {
        this.typeLIC = value;
    }

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountTypeCode(QueryType value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the listOfAccountBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddressQuery }
     *     
     */
    public ListOfAccountBusinessAddressQuery getListOfAccountBusinessAddress() {
        return listOfAccountBusinessAddress;
    }

    /**
     * Sets the value of the listOfAccountBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddressQuery }
     *     
     */
    public void setListOfAccountBusinessAddress(ListOfAccountBusinessAddressQuery value) {
        this.listOfAccountBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBusinessAddressQuery }
     *     
     */
    public ListOfBusinessAddressQuery getListOfBusinessAddress() {
        return listOfBusinessAddress;
    }

    /**
     * Sets the value of the listOfBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBusinessAddressQuery }
     *     
     */
    public void setListOfBusinessAddress(ListOfBusinessAddressQuery value) {
        this.listOfBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactQuery }
     *     
     */
    public ListOfContactQuery getListOfContact() {
        return listOfContact;
    }

    /**
     * Sets the value of the listOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactQuery }
     *     
     */
    public void setListOfContact(ListOfContactQuery value) {
        this.listOfContact = value;
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
