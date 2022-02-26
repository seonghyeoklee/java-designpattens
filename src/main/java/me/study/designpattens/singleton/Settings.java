package me.study.designpattens.singleton;

public class Settings {

    private static final Settings instance = new Settings();

    private Settings() {

    }

    public static Settings getInstance() {
        return instance;
    }
}
