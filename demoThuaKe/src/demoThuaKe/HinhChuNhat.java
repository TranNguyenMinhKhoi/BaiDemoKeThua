package demoThuaKe;

public class HinhChuNhat extends HinhHoc {
	//-----------TÍNH KẾ THỪA----------------
		//class HinhCHuNhat kế thừa class HinhHoc bằng từ khóa extends, HinhVuong sẽ kế thừa tất cả thuộc tính và phương thức của HinhHoc
	private double chieuDai;
	private double chieuRong;
	
	// ---------------TÍNH ĐÓNG GÓI-------------
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d > 0) {
			this.chieuDai = d;
		}else {
			System.out.println("Lỗi! Chiều dài phải >0");
		}
		//ràng buộc chieuDai phải lớn hơn 0
	}
	
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r > 0) {
			this.chieuRong = r;
		}else {
			System.out.println("Lỗi! Chiều dài phải >0");
		}
		//ràng buộc chieuRong phải lớn hơn 0
	}
	
	public HinhChuNhat(String tenHinh, double d, double r) {
		super(tenHinh);
		this.chieuDai = d;
		this.chieuRong = r;
	}
	@Override//------------------Ghi đè------------------
	//phương thức getDienTich trong class HinhChuNhat đã ghi đè phương thức getDienTich trong lớp cha HinhHoc
	public double getDienTich() {
		// TODO Auto-generated method stub
		return getChieuDai() * getChieuRong() ;
	}
	
}
