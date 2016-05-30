package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.fileSystem;

import java.util.List;

public class Directory extends File {
    private List<File> files;
    private List<Directory> directories;
    private String name;

    public void addFile(File file){
        this.files.add(file);
    }

    public boolean addDirectory(Directory directory){
        return directories.add(directory);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

