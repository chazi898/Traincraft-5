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

public class ModelBR_UK_SpeedSign_Warning extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_UK_SpeedSign_Warning() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 27, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 89, 5, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 97, 5, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 129, 5, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 137, 5, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 65, -4, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 65, -50, textureX, textureY); // Box 9

		bodyModel[0].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -6F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, -6F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.6F, 0.1F, 0F, -4.6F, 0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-1F, -6F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -1.6F, -0.1F, -0.5F, -1.6F, -0.1F); // Box 2
		bodyModel[3].setRotationPoint(-1F, -6F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, 0.1F, -0.5F, -4.6F, 0.1F); // Box 2
		bodyModel[4].setRotationPoint(-1F, -6F, 1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -3F, 0F, -0.5F, -3F, 0F); // Box 2
		bodyModel[5].setRotationPoint(-1F, -6F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.48F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.48F, 0F, 0.1F, -0.48F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.48F, -0.1F, 0.1F); // Box 9
		bodyModel[6].setRotationPoint(-1F, -6F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.48F, -0.1F, -0.4F, -0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.48F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-1F, 3F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.48F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -1F, 0F, -0.48F, -1F, 0F, -0.48F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0F, 0F, -0.48F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-1F, -6F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.48F, -3.1F, 0.4F, -0.5F, -3.1F, 0.4F, -0.5F, 2.1F, -0.9F, -0.48F, 2.1F, -0.9F, -0.48F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, -3F, 0F, -0.48F, -3F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-1F, 0F, 1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.48F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.1F, -0.48F, 0F, -0.1F, -0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, -0.1F, -0.48F, -0.1F, -0.1F); // Box 9
		bodyModel[10].setRotationPoint(-1F, -6F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.48F, 2.1F, -0.9F, -0.5F, 2.1F, -0.9F, -0.5F, -3.1F, 0.4F, -0.48F, -3.1F, 0.4F, -0.48F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 3F, 0F, -0.48F, 3F, 0F); // Box 9
		bodyModel[11].setRotationPoint(-1F, 0F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 56, 88, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -80.2F, 0F, 0F, -80.2F, 0F, -49.7F, -0.2F, 0F, -49.7F, -0.2F, 0F, -49.7F, -80.2F, 0F, -49.7F, -80.2F); // Box 9
		bodyModel[12].setRotationPoint(-0.52F, -5F, -4.05F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, -0.5F, -3F, -10F); // Box 2
		bodyModel[13].setRotationPoint(-1F, 4F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 19, 105, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -95.8F, 0F, -0.5F, -95.8F, 0F, -16.5F, -0.2F, 0F, -16.5F, -0.2F, 0F, -16.5F, -95.8F, 0F, -16.5F, -95.8F); // Box 9
		bodyModel[14].setRotationPoint(-0.52F, 4F, -4.7F);
	}
}