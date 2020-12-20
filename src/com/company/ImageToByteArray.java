package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class ImageToByteArray {
    public static void main(String args[]) throws Exception{
        BufferedImage bImage = ImageIO.read(new File("lena.tif"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "jpg", bos );
        byte [] data = bos.toByteArray();
        System.out.println(data.length);
    }
}
