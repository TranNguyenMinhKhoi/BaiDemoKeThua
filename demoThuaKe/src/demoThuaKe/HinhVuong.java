package demoThuaKe;

public class HinhVuong extends HinhHoc {
	//-----------TÍNH KẾ THỪA----------------
	//class HinhVuong kế thừa class hình học bằng từ khóa extends, HinhVuong sẽ kế thừa tất cả thuộc tính và phương thức của HinhHoc
	private double canh;

	//------------TÍNH ĐÓNG GÓI----------
	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		if (canh > 0) {
			this.canh = canh;
		}else {
			System.out.println("Lỗi! Cạnh hình vuông phải >0");
		}
		//ràng buộc canh phải lớn hơn 0
	}
	
	public HinhVuong() {
		
	}

	public HinhVuong(String tenHinh) {
		super(tenHinh);
		// TODO Auto-generated constructor stub
	}

	public HinhVuong(String tenHinh, double canh) {
		super(tenHinh);
		this.tenHinh = tenHinh;
		this.canh = canh;
	}

	@Override //------------------Ghi đè------------------
	//phương thức getDienTich trong class HinhVuong đã ghi đè phương thức getDienTich trong lớp cha HinhHoc
	public double getDienTich() {
		// TODO Auto-generated method stub
		return getCanh() * getCanh();
	}
}
