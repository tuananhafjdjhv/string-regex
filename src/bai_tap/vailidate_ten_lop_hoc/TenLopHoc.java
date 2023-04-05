package bai_tap.vailidate_ten_lop_hoc;

import java.util.Scanner;

public class TenLopHoc {
    public static final String regex = "^[CAP]\\d{4}[GHIKLM]$";

    public static boolean check(String str) {
        return str.matches(regex);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhập chuỗi: ");
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();
            System.out.println(check(string));
        }
    }
}
