package com.ruff.callhello;

import com.ruff.hello.client.PosClient;
import com.ruff.hello.client.Utils;

import java.util.Date;
import java.util.Random;

public class Centers {
    static String privateKey = "7a90e31dcd8e7b60dd89c9824cc96064c5e1538f94b7d7c1b3e5bf6a7a935cb8";
    static String contractAddress = "0x33368951f3ac3581a612c6bce20e405d094257bd";


    public static void main(String[] args) {
        System.out.println("Hello world.");

        PosClient posClient = new PosClient(1, privateKey);

        int rtn = posClient.getIndex(contractAddress);

        Random r = new Random();
        System.out.println("index is: " + rtn);

        String rand1 = String.valueOf(r.nextInt(1000));
        String rand2 = String.valueOf(r.nextInt(10));
        Utils.ErrCode rtn1 = posClient.InsertPosIn(
                contractAddress,
                "berth_" + rand1,
                new Date().toString(),
                0,
                1,
                "沪A00001" + rand2,
                0,
                0,
                1,
                "0xfdsfdffff"
        );
        System.out.println("---------------");
        System.out.println("berthId: " + "berth_" + rand1);
        System.out.println("PIn Return code is: " + rtn1);

        posClient.stop();

    }
}
