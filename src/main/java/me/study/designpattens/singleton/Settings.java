package me.study.designpattens.singleton;

public class Settings {

    private Settings() {

    }

    private static final class SettingsHolder {
        private static final Settings instance = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.instance;
    }
}
