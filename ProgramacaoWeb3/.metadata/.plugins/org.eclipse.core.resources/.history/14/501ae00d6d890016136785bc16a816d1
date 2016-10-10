package Aula7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Pedido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Pedido() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = (HttpSession) request.getSession();
		
		
		String nome = request.getParameter("nome");
		String presente1 = request.getParameter("presente1");
		String presente2 = request.getParameter("presente2");
		String presente3 = request.getParameter("presente3");
		
		Presente pedidoPresente = new Presente(nome, presente1, presente2, presente3);
		
		PrintWriter saida = response.getWriter();
		saida.print
		(
				"<HTML>"
					+"<title>Gerenciamento dos pedidos</title>"
					+"<body>"
						+ "<h1>Lista de solicitaçõs de presentes</h1>"
						+ "<p>Nome: "+pedidoPresente.getNome()+"</p>"
						+ "<p>Presente1: "+pedidoPresente.getPresente1()+"</p>"
						+ "<p>Presente2: "+pedidoPresente.getPresente2()+"</p>"
						+ "<p>Presente3: "+pedidoPresente.getPresente3()+"</p>"				
					+"</body>"
				+"</HTML>"
		);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
