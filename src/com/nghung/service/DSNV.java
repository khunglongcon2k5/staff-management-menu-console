/*
 * 
 * @author NguyenHung
 * @date Dec 2, 2024
 * @version 1.0
 *
 */

package com.nghung.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.nghung.model.NV;
import com.nghung.model.NVHD;
import com.nghung.util.Constants;

public class DSNV {
	private List<NV> danhSachNhanVien = new ArrayList<>();
	
	public void themNhanVien(NV nV) {
		danhSachNhanVien.add(nV);
	}
	
	public boolean xoaNhanVienTheoMNV(String maNhanVien) {
		Iterator<NV> iterator = danhSachNhanVien.iterator();
		while (iterator.hasNext()) {
			NV nv = iterator.next();
			if (nv.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	/*
	 * -> STREAM API
	 * public boolean xoaNhanVienTheoMNV(String maNhanVien) {
	 *	 return danhSachNhanVien.removeIf(nhanVien -> nhanVien.getMaNhanVien().equalsIgnoreCase(maNhanVien));
	 * }
	 * 
	 */
	 
	public void hienThiDanhSachNhanVien() {
		for (NV nV : danhSachNhanVien) {
			System.out.println(nV.toString());
		}
	}
	
	public void hienThiDSNVTheoLoai(String type) {
		for (NV nV : danhSachNhanVien) {
			if (nV.loaiNhanVien().equalsIgnoreCase(type)) {
				System.out.println(nV.toString());
				System.out.println();
			}
		}
	}
	
	public void hienThiDSNVHopDongDaiHan() {
		for (NV nV : danhSachNhanVien) {
			if (nV instanceof NVHD) {
				NVHD nVHD = (NVHD) nV;
				if (nVHD.getLoaiHD().equalsIgnoreCase("DH")) {
					System.out.println(nV.toString());
				}
			}
		}
	}
	
	public void writeFileText() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Constants.FILE_INPUT_TXT)))) {
			for (NV nV : danhSachNhanVien) {
				bw.write(nV.toString());
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFileTextByType(String type) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Constants.FILE_INPUT_TXT)))) {
			for (NV nV : danhSachNhanVien) {
				if (nV.loaiNhanVien().equalsIgnoreCase(type)) {
					bw.write(nV.toString());
					bw.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readFileText() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Constants.FILE_INPUT_TXT)))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NV nV : danhSachNhanVien) {
			tongLuong += nV.tinhTongLuong();
		}
		return tongLuong;
	}
	
	public boolean timNhanVienTheoMNV(String maNhanVien) {
		Iterator<NV> iterator = danhSachNhanVien.iterator();
		while (iterator.hasNext()) {
			NV nV = iterator.next();
			if (nV.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
				System.out.println(nV.toString());
				return true;
			}
		}
		return false;
	}
	
	public void xoaNhanVienTaiViTriThuK(int index) {
		danhSachNhanVien.remove(index);
	}
	
	public void thayTheNhanVienTaiViTriThuK(NV nV, int index) {
		danhSachNhanVien.set(index, nV);
	}
	
	public void bxhLuongNV() {
		Collections.sort(this.danhSachNhanVien, new Comparator<NV>() {
			@Override
			public int compare(NV o1, NV o2) {
				return Double.compare(o1.tinhTongLuong(), o2.tinhTongLuong());
			}
		});
	}
	
}
