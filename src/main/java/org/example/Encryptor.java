package org.example;

public class Encryptor {

    private String password;
    private String decryPassword;
    private String encryPass;

    Encryptor() {
        this.setPassword(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String encryptPass(String password) {
        Keys key = new Keys();
        key.createKeys();
        char[] splPass = password.toCharArray();
        String[] encPassArr = new String[splPass.length - 1];

        for (int i = 0; i < splPass.length - 1; i++) {
            encPassArr[i] = key.getKey(splPass[i]);
        }

        String encPass = String.join("", encPassArr);

        return encPass;
    }

    public void decryptPass(String encryPass) {

    }

    public String getDecryPass() {
        return decryPassword;
    }

    public String getEncryPass() {
        return encryPass;
    }
}
