package com.txt.security.registration.entity.authen;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@Data
@Entity
@Table(name = "group_members")
public class GroupMembers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column
    private String username;

    @Column(name = "group_id")
    private String groupId;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}