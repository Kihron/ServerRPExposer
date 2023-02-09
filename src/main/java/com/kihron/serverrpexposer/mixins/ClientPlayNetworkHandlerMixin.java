package com.kihron.serverrpexposer.mixins;

import com.kihron.serverrpexposer.ServerRPExposer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.net.URL;

@Mixin(net.minecraft.client.network.ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
    @Inject(at = @At("HEAD"), method = "resolveUrl")
    private static void resolveUrl(String url, CallbackInfoReturnable<URL> cir) {
        ServerRPExposer.LOGGER.info("[ServerRPExposer] PackURL: " + url);
    }
}
