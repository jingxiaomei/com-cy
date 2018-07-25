package com.cy.conterller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QRcodeEncode {

    public static void main(String[] args) {
        try {
            //二维码内容
            String content = "www.baidu.com";
            //二维码生成路径
            String path = "D:/idea";
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400,hints);
            File file1 = new File(path,"test.jpg");
            ImageWrite.writeToFile(bitMatrix, "jpg", file1);
            System.out.println("二维码已生成！");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}
