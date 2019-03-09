package com.hotmail.huzy8080.library_hu.IO_NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class InputDemo {

    public static void main(String[] args) {
        fileInputWithIO();
        System.out.println("======NIO======");
        fileInputWithNIO();
    }

    public static void fileInputWithIO(){
        InputStream in=null;
        try {
            in=new BufferedInputStream(new FileInputStream("D:\\WorkSpace\\TestFile\\io.txt"));
            byte[] bytes=new byte[1024];
            int bytesRead=in.read(bytes);
            while (bytesRead!=-1){
                for (int i = 0; i < bytesRead; i++) {
                    System.out.println((char)bytes[i]);
                }
                bytesRead=in.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * Buffer使用步骤
     * 分配空间（ByteBuffer buf = ByteBuffer.allocate(1024)）
     * 写入数据到Buffer(int bytesRead = fileChannel.read(buf);)
     * 调用filp()方法（ buf.flip();）
     * 从Buffer中读取数据（System.out.print((char)buf.get());）
     * 调用clear()方法或者compact()方法
     */
    public static void fileInputWithNIO(){

        RandomAccessFile file=null;

        try {
            file=new RandomAccessFile("D:\\WorkSpace\\TestFile\\io.txt","rw");
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = channel.read(buffer);
            System.out.println(bytesRead);
            while (bytesRead!=-1){
                buffer.flip();
                while (buffer.hasRemaining()){
                    System.out.println((char)buffer.get());
                }
                buffer.compact();
                bytesRead = channel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(file!=null){
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
