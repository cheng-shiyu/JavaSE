package com.chengshiyu.TakePhoto;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 程世玉
 * @data 2022/8/12.
 * 1、连接摄像头并进行拍摄，保存到本地
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        String rtspUrl = "rtsp://admin:hncz123654@192.168.0.199:554/Streaming/Channels/101";

        String fileUrl = "D:\\Java\\IdeaProjects\\JavaSE\\Java_0812_camera\\img\\a.jpg";

        FFmpegFrameGrabber grabber = FFmpegFrameGrabber.createDefault(rtspUrl);

        grabber.setOption("rtsp_transport","tcp");

        grabber.start();

        Frame frame = grabber.grabImage();

        File file = new File(fileUrl);

        if (frame != null){
            ImageIO.write(frameToBufferImage(frame),"jpg",file);
            grabber.stop();
            grabber.release();
        }


    }


    private static BufferedImage frameToBufferImage(Frame frame) {
        Java2DFrameConverter converter = new Java2DFrameConverter();
        return converter.getBufferedImage(frame);
    }
}
