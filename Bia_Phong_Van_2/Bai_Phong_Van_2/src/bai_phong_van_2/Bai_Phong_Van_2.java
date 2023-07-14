/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_phong_van_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_Phong_Van_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        System.out.println("ÐAU VAO:");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length() - 1; i++) {
            char kiTuThuI = input.charAt(i);
            char kiTuTiepTheo = input.charAt(i + 1);
            String chuoi2KiTu = "" + kiTuThuI + kiTuTiepTheo;
            if (checkTelexLatin(chuoi2KiTu)) {
                stringList.add(chuoi2KiTu);
            }
            if (checkTelex1KiTu(kiTuThuI)) {
                stringList.add(String.valueOf(kiTuThuI));
            }
        }
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                if (stringList.get(i).equals(stringList.get(j)) || stringList.get(j).equalsIgnoreCase("w")) {
                    stringList.remove(j);
                }
            }
        }
        System.out.println(stringList.size() + "(" + (String.join(",", stringList)) + ")");
    }

    public static boolean checkTelexLatin(String chuoi2KiTu) {
        if (chuoi2KiTu.equals("aw")) {
            return true;
        } else if (chuoi2KiTu.equals("dd")) {
            return true;
        } else if (chuoi2KiTu.equals("ee")) {
            return true;
        } else if (chuoi2KiTu.equals("oo")) {
            return true;
        } else if (chuoi2KiTu.equals("ow")) {
            return true;
        } else if (chuoi2KiTu.equals("aa")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTelex1KiTu(char chuoi1KiTu) {
        if (chuoi1KiTu == 'w') {
            return true;
        } else {
            return false;
        }
    }
}
