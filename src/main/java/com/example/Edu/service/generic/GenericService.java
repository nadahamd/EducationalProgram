package com.example.Edu.service.generic;

import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.generic.GenericDomain;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Optional;

@Transactional

public class GenericService <Dao extends GenericDao,Domain extends GenericDomain,IdClass extends Serializable>{
    protected Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public Domain merge(Domain domain) {
        return ((JpaRepository<Domain, IdClass>) dao).save(domain);
    }

    public Domain getById(IdClass id) {
        Optional<Domain> result = ((JpaRepository<Domain, IdClass>) dao).findById(id);
        return result != null && result.isPresent() ? result.get() : null;
    }

}
