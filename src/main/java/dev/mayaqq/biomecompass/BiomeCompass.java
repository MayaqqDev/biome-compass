package dev.mayaqq.biomecompass;

import dev.mayaqq.biomecompass.registry.BCItems;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeCompass implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("BiomeCompass");

    @Override
    public void onInitialize() {
        BCItems.init();
        PolymerResourcePackUtils.addModAssets("biomecompass");
    }

    public static Identifier id(String path) {
        return new Identifier("biomecompass", path);
    }
}
