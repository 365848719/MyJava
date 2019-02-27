package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "dw_bill")
@Entity
public class Bill {

    @Column(name = "hisId")
    private String hisId;

    @Column(name = "bill_date")
    private Date billDate;

    @Column(name = "hospital_id")
    private String hospitalId;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "table_par")
    private String tablePar;

    /// <summary>
    /// 费用发生医院编码
    /// </summary>
    @Column(name = "HOSPITAL_FEE_ID")
    private String HospitalFeeId;
    public String getHospitalFeeId() {
        return HospitalFeeId;
    }
    public void setHospitalFeeId(String hospitalFeeId) {
        HospitalFeeId = hospitalFeeId;
    }

    /// <summary>
    /// 费用发生医院名称
    /// </summary>
    @Column(name = "HOSPITAL_FEE_NAME")
    private String hospitalFeeName;

    /// <summary>
    /// 转外医院名称
    /// </summary>
    @Column(name = "HOSPITAL_OUT_NAME")
    private String HospitalOutName;

    /// <summary>
    /// 参保人编码（外键，对应参保人字典）
    /// </summary>
    @Column(name = "PATIENT_ID")
    private String PatientId;

    /// <summary>
    /// 参保人姓名
    /// </summary>
    @Column(name = "PATIENT_NAME")
    public String PatientName;

    /// <summary>
    /// 性别
    /// </summary>
    @Column(name = "PATIENT_SEX")
    public String PatientSex;

    /// <summary>
    /// 出生日期
    /// </summary>
    @Column(name = "PATIENT_BIRTH")
    public Date PatientBirth;

    /// <summary>
    /// 人员类别（外键，对应人员类别字典）
    /// </summary>
    @Column(name = "BENEFIT_GROUP_ID")
    public String BenefitGroupId;

    /// <summary>
    /// 就医方式（外键，对应就诊类型字典）
    /// </summary>
    @Column(name = "CLAIM_TYPE")
    public String ClaimType;

    /// <summary>
    /// 是否异地就医（0：否1：是）
    /// </summary>
    @Column(name = "UNUSUAL_FLAG")
    private String UnusualFlag;

    /// <summary>
    /// 入院诊断（外键，对应疾病字典 门诊：主要诊断；住院：入院诊断）
    /// </summary>
    @Column(name = "ADMISSION_DISEASE_ID")
    private String AdmissionDiseaseId;

    /// <summary>
    /// 入院诊断名称
    /// </summary>
    @Column(name = "ADMISSION_DISEASE_NAME")
    private String AdmissionDiseaseName;

    /// <summary>
    /// 出院诊断（门诊：次要诊断；住院：出院诊断）
    /// </summary>
    @Column(name = "DISCHARGE_DISEASE_ID")
    private String DischargeDiseaseId;

    /// <summary>
    /// 出院诊断名称
    /// </summary>
    @Column(name = "DISCHARGE_DISEASE_NAME")
    private String DischargeDiseaseName;

    /// <summary>
    /// 出院原因
    /// </summary>
    @Column(name = "DISCHARGE_REASON")
    private String DischargeReason;

    /// <summary>
    /// 诊断编码一（门急诊或住院第一副诊断）
    /// </summary>
    @Column(name = "DISEASE_ID")
    private String DiseaseId;

    /// <summary>
    /// 诊断编码一名称
    /// </summary>
    @Column(name = "DISEASE_NAME")
    private String DiseaseName;

    /// <summary>
    /// 诊断编码二（门急诊或住院第二副诊断）
    /// </summary>
    @Column(name = "SECOND_DISEASE_ID")
    private String SecondDiseaseId;

    /// <summary>
    /// 诊断编码二名称
    /// </summary>
    @Column(name = "SECOND_DISEASE_NAME")
    private String SecondDiseaseName;

    /// <summary>
    /// 诊断编码三（门急诊或住院第三副诊断）
    /// </summary>
    @Column(name = "THIRD_DISEASE_ID")
    private String ThirdDiseaseId;

    /// <summary>
    /// 诊断编码三名称
    /// </summary>
    @Column(name = "THIRD_DISEASE_NAME")
    private String ThirdDiseaseName;

    /// <summary>
    /// 入院时间
    /// </summary>
    @Column(name = "ADMISSION_DATE")
    private Date AdmissionDate;

    /// <summary>
    /// 出院时间
    /// </summary>
    @Column(name = "DISCHARGE_DATE")
    private Date DischargeDate;

    /// <summary>
    /// 就诊时间（门急诊为就诊时间，住院为入院时间）
    /// </summary>
    @Column(name = "FIRST_DATE")
    private Date FirstDate;

    /// <summary>
    /// 是否特病慢病单据标志
    /// </summary>
    @Column(name = "DISEASE_TYPE")
    private String DiseaseType;

    /// <summary>
    /// 慢病特病代码（如果单据为慢病特病单据，需提供该代码或能够从诊断编码找到对应的慢病特病）
    /// </summary>
    @Column(name = "SPECIAL_DISEASE_CODE")
    private String SpecialDiseaseCode;

    /// <summary>
    /// 是否怀孕（Y表示怀孕；N表示非怀孕，空表示未知）
    /// </summary>
    @Column(name = "PATIENT_PREGNANT")
    private String PatientPregnant;

    /// <summary>
    /// 是否哺乳期（Y表示哺乳期；N表示非哺乳期，空表示未知）
    /// </summary>
    @Column(name = "PATIENT_LACTATING")
    private String PatientLactating;

    /// <summary>
    /// 身高(cm)---空表示未知
    /// </summary>
    @Column(name = "PATIENT_HEIGHT")
    private String PatientHeight;

    /// <summary>
    /// 体重(kg)--空表示未知
    /// </summary>
    @Column(name = "PATIENT_WEIGHT")
    private String PatientWeight;

    /// <summary>
    /// 是否转入院（0：否1：是）
    /// </summary>
    @Column(name = "IN_PATIENT_TRANSFER_FLAG")
    private String InPatientTransferFlag;

    /// <summary>
    /// 收费单据号
    /// </summary>
    @Column(name = "BILL_NO")
    private String BillNo;

    /// <summary>
    /// 医保审核医保中心代码（外键，对应医保中心字典）
    /// </summary>
    @Column(name = "BMI_CODE")
    private String BmiCode;

    /// <summary>
    /// 单据总金额（申报值）
    /// </summary>
    @Column(name = "TOTAL_AMOUNT")
    private float TotalAmount;

    /// <summary>
    /// 医保内总金额（申报值）--所有单据明细医保内金额的加和
    /// </summary>
    @Column(name = "BMI_CONVERED_AMOUNT")
    private float BmiConveredAmount;

    /// <summary>
    /// 医保拒付金额（终审完成时更新）
    /// </summary>
    @Column(name = "BMI_NOPAY")
    private float BmiNoPay;

    /// <summary>
    /// 自动审核状态（0：ETL数据处理中1：已审核，2等待系统审核，默认0）
    /// </summary>
    @Column(name = "AUDIT_AUTO_STATUS")
    private String AuditAutoStatus;

    /// <summary>
    /// 自动审核时间
    /// </summary>
    @Column(name = "AUDIT_AUTO_DATE")
    private Date AuditAutoDate;

    /// <summary>
    /// 自动审核结果违规（默认0，0非1是）
    /// </summary>
    @Column(name = "AUDIT_RESULT_1")
    private String AuditResultLllegal;


    /// <summary>
    /// 自动审核结果待核实（默认0，0非1是）
    /// </summary>
    @Column(name = "AUDIT_RESULT_2")
    private String AuditResultVerified;

    /// <summary>
    /// 自动审核结果可疑（默认0，0非1是）
    /// </summary>
    @Column(name = "AUDIT_RESULT_3")
    private String AuditResultSuspicious;

    /// <summary>
    /// 引擎审核结果（默认0，1：正常2：待查）
    /// </summary>
    @Column(name = "AUDIT_RESULT_E")
    private String AuditResultE;

    /// <summary>
    /// 初审结果（默认0，1：正常3：违规）
    /// </summary>
    @Column(name = "AUDIT_RESULT_F")
    private String AuditResultF;

    /// <summary>
    /// 复审结果（默认0，1：正常3：违规）
    /// </summary>
    @Column(name = "AUDIT_RESULT_S")
    private String AuditResultS;

    /// <summary>
    /// 终审结果（默认0，1：正常3：违规）
    /// </summary>
    @Column(name = "AUDIT_RESULT_L")
    private String AuditResultL;

    /// <summary>
    /// 初审意见
    /// </summary>
    @Column(name = "AUDIT_COMMENT_F")
    private String AuditCommentF;

    /// <summary>
    /// 复审意见
    /// </summary>
    @Column(name = "AUDIT_COMMENT_S")
    private String AuditCommentS;

    /// <summary>
    /// 终审意见
    /// </summary>
    @Column(name = "AUDIT_COMMENT_L")
    private String AuditCommentL;

    /// <summary>
    /// 人工审核时间
    /// </summary>
    @Column(name = "ANDIT_MANU_DATE")
    private Date AnditManuDate;

    /// <summary>
    /// 是否医生责任（默认 0 ， 是1 否 0（三个审核状态公用））
    /// </summary>
    @Column(name = "DUTY_IS_DOCTOR")
    private String DutyIsDoctor;

    /// <summary>
    /// 医生编号（如果医生责任为0，该字段为空，如果为1，该字段必须填写。）
    /// </summary>
    @Column(name = "DOCTOR_ID")
    private String DoctorId;

    /// <summary>
    /// 是否患者责任（默认 0 ， 是1 否 0）
    /// </summary>
    @Column(name = "DUTY_IS_PATIENT")
    private String DutyIsPatient;

    /// <summary>
    /// 是否医院责任（默认 0 ， 是1 否 0）
    /// </summary>
    @Column(name = "DUTY_IS_HOSPITAL")
    private String DutyIsHospital;

    /// <summary>
    /// 是否定点机构说明标识（默认 0 ， 是1 否 0）
    /// </summary>
    @Column(name = "IS_HOSPITAL_REMARK")
    private String IsHospitalRemark;

    /// <summary>
    /// 定点机构说明
    /// </summary>
    @Column(name = "HOSPITAL_REMARK")
    private String HospitalRemark;

    /// <summary>
    /// 读取状态（0：未阅读1：已阅读）
    /// </summary>
    @Column(name = "READ_FLAG")
    private String ReadFlag;

    /// <summary>
    /// 分类抽取标志（0-9，有存储过程自动生成，暂冗余）
    /// </summary>
    @Column(name = "ETL_FLAG")
    private String EtlFlag;

    /// <summary>
    /// 标志（I：insert，U：update，D：delete）
    /// </summary>
    @Column(name = "FLAG")
    private String Flag;

    /// <summary>
    /// 装载时间
    /// </summary>
    @Column(name = "LOAD_DATE")
    private Date LoadDate;

    /// <summary>
    /// 主键
    /// </summary>
    @Column(name = "ID")
    private String BillId;

    /// <summary>
    /// 定点机构申诉状态（0：未反馈  1：反馈中  2：已反馈（第一次反馈完成）  3：重新反馈  4：同意扣款  5：已反馈（重新反馈））
    /// </summary>
    @Column(name = "HOSPITAL_COMPLAIN_STATUS")
    private String HospitalComplainStatus;

    /// <summary>
    /// 参保类型（对应参保类型表）
    /// </summary>
    @Column(name = "BENEFIT_TYPE")
    private String BenefitType;

    /// <summary>
    /// 异地人员类别
    /// </summary>
    @Column(name = "YD_BENEFIT_GROUP_NAME")
    private String YdBenefitGroupName;

    /// <summary>
    /// 异地参保地行政区域代码
    /// </summary>
    @Column(name = "YD_BENEFIT_REGION")
    private String YdBenefitRegion;

    /// <summary>
    /// 参保人社保卡号
    /// </summary>
    @Column(name = "BMINO")
    private String Bmino;

    /// <summary>
    /// 参保人身份证号
    /// </summary>
    @Column(name = "ID_NUMBER")
    public String IdNumber;

    /// <summary>
    /// 规则组
    /// </summary>
    @Column(name = "RULE_BIT")
    private double RuleBit;

    /// <summary>
    /// 交易流水号
    /// </summary>
    @Column(name = "TRADE_NO")
    private String TradeNo;

    /// <summary>
    /// 诊断编码四
    /// </summary>
    @Column(name = "DIAGNOSIS_FOUR")
    private String DiagnosisFour;

    /// <summary>
    /// 诊断编码四名称
    /// </summary>
    @Column(name = "DIAGNOSIS_FOUR_NAME")
    private String DiagnosisFourName;

    /// <summary>
    /// 诊断编码五
    /// </summary>
    @Column(name = "DIAGNOSIS_FIVE")
    private String DiagnosisFive;

    /// <summary>
    /// 诊断编码五名称
    /// </summary>
    @Column(name = "DIAGNOSIS_FIVE_NAME")
    private String DiagnosisFiveName;

    /// <summary>
    /// 诊断编码六
    /// </summary>
    @Column(name = "DIAGNOSIS_SIX")
    private String DiagnosisSix;

    /// <summary>
    /// 诊断编码六名称
    /// </summary>
    @Column(name = "DIAGNOSIS_SIX_NAME")
    private String DiagnosisSixName;

    /// <summary>
    /// 诊断编码七
    /// </summary>
    @Column(name = "DIAGNOSIS_SEVEN")
    private String DiagnosisSeven;

    /// <summary>
    /// 诊断编码七名称
    /// </summary>
    @Column(name = "DIAGNOSIS_SEVEN_NAME")
    private String DiagnosisSevenName;

    /// <summary>
    /// 诊断编码八
    /// </summary>
    @Column(name = "DIAGNOSIS_EIGHT")
    private String DiagnosisEight;

    /// <summary>
    /// 诊断编码八名称
    /// </summary>
    @Column(name = "DIAGNOSIS_EIGHT_NAME")
    private String DiagnosisEightName;

    /// <summary>
    /// 诊断编码九
    /// </summary>
    @Column(name = "DIAGNOSIS_NINE")
    private String DiagnosisNine;

    /// <summary>
    /// 诊断编码九名称
    /// </summary>
    @Column(name = "DIAGNOSIS_NINE_NAME")
    private String DiagnosisNineName;

    /// <summary>
    /// 诊断编码十
    /// </summary>
    @Column(name = "DIAGNOSIS_TEN")
    private String DiagnosisTen;

    /// <summary>
    /// 诊断编码十名称
    /// </summary>
    @Column(name = "DIAGNOSIS_TEN_NAME")
    private String DiagnosisTenName;

    /// <summary>
    /// 诊断编码十一
    /// </summary>
    @Column(name = "DIAGNOSIS_ELEVEN")
    private String DiagnosisEleven;

    /// <summary>
    /// 诊断编码十一名称
    /// </summary>
    @Column(name = "DIAGNOSIS_ELEVEN_NAME")
    private String DiagnosisElevenName;

    /// <summary>
    /// 诊断编码十二
    /// </summary>
    @Column(name = "DIAGNOSIS_TWELVE")
    private String DiagnosisTwelve;

    /// <summary>
    /// 诊断编码十二名称
    /// </summary>
    @Column(name = "DIAGNOSIS_TWELVE_NAME")
    private String DiagnosisTwelveName;

    /// <summary>
    /// 诊断编码十三
    /// </summary>
    @Column(name = "DIAGNOSIS_THIRTEEN")
    private String DiagnosisThirteen;

    /// <summary>
    /// 诊断编码十三名称
    /// </summary>
    @Column(name = "DIAGNOSIS_THIRTEEN_NAME")
    private String DiagnosisThirteenName;

    /// <summary>
    /// 诊断编码十四
    /// </summary>
    @Column(name = "DIAGNOSIS_FOURTEEN")
    private String DiagnosisFourteen;

    /// <summary>
    /// 诊断编码十四名称
    /// </summary>
    @Column(name = "DIAGNOSIS_FOURTEEN_NAME")
    private String DiagnosisFourteenName;

    /// <summary>
    /// 诊断编码十五
    /// </summary>
    @Column(name = "DIAGNOSIS_FIFTEEN")
    private String DiagnosisFifteen;

    /// <summary>
    /// 诊断编码十五名称
    /// </summary>
    @Column(name = "DIAGNOSIS_FIFTEEN_NAME")
    private String DiagnosisFifteenName;

    /// <summary>
    /// 诊断编码十六
    /// </summary>
    @Column(name = "DIAGNOSIS_SIXTEEN")
    private String DiagnosisSixteen;

    /// <summary>
    /// 诊断编码十六名称
    /// </summary>
    @Column(name = "DIAGNOSIS_SIXTEEN_NAME")
    private String DiagnosisSixteenName;

    /// <summary>
    /// 保健类别（0  否1  一级副省级2  一级副市级3  二级副厅级4  三级副局级5  二级适当提高6  二级正师级）
    /// </summary>
    @Column(name = "HEALTH_CLASS")
    private String HealthClass;

    /// <summary>
    /// 反馈附件数
    /// </summary>
    @Column(name = "HOSPITAL_FILES")
    private int HospitalFiles;

    /// <summary>
    /// 住院号（门诊号）
    /// </summary>
    @Column(name = "ADMISSION_NUMBER")
    private String AdmissionNumber;

    /// <summary>
    /// 规定病种名称
    /// </summary>
    @Column(name = "SPECIFIED_DISEASES")
    private String SpecifiedDiseases;

    /// <summary>
    /// 主单规则反馈内容
    /// </summary>
    @Column(name = "AUDIT_COMMENT_REMARK")
    private String AuditCommentRemark;

    /// <summary>
    /// 主单规则反馈次数
    /// </summary>
    @Column(name = "HOSPITAL_BACKS")
    private int HospitalBacks;

    /// <summary>
    /// 单据扣款类型； 0:明细扣款，1:主单扣款；默认0
    /// </summary>
    @Column(name = "RULE_TYPE")
    private String RuleType;

    /// <summary>
    /// 是否为重新反馈,0：否1：是
    /// </summary>
    @Column(name = "IS_RETRICK")
    private String IsRetrick;

    /// <summary>
    /// 反馈进度：0：未反馈 1：反馈中 2：反馈完成
    /// </summary>
    @Column(name = "TRICK_STATE")
    private String TrickState;

    /// <summary>
    /// 是否同意扣款：0：非同意扣款 1：同意扣款
    /// </summary>
    @Column(name = "IS_APPROVAL")
    private String IsApproval;

    /// <summary>
    /// 意见书编码
    /// </summary>
    @Column(name = "SID")
    private String SId;

    /// <summary>
    /// 审核类型
    /// </summary>
    @Column(name = "AUDIT_TYPE_BIT")
    private int AuditTypeBit;
    
    @Column(name = "benefitGroupName")
    private String BenefitGroupName;
    
    @Column(name = "number01")
    private double Number01;

    @Column(name = "number02")
    private double Number02;

    @Column(name = "number03")
    private double Number03;

    @Column(name = "number04")
    private double Number04;

   

    @Column(name = "number05")
    private double Number05;

   

    @Column(name = "number06")
    private double Number06;


    @Column(name = "number07")
    private double Number07;

    @Column(name = "number08")
    private double Number08;

    @Column(name = "number09")
    private double Number09;

    @Column(name = "varchar01")
    private String Varchar01;

    @Column(name = "varchar02")
    private String Varchar02;

    @Column(name = "varchar03")
    private String Varchar03;

    @Column(name = "varchar04")
    private String Varchar04;

    @Column(name = "FILE_COUNT")
    private String FileCount;

    /// <summary>
    /// 扣款规则RuleBit
    /// </summary>
    @Column(name = "REJECT_RULE_BIT")
    private double RejectRuleBit;

    /// <summary>
    /// 退回状态
    /// </summary>
    @Column(name = "back_status")
    private String BackStatus;

    /// <summary>
    /// 是否进行了drgs规则扣款 ‘1’:是
    /// </summary>
    @Column(name = "drgs_reject")
    private String DrgsReject;

    /// <summary>
    /// drgs规则扣除原因
    /// </summary>
    @Column(name = "drgs_reject_reson")
    private String DrgsRejectReason;

    /// <summary>
    /// drgs规则还款原因
    /// </summary>
    @Column(name = "drgs_back_reson")
    private String DrgsBackReason;

    /// <summary>
    /// drgs规则意见书ID
    /// </summary>
    @Column(name = "drgs_sid")
    private String DrgsSId;

    /// <summary>
    /// 主单扣款金额
    /// </summary>
    @Column(name = "BILL_NOPAY")
    private double BillNoPay;

    /// <summary>
    /// 明细扣款总金额
    /// </summary>
    @Column(name = "DETAIL_NOPAY")
    private double DetailNoPay;

    /// <summary>
    /// 主单反馈说明详情
    /// </summary>
    @Column(name = "HOSPITAL_REMARK_CONTENT")
    private String HospitalRemarkContent;

    /// <summary>
    /// 单据重新反馈理由
    /// </summary>
    @Column(name = "REFEEDBACK_REASON")
    private String RefeedbackReason;

    /// <summary>
    /// 单款重新反馈理由详情
    /// </summary>
    @Column(name = "REFEEDBACK_REASON_CONTENT")
    private String RefeedbackReasonContent;

    /// <summary>
    /// 单据反馈进度
    /// </summary>
    @Column(name = "BMI_TRICK_STATE")
    private String BmiTrickState;

    /// <summary>
    /// 单据是否重新反馈
    /// </summary>
    @Column(name = "BMI_IS_RETRICK")
    private String BmiIsRetrick;

    /// <summary>
    /// 主单扣除原因
    /// </summary>
    @Column(name = "REJECT_REASON")
    private String RejectReason;

    /// <summary>
    /// 主单还款原因
    /// </summary>
    @Column(name = "BACK_REASON")
    private String BackReason;

    /// <summary>
    /// 主单扣款人
    /// </summary>
    @Column(name = "REJECT_PERSON")
    private String RejectPerson;

    /// <summary>
    /// 主单扣款日期
    /// </summary>
    @Column(name = "REJECT_DATETIME")
    private Date RejectDateTime;

    /// <summary>
    /// 扣款金额(写日志时使用)
    /// </summary>
    private double RepayMoney;

    /// <summary>
    /// （开启“保留初次反馈内容”配置）主单的再次反馈说明概要
    /// </summary>
    @Column(name = "reaudit_comment_remark")
    private String ReauditCommentRemark;

    /// <summary>
    /// （开启“保留初次反馈内容”配置）主单的再次反馈说明详情
    /// </summary>
    @Column(name = "REAUDIT_COMMENT_REMARK_CONTENT")
    private String ReauditCommentRemarkContent;

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getTablePar() {
        return tablePar;
    }

    public void setTablePar(String tablePar) {
        this.tablePar = tablePar;
    }

    public Date getPatientBirth() {
        return PatientBirth;
    }

    public String getHospitalFeeName() {
        return hospitalFeeName;
    }

    public float getBmiNoPay() {
        return BmiNoPay;
    }

    public Date getAdmissionDate() {
        return AdmissionDate;
    }

    public String getHospitalOutName() {
        return HospitalOutName;
    }

    public Date getAnditManuDate() {
        return AnditManuDate;
    }

    public Date getAuditAutoDate() {
        return AuditAutoDate;
    }

    public Date getDischargeDate() {
        return DischargeDate;
    }

    public Date getFirstDate() {
        return FirstDate;
    }

    public float getBmiConveredAmount() {
        return BmiConveredAmount;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public String getAdmissionDiseaseId() {
        return AdmissionDiseaseId;
    }

    public String getAdmissionDiseaseName() {
        return AdmissionDiseaseName;
    }

    public String getAuditAutoStatus() {
        return AuditAutoStatus;
    }

    public String getAuditCommentF() {
        return AuditCommentF;
    }

    public String getBenefitGroupId() {
        return BenefitGroupId;
    }

    public String getPatientId() {
        return PatientId;
    }

    public Date getLoadDate() {
        return LoadDate;
    }

    public String getAuditCommentL() {
        return AuditCommentL;
    }

    public String getAuditResultF() {
        return AuditResultF;
    }

    public String getAuditCommentS() {
        return AuditCommentS;
    }

    public String getClaimType() {
        return ClaimType;
    }

    public String getAuditResultE() {
        return AuditResultE;
    }

    public String getAuditResultL() {
        return AuditResultL;
    }

    public String getDischargeDiseaseId() {
        return DischargeDiseaseId;
    }

    public String getAuditResultLllegal() {
        return AuditResultLllegal;
    }

    public String getAuditResultS() {
        return AuditResultS;
    }

    public String getAuditResultSuspicious() {
        return AuditResultSuspicious;
    }

    public String getDischargeDiseaseName() {
        return DischargeDiseaseName;
    }

    public String getDischargeReason() {
        return DischargeReason;
    }

    public String getAuditResultVerified() {
        return AuditResultVerified;
    }

    public String getBillNo() {
        return BillNo;
    }

    public String getBillId() {
        return BillId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public double getRuleBit() {
        return RuleBit;
    }

    public String getBenefitType() {
        return BenefitType;
    }

    public String getBmiCode() {
        return BmiCode;
    }

    public String getDiseaseId() {
        return DiseaseId;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public String getPatientSex() {
        return PatientSex;
    }

    public String getDiseaseType() {
        return DiseaseType;
    }

    public String getBmino() {
        return Bmino;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public String getDiagnosisFive() {
        return DiagnosisFive;
    }

    public String getDutyIsDoctor() {
        return DutyIsDoctor;
    }

    public String getDutyIsHospital() {
        return DutyIsHospital;
    }

    public String getDiagnosisFiveName() {
        return DiagnosisFiveName;
    }

    public String getDiagnosisFour() {
        return DiagnosisFour;
    }

    public String getDutyIsPatient() {
        return DutyIsPatient;
    }

    public String getDiagnosisFourName() {
        return DiagnosisFourName;
    }

    public String getEtlFlag() {
        return EtlFlag;
    }

    public String getFlag() {
        return Flag;
    }

    public String getHospitalRemark() {
        return HospitalRemark;
    }

    public String getDiagnosisEight() {
        return DiagnosisEight;
    }

    public String getHospitalComplainStatus() {
        return HospitalComplainStatus;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public String getInPatientTransferFlag() {
        return InPatientTransferFlag;
    }

    public String getIsHospitalRemark() {
        return IsHospitalRemark;
    }

    public String getPatientHeight() {
        return PatientHeight;
    }

    public String getSecondDiseaseId() {
        return SecondDiseaseId;
    }

    public String getPatientLactating() {
        return PatientLactating;
    }

    public String getPatientPregnant() {
        return PatientPregnant;
    }

    public String getDiagnosisEightName() {
        return DiagnosisEightName;
    }

    public String getPatientWeight() {
        return PatientWeight;
    }

    public String getSecondDiseaseName() {
        return SecondDiseaseName;
    }

    public String getThirdDiseaseId() {
        return ThirdDiseaseId;
    }

    public String getThirdDiseaseName() {
        return ThirdDiseaseName;
    }

    public String getDiagnosisSix() {
        return DiagnosisSix;
    }

    public String getReadFlag() {
        return ReadFlag;
    }

    public String getDiagnosisSeven() {
        return DiagnosisSeven;
    }

    public String getSpecialDiseaseCode() {
        return SpecialDiseaseCode;
    }

    public String getTradeNo() {
        return TradeNo;
    }

    public String getYdBenefitRegion() {
        return YdBenefitRegion;
    }

    public String getDiagnosisSevenName() {
        return DiagnosisSevenName;
    }

    public String getDiagnosisSixName() {
        return DiagnosisSixName;
    }

    public String getYdBenefitGroupName() {
        return YdBenefitGroupName;
    }

    public String getDiagnosisEleven() {
        return DiagnosisEleven;
    }

    public String getUnusualFlag() {
        return UnusualFlag;
    }

    public void setAdmissionDate(Date admissionDate) {
        AdmissionDate = admissionDate;
    }

    public void setAdmissionDiseaseId(String admissionDiseaseId) {
        AdmissionDiseaseId = admissionDiseaseId;
    }

    public void setHospitalFeeName(String hospitalFeeName) {
        this.hospitalFeeName = hospitalFeeName;
    }

    public void setHospitalOutName(String hospitalOutName) {
        HospitalOutName = hospitalOutName;
    }

    public void setAdmissionDiseaseName(String admissionDiseaseName) {
        AdmissionDiseaseName = admissionDiseaseName;
    }

    public void setAnditManuDate(Date anditManuDate) {
        AnditManuDate = anditManuDate;
    }

    public void setAuditAutoDate(Date auditAutoDate) {
        AuditAutoDate = auditAutoDate;
    }

    public void setBenefitGroupId(String benefitGroupId) {
        BenefitGroupId = benefitGroupId;
    }

}
