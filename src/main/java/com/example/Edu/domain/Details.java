package com.example.Edu.domain;



import com.example.Edu.domain.generic.GenericDomain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Details")
public class Details extends GenericDomain {


    @Column(name = "Mark")
    private String mark;

    @ManyToOne
    @JoinColumn(name = "Student_Id",referencedColumnName = "id")
    @JsonIgnoreProperties("detailsSet")
    private Students student;


    @ManyToOne
    @JoinColumn(name = "Subject_Id",referencedColumnName = "id")
    @JsonIgnoreProperties("detailsSet")
    private Subject subject;


    @ManyToOne
    @JoinColumn(name = "Section_Id",referencedColumnName = "id")
    @JsonIgnoreProperties("detailsSet")
    private Section section;
}
