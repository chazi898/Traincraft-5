//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.09.2022 - 21:18:44
// Last changed on: 07.09.2022 - 21:18:44

package train.client.render.models; //Path where the model is located


import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelRW_Type_2_Tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRW_Type_2_Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 6, 112, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 6, 137, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[8] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[9] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 56, 146, textureX, textureY); // Box 123
		bodyModel[11] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[12] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[13] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[14] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[15] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[16] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[19] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[20] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 50, 239, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 337, 195, textureX, textureY); // Box 113
		bodyModel[24] = new ModelRendererTurbo(this, 327, 191, textureX, textureY); // Box 113
		bodyModel[25] = new ModelRendererTurbo(this, 132, 169, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 374, 131, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 345, 184, textureX, textureY); // Box 113
		bodyModel[28] = new ModelRendererTurbo(this, 27, 214, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 187, 198, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 418, 142, textureX, textureY); // Box 1
		bodyModel[31] = new ModelRendererTurbo(this, 137, 174, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 37, 214, textureX, textureY); // Box 113
		bodyModel[34] = new ModelRendererTurbo(this, 365, 143, textureX, textureY); // Box 1
		bodyModel[35] = new ModelRendererTurbo(this, 304, 192, textureX, textureY); // Box 113
		bodyModel[36] = new ModelRendererTurbo(this, 32, 214, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 317, 137, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 103, 102, textureX, textureY); // Box 1
		bodyModel[39] = new ModelRendererTurbo(this, 152, 201, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 33, 199, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 356, 168, textureX, textureY); // Box 5
		bodyModel[42] = new ModelRendererTurbo(this, 356, 168, textureX, textureY); // Box 5
		bodyModel[43] = new ModelRendererTurbo(this, 130, 136, textureX, textureY); // Box 127
		bodyModel[44] = new ModelRendererTurbo(this, 228, 136, textureX, textureY); // Box 5
		bodyModel[45] = new ModelRendererTurbo(this, 48, 218, textureX, textureY); // Box 119
		bodyModel[46] = new ModelRendererTurbo(this, 164, 227, textureX, textureY); // Box 119
		bodyModel[47] = new ModelRendererTurbo(this, 58, 216, textureX, textureY); // Box 119
		bodyModel[48] = new ModelRendererTurbo(this, 430, 180, textureX, textureY); // Box 119
		bodyModel[49] = new ModelRendererTurbo(this, 409, 166, textureX, textureY); // Box 119
		bodyModel[50] = new ModelRendererTurbo(this, 402, 149, textureX, textureY); // Box 119
		bodyModel[51] = new ModelRendererTurbo(this, 179, 185, textureX, textureY); // Box 119
		bodyModel[52] = new ModelRendererTurbo(this, 105, 213, textureX, textureY); // Box 108
		bodyModel[53] = new ModelRendererTurbo(this, 164, 204, textureX, textureY); // Box 108
		bodyModel[54] = new ModelRendererTurbo(this, 40, 184, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 61, 199, textureX, textureY); // Box 108
		bodyModel[56] = new ModelRendererTurbo(this, 83, 204, textureX, textureY); // Box 108
		bodyModel[57] = new ModelRendererTurbo(this, 131, 207, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 128, 217, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 193, 180, textureX, textureY); // Box 5
		bodyModel[60] = new ModelRendererTurbo(this, 256, 218, textureX, textureY); // Box 119
		bodyModel[61] = new ModelRendererTurbo(this, 290, 142, textureX, textureY); // Box 5
		bodyModel[62] = new ModelRendererTurbo(this, 61, 173, textureX, textureY); // Box 5
		bodyModel[63] = new ModelRendererTurbo(this, 168, 179, textureX, textureY); // Box 119
		bodyModel[64] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 102
		bodyModel[65] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[67] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 11, 122, textureX, textureY); // Box 1
		bodyModel[69] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 191, 192, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 374, 131, textureX, textureY); // Box 98
		bodyModel[72] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 99
		bodyModel[73] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 104
		bodyModel[77] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 105
		bodyModel[78] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 107
		bodyModel[80] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 108
		bodyModel[81] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 109
		bodyModel[82] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 110
		bodyModel[83] = new ModelRendererTurbo(this, 69, 217, textureX, textureY); // Box 111
		bodyModel[84] = new ModelRendererTurbo(this, 64, 149, textureX, textureY); // Box 121
		bodyModel[85] = new ModelRendererTurbo(this, 64, 149, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 64, 149, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 235
		bodyModel[88] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 236
		bodyModel[89] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 237
		bodyModel[90] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 238
		bodyModel[91] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 239
		bodyModel[92] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 240
		bodyModel[93] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 241
		bodyModel[94] = new ModelRendererTurbo(this, 397, 13, textureX, textureY); // Box 242
		bodyModel[95] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 103
		bodyModel[97] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 369, 161, textureX, textureY,"lamp"); // lamp
		bodyModel[101] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 1, 129, textureX, textureY,"lamp"); // lamp
		bodyModel[106] = new ModelRendererTurbo(this, 1, 129, textureX, textureY,"lamp"); // lamp
		bodyModel[107] = new ModelRendererTurbo(this, 1, 129, textureX, textureY,"lamp"); // lamp
		bodyModel[108] = new ModelRendererTurbo(this, 1, 129, textureX, textureY,"lamp"); // lamp
		bodyModel[109] = new ModelRendererTurbo(this, 157, 249, textureX, textureY); // Box 137
		bodyModel[110] = new ModelRendererTurbo(this, 157, 249, textureX, textureY); // Box 138
		bodyModel[111] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 139
		bodyModel[112] = new ModelRendererTurbo(this, 313, 347, textureX, textureY); // Box 1
		bodyModel[113] = new ModelRendererTurbo(this, 313, 264, textureX, textureY); // Box 1
		bodyModel[114] = new ModelRendererTurbo(this, 488, 167, textureX, textureY); // Box 5
		bodyModel[115] = new ModelRendererTurbo(this, 313, 272, textureX, textureY); // Box 5
		bodyModel[116] = new ModelRendererTurbo(this, 486, 140, textureX, textureY); // Box 5
		bodyModel[117] = new ModelRendererTurbo(this, 488, 214, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 314, 305, textureX, textureY); // Box 274
		bodyModel[119] = new ModelRendererTurbo(this, 313, 278, textureX, textureY); // Box 281
		bodyModel[120] = new ModelRendererTurbo(this, 313, 284, textureX, textureY); // Box 288
		bodyModel[121] = new ModelRendererTurbo(this, 314, 293, textureX, textureY); // Box 289
		bodyModel[122] = new ModelRendererTurbo(this, 313, 338, textureX, textureY); // Box 290
		bodyModel[123] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 291
		bodyModel[124] = new ModelRendererTurbo(this, 314, 320, textureX, textureY); // Box 292
		bodyModel[125] = new ModelRendererTurbo(this, 489, 205, textureX, textureY); // Box 157
		bodyModel[126] = new ModelRendererTurbo(this, 505, 122, textureX, textureY); // Box 158
		bodyModel[127] = new ModelRendererTurbo(this, 488, 125, textureX, textureY); // Box 159
		bodyModel[128] = new ModelRendererTurbo(this, 489, 188, textureX, textureY); // Box 160
		bodyModel[129] = new ModelRendererTurbo(this, 428, 316, textureX, textureY); // Box 1
		bodyModel[130] = new ModelRendererTurbo(this, 425, 285, textureX, textureY); // Box 162
		bodyModel[131] = new ModelRendererTurbo(this, 430, 256, textureX, textureY); // Box 163
		bodyModel[132] = new ModelRendererTurbo(this, 425, 258, textureX, textureY); // Box 164
		bodyModel[133] = new ModelRendererTurbo(this, 413, 260, textureX, textureY); // Box 165
		bodyModel[134] = new ModelRendererTurbo(this, 413, 274, textureX, textureY); // Box 166
		bodyModel[135] = new ModelRendererTurbo(this, 420, 248, textureX, textureY); // Box 167
		bodyModel[136] = new ModelRendererTurbo(this, 468, 264, textureX, textureY); // Box 169
		bodyModel[137] = new ModelRendererTurbo(this, 432, 245, textureX, textureY); // Box 170
		bodyModel[138] = new ModelRendererTurbo(this, 444, 256, textureX, textureY); // Box 171
		bodyModel[139] = new ModelRendererTurbo(this, 467, 256, textureX, textureY); // Box 172
		bodyModel[140] = new ModelRendererTurbo(this, 457, 250, textureX, textureY); // Box 173
		bodyModel[141] = new ModelRendererTurbo(this, 441, 247, textureX, textureY); // Box 174
		bodyModel[142] = new ModelRendererTurbo(this, 391, 300, textureX, textureY); // Box 293
		bodyModel[143] = new ModelRendererTurbo(this, 391, 274, textureX, textureY); // Box 294
		bodyModel[144] = new ModelRendererTurbo(this, 391, 253, textureX, textureY); // Box 296
		bodyModel[145] = new ModelRendererTurbo(this, 391, 287, textureX, textureY); // Box 297
		bodyModel[146] = new ModelRendererTurbo(this, 391, 287, textureX, textureY); // Box 298
		bodyModel[147] = new ModelRendererTurbo(this, 391, 300, textureX, textureY); // Box 299
		bodyModel[148] = new ModelRendererTurbo(this, 391, 274, textureX, textureY); // Box 300
		bodyModel[149] = new ModelRendererTurbo(this, 391, 253, textureX, textureY); // Box 301
		bodyModel[150] = new ModelRendererTurbo(this, 391, 287, textureX, textureY); // Box 302
		bodyModel[151] = new ModelRendererTurbo(this, 391, 287, textureX, textureY); // Box 303
		bodyModel[152] = new ModelRendererTurbo(this, 397, 326, textureX, textureY); // Box 405
		bodyModel[153] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[154] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[155] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[156] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[157] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[158] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[159] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[160] = new ModelRendererTurbo(this, 1, 173, textureX, textureY,"lamp"); // Lamp
		bodyModel[161] = new ModelRendererTurbo(this, 397, 326, textureX, textureY); // Box 414

		bodyModel[0].addBox(0F, 0F, 0F, 36, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-18F, -0.5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 0
		bodyModel[1].setRotationPoint(-12F, 5F, -8.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 0
		bodyModel[2].setRotationPoint(-1F, 5F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 0
		bodyModel[3].setRotationPoint(10F, 5F, -8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[4].setRotationPoint(-15F, 2F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[5].setRotationPoint(-15F, 2F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[6].setRotationPoint(17F, 0.5F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[7].setRotationPoint(18F, 1F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[8].setRotationPoint(18F, 1F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[9].setRotationPoint(18F, 0F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[10].setRotationPoint(18F, 1F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 123
		bodyModel[11].setRotationPoint(18F, 1F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 123
		bodyModel[12].setRotationPoint(18F, 0F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[13].setRotationPoint(18F, 0F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[14].setRotationPoint(18F, 2F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[15].setRotationPoint(18F, 2F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[16].setRotationPoint(18F, 0F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(18F, 0F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[18].setRotationPoint(18F, 2F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[19].setRotationPoint(18F, 2F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[20].setRotationPoint(18F, 0F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 36, 10, 1, 0F); // Box 1
		bodyModel[21].setRotationPoint(-18F, -10.5F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 36, 10, 1, 0F); // Box 1
		bodyModel[22].setRotationPoint(-18F, -10.5F, 9.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[23].setRotationPoint(-17.5F, 0.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[24].setRotationPoint(-6F, 0.5F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 35, 1, 2, 0F); // Box 42
		bodyModel[25].setRotationPoint(-17.5F, 7.5F, 7.95F);

		bodyModel[26].addBox(0F, 0F, 0F, 34, 8, 1, 0F); // Box 42
		bodyModel[26].setRotationPoint(-16.5F, 0F, -7.55F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[27].setRotationPoint(-17.5F, 0.5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[28].setRotationPoint(-6F, 0.5F, -8.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 35, 1, 2, 0F); // Box 42
		bodyModel[29].setRotationPoint(-17.5F, 7.5F, -10.05F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[30].setRotationPoint(-6F, 6.5F, -8.75F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[31].setRotationPoint(-17.5F, 6.5F, -8.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[32].setRotationPoint(5.5F, 0.5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[33].setRotationPoint(5.5F, 0.5F, -8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[34].setRotationPoint(5.5F, 6.5F, -8.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 113
		bodyModel[35].setRotationPoint(16.5F, 0.5F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[36].setRotationPoint(16.5F, 0.5F, -8.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 1
		bodyModel[37].setRotationPoint(16.5F, 6.5F, -8.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 10, 19, 0F); // Box 1
		bodyModel[38].setRotationPoint(17F, -10.5F, -9.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 59
		bodyModel[39].setRotationPoint(-17F, 0.5F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 59
		bodyModel[40].setRotationPoint(-23F, 2.5F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 5
		bodyModel[41].setRotationPoint(-23F, 0F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 5
		bodyModel[42].setRotationPoint(-23F, 0F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 26, 9, 19, 0F,-8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[43].setRotationPoint(-17F, -9.5F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 10, 19, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[44].setRotationPoint(9F, -10.5F, -9.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 119
		bodyModel[45].setRotationPoint(15.5F, -12F, 7F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[46].setRotationPoint(16.5F, -12F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 119
		bodyModel[47].setRotationPoint(14.5F, -12F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[48].setRotationPoint(14.5F, -12F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[49].setRotationPoint(16.5F, -12F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 119
		bodyModel[50].setRotationPoint(14.5F, -12F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 119
		bodyModel[51].setRotationPoint(16.5F, -12F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 108
		bodyModel[52].setRotationPoint(10F, -13F, -5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[53].setRotationPoint(10F, -13F, -9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[54].setRotationPoint(14F, -13F, -5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[55].setRotationPoint(14F, -13F, -9.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[56].setRotationPoint(12F, -13F, -5.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 108
		bodyModel[57].setRotationPoint(10F, -13F, -7.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[58].setRotationPoint(12F, -13F, -9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[59].setRotationPoint(-18F, -13.5F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[60].setRotationPoint(18F, -13.5F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 21, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[61].setRotationPoint(17F, -13.5F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[62].setRotationPoint(-14F, -13.5F, 9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 119
		bodyModel[63].setRotationPoint(18F, -13.5F, 10.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 102
		bodyModel[64].setRotationPoint(18.5F, -15.5F, -1F);

		bodyModel[65].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[65].setRotationPoint(-4F, 2F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[66].setRotationPoint(-4F, 2F, 6F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[67].setRotationPoint(7F, 2F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1
		bodyModel[68].setRotationPoint(7F, 2F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(-18F, -13.5F, 9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(-14F, -13.5F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 34, 8, 1, 0F); // Box 98
		bodyModel[71].setRotationPoint(-16.5F, 0F, 6.55F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 99
		bodyModel[72].setRotationPoint(-11.5F, 3F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 100
		bodyModel[73].setRotationPoint(-13.5F, 1F, -8F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 102
		bodyModel[74].setRotationPoint(-11.5F, 3F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 103
		bodyModel[75].setRotationPoint(-13.5F, 1F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 104
		bodyModel[76].setRotationPoint(-0.5F, 3F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 105
		bodyModel[77].setRotationPoint(-2.5F, 1F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 106
		bodyModel[78].setRotationPoint(-0.5F, 3F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 107
		bodyModel[79].setRotationPoint(-2.5F, 1F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 108
		bodyModel[80].setRotationPoint(10.5F, 3F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		bodyModel[81].setRotationPoint(8.5F, 1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 110
		bodyModel[82].setRotationPoint(10.5F, 3F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 111
		bodyModel[83].setRotationPoint(8.5F, 1F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 121
		bodyModel[84].setRotationPoint(17.5F, 0F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122
		bodyModel[85].setRotationPoint(18.5F, 1F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[86].setRotationPoint(19.5F, 0F, -0.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[87].setRotationPoint(20F, -0.5F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[88].setRotationPoint(20F, -0.5F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[89].setRotationPoint(20F, 1.5F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 238
		bodyModel[90].setRotationPoint(20F, 1.5F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[91].setRotationPoint(20F, -0.5F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[92].setRotationPoint(20F, -0.5F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 241
		bodyModel[93].setRotationPoint(20F, 1.5F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[94].setRotationPoint(20F, 1.5F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[95].setRotationPoint(18F, -16.5F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 103
		bodyModel[96].setRotationPoint(19F, -17.5F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 103
		bodyModel[97].setRotationPoint(18F, -17.5F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(19F, -17.5F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[99].setRotationPoint(18F, -17.5F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // lamp
		bodyModel[100].setRotationPoint(19.1F, -15.5F, -0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(17.75F, -14.5F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(17.75F, -14.5F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[103].setRotationPoint(17.75F, -12.5F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 0
		bodyModel[104].setRotationPoint(17.75F, -12.5F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[105].setRotationPoint(19F, -13.5F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[106].setRotationPoint(19F, -13.5F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[107].setRotationPoint(19F, -12.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[108].setRotationPoint(19F, -12.5F, 0F);

		bodyModel[109].addBox(0F, 0F, 0F, 13, 10, 3, 0F); // Box 137
		bodyModel[109].setRotationPoint(-18F, -10.5F, 6.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 13, 10, 3, 0F); // Box 138
		bodyModel[110].setRotationPoint(-18F, -10.5F, -9.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 10, 13, 0F); // Box 139
		bodyModel[111].setRotationPoint(-17F, -10.5F, -6.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[112].setRotationPoint(-18F, -18.5F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[113].setRotationPoint(-18F, -18.5F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[114].setRotationPoint(-16F, -16.5F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[115].setRotationPoint(-18F, -16.5F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[116].setRotationPoint(-16F, -16.5F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 5
		bodyModel[117].setRotationPoint(-18F, -16.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[118].setRotationPoint(-18F, -22.5F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[119].setRotationPoint(-18F, -20.5F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[120].setRotationPoint(-18F, -21.5F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[121].setRotationPoint(-18F, -22.5F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[122].setRotationPoint(-18F, -20.5F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 291
		bodyModel[123].setRotationPoint(-18F, -21.5F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 292
		bodyModel[124].setRotationPoint(-18F, -22.5F, 4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[125].setRotationPoint(-18F, -12.5F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[126].setRotationPoint(-18F, -12.5F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[127].setRotationPoint(-18F, -10.5F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[128].setRotationPoint(-18F, -10.5F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[129].setRotationPoint(-15F, -14.5F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[130].setRotationPoint(-15F, -18.5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[131].setRotationPoint(-15F, -20.5F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[132].setRotationPoint(-15F, -22.5F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[133].setRotationPoint(-15F, -21.5F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[134].setRotationPoint(-15F, -21.5F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[135].setRotationPoint(-15F, -21.5F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[136].setRotationPoint(-15F, -22.5F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[137].setRotationPoint(-15F, -20.5F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[138].setRotationPoint(-15F, -20.5F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[139].setRotationPoint(-15F, -20.5F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[140].setRotationPoint(-15F, -21.5F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[141].setRotationPoint(-15F, -22.5F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[142].setRotationPoint(-15F, -20.5F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[143].setRotationPoint(-15F, -16.5F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 296
		bodyModel[144].setRotationPoint(-15F, -20.5F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[145].setRotationPoint(-15F, -15.5F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[146].setRotationPoint(-15F, -15.5F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 299
		bodyModel[147].setRotationPoint(-15F, -20.5F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[148].setRotationPoint(-15F, -16.5F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[149].setRotationPoint(-15F, -20.5F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[150].setRotationPoint(-15F, -15.5F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[151].setRotationPoint(-15F, -15.5F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[152].setRotationPoint(17F, -4.5F, 5.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[153].setRotationPoint(18.5F, -4F, 6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Lamp
		bodyModel[154].setRotationPoint(18.5F, -3F, 6.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[155].setRotationPoint(18.5F, -3F, 5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[156].setRotationPoint(18.5F, -4F, 5.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[157].setRotationPoint(18.5F, -4F, -6.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Lamp
		bodyModel[158].setRotationPoint(18.5F, -3F, -6.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[159].setRotationPoint(18.5F, -3F, -7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[160].setRotationPoint(18.5F, -4F, -7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[161].setRotationPoint(17F, -4.5F, -7.5F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 162; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}