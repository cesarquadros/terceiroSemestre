package Aula7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
		

		DAO dao = new DAO();

		
		
		PrintWriter saida = response.getWriter();
//		saida.print
//		(
//				"<HTML>"
//					+"<title>Gerenciamento dos pedidos</title>"
//					+"<body>"
//						+ "<h1>Lista de solicita��s de presentes</h1>"
//						+ "<p>Nome: "+pedidoPresente.getNome()+"</p>"
//						+ "<p>Presente1: "+pedidoPresente.getPresente1()+"</p>"
//						+ "<p>Presente2: "+pedidoPresente.getPresente2()+"</p>"
//						+ "<p>Presente3: "+pedidoPresente.getPresente3()+"</p>"				
//					+"</body>"
//				+"</HTML>"
//		);
		

		
		String teste = "table table-bordered table-striped";
		saida.println("<html>"
				+ 		"<body>"
				+ 			"<table border="+1+" class="+teste+">"
				+ 				"<tr>"
				+ 					"<th>Nome</th>"
				+						 "<th>Presente 1</th>"
				+						 "<th>Presente 2</th>"
				+						 "<th>Presente 3</th>"
								+ "<tbody>");		
		
		for(int i=0; i<9;i++){
			saida.println("<tr>"
					+ "<td>"+i+"</td>"
					+ "<td>"+i+"</td>"
					+ "<td>"+i+"</td>"
					+ "<td>"+i+"</td>"
						+ "</tr>");
		}		
		
		saida.println(			"</tbody>"
				+ 				"</tr>"
				+ 			"</table>"
				+ 		"</body>"
				+ "</html>");
			

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
