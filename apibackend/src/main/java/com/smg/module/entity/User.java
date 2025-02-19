package com.smg.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.context.annotation.Scope;

/**
 * 
 * @TableName users
 */
@TableName(value ="user")
@Data
@Scope("prototype")
public class User implements Serializable {
    /**
     * 
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * 
     */
    @TableField(value = "uname")
    private String uname;

    /**
     * 
     */
    @TableField(value = "upassword")
    private String upassword;

    /**
     * 
     */
    @TableField(value = "usk")
    private String usk;

    /**
     * 
     */
    @TableField(value = "uak")
    private String uak;
    /**
     *
     */
    @TableField(value = "isAdmin")
    private Integer isAdmin;

    /**
     * 
     */
    @TableField(value = "ctime")
    private Date ctime;

    /**
     * 
     */
    @TableField(value = "deletetime")
    private Date deletetime;

    /**
     * 
     */
    @TableField(value = "isability")
    private Integer isability;

    @TableField(exist = false)
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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getUpassword() == null ? other.getUpassword() == null : this.getUpassword().equals(other.getUpassword()))
            && (this.getUsk() == null ? other.getUsk() == null : this.getUsk().equals(other.getUsk()))
            && (this.getUak() == null ? other.getUak() == null : this.getUak().equals(other.getUak()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getDeletetime() == null ? other.getDeletetime() == null : this.getDeletetime().equals(other.getDeletetime()))
            && (this.getIsability() == null ? other.getIsability() == null : this.getIsability().equals(other.getIsability()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getUpassword() == null) ? 0 : getUpassword().hashCode());
        result = prime * result + ((getUsk() == null) ? 0 : getUsk().hashCode());
        result = prime * result + ((getUak() == null) ? 0 : getUak().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDeletetime() == null) ? 0 : getDeletetime().hashCode());
        result = prime * result + ((getIsability() == null) ? 0 : getIsability().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", upassword=").append(upassword);
        sb.append(", usk=").append(usk);
        sb.append(", uak=").append(uak);
        sb.append(", ctime=").append(ctime);
        sb.append(", deletetime=").append(deletetime);
        sb.append(", isability=").append(isability);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}