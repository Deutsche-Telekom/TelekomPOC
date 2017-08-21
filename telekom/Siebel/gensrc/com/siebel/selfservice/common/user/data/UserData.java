
package com.siebel.selfservice.common.user.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserData">
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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AssignmentExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuctionPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityStatusUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CellularPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChallengeQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpenseAmountApprovable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoggedIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameENU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameFirstNameJPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSExchangeProfileEncryptedPWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSExchangeProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSExchangeStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSExchangeSyncType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdfAmountApprovable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewResponsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextAvailabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POApprovedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagerCompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagerPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredCommunications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryResponsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimarySalesRepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PwdLastUpd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationSourceAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S-SKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShareHomePhoneFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SubcontractorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone-Translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSheetHoursApprovable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebCollabUserNameChatbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebCollabUserNameToolbar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eTrainingDelegatedAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListOfSSUserResponsibility" type="{http://www.siebel.com/SelfService/Common/User/Data}ListOfSSUserResponsibilityData" minOccurs="0"/>
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
@XmlType(name = "UserData", propOrder = {
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
public class UserData
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
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "ApprovalCurrency")
    protected String approvalCurrency;
    @XmlElement(name = "ApprovalExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approvalExchangeDate;
    @XmlElement(name = "AssignmentExcluded")
    protected Boolean assignmentExcluded;
    @XmlElement(name = "AuctionPrivilege")
    protected String auctionPrivilege;
    @XmlElement(name = "AvailabilityStatus")
    protected String availabilityStatus;
    @XmlElement(name = "AvailabilityStatusUntil")
    protected XMLGregorianCalendar availabilityStatusUntil;
    @XmlElement(name = "CellularPhone")
    protected String cellularPhone;
    @XmlElement(name = "ChallengeAnswer")
    protected String challengeAnswer;
    @XmlElement(name = "ChallengeQuestion")
    protected String challengeQuestion;
    @XmlElement(name = "ConfigurationId")
    protected String configurationId;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "EmergencyNotification")
    protected String emergencyNotification;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "EmployeeFlag")
    protected Boolean employeeFlag;
    @XmlElement(name = "EmployeeId")
    protected String employeeId;
    @XmlElement(name = "EmployeeLoginName")
    protected String employeeLoginName;
    @XmlElement(name = "EmploymentStatus")
    protected String employmentStatus;
    @XmlElement(name = "ExpenseAmountApprovable")
    protected BigDecimal expenseAmountApprovable;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "HireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hireDate;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "LastLoggedIn")
    protected XMLGregorianCalendar lastLoggedIn;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LastNameFirstName")
    protected String lastNameFirstName;
    @XmlElement(name = "LastNameFirstNameENU")
    protected String lastNameFirstNameENU;
    @XmlElement(name = "LastNameFirstNameJPN")
    protected String lastNameFirstNameJPN;
    @XmlElement(name = "LoginDomain")
    protected String loginDomain;
    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "MF")
    protected String mf;
    @XmlElement(name = "MSExchangeProfileEncryptedPWD")
    protected String msExchangeProfileEncryptedPWD;
    @XmlElement(name = "MSExchangeProfileName")
    protected String msExchangeProfileName;
    @XmlElement(name = "MSExchangeStoreID")
    protected String msExchangeStoreID;
    @XmlElement(name = "MSExchangeSyncType")
    protected String msExchangeSyncType;
    @XmlElement(name = "MaidenName")
    protected String maidenName;
    @XmlElement(name = "MdfAmountApprovable")
    protected BigDecimal mdfAmountApprovable;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NewResponsibility")
    protected String newResponsibility;
    @XmlElement(name = "NextAvailabilityStatus")
    protected String nextAvailabilityStatus;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "POApprovedFlag")
    protected Boolean poApprovedFlag;
    @XmlElement(name = "PagerCompanyId")
    protected String pagerCompanyId;
    @XmlElement(name = "PagerPIN")
    protected String pagerPIN;
    @XmlElement(name = "PagerPhone")
    protected String pagerPhone;
    @XmlElement(name = "PagerType")
    protected String pagerType;
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
    @XmlElement(name = "PersonalTitle")
    protected String personalTitle;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "PreferredCommunications")
    protected String preferredCommunications;
    @XmlElement(name = "PrimaryEmployeeOrganizationId")
    protected String primaryEmployeeOrganizationId;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPosition")
    protected String primaryPosition;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "PrimaryResponsibilityId")
    protected String primaryResponsibilityId;
    @XmlElement(name = "PrimarySalesRepId")
    protected String primarySalesRepId;
    @XmlElement(name = "PwdLastUpd")
    protected XMLGregorianCalendar pwdLastUpd;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "RegistrationSourceAppName")
    protected String registrationSourceAppName;
    @XmlElement(name = "ResponsibilityId")
    protected String responsibilityId;
    @XmlElement(name = "S-SInstance")
    protected String ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected String ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected String ssKeyId;
    @XmlElement(name = "ShareAddressFlag")
    protected Boolean shareAddressFlag;
    @XmlElement(name = "ShareHomePhoneFlag")
    protected Boolean shareHomePhoneFlag;
    @XmlElement(name = "ShiftId")
    protected String shiftId;
    @XmlElement(name = "StandardNotification")
    protected String standardNotification;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SubcontractorFlag")
    protected Boolean subcontractorFlag;
    @XmlElement(name = "TerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "TimeZone-Translation")
    protected String timeZoneTranslation;
    @XmlElement(name = "TimeZoneId")
    protected String timeZoneId;
    @XmlElement(name = "TimeSheetHoursApprovable")
    protected BigDecimal timeSheetHoursApprovable;
    @XmlElement(name = "UserComments")
    protected String userComments;
    @XmlElement(name = "UserFlag")
    protected Boolean userFlag;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "VerifyPassword")
    protected String verifyPassword;
    @XmlElement(name = "WebCollabUserNameChatbox")
    protected String webCollabUserNameChatbox;
    @XmlElement(name = "WebCollabUserNameToolbar")
    protected String webCollabUserNameToolbar;
    protected Boolean eTrainingDelegatedAdmin;
    @XmlElement(name = "ListOfSSUserResponsibility")
    protected ListOfSSUserResponsibilityData listOfSSUserResponsibility;
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
     * Gets the value of the approvalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCurrency() {
        return approvalCurrency;
    }

    /**
     * Sets the value of the approvalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCurrency(String value) {
        this.approvalCurrency = value;
    }

    /**
     * Gets the value of the approvalExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalExchangeDate() {
        return approvalExchangeDate;
    }

    /**
     * Sets the value of the approvalExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalExchangeDate(XMLGregorianCalendar value) {
        this.approvalExchangeDate = value;
    }

    /**
     * Gets the value of the assignmentExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignmentExcluded() {
        return assignmentExcluded;
    }

    /**
     * Sets the value of the assignmentExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignmentExcluded(Boolean value) {
        this.assignmentExcluded = value;
    }

    /**
     * Gets the value of the auctionPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionPrivilege() {
        return auctionPrivilege;
    }

    /**
     * Sets the value of the auctionPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionPrivilege(String value) {
        this.auctionPrivilege = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityStatus(String value) {
        this.availabilityStatus = value;
    }

    /**
     * Gets the value of the availabilityStatusUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailabilityStatusUntil() {
        return availabilityStatusUntil;
    }

    /**
     * Sets the value of the availabilityStatusUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailabilityStatusUntil(XMLGregorianCalendar value) {
        this.availabilityStatusUntil = value;
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
     * Gets the value of the configurationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * Sets the value of the configurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationId(String value) {
        this.configurationId = value;
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
     * Gets the value of the emergencyNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyNotification() {
        return emergencyNotification;
    }

    /**
     * Sets the value of the emergencyNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyNotification(String value) {
        this.emergencyNotification = value;
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
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the expenseAmountApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpenseAmountApprovable() {
        return expenseAmountApprovable;
    }

    /**
     * Sets the value of the expenseAmountApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpenseAmountApprovable(BigDecimal value) {
        this.expenseAmountApprovable = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
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
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the lastLoggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoggedIn() {
        return lastLoggedIn;
    }

    /**
     * Sets the value of the lastLoggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoggedIn(XMLGregorianCalendar value) {
        this.lastLoggedIn = value;
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
     * Gets the value of the loginDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDomain() {
        return loginDomain;
    }

    /**
     * Sets the value of the loginDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDomain(String value) {
        this.loginDomain = value;
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
     * Gets the value of the mf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMF() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMF(String value) {
        this.mf = value;
    }

    /**
     * Gets the value of the msExchangeProfileEncryptedPWD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSExchangeProfileEncryptedPWD() {
        return msExchangeProfileEncryptedPWD;
    }

    /**
     * Sets the value of the msExchangeProfileEncryptedPWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSExchangeProfileEncryptedPWD(String value) {
        this.msExchangeProfileEncryptedPWD = value;
    }

    /**
     * Gets the value of the msExchangeProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSExchangeProfileName() {
        return msExchangeProfileName;
    }

    /**
     * Sets the value of the msExchangeProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSExchangeProfileName(String value) {
        this.msExchangeProfileName = value;
    }

    /**
     * Gets the value of the msExchangeStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSExchangeStoreID() {
        return msExchangeStoreID;
    }

    /**
     * Sets the value of the msExchangeStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSExchangeStoreID(String value) {
        this.msExchangeStoreID = value;
    }

    /**
     * Gets the value of the msExchangeSyncType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSExchangeSyncType() {
        return msExchangeSyncType;
    }

    /**
     * Sets the value of the msExchangeSyncType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSExchangeSyncType(String value) {
        this.msExchangeSyncType = value;
    }

    /**
     * Gets the value of the maidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Sets the value of the maidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenName(String value) {
        this.maidenName = value;
    }

    /**
     * Gets the value of the mdfAmountApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMdfAmountApprovable() {
        return mdfAmountApprovable;
    }

    /**
     * Sets the value of the mdfAmountApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMdfAmountApprovable(BigDecimal value) {
        this.mdfAmountApprovable = value;
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
     * Gets the value of the newResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewResponsibility() {
        return newResponsibility;
    }

    /**
     * Sets the value of the newResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewResponsibility(String value) {
        this.newResponsibility = value;
    }

    /**
     * Gets the value of the nextAvailabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextAvailabilityStatus() {
        return nextAvailabilityStatus;
    }

    /**
     * Sets the value of the nextAvailabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextAvailabilityStatus(String value) {
        this.nextAvailabilityStatus = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the poApprovedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOApprovedFlag() {
        return poApprovedFlag;
    }

    /**
     * Sets the value of the poApprovedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOApprovedFlag(Boolean value) {
        this.poApprovedFlag = value;
    }

    /**
     * Gets the value of the pagerCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerCompanyId() {
        return pagerCompanyId;
    }

    /**
     * Sets the value of the pagerCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerCompanyId(String value) {
        this.pagerCompanyId = value;
    }

    /**
     * Gets the value of the pagerPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerPIN() {
        return pagerPIN;
    }

    /**
     * Sets the value of the pagerPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerPIN(String value) {
        this.pagerPIN = value;
    }

    /**
     * Gets the value of the pagerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerPhone() {
        return pagerPhone;
    }

    /**
     * Sets the value of the pagerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerPhone(String value) {
        this.pagerPhone = value;
    }

    /**
     * Gets the value of the pagerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerType() {
        return pagerType;
    }

    /**
     * Sets the value of the pagerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerType(String value) {
        this.pagerType = value;
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
     * Gets the value of the personalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalTitle() {
        return personalTitle;
    }

    /**
     * Sets the value of the personalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalTitle(String value) {
        this.personalTitle = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Gets the value of the primaryEmployeeOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmployeeOrganizationId() {
        return primaryEmployeeOrganizationId;
    }

    /**
     * Sets the value of the primaryEmployeeOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmployeeOrganizationId(String value) {
        this.primaryEmployeeOrganizationId = value;
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
     * Gets the value of the primaryPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPosition() {
        return primaryPosition;
    }

    /**
     * Sets the value of the primaryPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPosition(String value) {
        this.primaryPosition = value;
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
     * Gets the value of the primarySalesRepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySalesRepId() {
        return primarySalesRepId;
    }

    /**
     * Sets the value of the primarySalesRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySalesRepId(String value) {
        this.primarySalesRepId = value;
    }

    /**
     * Gets the value of the pwdLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPwdLastUpd() {
        return pwdLastUpd;
    }

    /**
     * Sets the value of the pwdLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPwdLastUpd(XMLGregorianCalendar value) {
        this.pwdLastUpd = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the registrationSourceAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationSourceAppName() {
        return registrationSourceAppName;
    }

    /**
     * Sets the value of the registrationSourceAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationSourceAppName(String value) {
        this.registrationSourceAppName = value;
    }

    /**
     * Gets the value of the responsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityId() {
        return responsibilityId;
    }

    /**
     * Sets the value of the responsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityId(String value) {
        this.responsibilityId = value;
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
     * Gets the value of the shareAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareAddressFlag() {
        return shareAddressFlag;
    }

    /**
     * Sets the value of the shareAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareAddressFlag(Boolean value) {
        this.shareAddressFlag = value;
    }

    /**
     * Gets the value of the shareHomePhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareHomePhoneFlag() {
        return shareHomePhoneFlag;
    }

    /**
     * Sets the value of the shareHomePhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareHomePhoneFlag(Boolean value) {
        this.shareHomePhoneFlag = value;
    }

    /**
     * Gets the value of the shiftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiftId() {
        return shiftId;
    }

    /**
     * Sets the value of the shiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiftId(String value) {
        this.shiftId = value;
    }

    /**
     * Gets the value of the standardNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardNotification() {
        return standardNotification;
    }

    /**
     * Sets the value of the standardNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardNotification(String value) {
        this.standardNotification = value;
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
     * Gets the value of the subcontractorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubcontractorFlag() {
        return subcontractorFlag;
    }

    /**
     * Sets the value of the subcontractorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubcontractorFlag(Boolean value) {
        this.subcontractorFlag = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
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
     * Gets the value of the timeZoneTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneTranslation() {
        return timeZoneTranslation;
    }

    /**
     * Sets the value of the timeZoneTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneTranslation(String value) {
        this.timeZoneTranslation = value;
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
     * Gets the value of the timeSheetHoursApprovable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeSheetHoursApprovable() {
        return timeSheetHoursApprovable;
    }

    /**
     * Sets the value of the timeSheetHoursApprovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeSheetHoursApprovable(BigDecimal value) {
        this.timeSheetHoursApprovable = value;
    }

    /**
     * Gets the value of the userComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserComments() {
        return userComments;
    }

    /**
     * Sets the value of the userComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserComments(String value) {
        this.userComments = value;
    }

    /**
     * Gets the value of the userFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserFlag() {
        return userFlag;
    }

    /**
     * Sets the value of the userFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserFlag(Boolean value) {
        this.userFlag = value;
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
     * Gets the value of the webCollabUserNameChatbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebCollabUserNameChatbox() {
        return webCollabUserNameChatbox;
    }

    /**
     * Sets the value of the webCollabUserNameChatbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebCollabUserNameChatbox(String value) {
        this.webCollabUserNameChatbox = value;
    }

    /**
     * Gets the value of the webCollabUserNameToolbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebCollabUserNameToolbar() {
        return webCollabUserNameToolbar;
    }

    /**
     * Sets the value of the webCollabUserNameToolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebCollabUserNameToolbar(String value) {
        this.webCollabUserNameToolbar = value;
    }

    /**
     * Gets the value of the eTrainingDelegatedAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETrainingDelegatedAdmin() {
        return eTrainingDelegatedAdmin;
    }

    /**
     * Sets the value of the eTrainingDelegatedAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETrainingDelegatedAdmin(Boolean value) {
        this.eTrainingDelegatedAdmin = value;
    }

    /**
     * Gets the value of the listOfSSUserResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserResponsibilityData }
     *     
     */
    public ListOfSSUserResponsibilityData getListOfSSUserResponsibility() {
        return listOfSSUserResponsibility;
    }

    /**
     * Sets the value of the listOfSSUserResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserResponsibilityData }
     *     
     */
    public void setListOfSSUserResponsibility(ListOfSSUserResponsibilityData value) {
        this.listOfSSUserResponsibility = value;
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
