package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(FILE_TEST_PATH))){
            long size = fileChannel.size();

            MappedByteBuffer mappedByteBuffer =
                    fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for (int i = 0; i < size; i++){
                System.out.print((char) mappedByteBuffer.get());
            }
            System.out.println();
        }catch (InvalidPathException e){
            System.out.println(PATH_ERROR + e);
        }catch (IOException e){
            System.out.println(ERROR_IO + e);
        }
    }
}
