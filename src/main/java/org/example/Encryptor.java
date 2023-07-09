package org.example;

public class Encryptor {


    public static String encryptPass(String password) {

        Keys.initKeys();

        char[] splitPassword = password.toCharArray();
        StringBuilder encryptedPassword = new StringBuilder();

        for (int i = 0; i < splitPassword.length; i++) {
            encryptedPassword.append(Keys.getKey(splitPassword[i]));
        }

        return encryptedPassword.toString();
    }

    public static void decryptPass(String encryPass) {

    }
}