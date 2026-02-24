//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.11.2024 - 00:23:25
// Last changed on: 28.11.2024 - 00:23:25

package train.client.render.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.CustomModelRenderer;
import train.common.library.Info;

public class ModelBR_Modern_Buffer extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	private IModelCustom track;

	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box35;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;

	public ModelBR_Modern_Buffer(float scale) //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		track =  AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));

		box = new CustomModelRenderer(this, 43, 4, 64, 64);
		box.addBox(0F, 0F, 0F, 2, 15, 1, scale);
		box.setPosition(-8F, 0F, 4F);
		box.rotateAngleZ = -0.8028514559173916F;

		box0 = new CustomModelRenderer(this, 36, 4, 64, 64);
		box0.addBox(0F, 0F, 0F, 2, 15, 1, scale);
		box0.setPosition(-8F, 0F, -5F);
		box0.rotateAngleZ = -0.8028514559173916F;

		box1 = new CustomModelRenderer(this, 57, 4, 64, 64);
		box1.addBox(-2F, 0F, 0F, 2, 9, 1, scale);
		box1.setPosition(8F, 0F, -5F);
		box1.rotateAngleZ = -5.759586531581287F;

		box10 = new CustomModelRenderer(this, 5, 5, 64, 64);
		box10.addBox(0F, 0F, 0F, 2, 4, 16, scale);
		box10.setPosition(4F, 7F, -8F);

		box2 = new CustomModelRenderer(this, 50, 4, 64, 64);
		box2.addBox(-2F, 0F, 0F, 2, 9, 1, scale);
		box2.setPosition(8F, 0F, 4F);
		box2.rotateAngleZ = -5.759586531581287F;

		box3 = new CustomModelRenderer(this, 26, 7, 64, 64);
		box3.addBox(0F, 0F, 0F, 1, 3, 3, scale);
		box3.setPosition(4F, 11F, -5F);

		box35 = new CustomModelRenderer(this, 6, 5, 64, 64);
		box35.addBox(0F, 0F, 0F, 2, 12, 1, scale);
		box35.setPosition(2F, 0F, 5F);

		box4 = new CustomModelRenderer(this, 0, 27, 64, 64);
		box4.addBox(0F, 0F, 0F, 16, 1, 16, scale);
		box4.setPosition(-8F, 0F, -8F);

		box5 = new CustomModelRenderer(this, 13, 5, 64, 64);
		box5.addBox(0F, 0F, 0F, 2, 12, 1, scale);
		box5.setPosition(2F, 0F, -6F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 9
		bodyModel[17] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		bodyModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 10
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 10
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY, "Lamp"); // Lamp

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[0].setRotationPoint(-3F, 0.5F, -5.9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -3F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[1].setRotationPoint(-6F, 4.5F, -5.9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[2].setRotationPoint(-4F, -0.5F, -8.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 10
		bodyModel[3].setRotationPoint(-5F, 0.5F, 3.95F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F); // Box 10
		bodyModel[4].setRotationPoint(-6F, -0.5F, 3.95F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 10
		bodyModel[5].setRotationPoint(-5F, 0.5F, -8.05F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F); // Box 10
		bodyModel[6].setRotationPoint(-6F, -0.5F, -8.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0.5F, 0.1F, -6F, 0.5F, 0.1F, -6F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[7].setRotationPoint(2F, 0.5F, -5.9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[8].setRotationPoint(-3F, 0.5F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -3F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[9].setRotationPoint(-6F, 4.5F, 5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0.5F, 0.1F, -6F, 0.5F, 0.1F, -6F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		bodyModel[10].setRotationPoint(2F, 0.5F, 5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[11].setRotationPoint(6F, 7.5F, -5.45F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[12].setRotationPoint(-5F, 7.5F, -5.45F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, -9F, -0.2F, -1.1F, 9F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, -9F, -0.2F, -1.1F, 9F, -0.2F, -1.1F); // Box 9
		bodyModel[13].setRotationPoint(5F, 7.5F, -5.45F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[14].setRotationPoint(-4F, 7.5F, -5.35F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[15].setRotationPoint(-4F, 7.5F, 4.45F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,9F, -0.2F, -1.1F, -9F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 9F, -0.2F, -1.1F, -9F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F); // Box 9
		bodyModel[16].setRotationPoint(5F, 7.5F, -5.45F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[17].setRotationPoint(-5F, -0.5F, -2.05F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[18].setRotationPoint(-5F, -0.5F, 0.95F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 10
		bodyModel[19].setRotationPoint(-5F, -0.5F, -1.05F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[20].setRotationPoint(-5F, 2.5F, -1.05F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10
		bodyModel[21].setRotationPoint(-3F, -6.5F, 1.95F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -1F, -0.5F, -0.3F, -1F); // Box 10
		bodyModel[22].setRotationPoint(-4F, -6.5F, 0.95F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -1F, 0F, -0.3F, -1F); // Lamp
		bodyModel[23].setRotationPoint(-4F, -6.1F, 0.95F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -1F, 0F, -0.3F, -1F); // Lamp
		bodyModel[24].setRotationPoint(-4F, -4.7F, 0.95F);
	}
	public void render(float f5) {
		for (int i = 0; i < 25; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}