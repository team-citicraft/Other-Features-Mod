package com.shadow.tbum.init;

import com.shadow.tbum.UtilitiesMod;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            UtilitiesMod.MOD_ID);

}
