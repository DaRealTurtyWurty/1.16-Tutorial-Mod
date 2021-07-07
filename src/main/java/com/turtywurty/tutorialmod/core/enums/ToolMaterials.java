package com.turtywurty.tutorialmod.core.enums;

import java.util.function.Supplier;

import com.turtywurty.tutorialmod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ToolMaterials implements IItemTier {
	TUTORIAL(5, 5000, 12.0f, 5.5f, 8, () -> Ingredient.fromItems(ItemInit.EXAMPLE_ITEM.get()));

	private final int harvestLevel, maxUses, enchantability;
	private final float efficiency, attackDamage;
	private final LazyValue<Ingredient> repairMaterial;

	private ToolMaterials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn,
			int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = new LazyValue<Ingredient>(repairMaterialIn);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
