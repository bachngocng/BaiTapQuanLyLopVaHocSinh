package com.codegym.controller;

import com.codegym.model.Lop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LopManagement implements GeneralManagement<Lop>, ReadFile, WriteFile {
    private List<Lop> lops = new ArrayList<>();

    @Override
    public void displayAll() {
        for (Lop lop : lops) {
            System.out.println(lops);
        }
    }

    @Override
    public void addNew(Lop lop) {
        lops.add(lop);
    }

    public int findClazzById(String id) {
        int index = -1;
        for (int i = 0; i < lops.size(); i++) {
            if (lops.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void updateById(String id, Lop lop) {
        int index = findClazzById(id);
        lops.set(index, lop);
    }

    @Override
    public boolean deleteById(String id) {
        int index = findClazzById(id);
        if (index != -1) {
            lops.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Lop getById(String id) {
        int index = findClazzById(id);
        return lops.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.lops = (List<Lop>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.lops);
    }
}
