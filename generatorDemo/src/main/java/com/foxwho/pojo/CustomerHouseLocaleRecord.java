package com.foxwho.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_houselocalerecord")
public class CustomerHouseLocaleRecord {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "chr_Id")
    private Integer chrId;

    /**
     * 用户ID
     */
    @Column(name = "chr_CustomerId")
    private Integer chrCustomerid;

    /**
     *  0未开始 1通过 2不通过
     */
    @Column(name = "chr_CheckState")
    private Byte chrCheckstate;

    /**
     * 审核人员
     */
    @Column(name = "chr_CheckAdmin")
    private Integer chrCheckadmin;

    /**
     * 不通过原因
     */
    @Column(name = "chr_CheckCause")
    private String chrCheckcause;

    /**
     * 审核时间
     */
    @Column(name = "chr_CheckTime")
    private Date chrChecktime;

    /**
     * 创建人(上传人)
     */
    @Column(name = "chr_CreateAdmin")
    private Integer chrCreateadmin;

    /**
     * 创建时间
     */
    @Column(name = "chr_CreateTime")
    private Date chrCreatetime;

    /**
     * 备注
     */
    @Column(name = "chr_Remark")
    private String chrRemark;

    /**
     * 上传图片(实地图片) (逗号分隔)
     */
    @Column(name = "chr_Picture")
    private String chrPicture;

    /**
     * 获取主键ID
     *
     * @return chr_Id - 主键ID
     */
    public Integer getChrId() {
        return chrId;
    }

    /**
     * 设置主键ID
     *
     * @param chrId 主键ID
     */
    public void setChrId(Integer chrId) {
        this.chrId = chrId;
    }

    /**
     * 获取用户ID
     *
     * @return chr_CustomerId - 用户ID
     */
    public Integer getChrCustomerid() {
        return chrCustomerid;
    }

    /**
     * 设置用户ID
     *
     * @param chrCustomerid 用户ID
     */
    public void setChrCustomerid(Integer chrCustomerid) {
        this.chrCustomerid = chrCustomerid;
    }

    /**
     * 获取 0未开始 1通过 2不通过
     *
     * @return chr_CheckState -  0未开始 1通过 2不通过
     */
    public Byte getChrCheckstate() {
        return chrCheckstate;
    }

    /**
     * 设置 0未开始 1通过 2不通过
     *
     * @param chrCheckstate  0未开始 1通过 2不通过
     */
    public void setChrCheckstate(Byte chrCheckstate) {
        this.chrCheckstate = chrCheckstate;
    }

    /**
     * 获取审核人员
     *
     * @return chr_CheckAdmin - 审核人员
     */
    public Integer getChrCheckadmin() {
        return chrCheckadmin;
    }

    /**
     * 设置审核人员
     *
     * @param chrCheckadmin 审核人员
     */
    public void setChrCheckadmin(Integer chrCheckadmin) {
        this.chrCheckadmin = chrCheckadmin;
    }

    /**
     * 获取不通过原因
     *
     * @return chr_CheckCause - 不通过原因
     */
    public String getChrCheckcause() {
        return chrCheckcause;
    }

    /**
     * 设置不通过原因
     *
     * @param chrCheckcause 不通过原因
     */
    public void setChrCheckcause(String chrCheckcause) {
        this.chrCheckcause = chrCheckcause;
    }

    /**
     * 获取审核时间
     *
     * @return chr_CheckTime - 审核时间
     */
    public Date getChrChecktime() {
        return chrChecktime;
    }

    /**
     * 设置审核时间
     *
     * @param chrChecktime 审核时间
     */
    public void setChrChecktime(Date chrChecktime) {
        this.chrChecktime = chrChecktime;
    }

    /**
     * 获取创建人(上传人)
     *
     * @return chr_CreateAdmin - 创建人(上传人)
     */
    public Integer getChrCreateadmin() {
        return chrCreateadmin;
    }

    /**
     * 设置创建人(上传人)
     *
     * @param chrCreateadmin 创建人(上传人)
     */
    public void setChrCreateadmin(Integer chrCreateadmin) {
        this.chrCreateadmin = chrCreateadmin;
    }

    /**
     * 获取创建时间
     *
     * @return chr_CreateTime - 创建时间
     */
    public Date getChrCreatetime() {
        return chrCreatetime;
    }

    /**
     * 设置创建时间
     *
     * @param chrCreatetime 创建时间
     */
    public void setChrCreatetime(Date chrCreatetime) {
        this.chrCreatetime = chrCreatetime;
    }

    /**
     * 获取备注
     *
     * @return chr_Remark - 备注
     */
    public String getChrRemark() {
        return chrRemark;
    }

    /**
     * 设置备注
     *
     * @param chrRemark 备注
     */
    public void setChrRemark(String chrRemark) {
        this.chrRemark = chrRemark;
    }

    /**
     * 获取上传图片(实地图片) (逗号分隔)
     *
     * @return chr_Picture - 上传图片(实地图片) (逗号分隔)
     */
    public String getChrPicture() {
        return chrPicture;
    }

    /**
     * 设置上传图片(实地图片) (逗号分隔)
     *
     * @param chrPicture 上传图片(实地图片) (逗号分隔)
     */
    public void setChrPicture(String chrPicture) {
        this.chrPicture = chrPicture;
    }
}