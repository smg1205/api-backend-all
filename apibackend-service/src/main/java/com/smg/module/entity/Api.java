package com.smg.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @TableName api
 */
@TableName(value ="api")
@Data
@Service
@Scope("prototype")
public class Api implements Serializable {
    @TableId(value = "apid", type = IdType.AUTO)
    private Integer apid;

    private String apiname;

    private String apiurl;

    private String apinfo;

    private String parameter;

    private String requestheader;

    private String responseheader;

    private BigDecimal price;

    private String createtime;

    private String deletetime;

    private Integer classify;

    private String method;

    private Integer times;

    private Integer success;

    private Integer isability;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        com.smg.module.entity.Api other = (com.smg.module.entity.Api) that;
        return (this.getApid() == null ? other.getApid() == null : this.getApid().equals(other.getApid()))
                && (this.getApiname() == null ? other.getApiname() == null : this.getApiname().equals(other.getApiname()))
                && (this.getApiurl() == null ? other.getApiurl() == null : this.getApiurl().equals(other.getApiurl()))
                && (this.getApinfo() == null ? other.getApinfo() == null : this.getApinfo().equals(other.getApinfo()))
                && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
                && (this.getRequestheader() == null ? other.getRequestheader() == null : this.getRequestheader().equals(other.getRequestheader()))
                && (this.getResponseheader() == null ? other.getResponseheader() == null : this.getResponseheader().equals(other.getResponseheader()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getDeletetime() == null ? other.getDeletetime() == null : this.getDeletetime().equals(other.getDeletetime()))
                && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
                && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
                && (this.getTimes() == null ? other.getTimes() == null : this.getTimes().equals(other.getTimes()))
                && (this.getSuccess() == null ? other.getSuccess() == null : this.getSuccess().equals(other.getSuccess()))
                && (this.getIsability() == null ? other.getIsability() == null : this.getIsability().equals(other.getIsability()))
                && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApid() == null) ? 0 : getApid().hashCode());
        result = prime * result + ((getApiname() == null) ? 0 : getApiname().hashCode());
        result = prime * result + ((getApiurl() == null) ? 0 : getApiurl().hashCode());
        result = prime * result + ((getApinfo() == null) ? 0 : getApinfo().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getRequestheader() == null) ? 0 : getRequestheader().hashCode());
        result = prime * result + ((getResponseheader() == null) ? 0 : getResponseheader().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDeletetime() == null) ? 0 : getDeletetime().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getTimes() == null) ? 0 : getTimes().hashCode());
        result = prime * result + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        result = prime * result + ((getIsability() == null) ? 0 : getIsability().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", apid=").append(apid);
        sb.append(", apiname=").append(apiname);
        sb.append(", apiurl=").append(apiurl);
        sb.append(", apinfo=").append(apinfo);
        sb.append(", parameter=").append(parameter);
        sb.append(", requestheader=").append(requestheader);
        sb.append(", responseheader=").append(responseheader);
        sb.append(", price=").append(price);
        sb.append(", createtime=").append(createtime);
        sb.append(", deletetime=").append(deletetime);
        sb.append(", classify=").append(classify);
        sb.append(", method=").append(method);
        sb.append(", times=").append(times);
        sb.append(", success=").append(success);
        sb.append(", isability=").append(isability);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}