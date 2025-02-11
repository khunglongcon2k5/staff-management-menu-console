/*
 * 
 * @author NguyenHung
 * @date Dec 2, 2024
 * @version 1.0
 *
 */

package com.nghung.model;

import java.time.LocalDate;
import java.util.Scanner;

public class NVBC extends NV {
	private double heSoLuong;
	private double soNamCT;
	
	public NVBC() {
		
	}
	
	public NVBC(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh, double heSoLuong,
			double soNamCT) {
		super(maNhanVien, hoTen, ngaySinh, gioiTinh);
		this.heSoLuong = heSoLuong;
		this.soNamCT = soNamCT;
	}

	/**
	 * @return the heSoLuong
	 */
	public double getHeSoLuong() {
		return heSoLuong;
	}

	/**
	 * @param heSoLuong the heSoLuong to set
	 */
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	/**
	 * @return the soNamCT
	 */
	public double getSoNamCT() {
		return soNamCT;
	}

	/**
	 * @param soNamCT the soNamCT to set
	 */
	public void setSoNamCT(double soNamCT) {
		this.soNamCT = soNamCT;
	}

	@Override
	public String toString() {
		return super.toString() + "Hệ số lương: " + heSoLuong + ". Số năm công tác: " + soNamCT + "\n";
	}
	
	public void nhapNhanVienBienChe(Scanner sc) {
		super.nhapNhanVien(sc);
		System.out.print("- Nhập hệ số lương: "); this.heSoLuong = sc.nextDouble(); sc.nextLine();
		System.out.print("- Nhập số năm công tác: "); this.soNamCT = sc.nextDouble(); sc.nextLine();
	}

	@Override
	public String loaiNhanVien() {
		return "NVBC";
	}

	@Override
	public double tinhTongLuong() {
		double luongCoBan = 1800000;
		return (luongCoBan * heSoLuong);
	}
}
