package com.example.Edu.service;

import com.example.Edu.SubjectDto;
import com.example.Edu.dao.DetailsDao;
import com.example.Edu.dao.StudentsDao;
import com.example.Edu.domain.Details;
import com.example.Edu.domain.Students;
import com.example.Edu.service.generic.GenericService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class StudentService extends GenericService<StudentsDao, Students,Integer> {

    public List<Students> getByMark(String mark) {
        return dao.getByMark(mark);
    }

    public List<String> getSubjectsForStudent(Integer studentId) {
        return dao.getSubjectsForStudent(studentId);
    }
}
