package net.ayumichizuru.randachisvrblk.block;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block UNRESTRICTED_PISTON_HEAD = registerBlock("unrestricted_piston_head",
            new UnrestrictedPistonHead(FabricBlockSettings.of(Material.PISTON).strength(1.5F)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(RandAchiSvrBlk.MOD_ID, name), block);
    }


    public static void registerModBlocks() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Blocks for " + RandAchiSvrBlk.MOD_ID);
    }

}
