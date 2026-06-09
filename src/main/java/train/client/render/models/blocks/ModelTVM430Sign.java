//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.10.2021 - 18:58:30
// Last changed on: 19.10.2021 - 18:58:30

package train.client.render.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTVM430Sign extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTVM430Sign() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 0, 29, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 0, 29, textureX, textureY); // Box 9

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -21F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, -0.5F, -4F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1F, -20F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(-1F, 9F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,-0.49F, -3.5F, -4F, 0.01F, -3.5F, -4F, 0.01F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -8F, -4F, 0.01F, -8F, -4F, 0.01F, -4F, 0F, -0.49F, -4F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-1.02F, -20F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 1, 12, 0F,0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-0.54F, -18F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 1, 12, 0F,0F, 2F, -4F, 0F, 2F, -4F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-0.54F, -14.5F, -11F);
	}
}