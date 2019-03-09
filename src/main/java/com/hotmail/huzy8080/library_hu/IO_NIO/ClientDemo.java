package com.hotmail.huzy8080.library_hu.IO_NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class ClientDemo {
    public static void main(String[] args) {

        ByteBuffer buffer=ByteBuffer.allocate(1024);
        SocketChannel channel=null;
        try {
            channel=SocketChannel.open();
            channel.configureBlocking(false);
            channel.connect(new InetSocketAddress("localhost",8080));
            if(channel.finishConnect()){
                int i=0;
                while (true){
                    TimeUnit.SECONDS.sleep(1);
                    //往缓冲区写信息，先清空缓冲区，然后写入，然后flip告知写入完毕
                    String info="I am "+ i++ +"th info from client ";
                    buffer.clear();
                    buffer.put(info.getBytes());
                    buffer.flip();
                    //开始往channel写入缓冲区的内容
                    while (buffer.hasRemaining()){
                        System.out.println(buffer);
                        channel.write(buffer);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(channel!=null){
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
