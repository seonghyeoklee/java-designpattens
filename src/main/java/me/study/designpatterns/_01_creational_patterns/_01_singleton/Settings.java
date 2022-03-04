package me.study.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {

    }

    private static final class SettingsHolder {
        private static final Settings instance = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
