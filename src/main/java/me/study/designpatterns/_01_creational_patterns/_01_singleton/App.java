package me.study.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         Settings settings1 = Settings.getInstance();

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        Settings settings2;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings1.equals(settings2));
    }
}
