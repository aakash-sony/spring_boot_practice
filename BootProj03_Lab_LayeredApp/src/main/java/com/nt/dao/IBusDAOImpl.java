package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Bus;

@Repository
public class IBusDAOImpl implements IBusDAO {
	private static final String inserting_query = "INSERT INTO BUS (BUS_NO, BUS_NAME, BUS_COLOR, TICKET_PRICE, "
			                                         + " STARTS, ENDS) VALUES (?,?,?,?,?,?)";
	private static final String retrieving_query = "SELECT * FROM BUS";

	@Autowired
	private DataSource ds;

	@Override
	public int insertBus(Bus bus) {
		int rowInserted = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(inserting_query);

			ps.setString(1, bus.getBus_number());
			ps.setString(2, bus.getBus_name());
			ps.setString(3, bus.getBus_color());
			ps.setDouble(4, bus.getTicket_price());
			ps.setString(5, bus.getStartFrom());
			ps.setString(6, bus.getEndsTo());

			rowInserted = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowInserted;
	}

	@Override
	public List<Bus> getAllBuses() {
		List<Bus> list = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(retrieving_query);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Bus bus = new Bus();
				bus.setBus_number(rs.getString(1));
				bus.setBus_name(rs.getString(2));
				bus.setBus_color(rs.getString(3));
				bus.setTicket_price(rs.getDouble(4));
				bus.setStartFrom(rs.getString(5));
				bus.setEndsTo(rs.getString(6));

				list.add(bus);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
