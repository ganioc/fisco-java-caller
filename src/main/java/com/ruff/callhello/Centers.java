package com.ruff.callhello;

import com.ruff.hello.client.PosClient;

public class Centers {
    static String privateKey = "7a90e31dcd8e7b60dd89c9824cc96064c5e1538f94b7d7c1b3e5bf6a7a935cb8";
    static String contractAddress = "0x33368951f3ac3581a612c6bce20e405d094257bd";


    public static void main(String[] args) {
        System.out.println("Hello world.");

        PosClient posClient = new PosClient(1, privateKey);

        int rtn = posClient.getIndex(contractAddress);

        System.out.println("index is: " + rtn);

        posClient.stop();

    }
}
