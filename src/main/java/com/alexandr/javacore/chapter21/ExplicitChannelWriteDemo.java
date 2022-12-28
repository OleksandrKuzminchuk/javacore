package com.alexandr.javacore.chapter21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ExplicitChannelWriteDemo {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;
        FileChannel fileChannel = null;
        ByteBuffer byteBuffer;

        try {
            outputStream = new FileOutputStream(FILE_TEST_4_EMPTY_PATH);
            fileChannel = outputStream.getChannel();
            byteBuffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++){
                byteBuffer.put((byte) ('A' + i));
            }
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }finally {
            try {
                if (outputStream != null) outputStream.close();
            }catch (IOException e){
                System.out.println(ERROR_CLOSE_CHANNEL);
            }
        }
    }
}
