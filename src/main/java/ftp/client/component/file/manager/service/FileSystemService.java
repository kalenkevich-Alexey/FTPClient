package ftp.client.component.file.manager.service;

import ftp.client.component.file.FileItem;

import java.io.File;
import java.util.List;

/**
 * Created by a.kalenkevich on 08.02.2017.
 */
public interface FileSystemService {
    List<FileItem> getFilesFromDirectory(String directoryName);
    void renameFile(File file, String name);
    void deleteFile(File file);
    void addFile(File file);
}
