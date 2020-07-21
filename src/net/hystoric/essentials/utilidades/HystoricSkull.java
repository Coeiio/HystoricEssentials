package net.hystoric.essentials.utilidades;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class HystoricSkull {
	
	private ItemStack item;
	private SkullMeta meta;
	
	public HystoricSkull(Material material) {
		this.item = new ItemStack(material);
        this.meta = (SkullMeta) item.getItemMeta();
	}
	
	public HystoricSkull quantidade(int quantidade) {
		item.setAmount(quantidade);
		return this;
	}
	
	public HystoricSkull dono(String dono) {
		meta.setOwner(dono);
		return this;
	}
	
	public HystoricSkull nome(String nome) {
		meta.setDisplayName(nome);
		return this;
	}
	
	public HystoricSkull lore(String... lore) {
		meta.setLore(Arrays.asList(lore));
		return this;
	}
	
	public HystoricSkull durabilidade(short durabilidade) {
		item.setDurability(durabilidade);
		return this;
	}
	
	public ItemStack build() {
		item.setItemMeta(meta);
		return item;
	}
}