package com.codegym.view;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        MenuLop menuLop = new MenuLop();
        MenuStudent menuStudent = new MenuStudent();
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    menuStudent.run();
                    break;
                }
                case 2: {
                    menuLop.run();
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("1. Quản lý học viên");
        System.out.println("2. Quản lý lớp học");
        System.out.println("0. Thoát");
    }
}
