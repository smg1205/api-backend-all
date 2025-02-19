package com.smg.module.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 
 * @TableName api
 */
@Service
@Data
@Scope("prototype")
public class Api implements Serializable {
    /**
     * 
     */
    private Integer apid;

    /**
     * 
     */

    private String apiname;
    /**
     *
     */

    private String apiurl;
    /**
     *
     */

    private String method;

    /**
     * 
     */

    private String apinfo;

    /**
     * 
     */

    private String parameter;

    /**
     * 
     */

    private BigDecimal price;
    /**
     *
     */

    private String requestheader;
    /**
     *
     */

    private String responseheader;
    /**
     *
     */

    private String createtime;
    /**
     *
     */

    private String deletetime;
    /**
     *
     */

    private Integer classify;

    /**
     * 
     */

    private Integer isability;
    /**
     *
     */

    private Integer times;
    /**
     *
     */

    private Integer success;

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
        Api other = (Api) that;
        return (this.getApid() == null ? other.getApid() == null : this.getApid().equals(other.getApid()))
            && (this.getApiname() == null ? other.getApiname() == null : this.getApiname().equals(other.getApiname()))
            && (this.getApinfo() == null ? other.getApinfo() == null : this.getApinfo().equals(other.getApinfo()))
            && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getIsability() == null ? other.getIsability() == null : this.getIsability().equals(other.getIsability()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApid() == null) ? 0 : getApid().hashCode());
        result = prime * result + ((getApiname() == null) ? 0 : getApiname().hashCode());
        result = prime * result + ((getApinfo() == null) ? 0 : getApinfo().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getIsability() == null) ? 0 : getIsability().hashCode());
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
        sb.append(", apinfo=").append(apinfo);
        sb.append(", parameter=").append(parameter);
        sb.append(", price=").append(price);
        sb.append(", isability=").append(isability);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}