//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.03.2026 - 14:58:43
// Last changed on: 21.03.2026 - 14:58:43

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBR_Bogie_Tanker extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBR_Bogie_Tanker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[246];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 6
		bodyModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 6
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 6
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		bodyModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
		bodyModel[42] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		bodyModel[43] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		bodyModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 6
		bodyModel[45] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 6
		bodyModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 6
		bodyModel[47] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 31
		bodyModel[49] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 31
		bodyModel[50] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 31
		bodyModel[51] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 31
		bodyModel[52] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 31
		bodyModel[53] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 31
		bodyModel[54] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
		bodyModel[55] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 31
		bodyModel[56] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 50
		bodyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 50
		bodyModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 50
		bodyModel[59] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 50
		bodyModel[60] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 50
		bodyModel[61] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 6
		bodyModel[62] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 6
		bodyModel[64] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 6
		bodyModel[65] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 6
		bodyModel[66] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 6
		bodyModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 6
		bodyModel[68] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 6
		bodyModel[69] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 6
		bodyModel[71] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 6
		bodyModel[72] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 6
		bodyModel[73] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 6
		bodyModel[74] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 6
		bodyModel[75] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 6
		bodyModel[76] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 6
		bodyModel[77] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		bodyModel[78] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 6
		bodyModel[79] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 4
		bodyModel[84] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 4
		bodyModel[85] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 6
		bodyModel[86] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 6
		bodyModel[87] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 6
		bodyModel[88] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 6
		bodyModel[89] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 6
		bodyModel[90] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 6
		bodyModel[92] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		bodyModel[93] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 6
		bodyModel[94] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 6
		bodyModel[95] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 6
		bodyModel[96] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 6
		bodyModel[97] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 6
		bodyModel[98] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 6
		bodyModel[99] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 6
		bodyModel[100] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 6
		bodyModel[101] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 6
		bodyModel[102] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 6
		bodyModel[103] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 6
		bodyModel[104] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 6
		bodyModel[105] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 6
		bodyModel[106] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 6
		bodyModel[107] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 6
		bodyModel[108] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 6
		bodyModel[109] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 6
		bodyModel[110] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 6
		bodyModel[111] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 6
		bodyModel[112] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 6
		bodyModel[113] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 6
		bodyModel[114] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 6
		bodyModel[115] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 6
		bodyModel[116] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 6
		bodyModel[117] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 6
		bodyModel[118] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 6
		bodyModel[119] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		bodyModel[120] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 6
		bodyModel[121] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 6
		bodyModel[122] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 6
		bodyModel[123] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 6
		bodyModel[124] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 6
		bodyModel[125] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 6
		bodyModel[126] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 6
		bodyModel[127] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 6
		bodyModel[128] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 6
		bodyModel[129] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 6
		bodyModel[130] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 6
		bodyModel[131] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 6
		bodyModel[132] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 6
		bodyModel[133] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 6
		bodyModel[134] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 6
		bodyModel[135] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 6
		bodyModel[136] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 6
		bodyModel[137] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 6
		bodyModel[138] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 6
		bodyModel[139] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 6
		bodyModel[140] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 50
		bodyModel[141] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 31
		bodyModel[142] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 31
		bodyModel[143] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 31
		bodyModel[144] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 31
		bodyModel[145] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 31
		bodyModel[146] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 31
		bodyModel[147] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 31
		bodyModel[148] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 31
		bodyModel[149] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 50
		bodyModel[150] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 50
		bodyModel[151] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 50
		bodyModel[152] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 50
		bodyModel[153] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 50
		bodyModel[154] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 6
		bodyModel[155] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 6
		bodyModel[156] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 6
		bodyModel[157] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 6
		bodyModel[158] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 6
		bodyModel[159] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 6
		bodyModel[160] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 6
		bodyModel[161] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 6
		bodyModel[162] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 6
		bodyModel[163] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 6
		bodyModel[164] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 6
		bodyModel[165] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 6
		bodyModel[166] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 6
		bodyModel[167] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 6
		bodyModel[168] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 6
		bodyModel[169] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 6
		bodyModel[170] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 6
		bodyModel[171] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 6
		bodyModel[172] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 6
		bodyModel[173] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 6
		bodyModel[174] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 6
		bodyModel[175] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 6
		bodyModel[176] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 6
		bodyModel[177] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 6
		bodyModel[178] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 6
		bodyModel[179] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 6
		bodyModel[180] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 6
		bodyModel[181] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 6
		bodyModel[182] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 6
		bodyModel[183] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 6
		bodyModel[184] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 6
		bodyModel[185] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 6
		bodyModel[186] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 6
		bodyModel[187] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 6
		bodyModel[188] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 6
		bodyModel[189] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 6
		bodyModel[190] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 6
		bodyModel[191] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[192] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 6
		bodyModel[193] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 6
		bodyModel[194] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 6
		bodyModel[195] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 6
		bodyModel[196] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 6
		bodyModel[197] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 6
		bodyModel[198] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 6
		bodyModel[199] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 6
		bodyModel[200] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 6
		bodyModel[201] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 6
		bodyModel[202] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 6
		bodyModel[203] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 6
		bodyModel[204] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 6
		bodyModel[205] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		bodyModel[206] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 6
		bodyModel[207] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 6
		bodyModel[208] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 6
		bodyModel[209] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 6
		bodyModel[210] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[211] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 6
		bodyModel[212] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 6
		bodyModel[213] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		bodyModel[214] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 6
		bodyModel[215] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 6
		bodyModel[216] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 6
		bodyModel[217] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 6
		bodyModel[218] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 6
		bodyModel[219] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 6
		bodyModel[220] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 6
		bodyModel[221] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 6
		bodyModel[222] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 6
		bodyModel[223] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 6
		bodyModel[224] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 6
		bodyModel[225] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 6
		bodyModel[226] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		bodyModel[227] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 6
		bodyModel[228] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 6
		bodyModel[229] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 6
		bodyModel[230] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 6
		bodyModel[231] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 6
		bodyModel[232] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 6
		bodyModel[233] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 6
		bodyModel[234] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 6
		bodyModel[235] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 6
		bodyModel[236] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 6
		bodyModel[237] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 6
		bodyModel[238] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 6
		bodyModel[239] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 6
		bodyModel[240] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 6
		bodyModel[241] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 6
		bodyModel[242] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 6
		bodyModel[243] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 6
		bodyModel[244] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 6
		bodyModel[245] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 6

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-36F, 3F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-36F, 3F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-25F, 3F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-25F, 3F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 4
		bodyModel[4].setRotationPoint(-34F, 5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 4
		bodyModel[5].setRotationPoint(-23F, 5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-31F, 6F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(-30F, 3F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[8].setRotationPoint(-36F, 3F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, -1F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F); // Box 6
		bodyModel[9].setRotationPoint(-37F, 3F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(-33F, 4F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(-26F, 3F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[12].setRotationPoint(-20F, 3F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F); // Box 6
		bodyModel[13].setRotationPoint(-25F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[14].setRotationPoint(-31F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 6
		bodyModel[15].setRotationPoint(-26F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[16].setRotationPoint(-29.4F, 4F, -8.2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(-30F, 5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.9F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(-30F, 5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[19].setRotationPoint(-28.4F, 4F, -8.2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[20].setRotationPoint(-27.4F, 4F, -8.2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 6
		bodyModel[21].setRotationPoint(-30F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-30.5F, 4F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(-26.5F, 4F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[24].setRotationPoint(-37F, 5.5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 6
		bodyModel[25].setRotationPoint(-37F, 3F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(-29F, 1.2F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-35F, 4.5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F); // Box 6
		bodyModel[28].setRotationPoint(-24F, 4.5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[29].setRotationPoint(-31F, 6F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[30].setRotationPoint(-30F, 3F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[31].setRotationPoint(-36F, 3F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -1F, 0.6F, 0F); // Box 6
		bodyModel[32].setRotationPoint(-37F, 3F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[33].setRotationPoint(-33F, 4F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[34].setRotationPoint(-26F, 3F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.7F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, -1F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[35].setRotationPoint(-20F, 3F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F); // Box 6
		bodyModel[36].setRotationPoint(-25F, 4F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[37].setRotationPoint(-31F, 4F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 6
		bodyModel[38].setRotationPoint(-26F, 4F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F); // Box 6
		bodyModel[39].setRotationPoint(-35F, 4.5F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F); // Box 6
		bodyModel[40].setRotationPoint(-24F, 4.5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[41].setRotationPoint(-29.4F, 4F, 7.2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[42].setRotationPoint(-30F, 5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.9F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 6
		bodyModel[43].setRotationPoint(-30F, 5F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[44].setRotationPoint(-28.4F, 4F, 7.2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[45].setRotationPoint(-27.4F, 4F, 7.2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Box 6
		bodyModel[46].setRotationPoint(-30F, 4F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 50
		bodyModel[47].setRotationPoint(-38F, 1F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[48].setRotationPoint(-40F, 1.5F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, -2.9F, 0.2F, 0F, -2.9F, 0.2F, 0F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F); // Box 31
		bodyModel[49].setRotationPoint(-41F, 1F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.9F, -0.8F, -0.4F, -1.9F, -0.8F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, -3.3F, -1.9F, -0.8F, -3.3F, -1.9F); // Box 31
		bodyModel[50].setRotationPoint(-41F, 1F, -6.3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, -3.3F, 0.1F, 0F, -3.3F, 0.1F, 0F, -2.9F, -2F, -0.8F, -2.9F, -2F); // Box 31
		bodyModel[51].setRotationPoint(-41F, 1F, -8.7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[52].setRotationPoint(-40F, 1.5F, 6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, -2.9F, 0.2F, 0F, -2.9F, 0.2F, 0F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F); // Box 31
		bodyModel[53].setRotationPoint(-41F, 1F, 6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.9F, -0.8F, -0.4F, -1.9F, -0.8F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, -3.3F, -1.9F, -0.8F, -3.3F, -1.9F); // Box 31
		bodyModel[54].setRotationPoint(-41F, 1F, 7.7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, -3.3F, 0.1F, 0F, -3.3F, 0.1F, 0F, -2.9F, -2F, -0.8F, -2.9F, -2F); // Box 31
		bodyModel[55].setRotationPoint(-41F, 1F, 5.3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[56].setRotationPoint(-37.5F, 1F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[57].setRotationPoint(-37.5F, 1F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[58].setRotationPoint(-37.5F, 2F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 50
		bodyModel[59].setRotationPoint(-37.5F, 1F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 50
		bodyModel[60].setRotationPoint(-37.5F, 2F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[61].setRotationPoint(-35F, 0F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.1F, -0.55F, -0.3F, -0.1F, -0.55F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[62].setRotationPoint(-37F, 4F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.55F, -0.5F, -0.1F, -0.55F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.55F, -0.5F, 0F, -0.55F); // Box 6
		bodyModel[63].setRotationPoint(-37F, 4F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 6
		bodyModel[64].setRotationPoint(-20F, 5.5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, -0.55F, -0.5F, -0.1F, -0.55F, 0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.55F, -0.5F, 0F, -0.55F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 6
		bodyModel[65].setRotationPoint(-20F, 4F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, -0.55F, -0.3F, -0.1F, -0.55F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.55F, -0.3F, 0F, -0.55F); // Box 6
		bodyModel[66].setRotationPoint(-20F, 4F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[67].setRotationPoint(-37F, 4F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[68].setRotationPoint(-20F, 4F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 6
		bodyModel[69].setRotationPoint(-38F, 1F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 70, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[70].setRotationPoint(-35F, 0F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[71].setRotationPoint(-16F, 0F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[72].setRotationPoint(-37F, 0F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[73].setRotationPoint(-35F, 0F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 70, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[74].setRotationPoint(-35F, 0F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F); // Box 6
		bodyModel[75].setRotationPoint(-16F, 0F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[76].setRotationPoint(-37F, 0F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[77].setRotationPoint(-16F, 1F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[78].setRotationPoint(-29F, 1F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[79].setRotationPoint(20F, 3F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[80].setRotationPoint(20F, 3F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[81].setRotationPoint(31F, 3F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[82].setRotationPoint(31F, 3F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 4
		bodyModel[83].setRotationPoint(22F, 5F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 4
		bodyModel[84].setRotationPoint(33F, 5F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[85].setRotationPoint(25F, 6F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[86].setRotationPoint(26F, 3F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[87].setRotationPoint(20F, 3F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, -1F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F); // Box 6
		bodyModel[88].setRotationPoint(19F, 3F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[89].setRotationPoint(23F, 4F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[90].setRotationPoint(30F, 3F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[91].setRotationPoint(36F, 3F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F); // Box 6
		bodyModel[92].setRotationPoint(31F, 4F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[93].setRotationPoint(25F, 4F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 6
		bodyModel[94].setRotationPoint(30F, 4F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[95].setRotationPoint(26.6F, 4F, -8.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[96].setRotationPoint(26F, 5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.9F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[97].setRotationPoint(26F, 5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[98].setRotationPoint(27.6F, 4F, -8.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[99].setRotationPoint(28.6F, 4F, -8.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 6
		bodyModel[100].setRotationPoint(26F, 4F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[101].setRotationPoint(25.5F, 4F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[102].setRotationPoint(29.5F, 4F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[103].setRotationPoint(19F, 5.5F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 6
		bodyModel[104].setRotationPoint(19F, 3F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[105].setRotationPoint(27F, 1.2F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F); // Box 6
		bodyModel[106].setRotationPoint(21F, 4.5F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F); // Box 6
		bodyModel[107].setRotationPoint(32F, 4.5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[108].setRotationPoint(25F, 6F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[109].setRotationPoint(26F, 3F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[110].setRotationPoint(20F, 3F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -1F, 0.6F, 0F); // Box 6
		bodyModel[111].setRotationPoint(19F, 3F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.1F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[112].setRotationPoint(23F, 4F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[113].setRotationPoint(30F, 3F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.7F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, -1F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 6
		bodyModel[114].setRotationPoint(36F, 3F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0.3F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, -1F, 0F); // Box 6
		bodyModel[115].setRotationPoint(31F, 4F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[116].setRotationPoint(25F, 4F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 6
		bodyModel[117].setRotationPoint(30F, 4F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F); // Box 6
		bodyModel[118].setRotationPoint(21F, 4.5F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.25F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.25F, 0F, -0.95F, 0.1F, 0F, -0.7F, 0.4F, 0F, -0.7F, 0.4F, 0F, -0.95F, 0.1F, 0F); // Box 6
		bodyModel[119].setRotationPoint(32F, 4.5F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[120].setRotationPoint(26.6F, 4F, 7.2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 6
		bodyModel[121].setRotationPoint(26F, 5F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.9F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 6
		bodyModel[122].setRotationPoint(26F, 5F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[123].setRotationPoint(27.6F, 4F, 7.2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[124].setRotationPoint(28.6F, 4F, 7.2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Box 6
		bodyModel[125].setRotationPoint(26F, 4F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.1F, -0.55F, -0.3F, -0.1F, -0.55F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[126].setRotationPoint(19F, 4F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.55F, -0.5F, -0.1F, -0.55F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.55F, -0.5F, 0F, -0.55F); // Box 6
		bodyModel[127].setRotationPoint(19F, 4F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 6
		bodyModel[128].setRotationPoint(36F, 5.5F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, -0.55F, -0.5F, -0.1F, -0.55F, 0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.55F, -0.5F, 0F, -0.55F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 6
		bodyModel[129].setRotationPoint(36F, 4F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, -0.55F, -0.3F, -0.1F, -0.55F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.55F, -0.3F, 0F, -0.55F); // Box 6
		bodyModel[130].setRotationPoint(36F, 4F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[131].setRotationPoint(19F, 4F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[132].setRotationPoint(36F, 4F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[133].setRotationPoint(27F, 1F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[134].setRotationPoint(16F, 0F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[135].setRotationPoint(14F, 0F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[136].setRotationPoint(35F, 0F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 6
		bodyModel[137].setRotationPoint(16F, 0F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F); // Box 6
		bodyModel[138].setRotationPoint(14F, 0F, 6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[139].setRotationPoint(35F, 0F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 50
		bodyModel[140].setRotationPoint(37F, 1F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 31
		bodyModel[141].setRotationPoint(37F, 1.5F, -7.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F, 0F, -2.9F, 0.2F); // Box 31
		bodyModel[142].setRotationPoint(40F, 1F, -7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.4F, -1.9F, 0F, -0.4F, -1.9F, 0F, -2.9F, 0F, -0.8F, -2.9F, 0F, -0.8F, -3.3F, -1.9F, 0F, -3.3F, -1.9F); // Box 31
		bodyModel[143].setRotationPoint(40F, 1F, -6.3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -0.4F, 0.1F, -0.8F, -0.4F, 0.1F, -0.8F, 0F, -2F, 0F, 0F, -2F, 0F, -3.3F, 0.1F, -0.8F, -3.3F, 0.1F, -0.8F, -2.9F, -2F, 0F, -2.9F, -2F); // Box 31
		bodyModel[144].setRotationPoint(40F, 1F, -8.7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 31
		bodyModel[145].setRotationPoint(37F, 1.5F, 6.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F, -0.8F, -2.9F, 0.2F, 0F, -2.9F, 0.2F); // Box 31
		bodyModel[146].setRotationPoint(40F, 1F, 6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.4F, -1.9F, 0F, -0.4F, -1.9F, 0F, -2.9F, 0F, -0.8F, -2.9F, 0F, -0.8F, -3.3F, -1.9F, 0F, -3.3F, -1.9F); // Box 31
		bodyModel[147].setRotationPoint(40F, 1F, 7.7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -0.4F, 0.1F, -0.8F, -0.4F, 0.1F, -0.8F, 0F, -2F, 0F, 0F, -2F, 0F, -3.3F, 0.1F, -0.8F, -3.3F, 0.1F, -0.8F, -2.9F, -2F, 0F, -2.9F, -2F); // Box 31
		bodyModel[148].setRotationPoint(40F, 1F, 5.3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 50
		bodyModel[149].setRotationPoint(34.5F, 1F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 50
		bodyModel[150].setRotationPoint(35.5F, 1F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 50
		bodyModel[151].setRotationPoint(35.5F, 2F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -2F); // Box 50
		bodyModel[152].setRotationPoint(35.5F, 1F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 50
		bodyModel[153].setRotationPoint(35.5F, 2F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[154].setRotationPoint(35F, 1F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[155].setRotationPoint(14F, 1F, -5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.7F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.5F, -0.7F, -0.3F, -0.4F, 0.5F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.4F, 0.5F, -0.3F); // Box 6
		bodyModel[156].setRotationPoint(-40F, 1.5F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.2F, -0.7F, -0.3F, 0.6F, -0.5F, -0.3F, 0.6F, -0.5F, -0.3F, -1.2F, -0.7F, -0.3F, -0.9F, -0.2F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, -0.9F, -0.2F, -0.3F); // Box 6
		bodyModel[157].setRotationPoint(-41F, 1F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.6F, -0.3F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 6
		bodyModel[158].setRotationPoint(-39F, 1.5F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.6F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.7F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.6F, 0F, -0.7F); // Box 6
		bodyModel[159].setRotationPoint(-39F, 1.5F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.6F, -0.7F, 0F); // Box 6
		bodyModel[160].setRotationPoint(-39F, 4.5F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.3F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, -0.4F, 0.5F, -0.3F, -0.4F, 0.5F, -0.3F, 0F, -0.2F, -0.3F); // Box 6
		bodyModel[161].setRotationPoint(38F, 1.5F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.6F, -0.5F, -0.3F, -1.2F, -0.7F, -0.3F, -1.2F, -0.7F, -0.3F, 0.6F, -0.5F, -0.3F, 0.4F, 0F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, 0.4F, 0F, -0.3F); // Box 6
		bodyModel[162].setRotationPoint(40F, 1F, -0.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.7F, -0.6F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[163].setRotationPoint(38F, 1.5F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 6
		bodyModel[164].setRotationPoint(38F, 1.5F, -0.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 6
		bodyModel[165].setRotationPoint(38F, 4.5F, -0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[166].setRotationPoint(-17F, 1F, 5.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[167].setRotationPoint(-17F, 1F, -6.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F); // Box 6
		bodyModel[168].setRotationPoint(-17F, 5F, -7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[169].setRotationPoint(16F, 1F, 5.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[170].setRotationPoint(16F, 1F, -6.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F); // Box 6
		bodyModel[171].setRotationPoint(16F, 5F, -7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[172].setRotationPoint(-3F, 1.8F, -6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 6
		bodyModel[173].setRotationPoint(-3F, 1.8F, -5.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[174].setRotationPoint(-2.7F, 1F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[175].setRotationPoint(0.3F, 1F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 6
		bodyModel[176].setRotationPoint(6F, 2.5F, -6.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[177].setRotationPoint(6.3F, 1F, -6.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[178].setRotationPoint(7.7F, 1F, -6.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F); // Box 6
		bodyModel[179].setRotationPoint(6F, 1F, -5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F); // Box 6
		bodyModel[180].setRotationPoint(-8.5F, 1F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[181].setRotationPoint(9.8F, 2F, -2.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[182].setRotationPoint(13.8F, 1F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, 0F, -1.9F, -0.5F, 0F, 1.1F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.5F, -0.5F, -0.8F, -1.9F, -0.5F, -0.8F, 1.1F, 0F, -0.3F, -0.3F); // Box 6
		bodyModel[183].setRotationPoint(8.5F, 2.5F, -6.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 6
		bodyModel[184].setRotationPoint(13.8F, 2F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0.6F, 0.6F, -0.6F, -3.4F, 0.6F, -0.6F, -3.4F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, -3.4F, -0.6F, -3.4F, -3.4F, -0.6F, -3.4F, -3.4F, -0.2F, 0.6F, -3.4F, -0.2F); // Box 6
		bodyModel[185].setRotationPoint(13.8F, 2.1F, -8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[186].setRotationPoint(7.2F, 1F, -2.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 6
		bodyModel[187].setRotationPoint(10F, 2.5F, -3.2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 6
		bodyModel[188].setRotationPoint(16F, 1F, -3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[189].setRotationPoint(-8.5F, 2.5F, 5.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0.2F, -0.6F, -0.5F, 0.2F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[190].setRotationPoint(-8.2F, 1F, 4.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0.2F, -0.6F, -0.5F, 0.2F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[191].setRotationPoint(-6.8F, 1F, 4.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[192].setRotationPoint(-14.8F, 1F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 1.1F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1.9F, -0.5F, -0.8F, 1.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, -0.5F, -0.8F, -1.9F); // Box 6
		bodyModel[193].setRotationPoint(-14.5F, 2.5F, 5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F); // Box 6
		bodyModel[194].setRotationPoint(-14.8F, 2F, 5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0.6F, 0.6F, -0.2F, -3.4F, 0.6F, -0.2F, -3.4F, 0.6F, -0.6F, 0.6F, 0.6F, -0.6F, 0.6F, -3.4F, -0.2F, -3.4F, -3.4F, -0.2F, -3.4F, -3.4F, -0.6F, 0.6F, -3.4F, -0.6F); // Box 6
		bodyModel[195].setRotationPoint(-14.8F, 2.1F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[196].setRotationPoint(-12.2F, 2F, 1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[197].setRotationPoint(-14.8F, 1F, 1.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 6
		bodyModel[198].setRotationPoint(-16.5F, 2.5F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 6
		bodyModel[199].setRotationPoint(-17F, 1F, 2.2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[200].setRotationPoint(3F, 2F, 4.6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 6
		bodyModel[201].setRotationPoint(4.8F, 1F, 4.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[202].setRotationPoint(-12F, 2F, -5.4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 6
		bodyModel[203].setRotationPoint(-11.4F, 1F, -5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 70, 2, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 6
		bodyModel[204].setRotationPoint(-35F, -1F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 70, 4, 16, 0F,0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 6
		bodyModel[205].setRotationPoint(-35F, -4F, -8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 70, 5, 18, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 6
		bodyModel[206].setRotationPoint(-35F, -9F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 70, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		bodyModel[207].setRotationPoint(-35F, -19F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 70, 4, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F); // Box 6
		bodyModel[208].setRotationPoint(-35F, -17F, -8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 70, 5, 18, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F); // Box 6
		bodyModel[209].setRotationPoint(-35F, -13.5F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0.6F, -1.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.6F, -1.6F, 0F, -1.2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.2F, -5F); // Box 6
		bodyModel[210].setRotationPoint(-36F, -1F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0.5F, -1.2F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, -1.2F, 0F, -1.6F, -3.6F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1.6F, -3.6F); // Box 6
		bodyModel[211].setRotationPoint(-36F, -4F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, -0.5F, -2.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -2.2F); // Box 6
		bodyModel[212].setRotationPoint(-36F, -9F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -1.2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.2F, -5F, 0F, 0.6F, -1.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.6F, -1.6F); // Box 6
		bodyModel[213].setRotationPoint(-36F, -19F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, -0.6F, -3.6F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.6F, -3.6F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, -1.2F); // Box 6
		bodyModel[214].setRotationPoint(-36F, -17F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, -2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, -1.2F); // Box 6
		bodyModel[215].setRotationPoint(-36F, -13.5F, -9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0.5F, 0F, 0.6F, -1.6F, 0F, 0.6F, -1.6F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -1.2F, -5F, 0F, -1.2F, -5F, 0F, 0F, -3F); // Box 6
		bodyModel[216].setRotationPoint(35F, -1F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0.5F, 0.8F, 0F, 0.5F, -1.2F, 0F, 0.5F, -1.2F, 0F, 0.5F, 0.8F, 0F, -1F, -1.5F, 0F, -1.6F, -3.6F, 0F, -1.6F, -3.6F, 0F, -1F, -1.5F); // Box 6
		bodyModel[217].setRotationPoint(35F, -4F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -2.2F, 0F, -0.5F, -2.2F, 0F, -0.5F, -0.2F); // Box 6
		bodyModel[218].setRotationPoint(35F, -9F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -3F, 0F, -1.2F, -5F, 0F, -1.2F, -5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0.6F, -1.6F, 0F, 0.6F, -1.6F, 0F, 0F, 0.5F); // Box 6
		bodyModel[219].setRotationPoint(35F, -19F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, -1.5F, 0F, -0.6F, -3.6F, 0F, -0.6F, -3.6F, 0F, 0F, -1.5F, 0F, -0.5F, 0.8F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F); // Box 6
		bodyModel[220].setRotationPoint(35F, -17F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, -0.2F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F); // Box 6
		bodyModel[221].setRotationPoint(35F, -13.5F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 6
		bodyModel[222].setRotationPoint(-35F, -20F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.49F, -0.3F, -2F, -0.49F, -0.3F, -2F, -0.49F, -0.3F, 0F, -0.49F, -0.3F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[223].setRotationPoint(-2.5F, -20F, -3F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.49F, -0.3F, -1.5F, -0.49F, -0.3F, -1.5F, -0.49F, -0.3F, 0F, -0.49F, -0.3F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[224].setRotationPoint(-21.5F, -20F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.49F, -0.3F, -1.5F, -0.49F, -0.3F, -1.5F, -0.49F, -0.3F, 0F, -0.49F, -0.3F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[225].setRotationPoint(15.5F, -20F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F); // Box 6
		bodyModel[226].setRotationPoint(-37F, -18F, -2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F); // Box 6
		bodyModel[227].setRotationPoint(36F, -18F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0.2F, -9F, 0F, -1F, -9F, 0F, -1F, -9F, -0.5F, 0.2F, -9F, -0.5F); // Box 6
		bodyModel[228].setRotationPoint(-37F, -17F, 2.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, -9F, 0F, -0.8F, -9F, 0F, -0.8F, -9F, -0.5F, 0F, -9F, -0.5F); // Box 6
		bodyModel[229].setRotationPoint(-37F, -8F, 2.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0.2F, 0F, 0F); // Box 6
		bodyModel[230].setRotationPoint(-37F, -17F, 1.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, 0.2F, 0F, -0.8F); // Box 6
		bodyModel[231].setRotationPoint(-37F, -17F, 4F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.2F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[232].setRotationPoint(-37F, -8F, 1.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 6
		bodyModel[233].setRotationPoint(-37F, -8F, 4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, -0.5F, 0.2F, -9F, -0.5F, 0.2F, -9F, 0F, -1F, -9F, 0F); // Box 6
		bodyModel[234].setRotationPoint(36F, -17F, -4.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,-1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.8F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, 0F, -0.8F, -9F, 0F); // Box 6
		bodyModel[235].setRotationPoint(36F, -8F, -4.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.8F, -1F, 0F, -0.8F); // Box 6
		bodyModel[236].setRotationPoint(36F, -17F, -2.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[237].setRotationPoint(36F, -17F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.8F, -1F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 6
		bodyModel[238].setRotationPoint(36F, -8F, -2.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 6
		bodyModel[239].setRotationPoint(36F, -8F, -5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 6
		bodyModel[240].setRotationPoint(-37.4F, -19.5F, -1.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 6
		bodyModel[241].setRotationPoint(-37.4F, -19.5F, 1.3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -1.2F, 0F, 0F, -1.2F, 0.03F, -0.8F, -0.2F, -0.83F, -0.8F, -0.2F, -0.83F, -0.8F, -1.2F, 0.03F, -0.8F, -1.2F); // Box 6
		bodyModel[242].setRotationPoint(-37.1F, -19.5F, -1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 6
		bodyModel[243].setRotationPoint(36.4F, -19.5F, 0.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 6
		bodyModel[244].setRotationPoint(36.4F, -19.5F, -2.3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.8F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.83F, -0.8F, -1.2F, 0.03F, -0.8F, -1.2F, 0.03F, -0.8F, -0.2F, -0.83F, -0.8F, -0.2F); // Box 6
		bodyModel[245].setRotationPoint(36.1F, -19.5F, -2.5F);
	}
}