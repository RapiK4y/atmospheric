package com.teamabnormals.atmospheric.core.data.server.tags;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.atmospheric.core.other.tags.AtmosphericBiomeTags;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBiomeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.teamabnormals.atmospheric.core.registry.AtmosphericBiomes.*;

public class AtmosphericBiomeTagsProvider extends BiomeTagsProvider {

	public AtmosphericBiomeTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Atmospheric.MOD_ID, existingFileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BiomeTags.IS_JUNGLE).addTag(AtmosphericBiomeTags.IS_RAINFOREST);
		this.tag(BiomeTags.HAS_MINESHAFT).addTags(AtmosphericBiomeTags.IS_RAINFOREST, AtmosphericBiomeTags.IS_DUNES);
		this.tag(BiomeTags.IS_OVERWORLD).addTags(AtmosphericBiomeTags.IS_RAINFOREST, AtmosphericBiomeTags.IS_DUNES);
		this.tag(BiomeTags.STRONGHOLD_BIASED_TO).addTags(AtmosphericBiomeTags.IS_RAINFOREST, AtmosphericBiomeTags.IS_DUNES);

		this.tag(BlueprintBiomeTags.IS_DESERT).addTag(AtmosphericBiomeTags.IS_DUNES);
		this.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT).addTags(AtmosphericBiomeTags.IS_DUNES);
		this.tag(BiomeTags.SPAWNS_WARM_VARIANT_FROGS).addTags(AtmosphericBiomeTags.IS_DUNES);
		this.tag(BiomeTags.WATER_ON_MAP_OUTLINES).add(RAINFOREST_BASIN.get(), SPARSE_RAINFOREST_BASIN.get());

		this.tag(AtmosphericBiomeTags.IS_RAINFOREST).add(RAINFOREST.get(), SPARSE_RAINFOREST.get(), RAINFOREST_BASIN.get(), SPARSE_RAINFOREST_BASIN.get());
		this.tag(AtmosphericBiomeTags.IS_DUNES).add(DUNES.get(), FLOURISHING_DUNES.get(), ROCKY_DUNES.get(), PETRIFIED_DUNES.get());
		this.tag(AtmosphericBiomeTags.HAS_ARID_SHRINE).addTag(AtmosphericBiomeTags.IS_DUNES);

		this.tag(AtmosphericBiomeTags.HAS_DESERT_YUCCA_TREES).add(Biomes.DESERT);
		this.tag(AtmosphericBiomeTags.HAS_BADLANDS_YUCCA_TREES).add(Biomes.WOODED_BADLANDS);
		this.tag(AtmosphericBiomeTags.HAS_SAVANNA_YUCCA_TREES).add(Biomes.WINDSWEPT_SAVANNA);
	}
}