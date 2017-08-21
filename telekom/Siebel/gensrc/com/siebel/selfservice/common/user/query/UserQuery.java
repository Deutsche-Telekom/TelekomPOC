
package com.siebel.selfservice.common.user.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovalCurrency" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApprovalExchangeDate" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssignmentExcluded" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AuctionPrivilege" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AvailabilityStatus" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AvailabilityStatusUntil" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CellularPhone" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChallengeQuestion" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConfigurationId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmergencyNotification" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeLoginName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExpenseAmountApprovable" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HireDate" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastLoggedIn" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameENU" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameJPN" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LoginDomain" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MF" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MSExchangeProfileEncryptedPWD" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MSExchangeProfileName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MSExchangeStoreID" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MSExchangeSyncType" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MaidenName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MdfAmountApprovable" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NewResponsibility" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NextAvailabilityStatus" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POApprovedFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PagerCompanyId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PagerPIN" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PagerPhone" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PagerType" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalTitle" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreferredCommunications" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeOrganizationId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPosition" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryResponsibilityId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimarySalesRepId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PwdLastUpd" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RegistrationSourceAppName" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ResponsibilityId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShareAddressFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShareHomePhoneFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShiftId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StandardNotification" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SubcontractorFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TerminationDate" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZone-Translation" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeZoneId" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TimeSheetHoursApprovable" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserComments" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserFlag" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VerifyPassword" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WebCollabUserNameChatbox" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WebCollabUserNameToolbar" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="eTrainingDelegatedAdmin" type="{http://www.siebel.com/SelfService/Common/User/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfSSUserResponsibility" type="{http://www.siebel.com/SelfService/Common/User/Query}ListOfSSUserResponsibilityQuery" minOccurs="0"/>
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
@XmlType(name = "UserQuery", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountId",
    "alias",
    "approvalCurrency",
    "approvalExchangeDate",
    "assignmentExcluded",
    "auctionPrivilege",
    "availabilityStatus",
    "availabilityStatusUntil",
    "cellularPhone",
    "challengeAnswer",
    "challengeQuestion",
    "configurationId",
    "emailAddress",
    "emergencyNotification",
    "employeeNumber",
    "employeeFlag",
    "employeeId",
    "employeeLoginName",
    "employmentStatus",
    "expenseAmountApprovable",
    "fax",
    "firstName",
    "fullName",
    "hireDate",
    "homePhone",
    "jobTitle",
    "lastLoggedIn",
    "lastName",
    "lastNameFirstName",
    "lastNameFirstNameENU",
    "lastNameFirstNameJPN",
    "loginDomain",
    "loginName",
    "mf",
    "msExchangeProfileEncryptedPWD",
    "msExchangeProfileName",
    "msExchangeStoreID",
    "msExchangeSyncType",
    "maidenName",
    "mdfAmountApprovable",
    "middleName",
    "newResponsibility",
    "nextAvailabilityStatus",
    "nickName",
    "poApprovedFlag",
    "pagerCompanyId",
    "pagerPIN",
    "pagerPhone",
    "pagerType",
    "partyName",
    "partyTypeCode",
    "partyUId",
    "password",
    "personUId",
    "personalContact",
    "personalTitle",
    "phone",
    "preferredCommunications",
    "primaryEmployeeOrganizationId",
    "primaryOrganizationId",
    "primaryPosition",
    "primaryPositionId",
    "primaryResponsibilityId",
    "primarySalesRepId",
    "pwdLastUpd",
    "race",
    "registrationSourceAppName",
    "responsibilityId",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "shareAddressFlag",
    "shareHomePhoneFlag",
    "shiftId",
    "standardNotification",
    "startDate",
    "subcontractorFlag",
    "terminationDate",
    "timeZone",
    "timeZoneTranslation",
    "timeZoneId",
    "timeSheetHoursApprovable",
    "userComments",
    "userFlag",
    "userType",
    "verifyPassword",
    "webCollabUserNameChatbox",
    "webCollabUserNameToolbar",
    "eTrainingDelegatedAdmin",
    "listOfSSUserResponsibility"
})
public class UserQuery
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
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "Alias")
    protected QueryType alias;
    @XmlElement(name = "ApprovalCurrency")
    protected QueryType approvalCurrency;
    @XmlElement(name = "ApprovalExchangeDate")
    protected QueryType approvalExchangeDate;
    @XmlElement(name = "AssignmentExcluded")
    protected QueryType assignmentExcluded;
    @XmlElement(name = "AuctionPrivilege")
    protected QueryType auctionPrivilege;
    @XmlElement(name = "AvailabilityStatus")
    protected QueryType availabilityStatus;
    @XmlElement(name = "AvailabilityStatusUntil")
    protected QueryType availabilityStatusUntil;
    @XmlElement(name = "CellularPhone")
    protected QueryType cellularPhone;
    @XmlElement(name = "ChallengeAnswer")
    protected QueryType challengeAnswer;
    @XmlElement(name = "ChallengeQuestion")
    protected QueryType challengeQuestion;
    @XmlElement(name = "ConfigurationId")
    protected QueryType configurationId;
    @XmlElement(name = "EmailAddress")
    protected QueryType emailAddress;
    @XmlElement(name = "EmergencyNotification")
    protected QueryType emergencyNotification;
    @XmlElement(name = "EmployeeNumber")
    protected QueryType employeeNumber;
    @XmlElement(name = "EmployeeFlag")
    protected QueryType employeeFlag;
    @XmlElement(name = "EmployeeId")
    protected QueryType employeeId;
    @XmlElement(name = "EmployeeLoginName")
    protected QueryType employeeLoginName;
    @XmlElement(name = "EmploymentStatus")
    protected QueryType employmentStatus;
    @XmlElement(name = "ExpenseAmountApprovable")
    protected QueryType expenseAmountApprovable;
    @XmlElement(name = "Fax")
    protected QueryType fax;
    @XmlElement(name = "FirstName")
    protected QueryType firstName;
    @XmlElement(name = "FullName")
    protected QueryType fullName;
    @XmlElement(name = "HireDate")
    protected QueryType hireDate;
    @XmlElement(name = "HomePhone")
    protected QueryType homePhone;
    @XmlElement(name = "JobTitle")
    protected QueryType jobTitle;
    @XmlElement(name = "LastLoggedIn")
    protected QueryType lastLoggedIn;
    @XmlElement(name = "LastName")
    protected QueryType lastName;
    @XmlElement(name = "LastNameFirstName")
    protected QueryType lastNameFirstName;
    @XmlElement(name = "LastNameFirstNameENU")
    protected QueryType lastNameFirstNameENU;
    @XmlElement(name = "LastNameFirstNameJPN")
    protected QueryType lastNameFirstNameJPN;
    @XmlElement(name = "LoginDomain")
    protected QueryType loginDomain;
    @XmlElement(name = "LoginName")
    protected QueryType loginName;
    @XmlElement(name = "MF")
    protected QueryType mf;
    @XmlElement(name = "MSExchangeProfileEncryptedPWD")
    protected QueryType msExchangeProfileEncryptedPWD;
    @XmlElement(name = "MSExchangeProfileName")
    protected QueryType msExchangeProfileName;
    @XmlElement(name = "MSExchangeStoreID")
    protected QueryType msExchangeStoreID;
    @XmlElement(name = "MSExchangeSyncType")
    protected QueryType msExchangeSyncType;
    @XmlElement(name = "MaidenName")
    protected QueryType maidenName;
    @XmlElement(name = "MdfAmountApprovable")
    protected QueryType mdfAmountApprovable;
    @XmlElement(name = "MiddleName")
    protected QueryType middleName;
    @XmlElement(name = "NewResponsibility")
    protected QueryType newResponsibility;
    @XmlElement(name = "NextAvailabilityStatus")
    protected QueryType nextAvailabilityStatus;
    @XmlElement(name = "NickName")
    protected QueryType nickName;
    @XmlElement(name = "POApprovedFlag")
    protected QueryType poApprovedFlag;
    @XmlElement(name = "PagerCompanyId")
    protected QueryType pagerCompanyId;
    @XmlElement(name = "PagerPIN")
    protected QueryType pagerPIN;
    @XmlElement(name = "PagerPhone")
    protected QueryType pagerPhone;
    @XmlElement(name = "PagerType")
    protected QueryType pagerType;
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
    @XmlElement(name = "PersonalTitle")
    protected QueryType personalTitle;
    @XmlElement(name = "Phone")
    protected QueryType phone;
    @XmlElement(name = "PreferredCommunications")
    protected QueryType preferredCommunications;
    @XmlElement(name = "PrimaryEmployeeOrganizationId")
    protected QueryType primaryEmployeeOrganizationId;
    @XmlElement(name = "PrimaryOrganizationId")
    protected QueryType primaryOrganizationId;
    @XmlElement(name = "PrimaryPosition")
    protected QueryType primaryPosition;
    @XmlElement(name = "PrimaryPositionId")
    protected QueryType primaryPositionId;
    @XmlElement(name = "PrimaryResponsibilityId")
    protected QueryType primaryResponsibilityId;
    @XmlElement(name = "PrimarySalesRepId")
    protected QueryType primarySalesRepId;
    @XmlElement(name = "PwdLastUpd")
    protected QueryType pwdLastUpd;
    @XmlElement(name = "Race")
    protected QueryType race;
    @XmlElement(name = "RegistrationSourceAppName")
    protected QueryType registrationSourceAppName;
    @XmlElement(name = "ResponsibilityId")
    protected QueryType responsibilityId;
    @XmlElement(name = "S-SInstance")
    protected QueryType ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected QueryType ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected QueryType ssKeyId;
    @XmlElement(name = "ShareAddressFlag")
    protected QueryType shareAddressFlag;
    @XmlElement(name = "ShareHomePhoneFlag")
    protected QueryType shareHomePhoneFlag;
    @XmlElement(name = "ShiftId")
    protected QueryType shiftId;
    @XmlElement(name = "StandardNotification")
    protected QueryType standardNotification;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "SubcontractorFlag")
    protected QueryType subcontractorFlag;
    @XmlElement(name = "TerminationDate")
    protected QueryType terminationDate;
    @XmlElement(name = "TimeZone")
    protected QueryType timeZone;
    @XmlElement(name = "TimeZone-Translation")
    protected QueryType timeZoneTranslation;
    @XmlElement(name = "TimeZoneId")
    protected QueryType timeZoneId;
    @XmlElement(name = "TimeSheetHoursApprovable")
    protected QueryType timeSheetHoursApprovable;
    @XmlElement(name = "UserComments")
    protected QueryType userComments;
    @XmlElement(name = "UserFlag")
    protected QueryType userFlag;
    @XmlElement(name = "UserType")
    protected QueryType userType;
    @XmlElement(name = "VerifyPassword")
    protected QueryType verifyPassword;
    @XmlElement(name = "WebCollabUserNameChatbox")
    protected QueryType webCollabUserNameChatbox;
    @XmlElement(name = "WebCollabUserNameToolbar")
    protected QueryType webCollabUserNameToolbar;
    protected QueryType eTrainingDelegatedAdmin;
    @XmlElement(name = "ListOfSSUserResponsibility")
    protected ListOfSSUserResponsibilityQuery listOfSSUserResponsibility;
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
     * Gets the value of the approvalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovalCurrency() {
        return approvalCurrency;
    }

    /**
     * Sets the value of the approvalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovalCurrency(QueryType value) {
        this.approvalCurrency = value;
    }

    /**
     * Gets the value of the approvalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApprovalExchangeDate() {
        return approvalExchangeDate;
    }

    /**
     * Sets the value of the approvalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApprovalExchangeDate(QueryType value) {
        this.approvalExchangeDate = value;
    }

    /**
     * Gets the value of the assignmentExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssignmentExcluded() {
        return assignmentExcluded;
    }

    /**
     * Sets the value of the assignmentExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssignmentExcluded(QueryType value) {
        this.assignmentExcluded = value;
    }

    /**
     * Gets the value of the auctionPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAuctionPrivilege() {
        return auctionPrivilege;
    }

    /**
     * Sets the value of the auctionPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAuctionPrivilege(QueryType value) {
        this.auctionPrivilege = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAvailabilityStatus(QueryType value) {
        this.availabilityStatus = value;
    }

    /**
     * Gets the value of the availabilityStatusUntil property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAvailabilityStatusUntil() {
        return availabilityStatusUntil;
    }

    /**
     * Sets the value of the availabilityStatusUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAvailabilityStatusUntil(QueryType value) {
        this.availabilityStatusUntil = value;
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
     * Gets the value of the configurationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConfigurationId() {
        return configurationId;
    }

    /**
     * Sets the value of the configurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConfigurationId(QueryType value) {
        this.configurationId = value;
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
     * Gets the value of the emergencyNotification property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmergencyNotification() {
        return emergencyNotification;
    }

    /**
     * Sets the value of the emergencyNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmergencyNotification(QueryType value) {
        this.emergencyNotification = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmployeeNumber(QueryType value) {
        this.employeeNumber = value;
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
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmployeeId(QueryType value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmployeeLoginName() {
        return employeeLoginName;
    }

    /**
     * Sets the value of the employeeLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmployeeLoginName(QueryType value) {
        this.employeeLoginName = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmploymentStatus(QueryType value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the expenseAmountApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExpenseAmountApprovable() {
        return expenseAmountApprovable;
    }

    /**
     * Sets the value of the expenseAmountApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExpenseAmountApprovable(QueryType value) {
        this.expenseAmountApprovable = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFax(QueryType value) {
        this.fax = value;
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
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHireDate(QueryType value) {
        this.hireDate = value;
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
     * Gets the value of the lastLoggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLastLoggedIn() {
        return lastLoggedIn;
    }

    /**
     * Sets the value of the lastLoggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLastLoggedIn(QueryType value) {
        this.lastLoggedIn = value;
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
     * Gets the value of the loginDomain property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLoginDomain() {
        return loginDomain;
    }

    /**
     * Sets the value of the loginDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLoginDomain(QueryType value) {
        this.loginDomain = value;
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
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMF() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMF(QueryType value) {
        this.mf = value;
    }

    /**
     * Gets the value of the msExchangeProfileEncryptedPWD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMSExchangeProfileEncryptedPWD() {
        return msExchangeProfileEncryptedPWD;
    }

    /**
     * Sets the value of the msExchangeProfileEncryptedPWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMSExchangeProfileEncryptedPWD(QueryType value) {
        this.msExchangeProfileEncryptedPWD = value;
    }

    /**
     * Gets the value of the msExchangeProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMSExchangeProfileName() {
        return msExchangeProfileName;
    }

    /**
     * Sets the value of the msExchangeProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMSExchangeProfileName(QueryType value) {
        this.msExchangeProfileName = value;
    }

    /**
     * Gets the value of the msExchangeStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMSExchangeStoreID() {
        return msExchangeStoreID;
    }

    /**
     * Sets the value of the msExchangeStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMSExchangeStoreID(QueryType value) {
        this.msExchangeStoreID = value;
    }

    /**
     * Gets the value of the msExchangeSyncType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMSExchangeSyncType() {
        return msExchangeSyncType;
    }

    /**
     * Sets the value of the msExchangeSyncType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMSExchangeSyncType(QueryType value) {
        this.msExchangeSyncType = value;
    }

    /**
     * Gets the value of the maidenName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMaidenName() {
        return maidenName;
    }

    /**
     * Sets the value of the maidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMaidenName(QueryType value) {
        this.maidenName = value;
    }

    /**
     * Gets the value of the mdfAmountApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMdfAmountApprovable() {
        return mdfAmountApprovable;
    }

    /**
     * Sets the value of the mdfAmountApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMdfAmountApprovable(QueryType value) {
        this.mdfAmountApprovable = value;
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
     * Gets the value of the newResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNewResponsibility() {
        return newResponsibility;
    }

    /**
     * Sets the value of the newResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNewResponsibility(QueryType value) {
        this.newResponsibility = value;
    }

    /**
     * Gets the value of the nextAvailabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNextAvailabilityStatus() {
        return nextAvailabilityStatus;
    }

    /**
     * Sets the value of the nextAvailabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNextAvailabilityStatus(QueryType value) {
        this.nextAvailabilityStatus = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNickName(QueryType value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the poApprovedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOApprovedFlag() {
        return poApprovedFlag;
    }

    /**
     * Sets the value of the poApprovedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOApprovedFlag(QueryType value) {
        this.poApprovedFlag = value;
    }

    /**
     * Gets the value of the pagerCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPagerCompanyId() {
        return pagerCompanyId;
    }

    /**
     * Sets the value of the pagerCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPagerCompanyId(QueryType value) {
        this.pagerCompanyId = value;
    }

    /**
     * Gets the value of the pagerPIN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPagerPIN() {
        return pagerPIN;
    }

    /**
     * Sets the value of the pagerPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPagerPIN(QueryType value) {
        this.pagerPIN = value;
    }

    /**
     * Gets the value of the pagerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPagerPhone() {
        return pagerPhone;
    }

    /**
     * Sets the value of the pagerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPagerPhone(QueryType value) {
        this.pagerPhone = value;
    }

    /**
     * Gets the value of the pagerType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPagerType() {
        return pagerType;
    }

    /**
     * Sets the value of the pagerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPagerType(QueryType value) {
        this.pagerType = value;
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
     * Gets the value of the personalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalTitle() {
        return personalTitle;
    }

    /**
     * Sets the value of the personalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalTitle(QueryType value) {
        this.personalTitle = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPhone(QueryType value) {
        this.phone = value;
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
     * Gets the value of the primaryEmployeeOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryEmployeeOrganizationId() {
        return primaryEmployeeOrganizationId;
    }

    /**
     * Sets the value of the primaryEmployeeOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryEmployeeOrganizationId(QueryType value) {
        this.primaryEmployeeOrganizationId = value;
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
     * Gets the value of the primaryPosition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPosition() {
        return primaryPosition;
    }

    /**
     * Sets the value of the primaryPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPosition(QueryType value) {
        this.primaryPosition = value;
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
     * Gets the value of the primarySalesRepId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimarySalesRepId() {
        return primarySalesRepId;
    }

    /**
     * Sets the value of the primarySalesRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimarySalesRepId(QueryType value) {
        this.primarySalesRepId = value;
    }

    /**
     * Gets the value of the pwdLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPwdLastUpd() {
        return pwdLastUpd;
    }

    /**
     * Sets the value of the pwdLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPwdLastUpd(QueryType value) {
        this.pwdLastUpd = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRace(QueryType value) {
        this.race = value;
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
     * Gets the value of the responsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getResponsibilityId() {
        return responsibilityId;
    }

    /**
     * Sets the value of the responsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setResponsibilityId(QueryType value) {
        this.responsibilityId = value;
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
     * Gets the value of the shareAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShareAddressFlag() {
        return shareAddressFlag;
    }

    /**
     * Sets the value of the shareAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShareAddressFlag(QueryType value) {
        this.shareAddressFlag = value;
    }

    /**
     * Gets the value of the shareHomePhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShareHomePhoneFlag() {
        return shareHomePhoneFlag;
    }

    /**
     * Sets the value of the shareHomePhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShareHomePhoneFlag(QueryType value) {
        this.shareHomePhoneFlag = value;
    }

    /**
     * Gets the value of the shiftId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShiftId() {
        return shiftId;
    }

    /**
     * Sets the value of the shiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShiftId(QueryType value) {
        this.shiftId = value;
    }

    /**
     * Gets the value of the standardNotification property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStandardNotification() {
        return standardNotification;
    }

    /**
     * Sets the value of the standardNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStandardNotification(QueryType value) {
        this.standardNotification = value;
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
     * Gets the value of the subcontractorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSubcontractorFlag() {
        return subcontractorFlag;
    }

    /**
     * Sets the value of the subcontractorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSubcontractorFlag(QueryType value) {
        this.subcontractorFlag = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTerminationDate(QueryType value) {
        this.terminationDate = value;
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
     * Gets the value of the timeZoneTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeZoneTranslation() {
        return timeZoneTranslation;
    }

    /**
     * Sets the value of the timeZoneTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeZoneTranslation(QueryType value) {
        this.timeZoneTranslation = value;
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
     * Gets the value of the timeSheetHoursApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTimeSheetHoursApprovable() {
        return timeSheetHoursApprovable;
    }

    /**
     * Sets the value of the timeSheetHoursApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTimeSheetHoursApprovable(QueryType value) {
        this.timeSheetHoursApprovable = value;
    }

    /**
     * Gets the value of the userComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserComments() {
        return userComments;
    }

    /**
     * Sets the value of the userComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserComments(QueryType value) {
        this.userComments = value;
    }

    /**
     * Gets the value of the userFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUserFlag() {
        return userFlag;
    }

    /**
     * Sets the value of the userFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUserFlag(QueryType value) {
        this.userFlag = value;
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
     * Gets the value of the webCollabUserNameChatbox property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWebCollabUserNameChatbox() {
        return webCollabUserNameChatbox;
    }

    /**
     * Sets the value of the webCollabUserNameChatbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWebCollabUserNameChatbox(QueryType value) {
        this.webCollabUserNameChatbox = value;
    }

    /**
     * Gets the value of the webCollabUserNameToolbar property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWebCollabUserNameToolbar() {
        return webCollabUserNameToolbar;
    }

    /**
     * Sets the value of the webCollabUserNameToolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWebCollabUserNameToolbar(QueryType value) {
        this.webCollabUserNameToolbar = value;
    }

    /**
     * Gets the value of the eTrainingDelegatedAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getETrainingDelegatedAdmin() {
        return eTrainingDelegatedAdmin;
    }

    /**
     * Sets the value of the eTrainingDelegatedAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setETrainingDelegatedAdmin(QueryType value) {
        this.eTrainingDelegatedAdmin = value;
    }

    /**
     * Gets the value of the listOfSSUserResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserResponsibilityQuery }
     *     
     */
    public ListOfSSUserResponsibilityQuery getListOfSSUserResponsibility() {
        return listOfSSUserResponsibility;
    }

    /**
     * Sets the value of the listOfSSUserResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserResponsibilityQuery }
     *     
     */
    public void setListOfSSUserResponsibility(ListOfSSUserResponsibilityQuery value) {
        this.listOfSSUserResponsibility = value;
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
