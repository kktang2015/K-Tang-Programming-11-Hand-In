package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String kodiak = Scan.nextLine();
        simpleEncryptor(kodiak);
        String Iceberg = simpleEncryptor(kodiak);
        String Arctic = Decrypter(Iceberg);
        System.out.println("Encrypted string: " + Iceberg);


        System.out.println(  "Decrypted: " + Arctic );


    }

    public static String simplEncryptor2(String sen) {
        String Encrypt = "";
        char letter;
        for (int i = 0; i < sen.length(); i++) {
            letter = sen.charAt(i);
            if (letter == 'a') {
                letter = 'a';
                continue;
            }
            letter++;
            Encrypt += letter;
        }
        return Encrypt;
    }

    public static String simpleEncryptor(String sen) {
        char[] result = sen.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] += 900;
        }

        String encryptedString = new String(result);
        return encryptedString;
    }

    public static String Decrypter(String sen) {
        char[] result = sen.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] += -900;
        }
        String encryptedString = new String(result);
        return encryptedString;
    }
}





