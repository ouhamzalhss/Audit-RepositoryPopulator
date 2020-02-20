package com.ouhamza.populator.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Lhouceine OUHAMZA
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    @Id @GeneratedValue
    private Long personId;
    private String name;
    private String email;


}
