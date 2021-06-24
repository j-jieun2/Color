package com;

import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[플러그인 활성화 중 입니다.]");
        getCommand("test").setExecutor(new Commands()); // test 명령어 입력 시 Command 클래스를 실행
    }

    @Override
    public void onDisable() {
        getLogger().info("[플러그인 비활성화 중 입니다.]");

    }
}