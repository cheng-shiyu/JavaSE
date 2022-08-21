package com.chengshiyu.MakeVideo;

import org.bytedeco.javacv.*;

/**
 * @author 程世玉
 * @data 2022/8/12.
 */
public class MakeVideoDemo01 {
    public static void main(String[] args) throws FrameGrabber.Exception, FrameRecorder.Exception {
        String fileUrl = "D:\\Java\\IdeaProjects\\JavaSE\\Java_0812_camera\\img\\a.mp4";
        String rtsp = "rtsp://admin:hncz123654@192.168.0.199:554/Streaming/Channels/101";
        int videoDurationSecond = 30;

        FFmpegFrameGrabber grabber = FFmpegFrameGrabber.createDefault(rtsp);

        grabber.setOption("rstp_transport", "tcp");

        grabber.start();


        FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(fileUrl, 1280, 720, 1);
        // 开启记录器
        recorder.start();

        long timestart = System.currentTimeMillis();

        Frame frame = null;



        while ((frame = grabber.grabFrame()) != null) {
            recorder.record(frame);
        }

        recorder.stop();
        System.out.println("停止recorder");
        grabber.stop();
        System.out.println("成功释放");
    }
}
