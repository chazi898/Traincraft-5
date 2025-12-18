//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.12.2023 - 03:50:34
// Last changed on: 31.12.2023 - 03:50:34

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

		public class ModelTipperNG extends ModelConverter //Same as Filename
		{
			int textureX = 512;
			int textureY = 512;

			public ModelTipperNG() //Same as Filename
			{
				bodyModel = new ModelRendererTurbo[79];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 140
		bodyModel[33] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 140
		bodyModel[34] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 140
		bodyModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 140
		bodyModel[36] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 140
		bodyModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 140
		bodyModel[40] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 140
		bodyModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 140
		bodyModel[42] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 140
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 140
		bodyModel[44] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 140
		bodyModel[45] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 140
		bodyModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 140
		bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 6.5F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 0
		bodyModel[1].setRotationPoint(6F, 6.5F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[2].setRotationPoint(-9.5F, 4F, -5.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[3].setRotationPoint(3.5F, 4F, -5.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[4].setRotationPoint(-9.5F, 4F, 5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[5].setRotationPoint(3.5F, 4F, 5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-13F, 4F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(10F, 4F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[8].setRotationPoint(13F, 4F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[9].setRotationPoint(-14F, 4F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 0
		bodyModel[10].setRotationPoint(-7F, 6.5F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 0
		bodyModel[11].setRotationPoint(-7F, 6.5F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[12].setRotationPoint(1F, 5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-9F, 6.5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(7F, 6.5F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-9F, 6.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(7F, 6.5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-9F, 5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-9F, 5F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(8F, 5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(8F, 5F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-2F, 5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[22].setRotationPoint(1F, 5F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-2F, 5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 0
		bodyModel[24].setRotationPoint(-9F, 4F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 0
		bodyModel[25].setRotationPoint(-9F, 4F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[26].setRotationPoint(-11F, 4F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[27].setRotationPoint(-11F, 4F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[28].setRotationPoint(9F, 4F, -8F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[29].setRotationPoint(9F, 4F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[30].setRotationPoint(9F, 1F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(9F, -2F, 4.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 18, 7, 8, 0F); // Box 140
		bodyModel[32].setRotationPoint(-9F, -5F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[33].setRotationPoint(-9F, -5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 140
		bodyModel[34].setRotationPoint(-9F, -5F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[35].setRotationPoint(-9F, 2F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[36].setRotationPoint(-9F, 2F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // Box 140
		bodyModel[37].setRotationPoint(-9F, 2F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(9F, -1F, -0.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 140
		bodyModel[39].setRotationPoint(-9F, -6F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[40].setRotationPoint(-9F, -6F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[41].setRotationPoint(-9F, -6F, 4F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 140
		bodyModel[42].setRotationPoint(8F, -6F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[43].setRotationPoint(8F, -6F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[44].setRotationPoint(8F, -6F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[45].setRotationPoint(-8F, -6F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[46].setRotationPoint(-8F, -6F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[47].setRotationPoint(9F, -1F, 1F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[48].setRotationPoint(9F, 1F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(9F, 1F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(9F, -2F, -5.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[51].setRotationPoint(-10F, 1F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-10F, -2F, 4.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[53].setRotationPoint(-10F, 1F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-10F, 1F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-10F, -2F, -5.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-2F, 4F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(9F, -1F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[58].setRotationPoint(9F, 0F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[59].setRotationPoint(9F, 0F, 0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(9F, 0F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[61].setRotationPoint(-10F, -1F, 1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-10F, -1F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-10F, 0F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[64].setRotationPoint(-10F, 0F, 0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(-10F, 0F, -0.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[66].setRotationPoint(-10F, -1F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[67].setRotationPoint(-13F, 4F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[68].setRotationPoint(-13F, 4F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(11F, 4F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(11F, 4F, 6F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 0
		bodyModel[71].setRotationPoint(9F, -2F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(9F, -2F, -2.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 0
		bodyModel[73].setRotationPoint(-10F, -2F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(-10F, -2F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[75].setRotationPoint(9F, -2F, 1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[76].setRotationPoint(-10F, -2F, 1.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 0
		bodyModel[77].setRotationPoint(10.1F, -1F, -5.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 0
		bodyModel[78].setRotationPoint(-10.1F, -1F, -0.5F);
	}
}