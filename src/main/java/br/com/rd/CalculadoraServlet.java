package br.com.rd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
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
//		doGet(request, response); 
//		int valor1 = Integer.parseInt(request.getParameter("valor1"));
//		int valor2 = Integer.parseInt(request.getParameter("valor2"));
//		int resultado = valor1 + valor2; 
		
		// response.getWriter().println("resultado = " + resultado); 
//		request.setAttribute("result", resultado); 
//		request.getSession().setAttribute("result", resultado); 
//		request.getRequestDispatcher("/").forward(request, response); 
		 process3(request, response);
	} 
	
	
	private void process3 (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("valor1") != null) && (request.getParameter("valor1") != null)) {
			//leitura de parametros
			int valor1 = Integer.parseInt(request.getParameter("valor1"));
			int valor2 = Integer.parseInt(request.getParameter("valor2"));
			
			//chamada da regra de negocio
			Calcular calc = new Calcular(valor1,valor2); 
			int resultado;
			
			
			if(request.getParameter("btnSomar") != null) {
				 resultado = calc.somar();
			} else if (request.getParameter("btnSub") != null) {
				 resultado = calc.subtrair();
			}else if (request.getParameter("btnMulti") != null) {
				 resultado = calc.multiplicar();
			}else {
				resultado = calc.dividir();
			}
			
			//resultado da regra de negocio
			request.setAttribute("resultado", resultado); //requestScope - forward
	
		}
		request.getRequestDispatcher("/").forward(request, response);  // rediciona para ele mesmo 
	} 
	

}
