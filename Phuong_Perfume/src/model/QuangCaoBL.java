package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuangCaoBL {
 	ArrayList<QuangCao> lsqc;
 	QuangCao hangSua;
 Connection connection;
 Statement statement;
 ResultSet resultSet;
public QuangCaoBL() {
	// TODO Auto-generated constructor stub
}
public ArrayList<QuangCao> DocTatCa(){
	
	connection = new CSDL().ReadDatabase("phuong_perfume");
	 String sql ="select * from quangcao";
	 lsqc = new ArrayList<>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				QuangCao quangCao = new QuangCao();
				quangCao.setId(resultSet.getInt("id"));
				quangCao.setHinhAnh(resultSet.getString("hinhanh"));
				quangCao.setThongDiep(resultSet.getString("thongdiep"));
				quangCao.setThongTinChiTiet(resultSet.getString("thongtinchitiet"));
				quangCao.setNgayDang(resultSet.getDate("ngaydang"));
				lsqc.add(quangCao);
			}
			System.out.println(lsqc.get(2).getHinhAnh());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return lsqc;
}

}