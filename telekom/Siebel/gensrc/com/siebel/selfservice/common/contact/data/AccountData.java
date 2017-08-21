
package com.siebel.selfservice.common.contact.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountData">
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
 *         &lt;element name="AccountOrganizationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EAISyncDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EAISyncErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAISyncStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullAddress-ENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullAddress-JPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalOrgFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastClnseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastKeyGenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastManagerReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReviewManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdate-SDQ" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameAndLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceList2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountAddressStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddressStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToJobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToJobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProspectFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeLIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfAccountBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Data}ListOfAccountBusinessAddressData" minOccurs="0"/>
 *         &lt;element name="ListOfAccountOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Data}ListOfAccountOrganizationData" minOccurs="0"/>
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
@XmlType(name = "AccountData", propOrder = {
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
    "dunsNumber2",
    "description",
    "disableDataCleansing",
    "eaiSyncDate",
    "eaiSyncErrorText",
    "eaiSyncStatusCode",
    "fullAddress",
    "fullAddressENU",
    "fullAddressJPN",
    "integrationId",
    "internalOrgFlag",
    "languageCode",
    "lastClnseDate",
    "lastKeyGenDate",
    "lastManagerReviewDate",
    "lastReviewManagerId",
    "lastUpdateSDQ",
    "location",
    "locationType",
    "mainFaxNumber",
    "mainPhoneNumber",
    "marketing",
    "name",
    "nameAndLocation",
    "parentAccountId",
    "parentAccountIntegrationId",
    "parentAccountLocation",
    "parentAccountName",
    "partnerFlag",
    "partyName",
    "partyTypeCode",
    "partyUId",
    "preferredShippingMethod",
    "priceList2",
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
    "primaryEmployeeId",
    "primaryEmployeeLogin",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPaymentProfileId",
    "primaryPositionId",
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
    "primaryTypeId",
    "prospectFlag",
    "relationshipType",
    "rowId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "startDate",
    "type",
    "typeLIC",
    "masterAccountId",
    "listOfAccountBusinessAddress",
    "listOfAccountOrganization"
})
public class AccountData
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
    @XmlElement(name = "AccountOrganizationIntegrationId")
    protected String accountOrganizationIntegrationId;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "ApprovalStatus")
    protected String approvalStatus;
    @XmlElement(name = "CityState")
    protected String cityState;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DUNSNumber2")
    protected String dunsNumber2;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DisableDataCleansing")
    protected Boolean disableDataCleansing;
    @XmlElement(name = "EAISyncDate")
    protected XMLGregorianCalendar eaiSyncDate;
    @XmlElement(name = "EAISyncErrorText")
    protected String eaiSyncErrorText;
    @XmlElement(name = "EAISyncStatusCode")
    protected String eaiSyncStatusCode;
    @XmlElement(name = "FullAddress")
    protected String fullAddress;
    @XmlElement(name = "FullAddress-ENU")
    protected String fullAddressENU;
    @XmlElement(name = "FullAddress-JPN")
    protected String fullAddressJPN;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InternalOrgFlag")
    protected Boolean internalOrgFlag;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "LastClnseDate")
    protected XMLGregorianCalendar lastClnseDate;
    @XmlElement(name = "LastKeyGenDate")
    protected XMLGregorianCalendar lastKeyGenDate;
    @XmlElement(name = "LastManagerReviewDate")
    protected XMLGregorianCalendar lastManagerReviewDate;
    @XmlElement(name = "LastReviewManagerId")
    protected String lastReviewManagerId;
    @XmlElement(name = "LastUpdate-SDQ")
    protected XMLGregorianCalendar lastUpdateSDQ;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "LocationType")
    protected String locationType;
    @XmlElement(name = "MainFaxNumber")
    protected String mainFaxNumber;
    @XmlElement(name = "MainPhoneNumber")
    protected String mainPhoneNumber;
    @XmlElement(name = "Marketing")
    protected String marketing;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NameAndLocation")
    protected String nameAndLocation;
    @XmlElement(name = "ParentAccountId")
    protected String parentAccountId;
    @XmlElement(name = "ParentAccountIntegrationId")
    protected String parentAccountIntegrationId;
    @XmlElement(name = "ParentAccountLocation")
    protected String parentAccountLocation;
    @XmlElement(name = "ParentAccountName")
    protected String parentAccountName;
    @XmlElement(name = "PartnerFlag")
    protected Boolean partnerFlag;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyTypeCode")
    protected String partyTypeCode;
    @XmlElement(name = "PartyUId")
    protected String partyUId;
    @XmlElement(name = "PreferredShippingMethod")
    protected String preferredShippingMethod;
    @XmlElement(name = "PriceList2")
    protected String priceList2;
    @XmlElement(name = "PriceListEndDate")
    protected XMLGregorianCalendar priceListEndDate;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected String priceListIntegrationId;
    @XmlElement(name = "PriceListStartDate")
    protected XMLGregorianCalendar priceListStartDate;
    @XmlElement(name = "PrimaryAccountAddressCounty")
    protected String primaryAccountAddressCounty;
    @XmlElement(name = "PrimaryAccountAddressName")
    protected String primaryAccountAddressName;
    @XmlElement(name = "PrimaryAccountAddressStreetAddress2")
    protected String primaryAccountAddressStreetAddress2;
    @XmlElement(name = "PrimaryAccountAddressStreetAddress3")
    protected String primaryAccountAddressStreetAddress3;
    @XmlElement(name = "PrimaryAccountCity")
    protected String primaryAccountCity;
    @XmlElement(name = "PrimaryAccountCountry")
    protected String primaryAccountCountry;
    @XmlElement(name = "PrimaryAccountPostalCode")
    protected String primaryAccountPostalCode;
    @XmlElement(name = "PrimaryAccountState")
    protected String primaryAccountState;
    @XmlElement(name = "PrimaryAccountStreetAddress")
    protected String primaryAccountStreetAddress;
    @XmlElement(name = "PrimaryAddressId")
    protected String primaryAddressId;
    @XmlElement(name = "PrimaryBillToAccountId")
    protected String primaryBillToAccountId;
    @XmlElement(name = "PrimaryBillToAddressCounty")
    protected String primaryBillToAddressCounty;
    @XmlElement(name = "PrimaryBillToAddressId")
    protected String primaryBillToAddressId;
    @XmlElement(name = "PrimaryBillToAddressName")
    protected String primaryBillToAddressName;
    @XmlElement(name = "PrimaryBillToAddressStreetAddress2")
    protected String primaryBillToAddressStreetAddress2;
    @XmlElement(name = "PrimaryBillToAddressStreetAddress3")
    protected String primaryBillToAddressStreetAddress3;
    @XmlElement(name = "PrimaryBillToCity")
    protected String primaryBillToCity;
    @XmlElement(name = "PrimaryBillToCountry")
    protected String primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected String primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToJobTitle")
    protected String primaryBillToJobTitle;
    @XmlElement(name = "PrimaryBillToLastName")
    protected String primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPersonId")
    protected String primaryBillToPersonId;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected String primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected String primaryBillToState;
    @XmlElement(name = "PrimaryBillToStreetAddress")
    protected String primaryBillToStreetAddress;
    @XmlElement(name = "PrimaryContactId")
    protected String primaryContactId;
    @XmlElement(name = "PrimaryEmployeeId")
    protected String primaryEmployeeId;
    @XmlElement(name = "PrimaryEmployeeLogin")
    protected String primaryEmployeeLogin;
    @XmlElement(name = "PrimaryOrganization")
    protected String primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPaymentProfileId")
    protected String primaryPaymentProfileId;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "PrimaryShipToAddressCounty")
    protected String primaryShipToAddressCounty;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected String primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToAddressName")
    protected String primaryShipToAddressName;
    @XmlElement(name = "PrimaryShipToAddressStreetAddress2")
    protected String primaryShipToAddressStreetAddress2;
    @XmlElement(name = "PrimaryShipToAddressStreetAddress3")
    protected String primaryShipToAddressStreetAddress3;
    @XmlElement(name = "PrimaryShipToCity")
    protected String primaryShipToCity;
    @XmlElement(name = "PrimaryShipToCountry")
    protected String primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected String primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToJobTitle")
    protected String primaryShipToJobTitle;
    @XmlElement(name = "PrimaryShipToLastName")
    protected String primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPersonId")
    protected String primaryShipToPersonId;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected String primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected String primaryShipToState;
    @XmlElement(name = "PrimaryShipToStreetAddress")
    protected String primaryShipToStreetAddress;
    @XmlElement(name = "PrimaryTypeId")
    protected String primaryTypeId;
    @XmlElement(name = "ProspectFlag")
    protected Boolean prospectFlag;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "S-SInstance")
    protected String ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected String ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected String ssKeyId;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TypeLIC")
    protected String typeLIC;
    @XmlElement(name = "MasterAccountId")
    protected String masterAccountId;
    @XmlElement(name = "ListOfAccountBusinessAddress")
    protected ListOfAccountBusinessAddressData listOfAccountBusinessAddress;
    @XmlElement(name = "ListOfAccountOrganization")
    protected ListOfAccountOrganizationData listOfAccountOrganization;
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
     * Gets the value of the accountOrganizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOrganizationIntegrationId() {
        return accountOrganizationIntegrationId;
    }

    /**
     * Sets the value of the accountOrganizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOrganizationIntegrationId(String value) {
        this.accountOrganizationIntegrationId = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
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
     * Gets the value of the cityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityState() {
        return cityState;
    }

    /**
     * Sets the value of the cityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityState(String value) {
        this.cityState = value;
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
     * Gets the value of the dunsNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber2() {
        return dunsNumber2;
    }

    /**
     * Sets the value of the dunsNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber2(String value) {
        this.dunsNumber2 = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the eaiSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAISyncDate() {
        return eaiSyncDate;
    }

    /**
     * Sets the value of the eaiSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAISyncDate(XMLGregorianCalendar value) {
        this.eaiSyncDate = value;
    }

    /**
     * Gets the value of the eaiSyncErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAISyncErrorText() {
        return eaiSyncErrorText;
    }

    /**
     * Sets the value of the eaiSyncErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAISyncErrorText(String value) {
        this.eaiSyncErrorText = value;
    }

    /**
     * Gets the value of the eaiSyncStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAISyncStatusCode() {
        return eaiSyncStatusCode;
    }

    /**
     * Sets the value of the eaiSyncStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAISyncStatusCode(String value) {
        this.eaiSyncStatusCode = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the fullAddressENU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddressENU() {
        return fullAddressENU;
    }

    /**
     * Sets the value of the fullAddressENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddressENU(String value) {
        this.fullAddressENU = value;
    }

    /**
     * Gets the value of the fullAddressJPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddressJPN() {
        return fullAddressJPN;
    }

    /**
     * Sets the value of the fullAddressJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddressJPN(String value) {
        this.fullAddressJPN = value;
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
     * Gets the value of the internalOrgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalOrgFlag() {
        return internalOrgFlag;
    }

    /**
     * Sets the value of the internalOrgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalOrgFlag(Boolean value) {
        this.internalOrgFlag = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
     * Gets the value of the lastManagerReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastManagerReviewDate() {
        return lastManagerReviewDate;
    }

    /**
     * Sets the value of the lastManagerReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastManagerReviewDate(XMLGregorianCalendar value) {
        this.lastManagerReviewDate = value;
    }

    /**
     * Gets the value of the lastReviewManagerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReviewManagerId() {
        return lastReviewManagerId;
    }

    /**
     * Sets the value of the lastReviewManagerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReviewManagerId(String value) {
        this.lastReviewManagerId = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the mainFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFaxNumber() {
        return mainFaxNumber;
    }

    /**
     * Sets the value of the mainFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFaxNumber(String value) {
        this.mainFaxNumber = value;
    }

    /**
     * Gets the value of the mainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * Sets the value of the mainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneNumber(String value) {
        this.mainPhoneNumber = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketing(String value) {
        this.marketing = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameAndLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAndLocation() {
        return nameAndLocation;
    }

    /**
     * Sets the value of the nameAndLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAndLocation(String value) {
        this.nameAndLocation = value;
    }

    /**
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountId(String value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the parentAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountIntegrationId() {
        return parentAccountIntegrationId;
    }

    /**
     * Sets the value of the parentAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountIntegrationId(String value) {
        this.parentAccountIntegrationId = value;
    }

    /**
     * Gets the value of the parentAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountLocation() {
        return parentAccountLocation;
    }

    /**
     * Sets the value of the parentAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountLocation(String value) {
        this.parentAccountLocation = value;
    }

    /**
     * Gets the value of the parentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountName() {
        return parentAccountName;
    }

    /**
     * Sets the value of the parentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountName(String value) {
        this.parentAccountName = value;
    }

    /**
     * Gets the value of the partnerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerFlag() {
        return partnerFlag;
    }

    /**
     * Sets the value of the partnerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerFlag(Boolean value) {
        this.partnerFlag = value;
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
     * Gets the value of the preferredShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredShippingMethod() {
        return preferredShippingMethod;
    }

    /**
     * Sets the value of the preferredShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredShippingMethod(String value) {
        this.preferredShippingMethod = value;
    }

    /**
     * Gets the value of the priceList2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList2() {
        return priceList2;
    }

    /**
     * Sets the value of the priceList2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList2(String value) {
        this.priceList2 = value;
    }

    /**
     * Gets the value of the priceListEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceListEndDate() {
        return priceListEndDate;
    }

    /**
     * Sets the value of the priceListEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceListEndDate(XMLGregorianCalendar value) {
        this.priceListEndDate = value;
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
     * Gets the value of the priceListStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceListStartDate() {
        return priceListStartDate;
    }

    /**
     * Sets the value of the priceListStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceListStartDate(XMLGregorianCalendar value) {
        this.priceListStartDate = value;
    }

    /**
     * Gets the value of the primaryAccountAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountAddressCounty() {
        return primaryAccountAddressCounty;
    }

    /**
     * Sets the value of the primaryAccountAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountAddressCounty(String value) {
        this.primaryAccountAddressCounty = value;
    }

    /**
     * Gets the value of the primaryAccountAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountAddressName() {
        return primaryAccountAddressName;
    }

    /**
     * Sets the value of the primaryAccountAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountAddressName(String value) {
        this.primaryAccountAddressName = value;
    }

    /**
     * Gets the value of the primaryAccountAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountAddressStreetAddress2() {
        return primaryAccountAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryAccountAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountAddressStreetAddress2(String value) {
        this.primaryAccountAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryAccountAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountAddressStreetAddress3() {
        return primaryAccountAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryAccountAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountAddressStreetAddress3(String value) {
        this.primaryAccountAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountCity() {
        return primaryAccountCity;
    }

    /**
     * Sets the value of the primaryAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountCity(String value) {
        this.primaryAccountCity = value;
    }

    /**
     * Gets the value of the primaryAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountCountry() {
        return primaryAccountCountry;
    }

    /**
     * Sets the value of the primaryAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountCountry(String value) {
        this.primaryAccountCountry = value;
    }

    /**
     * Gets the value of the primaryAccountPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountPostalCode() {
        return primaryAccountPostalCode;
    }

    /**
     * Sets the value of the primaryAccountPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountPostalCode(String value) {
        this.primaryAccountPostalCode = value;
    }

    /**
     * Gets the value of the primaryAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountState() {
        return primaryAccountState;
    }

    /**
     * Sets the value of the primaryAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountState(String value) {
        this.primaryAccountState = value;
    }

    /**
     * Gets the value of the primaryAccountStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountStreetAddress() {
        return primaryAccountStreetAddress;
    }

    /**
     * Sets the value of the primaryAccountStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountStreetAddress(String value) {
        this.primaryAccountStreetAddress = value;
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
     * Gets the value of the primaryBillToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAccountId() {
        return primaryBillToAccountId;
    }

    /**
     * Sets the value of the primaryBillToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAccountId(String value) {
        this.primaryBillToAccountId = value;
    }

    /**
     * Gets the value of the primaryBillToAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressCounty() {
        return primaryBillToAddressCounty;
    }

    /**
     * Sets the value of the primaryBillToAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressCounty(String value) {
        this.primaryBillToAddressCounty = value;
    }

    /**
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressId(String value) {
        this.primaryBillToAddressId = value;
    }

    /**
     * Gets the value of the primaryBillToAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressName() {
        return primaryBillToAddressName;
    }

    /**
     * Sets the value of the primaryBillToAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressName(String value) {
        this.primaryBillToAddressName = value;
    }

    /**
     * Gets the value of the primaryBillToAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressStreetAddress2() {
        return primaryBillToAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryBillToAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressStreetAddress2(String value) {
        this.primaryBillToAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryBillToAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressStreetAddress3() {
        return primaryBillToAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryBillToAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressStreetAddress3(String value) {
        this.primaryBillToAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCity(String value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCountry(String value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToFirstName(String value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToJobTitle() {
        return primaryBillToJobTitle;
    }

    /**
     * Sets the value of the primaryBillToJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToJobTitle(String value) {
        this.primaryBillToJobTitle = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToLastName(String value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToPersonId() {
        return primaryBillToPersonId;
    }

    /**
     * Sets the value of the primaryBillToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToPersonId(String value) {
        this.primaryBillToPersonId = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToPostalCode(String value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToState(String value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToStreetAddress() {
        return primaryBillToStreetAddress;
    }

    /**
     * Sets the value of the primaryBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToStreetAddress(String value) {
        this.primaryBillToStreetAddress = value;
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactId(String value) {
        this.primaryContactId = value;
    }

    /**
     * Gets the value of the primaryEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmployeeId() {
        return primaryEmployeeId;
    }

    /**
     * Sets the value of the primaryEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmployeeId(String value) {
        this.primaryEmployeeId = value;
    }

    /**
     * Gets the value of the primaryEmployeeLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmployeeLogin() {
        return primaryEmployeeLogin;
    }

    /**
     * Sets the value of the primaryEmployeeLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmployeeLogin(String value) {
        this.primaryEmployeeLogin = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization(String value) {
        this.primaryOrganization = value;
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
     * Gets the value of the primaryPaymentProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPaymentProfileId() {
        return primaryPaymentProfileId;
    }

    /**
     * Sets the value of the primaryPaymentProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPaymentProfileId(String value) {
        this.primaryPaymentProfileId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionId(String value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryShipToAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressCounty() {
        return primaryShipToAddressCounty;
    }

    /**
     * Sets the value of the primaryShipToAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressCounty(String value) {
        this.primaryShipToAddressCounty = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressId(String value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressName() {
        return primaryShipToAddressName;
    }

    /**
     * Sets the value of the primaryShipToAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressName(String value) {
        this.primaryShipToAddressName = value;
    }

    /**
     * Gets the value of the primaryShipToAddressStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressStreetAddress2() {
        return primaryShipToAddressStreetAddress2;
    }

    /**
     * Sets the value of the primaryShipToAddressStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressStreetAddress2(String value) {
        this.primaryShipToAddressStreetAddress2 = value;
    }

    /**
     * Gets the value of the primaryShipToAddressStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressStreetAddress3() {
        return primaryShipToAddressStreetAddress3;
    }

    /**
     * Sets the value of the primaryShipToAddressStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressStreetAddress3(String value) {
        this.primaryShipToAddressStreetAddress3 = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCity(String value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCountry(String value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToFirstName(String value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToJobTitle() {
        return primaryShipToJobTitle;
    }

    /**
     * Sets the value of the primaryShipToJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToJobTitle(String value) {
        this.primaryShipToJobTitle = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToLastName(String value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToPersonId() {
        return primaryShipToPersonId;
    }

    /**
     * Sets the value of the primaryShipToPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToPersonId(String value) {
        this.primaryShipToPersonId = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToPostalCode(String value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToState(String value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToStreetAddress() {
        return primaryShipToStreetAddress;
    }

    /**
     * Sets the value of the primaryShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToStreetAddress(String value) {
        this.primaryShipToStreetAddress = value;
    }

    /**
     * Gets the value of the primaryTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTypeId() {
        return primaryTypeId;
    }

    /**
     * Sets the value of the primaryTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTypeId(String value) {
        this.primaryTypeId = value;
    }

    /**
     * Gets the value of the prospectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProspectFlag() {
        return prospectFlag;
    }

    /**
     * Sets the value of the prospectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProspectFlag(Boolean value) {
        this.prospectFlag = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeLIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLIC() {
        return typeLIC;
    }

    /**
     * Sets the value of the typeLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLIC(String value) {
        this.typeLIC = value;
    }

    /**
     * Gets the value of the masterAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * Sets the value of the masterAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterAccountId(String value) {
        this.masterAccountId = value;
    }

    /**
     * Gets the value of the listOfAccountBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddressData }
     *     
     */
    public ListOfAccountBusinessAddressData getListOfAccountBusinessAddress() {
        return listOfAccountBusinessAddress;
    }

    /**
     * Sets the value of the listOfAccountBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddressData }
     *     
     */
    public void setListOfAccountBusinessAddress(ListOfAccountBusinessAddressData value) {
        this.listOfAccountBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfAccountOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountOrganizationData }
     *     
     */
    public ListOfAccountOrganizationData getListOfAccountOrganization() {
        return listOfAccountOrganization;
    }

    /**
     * Sets the value of the listOfAccountOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountOrganizationData }
     *     
     */
    public void setListOfAccountOrganization(ListOfAccountOrganizationData value) {
        this.listOfAccountOrganization = value;
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
