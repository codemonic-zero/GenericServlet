package code.generic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    public WelcomeServlet() {
        super();
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome to first Generic Servlet Project");
		out.close();
	}

}
