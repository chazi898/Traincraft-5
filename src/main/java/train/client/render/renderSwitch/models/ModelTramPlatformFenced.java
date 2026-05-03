//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.04.2025 - 01:26:29
// Last changed on: 11.04.2025 - 01:26:29

package train.client.render.renderSwitch.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTramPlatformFenced extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelTramPlatformFenced() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 84, 7, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 98, 8, textureX, textureY); // Box 11

		bodyModel[0].addBox(0F, 0F, 0F, 16, 4, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, 6F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 0
		bodyModel[1].setRotationPoint(-8F, -8F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 1
		bodyModel[2].setRotationPoint(6F, -8F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 12, 0, 0F); // Box 11
		bodyModel[3].setRotationPoint(-6F, -7F, -7F);
	}
}