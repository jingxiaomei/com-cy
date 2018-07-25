package com.cy.conterller;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public class CreateConterller {

    /**
     * 生成二维码
     * @param args
     */
    public static void main(String[] args) {

        //二维码宽
        int width = 300;
        //二维码高
        int height = 300;
        //二维码格式
        String format = "png";
        //二维码内容
        String content = "www.baidu.com";

        //定义二维码参数
        HashMap map = new HashMap();
        //设置编码
        map.put(EncodeHintType.CHARACTER_SET,"utf-8");
        //设置纠错等级
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        map.put(EncodeHintType.MARGIN, 2);


        try {
            //生成二维码
            BitMatrix encode = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
            Path file = new File("C:/Users/cy109/Desktop/qrcode.png").toPath();
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
        }catch (WriterException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
