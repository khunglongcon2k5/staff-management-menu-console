/*
 * 
 * @author NguyenHung
 * @date Dec 2, 2024
 * @version 1.0
 *
 */

package com.nghung.app;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import com.nghung.model.NVBC;
import com.nghung.model.NVHD;
import com.nghung.service.DSNV;
import com.nghung.util.SettingMenu;

public class QuanLyNhanVien {
	public static void main(String[] args) {
		DSNV danhSachNhanVien = new DSNV();
		Scanner sc = new Scanner(System.in);

		while (true) {
			SettingMenu.mainMenu();
			System.out.print("Nhập lựa chọn của bạn ở đây: ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
				case 1:
					SettingMenu.employeeTypeMenu();
					System.out.print("Chọn loại nhân viên cần thêm: ");
					int type = sc.nextInt();
					sc.nextLine();
	
					if (type == 1) {
						NVBC nVBC = new NVBC();
						nVBC.nhapNhanVienBienChe(sc);
						danhSachNhanVien.themNhanVien(nVBC);
						System.out.println("Đã thêm thành công nhân viên biên chế!");
					} else if (type == 2) {
						NVHD nVHD = new NVHD();
						nVHD.nhapNhanVienHopDong(sc);
						danhSachNhanVien.themNhanVien(nVHD);
						System.out.println("Đã thêm thành công nhân viên hợp đồng!");
					}
					break;
				case 2:
					System.out.println("Nhập MNV của nhân viên cần xóa: ");
					String maNhanVien = sc.nextLine();
					danhSachNhanVien.xoaNhanVienTheoMNV(maNhanVien);
					System.out.println("Đã xóa thành công nhân viên có mã nhân viên là: " + maNhanVien);
					break;
				case 3:
					System.out.println("Danh sách nhân viên");
					danhSachNhanVien.hienThiDanhSachNhanVien();
					break;
				case 4:
					SettingMenu.employeeTypeMenu();
					System.out.println("Chọn loại nhân viên cần hiển thị: ");
					int loai = sc.nextInt();
	
					System.out.println("Danh sách nhân viên");
					if (loai == 1) {
						danhSachNhanVien.hienThiDSNVTheoLoai("NVBC");
					} else if (loai == 2) {
						danhSachNhanVien.hienThiDSNVTheoLoai("NVHD");
					}
					break;
				case 5:
					System.out.println("Danh sách nhân viên hợp đồng dài hạn: ");
					danhSachNhanVien.hienThiDSNVHopDongDaiHan();
					break;
				case 6:
					System.out.print("Nhập mã nhân viên của nhân viên cần tìm: ");
					String MNV = sc.nextLine();
					danhSachNhanVien.timNhanVienTheoMNV(MNV);
					break;
				case 7:
					Locale locale = Locale.forLanguageTag("vi-VN");
					NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
					System.out.println("- Tổng lương của nhân viên: " + nf.format(danhSachNhanVien.tinhTongLuong()));
					break;
				case 8:
					System.out.print("Nhập vị trí nhân viên cần xóa: ");
					int index = sc.nextInt();
					sc.nextLine();
					danhSachNhanVien.xoaNhanVienTaiViTriThuK(index);
					break;
				case 9:
					System.out.println("==== BXH lương của nhân viên ====");
					danhSachNhanVien.bxhLuongNV();
					break;
				case 10:
					System.out.print("Nhập vị trí của nhân viên cần thay thế: ");
					int viTri = sc.nextInt();
					sc.nextLine();
	
					SettingMenu.employeeTypeMenu();
					System.out.print("Chọn loại nhân viên cần thay thế: ");
					int loaiNV = sc.nextInt();
					sc.nextLine();
	
					if (loaiNV == 1) {
						NVBC nVBC = new NVBC();
						nVBC.nhapNhanVienBienChe(sc);
						danhSachNhanVien.thayTheNhanVienTaiViTriThuK(nVBC, viTri);
						System.out.println("Đã thay thế thành công nhân viên tại vị trí thứ " + viTri + "!");
					} else if (loaiNV == 2) {
						NVHD nVHD = new NVHD();
						nVHD.nhapNhanVienHopDong(sc);
						danhSachNhanVien.thayTheNhanVienTaiViTriThuK(nVHD, viTri);
						System.out.println("Đã thay thế thành công nhân viên tại vị trí thứ " + viTri + "!");
					}
					break;
				case 11:
					danhSachNhanVien.writeFileText();
					System.out.println("Đã ghi file thành công!");
					break;
				case 12:
					SettingMenu.employeeTypeMenu();
					System.out.print("Chọn loại nhân viên cần ghi File: ");
					int loaiNhanVien = sc.nextInt();
	
					if (loaiNhanVien == 1) {
						danhSachNhanVien.writeFileTextByType("NVBC");
						System.out.println("Đã ghi File NVBC thành công!");
					} else if (loaiNhanVien == 2) {
						danhSachNhanVien.writeFileTextByType("NVHD");
						System.out.println("Đã ghi File NVHD thành công!");
					}
					break;
				case 13:
					danhSachNhanVien.readFileText();
					break;
				case 14:
					SettingMenu.logOutMenu();
					return;
				default:
					System.out.println("Lựa chọn không hợp lệ!" + "\n" + "Vui lòng chọn lại lựa chọn của bạn (1-12)!");
			}
		}
	}
}
