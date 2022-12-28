package com.alexandr.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class MappedChannelReadDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        long size;
        MappedByteBuffer mappedByteBuffer;

        try {
            fileInputStream = new FileInputStream(FILE_TEST_PATH);
            fileChannel = fileInputStream.getChannel();
            size = fileChannel.size();
            mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for (int i = 0; i < size; i++){
                System.out.print((char) mappedByteBuffer.get());
            }
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
