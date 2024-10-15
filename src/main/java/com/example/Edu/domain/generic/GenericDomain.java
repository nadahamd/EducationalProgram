package com.example.Edu.domain.generic;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@MappedSuperclass
public class GenericDomain implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "Record_Status")
    private  Integer recordStatus = 1;
}
