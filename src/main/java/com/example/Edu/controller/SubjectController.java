package com.example.Edu.controller;

import com.example.Edu.controller.generic.GenericController;
import com.example.Edu.dao.SubjectDao;
import com.example.Edu.domain.Subject;
import com.example.Edu.service.SubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController extends GenericController<SubjectService, SubjectDao, Subject,Integer> {
}
