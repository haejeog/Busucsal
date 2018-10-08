package br.ucsal.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.controller.BancoUtil;

public class Roteiro {
private List<Horario> horarios1=new ArrayList<Horario>();
private List<Horario> horarios2=new ArrayList<Horario>();
private List<Horario> horarios3=new ArrayList<Horario>();
private List<Horario> horarios4=new ArrayList<Horario>();
private List<Horario> horarios5=new ArrayList<Horario>();
private Connection connection;

public Roteiro() {
	new BancoUtil();
	this.connection = BancoUtil.getConnection();
}

public List<Horario> getLista1() {
	
   try {
	String sql = "select * from hor1";
	PreparedStatement stmt = this.connection.prepareStatement(sql);
	ResultSet rs = stmt.executeQuery();
	while (rs.next()) {
		Horario horario = new Horario();
		horario.setHorario(rs.getTime("horario"));
		horarios1.add(horario);
	}
	rs.close();
	stmt.close();
	return horarios1;
   } catch (SQLException e) {
	throw new RuntimeException(e);
   }
}
public List<Horario> getLista2() {
	
	   try {
		String sql = "select * from hor2";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Horario horario = new Horario();
			horario.setHorario(rs.getTime("horario"));
			horarios2.add(horario);
		}
		rs.close();
		stmt.close();
		return horarios2;
	   } catch (SQLException e) {
		throw new RuntimeException(e);
	   }
	}
public List<Horario> getLista3() {
	
	   try {
		String sql = "select * from hor3";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Horario horario = new Horario();
			horario.setHorario(rs.getTime("horario"));
			horarios3.add(horario);
		}
		rs.close();
		stmt.close();
		return horarios3;
	   } catch (SQLException e) {
		throw new RuntimeException(e);
	   }
	}
public List<Horario> getLista4() {
	
	   try {
		String sql = "select * from hor4";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Horario horario = new Horario();
			horario.setHorario(rs.getTime("horario"));
			horarios4.add(horario);
		}
		rs.close();
		stmt.close();
		return horarios4;
	   } catch (SQLException e) {
		throw new RuntimeException(e);
	   }
	}
public List<Horario> getLista5() {
	
	   try {
		String sql = "select * from hor5";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Horario horario = new Horario();
			horario.setHorario(rs.getTime("horario"));
			horarios5.add(horario);
		}
		rs.close();
		stmt.close();
		return horarios5;
	   } catch (SQLException e) {
		throw new RuntimeException(e);
	   }
	}
public void altera1(Horario horario1) {
	   String sql = "update hor1 set horario=? where id=?";
	   try {
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      stmt.setTime(1, horario1.getHorario());
	      stmt.execute();
	      stmt.close();
	   } catch (SQLException e) {
	      throw new RuntimeException(e);
	   }
	}
public void altera2(Horario horario2) {
	   String sql = "update hor2 set horario=? where id=?";
	   try {
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      stmt.setTime(1, horario2.getHorario());
	      stmt.execute();
	      stmt.close();
	   } catch (SQLException e) {
	      throw new RuntimeException(e);
	   }
	}
public void altera3(Horario horario3) {
	   String sql = "update hor3 set horario=? where id=?";
	   try {
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      stmt.setTime(1, horario3.getHorario());
	      stmt.execute();
	      stmt.close();
	   } catch (SQLException e) {
	      throw new RuntimeException(e);
	   }
	}
public void altera4(Horario horario4) {
	   String sql = "update hor4 set horario=? where id=?";
	   try {
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      stmt.setTime(1, horario4.getHorario());
	      stmt.execute();
	      stmt.close();
	   } catch (SQLException e) {
	      throw new RuntimeException(e);
	   }
	}
public void altera5(Horario horario5) {
	   String sql = "update hor5 set horario=? where id=?";
	   try {
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      stmt.setTime(1, horario5.getHorario());
	      stmt.execute();
	      stmt.close();
	   } catch (SQLException e) {
	      throw new RuntimeException(e);
	   }
	}
}
