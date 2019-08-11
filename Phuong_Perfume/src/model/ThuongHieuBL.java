package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThuongHieuBL {
	ArrayList<ThuongHieu> lsth;
 	QuangCao hangSua;
 Connection connection;
 Statement statement;
 ResultSet resultSet;
public ThuongHieuBL() {
	// TODO Auto-generated constructor stub
}
public ArrayList<ThuongHieu> DocTatCa(){
	
	connection = new CSDL().ReadDatabase("phuong_perfume");
	 String sql ="select * from thuonghieu";
	 lsth = new ArrayList<>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				ThuongHieu thuongHieu = new ThuongHieu();
				thuongHieu.setId(resultSet.getInt("id"));
				thuongHieu.setHinhAnh(resultSet.getString("hinhanh"));
				thuongHieu.setTenThuongHieu(resultSet.getString("tenthuonghieu"));
				
				lsth.add(thuongHieu);
			}
			System.out.println(lsth.get(2).getHinhAnh());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return lsth;
}
}
