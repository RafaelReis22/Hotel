package challenge.hotel.dao;

import java.sql.Connection;

public class ReservaDAO {
	private Connection connection;
	
	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}
}
