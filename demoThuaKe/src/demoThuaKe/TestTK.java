package demoThuaKe;

public class TestTK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo đối tượng h1 có kiểu dữ liệu class HinhHoc
		HinhHoc h1 = new HinhVuong("Hình vuông 1", 21.4);
		System.out.println("Diện tích hình vuông: " + h1.getDienTich());
		//Khởi tạo đối tượng h2 có kiểu dữ liệu class HinhHoc
		HinhHoc h2 = new HinhChuNhat("Hình chữ nhật", 24, 4);
		System.out.println("Diện tích hình chữ nhật: " + h2.getDienTich());
		//-----------TÍNH ĐA HÌNH-----------------
		//h1 và h2 có cùng kiểu dữ liệu HinhHoc, nhưng thể hiện 2 hình thái khác nhau: HinhVuong, HinhChuNhat
	}

}
