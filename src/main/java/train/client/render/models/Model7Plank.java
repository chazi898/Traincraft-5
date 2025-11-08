//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.06.2022 - 20:17:04
// Last changed on: 13.06.2022 - 20:17:04

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Model7Plank extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model7Plank() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[188];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 90
		bodyModel[4] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 92
		bodyModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 105
		bodyModel[6] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 106
		bodyModel[7] = new ModelRendererTurbo(this, 279, 124, textureX, textureY); // Box 107
		bodyModel[8] = new ModelRendererTurbo(this, 279, 124, textureX, textureY); // Box 108
		bodyModel[9] = new ModelRendererTurbo(this, 279, 124, textureX, textureY); // Box 109
		bodyModel[10] = new ModelRendererTurbo(this, 279, 124, textureX, textureY); // Box 110
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[12] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 121
		bodyModel[13] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 83
		bodyModel[15] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 83
		bodyModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[20] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 83
		bodyModel[22] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 83
		bodyModel[23] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 90
		bodyModel[30] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 92
		bodyModel[31] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 145, 143, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 193, 143, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Box 1
		bodyModel[51] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 9, 143, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 145, 143, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 1
		bodyModel[69] = new ModelRendererTurbo(this, 193, 143, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 89, 158, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 17, 158, textureX, textureY); // Box 106
		bodyModel[73] = new ModelRendererTurbo(this, 211, 161, textureX, textureY); // Box 106
		bodyModel[74] = new ModelRendererTurbo(this, 105, 158, textureX, textureY); // Box 106
		bodyModel[75] = new ModelRendererTurbo(this, 241, 158, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 235, 182, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 305, 158, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 313, 158, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 441, 158, textureX, textureY); // Box 113
		bodyModel[80] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 113
		bodyModel[81] = new ModelRendererTurbo(this, 457, 158, textureX, textureY); // Box 113
		bodyModel[82] = new ModelRendererTurbo(this, 33, 158, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 417, 158, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 425, 158, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 105, 158, textureX, textureY); // Box 106
		bodyModel[86] = new ModelRendererTurbo(this, 57, 158, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 148, 166, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 433, 158, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 68, 158, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 139, 177, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 409, 158, textureX, textureY); // Box 48
		bodyModel[92] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[93] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[94] = new ModelRendererTurbo(this, 497, 158, textureX, textureY); // Box 34
		bodyModel[95] = new ModelRendererTurbo(this, 441, 158, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 457, 158, textureX, textureY); // Box 113
		bodyModel[98] = new ModelRendererTurbo(this, 409, 158, textureX, textureY); // Box 48
		bodyModel[99] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[100] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[101] = new ModelRendererTurbo(this, 497, 158, textureX, textureY); // Box 34
		bodyModel[102] = new ModelRendererTurbo(this, 441, 158, textureX, textureY); // Box 113
		bodyModel[103] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 457, 158, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 409, 158, textureX, textureY); // Box 48
		bodyModel[106] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[107] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[108] = new ModelRendererTurbo(this, 497, 158, textureX, textureY); // Box 34
		bodyModel[109] = new ModelRendererTurbo(this, 441, 158, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 457, 158, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 409, 158, textureX, textureY); // Box 48
		bodyModel[113] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[114] = new ModelRendererTurbo(this, 489, 158, textureX, textureY); // Box 34
		bodyModel[115] = new ModelRendererTurbo(this, 497, 158, textureX, textureY); // Box 34
		bodyModel[116] = new ModelRendererTurbo(this, 188, 150, textureX, textureY); // Box 1
		bodyModel[117] = new ModelRendererTurbo(this, 457, 16, textureX, textureY); // Box 27
		bodyModel[118] = new ModelRendererTurbo(this, 420, 16, textureX, textureY); // Box 27
		bodyModel[119] = new ModelRendererTurbo(this, 457, 28, textureX, textureY); // Box 27
		bodyModel[120] = new ModelRendererTurbo(this, 421, 30, textureX, textureY); // Box 27
		bodyModel[121] = new ModelRendererTurbo(this, 420, 25, textureX, textureY); // Box 27
		bodyModel[122] = new ModelRendererTurbo(this, 457, 24, textureX, textureY); // Box 27
		bodyModel[123] = new ModelRendererTurbo(this, 89, 200, textureX, textureY); // Box 40
		bodyModel[124] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Box 40
		bodyModel[125] = new ModelRendererTurbo(this, 88, 175, textureX, textureY); // Box 40
		bodyModel[126] = new ModelRendererTurbo(this, 44, 176, textureX, textureY); // Box 40
		bodyModel[127] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 40
		bodyModel[128] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[129] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 40
		bodyModel[130] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 40
		bodyModel[131] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 40
		bodyModel[132] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 40
		bodyModel[133] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 40
		bodyModel[134] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 40
		bodyModel[135] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 40
		bodyModel[136] = new ModelRendererTurbo(this, 301, 24, textureX, textureY); // Box 27
		bodyModel[137] = new ModelRendererTurbo(this, 226, 18, textureX, textureY); // Box 27
		bodyModel[138] = new ModelRendererTurbo(this, 291, 18, textureX, textureY); // Box 27
		bodyModel[139] = new ModelRendererTurbo(this, 263, 18, textureX, textureY); // Box 27
		bodyModel[140] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 27
		bodyModel[141] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 27
		bodyModel[142] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 27
		bodyModel[143] = new ModelRendererTurbo(this, 457, 20, textureX, textureY); // Box 27
		bodyModel[144] = new ModelRendererTurbo(this, 420, 20, textureX, textureY); // Box 27
		bodyModel[145] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 27
		bodyModel[146] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 27
		bodyModel[147] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 27
		bodyModel[148] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 27
		bodyModel[149] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 27
		bodyModel[150] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 27
		bodyModel[151] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 27
		bodyModel[152] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 27
		bodyModel[153] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 27
		bodyModel[154] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 27
		bodyModel[155] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 27
		bodyModel[156] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[157] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 27
		bodyModel[158] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 27
		bodyModel[159] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 27
		bodyModel[160] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 27
		bodyModel[161] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 27
		bodyModel[162] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 27
		bodyModel[163] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 27
		bodyModel[164] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[165] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		bodyModel[166] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
		bodyModel[167] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 27
		bodyModel[168] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 27
		bodyModel[169] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 27
		bodyModel[170] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
		bodyModel[171] = new ModelRendererTurbo(this, 152, 207, textureX, textureY); // Box 83
		bodyModel[172] = new ModelRendererTurbo(this, 152, 207, textureX, textureY); // Box 83
		bodyModel[173] = new ModelRendererTurbo(this, 278, 150, textureX, textureY); // Box 40
		bodyModel[174] = new ModelRendererTurbo(this, 278, 150, textureX, textureY); // Box 40
		bodyModel[175] = new ModelRendererTurbo(this, 127, 113, textureX, textureY); // Box 83
		bodyModel[176] = new ModelRendererTurbo(this, 127, 113, textureX, textureY); // Box 83
		bodyModel[177] = new ModelRendererTurbo(this, 353, 155, textureX, textureY); // Box 40
		bodyModel[178] = new ModelRendererTurbo(this, 341, 122, textureX, textureY); // Box 40
		bodyModel[179] = new ModelRendererTurbo(this, 385, 122, textureX, textureY); // Box 40
		bodyModel[180] = new ModelRendererTurbo(this, 151, 113, textureX, textureY); // Box 83
		bodyModel[181] = new ModelRendererTurbo(this, 152, 230, textureX, textureY); // Box 83
		bodyModel[182] = new ModelRendererTurbo(this, 152, 230, textureX, textureY); // Box 83
		bodyModel[183] = new ModelRendererTurbo(this, 278, 232, textureX, textureY); // Box 40
		bodyModel[184] = new ModelRendererTurbo(this, 278, 232, textureX, textureY); // Box 40
		bodyModel[185] = new ModelRendererTurbo(this, 132, 113, textureX, textureY); // Box 83
		bodyModel[186] = new ModelRendererTurbo(this, 141, 113, textureX, textureY); // Box 83
		bodyModel[187] = new ModelRendererTurbo(this, 141, 113, textureX, textureY); // Box 83

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-21F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[1].setRotationPoint(-20F, -12.25F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[2].setRotationPoint(-21F, -12F, 9F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 90
		bodyModel[3].setRotationPoint(-3F, -8F, 9.25F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 92
		bodyModel[4].setRotationPoint(2F, -8F, 9.25F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[5].setRotationPoint(-13F, 6F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[6].setRotationPoint(12F, 6F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 107
		bodyModel[7].setRotationPoint(-17F, 2F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 108
		bodyModel[8].setRotationPoint(-17F, 2F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 109
		bodyModel[9].setRotationPoint(8F, 2F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 110
		bodyModel[10].setRotationPoint(8F, 2F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[11].setRotationPoint(-21F, 1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[12].setRotationPoint(20F, 1F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[13].setRotationPoint(-21F, -12.25F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -1F, -1F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F); // Box 83
		bodyModel[14].setRotationPoint(-21F, -12F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[15].setRotationPoint(-6F, -12F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[16].setRotationPoint(5F, -12F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[17].setRotationPoint(-21F, -13F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[18].setRotationPoint(-21F, -12F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[19].setRotationPoint(-21F, -13F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[20].setRotationPoint(20F, -12F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[21].setRotationPoint(20F, -12F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[22].setRotationPoint(-6F, -12F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[23].setRotationPoint(5F, -12F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-21F, -13F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(20F, -13F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.05F, 0F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F); // Box 83
		bodyModel[26].setRotationPoint(20F, -12F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-1F, -1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -1F, -1F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 83
		bodyModel[27].setRotationPoint(-21F, -12F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0.05F, -1F, -1F, 0.05F, -1F, -1F, 0F, 0F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F); // Box 83
		bodyModel[28].setRotationPoint(20F, -12F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 90
		bodyModel[29].setRotationPoint(-3F, -8F, -11.25F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 92
		bodyModel[30].setRotationPoint(2F, -8F, -11.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(21F, 0.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(21F, 0.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(21F, 1.5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[34].setRotationPoint(21F, 1.5F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(21F, 0.5F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(21F, 0.5F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(21F, 1.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[38].setRotationPoint(21F, 1.5F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(23F, -0.5F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(23F, -0.5F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[41].setRotationPoint(23F, 1.5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(23F, 1.5F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(23F, -0.5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(23F, -0.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[45].setRotationPoint(23F, 1.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(23F, 1.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[47].setRotationPoint(21F, 0F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[48].setRotationPoint(21F, 1F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[49].setRotationPoint(23F, 0F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[50].setRotationPoint(23F, 1F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-23F, 0.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-23F, 0.5F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[53].setRotationPoint(-23F, 1.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-23F, 1.5F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-23F, 0.5F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-23F, 0.5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[57].setRotationPoint(-23F, 1.5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(-23F, 1.5F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(-24F, -0.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(-24F, -0.5F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[61].setRotationPoint(-24F, 1.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F); // Box 0
		bodyModel[62].setRotationPoint(-24F, 1.5F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-24F, -0.5F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-24F, -0.5F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(-24F, 1.5F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F); // Box 0
		bodyModel[66].setRotationPoint(-24F, 1.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[67].setRotationPoint(-22F, 0F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[68].setRotationPoint(-23F, 1F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 1
		bodyModel[69].setRotationPoint(-24F, 0F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, -0.375F); // Box 1
		bodyModel[70].setRotationPoint(-24F, 1F, -0.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[71].setRotationPoint(-7F, 1F, 7.05F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[72].setRotationPoint(-5F, 1F, 7.05F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[73].setRotationPoint(-9F, 1F, 7.05F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[74].setRotationPoint(-6F, 6F, 7.05F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[75].setRotationPoint(5F, 0.25F, 7.25F);

		bodyModel[76].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 106
		bodyModel[76].setRotationPoint(-12F, 5.25F, 7.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[77].setRotationPoint(6F, 1F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[78].setRotationPoint(6F, 3F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[79].setRotationPoint(-13.5F, 2F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[80].setRotationPoint(-13F, 2F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[81].setRotationPoint(-13F, 2F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[82].setRotationPoint(6F, 1F, -8.05F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(8F, 1F, -8.05F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[84].setRotationPoint(4F, 1F, -8.05F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[85].setRotationPoint(-12F, 6F, -8.05F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[86].setRotationPoint(-6F, 0.25F, -8.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 106
		bodyModel[87].setRotationPoint(-6F, 5.25F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[88].setRotationPoint(-7F, 1F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-12F, 3F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 1
		bodyModel[90].setRotationPoint(-20F, 1F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[91].setRotationPoint(-13.5F, 5.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[92].setRotationPoint(-14F, 1.25F, -8.95F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[93].setRotationPoint(-13.5F, 1.5F, -8.95F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[94].setRotationPoint(-13F, 1.75F, -8.95F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[95].setRotationPoint(11.5F, 2F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[96].setRotationPoint(12F, 2F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[97].setRotationPoint(12F, 2F, -8F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[98].setRotationPoint(11.5F, 5.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[99].setRotationPoint(11F, 1.25F, -8.95F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[100].setRotationPoint(11.5F, 1.5F, -8.95F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[101].setRotationPoint(12F, 1.75F, -8.95F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 113
		bodyModel[102].setRotationPoint(-13.5F, 2F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[103].setRotationPoint(-13F, 2F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[104].setRotationPoint(-13F, 2F, 7F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[105].setRotationPoint(-13.5F, 5.5F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[106].setRotationPoint(-14F, 1.25F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[107].setRotationPoint(-13.5F, 1.5F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[108].setRotationPoint(-13F, 1.75F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 113
		bodyModel[109].setRotationPoint(11.5F, 2F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[110].setRotationPoint(12F, 2F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[111].setRotationPoint(12F, 2F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[112].setRotationPoint(11.5F, 5.5F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[113].setRotationPoint(11F, 1.25F, 7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[114].setRotationPoint(11.5F, 1.5F, 7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[115].setRotationPoint(12F, 1.75F, 7.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 1
		bodyModel[116].setRotationPoint(-20F, 1F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[117].setRotationPoint(-20F, -10.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[118].setRotationPoint(-20F, -8.75F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[119].setRotationPoint(-20F, -7F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[120].setRotationPoint(-20F, -5.25F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[121].setRotationPoint(-20F, -3.5F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[122].setRotationPoint(-20F, -1.75F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[123].setRotationPoint(-21F, -10.5F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[124].setRotationPoint(-21F, -8.75F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[125].setRotationPoint(-21F, -7F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[126].setRotationPoint(-21F, -5.25F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[127].setRotationPoint(-21F, -3.5F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[128].setRotationPoint(-21F, -1.75F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[129].setRotationPoint(20F, -12.25F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[130].setRotationPoint(20F, -10.5F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[131].setRotationPoint(20F, -8.75F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[132].setRotationPoint(20F, -7F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[133].setRotationPoint(20F, -5.25F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[134].setRotationPoint(20F, -3.5F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		bodyModel[135].setRotationPoint(20F, -1.75F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[136].setRotationPoint(-5F, -12.25F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[137].setRotationPoint(-5F, -10.5F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[138].setRotationPoint(-5F, -8.75F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[139].setRotationPoint(-5F, -7F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[140].setRotationPoint(-5F, -5.25F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[141].setRotationPoint(-5F, -3.5F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[142].setRotationPoint(-5F, -1.75F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[143].setRotationPoint(6F, -12.25F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[144].setRotationPoint(6F, -10.5F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[145].setRotationPoint(6F, -8.75F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[146].setRotationPoint(6F, -7F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[147].setRotationPoint(6F, -5.25F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[148].setRotationPoint(6F, -3.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[149].setRotationPoint(6F, -1.75F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[150].setRotationPoint(-20F, -12.25F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[151].setRotationPoint(-20F, -10.5F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[152].setRotationPoint(-20F, -8.75F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[153].setRotationPoint(-20F, -7F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[154].setRotationPoint(-20F, -5.25F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[155].setRotationPoint(-20F, -3.5F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[156].setRotationPoint(-20F, -1.75F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[157].setRotationPoint(-5F, -12.25F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[158].setRotationPoint(-5F, -10.5F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[159].setRotationPoint(-5F, -8.75F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[160].setRotationPoint(-5F, -7F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[161].setRotationPoint(-5F, -5.25F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[162].setRotationPoint(-5F, -3.5F, 10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[163].setRotationPoint(-5F, -1.75F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[164].setRotationPoint(6F, -12.25F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[165].setRotationPoint(6F, -10.5F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[166].setRotationPoint(6F, -8.75F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[167].setRotationPoint(6F, -7F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[168].setRotationPoint(6F, -5.25F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[169].setRotationPoint(6F, -3.5F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 27
		bodyModel[170].setRotationPoint(6F, -1.75F, 10F);

		bodyModel[171].addBox(0F, 0F, 0F, 40, 12, 0, 0F); // Box 83
		bodyModel[171].setRotationPoint(-20F, -12F, 10.75F);

		bodyModel[172].addBox(0F, 0F, 0F, 40, 12, 0, 0F); // Box 83
		bodyModel[172].setRotationPoint(-20F, -12F, -10.75F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 12, 18, 0F); // Box 40
		bodyModel[173].setRotationPoint(-20.75F, -12F, -9F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 12, 18, 0F); // Box 40
		bodyModel[174].setRotationPoint(20.75F, -12F, -9F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 83
		bodyModel[175].setRotationPoint(20.5F, -12F, -4F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 83
		bodyModel[176].setRotationPoint(20.5F, -12F, 3F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 40
		bodyModel[177].setRotationPoint(-21F, -13F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[178].setRotationPoint(-21.05F, -13.25F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 40
		bodyModel[179].setRotationPoint(-21.1F, -3F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 83
		bodyModel[180].setRotationPoint(-21.05F, -13F, -0.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 40, 12, 0, 0F); // Box 83
		bodyModel[181].setRotationPoint(-20F, -12F, 10.1F);

		bodyModel[182].addBox(0F, 0F, 0F, 40, 12, 0, 0F); // Box 83
		bodyModel[182].setRotationPoint(-20F, -12F, -10.1F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 12, 18, 0F); // Box 40
		bodyModel[183].setRotationPoint(-20.1F, -12F, -9F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 12, 18, 0F); // Box 40
		bodyModel[184].setRotationPoint(20.1F, -12F, -9F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 83
		bodyModel[185].setRotationPoint(20.05F, -12F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 83
		bodyModel[186].setRotationPoint(-21.5F, -12F, -4F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 83
		bodyModel[187].setRotationPoint(-21.5F, -12F, 3F);
	}
}