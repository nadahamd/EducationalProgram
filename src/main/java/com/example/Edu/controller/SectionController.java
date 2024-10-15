package com.example.Edu.controller;


import com.example.Edu.controller.generic.GenericController;
import com.example.Edu.dao.SectionDao;
import com.example.Edu.domain.Section;
import com.example.Edu.service.SectionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/section")
public class SectionController extends GenericController<SectionService, SectionDao, Section,Integer> {
}
