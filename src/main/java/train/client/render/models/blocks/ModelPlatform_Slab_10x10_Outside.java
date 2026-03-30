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

public class ModelPlatform_Slab_10x10_Outside extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPlatform_Slab_10x10_Outside() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 11
		bodyModel[14] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 11
		bodyModel[23] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 11
		bodyModel[24] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 161, 61, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 161, 69, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 161, 74, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 161, 79, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 101, 62, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 106, 62, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 112, 62, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 118, 62, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 124, 62, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 161, 84, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 177, 84, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 138, 70, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 144, 70, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 147, 80, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 16, 8, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(32F, 2F, 0F);
		bodyModel[0].rotateAngleY = -3.14159265F;

		bodyModel[1].addBox(0F, 0F, 0F, 16, 8, 12, 0F); // Box 0
		bodyModel[1].setRotationPoint(-32F, 2F, 12F);
		bodyModel[1].rotateAngleY = -3.14159265F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(0F, 2F, 2F);
		bodyModel[2].rotateAngleY = -3.14159265F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(16F, 2F, 2F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addBox(0F, 0F, 0F, 16, 8, 6, 0F); // Box 0
		bodyModel[4].setRotationPoint(-16F, 2F, 6F);
		bodyModel[4].rotateAngleY = -3.14159265F;

		bodyModel[5].addBox(0F, 0F, 0F, 16, 8, 4, 0F); // Box 11
		bodyModel[5].setRotationPoint(-48F, 2F, 20F);
		bodyModel[5].rotateAngleY = -3.14159265F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 8, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-64F, 2F, 30F);
		bodyModel[6].rotateAngleY = -3.14159265F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-32F, 2F, 20F);
		bodyModel[7].rotateAngleY = -3.14159265F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 8, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(0F, 2F, 6F);
		bodyModel[8].rotateAngleY = -3.14159265F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-16F, 2F, 12F);
		bodyModel[9].rotateAngleY = -3.14159265F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[10].setRotationPoint(-72F, 2F, 37F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 7, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-72F, 2F, 43F);
		bodyModel[11].rotateAngleY = -3.14159265F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, -7.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -7.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[12].setRotationPoint(-64F, 2F, 37F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 8, 10, 0F,0F, 0F, -10F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[13].setRotationPoint(-48F, 2F, 30F);
		bodyModel[13].rotateAngleY = -3.14159265F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-80F, 2F, 43F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-126F, 2F, 128F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-126F, 2F, 144F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addBox(0F, 0F, 0F, 6, 8, 16, 0F); // Box 0
		bodyModel[17].setRotationPoint(-122F, 2F, 112F);
		bodyModel[17].rotateAngleY = -3.14159265F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 8, 16, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-122F, 2F, 128F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 8, 16, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-116F, 2F, 112F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addBox(0F, 0F, 0F, 12, 8, 16, 0F); // Box 0
		bodyModel[20].setRotationPoint(-116F, 2F, 96F);
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 8, 16, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-108F, 2F, 96F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 4, 8, 16, 0F); // Box 11
		bodyModel[22].setRotationPoint(-108F, 2F, 80F);
		bodyModel[22].rotateAngleY = -3.14159265F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 8, 16, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[23].setRotationPoint(-98F, 2F, 80F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 8, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-98F, 2F, 64F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-91F, 2F, 56F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 8, 8, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-85F, 2F, 56F);
		bodyModel[26].rotateAngleY = -3.14159265F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,-7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-91F, 2F, 64F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-85F, 2F, 48F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 8, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-80F, 2F, 48F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 0
		bodyModel[30].setRotationPoint(16F, 1.99F, 2F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F); // Box 0
		bodyModel[31].setRotationPoint(0F, 1.99F, 4F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F); // Box 0
		bodyModel[32].setRotationPoint(-16F, 1.99F, 8F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 2F); // Box 0
		bodyModel[33].setRotationPoint(-32F, 1.99F, 14F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, 0F, 2F); // Box 0
		bodyModel[34].setRotationPoint(-48F, 1.99F, 22F);
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-126F, 1.99F, 144F);
		bodyModel[35].rotateAngleY = -3.14159265F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-124F, 1.99F, 128F);
		bodyModel[36].rotateAngleY = -3.14159265F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(-120F, 1.99F, 112F);
		bodyModel[37].rotateAngleY = -3.14159265F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[38].setRotationPoint(-114F, 1.99F, 96F);
		bodyModel[38].rotateAngleY = -3.14159265F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-106F, 1.99F, 80F);
		bodyModel[39].rotateAngleY = -3.14159265F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2.5F); // Box 0
		bodyModel[40].setRotationPoint(-64F, 1.99F, 32F);
		bodyModel[40].rotateAngleY = -3.14159265F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 2F); // Box 0
		bodyModel[41].setRotationPoint(-72F, 1.99F, 38F);
		bodyModel[41].rotateAngleY = -3.14159265F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-95F, 1.99F, 64F);
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(-90F, 1.99F, 56F);
		bodyModel[43].rotateAngleY = -3.14159265F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 5F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-85F, 1.99F, 48F);
		bodyModel[44].rotateAngleY = -3.14159265F;
	}
}