package net.youshallnotdump.mixin;

import net.minecraft.client.KeyboardHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(KeyboardHandler.class)
public abstract class KeyboardMixin {

    @Inject(method = "handleDebugKeys", at = @At(value = "INVOKE",
            target = "Lcom/mojang/blaze3d/platform/TextureUtil;getDebugTexturePath(Ljava/nio/file/Path;)Ljava/nio/file/Path;"
    ), cancellable = true)
    private void cancelF3S(int key, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
