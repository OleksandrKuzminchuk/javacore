package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class ExplicitChannelWriter {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get(FILE_TEST_3_NO_EXISTS_PATH),
                                     StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 26; i++) {
                    byteBuffer.put((byte) ('A' + i));
                }
                byteBuffer.put((byte) (' '));
                byteBuffer.rewind();
                fileChannel.write(byteBuffer);
                byteBuffer.rewind();
            }
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (BufferOverflowException e){
            System.out.println(CAPACITY_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
            System.exit(1);
        }
    }
}
