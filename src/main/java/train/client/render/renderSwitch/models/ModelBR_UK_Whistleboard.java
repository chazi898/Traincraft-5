//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.02.2026 - 07:00:48
// Last changed on: 20.02.2026 - 07:00:48

package train.client.render.renderSwitch.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBR_UK_Whistleboard extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_UK_Whistleboard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, -115, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, -32, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 1, -32, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 50, 73, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 50, 73, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 50, 73, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, -2F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.7F, -0.1F, -0.8F, -1.7F, -0.1F, -0.8F, -1.7F, -0.1F, 0F, -1.7F, -0.1F); // Box 1
		bodyModel[1].setRotationPoint(-0.2F, -2F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.7F, -0.8F, 0F, -1.7F, -0.8F, 0F, -1.7F, 0F, 0F, -1.7F); // Box 1
		bodyModel[2].setRotationPoint(-0.2F, -1.7F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 39, 204, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -191.9F, 0F, 0F, -191.9F, 0F, -35F, 0.1F, -0.96F, -35F, 0.1F, -0.96F, -35F, -191.9F, 0F, -35F, -191.9F); // Box 1
		bodyModel[3].setRotationPoint(-0.2F, -5.8F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 39, 204, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -191.9F, 0F, 0F, -191.9F, 0F, -35F, 0.1F, -0.96F, -35F, 0.1F, -0.96F, -35F, -191.9F, 0F, -35F, -191.9F); // Box 1
		bodyModel[4].setRotationPoint(-0.14F, -5.8F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 39, 204, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -191.9F, 0F, 0F, -191.9F, 0F, -35F, 0.1F, -0.96F, -35F, 0.1F, -0.96F, -35F, -191.9F, 0F, -35F, -191.9F); // Box 1
		bodyModel[5].setRotationPoint(-0.08F, -5.8F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.7F, 0.1F, -0.8F, -0.7F, 0.1F, -0.8F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 1
		bodyModel[6].setRotationPoint(-0.2F, -2F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.7F, 0.1F, -0.8F, -0.7F, 0.1F, -0.8F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 1
		bodyModel[7].setRotationPoint(-0.2F, -2F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[8].setRotationPoint(0F, -6F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 148, 155, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -145.9F, 0F, 0F, -145.9F, 0F, -138.5F, 0.1F, -0.96F, -138.5F, 0.1F, -0.96F, -138.5F, -145.9F, 0F, -138.5F, -145.9F); // Box 1
		bodyModel[9].setRotationPoint(-0.2F, -6F, -4.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 148, 155, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -145.9F, 0F, 0F, -145.9F, 0F, -138.5F, 0.1F, -0.96F, -138.5F, 0.1F, -0.96F, -138.5F, -145.9F, 0F, -138.5F, -145.9F); // Box 1
		bodyModel[10].setRotationPoint(-0.14F, -6F, -4.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 148, 155, 0F,0F, 0F, 0.1F, -0.96F, 0F, 0.1F, -0.96F, 0F, -145.9F, 0F, 0F, -145.9F, 0F, -138.5F, 0.1F, -0.96F, -138.5F, 0.1F, -0.96F, -138.5F, -145.9F, 0F, -138.5F, -145.9F); // Box 1
		bodyModel[11].setRotationPoint(-0.08F, -6F, -4.5F);
	}
}