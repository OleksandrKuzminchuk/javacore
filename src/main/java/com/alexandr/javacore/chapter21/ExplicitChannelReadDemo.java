package com.alexandr.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ExplicitChannelReadDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        ByteBuffer byteBuffer;
        int count;

        try {
            fileInputStream = new FileInputStream(FILE_TEST_PATH);
            fileChannel = fileInputStream.getChannel();
            byteBuffer = ByteBuffer.allocate(128);
            do {
                count = fileChannel.read(byteBuffer);
                if (count != -1){
                    byteBuffer.rewind();
                    for (int i = 0; i < count; i++){
                        System.out.print((char) byteBuffer.get());
                    }
                }
            }while (count != -1);
            System.out.println();
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            }catch (IOException e){
                System.out.println(ERROR_CLOSE_CHANNEL);
            }
        }
    }
}
