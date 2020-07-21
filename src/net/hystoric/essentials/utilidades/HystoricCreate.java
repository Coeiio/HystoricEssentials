package net.hystoric.essentials.utilidades;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class HystoricCreate {
	
	private ItemStack item;
	private ItemMeta meta;
	
	@SuppressWarnings("deprecation")
	public HystoricCreate(int material) {
		this.item = new ItemStack(Material.getMaterial(material));
        this.meta = item.getItemMeta();
	}
	
	public HystoricCreate quantidade(int quantidade) {
		item.setAmount(quantidade);
		return this;
	}
	
	public HystoricCreate nome(String nome) {
		meta.setDisplayName(nome);
		return this;
	}
	
	public HystoricCreate lore(String... lore) {
		meta.setLore(Arrays.asList(lore));
		return this;
	}
	
	public HystoricCreate durabilidade(short durabilidade) {
		item.setDurability(durabilidade);
		return this;
	}
	
	public ItemStack build() {
		item.setItemMeta(meta);
		return item;
	}
}