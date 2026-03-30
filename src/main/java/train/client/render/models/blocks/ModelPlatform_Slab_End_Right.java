//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.03.2024 - 05:23:33
// Last changed on: 14.03.2024 - 05:23:33

package train.client.render.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelPlatform_Slab_End_Right extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPlatform_Slab_End_Right() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(16F, 2F, 0F);
		bodyModel[0].rotateAngleY = -3.14159265F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 32, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, 2F, 0F);
		bodyModel[1].rotateAngleY = -3.14159265F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(0F, 1.99F, -15F);
		bodyModel[2].rotateAngleY = -3.14159265F;
	}
}