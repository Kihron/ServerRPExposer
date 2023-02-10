package com.kihron.serverrpexposer.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.io.IOException;
import java.util.zip.ZipFile;

@Mixin(net.minecraft.resource.ZipResourcePack.class)
public interface ZipResourcePackInvoker {
    @Invoker("getZipFile")
    ZipFile getTheZipFile() throws IOException;
}
