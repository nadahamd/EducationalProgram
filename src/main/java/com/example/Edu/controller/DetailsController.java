package com.example.Edu.controller;

import com.example.Edu.controller.generic.GenericController;
import com.example.Edu.dao.DetailsDao;
import com.example.Edu.domain.Details;
import com.example.Edu.service.DetailsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Details")
public class DetailsController extends GenericController<DetailsService, DetailsDao, Details,Integer> {



}
