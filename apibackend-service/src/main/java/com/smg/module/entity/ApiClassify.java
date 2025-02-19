package com.smg.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @TableName api_classify
 */
@TableName(value ="api_classify")
@Data
@Service
@Scope("prototype")
public class ApiClassify implements Serializable {
    private Integer classifyid;

    private String classifyname;

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
        ApiClassify other = (ApiClassify) that;
        return (this.getClassifyid() == null ? other.getClassifyid() == null : this.getClassifyid().equals(other.getClassifyid()))
            && (this.getClassifyname() == null ? other.getClassifyname() == null : this.getClassifyname().equals(other.getClassifyname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassifyid() == null) ? 0 : getClassifyid().hashCode());
        result = prime * result + ((getClassifyname() == null) ? 0 : getClassifyname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classifyid=").append(classifyid);
        sb.append(", classifyname=").append(classifyname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}