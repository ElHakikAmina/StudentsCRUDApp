package com.crud.controllers;

import org.springframework.stereotype.Controller;
import java.io.IOException;

import javax.servlet.http.HttepServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribte;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.Student;
import com.db.HibernateDatabaseConnection;

@Controller
public class WelcomeController {
	@RequestMapping("/add_student")
	public String getAddStudentFrom()
	{
		return "view/student_add_form.jsp";
	}
	
	@RequestMapping(value="add_student_action",method = RequestMethod.POST)
	public void assStudent(HttpServletResponse res,
			@ModulAttribute("student") Student std
			) throws IOException
	{
		System.out.println(std.getName());
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		session.save(std);
		t.commit();
		
		res.sendRedirect("dashboard");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
