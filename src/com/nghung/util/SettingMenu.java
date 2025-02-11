/*
 * 
 * @author NguyenHung
 * @date Dec 2, 2024
 * @version 1.0
 *
 */

package com.nghung.util;

public class SettingMenu {
	public static void mainMenu() {
		System.out.println("||====================================||");
		System.out.println("||          Quản Lý Nhân Viên         ||");
		System.out.println("||================ MENU ==============||");
		System.out.println("|| 1. Thêm NV.                        ||");
		System.out.println("|| 2. Xóa NV dựa trên MNV.            ||");
		System.out.println("|| 3. Hiển thị DSNV.                  ||");
		System.out.println("|| 4. Hiển thị DSNV theo loại.        ||");
		System.out.println("|| 5. Hiển thị DSNV HD dài hạn.       ||");
		System.out.println("|| 6. Tìm NV dựa trên MNV.            ||");
		System.out.println("|| 7. Tính tổng lương NV.             ||");
		System.out.println("|| 8. Xóa NV tại vị trí thứ K.        ||");
		System.out.println("|| 9. BXH Lương của NV từ cao - thấp. ||");
		System.out.println("|| 10. Thay thế NV tại vị trí thứ K.  ||");
		System.out.println("|| 11. Ghi file Text.                 ||");
		System.out.println("|| 12. Ghi file Text theo loại.       ||");
		System.out.println("|| 13. Đọc file Text.                 ||");
		System.out.println("|| 14. Đăng xuất.                     ||");
		System.out.println("||====================================||");
	}
	
	public static void employeeTypeMenu() {
		System.out.println();
		System.out.println("||====================================||");
		System.out.println("||            Chọn loại               ||");
		System.out.println("||============== LOẠI ================||");
		System.out.println("|| 1. NVBC.                           ||");
		System.out.println("|| 2. NVHD.                           ||");
		System.out.println("||====================================||");
	}
	
	public static void logOutMenu() {
		System.out.println();
		System.out.println("||************************************||");
		System.out.println("||                                    ||");
		System.out.println("||************ THANK YOU! ************||");
		System.out.println("||       Log out successfully!        ||");
		System.out.println("||       Have a wondeful day!         ||");
		System.out.println("||       Thank you & Goodbye^^!	      ||");
		System.out.println("||************************************||");
		System.out.println();
	}
}
