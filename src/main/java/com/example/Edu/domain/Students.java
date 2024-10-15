package com.example.Edu.domain;

import com.example.Edu.domain.generic.GenericDomain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Students")
public class Students extends GenericDomain
{
    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Mobile_Number")
    private String mobileNumber;


    @OneToMany(mappedBy = "student")
    @JsonIgnoreProperties("student")
    private Set<Details> detailsSet;

}
