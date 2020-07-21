package net.hystoric.essentials.utilidades;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class HystoricCriar {
	
	private ItemStack item;
	private ItemMeta meta;
	
	public HystoricCriar(Material material) {
		this.item = new ItemStack(material);
        this.meta = item.getItemMeta();
	}
	
	public HystoricCriar quantidade(int quantidade) {
		item.setAmount(quantidade);
		return this;
	}
	
	public HystoricCriar nome(String nome) {
		meta.setDisplayName(nome);
		return this;
	}
	
	public HystoricCriar lore(String... lore) {
		meta.setLore(Arrays.asList(lore));
		return this;
	}
	
	public HystoricCriar durabilidade(short durabilidade) {
		item.setDurability(durabilidade);
		return this;
	}
	
	public ItemStack build() {
		item.setItemMeta(meta);
		return item;
	}
}