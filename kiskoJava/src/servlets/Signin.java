package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Cliente;

/**
 * Servlet implementation class Signin
 */
@WebServlet({ "/Signin", "/signin", "/SIGNIN" })
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		
		
		response.getWriter().append("Served at: ").append(usuario).append(password).append(request.getContextPath());
		
		
		
		/*
		String dniCliente = request.getParameter("dniCliente");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String mail = request.getParameter("mail");
		String fechaNac = request.getParameter("fechaNac");
		*/
		
		
		
	}

}
