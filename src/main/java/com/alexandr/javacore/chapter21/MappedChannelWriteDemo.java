package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class MappedChannelWriteDemo {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;
        ByteBuffer byteBuffer;

        try {
            randomAccessFile = new RandomAccessFile(FILE_TEST_4_EMPTY_PATH, "rw");
            fileChannel = randomAccessFile.getChannel();
            byteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++){
                byteBuffer.put((byte) ('A' + i));
            }
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }finally {
            try {
                if (fileChannel != null) fileChannel.close();
            }catch (IOException e){
                System.out.println(ERROR_CLOSE_CHANNEL);
            }
            try {
                if (randomAccessFile != null) randomAccessFile.close();
            }catch (IOException e){
                System.out.println(ERROR_CLOSE_THE_FILE);
            }
        }
    }
}
