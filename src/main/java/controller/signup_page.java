package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDto;
import service.UserService;

@WebServlet("/signup")
public class signup_page extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	LocalDate dateofbirth=LocalDate.parse(req.getParameter("dob"));
	int age=LocalDate.now().getYear()-dateofbirth.getYear();
	UserDto dto=new UserDto();
	dto.setPassword(req.getParameter("password"));
	dto.setName(req.getParameter("name"));
	dto.setAge(age);
	dto.setDob(dateofbirth);
	dto.setEmail(req.getParameter("email"));
	dto.setMobile(Long.parseLong(req.getParameter("mobile")));
	dto.setGender(req.getParameter("gender"));
	
	UserService service=new UserService();
	if(service.saveUser(dto))
	{
		resp.getWriter().print("<h1 align='center' style='color:green'>Account Created Success</h1>");
		req.getRequestDispatcher("index.html").include(req, resp);
	}
	else {
		resp.getWriter().print("<h1 align='center' style='color:red'>Sorry!! Account cannot be Created</h1>");
		req.getRequestDispatcher("signup.html").include(req, resp);
	}
}
}
