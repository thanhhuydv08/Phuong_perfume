package model;

import java.io.Serializable;

public class ThuongHieu  implements Serializable{
  private int id;
  private String tenThuongHieu, hinhAnh;
  public ThuongHieu() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTenThuongHieu() {
	return tenThuongHieu;
}
public void setTenThuongHieu(String tenThuongHieu) {
	this.tenThuongHieu = tenThuongHieu;
}
public String getHinhAnh() {
	return hinhAnh;
}
public void setHinhAnh(String hinhAnh) {
	this.hinhAnh = hinhAnh;
}
  

}
