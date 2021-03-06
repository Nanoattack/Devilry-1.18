package com.nano.devilry.entity.custom.model;

import com.nano.devilry.ModMain;
import com.nano.devilry.entity.custom.OwlEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OwlModel extends AnimatedGeoModel<OwlEntity>
{
    @Override
    public ResourceLocation getModelLocation(OwlEntity object) {
        return new ResourceLocation(ModMain.MOD_ID, "geo/owl.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OwlEntity object) {
        return new ResourceLocation(ModMain.MOD_ID, "textures/entity/owl.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OwlEntity animatable) {
        return new ResourceLocation(ModMain.MOD_ID, "animations/owl.animation.json");
    }
}
