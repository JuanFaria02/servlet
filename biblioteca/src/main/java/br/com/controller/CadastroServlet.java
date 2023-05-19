package br.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Annotation para não precisar mapear no web.xml
@WebServlet(name = "Cadastro Servlet", urlPatterns = "/cadastro")
public class CadastroServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Livro enviado com sucesso</h1>");
		String nome = req.getParameter("nome");
		String autor = req.getParameter("autor"); 
		String isbn = req.getParameter("isbn"); 
		String valor = req.getParameter("valor"); 
		String data = req.getParameter("data");
		resp.setContentType("text/html");

		writer.println("<ul>"); 
		writer.println("<li>nome: " + nome + "</li>"); 
		writer.println("<li>autor: " + autor + "</li>"); 
		writer.println("<li>isbn: " + isbn + "</li>"); 
		writer.println("<li>valor: " + valor + "</li>"); 
		writer.println("<li>data: " + data + "</li>"); 
		writer.println("</ul>");
	}

	
	
}
