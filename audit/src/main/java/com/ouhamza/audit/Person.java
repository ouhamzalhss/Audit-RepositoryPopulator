package com.ouhamza.audit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author Lhouceine OUHAMZA
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Person {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;

    @CreatedDate
    private String createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private String modifiedDate;

    @LastModifiedBy
    private String modifiedBy;


}
