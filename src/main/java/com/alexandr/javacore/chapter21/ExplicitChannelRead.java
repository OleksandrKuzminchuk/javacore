package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;

        try(SeekableByteChannel seekableByteChannel = Files.newByteChannel(Paths.get(FILE_TEST_PATH))){

            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            do {
                count = seekableByteChannel.read(byteBuffer);
                if (count != -1){
                    byteBuffer.rewind();
                    for (int i = 0; i < count; i++){
                        System.out.print((char) byteBuffer.get());
                    }
                }
            }while (count != -1);
            System.out.println();
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
