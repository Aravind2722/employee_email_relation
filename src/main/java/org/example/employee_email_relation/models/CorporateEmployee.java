package org.example.employee_email_relation.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class CorporateEmployee {
    @Id
    private Long id;

    private String name;

    private String designation;

    @OneToOne(mappedBy = "employee")
    private CorporateEmailAddress emailAddress;
}
