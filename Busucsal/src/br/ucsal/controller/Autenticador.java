package br.ucsal.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.controller.BancoUtil;
import br.ucsal.model.Roteiro;
import br.ucsal.model.Usuario;

/**
 * Servlet implementation class Autenticador
 */
@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Autenticador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Roteiro rot = new Roteiro();
		String roteiro = request.getParameter("roteiro");
		if (roteiro.equals("1")) {

			request.setAttribute("lista1", rot.getLista1());
			RequestDispatcher rd = request.getRequestDispatcher("roteiro1.jsp");
			rd.forward(request, response);

		} else if (roteiro.equals("2")) {
			request.setAttribute("lista2", rot.getLista2());
			RequestDispatcher rd = request.getRequestDispatcher("roteiro2.jsp");
			rd.forward(request, response);
		} else if (roteiro.equals("3")) {

			request.setAttribute("lista3", rot.getLista3());
			RequestDispatcher rd = request.getRequestDispatcher("roteiro3.jsp");
			rd.forward(request, response);

		} else if (roteiro.equals("4")) {

			request.setAttribute("lista4", rot.getLista4());
			RequestDispatcher rd = request.getRequestDispatcher("roteiro4.jsp");
			rd.forward(request, response);

		} else if (roteiro.equals("5")) {

			request.setAttribute("lista5", rot.getLista5());
			RequestDispatcher rd = request.getRequestDispatcher("roteiro5.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		Usuario user = new Usuario(login, senha);
		if (autenticar(user)) {
			request.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("teste.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("erro", "usuario e senha invalidos!");
			RequestDispatcher d = request.getRequestDispatcher("login.jsp");
			d.forward(request, response);
		}

	}

	private boolean autenticar(Usuario user) {
		boolean autenticado = false;
		Connection con = BancoUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("select * from USUARIOS  WHERE " + " LOGIN='" + user.getLogin().trim()
					+ "' and " + " SENHA='" + user.getSenha().trim() + "';");
			if (rset.next()) {
				autenticado = true;
			}
			rset.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return autenticado;

	}

}
