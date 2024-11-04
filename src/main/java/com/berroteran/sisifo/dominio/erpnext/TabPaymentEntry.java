package com.berroteran.sisifo.dominio.erpnext;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "`tabPayment Entry`", schema = "developer", indexes = {
        @Index(name = "modified", columnList = "modified"),
        @Index(name = "parent", columnList = "parent"),
        @Index(name = "party_type", columnList = "party_type"),
        @Index(name = "reference_date", columnList = "reference_date")
})
public class TabPaymentEntry {
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
    @Column(name = "naming_series", length = 140)
    private String namingSeries;

    @Size(max = 140)
    @Column(name = "payment_type", length = 140)
    private String paymentType;

    @Size(max = 140)
    @Column(name = "payment_order_status", length = 140)
    private String paymentOrderStatus;

    @Column(name = "posting_date")
    private LocalDate postingDate;

    @Size(max = 140)
    @Column(name = "company", length = 140)
    private String company;

    @Size(max = 140)
    @Column(name = "mode_of_payment", length = 140)
    private String modeOfPayment;

    @Size(max = 140)
    @Column(name = "party_type", length = 140)
    private String partyType;

    @Size(max = 140)
    @Column(name = "party", length = 140)
    private String party;

    @Size(max = 140)
    @Column(name = "party_name", length = 140)
    private String partyName;

    @Size(max = 140)
    @Column(name = "bank_account", length = 140)
    private String bankAccount;

    @Size(max = 140)
    @Column(name = "party_bank_account", length = 140)
    private String partyBankAccount;

    @Size(max = 140)
    @Column(name = "contact_person", length = 140)
    private String contactPerson;

    @Size(max = 140)
    @Column(name = "contact_email", length = 140)
    private String contactEmail;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "party_balance", nullable = false, precision = 21, scale = 9)
    private BigDecimal partyBalance;

    @Size(max = 140)
    @Column(name = "paid_from", length = 140)
    private String paidFrom;

    @Size(max = 140)
    @Column(name = "paid_from_account_type", length = 140)
    private String paidFromAccountType;

    @Size(max = 140)
    @Column(name = "paid_from_account_currency", length = 140)
    private String paidFromAccountCurrency;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "paid_from_account_balance", nullable = false, precision = 21, scale = 9)
    private BigDecimal paidFromAccountBalance;

    @Size(max = 140)
    @Column(name = "paid_to", length = 140)
    private String paidTo;

    @Size(max = 140)
    @Column(name = "paid_to_account_type", length = 140)
    private String paidToAccountType;

    @Size(max = 140)
    @Column(name = "paid_to_account_currency", length = 140)
    private String paidToAccountCurrency;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "paid_to_account_balance", nullable = false, precision = 21, scale = 9)
    private BigDecimal paidToAccountBalance;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "paid_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal paidAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "paid_amount_after_tax", nullable = false, precision = 21, scale = 9)
    private BigDecimal paidAmountAfterTax;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "source_exchange_rate", nullable = false, precision = 21, scale = 9)
    private BigDecimal sourceExchangeRate;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_paid_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal basePaidAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_paid_amount_after_tax", nullable = false, precision = 21, scale = 9)
    private BigDecimal basePaidAmountAfterTax;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "received_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal receivedAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "received_amount_after_tax", nullable = false, precision = 21, scale = 9)
    private BigDecimal receivedAmountAfterTax;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "target_exchange_rate", nullable = false, precision = 21, scale = 9)
    private BigDecimal targetExchangeRate;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_received_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal baseReceivedAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_received_amount_after_tax", nullable = false, precision = 21, scale = 9)
    private BigDecimal baseReceivedAmountAfterTax;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "total_allocated_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal totalAllocatedAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_total_allocated_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal baseTotalAllocatedAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "unallocated_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal unallocatedAmount;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "difference_amount", nullable = false, precision = 21, scale = 9)
    private BigDecimal differenceAmount;

    @Size(max = 140)
    @Column(name = "purchase_taxes_and_charges_template", length = 140)
    private String purchaseTaxesAndChargesTemplate;

    @Size(max = 140)
    @Column(name = "sales_taxes_and_charges_template", length = 140)
    private String salesTaxesAndChargesTemplate;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "apply_tax_withholding_amount", nullable = false)
    private Integer applyTaxWithholdingAmount;

    @Size(max = 140)
    @Column(name = "tax_withholding_category", length = 140)
    private String taxWithholdingCategory;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "base_total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    private BigDecimal baseTotalTaxesAndCharges;

    @NotNull
    @ColumnDefault("0.000000000")
    @Column(name = "total_taxes_and_charges", nullable = false, precision = 21, scale = 9)
    private BigDecimal totalTaxesAndCharges;

    @Size(max = 140)
    @Column(name = "reference_no", length = 140)
    private String referenceNo;

    @Column(name = "reference_date")
    private LocalDate referenceDate;

    @Column(name = "clearance_date")
    private LocalDate clearanceDate;

    @Size(max = 140)
    @Column(name = "project", length = 140)
    private String project;

    @Size(max = 140)
    @Column(name = "cost_center", length = 140)
    private String costCenter;

    @Size(max = 140)
    @ColumnDefault("'Draft'")
    @Column(name = "status", length = 140)
    private String status;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "custom_remarks", nullable = false)
    private Integer customRemarks;

    @Lob
    @Column(name = "remarks")
    private String remarks;

    @Size(max = 140)
    @Column(name = "letter_head", length = 140)
    private String letterHead;

    @Size(max = 140)
    @Column(name = "print_heading", length = 140)
    private String printHeading;

    @Size(max = 140)
    @Column(name = "bank", length = 140)
    private String bank;

    @Size(max = 140)
    @Column(name = "bank_account_no", length = 140)
    private String bankAccountNo;

    @Size(max = 140)
    @Column(name = "payment_order", length = 140)
    private String paymentOrder;

    @Size(max = 140)
    @Column(name = "auto_repeat", length = 140)
    private String autoRepeat;

    @Size(max = 140)
    @Column(name = "amended_from", length = 140)
    private String amendedFrom;

    @Size(max = 140)
    @Column(name = "title", length = 140)
    private String title;

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

    public String getNamingSeries() {
        return namingSeries;
    }

    public void setNamingSeries(String namingSeries) {
        this.namingSeries = namingSeries;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentOrderStatus() {
        return paymentOrderStatus;
    }

    public void setPaymentOrderStatus(String paymentOrderStatus) {
        this.paymentOrderStatus = paymentOrderStatus;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPartyBankAccount() {
        return partyBankAccount;
    }

    public void setPartyBankAccount(String partyBankAccount) {
        this.partyBankAccount = partyBankAccount;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public BigDecimal getPartyBalance() {
        return partyBalance;
    }

    public void setPartyBalance(BigDecimal partyBalance) {
        this.partyBalance = partyBalance;
    }

    public String getPaidFrom() {
        return paidFrom;
    }

    public void setPaidFrom(String paidFrom) {
        this.paidFrom = paidFrom;
    }

    public String getPaidFromAccountType() {
        return paidFromAccountType;
    }

    public void setPaidFromAccountType(String paidFromAccountType) {
        this.paidFromAccountType = paidFromAccountType;
    }

    public String getPaidFromAccountCurrency() {
        return paidFromAccountCurrency;
    }

    public void setPaidFromAccountCurrency(String paidFromAccountCurrency) {
        this.paidFromAccountCurrency = paidFromAccountCurrency;
    }

    public BigDecimal getPaidFromAccountBalance() {
        return paidFromAccountBalance;
    }

    public void setPaidFromAccountBalance(BigDecimal paidFromAccountBalance) {
        this.paidFromAccountBalance = paidFromAccountBalance;
    }

    public String getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(String paidTo) {
        this.paidTo = paidTo;
    }

    public String getPaidToAccountType() {
        return paidToAccountType;
    }

    public void setPaidToAccountType(String paidToAccountType) {
        this.paidToAccountType = paidToAccountType;
    }

    public String getPaidToAccountCurrency() {
        return paidToAccountCurrency;
    }

    public void setPaidToAccountCurrency(String paidToAccountCurrency) {
        this.paidToAccountCurrency = paidToAccountCurrency;
    }

    public BigDecimal getPaidToAccountBalance() {
        return paidToAccountBalance;
    }

    public void setPaidToAccountBalance(BigDecimal paidToAccountBalance) {
        this.paidToAccountBalance = paidToAccountBalance;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public BigDecimal getPaidAmountAfterTax() {
        return paidAmountAfterTax;
    }

    public void setPaidAmountAfterTax(BigDecimal paidAmountAfterTax) {
        this.paidAmountAfterTax = paidAmountAfterTax;
    }

    public BigDecimal getSourceExchangeRate() {
        return sourceExchangeRate;
    }

    public void setSourceExchangeRate(BigDecimal sourceExchangeRate) {
        this.sourceExchangeRate = sourceExchangeRate;
    }

    public BigDecimal getBasePaidAmount() {
        return basePaidAmount;
    }

    public void setBasePaidAmount(BigDecimal basePaidAmount) {
        this.basePaidAmount = basePaidAmount;
    }

    public BigDecimal getBasePaidAmountAfterTax() {
        return basePaidAmountAfterTax;
    }

    public void setBasePaidAmountAfterTax(BigDecimal basePaidAmountAfterTax) {
        this.basePaidAmountAfterTax = basePaidAmountAfterTax;
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public BigDecimal getReceivedAmountAfterTax() {
        return receivedAmountAfterTax;
    }

    public void setReceivedAmountAfterTax(BigDecimal receivedAmountAfterTax) {
        this.receivedAmountAfterTax = receivedAmountAfterTax;
    }

    public BigDecimal getTargetExchangeRate() {
        return targetExchangeRate;
    }

    public void setTargetExchangeRate(BigDecimal targetExchangeRate) {
        this.targetExchangeRate = targetExchangeRate;
    }

    public BigDecimal getBaseReceivedAmount() {
        return baseReceivedAmount;
    }

    public void setBaseReceivedAmount(BigDecimal baseReceivedAmount) {
        this.baseReceivedAmount = baseReceivedAmount;
    }

    public BigDecimal getBaseReceivedAmountAfterTax() {
        return baseReceivedAmountAfterTax;
    }

    public void setBaseReceivedAmountAfterTax(BigDecimal baseReceivedAmountAfterTax) {
        this.baseReceivedAmountAfterTax = baseReceivedAmountAfterTax;
    }

    public BigDecimal getTotalAllocatedAmount() {
        return totalAllocatedAmount;
    }

    public void setTotalAllocatedAmount(BigDecimal totalAllocatedAmount) {
        this.totalAllocatedAmount = totalAllocatedAmount;
    }

    public BigDecimal getBaseTotalAllocatedAmount() {
        return baseTotalAllocatedAmount;
    }

    public void setBaseTotalAllocatedAmount(BigDecimal baseTotalAllocatedAmount) {
        this.baseTotalAllocatedAmount = baseTotalAllocatedAmount;
    }

    public BigDecimal getUnallocatedAmount() {
        return unallocatedAmount;
    }

    public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
        this.unallocatedAmount = unallocatedAmount;
    }

    public BigDecimal getDifferenceAmount() {
        return differenceAmount;
    }

    public void setDifferenceAmount(BigDecimal differenceAmount) {
        this.differenceAmount = differenceAmount;
    }

    public String getPurchaseTaxesAndChargesTemplate() {
        return purchaseTaxesAndChargesTemplate;
    }

    public void setPurchaseTaxesAndChargesTemplate(String purchaseTaxesAndChargesTemplate) {
        this.purchaseTaxesAndChargesTemplate = purchaseTaxesAndChargesTemplate;
    }

    public String getSalesTaxesAndChargesTemplate() {
        return salesTaxesAndChargesTemplate;
    }

    public void setSalesTaxesAndChargesTemplate(String salesTaxesAndChargesTemplate) {
        this.salesTaxesAndChargesTemplate = salesTaxesAndChargesTemplate;
    }

    public Integer getApplyTaxWithholdingAmount() {
        return applyTaxWithholdingAmount;
    }

    public void setApplyTaxWithholdingAmount(Integer applyTaxWithholdingAmount) {
        this.applyTaxWithholdingAmount = applyTaxWithholdingAmount;
    }

    public String getTaxWithholdingCategory() {
        return taxWithholdingCategory;
    }

    public void setTaxWithholdingCategory(String taxWithholdingCategory) {
        this.taxWithholdingCategory = taxWithholdingCategory;
    }

    public BigDecimal getBaseTotalTaxesAndCharges() {
        return baseTotalTaxesAndCharges;
    }

    public void setBaseTotalTaxesAndCharges(BigDecimal baseTotalTaxesAndCharges) {
        this.baseTotalTaxesAndCharges = baseTotalTaxesAndCharges;
    }

    public BigDecimal getTotalTaxesAndCharges() {
        return totalTaxesAndCharges;
    }

    public void setTotalTaxesAndCharges(BigDecimal totalTaxesAndCharges) {
        this.totalTaxesAndCharges = totalTaxesAndCharges;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public LocalDate getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(LocalDate referenceDate) {
        this.referenceDate = referenceDate;
    }

    public LocalDate getClearanceDate() {
        return clearanceDate;
    }

    public void setClearanceDate(LocalDate clearanceDate) {
        this.clearanceDate = clearanceDate;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomRemarks() {
        return customRemarks;
    }

    public void setCustomRemarks(Integer customRemarks) {
        this.customRemarks = customRemarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLetterHead() {
        return letterHead;
    }

    public void setLetterHead(String letterHead) {
        this.letterHead = letterHead;
    }

    public String getPrintHeading() {
        return printHeading;
    }

    public void setPrintHeading(String printHeading) {
        this.printHeading = printHeading;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getPaymentOrder() {
        return paymentOrder;
    }

    public void setPaymentOrder(String paymentOrder) {
        this.paymentOrder = paymentOrder;
    }

    public String getAutoRepeat() {
        return autoRepeat;
    }

    public void setAutoRepeat(String autoRepeat) {
        this.autoRepeat = autoRepeat;
    }

    public String getAmendedFrom() {
        return amendedFrom;
    }

    public void setAmendedFrom(String amendedFrom) {
        this.amendedFrom = amendedFrom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
