package com.example.file_qlgv.storage;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    private Context mcontext;

    public FileHelper(Context context) {
        this.mcontext = context;
    }

    public <T> void saveData(ArrayList<T> arrayList, String filename) {
        try {
            FileOutputStream fileOutputStream = mcontext.openFileOutput(filename, Context.MODE_PRIVATE);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(arrayList);
            out.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> ArrayList<T> getData(String filename) {
        ArrayList<T> temp = new ArrayList<>();

        try {
            FileInputStream inputStream = mcontext.openFileInput(filename);
            ObjectInputStream in = new ObjectInputStream(inputStream);
            temp = (ArrayList<T>) in.readObject();
            in.close();
            inputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return temp;
    }

}