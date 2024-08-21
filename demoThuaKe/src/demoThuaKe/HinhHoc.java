package demoThuaKe;

public abstract class HinhHoc {
	//-----------------------TÍNH TRỪU TƯỢNG-----------------------
	//lớp HinhHoc được khai báo là 1 lớp trừu tượng (abstract), không thể được khởi tạo trực tiếp
	//Thay vào đó, nó chỉ có thể được kế thừa bởi các lớp con HinhVuong, HinhChuNhat
	protected String tenHinh;

	//--------------Tính đóng gói---------
	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String ten) {
		if( ten!=NULL) {
			this.tenHinh = ten;
		}else{
		sysout("Lỗi tên");	
		};
		
	}
	
	public HinhHoc(String tenHinh) {}
	public HinhHoc() {}
	
	//tính diện tích
	//-----------------------TÍNH TRỪU TƯỢNG-----------------------
	//phương thức getDienTich là 1 phương thức trừu tượng
	//việc khai báo getDienTich là 1 phương thức trừu tượng sẽ bắt buộc các lớp con HinhVuong, HinhChuNhat phải cung cấp cách tính diện tích cụ thể
	//cách tính getDienTich chỉ là khái quát về diện tích của 1 hình học, nên nó mang tính trừu tượng
	public abstract double getDienTich();
	@Override
	public String toString() {
		return super.toString();
	}
	
}
