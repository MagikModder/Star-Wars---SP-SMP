package javabuckets.mods.starwars.model.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelLightsaber - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelLightsaberCross extends ModelBase {
    public ModelRenderer Circle3;
    public ModelRenderer Circle2;
    public ModelRenderer Circle1;
    public ModelRenderer bladeOuter;
    public ModelRenderer Circle4;
    public ModelRenderer Deco2;
    public ModelRenderer HandleTop;
    public ModelRenderer Deco1;
    public ModelRenderer Deco4;
    public ModelRenderer Deco3;
    public ModelRenderer bladeInner;
    public ModelRenderer Top;
    public ModelRenderer HandleBottom;
    public ModelRenderer Circle6;
    public ModelRenderer Circle5;
    public ModelRenderer Circle8;
    public ModelRenderer Circle7;
    public ModelRenderer bladeCrossLeft;
    public ModelRenderer Circle9;
    public ModelRenderer Circle10;
    public ModelRenderer bladeCrossRight;

    public ModelLightsaberCross() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Circle4 = new ModelRenderer(this, 36, 34);
        this.Circle4.setRotationPoint(0.0F, 8.3F, 0.0F);
        this.Circle4.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle4, 0.0F, 0.7853981633974483F, 0.0F);
        this.Top = new ModelRenderer(this, 28, 31);
        this.Top.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Top.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.Circle8 = new ModelRenderer(this, 36, 34);
        this.Circle8.setRotationPoint(3.0F, 7.4F, -0.9F);
        this.Circle8.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle8, 0.0F, 0.0F, 1.5707963267948966F);
        this.bladeInner = new ModelRenderer(this, 0, 0);
        this.bladeInner.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.bladeInner.addBox(-0.5F, -32.0F, -0.5F, 1, 32, 1, 0.0F);
        this.Circle3 = new ModelRenderer(this, 28, 34);
        this.Circle3.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.Circle3.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle3, 0.0F, 0.7853981852531433F, 0.0F);
        this.Deco4 = new ModelRenderer(this, 30, 46);
        this.Deco4.setRotationPoint(0.800000011920929F, 16.0F, 0.0F);
        this.Deco4.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.Circle10 = new ModelRenderer(this, 36, 34);
        this.Circle10.setRotationPoint(-2.1F, 7.4F, -0.9F);
        this.Circle10.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle10, 0.0F, 0.0F, 1.5707963267948966F);
        this.Circle1 = new ModelRenderer(this, 28, 34);
        this.Circle1.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.Circle1.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle1, 0.0F, 0.7853981852531433F, 0.0F);
        this.Deco2 = new ModelRenderer(this, 30, 46);
        this.Deco2.setRotationPoint(0.0F, 16.0F, 0.800000011920929F);
        this.Deco2.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.Deco3 = new ModelRenderer(this, 30, 46);
        this.Deco3.setRotationPoint(-0.800000011920929F, 16.0F, 0.0F);
        this.Deco3.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.HandleBottom = new ModelRenderer(this, 28, 52);
        this.HandleBottom.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.HandleBottom.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.bladeCrossLeft = new ModelRenderer(this, 0, 0);
        this.bladeCrossLeft.setRotationPoint(13.1F, 7.4F, -0.9F);
        this.bladeCrossLeft.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(bladeCrossLeft, 0.0F, 0.0F, 1.5707963267948966F);
        this.Circle7 = new ModelRenderer(this, 36, 34);
        this.Circle7.setRotationPoint(2.1F, 7.4F, -0.9F);
        this.Circle7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle7, 0.0F, 0.0F, 1.5707963267948966F);
        this.HandleTop = new ModelRenderer(this, 30, 37);
        this.HandleTop.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.HandleTop.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
        this.Deco1 = new ModelRenderer(this, 30, 46);
        this.Deco1.setRotationPoint(0.0F, 16.0F, -0.75F);
        this.Deco1.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.bladeOuter = new ModelRenderer(this, 0, 0);
        this.bladeOuter.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.bladeOuter.addBox(-1.0F, -33.0F, -1.0F, 2, 33, 2, 0.0F);
        this.Circle9 = new ModelRenderer(this, 36, 34);
        this.Circle9.setRotationPoint(-1.1F, 7.4F, -0.9F);
        this.Circle9.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle9, 0.0F, 0.0F, 1.5707963267948966F);
        this.Circle5 = new ModelRenderer(this, 36, 34);
        this.Circle5.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.Circle5.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle5, 0.0F, 0.7853981633974483F, 0.0F);
        this.Circle6 = new ModelRenderer(this, 36, 34);
        this.Circle6.setRotationPoint(0.0F, 9.3F, 0.0F);
        this.Circle6.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle6, 0.0F, 0.7853981633974483F, 0.0F);
        this.bladeCrossRight = new ModelRenderer(this, 0, 0);
        this.bladeCrossRight.setRotationPoint(-3.1F, 7.4F, -0.9F);
        this.bladeCrossRight.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(bladeCrossRight, 0.0F, 0.0F, 1.5707963267948966F);
        this.Circle2 = new ModelRenderer(this, 28, 34);
        this.Circle2.setRotationPoint(0.0F, 12.5F, 0.0F);
        this.Circle2.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Circle2, 0.0F, 0.7853981852531433F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Circle4.render(f5);
        this.Top.render(f5);
        this.Circle8.render(f5);
        this.bladeInner.render(f5);
        this.Circle3.render(f5);
        this.Deco4.render(f5);
        this.Circle10.render(f5);
        this.Circle1.render(f5);
        this.Deco2.render(f5);
        this.Deco3.render(f5);
        this.HandleBottom.render(f5);
        this.bladeCrossLeft.render(f5);
        this.Circle7.render(f5);
        this.HandleTop.render(f5);
        this.Deco1.render(f5);
        this.bladeOuter.render(f5);
        this.Circle9.render(f5);
        this.Circle5.render(f5);
        this.Circle6.render(f5);
        this.bladeCrossRight.render(f5);
        this.Circle2.render(f5);
    }

    public void renderInner(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
     //   setRotationAngles(f, f1, f2, f3, f4, f5);
        bladeInner.render(f5);
    }

    public void renderOuter(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
  //      setRotationAngles(f, f1, f2, f3, f4, f5);
        bladeOuter.render(f5);
    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
