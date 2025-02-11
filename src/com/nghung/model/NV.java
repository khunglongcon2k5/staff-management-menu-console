/*
 * 
 * @author NguyenHung
 * @date Dec 2, 2024
 * @version 1.0
 *
 */

package com.nghung.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class NV {
	private String maNhanVien;
	private String hoTen;
	private LocalDate ngaySinh;
	private String gioiTinh;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

	public NV(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}
	
	public NV() {
		
	}
	
	/**
	 * @return the maNhanVien
	 */
	public String getMaNhanVien() {
		return maNhanVien;
	}

	/**
	 * @param maNhanVien the maNhanVien to set
	 */
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the ngaySinh
	 */
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "Mã nhân viên: " + maNhanVien + ". Họ tên: " + hoTen + ". Ngày sinh: " + dtf.format(ngaySinh) + ". Giới tính: " + gioiTinh + ". ";
	}
	
	public void nhapNhanVien(Scanner sc) {
		System.out.print("- Nhập mã nhân viên: "); this.maNhanVien = sc.nextLine();
		System.out.print("- Nhập họ tên: " ); this.hoTen = sc.nextLine();
		
		while (ngaySinh == null) {
			try {
				System.out.print("- Nhập ngày/tháng/năm sinh (yyyy/MM/dd): "); 
				String dob = sc.nextLine();
				ngaySinh = LocalDate.parse(dob, dtf);
			} catch (Exception e) {
				System.err.print("Định dạng ngày sinh bạn nhập không đúng!" + "\n" + "Vui lòng nhập đúng định dạng ngày sinh (yyyy/MM/dd)" + "\n");
			}
		}
		
		System.out.print("- Nhập giới tính (Nam/Nữ): "); this.gioiTinh = sc.nextLine();
	}
	
	public abstract String loaiNhanVien();
	
	public abstract double tinhTongLuong();
}
