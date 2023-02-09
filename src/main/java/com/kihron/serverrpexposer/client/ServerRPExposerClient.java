package com.kihron.serverrpexposer.client;

import com.kihron.serverrpexposer.ServerRPExposer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ServerRPExposerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ServerRPExposer.LOGGER.info("[ServerRPExposer] Client initialized!");
    }
}
