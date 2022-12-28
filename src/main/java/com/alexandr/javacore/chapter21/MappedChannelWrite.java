package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get(FILE_TEST_3_NO_EXISTS_PATH),
                        StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {

            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++){
                mappedByteBuffer.put((byte) ('A' + i));
            }
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (BufferOverflowException e){
            System.out.println(CAPACITY_ERROR + e);
        } catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
