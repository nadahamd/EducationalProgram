package com.example.Edu.controller.generic;

import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.generic.GenericDomain;
import com.example.Edu.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class GenericController <Service extends GenericService, Dao extends GenericDao, Domain extends GenericDomain , Id extends Serializable>{
    @Autowired
    protected Service service;

    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity save(@RequestBody Domain domain) {
        try {
            Domain added = (Domain) service.merge(domain);
            return added != null ?
                    new ResponseEntity<GenericDomain>(added, HttpStatus.CREATED) :
                    new ResponseEntity<GenericDomain>(HttpStatus.EXPECTATION_FAILED);


        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }
    }
        @RequestMapping(method = RequestMethod.GET, path = "/by-id")
        public ResponseEntity getById(@RequestParam("id") Id id) {
            try {
                GenericDomain model = service.getById(id);
                return model != null ?
                        new ResponseEntity(model, HttpStatus.OK) :
                        new ResponseEntity(HttpStatus.EXPECTATION_FAILED);

            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
            }
        }
    }
