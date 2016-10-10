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
		ArrayList<Presente> ultimosPedidos = session.getAttribute("ListaPedidos") == null ? new ArrayList<Presente>(): (ArrayList<Presente>) session.getAttribute("ListaPedidos");

		int Playstation4 = session.getAttribute("Playstation4") == null ? 0
				: (int) session.getAttribute("Playstation4");
		int Iphone = session.getAttribute("Iphone") == null ? 0 : (int) session
				.getAttribute("Iphone");
		int Caminhao = session.getAttribute("Caminhao") == null ? 0
				: (int) session.getAttribute("Caminhao");
		int Bola = session.getAttribute("Bola") == null ? 0 : (int) session
				.getAttribute("Bola");
		int Boneca = session.getAttribute("Boneca") == null ? 0 : (int) session
				.getAttribute("Boneca");
		
		String nome = request.getParameter("nome");
		String presente1 = request.getParameter("presente1");
		String presente2 = request.getParameter("presente2");
		String presente3 = request.getParameter("presente3");
		
		Presente pedidoPresente = new Presente(nome, presente1, presente2, presente3);
		
		switch (pedidoPresente.getPresente1()) {

		case "Playstation4":
			Playstation4++;
			break;

		case "Iphone":
			Iphone++;
			break;

		case "Caminhao":
			Caminhao++;
			break;

		case "Bola":
			Bola++;
			break;

		case "Boneca":
			Boneca++;
			break;
		}

		switch (pedidoPresente.getPresente2()) {

		case "Playstation4":
			Playstation4++;
			break;

		case "Iphone":
			Iphone++;
			break;

		case "Caminhao":
			Caminhao++;
			break;

		case "Bola":
			Bola++;
			break;

		case "Boneca":
			Boneca++;
			break;
		}

		switch (pedidoPresente.getPresente3()) {

		case "Playstation4":
			Playstation4++;
			break;

		case "Iphone":
			Iphone++;
			break;

		case "Caminhao":
			Caminhao++;
			break;

		case "Bola":
			Bola++;
			break;

		case "Boneca":
			Boneca++;
			break;
		}
		
		PrintWriter saida = response.getWriter();
		saida.print
		(
				"<HTML>"
					+"<title>Gerenciamento dos pedidos</title>"
					+"<body>"
						+ "<h1>Lista de solicita��s de presentes</h1>"
						+ "<p>Nome: "+pedidoPresente.getNome()+"</p>"
						+ "<p>Presente1: "+pedidoPresente.getPresente1()+"</p>"
						+ "<p>Presente2: "+pedidoPresente.getPresente2()+"</p>"
						+ "<p>Presente3: "+pedidoPresente.getPresente3()+"</p>"				
					+"</body>"
				+"</HTML>"
		);
		if (ultimosPedidos != null && ultimosPedidos.size() > 0) {
			saida.println("<H1>PEDIDOS ANTERIORES DE " + pedidoPresente.nome + ":</H1>");
			for (Presente item : ultimosPedidos) {
				if (pedidoPresente.nome.equalsIgnoreCase(nome))
					saida.println("<p> - " + pedidoPresente.getPresente1() + ", "+ pedidoPresente.getPresente2() + ", " + pedidoPresente.getPresente3()+ ";</p>");
			}
			saida.println("--------------------------------------------------");

		}
		saida.println("<H1>PRESENTES MAIS PEDIDOS (TODOS OS USUARIOS)</H1>");
		
		saida.println("<p> - Bola:" + Bola + "</p>");
		saida.println("<p> - Boneca:" + Boneca + "</p>");
		saida.println("<p> - Caminhao:" + Caminhao + "</p>");
		saida.println("<p> - Iphone:" + Iphone + "</p>");
		saida.println("<p> - Playstation4:" + Playstation4 + "</p>");
		saida.println("</BODY></HTML>");
		saida.flush();
		saida.close();
		
		ultimosPedidos.add(pedidoPresente);
		session.setAttribute("ListaPedidos", ultimosPedidos);
		session.setAttribute("Playstation4", Playstation4);
		session.setAttribute("Iphone", Iphone);
		session.setAttribute("Caminhao", Caminhao);
		session.setAttribute("Boneca", Boneca);
		session.setAttribute("Bola", Bola);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
