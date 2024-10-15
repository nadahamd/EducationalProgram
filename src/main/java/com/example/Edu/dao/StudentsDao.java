package com.example.Edu.dao;

import com.example.Edu.SubjectDto;
import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.Details;
import com.example.Edu.domain.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;


public interface StudentsDao extends GenericDao<Students,Integer> {

    @Query( "select S from Students  S " +
            "left join fetch S.detailsSet d " +
            "where d.mark=:mark ")
    List<Students> getByMark(@Param("mark")String mark);


//    @Query("select distinct s.name as name from Subject s " +
//            "left join fetch s.detailsSet d " +
//            "where d.student.id=:studentId")

    @Query(value = "select distinct s.Name as name from Subject as s " +
            "left join Details as d on d.Subject_Id=s.id " +
            "where d.Student_Id=:studentId",nativeQuery = true)
    List<String> getSubjectsForStudent(@Param("studentId") Integer studentId);
}
