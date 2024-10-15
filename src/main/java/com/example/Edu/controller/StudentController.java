package com.example.Edu.controller;

import com.example.Edu.SubjectDto;
import com.example.Edu.controller.generic.GenericController;
import com.example.Edu.dao.StudentsDao;
import com.example.Edu.domain.Details;
import com.example.Edu.domain.Students;
import com.example.Edu.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController extends GenericController<StudentService, StudentsDao, Students,Integer> {

    @GetMapping("/search-by-mark")
    public List<Students> getByMark(@RequestParam("mark") String mark){
        List<Students> result=service.getByMark(mark);
        return result !=null ?
                result: null;

}
@GetMapping("/get-subjects")
    public List<SubjectDto> getSubjectsForStudent(@RequestParam("studentId") Integer studentId){
        return  service.getSubjectsForStudent(studentId);
}

}
