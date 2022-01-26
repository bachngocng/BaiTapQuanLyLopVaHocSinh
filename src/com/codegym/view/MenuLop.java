package com.codegym.view;

import com.codegym.controller.LopManagement;

import java.util.Scanner;

public class MenuLop {
    public static Scanner scanner = new Scanner(System.in);

    public void run() {
        LopManagement lopManagement = new LopManagement();
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Danh sách lớp");
                    lopManagement.displayAll();
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("1. Hiển thị danh sách lớp");
        System.out.println("2. Thêm lớp học mới");
        System.out.println("3. Cập nhật thông tin lớp học");
        System.out.println("4. Xóa lớp học");
        System.out.println("0. Quay lại");
    }
}