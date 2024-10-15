package com.example.Edu.dao;

import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.Details;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DetailsDao extends GenericDao<Details,Integer> {


}
