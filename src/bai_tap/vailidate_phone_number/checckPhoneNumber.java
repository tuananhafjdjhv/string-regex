package bai_tap.vailidate_phone_number;

import java.util.Scanner;

public class checckPhoneNumber {
  public static   String regex = "\\(\\d{2}\\)-\\(0[0-9]{9}\\)";
    public static boolean checkPhoneNumber(String str){
        return str.matches(regex);
    };

    public static void main(String[] args) {
        System.out.println("nhập vào sdt");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(checkPhoneNumber(string));
    }
}
