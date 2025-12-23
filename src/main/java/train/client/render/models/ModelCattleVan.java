package train.client.render.models;//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.12.2022 - 18:35:01
// Last changed on: 28.12.2022 - 18:35:01

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.common.api.Locomotive;

public class ModelCattleVan extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCattleVan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[200];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[2] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 105
		bodyModel[3] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Box 106
		bodyModel[4] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 107
		bodyModel[5] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 108
		bodyModel[6] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 109
		bodyModel[7] = new ModelRendererTurbo(this, 281, 40, textureX, textureY); // Box 110
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[9] = new ModelRendererTurbo(this, 22, 114, textureX, textureY); // Box 121
		bodyModel[10] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[11] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[13] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[15] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 40, 74, textureX, textureY); // Box 83
		bodyModel[17] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[18] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 106
		bodyModel[23] = new ModelRendererTurbo(this, 217, 29, textureX, textureY); // Box 106
		bodyModel[24] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 106
		bodyModel[25] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 106
		bodyModel[26] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 106
		bodyModel[27] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[30] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[31] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[32] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		bodyModel[33] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 106
		bodyModel[34] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 106
		bodyModel[35] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		bodyModel[36] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 106
		bodyModel[37] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 106
		bodyModel[38] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 106
		bodyModel[39] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 106
		bodyModel[40] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[45] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[47] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[48] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[49] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[50] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[52] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[55] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[57] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[58] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[59] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[60] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[61] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 113
		bodyModel[62] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[63] = new ModelRendererTurbo(this, 409, 183, textureX, textureY); // Box 48
		bodyModel[64] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[65] = new ModelRendererTurbo(this, 489, 200, textureX, textureY); // Box 34
		bodyModel[66] = new ModelRendererTurbo(this, 497, 199, textureX, textureY); // Box 34
		bodyModel[67] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 168, 25, textureX, textureY); // Box 1
		bodyModel[69] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[72] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		bodyModel[73] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		bodyModel[74] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[75] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		bodyModel[76] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[77] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		bodyModel[78] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 29
		bodyModel[79] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[80] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 31
		bodyModel[81] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 40
		bodyModel[82] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 41
		bodyModel[83] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 42
		bodyModel[84] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 43
		bodyModel[85] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 44
		bodyModel[86] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 46
		bodyModel[87] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 48
		bodyModel[88] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 49
		bodyModel[89] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 50
		bodyModel[90] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 51
		bodyModel[91] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63
		bodyModel[92] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 64
		bodyModel[93] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 65
		bodyModel[94] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 66
		bodyModel[95] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 67
		bodyModel[96] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 70
		bodyModel[97] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 71
		bodyModel[98] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 72
		bodyModel[99] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 73
		bodyModel[100] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 74
		bodyModel[101] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 90
		bodyModel[102] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 92
		bodyModel[103] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[104] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 41
		bodyModel[105] = new ModelRendererTurbo(this, 349, 128, textureX, textureY); // Box 42
		bodyModel[106] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 43
		bodyModel[107] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 44
		bodyModel[108] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 40
		bodyModel[109] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 41
		bodyModel[110] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 42
		bodyModel[111] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 44
		bodyModel[113] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 83
		bodyModel[114] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 83
		bodyModel[115] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 83
		bodyModel[116] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 83
		bodyModel[117] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 90
		bodyModel[118] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 92
		bodyModel[119] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[120] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[121] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[122] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[123] = new ModelRendererTurbo(this, 249, 64, textureX, textureY); // Box 5
		bodyModel[124] = new ModelRendererTurbo(this, 249, 64, textureX, textureY); // Box 5
		bodyModel[125] = new ModelRendererTurbo(this, 244, 64, textureX, textureY); // Box 5
		bodyModel[126] = new ModelRendererTurbo(this, 248, 64, textureX, textureY); // Box 5
		bodyModel[127] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 5
		bodyModel[128] = new ModelRendererTurbo(this, 275, 129, textureX, textureY); // Box 212
		bodyModel[129] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 5
		bodyModel[130] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 212
		bodyModel[131] = new ModelRendererTurbo(this, 429, 50, textureX, textureY); // Box 5
		bodyModel[132] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 5
		bodyModel[133] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 5
		bodyModel[134] = new ModelRendererTurbo(this, 55, 105, textureX, textureY); // Box 212
		bodyModel[135] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 5
		bodyModel[136] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 212
		bodyModel[137] = new ModelRendererTurbo(this, 252, 55, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 5
		bodyModel[139] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 5
		bodyModel[140] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyModel[141] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 41
		bodyModel[142] = new ModelRendererTurbo(this, 415, 121, textureX, textureY); // Box 42
		bodyModel[143] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 43
		bodyModel[144] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 40
		bodyModel[145] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 41
		bodyModel[146] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 42
		bodyModel[147] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 43
		bodyModel[148] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 67
		bodyModel[149] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 70
		bodyModel[150] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 64
		bodyModel[151] = new ModelRendererTurbo(this, 121, 75, textureX, textureY); // Box 70
		bodyModel[152] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 33
		bodyModel[153] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 29
		bodyModel[154] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[155] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[156] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[157] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[158] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[159] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 108
		bodyModel[160] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 67
		bodyModel[161] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 71
		bodyModel[162] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 174
		bodyModel[163] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 175
		bodyModel[164] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 176
		bodyModel[165] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 177
		bodyModel[166] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 178
		bodyModel[167] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 179
		bodyModel[168] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 180
		bodyModel[169] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 181
		bodyModel[170] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 235
		bodyModel[174] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 236
		bodyModel[175] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 237
		bodyModel[176] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 238
		bodyModel[177] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 239
		bodyModel[178] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 240
		bodyModel[179] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 241
		bodyModel[180] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 242
		bodyModel[181] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 243
		bodyModel[182] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 244
		bodyModel[183] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 245
		bodyModel[184] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 246
		bodyModel[185] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 247
		bodyModel[186] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 248
		bodyModel[187] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 249
		bodyModel[188] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 250
		bodyModel[189] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 251
		bodyModel[190] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 252
		bodyModel[191] = new ModelRendererTurbo(this, 305, 18, textureX, textureY); // Box 253
		bodyModel[192] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 254
		bodyModel[193] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 255
		bodyModel[194] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 256
		bodyModel[195] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 257
		bodyModel[196] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 258
		bodyModel[197] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 259
		bodyModel[198] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 260
		bodyModel[199] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 261

		bodyModel[0].addBox(0F, 0F, 0F, 42, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-21F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[1].setRotationPoint(-21F, -19F, 9F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[2].setRotationPoint(-14F, 5F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[3].setRotationPoint(12F, 5F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 107
		bodyModel[4].setRotationPoint(-18F, 1F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 108
		bodyModel[5].setRotationPoint(-18F, 1F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 109
		bodyModel[6].setRotationPoint(8F, 1F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 9, 9, 0, 0F); // Box 110
		bodyModel[7].setRotationPoint(8F, 1F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[8].setRotationPoint(-21F, 1F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 121
		bodyModel[9].setRotationPoint(20F, 1F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[10].setRotationPoint(-6F, -19F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[11].setRotationPoint(5F, -19F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[12].setRotationPoint(-21F, -20F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[13].setRotationPoint(-21F, -19F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[14].setRotationPoint(-21F, -20F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 83
		bodyModel[15].setRotationPoint(20F, -19F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[16].setRotationPoint(20F, -19F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[17].setRotationPoint(-6F, -19F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[18].setRotationPoint(5F, -19F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(-21F, -20F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(20F, -20F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[21].setRotationPoint(-7F, 1F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[22].setRotationPoint(-5F, 1F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[23].setRotationPoint(-9F, 1F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[24].setRotationPoint(-6F, 6F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[25].setRotationPoint(4F, 1F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 106
		bodyModel[26].setRotationPoint(-14F, 6F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[27].setRotationPoint(6F, 1F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[28].setRotationPoint(6F, 3F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[29].setRotationPoint(-14.5F, 2F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[30].setRotationPoint(-14F, 2F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[31].setRotationPoint(-14F, 2F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[32].setRotationPoint(5F, 1F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[33].setRotationPoint(7F, 1F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F); // Box 106
		bodyModel[34].setRotationPoint(3F, 1F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[35].setRotationPoint(-13F, 6F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 106
		bodyModel[36].setRotationPoint(-7F, 1F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 106
		bodyModel[37].setRotationPoint(-7F, 6F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[38].setRotationPoint(-8F, 1F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 106
		bodyModel[39].setRotationPoint(-13F, 3F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[40].setRotationPoint(-20F, 1.75F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[41].setRotationPoint(-20F, 1F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[42].setRotationPoint(-14.5F, 4.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[43].setRotationPoint(-15F, 1.25F, -8.95F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[44].setRotationPoint(-14.5F, 1.5F, -8.95F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[45].setRotationPoint(-14F, 1.75F, -8.95F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[46].setRotationPoint(11.5F, 2F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[47].setRotationPoint(12F, 2F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[48].setRotationPoint(12F, 2F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[49].setRotationPoint(11.5F, 4.5F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[50].setRotationPoint(11F, 1.25F, -8.95F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[51].setRotationPoint(11.5F, 1.5F, -8.95F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[52].setRotationPoint(12F, 1.75F, -8.95F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[53].setRotationPoint(-14.5F, 2F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[54].setRotationPoint(-14F, 2F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[55].setRotationPoint(-14F, 2F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[56].setRotationPoint(-14.5F, 4.5F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[57].setRotationPoint(-15F, 1.25F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[58].setRotationPoint(-14.5F, 1.5F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[59].setRotationPoint(-14F, 1.75F, 7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 113
		bodyModel[60].setRotationPoint(11.5F, 2F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 113
		bodyModel[61].setRotationPoint(12F, 2F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[62].setRotationPoint(12F, 2F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 48
		bodyModel[63].setRotationPoint(11.5F, 4.5F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[64].setRotationPoint(11F, 1.25F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[65].setRotationPoint(11.5F, 1.5F, 7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[66].setRotationPoint(12F, 1.75F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[67].setRotationPoint(-20F, 1.75F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[68].setRotationPoint(-20F, 1F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[69].setRotationPoint(-20F, -12F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[70].setRotationPoint(-20F, -12F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 5
		bodyModel[71].setRotationPoint(-20F, -4.25F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 9
		bodyModel[72].setRotationPoint(-20F, -2F, 10F);

		bodyModel[73].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 12
		bodyModel[73].setRotationPoint(-20F, -6.5F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 14
		bodyModel[74].setRotationPoint(-20F, -11F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 15
		bodyModel[75].setRotationPoint(-20F, -8.75F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 27
		bodyModel[76].setRotationPoint(-20F, -11F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 28
		bodyModel[77].setRotationPoint(-20F, -6.5F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 29
		bodyModel[78].setRotationPoint(-20F, -8.75F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 30
		bodyModel[79].setRotationPoint(-20F, -4.25F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 31
		bodyModel[80].setRotationPoint(-20F, -2F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 40
		bodyModel[81].setRotationPoint(6F, -11F, 10F);

		bodyModel[82].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 41
		bodyModel[82].setRotationPoint(6F, -8.75F, 10F);

		bodyModel[83].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 42
		bodyModel[83].setRotationPoint(6F, -6.5F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 43
		bodyModel[84].setRotationPoint(6F, -4.25F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 44
		bodyModel[85].setRotationPoint(6F, -2F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 46
		bodyModel[86].setRotationPoint(6F, -11F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 48
		bodyModel[87].setRotationPoint(6F, -8.75F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 49
		bodyModel[88].setRotationPoint(6F, -6.5F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 50
		bodyModel[89].setRotationPoint(6F, -4.25F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 51
		bodyModel[90].setRotationPoint(6F, -2F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 63
		bodyModel[91].setRotationPoint(-5F, -11F, 10F);

		bodyModel[92].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 64
		bodyModel[92].setRotationPoint(-5F, -4.25F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 65
		bodyModel[93].setRotationPoint(-5F, -2F, 10F);

		bodyModel[94].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 66
		bodyModel[94].setRotationPoint(-5F, -6.5F, 10F);

		bodyModel[95].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 67
		bodyModel[95].setRotationPoint(-5F, -8.75F, 10F);

		bodyModel[96].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 70
		bodyModel[96].setRotationPoint(-5F, -11F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 71
		bodyModel[97].setRotationPoint(-5F, -8.75F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 72
		bodyModel[98].setRotationPoint(-5F, -6.5F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 73
		bodyModel[99].setRotationPoint(-5F, -4.25F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 74
		bodyModel[100].setRotationPoint(-5F, -2F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 90
		bodyModel[101].setRotationPoint(-3F, -8F, 9.25F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 92
		bodyModel[102].setRotationPoint(2F, -8F, 9.25F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 40
		bodyModel[103].setRotationPoint(20F, -11F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 41
		bodyModel[104].setRotationPoint(20F, -8.75F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 42
		bodyModel[105].setRotationPoint(20F, -6.5F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 43
		bodyModel[106].setRotationPoint(20F, -4.25F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 44
		bodyModel[107].setRotationPoint(20F, -2F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 40
		bodyModel[108].setRotationPoint(-21F, -11F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 41
		bodyModel[109].setRotationPoint(-21F, -8.75F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 42
		bodyModel[110].setRotationPoint(-21F, -6.5F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 43
		bodyModel[111].setRotationPoint(-21F, -4.25F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 44
		bodyModel[112].setRotationPoint(-21F, -2F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -1F, -1F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F); // Box 83
		bodyModel[113].setRotationPoint(-21F, -11F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.05F, 0F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F); // Box 83
		bodyModel[114].setRotationPoint(20F, -11F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-1F, -1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -1F, -1F, 0F, -14F, 0F, 0.05F, 14F, 0F, 0.05F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 83
		bodyModel[115].setRotationPoint(-21F, -11F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0.05F, -1F, -1F, 0.05F, -1F, -1F, 0F, 0F, 0F, 0F, 14F, 0F, 0.05F, -14F, 0F, 0.05F, -14F, 0F, 0F, 14F, 0F, 0F); // Box 83
		bodyModel[116].setRotationPoint(20F, -11F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 90
		bodyModel[117].setRotationPoint(-3F, -8F, -11.25F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 92
		bodyModel[118].setRotationPoint(2F, -8F, -11.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[119].setRotationPoint(-5F, -14F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[120].setRotationPoint(-5F, -14F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 83
		bodyModel[121].setRotationPoint(6F, -12F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 83
		bodyModel[122].setRotationPoint(6F, -12F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, -2F, 0.05F, 0F, -2F, 0.05F, 0F, 1.05F, 0.05F, 0F, 1.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F); // Box 5
		bodyModel[123].setRotationPoint(-20F, -21F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, -4F, 0.05F, 0F, -4F, 0.05F, -0.05F, 3F, 0.05F, -0.05F, 3F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F); // Box 5
		bodyModel[124].setRotationPoint(-20F, -22F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, 0F, 1.05F, 0.05F, 0F, 1.05F, 0.05F, 0F, -2F, 0.05F, 0F, -2F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 5
		bodyModel[125].setRotationPoint(-20F, -21F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0.05F, -0.05F, 3F, 0.05F, -0.05F, 3F, 0.05F, 0F, -4F, 0.05F, 0F, -4F, 0.05F, 0F, -0.95F, 0.05F, 0F, -0.95F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 5
		bodyModel[126].setRotationPoint(-20F, -22F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 40, 1, 10, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F, 0.05F, -0.95F, 0F); // Box 5
		bodyModel[127].setRotationPoint(-20F, -22F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[128].setRotationPoint(-21.05F, -21F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[129].setRotationPoint(-21.05F, -21F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[130].setRotationPoint(-21.05F, -22F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[131].setRotationPoint(-21.05F, -22F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[132].setRotationPoint(-21.05F, -22F, 5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[133].setRotationPoint(20.05F, -21F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[134].setRotationPoint(20.05F, -21F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[135].setRotationPoint(20.05F, -21F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[136].setRotationPoint(20.05F, -22F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[137].setRotationPoint(20.05F, -22F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[138].setRotationPoint(20.05F, -22F, 5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[139].setRotationPoint(-21.05F, -21F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 40
		bodyModel[140].setRotationPoint(20F, -19F, -9F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 41
		bodyModel[141].setRotationPoint(20F, -17.75F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 42
		bodyModel[142].setRotationPoint(20F, -15.5F, -9F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 43
		bodyModel[143].setRotationPoint(20F, -13.25F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 40
		bodyModel[144].setRotationPoint(-21F, -19F, -9F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 41
		bodyModel[145].setRotationPoint(-21F, -17.75F, -9F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 42
		bodyModel[146].setRotationPoint(-21F, -15.5F, -9F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 43
		bodyModel[147].setRotationPoint(-21F, -13.25F, -9F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 67
		bodyModel[148].setRotationPoint(-16.5F, 1F, 8.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 70
		bodyModel[149].setRotationPoint(15.5F, 1F, 8.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 64
		bodyModel[150].setRotationPoint(-16.5F, 1F, -8.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 70
		bodyModel[151].setRotationPoint(15.5F, 1F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[152].setRotationPoint(-16F, 7.75F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		bodyModel[153].setRotationPoint(-16F, 7.75F, 8F);

		bodyModel[154].addBox(0F, 0F, 0F, 14, 7, 0, 0F); // Box 108
		bodyModel[154].setRotationPoint(-20F, -19F, 10.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 10, 5, 0, 0F); // Box 108
		bodyModel[155].setRotationPoint(-5F, -19F, 10.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 14, 7, 0, 0F); // Box 108
		bodyModel[156].setRotationPoint(6F, -19F, 10.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 14, 7, 0, 0F); // Box 108
		bodyModel[157].setRotationPoint(-20F, -19F, -10.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 10, 5, 0, 0F); // Box 108
		bodyModel[158].setRotationPoint(-5F, -19F, -10.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 14, 7, 0, 0F); // Box 108
		bodyModel[159].setRotationPoint(6F, -19F, -10.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 67
		bodyModel[160].setRotationPoint(-5F, -13.25F, 10F);

		bodyModel[161].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 71
		bodyModel[161].setRotationPoint(-5F, -13.25F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[162].setRotationPoint(-23F, 0.5F, 6.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[163].setRotationPoint(-23F, 1.5F, 6.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[164].setRotationPoint(-23F, 0.5F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 177
		bodyModel[165].setRotationPoint(-23F, 1.5F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		bodyModel[166].setRotationPoint(-24F, 1.5F, 5.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 179
		bodyModel[167].setRotationPoint(-24F, 1.5F, 7.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
		bodyModel[168].setRotationPoint(-24F, -0.5F, 7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 181
		bodyModel[169].setRotationPoint(-24F, -0.5F, 5.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[170].setRotationPoint(-21.5F, 0F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[171].setRotationPoint(-22.5F, 1F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 173
		bodyModel[172].setRotationPoint(-23.5F, 0F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[173].setRotationPoint(-23F, 0.5F, -7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236
		bodyModel[174].setRotationPoint(-23F, 1.5F, -7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[175].setRotationPoint(-23F, 0.5F, -8.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[176].setRotationPoint(-23F, 1.5F, -8.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 239
		bodyModel[177].setRotationPoint(-24F, 1.5F, -7.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 240
		bodyModel[178].setRotationPoint(-24F, 1.5F, -9.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 241
		bodyModel[179].setRotationPoint(-24F, -0.5F, -9.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[180].setRotationPoint(-24F, -0.5F, -7.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[181].setRotationPoint(21F, 0.5F, 6.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[182].setRotationPoint(21F, 1.5F, 6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[183].setRotationPoint(21F, 0.5F, 7.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 246
		bodyModel[184].setRotationPoint(21F, 1.5F, 7.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[185].setRotationPoint(23F, 1.5F, 5.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 248
		bodyModel[186].setRotationPoint(23F, 1.5F, 7.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[187].setRotationPoint(23F, -0.5F, 7.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[188].setRotationPoint(23F, -0.5F, 5.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[189].setRotationPoint(20.5F, 0F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[190].setRotationPoint(21.5F, 1F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[191].setRotationPoint(22.5F, 0F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[192].setRotationPoint(21F, 0.5F, -8.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[193].setRotationPoint(21F, 1.5F, -8.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[194].setRotationPoint(23F, -0.5F, -9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[195].setRotationPoint(23F, 1.5F, -9.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[196].setRotationPoint(21F, 0.5F, -7.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 259
		bodyModel[197].setRotationPoint(21F, 1.5F, -7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[198].setRotationPoint(23F, -0.5F, -7.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 261
		bodyModel[199].setRotationPoint(23F, 1.5F, -7.5F);
	}
}