package com.shadow.tbum;

import com.shadow.tbum.init.BlockInit;
import com.shadow.tbum.init.ItemInit;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("tbum")
@Mod.EventBusSubscriber(modid = UtilitiesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UtilitiesMod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tbum";

    public UtilitiesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(UtilitiesMod.TAB))
                    .setRegistryName(block.getRegistryName()));
        });
    }

    public static final ItemGroup TAB = new ItemGroup("UtilitiesModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.DIAMOND_PICKAXE);
        }
    };
}
