package com.cy.conterller;


import com.cy.util.QRCodeUtil;
import jp.sourceforge.qrcode.data.QRCodeImage;

import java.awt.image.BufferedImage;

/**
 * 解析二维码
 */
public class MyQrCodeImage implements QRCodeImage{


    BufferedImage bufferedImage;

    public MyQrCodeImage(BufferedImage bufferedImage){
        this.bufferedImage = bufferedImage;

    }


    @Override
    public int getWidth() {
        return bufferedImage.getWidth();
    }

    @Override
    public int getHeight() {
        return bufferedImage.getHeight();
    }

    @Override
    public int getPixel(int arg0, int arg1) {
        return bufferedImage.getRGB(arg0,arg1);
    }
}
