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

public class ModelBR_UK_SpeedSign extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_UK_SpeedSign() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		bodyModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		bodyModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		bodyModel[18] = new ModelRendererTurbo(this, 65, -4, textureX, textureY); // Box 9
		bodyModel[19] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 65, -50, textureX, textureY); // Box 9

		bodyModel[0].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -6F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, -6F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,-0.5F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-1F, -6F, -3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F); // Box 2
		bodyModel[3].setRotationPoint(-1F, -5F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F); // Box 2
		bodyModel[4].setRotationPoint(-1F, -6F, 1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -3F, 0F, -0.5F, -3F, 0F); // Box 2
		bodyModel[5].setRotationPoint(-1F, -5F, 3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.48F, 0F, 0F, -0.48F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.48F, -0.1F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-1F, -6F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.48F, -0.1F, 0F, -0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.48F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-1F, 3F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.1F, 0.3F, -0.48F, -1.1F, 0.3F, -0.48F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 1.15F, 0.05F, -0.48F, 1.15F, 0.05F); // Box 9
		bodyModel[8].setRotationPoint(-1F, -6F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 1.15F, 0.05F, -0.48F, 1.15F, 0.05F, -0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.1F, 0.3F, -0.48F, -1.1F, 0.3F); // Box 9
		bodyModel[9].setRotationPoint(-1F, 3F, 1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -3F, 0F, -0.48F, -3F, 0F, -0.48F, 0.15F, -0.05F, -0.5F, 0.15F, -0.05F, -0.5F, 2F, -0.9F, -0.48F, 2F, -0.9F); // Box 9
		bodyModel[10].setRotationPoint(-1F, -5F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.48F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.48F, 0F, 0F); // Box 9
		bodyModel[11].setRotationPoint(-1F, -2F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, 0.15F, -0.05F, -0.5F, 0.15F, -0.05F, -0.5F, 2F, -0.9F, -0.48F, 2F, -0.9F, -0.48F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -3F, 0F, -0.48F, -3F, 0F); // Box 9
		bodyModel[12].setRotationPoint(-1F, 2F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, -0.5F, 0F, 0F, -0.48F, 0F, 0F, -0.48F, 1.15F, 0.05F, -0.5F, 1.15F, 0.05F, -0.5F, -0.1F, 0F, -0.48F, -0.1F, 0F); // Box 9
		bodyModel[13].setRotationPoint(-1F, -6F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, 1.15F, 0.05F, -0.5F, 1.15F, 0.05F, -0.5F, -0.1F, 0F, -0.48F, -0.1F, 0F, -0.48F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, -0.5F, 0F, 0F, -0.48F, 0F, 0F); // Box 9
		bodyModel[14].setRotationPoint(-1F, 3F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.1F, -0.3F, -0.48F, -0.1F, -0.3F, -0.48F, 2F, -0.9F, -0.5F, 2F, -0.9F, -0.5F, 0.15F, -0.05F, -0.48F, 0.15F, -0.05F); // Box 9
		bodyModel[15].setRotationPoint(-1F, -5F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.48F, 0F, -0.1F, -0.48F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.48F, 0F, -0.1F); // Box 9
		bodyModel[16].setRotationPoint(-1F, -2F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.48F, 2F, -0.9F, -0.5F, 2F, -0.9F, -0.5F, 0.15F, -0.05F, -0.48F, 0.15F, -0.05F, -0.48F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.1F, -0.3F, -0.48F, -0.1F, -0.3F); // Box 9
		bodyModel[17].setRotationPoint(-1F, 2F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 39, 88, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -80.2F, 0F, -0.4F, -80.2F, 0F, -34.4F, -0.2F, 0F, -34.4F, -0.2F, 0F, -34.4F, -80.2F, 0F, -34.4F, -80.2F); // Box 9
		bodyModel[18].setRotationPoint(-0.52F, -3.5F, -4.05F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, -0.5F, -3F, -10F); // Box 2
		bodyModel[19].setRotationPoint(-1F, 4F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 19, 105, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -95.8F, 0F, -0.5F, -95.8F, 0F, -16.5F, -0.2F, 0F, -16.5F, -0.2F, 0F, -16.5F, -95.8F, 0F, -16.5F, -95.8F); // Box 9
		bodyModel[20].setRotationPoint(-0.52F, 4F, -4.7F);
	}
}