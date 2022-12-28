package com.alexandr.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static com.alexandr.javacore.constants.CustomConstants.*;

public class DirList {
    public static void main(String[] args) {
        String dirName = JAVACORE_PATH;

        DirectoryStream.Filter<Path> how =
                entry -> {
                    if (Files.isWritable(entry)) return true;
                    return false;
                };

        try (DirectoryStream<Path> directoryStream =
                Files.newDirectoryStream(Paths.get(dirName), how)){

            System.out.println("The catalog " + dirName);

            for (Path entry : directoryStream) {
                BasicFileAttributes attributes =
                        Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.println("<DIR> ");
                } else {
                    System.out.println("      ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println(PATH_ERROR + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + DOES_NOT_THE_CATALOG);
        } catch (IOException e) {
            System.out.println(ERROR_IO + e);
        }
    }
}
