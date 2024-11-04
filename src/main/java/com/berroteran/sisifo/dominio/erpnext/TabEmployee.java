package com.berroteran.sisifo.dominio.erpnext;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "tabEmployee", schema = "developer", indexes = {
        @Index(name = "modified", columnList = "modified"),
        @Index(name = "parent", columnList = "parent"),
        @Index(name = "status", columnList = "status"),
        @Index(name = "designation", columnList = "designation"),
        @Index(name = "lft_rgt_index", columnList = "lft, rgt")
}, uniqueConstraints = {
        @UniqueConstraint(name = "attendance_device_id", columnNames = {"attendance_device_id"})
})
public class TabEmployee {
    @Id
    @Size(max = 140)
    @Column(name = "name", nullable = false, length = 140)
    private String name;

    @Column(name = "creation")
    private Instant creation;

    @Column(name = "modified")
    private Instant modified;

    @Size(max = 140)
    @Column(name = "modified_by", length = 140)
    private String modifiedBy;

    @Size(max = 140)
    @Column(name = "owner", length = 140)
    private String owner;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "docstatus", nullable = false)
    private Integer docstatus;

    @Size(max = 140)
    @Column(name = "parent", length = 140)
    private String parent;

    @Size(max = 140)
    @Column(name = "parentfield", length = 140)
    private String parentfield;

    @Size(max = 140)
    @Column(name = "parenttype", length = 140)
    private String parenttype;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idx", nullable = false)
    private Integer idx;

    @Size(max = 140)
    @Column(name = "employee", length = 140)
    private String employee;

    @Size(max = 140)
    @Column(name = "naming_series", length = 140)
    private String namingSeries;

    @Size(max = 140)
    @Column(name = "first_name", length = 140)
    private String firstName;

    @Size(max = 140)
    @Column(name = "middle_name", length = 140)
    private String middleName;

    @Size(max = 140)
    @Column(name = "last_name", length = 140)
    private String lastName;

    @Size(max = 140)
    @Column(name = "salutation", length = 140)
    private String salutation;

    @Size(max = 140)
    @Column(name = "employee_name", length = 140)
    private String employeeName;

    @Size(max = 140)
    @Column(name = "employment_type", length = 140)
    private String employmentType;

    @Lob
    @Column(name = "image")
    private String image;

    @Size(max = 140)
    @Column(name = "company", length = 140)
    private String company;

    @Size(max = 140)
    @ColumnDefault("'Active'")
    @Column(name = "status", length = 140)
    private String status;

    @Size(max = 140)
    @Column(name = "gender", length = 140)
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;

    @Size(max = 140)
    @Column(name = "employee_number", length = 140)
    private String employeeNumber;

    @Size(max = 140)
    @Column(name = "person_to_be_contacted", length = 140)
    private String personToBeContacted;

    @Size(max = 140)
    @Column(name = "relation", length = 140)
    private String relation;

    @Size(max = 140)
    @Column(name = "emergency_phone_number", length = 140)
    private String emergencyPhoneNumber;

    @Size(max = 140)
    @Column(name = "user_id", length = 140)
    private String userId;

    @NotNull
    @ColumnDefault("1")
    @Column(name = "create_user_permission", nullable = false)
    private Integer createUserPermission;

    @Size(max = 140)
    @Column(name = "job_applicant", length = 140)
    private String jobApplicant;

    @Column(name = "scheduled_confirmation_date")
    private LocalDate scheduledConfirmationDate;

    @Column(name = "final_confirmation_date")
    private LocalDate finalConfirmationDate;

    @Column(name = "contract_end_date")
    private LocalDate contractEndDate;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "notice_number_of_days", nullable = false)
    private Integer noticeNumberOfDays;

    @Column(name = "date_of_retirement")
    private LocalDate dateOfRetirement;

    @Size(max = 140)
    @Column(name = "department", length = 140)
    private String department;

    @Size(max = 140)
    @Column(name = "designation", length = 140)
    private String designation;

    @Size(max = 140)
    @Column(name = "reports_to", length = 140)
    private String reportsTo;

    @Size(max = 140)
    @Column(name = "grade", length = 140)
    private String grade;

    @Size(max = 140)
    @Column(name = "branch", length = 140)
    private String branch;

    @Size(max = 140)
    @Column(name = "expense_approver", length = 140)
    private String expenseApprover;

    @Size(max = 140)
    @Column(name = "leave_approver", length = 140)
    private String leaveApprover;

    @Size(max = 140)
    @Column(name = "shift_request_approver", length = 140)
    private String shiftRequestApprover;

    @Size(max = 140)
    @Column(name = "attendance_device_id", length = 140)
    private String attendanceDeviceId;

    @Size(max = 140)
    @Column(name = "holiday_list", length = 140)
    private String holidayList;

    @Size(max = 140)
    @Column(name = "default_shift", length = 140)
    private String defaultShift;

    @Size(max = 140)
    @Column(name = "salary_mode", length = 140)
    private String salaryMode;

    @Size(max = 140)
    @Column(name = "payroll_cost_center", length = 140)
    private String payrollCostCenter;

    @Size(max = 140)
    @Column(name = "bank_name", length = 140)
    private String bankName;

    @Size(max = 140)
    @Column(name = "bank_ac_no", length = 140)
    private String bankAcNo;

    @Size(max = 140)
    @Column(name = "health_insurance_provider", length = 140)
    private String healthInsuranceProvider;

    @Size(max = 140)
    @Column(name = "health_insurance_no", length = 140)
    private String healthInsuranceNo;

    @Size(max = 140)
    @Column(name = "cell_number", length = 140)
    private String cellNumber;

    @Size(max = 140)
    @Column(name = "prefered_email", length = 140)
    private String preferedEmail;

    @Size(max = 140)
    @Column(name = "personal_email", length = 140)
    private String personalEmail;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "unsubscribed", nullable = false)
    private Integer unsubscribed;

    @Size(max = 140)
    @Column(name = "permanent_accommodation_type", length = 140)
    private String permanentAccommodationType;

    @Lob
    @Column(name = "permanent_address")
    private String permanentAddress;

    @Size(max = 140)
    @Column(name = "prefered_contact_email", length = 140)
    private String preferedContactEmail;

    @Size(max = 140)
    @Column(name = "company_email", length = 140)
    private String companyEmail;

    @Size(max = 140)
    @Column(name = "current_accommodation_type", length = 140)
    private String currentAccommodationType;

    @Lob
    @Column(name = "current_address")
    private String currentAddress;

    @Lob
    @Column(name = "bio")
    private String bio;

    @Size(max = 140)
    @Column(name = "passport_number", length = 140)
    private String passportNumber;

    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @Column(name = "valid_upto")
    private LocalDate validUpto;

    @Size(max = 140)
    @Column(name = "place_of_issue", length = 140)
    private String placeOfIssue;

    @Size(max = 140)
    @Column(name = "marital_status", length = 140)
    private String maritalStatus;

    @Size(max = 140)
    @Column(name = "blood_group", length = 140)
    private String bloodGroup;

    @Lob
    @Column(name = "family_background")
    private String familyBackground;

    @Lob
    @Column(name = "health_details")
    private String healthDetails;

    @Column(name = "resignation_letter_date")
    private LocalDate resignationLetterDate;

    @Column(name = "relieving_date")
    private LocalDate relievingDate;

    @Lob
    @Column(name = "reason_for_leaving")
    private String reasonForLeaving;

    @Size(max = 140)
    @Column(name = "leave_encashed", length = 140)
    private String leaveEncashed;

    @Column(name = "encashment_date")
    private LocalDate encashmentDate;

    @Column(name = "held_on")
    private LocalDate heldOn;

    @Size(max = 140)
    @Column(name = "new_workplace", length = 140)
    private String newWorkplace;

    @Lob
    @Column(name = "feedback")
    private String feedback;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "lft", nullable = false)
    private Integer lft;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "rgt", nullable = false)
    private Integer rgt;

    @Size(max = 140)
    @Column(name = "old_parent", length = 140)
    private String oldParent;

    @Lob
    @Column(name = "_user_tags")
    private String userTags;

    @Lob
    @Column(name = "_comments")
    private String comments;

    @Lob
    @Column(name = "_assign")
    private String assign;

    @Lob
    @Column(name = "_liked_by")
    private String likedBy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreation() {
        return creation;
    }

    public void setCreation(Instant creation) {
        this.creation = creation;
    }

    public Instant getModified() {
        return modified;
    }

    public void setModified(Instant modified) {
        this.modified = modified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getDocstatus() {
        return docstatus;
    }

    public void setDocstatus(Integer docstatus) {
        this.docstatus = docstatus;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParentfield() {
        return parentfield;
    }

    public void setParentfield(String parentfield) {
        this.parentfield = parentfield;
    }

    public String getParenttype() {
        return parenttype;
    }

    public void setParenttype(String parenttype) {
        this.parenttype = parenttype;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getNamingSeries() {
        return namingSeries;
    }

    public void setNamingSeries(String namingSeries) {
        this.namingSeries = namingSeries;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPersonToBeContacted() {
        return personToBeContacted;
    }

    public void setPersonToBeContacted(String personToBeContacted) {
        this.personToBeContacted = personToBeContacted;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCreateUserPermission() {
        return createUserPermission;
    }

    public void setCreateUserPermission(Integer createUserPermission) {
        this.createUserPermission = createUserPermission;
    }

    public String getJobApplicant() {
        return jobApplicant;
    }

    public void setJobApplicant(String jobApplicant) {
        this.jobApplicant = jobApplicant;
    }

    public LocalDate getScheduledConfirmationDate() {
        return scheduledConfirmationDate;
    }

    public void setScheduledConfirmationDate(LocalDate scheduledConfirmationDate) {
        this.scheduledConfirmationDate = scheduledConfirmationDate;
    }

    public LocalDate getFinalConfirmationDate() {
        return finalConfirmationDate;
    }

    public void setFinalConfirmationDate(LocalDate finalConfirmationDate) {
        this.finalConfirmationDate = finalConfirmationDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Integer getNoticeNumberOfDays() {
        return noticeNumberOfDays;
    }

    public void setNoticeNumberOfDays(Integer noticeNumberOfDays) {
        this.noticeNumberOfDays = noticeNumberOfDays;
    }

    public LocalDate getDateOfRetirement() {
        return dateOfRetirement;
    }

    public void setDateOfRetirement(LocalDate dateOfRetirement) {
        this.dateOfRetirement = dateOfRetirement;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getExpenseApprover() {
        return expenseApprover;
    }

    public void setExpenseApprover(String expenseApprover) {
        this.expenseApprover = expenseApprover;
    }

    public String getLeaveApprover() {
        return leaveApprover;
    }

    public void setLeaveApprover(String leaveApprover) {
        this.leaveApprover = leaveApprover;
    }

    public String getShiftRequestApprover() {
        return shiftRequestApprover;
    }

    public void setShiftRequestApprover(String shiftRequestApprover) {
        this.shiftRequestApprover = shiftRequestApprover;
    }

    public String getAttendanceDeviceId() {
        return attendanceDeviceId;
    }

    public void setAttendanceDeviceId(String attendanceDeviceId) {
        this.attendanceDeviceId = attendanceDeviceId;
    }

    public String getHolidayList() {
        return holidayList;
    }

    public void setHolidayList(String holidayList) {
        this.holidayList = holidayList;
    }

    public String getDefaultShift() {
        return defaultShift;
    }

    public void setDefaultShift(String defaultShift) {
        this.defaultShift = defaultShift;
    }

    public String getSalaryMode() {
        return salaryMode;
    }

    public void setSalaryMode(String salaryMode) {
        this.salaryMode = salaryMode;
    }

    public String getPayrollCostCenter() {
        return payrollCostCenter;
    }

    public void setPayrollCostCenter(String payrollCostCenter) {
        this.payrollCostCenter = payrollCostCenter;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAcNo() {
        return bankAcNo;
    }

    public void setBankAcNo(String bankAcNo) {
        this.bankAcNo = bankAcNo;
    }

    public String getHealthInsuranceProvider() {
        return healthInsuranceProvider;
    }

    public void setHealthInsuranceProvider(String healthInsuranceProvider) {
        this.healthInsuranceProvider = healthInsuranceProvider;
    }

    public String getHealthInsuranceNo() {
        return healthInsuranceNo;
    }

    public void setHealthInsuranceNo(String healthInsuranceNo) {
        this.healthInsuranceNo = healthInsuranceNo;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getPreferedEmail() {
        return preferedEmail;
    }

    public void setPreferedEmail(String preferedEmail) {
        this.preferedEmail = preferedEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public Integer getUnsubscribed() {
        return unsubscribed;
    }

    public void setUnsubscribed(Integer unsubscribed) {
        this.unsubscribed = unsubscribed;
    }

    public String getPermanentAccommodationType() {
        return permanentAccommodationType;
    }

    public void setPermanentAccommodationType(String permanentAccommodationType) {
        this.permanentAccommodationType = permanentAccommodationType;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPreferedContactEmail() {
        return preferedContactEmail;
    }

    public void setPreferedContactEmail(String preferedContactEmail) {
        this.preferedContactEmail = preferedContactEmail;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCurrentAccommodationType() {
        return currentAccommodationType;
    }

    public void setCurrentAccommodationType(String currentAccommodationType) {
        this.currentAccommodationType = currentAccommodationType;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getValidUpto() {
        return validUpto;
    }

    public void setValidUpto(LocalDate validUpto) {
        this.validUpto = validUpto;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getFamilyBackground() {
        return familyBackground;
    }

    public void setFamilyBackground(String familyBackground) {
        this.familyBackground = familyBackground;
    }

    public String getHealthDetails() {
        return healthDetails;
    }

    public void setHealthDetails(String healthDetails) {
        this.healthDetails = healthDetails;
    }

    public LocalDate getResignationLetterDate() {
        return resignationLetterDate;
    }

    public void setResignationLetterDate(LocalDate resignationLetterDate) {
        this.resignationLetterDate = resignationLetterDate;
    }

    public LocalDate getRelievingDate() {
        return relievingDate;
    }

    public void setRelievingDate(LocalDate relievingDate) {
        this.relievingDate = relievingDate;
    }

    public String getReasonForLeaving() {
        return reasonForLeaving;
    }

    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }

    public String getLeaveEncashed() {
        return leaveEncashed;
    }

    public void setLeaveEncashed(String leaveEncashed) {
        this.leaveEncashed = leaveEncashed;
    }

    public LocalDate getEncashmentDate() {
        return encashmentDate;
    }

    public void setEncashmentDate(LocalDate encashmentDate) {
        this.encashmentDate = encashmentDate;
    }

    public LocalDate getHeldOn() {
        return heldOn;
    }

    public void setHeldOn(LocalDate heldOn) {
        this.heldOn = heldOn;
    }

    public String getNewWorkplace() {
        return newWorkplace;
    }

    public void setNewWorkplace(String newWorkplace) {
        this.newWorkplace = newWorkplace;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    public String getOldParent() {
        return oldParent;
    }

    public void setOldParent(String oldParent) {
        this.oldParent = oldParent;
    }

    public String getUserTags() {
        return userTags;
    }

    public void setUserTags(String userTags) {
        this.userTags = userTags;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(String likedBy) {
        this.likedBy = likedBy;
    }

}
