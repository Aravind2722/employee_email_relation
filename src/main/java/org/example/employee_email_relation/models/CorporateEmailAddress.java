package org.example.employee_email_relation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CorporateEmailAddress {
    @Id
    private Long id;

    private String tenant;

    private Date createdAt;
    @OneToOne
    @MapsId
    @PrimaryKeyJoinColumn
    private CorporateEmployee employee;
}
