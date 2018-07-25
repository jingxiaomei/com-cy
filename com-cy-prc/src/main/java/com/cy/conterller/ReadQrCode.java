package com.cy.conterller;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadQrCode {

    /**
     * 读取二维码
     * @param args
     */
    public static void main(String[] args) {


        try {
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            File file = new File("C:/Users/cy109/Desktop/qrcode.png");
            BufferedImage read = ImageIO.read(file);
            //定义二维码参数
            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET,"utf-8");

            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(read)));
            Result result = multiFormatReader.decode(binaryBitmap, hints);
            System.out.println("读取二维码： " + result.toString());
            System.out.println("二维码格式： " + result.getBarcodeFormat());
            System.out.println("二维码内容： " + result.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NotFoundException e) {
            e.printStackTrace();
        }
    }
}
