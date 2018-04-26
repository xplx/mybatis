package com.foxwho.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "customer_account_info")
public class CustomerAccountInfo1 {
    /**
     * 会员用户ID
     */
    @Id
    @Column(name = "CAI_CustomerId")
    private Integer caiCustomerid;

    /**
     * 客户授信额度
     */
    @Column(name = "CAI_LineOfCredit")
    private BigDecimal caiLineofcredit;

    /**
     * 客户授信额度(房通贷)
     */
    @Column(name = "CAI_LineOfCreditHouse")
    private BigDecimal caiLineofcredithouse;

    /**
     * 质量保证金 奖励额度
     */
    @Column(name = "CAI_GuaranteeQuota")
    private BigDecimal caiGuaranteequota;

    /**
     * 提现额度
     */
    @Column(name = "CAI_CashQuota")
    private BigDecimal caiCashquota;

    /**
     * 可用余额
     */
    @Column(name = "CAI_AvailableBalance")
    private BigDecimal caiAvailablebalance;

    /**
     * 冻结资金
     */
    @Column(name = "CAI_FrozenCapital")
    private BigDecimal caiFrozencapital;

    /**
     * 是否可提现 0不可提现 1可提现
     */
    @Column(name = "CAI_CashLimit")
    private Byte caiCashlimit;

    /**
     * 前贷款金额 还款中的标的总金额 (本金)(不计延期标的)
     */
    @Column(name = "CAI_NowLoanAmounts")
    private BigDecimal caiNowloanamounts;

    /**
     * 未还的贷款金额 还没有还完的贷款金额 (本金)
     */
    @Column(name = "CAI_NotPaymentAmount")
    private BigDecimal caiNotpaymentamount;

    /**
     * 申请延期金额(总额) 还款中的延期标的总金额 (本金)
     */
    @Column(name = "CAI_DelayAmount")
    private BigDecimal caiDelayamount;

    /**
     * 贷款金额(借款总额) 放款之后 +Amount (不计延期标的)
     */
    @Column(name = "CAI_LoanAmounts")
    private BigDecimal caiLoanamounts;

    /**
     * 贷款次数(借款次数) 放款之后 次数+1  (不计延期标的)
     */
    @Column(name = "CAI_LoanCnt")
    private Integer caiLoancnt;

    /**
     * 代偿累计次数 申请代偿成功之后 次数+1 （统计标签）
     */
    @Column(name = "CAI_RepPaymentCnt")
    private Integer caiReppaymentcnt;

    /**
     * 代偿累计金额 申请代偿成功之后 累加代偿金额 （统计标签）
     */
    @Column(name = "CAI_RepPaymentAmounts")
    private BigDecimal caiReppaymentamounts;

    /**
     * 全部逾期次数 (还款记录逾期1天 记1次)（统计标签）
     */
    @Column(name = "CAI_OverdueCount")
    private Integer caiOverduecount;

    /**
     * 逾期30天以上还款记录次数 (还款记录逾期30天时 记1次)（统计标签）
     */
    @Column(name = "CAI_OverdueCount30")
    private Integer caiOverduecount30;

    /**
     * 逾期90天以上还款记录次数 (还款记录逾期90天时 记1次)（统计标签）
     */
    @Column(name = "CAI_OverdueCount90")
    private Integer caiOverduecount90;

    /**
     * 账户金袋数量(平台货币)
     */
    @Column(name = "CAI_GoldBag")
    private BigDecimal caiGoldbag;

    /**
     * 获取会员用户ID
     *
     * @return CAI_CustomerId - 会员用户ID
     */
    public Integer getCaiCustomerid() {
        return caiCustomerid;
    }

    /**
     * 设置会员用户ID
     *
     * @param caiCustomerid 会员用户ID
     */
    public void setCaiCustomerid(Integer caiCustomerid) {
        this.caiCustomerid = caiCustomerid;
    }

    /**
     * 获取客户授信额度
     *
     * @return CAI_LineOfCredit - 客户授信额度
     */
    public BigDecimal getCaiLineofcredit() {
        return caiLineofcredit;
    }

    /**
     * 设置客户授信额度
     *
     * @param caiLineofcredit 客户授信额度
     */
    public void setCaiLineofcredit(BigDecimal caiLineofcredit) {
        this.caiLineofcredit = caiLineofcredit;
    }

    /**
     * 获取客户授信额度(房通贷)
     *
     * @return CAI_LineOfCreditHouse - 客户授信额度(房通贷)
     */
    public BigDecimal getCaiLineofcredithouse() {
        return caiLineofcredithouse;
    }

    /**
     * 设置客户授信额度(房通贷)
     *
     * @param caiLineofcredithouse 客户授信额度(房通贷)
     */
    public void setCaiLineofcredithouse(BigDecimal caiLineofcredithouse) {
        this.caiLineofcredithouse = caiLineofcredithouse;
    }

    /**
     * 获取质量保证金 奖励额度
     *
     * @return CAI_GuaranteeQuota - 质量保证金 奖励额度
     */
    public BigDecimal getCaiGuaranteequota() {
        return caiGuaranteequota;
    }

    /**
     * 设置质量保证金 奖励额度
     *
     * @param caiGuaranteequota 质量保证金 奖励额度
     */
    public void setCaiGuaranteequota(BigDecimal caiGuaranteequota) {
        this.caiGuaranteequota = caiGuaranteequota;
    }

    /**
     * 获取提现额度
     *
     * @return CAI_CashQuota - 提现额度
     */
    public BigDecimal getCaiCashquota() {
        return caiCashquota;
    }

    /**
     * 设置提现额度
     *
     * @param caiCashquota 提现额度
     */
    public void setCaiCashquota(BigDecimal caiCashquota) {
        this.caiCashquota = caiCashquota;
    }

    /**
     * 获取可用余额
     *
     * @return CAI_AvailableBalance - 可用余额
     */
    public BigDecimal getCaiAvailablebalance() {
        return caiAvailablebalance;
    }

    /**
     * 设置可用余额
     *
     * @param caiAvailablebalance 可用余额
     */
    public void setCaiAvailablebalance(BigDecimal caiAvailablebalance) {
        this.caiAvailablebalance = caiAvailablebalance;
    }

    /**
     * 获取冻结资金
     *
     * @return CAI_FrozenCapital - 冻结资金
     */
    public BigDecimal getCaiFrozencapital() {
        return caiFrozencapital;
    }

    /**
     * 设置冻结资金
     *
     * @param caiFrozencapital 冻结资金
     */
    public void setCaiFrozencapital(BigDecimal caiFrozencapital) {
        this.caiFrozencapital = caiFrozencapital;
    }

    /**
     * 获取是否可提现 0不可提现 1可提现
     *
     * @return CAI_CashLimit - 是否可提现 0不可提现 1可提现
     */
    public Byte getCaiCashlimit() {
        return caiCashlimit;
    }

    /**
     * 设置是否可提现 0不可提现 1可提现
     *
     * @param caiCashlimit 是否可提现 0不可提现 1可提现
     */
    public void setCaiCashlimit(Byte caiCashlimit) {
        this.caiCashlimit = caiCashlimit;
    }

    /**
     * 获取前贷款金额 还款中的标的总金额 (本金)(不计延期标的)
     *
     * @return CAI_NowLoanAmounts - 前贷款金额 还款中的标的总金额 (本金)(不计延期标的)
     */
    public BigDecimal getCaiNowloanamounts() {
        return caiNowloanamounts;
    }

    /**
     * 设置前贷款金额 还款中的标的总金额 (本金)(不计延期标的)
     *
     * @param caiNowloanamounts 前贷款金额 还款中的标的总金额 (本金)(不计延期标的)
     */
    public void setCaiNowloanamounts(BigDecimal caiNowloanamounts) {
        this.caiNowloanamounts = caiNowloanamounts;
    }

    /**
     * 获取未还的贷款金额 还没有还完的贷款金额 (本金)
     *
     * @return CAI_NotPaymentAmount - 未还的贷款金额 还没有还完的贷款金额 (本金)
     */
    public BigDecimal getCaiNotpaymentamount() {
        return caiNotpaymentamount;
    }

    /**
     * 设置未还的贷款金额 还没有还完的贷款金额 (本金)
     *
     * @param caiNotpaymentamount 未还的贷款金额 还没有还完的贷款金额 (本金)
     */
    public void setCaiNotpaymentamount(BigDecimal caiNotpaymentamount) {
        this.caiNotpaymentamount = caiNotpaymentamount;
    }

    /**
     * 获取申请延期金额(总额) 还款中的延期标的总金额 (本金)
     *
     * @return CAI_DelayAmount - 申请延期金额(总额) 还款中的延期标的总金额 (本金)
     */
    public BigDecimal getCaiDelayamount() {
        return caiDelayamount;
    }

    /**
     * 设置申请延期金额(总额) 还款中的延期标的总金额 (本金)
     *
     * @param caiDelayamount 申请延期金额(总额) 还款中的延期标的总金额 (本金)
     */
    public void setCaiDelayamount(BigDecimal caiDelayamount) {
        this.caiDelayamount = caiDelayamount;
    }

    /**
     * 获取贷款金额(借款总额) 放款之后 +Amount (不计延期标的)
     *
     * @return CAI_LoanAmounts - 贷款金额(借款总额) 放款之后 +Amount (不计延期标的)
     */
    public BigDecimal getCaiLoanamounts() {
        return caiLoanamounts;
    }

    /**
     * 设置贷款金额(借款总额) 放款之后 +Amount (不计延期标的)
     *
     * @param caiLoanamounts 贷款金额(借款总额) 放款之后 +Amount (不计延期标的)
     */
    public void setCaiLoanamounts(BigDecimal caiLoanamounts) {
        this.caiLoanamounts = caiLoanamounts;
    }

    /**
     * 获取贷款次数(借款次数) 放款之后 次数+1  (不计延期标的)
     *
     * @return CAI_LoanCnt - 贷款次数(借款次数) 放款之后 次数+1  (不计延期标的)
     */
    public Integer getCaiLoancnt() {
        return caiLoancnt;
    }

    /**
     * 设置贷款次数(借款次数) 放款之后 次数+1  (不计延期标的)
     *
     * @param caiLoancnt 贷款次数(借款次数) 放款之后 次数+1  (不计延期标的)
     */
    public void setCaiLoancnt(Integer caiLoancnt) {
        this.caiLoancnt = caiLoancnt;
    }

    /**
     * 获取代偿累计次数 申请代偿成功之后 次数+1 （统计标签）
     *
     * @return CAI_RepPaymentCnt - 代偿累计次数 申请代偿成功之后 次数+1 （统计标签）
     */
    public Integer getCaiReppaymentcnt() {
        return caiReppaymentcnt;
    }

    /**
     * 设置代偿累计次数 申请代偿成功之后 次数+1 （统计标签）
     *
     * @param caiReppaymentcnt 代偿累计次数 申请代偿成功之后 次数+1 （统计标签）
     */
    public void setCaiReppaymentcnt(Integer caiReppaymentcnt) {
        this.caiReppaymentcnt = caiReppaymentcnt;
    }

    /**
     * 获取代偿累计金额 申请代偿成功之后 累加代偿金额 （统计标签）
     *
     * @return CAI_RepPaymentAmounts - 代偿累计金额 申请代偿成功之后 累加代偿金额 （统计标签）
     */
    public BigDecimal getCaiReppaymentamounts() {
        return caiReppaymentamounts;
    }

    /**
     * 设置代偿累计金额 申请代偿成功之后 累加代偿金额 （统计标签）
     *
     * @param caiReppaymentamounts 代偿累计金额 申请代偿成功之后 累加代偿金额 （统计标签）
     */
    public void setCaiReppaymentamounts(BigDecimal caiReppaymentamounts) {
        this.caiReppaymentamounts = caiReppaymentamounts;
    }

    /**
     * 获取全部逾期次数 (还款记录逾期1天 记1次)（统计标签）
     *
     * @return CAI_OverdueCount - 全部逾期次数 (还款记录逾期1天 记1次)（统计标签）
     */
    public Integer getCaiOverduecount() {
        return caiOverduecount;
    }

    /**
     * 设置全部逾期次数 (还款记录逾期1天 记1次)（统计标签）
     *
     * @param caiOverduecount 全部逾期次数 (还款记录逾期1天 记1次)（统计标签）
     */
    public void setCaiOverduecount(Integer caiOverduecount) {
        this.caiOverduecount = caiOverduecount;
    }

    /**
     * 获取逾期30天以上还款记录次数 (还款记录逾期30天时 记1次)（统计标签）
     *
     * @return CAI_OverdueCount30 - 逾期30天以上还款记录次数 (还款记录逾期30天时 记1次)（统计标签）
     */
    public Integer getCaiOverduecount30() {
        return caiOverduecount30;
    }

    /**
     * 设置逾期30天以上还款记录次数 (还款记录逾期30天时 记1次)（统计标签）
     *
     * @param caiOverduecount30 逾期30天以上还款记录次数 (还款记录逾期30天时 记1次)（统计标签）
     */
    public void setCaiOverduecount30(Integer caiOverduecount30) {
        this.caiOverduecount30 = caiOverduecount30;
    }

    /**
     * 获取逾期90天以上还款记录次数 (还款记录逾期90天时 记1次)（统计标签）
     *
     * @return CAI_OverdueCount90 - 逾期90天以上还款记录次数 (还款记录逾期90天时 记1次)（统计标签）
     */
    public Integer getCaiOverduecount90() {
        return caiOverduecount90;
    }

    /**
     * 设置逾期90天以上还款记录次数 (还款记录逾期90天时 记1次)（统计标签）
     *
     * @param caiOverduecount90 逾期90天以上还款记录次数 (还款记录逾期90天时 记1次)（统计标签）
     */
    public void setCaiOverduecount90(Integer caiOverduecount90) {
        this.caiOverduecount90 = caiOverduecount90;
    }

    /**
     * 获取账户金袋数量(平台货币)
     *
     * @return CAI_GoldBag - 账户金袋数量(平台货币)
     */
    public BigDecimal getCaiGoldbag() {
        return caiGoldbag;
    }

    /**
     * 设置账户金袋数量(平台货币)
     *
     * @param caiGoldbag 账户金袋数量(平台货币)
     */
    public void setCaiGoldbag(BigDecimal caiGoldbag) {
        this.caiGoldbag = caiGoldbag;
    }
}