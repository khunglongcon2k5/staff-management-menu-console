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

public class NVHD extends NV {
	private double luongHopDong;
	private String loaiHD;
	
	public NVHD(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh, double luongHopDong,
			String loaiHD) {
		super(maNhanVien, hoTen, ngaySinh, gioiTinh);
		this.luongHopDong = luongHopDong;
		this.loaiHD = loaiHD;
	}

	public NVHD() {
		
	}
	
	/**
	 * @return the luongHopDong
	 */
	public double getLuongHopDong() {
		return luongHopDong;
	}

	/**
	 * @param luongHopDong the luongHopDong to set
	 */
	public void setLuongHopDong(double luongHopDong) {
		this.luongHopDong = luongHopDong;
	}

	/**
	 * @return the loaiHD
	 */
	public String getLoaiHD() {
		return loaiHD;
	}

	/**
	 * @param loaiHD the loaiHD to set
	 */
	public void setLoaiHD(String loaiHD) {
		this.loaiHD = loaiHD;
	}

	@Override
	public String toString() {
		return super.toString() + "Lương hợp đồng: " + luongHopDong + ". Loại hợp đồng: " + loaiHD + "\n";
	}
	
	public void nhapNhanVienHopDong(Scanner sc) {
		super.nhapNhanVien(sc);
		System.out.print("- Nhập lương hợp đồng: "); this.luongHopDong = sc.nextDouble(); sc.nextLine();
		System.out.print("- Nhập loại hợp đồng: "); this.loaiHD = sc.nextLine();
	}

	@Override
	public String loaiNhanVien() {
		return "NVHD";
	}

	@Override
	public double tinhTongLuong() {
		return luongHopDong;
	}
}
