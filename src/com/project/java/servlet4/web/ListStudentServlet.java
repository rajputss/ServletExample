package com.project.java.servlet4.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.java.servlet4.domain.Student;
import com.project.java.servlet4.domain.StudentDAO;
import com.project.java.servlet4.domain.StudentDAOJDBCImpl;

/**
 * Servlet implementation class ListStudentServlet
 */
@WebServlet("/list")
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		StudentDAO dao = new StudentDAOJDBCImpl("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/demo", "root", "root");
		List<Student> students = dao.getAllStudents();
		
		request.setAttribute("students", students);
		
		response.sendRedirect("/Servlet4/listDisplay");
		
		*/
		 StudentDAO dao = new StudentDAOJDBCImpl();
		 List<Student> students = dao.getAllStudents();
		
		 request.setAttribute("students", students);
		 
		  RequestDispatcher dispatcher = request.getRequestDispatcher("/listDisplay");
		  dispatcher.forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
