package com.example.Edu.domain;

import com.example.Edu.domain.generic.GenericDomain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Section")
public class Section extends GenericDomain {

    @Column(name="Name")
    private String name;

    @Column(name="Arabic_Name")
    private String arabicName;

    @Column(name="English_Name")
    private String englishName;

    @Column(name = "Center_Program")
    private String centerProgram;

    @OneToMany(mappedBy = "section")
    @JsonIgnoreProperties("section")
    private Set<Details> detailsSet;

public Section(Integer id){
    this.id=id;
}
}
