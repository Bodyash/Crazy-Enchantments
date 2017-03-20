package me.BadBones69.CrazyEnchantments.API.currencyapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import me.BadBones69.CrazyEnchantments.multisupport.Support;
import net.milkbowl.vault.economy.Economy;

public class VaultSupport {
	
	private static Economy vault = null;
	
	public static Economy getVault(){
		return vault;
	}
	
	public static void loadVault(){
		if(Support.hasVault()){
			RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
			if(rsp != null){
				vault = rsp.getProvider();
			}
		}
	}
	
}
