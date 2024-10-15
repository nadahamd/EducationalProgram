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
@Table(name = "Subject")
public class Subject extends GenericDomain {
    @Column(name="Name")
    private String name;


    @OneToMany(mappedBy = "subject")
    @JsonIgnoreProperties("subject")
    private Set<Details> detailsSet;
}
