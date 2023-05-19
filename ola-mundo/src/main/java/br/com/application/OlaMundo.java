package br.com.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class OlaMundo extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//Função para escrever 
		PrintWriter writer = res.getWriter(); 
		
		//Retorna a resposta como html 
		res.setContentType("text/html");
		//Escreve no arquivo html
		writer.print("<h1>Olá Mundo</h1>");
		writer.print("<p>Meu primeiro Servlet</p>");
		
	}
	
}
