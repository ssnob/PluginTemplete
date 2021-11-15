package com.ssno.templete;

import org.bukkit.plugin.java.JavaPlugin;

import commands.TestCommand;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		new TestCommand(this);
	}
}
