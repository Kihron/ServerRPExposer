package com.kihron.serverrpexposer;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerRPExposer implements ModInitializer {
    public static final String MOD_ID = "serverrpexposer";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[ServerRPExposer] Server initialized!");
    }
}
