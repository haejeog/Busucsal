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
import br.ucsal.model.Usuario;

/**
 * Servlet implementation class Autenticador
 */
@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet {
	List<String> lista1 = new ArrayList<>();
	List<String> lista2 = new ArrayList<>();
	List<String> lista3 = new ArrayList<>();
	List<String> lista4 = new ArrayList<>();
	List<String> lista5 = new ArrayList<>();
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
		String roteiro = request.getParameter("roteiro");
		if (roteiro.equals("1")) {
			
			Connection con = BancoUtil.getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM HOR1");
				while (rs.next()) {
					lista1.add(rs.getString("horario"));
				}
				stmt.close();
				rs.close();
				request.setAttribute("lista1", lista1);
				RequestDispatcher rd = request.getRequestDispatcher("roteiro1.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else if (roteiro.equals("2")) {
			
			Connection con = BancoUtil.getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM HOR2");
				while (rs.next()) {
					lista2.add(rs.getString("horario"));
				}
				stmt.close();
				rs.close();
				request.setAttribute("lista2", lista2);
				RequestDispatcher rd = request.getRequestDispatcher("roteiro2.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (roteiro.equals("3")) {
			
			Connection con = BancoUtil.getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM HOR3");
				while (rs.next()) {
					lista3.add(rs.getString("horario"));
				}
				stmt.close();
				rs.close();
				request.setAttribute("lista3", lista3);
				RequestDispatcher rd = request.getRequestDispatcher("roteiro3.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (roteiro.equals("4")) {
			
			Connection con = BancoUtil.getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM HOR4");
				while (rs.next()) {
					lista4.add(rs.getString("horario"));
				}
				stmt.close();
				rs.close();
				request.setAttribute("lista4", lista4);
				RequestDispatcher rd = request.getRequestDispatcher("roteiro4.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (roteiro.equals("5")) {
			
			Connection con = BancoUtil.getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM HOR5");
				while (rs.next()) {
					lista5.add(rs.getString("horario"));
				}
				stmt.close();
				rs.close();
				request.setAttribute("lista5", lista5);
				RequestDispatcher rd = request.getRequestDispatcher("roteiro5.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		Usuario user = new Usuario(login, senha);
		if (autenticar(user)) {
			
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
