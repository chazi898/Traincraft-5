//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.07.2025 - 21:48:09
// Last changed on: 18.07.2025 - 21:48:09

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelJennyTender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJennyTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 41
		bodyModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 43
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 45
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 91
		bodyModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 96
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 97
		bodyModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 98
		bodyModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 99
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 102
		bodyModel[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 103
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 109
		bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 110
		bodyModel[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 112
		bodyModel[21] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 113
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 114
		bodyModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 115
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 116
		bodyModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 117
		bodyModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 118
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 119
		bodyModel[28] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 120
		bodyModel[29] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 122
		bodyModel[30] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 140
		bodyModel[31] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 149
		bodyModel[32] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 150
		bodyModel[33] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 154
		bodyModel[34] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 165
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 192
		bodyModel[36] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 193
		bodyModel[37] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 186
		bodyModel[38] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 187
		bodyModel[39] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 191
		bodyModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 192
		bodyModel[41] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 22
		bodyModel[42] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 110
		bodyModel[43] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 110
		bodyModel[44] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 110

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 19
		bodyModel[0].setRotationPoint(0F, 4F, -6.1F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 22
		bodyModel[1].setRotationPoint(14F, 4F, 6.1F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 23
		bodyModel[2].setRotationPoint(14F, 4F, -6.1F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 7, 20, 0F); // Box 24
		bodyModel[3].setRotationPoint(-3F, 0F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 24, 1, 20, 0F); // Box 25
		bodyModel[4].setRotationPoint(-2F, 0F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 26
		bodyModel[5].setRotationPoint(22F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 22, 10, 1, 0F); // Box 41
		bodyModel[6].setRotationPoint(0F, -10F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 22, 10, 1, 0F); // Box 42
		bodyModel[7].setRotationPoint(0F, -10F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 10, 20, 0F); // Box 43
		bodyModel[8].setRotationPoint(22F, -10F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 45
		bodyModel[9].setRotationPoint(1F, -8F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 47
		bodyModel[10].setRotationPoint(1F, -8F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 10, 18, 0F); // Box 91
		bodyModel[11].setRotationPoint(1F, -10F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[12].setRotationPoint(1F, -2F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[13].setRotationPoint(1F, -9F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[14].setRotationPoint(1F, -2F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[15].setRotationPoint(1F, -9F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 24, 6, 1, 0F); // Box 102
		bodyModel[16].setRotationPoint(-2F, 1F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 24, 6, 1, 0F); // Box 103
		bodyModel[17].setRotationPoint(-2F, 1F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 109
		bodyModel[18].setRotationPoint(22F, 5F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[19].setRotationPoint(0F, -13F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 112
		bodyModel[20].setRotationPoint(11F, -13F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 113
		bodyModel[21].setRotationPoint(11F, -13F, 9F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 114
		bodyModel[22].setRotationPoint(22F, -14F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 115
		bodyModel[23].setRotationPoint(22F, -14F, 9F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 116
		bodyModel[24].setRotationPoint(1F, -12F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 117
		bodyModel[25].setRotationPoint(12F, -12F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 118
		bodyModel[26].setRotationPoint(12F, -12F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 119
		bodyModel[27].setRotationPoint(1F, -12F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 120
		bodyModel[28].setRotationPoint(1F, -14F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 122
		bodyModel[29].setRotationPoint(1F, -14F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 20, 10, 18, 0F); // Box 140
		bodyModel[30].setRotationPoint(2F, -10F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 149
		bodyModel[31].setRotationPoint(22F, -14F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 150
		bodyModel[32].setRotationPoint(22F, -12F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 154
		bodyModel[33].setRotationPoint(22F, 2F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 165
		bodyModel[34].setRotationPoint(-5F, 2F, -1.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 192
		bodyModel[35].setRotationPoint(2F, 5.8F, -8.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 193
		bodyModel[36].setRotationPoint(16F, 5.8F, -8.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 186
		bodyModel[37].setRotationPoint(0F, -13F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 187
		bodyModel[38].setRotationPoint(0F, -4F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[39].setRotationPoint(0F, -5F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[40].setRotationPoint(0F, -5F, -8.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 22
		bodyModel[41].setRotationPoint(0F, 4F, 6.1F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[42].setRotationPoint(0F, -13F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[43].setRotationPoint(0F, -14F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[44].setRotationPoint(0F, -14F, 9F);
	}
}