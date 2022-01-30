package com.abnit.sbmvcjpath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abnit.sbmvcjpath.entity.StudentEntity;
import com.abnit.sbmvcjpath.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/")
	public String getIndexPage() {
		return "index.html";
	}

	@RequestMapping(value="/add_student_page", method=RequestMethod.GET) 
	public String getAddStudentPage(Model model) {

		StudentEntity studentEntity = new StudentEntity();
		model.addAttribute("studentEntity", studentEntity);
		return "add_student_page.html";
	}
	
	@RequestMapping(value="/get_student_page", method=RequestMethod.GET) 
	public String getGetStudentPage(Model model) {

		StudentEntity studentEntity = new StudentEntity();
		model.addAttribute("studentEntity", studentEntity);
		return "get_student_page.html";
	}

	@RequestMapping(value="/update_student_page", method=RequestMethod.GET)
	public String getUpdateStudentPage(Model model) {
		StudentEntity studentEntity = new StudentEntity();
		model.addAttribute("studentEntity", studentEntity);
		return "update_student_page.html";
	}

	@RequestMapping(value="/delete_student_page", method=RequestMethod.GET)
	public String getDeleteStudentPage(Model model) {
		StudentEntity studentEntity = new StudentEntity();
		model.addAttribute("studentEntity", studentEntity);
		return "delete_student_page.html";
	}

	@RequestMapping(value="/saveStudent", method=RequestMethod.POST) 
	public ModelAndView saveStudent(@ModelAttribute StudentEntity studentEntity, BindingResult errors) {

		System.out.println("StudentController::saveStudent::Id-->" + studentEntity.getId()); 
		StudentEntity respStudentEntity = studentService.save(studentEntity);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("respStudentEntity", respStudentEntity);
		modelAndView.setViewName("view_student_page");

		return modelAndView; 
	}

	@RequestMapping(value="/getStudent", method=RequestMethod.GET) 
	public ModelAndView getStudent(@ModelAttribute StudentEntity studentEntity, BindingResult errors) {

		System.out.println("StudentController::getStudent::Id-->" + studentEntity.getId()); 
		StudentEntity respStudentEntity = studentService.getStudentById(studentEntity.getId());

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("respStudentEntity", respStudentEntity);
		modelAndView.setViewName("view_student_page");

		return modelAndView; 
	}
	
	@RequestMapping(value="/deleteStudent", method=RequestMethod.GET) 
	public ModelAndView deleteStudent(@ModelAttribute StudentEntity studentEntity, BindingResult errors) {

		System.out.println("StudentController::getStudent::Id-->" + studentEntity.getId()); 
		StudentEntity respStudentEntity = studentService.deleteStudentById(studentEntity.getId());

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("respStudentEntity", respStudentEntity);
		modelAndView.setViewName("view_student_page");

		return modelAndView; 
	}

	//RestAPI purpose
	/*
		@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
		public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity, BindingResult errors, Model model) {

			System.out.println("StudentController::saveStudent::Id-->" + studentEntity.getId());
			StudentEntity respStudentEntity = studentService.saveStudent(studentEntity);

			return respStudentEntity;
		}
	 */

}
