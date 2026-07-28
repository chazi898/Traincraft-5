//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.05.2022 - 21:09:58
// Last changed on: 07.05.2022 - 21:09:58

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelLMS_10Ton_Tender extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLMS_10Ton_Tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[218];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 172, 25, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 310, 91, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 95
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 95
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 95
		bodyModel[15] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 95
		bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 95
		bodyModel[27] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 18
		bodyModel[32] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 18
		bodyModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 33
		bodyModel[35] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 33
		bodyModel[36] = new ModelRendererTurbo(this, 487, 9, textureX, textureY); // Box 33
		bodyModel[37] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 33
		bodyModel[38] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 7
		bodyModel[40] = new ModelRendererTurbo(this, 209, 118, textureX, textureY); // Box 7
		bodyModel[41] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 38
		bodyModel[42] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 33
		bodyModel[45] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 33
		bodyModel[46] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 33
		bodyModel[47] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 18
		bodyModel[48] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 48
		bodyModel[50] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 48
		bodyModel[51] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 48
		bodyModel[52] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 48
		bodyModel[53] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 48
		bodyModel[54] = new ModelRendererTurbo(this, 401, 18, textureX, textureY); // Box 7
		bodyModel[55] = new ModelRendererTurbo(this, 402, 12, textureX, textureY); // Box 7
		bodyModel[56] = new ModelRendererTurbo(this, 422, 17, textureX, textureY); // Box 7
		bodyModel[57] = new ModelRendererTurbo(this, 431, 17, textureX, textureY); // Box 7
		bodyModel[58] = new ModelRendererTurbo(this, 376, 95, textureX, textureY); // Box 7
		bodyModel[59] = new ModelRendererTurbo(this, 376, 106, textureX, textureY); // Box 7
		bodyModel[60] = new ModelRendererTurbo(this, 152, 160, textureX, textureY); // Box 38
		bodyModel[61] = new ModelRendererTurbo(this, 194, 115, textureX, textureY); // Box 38
		bodyModel[62] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 33
		bodyModel[63] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 33
		bodyModel[64] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 33
		bodyModel[65] = new ModelRendererTurbo(this, 487, 17, textureX, textureY); // Box 33
		bodyModel[66] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 33
		bodyModel[67] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 33
		bodyModel[68] = new ModelRendererTurbo(this, 345, 29, textureX, textureY); // Box 33
		bodyModel[69] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 33
		bodyModel[70] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 72
		bodyModel[74] = new ModelRendererTurbo(this, 347, 33, textureX, textureY); // Box 72
		bodyModel[75] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 72
		bodyModel[76] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 72
		bodyModel[77] = new ModelRendererTurbo(this, 347, 42, textureX, textureY); // Box 72
		bodyModel[78] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 72
		bodyModel[79] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 72
		bodyModel[80] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 72
		bodyModel[81] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 85
		bodyModel[82] = new ModelRendererTurbo(this, 189, 81, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 87
		bodyModel[89] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 87
		bodyModel[90] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 87
		bodyModel[91] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 87
		bodyModel[92] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 7
		bodyModel[93] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 7
		bodyModel[94] = new ModelRendererTurbo(this, 45, 111, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 114
		bodyModel[96] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 114
		bodyModel[99] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 114
		bodyModel[110] = new ModelRendererTurbo(this, 176, 107, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 176, 119, textureX, textureY); // Box 38
		bodyModel[112] = new ModelRendererTurbo(this, 194, 142, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 176, 139, textureX, textureY); // Box 38
		bodyModel[114] = new ModelRendererTurbo(this, 159, 139, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 38
		bodyModel[116] = new ModelRendererTurbo(this, 158, 152, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 224, 154, textureX, textureY); // Box 38
		bodyModel[118] = new ModelRendererTurbo(this, 218, 161, textureX, textureY); // Box 38
		bodyModel[119] = new ModelRendererTurbo(this, 217, 160, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 45, 120, textureX, textureY); // Box 111
		bodyModel[121] = new ModelRendererTurbo(this, 59, 111, textureX, textureY); // Box 111
		bodyModel[122] = new ModelRendererTurbo(this, 45, 136, textureX, textureY); // Box 111
		bodyModel[123] = new ModelRendererTurbo(this, 34, 136, textureX, textureY); // Box 111
		bodyModel[124] = new ModelRendererTurbo(this, 59, 136, textureX, textureY); // Box 111
		bodyModel[125] = new ModelRendererTurbo(this, 45, 149, textureX, textureY); // Box 111
		bodyModel[126] = new ModelRendererTurbo(this, 34, 149, textureX, textureY); // Box 111
		bodyModel[127] = new ModelRendererTurbo(this, 59, 149, textureX, textureY); // Box 111
		bodyModel[128] = new ModelRendererTurbo(this, 45, 164, textureX, textureY); // Box 111
		bodyModel[129] = new ModelRendererTurbo(this, 34, 164, textureX, textureY); // Box 111
		bodyModel[130] = new ModelRendererTurbo(this, 59, 164, textureX, textureY); // Box 111
		bodyModel[131] = new ModelRendererTurbo(this, 45, 175, textureX, textureY); // Box 111
		bodyModel[132] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 111
		bodyModel[133] = new ModelRendererTurbo(this, 59, 175, textureX, textureY); // Box 111
		bodyModel[134] = new ModelRendererTurbo(this, 45, 185, textureX, textureY); // Box 111
		bodyModel[135] = new ModelRendererTurbo(this, 24, 185, textureX, textureY); // Box 111
		bodyModel[136] = new ModelRendererTurbo(this, 59, 185, textureX, textureY); // Box 111
		bodyModel[137] = new ModelRendererTurbo(this, 105, 162, textureX, textureY); // Box 89
		bodyModel[138] = new ModelRendererTurbo(this, 113, 162, textureX, textureY); // Box 89
		bodyModel[139] = new ModelRendererTurbo(this, 121, 162, textureX, textureY); // Box 89
		bodyModel[140] = new ModelRendererTurbo(this, 145, 162, textureX, textureY); // Box 89
		bodyModel[141] = new ModelRendererTurbo(this, 136, 162, textureX, textureY); // Box 89
		bodyModel[142] = new ModelRendererTurbo(this, 95, 162, textureX, textureY); // Box 89
		bodyModel[143] = new ModelRendererTurbo(this, 201, 196, textureX, textureY); // Box 114
		bodyModel[144] = new ModelRendererTurbo(this, 369, 196, textureX, textureY); // Box 114
		bodyModel[145] = new ModelRendererTurbo(this, 385, 196, textureX, textureY); // Box 114
		bodyModel[146] = new ModelRendererTurbo(this, 113, 141, textureX, textureY); // Box 114
		bodyModel[147] = new ModelRendererTurbo(this, 409, 141, textureX, textureY); // Box 114
		bodyModel[148] = new ModelRendererTurbo(this, 433, 141, textureX, textureY); // Box 114
		bodyModel[149] = new ModelRendererTurbo(this, 441, 141, textureX, textureY); // Box 114
		bodyModel[150] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 114
		bodyModel[151] = new ModelRendererTurbo(this, 473, 141, textureX, textureY); // Box 114
		bodyModel[152] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 114
		bodyModel[153] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 114
		bodyModel[154] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 114
		bodyModel[155] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 114
		bodyModel[156] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 114
		bodyModel[157] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 114
		bodyModel[158] = new ModelRendererTurbo(this, 161, 120, textureX, textureY); // Box 89
		bodyModel[159] = new ModelRendererTurbo(this, 425, 116, textureX, textureY); // Box 89
		bodyModel[160] = new ModelRendererTurbo(this, 425, 216, textureX, textureY); // Box 89
		bodyModel[161] = new ModelRendererTurbo(this, 505, 216, textureX, textureY); // Box 89
		bodyModel[162] = new ModelRendererTurbo(this, 153, 216, textureX, textureY); // Box 89
		bodyModel[163] = new ModelRendererTurbo(this, 425, 216, textureX, textureY); // Box 89
		bodyModel[164] = new ModelRendererTurbo(this, 505, 216, textureX, textureY); // Box 89
		bodyModel[165] = new ModelRendererTurbo(this, 409, 216, textureX, textureY); // Box 89
		bodyModel[166] = new ModelRendererTurbo(this, 432, 85, textureX, textureY); // Box 72
		bodyModel[167] = new ModelRendererTurbo(this, 356, 96, textureX, textureY); // Box 7
		bodyModel[168] = new ModelRendererTurbo(this, 356, 104, textureX, textureY); // Box 7
		bodyModel[169] = new ModelRendererTurbo(this, 356, 112, textureX, textureY); // Box 7
		bodyModel[170] = new ModelRendererTurbo(this, 356, 120, textureX, textureY); // Box 7
		bodyModel[171] = new ModelRendererTurbo(this, 434, 118, textureX, textureY); // Box 33
		bodyModel[172] = new ModelRendererTurbo(this, 434, 125, textureX, textureY); // Box 33
		bodyModel[173] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 33
		bodyModel[174] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 33
		bodyModel[175] = new ModelRendererTurbo(this, 209, 130, textureX, textureY); // Box 7
		bodyModel[176] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 7
		bodyModel[177] = new ModelRendererTurbo(this, 256, 130, textureX, textureY); // Box 7
		bodyModel[178] = new ModelRendererTurbo(this, 256, 142, textureX, textureY); // Box 7
		bodyModel[179] = new ModelRendererTurbo(this, 239, 155, textureX, textureY); // Box 7
		bodyModel[180] = new ModelRendererTurbo(this, 252, 155, textureX, textureY); // Box 7
		bodyModel[181] = new ModelRendererTurbo(this, 265, 155, textureX, textureY); // Box 7
		bodyModel[182] = new ModelRendererTurbo(this, 278, 155, textureX, textureY); // Box 7
		bodyModel[183] = new ModelRendererTurbo(this, 75, 96, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 100, 98, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 122, 96, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 75, 106, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 97, 106, textureX, textureY); // Box 38
		bodyModel[188] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 72
		bodyModel[189] = new ModelRendererTurbo(this, 405, 146, textureX, textureY); // Box 72
		bodyModel[190] = new ModelRendererTurbo(this, 444, 154, textureX, textureY); // Box 72
		bodyModel[191] = new ModelRendererTurbo(this, 436, 154, textureX, textureY); // Box 72
		bodyModel[192] = new ModelRendererTurbo(this, 428, 154, textureX, textureY); // Box 72
		bodyModel[193] = new ModelRendererTurbo(this, 420, 154, textureX, textureY); // Box 72
		bodyModel[194] = new ModelRendererTurbo(this, 412, 154, textureX, textureY); // Box 72
		bodyModel[195] = new ModelRendererTurbo(this, 412, 146, textureX, textureY); // Box 72
		bodyModel[196] = new ModelRendererTurbo(this, 419, 146, textureX, textureY); // Box 72
		bodyModel[197] = new ModelRendererTurbo(this, 447, 146, textureX, textureY); // Box 72
		bodyModel[198] = new ModelRendererTurbo(this, 433, 146, textureX, textureY); // Box 72
		bodyModel[199] = new ModelRendererTurbo(this, 461, 146, textureX, textureY); // Box 72
		bodyModel[200] = new ModelRendererTurbo(this, 440, 146, textureX, textureY); // Box 72
		bodyModel[201] = new ModelRendererTurbo(this, 426, 146, textureX, textureY); // Box 72
		bodyModel[202] = new ModelRendererTurbo(this, 454, 146, textureX, textureY); // Box 72
		bodyModel[203] = new ModelRendererTurbo(this, 452, 154, textureX, textureY); // Box 72
		bodyModel[204] = new ModelRendererTurbo(this, 479, 129, textureX, textureY); // Box 9
		bodyModel[205] = new ModelRendererTurbo(this, 496, 129, textureX, textureY); // Box 9
		bodyModel[206] = new ModelRendererTurbo(this, 466, 152, textureX, textureY); // Box 9
		bodyModel[207] = new ModelRendererTurbo(this, 472, 152, textureX, textureY); // Box 9
		bodyModel[208] = new ModelRendererTurbo(this, 70, 116, textureX, textureY); // Box 7
		bodyModel[209] = new ModelRendererTurbo(this, 70, 126, textureX, textureY); // Box 7
		bodyModel[210] = new ModelRendererTurbo(this, 269, 169, textureX, textureY); // Box 144
		bodyModel[211] = new ModelRendererTurbo(this, 269, 178, textureX, textureY); // Box 144
		bodyModel[212] = new ModelRendererTurbo(this, 215, 188, textureX, textureY); // Box 33
		bodyModel[213] = new ModelRendererTurbo(this, 215, 196, textureX, textureY); // Box 33
		bodyModel[214] = new ModelRendererTurbo(this, 457, 159, textureX, textureY); // Box 2
		bodyModel[215] = new ModelRendererTurbo(this, 471, 159, textureX, textureY); // Box 2
		bodyModel[216] = new ModelRendererTurbo(this, 485, 159, textureX, textureY); // Box 2
		bodyModel[217] = new ModelRendererTurbo(this, 499, 159, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-17F, 0F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-17F, 0F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-3F, 0F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-3F, 0F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[4].setRotationPoint(11F, 0F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 17, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 0
		bodyModel[5].setRotationPoint(11F, 0F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 44, 1, 22, 0F,-0.5F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F); // Box 6
		bodyModel[6].setRotationPoint(-22F, -1.5F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 84, 26, 1, 0F,0F, 0F, -0.5F, -42.2F, 0F, -0.5F, -42.2F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -0.5F, -42.2F, -14F, -0.5F, -42.2F, -14F, 0F, 0F, -14F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-20F, -13.5F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 84, 26, 1, 0F,0F, 0F, 0F, -42.2F, 0F, 0F, -42.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -14F, 0F, -42.2F, -14F, 0F, -42.2F, -14F, -0.5F, 0F, -14F, -0.5F); // Box 7
		bodyModel[8].setRotationPoint(-20F, -13.5F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 26, 40, 0F,-0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -20F, -0.3F, 0F, -20F, -0.3F, -14F, 0F, -0.2F, -14F, 0F, -0.2F, -14F, -20F, -0.3F, -14F, -20F); // Box 9
		bodyModel[9].setRotationPoint(21F, -13.5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 0.8F, -0.8F, -0.2F, 0.8F, -0.8F, -0.2F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, -0.5F, -0.8F, -0.7F, -0.5F, -0.8F, -0.7F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 34
		bodyModel[10].setRotationPoint(-21F, -0.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, -0.8F, 0.5F, 0.8F, -0.8F, 0.5F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F); // Box 34
		bodyModel[11].setRotationPoint(-21F, -0.5F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 95
		bodyModel[12].setRotationPoint(-21F, 5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 95
		bodyModel[13].setRotationPoint(-21F, 1.3F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[14].setRotationPoint(-21F, 5F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, -0.5F, 0.5F, -0.7F, -0.5F, 0.5F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F); // Box 95
		bodyModel[15].setRotationPoint(-21F, 1.3F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 1F, -0.8F, -0.7F, 1F, -0.8F, -0.7F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-21F, 3F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 1F, 0F, -0.7F, 1F, 0F, -0.7F, 1F, -0.8F, 0.5F, 1F, -0.8F, 0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F); // Box 34
		bodyModel[17].setRotationPoint(-21F, 3F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,-0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-22F, -1F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 19
		bodyModel[19].setRotationPoint(-14F, 3F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 19
		bodyModel[20].setRotationPoint(0F, 3F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 19
		bodyModel[21].setRotationPoint(14F, 3F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-22F, -4.5F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 0.8F, -0.8F, -0.2F, 0.8F, -0.8F, -0.2F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[23].setRotationPoint(19F, -0.5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.5F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, -0.8F, 0.5F, 0.8F, -0.8F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 34
		bodyModel[24].setRotationPoint(19F, -0.5F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 95
		bodyModel[25].setRotationPoint(19F, 5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 95
		bodyModel[26].setRotationPoint(19F, 1.3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.5F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 95
		bodyModel[27].setRotationPoint(19F, 5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 95
		bodyModel[28].setRotationPoint(19F, 1.3F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, -0.8F, -0.2F, 1F, -0.8F, -0.2F, 1F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 34
		bodyModel[29].setRotationPoint(19F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, -0.8F, 0F, 1F, -0.8F, 0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F); // Box 34
		bodyModel[30].setRotationPoint(19F, 3F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 18
		bodyModel[31].setRotationPoint(19F, -1F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,-0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F); // Box 18
		bodyModel[32].setRotationPoint(21F, -1.5F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 38, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 33
		bodyModel[33].setRotationPoint(-19F, -1F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[34].setRotationPoint(-19F, 2F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -0.5F, -3F, -1F, -0.5F); // Box 33
		bodyModel[35].setRotationPoint(-5F, 2F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, 0F, 1.7F, 0.5F, 0F, 1.7F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, -3F, -1F, -0.5F); // Box 33
		bodyModel[36].setRotationPoint(9F, 2F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 33
		bodyModel[37].setRotationPoint(-19F, 4F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 14, 20, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-15F, -18.5F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 66, 9, 1, 0F,-0.5F, 0F, -0.5F, -33F, 0F, -0.5F, -33F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -0.5F, -33F, -4.5F, -0.5F, -33F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 7
		bodyModel[39].setRotationPoint(-18F, -18F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 66, 9, 1, 0F,-0.5F, 0F, 0F, -33F, 0F, 0F, -33F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -4.5F, 0F, -33F, -4.5F, 0F, -33F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F); // Box 7
		bodyModel[40].setRotationPoint(-18F, -18F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 20, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[41].setRotationPoint(13F, -18.5F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 8, 20, 0F,-20F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -17.5F, 0F, 0F, -17.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[42].setRotationPoint(-7F, -9.5F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,-3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(10F, -12.5F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 33
		bodyModel[44].setRotationPoint(-3F, 3F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[45].setRotationPoint(-12F, 3F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 33
		bodyModel[46].setRotationPoint(11F, 3F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.7F, 0F, -1.5F); // Box 18
		bodyModel[47].setRotationPoint(21F, 0.5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 48
		bodyModel[48].setRotationPoint(22F, 0F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 48
		bodyModel[49].setRotationPoint(25F, -1.5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.7F, 0F, 0.2F, 0.7F); // Box 48
		bodyModel[50].setRotationPoint(22F, -0.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 48
		bodyModel[51].setRotationPoint(22F, -0.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 48
		bodyModel[52].setRotationPoint(25F, -1.5F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.7F, 0F, 0.2F, 0.7F); // Box 48
		bodyModel[53].setRotationPoint(22F, -0.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -2.5F, -1.5F, -0.5F, -2.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 7
		bodyModel[54].setRotationPoint(15F, -18F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 7
		bodyModel[55].setRotationPoint(15F, -18F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[56].setRotationPoint(-19F, -18F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 7
		bodyModel[57].setRotationPoint(-19F, -18F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 66, 8, 1, 0F,-2F, 0.1F, -3.1F, -34.5F, 0.1F, -3.1F, -34.5F, 0.1F, 2.6F, -2F, 0.1F, 2.6F, -0.5F, -5F, -0.5F, -33F, -5F, -0.5F, -33F, -5F, 0F, -0.5F, -5F, 0F); // Box 7
		bodyModel[58].setRotationPoint(-18F, -21F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 66, 8, 1, 0F,-2F, 0.1F, 2.6F, -34.5F, 0.1F, 2.6F, -34.5F, 0.1F, -3.1F, -2F, 0.1F, -3.1F, -0.5F, -5F, 0F, -33F, -5F, 0F, -33F, -5F, -0.5F, -0.5F, -5F, -0.5F); // Box 7
		bodyModel[59].setRotationPoint(-18F, -21F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[60].setRotationPoint(13F, -21F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[61].setRotationPoint(13F, -23F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 38, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[62].setRotationPoint(-19F, -1F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -3F, -1F, -0.5F, -3F, -1F, 0F, 0F, -1F, 0F); // Box 33
		bodyModel[63].setRotationPoint(-19F, 2F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, -1F, -0.5F, -3F, -1F, -0.5F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 33
		bodyModel[64].setRotationPoint(-5F, 2F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0.5F, -0.5F, 1.7F, 0.5F, -0.5F, 1.7F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -3F, -1F, 0F); // Box 33
		bodyModel[65].setRotationPoint(9F, 2F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 33
		bodyModel[66].setRotationPoint(-19F, 4F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 33
		bodyModel[67].setRotationPoint(-3F, 3F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[68].setRotationPoint(-12F, 3F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 33
		bodyModel[69].setRotationPoint(11F, 3F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.2F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.2F, 0F, 0F); // Box 72
		bodyModel[70].setRotationPoint(14F, -15.5F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.7F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F); // Box 72
		bodyModel[71].setRotationPoint(13F, -15.5F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.2F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, -0.2F, 0F, -1F, -0.2F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.2F, -0.5F, 0F); // Box 72
		bodyModel[72].setRotationPoint(14F, -16.5F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.7F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.7F, 0F, -1F, 0.7F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.7F, -0.5F, 0F); // Box 72
		bodyModel[73].setRotationPoint(13F, -16.5F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[74].setRotationPoint(15F, -18.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F); // Box 72
		bodyModel[75].setRotationPoint(15F, -19.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[76].setRotationPoint(15F, -18.5F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F); // Box 72
		bodyModel[77].setRotationPoint(15F, -19.5F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.4F, -1.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 72
		bodyModel[78].setRotationPoint(17F, -14.5F, -2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[79].setRotationPoint(19F, -14.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[80].setRotationPoint(18F, -14.5F, -2F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 85
		bodyModel[81].setRotationPoint(-24F, -1.5F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 28, 1, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 86
		bodyModel[82].setRotationPoint(-15F, -17F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(-18F, -12.5F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[84].setRotationPoint(-18F, -18F, -6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[85].setRotationPoint(-18F, -12.5F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(-18F, -7.5F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 87
		bodyModel[87].setRotationPoint(-18F, -10F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 87
		bodyModel[88].setRotationPoint(-18F, -10F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 87
		bodyModel[89].setRotationPoint(-20F, -7F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, -3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 87
		bodyModel[90].setRotationPoint(-20F, -10F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, -3F, -0.8F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F); // Box 87
		bodyModel[91].setRotationPoint(-20F, -10F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -3F, -1F, -0.5F, -3F, -1F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[92].setRotationPoint(15F, -14.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 7
		bodyModel[93].setRotationPoint(15F, -14.5F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 111
		bodyModel[94].setRotationPoint(-17F, 0F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[95].setRotationPoint(-1F, 2F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[96].setRotationPoint(-15F, 2F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[97].setRotationPoint(13F, 2F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 114
		bodyModel[98].setRotationPoint(-17F, -0.2F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F); // Box 114
		bodyModel[99].setRotationPoint(-11F, -0.2F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F); // Box 114
		bodyModel[100].setRotationPoint(-11F, 2.8F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F); // Box 114
		bodyModel[101].setRotationPoint(-17F, 2.8F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 114
		bodyModel[102].setRotationPoint(-3F, -0.2F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F); // Box 114
		bodyModel[103].setRotationPoint(3F, -0.2F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F); // Box 114
		bodyModel[104].setRotationPoint(3F, 2.8F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F); // Box 114
		bodyModel[105].setRotationPoint(-3F, 2.8F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 114
		bodyModel[106].setRotationPoint(11F, -0.2F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F); // Box 114
		bodyModel[107].setRotationPoint(17F, -0.2F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F); // Box 114
		bodyModel[108].setRotationPoint(17F, 2.8F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F); // Box 114
		bodyModel[109].setRotationPoint(11F, 2.8F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 38
		bodyModel[110].setRotationPoint(13F, -23F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[111].setRotationPoint(13F, -23F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[112].setRotationPoint(-15F, -23F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 38
		bodyModel[113].setRotationPoint(-15F, -23F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[114].setRotationPoint(-15F, -23F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[115].setRotationPoint(13F, -21F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[116].setRotationPoint(13F, -21F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[117].setRotationPoint(-15F, -21F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[118].setRotationPoint(-15F, -21F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[119].setRotationPoint(-15F, -21F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[120].setRotationPoint(-14F, 0F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[121].setRotationPoint(-13F, 0F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 111
		bodyModel[122].setRotationPoint(-3F, 0F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[123].setRotationPoint(0F, 0F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[124].setRotationPoint(1F, 0F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 111
		bodyModel[125].setRotationPoint(11F, 0F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[126].setRotationPoint(14F, 0F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[127].setRotationPoint(15F, 0F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 111
		bodyModel[128].setRotationPoint(-17F, 0F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[129].setRotationPoint(-14F, 0F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[130].setRotationPoint(-13F, 0F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 111
		bodyModel[131].setRotationPoint(-3F, 0F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[132].setRotationPoint(0F, 0F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[133].setRotationPoint(1F, 0F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 111
		bodyModel[134].setRotationPoint(11F, 0F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[135].setRotationPoint(14F, 0F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[136].setRotationPoint(15F, 0F, 8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, 0.3F, -0.7F, 0.1F, 0.7F, -0.7F, 0.1F, 0.7F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0F, -0.8F, 0F, 0F); // Box 89
		bodyModel[137].setRotationPoint(21F, -6.5F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, -0.7F, 0.8F, 0F, -0.7F, 0.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.7F, 0.8F, 0F, -0.7F, 0.8F, 0F, 0F, -1.5F, 0F, 0F); // Box 89
		bodyModel[138].setRotationPoint(22F, -4.3F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.6F, -0.5F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, 0F, -0.6F, -0.5F, 0F, -1.5F, 0F, -0.7F, 0.8F, 0F, -0.7F, 0.8F, 0F, 0F, -1.5F, 0F, 0F); // Box 89
		bodyModel[139].setRotationPoint(22F, -7.3F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, -0.7F, 0.8F, 0F, -0.7F, 0.8F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.5F, -0.1F, 0F); // Box 89
		bodyModel[140].setRotationPoint(22F, -3.3F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.1F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.5F, 0.1F, 0F, 0F, -0.8F, -0.7F, -0.9F, -0.5F, -0.7F, -0.9F, -0.5F, 0F, 0F, -0.8F, 0F); // Box 89
		bodyModel[141].setRotationPoint(22F, -2.3F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.1F, -0.1F, -0.7F, 0.7F, -0.1F, -0.7F, 0.7F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.55F, -0.7F, 0.6F, -0.55F, -0.7F, 0.6F, -0.55F, 0F, -1.1F, -0.55F, 0F); // Box 89
		bodyModel[142].setRotationPoint(21F, -7.3F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 114
		bodyModel[143].setRotationPoint(-1F, 2F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 114
		bodyModel[144].setRotationPoint(-15F, 2F, 8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 114
		bodyModel[145].setRotationPoint(13F, 2F, 8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 114
		bodyModel[146].setRotationPoint(-10.6F, 2.8F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F); // Box 114
		bodyModel[147].setRotationPoint(-17.4F, 2.8F, 8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 114
		bodyModel[148].setRotationPoint(3.4F, 2.8F, 8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F); // Box 114
		bodyModel[149].setRotationPoint(-3.4F, 2.8F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 114
		bodyModel[150].setRotationPoint(17.4F, 2.8F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F); // Box 114
		bodyModel[151].setRotationPoint(10.6F, 2.8F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F); // Box 114
		bodyModel[152].setRotationPoint(-17.4F, -0.2F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F); // Box 114
		bodyModel[153].setRotationPoint(-10.6F, -0.2F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F); // Box 114
		bodyModel[154].setRotationPoint(-3.4F, -0.2F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F); // Box 114
		bodyModel[155].setRotationPoint(3.4F, -0.2F, 8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F); // Box 114
		bodyModel[156].setRotationPoint(10.6F, -0.2F, 8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F); // Box 114
		bodyModel[157].setRotationPoint(17.4F, -0.2F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		bodyModel[158].setRotationPoint(22F, -0.5F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0.3F, -0.5F, -1F, 0.3F, -0.5F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F); // Box 89
		bodyModel[159].setRotationPoint(23F, -1.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[160].setRotationPoint(22F, -4F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[161].setRotationPoint(22F, -7F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[162].setRotationPoint(22F, -10F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[163].setRotationPoint(22F, -4F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[164].setRotationPoint(22F, -7F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F); // Box 89
		bodyModel[165].setRotationPoint(22F, -10F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 72
		bodyModel[166].setRotationPoint(13.2F, -20.5F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, -2.5F, -2.5F, -0.5F, -2.5F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 7
		bodyModel[167].setRotationPoint(-20F, -16F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 7
		bodyModel[168].setRotationPoint(-19.5F, -18F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 7
		bodyModel[169].setRotationPoint(-20F, -16F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 7
		bodyModel[170].setRotationPoint(-19.5F, -18F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[171].setRotationPoint(-10.5F, 2F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 33
		bodyModel[172].setRotationPoint(-10.5F, 2F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 33
		bodyModel[173].setRotationPoint(19F, -1F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[174].setRotationPoint(19F, -1F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, -0.5F, -10.5F, 0F, -0.5F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, -10.5F, -4.5F, -0.5F, -10.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 7
		bodyModel[175].setRotationPoint(15F, -18F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -10.5F, -4.5F, 0F, -10.5F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 7
		bodyModel[176].setRotationPoint(15F, -18F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,1.5F, 0.1F, -3.1F, -10.5F, 0.1F, -3.1F, -10.5F, 0.1F, 2.6F, 1.5F, 0.1F, 2.6F, 0F, -5F, -0.5F, -10.5F, -5F, -0.5F, -10.5F, -5F, 0F, 0F, -5F, 0F); // Box 7
		bodyModel[177].setRotationPoint(15F, -21F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,1.5F, 0.1F, 2.6F, -10.5F, 0.1F, 2.6F, -10.5F, 0.1F, -3.1F, 1.5F, 0.1F, -3.1F, 0F, -5F, 0F, -10.5F, -5F, 0F, -10.5F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 7
		bodyModel[178].setRotationPoint(15F, -21F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0.2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -8.6F, -0.5F, -1.5F, -8.6F, -0.5F, -1.5F, -8.6F, 0F, 0.2F, -8.6F, 0F); // Box 7
		bodyModel[179].setRotationPoint(22F, -13.5F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -8.6F, 0F, -1.5F, -8.6F, 0F, -1.5F, -8.6F, -0.5F, 0.2F, -8.6F, -0.5F); // Box 7
		bodyModel[180].setRotationPoint(22F, -13.5F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0.2F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, -3.5F, -0.5F, -4.2F, -3.5F, -0.5F, -4.2F, -3.5F, 0F, 0.2F, -3.5F, 0F); // Box 7
		bodyModel[181].setRotationPoint(22F, -6F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0.2F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, -3.5F, 0F, -4.2F, -3.5F, 0F, -4.2F, -3.5F, -0.5F, 0.2F, -3.5F, -0.5F); // Box 7
		bodyModel[182].setRotationPoint(22F, -6F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1.9F, -0.1F, 0F, -1.9F, -0.1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, -0.6F, 0F, 0.9F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[183].setRotationPoint(-15F, -23F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[184].setRotationPoint(-15F, -24F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1.9F, -0.1F, 0F, -1.9F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.9F, -0.6F, 0F, 0.9F, -0.6F); // Box 38
		bodyModel[185].setRotationPoint(-15F, -23F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1.9F, -0.1F, 0F, -1.9F, -0.1F, -3F, -0.44F, -2F, 0F, -0.44F, -2F, 0F, 0.9F, -0.6F, -0.2F, 0.9F, -0.6F, -3F, -0.3F, -2F, 0F, -0.3F, -2F); // Box 38
		bodyModel[186].setRotationPoint(-10F, -23F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.44F, -2F, -3F, -0.44F, -2F, 0F, -1.9F, -0.1F, 0F, -1.9F, -0.1F, 0F, -0.3F, -2F, -3F, -0.3F, -2F, -0.2F, 0.9F, -0.6F, 0F, 0.9F, -0.6F); // Box 38
		bodyModel[187].setRotationPoint(-10F, -23F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F); // Box 72
		bodyModel[188].setRotationPoint(22.2F, -15F, -6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -0.8F, -0.7F, 0.2F, -0.8F, -0.7F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 72
		bodyModel[189].setRotationPoint(22.2F, -15F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[190].setRotationPoint(22.2F, -1F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[191].setRotationPoint(22.2F, -4F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[192].setRotationPoint(22.2F, -7F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[193].setRotationPoint(22.2F, -10F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[194].setRotationPoint(22.2F, -13F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.7F, 0F, -0.8F); // Box 72
		bodyModel[195].setRotationPoint(20.2F, -15F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.7F, 0F, 0F); // Box 72
		bodyModel[196].setRotationPoint(20.2F, -15F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, -1F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.8F, 0F, -0.8F, -0.7F, -0.85F, -0.8F, -0.7F, -0.85F, 0F, -0.8F, 0F, 0F); // Box 72
		bodyModel[197].setRotationPoint(20.2F, -16F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, -0.8F, -0.7F, -1F, -0.8F, -0.7F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, -0.85F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, -0.7F, -0.85F, 0F); // Box 72
		bodyModel[198].setRotationPoint(21.2F, -16F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.85F, -0.8F, -0.3F, -0.85F, -0.8F, -0.3F, -0.85F, 0F, -1.3F, -0.85F, 0F); // Box 72
		bodyModel[199].setRotationPoint(20.2F, -16F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -0.7F, -1F, -0.8F, -0.8F, 0F, 0F, -0.7F, -0.85F, 0F, -0.7F, -0.85F, -0.8F, -0.8F, 0F, -0.8F); // Box 72
		bodyModel[200].setRotationPoint(20.2F, -16F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.85F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.7F, -0.85F, -0.8F); // Box 72
		bodyModel[201].setRotationPoint(21.2F, -16F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -1.3F, 0F, -0.8F, -1.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, -0.8F, -1.3F, -0.85F, -0.8F); // Box 72
		bodyModel[202].setRotationPoint(20.2F, -16F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 72
		bodyModel[203].setRotationPoint(22.2F, 2F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F,-0.3F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 0.1F, -3.4F, -0.3F, 0.1F, -3.4F, -0.3F, -13.5F, 0F, -0.2F, -13.5F, 0F, -0.2F, -13.5F, -3.4F, -0.3F, -13.5F, -3.4F); // Box 9
		bodyModel[204].setRotationPoint(21F, -21F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 21, 6, 0F,-0.3F, 0.1F, -3.4F, -0.2F, 0.1F, -3.4F, -0.2F, -3F, 0F, -0.3F, -3F, 0F, -0.3F, -13.5F, -3.4F, -0.2F, -13.5F, -3.4F, -0.2F, -13.5F, 0F, -0.3F, -13.5F, 0F); // Box 9
		bodyModel[205].setRotationPoint(21F, -21F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F); // Box 9
		bodyModel[206].setRotationPoint(21F, -14F, -7.4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 9
		bodyModel[207].setRotationPoint(21F, -14F, 6.4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 39, 7, 1, 0F,-0.1F, -0.2F, -0.5F, -21.2F, -0.2F, -0.5F, -21.2F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -4.4F, -0.5F, -21.2F, -4.4F, -0.5F, -21.2F, -4.4F, -0.3F, -0.1F, -4.4F, -0.3F); // Box 7
		bodyModel[208].setRotationPoint(-9F, -12.6F, -11.05F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 39, 7, 1, 0F,-0.1F, -0.2F, -0.3F, -21.2F, -0.2F, -0.3F, -21.2F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -4.4F, -0.3F, -21.2F, -4.4F, -0.3F, -21.2F, -4.4F, -0.5F, -0.1F, -4.4F, -0.5F); // Box 7
		bodyModel[209].setRotationPoint(-9F, -12.6F, 10.05F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 88, 5, 1, 0F,0F, -0.8F, 0F, -43.5F, -0.8F, 0F, -43.5F, -0.8F, -0.95F, 0F, -0.8F, -0.95F, 0F, -2.8F, 0F, -43.5F, -2.8F, 0F, -43.5F, -2.8F, -0.95F, 0F, -2.8F, -0.95F); // Box 144
		bodyModel[210].setRotationPoint(-20F, -12.7F, -10.55F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 88, 5, 1, 0F,0F, -0.8F, -0.95F, -43.5F, -0.8F, -0.95F, -43.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.8F, -0.95F, -43.5F, -2.8F, -0.95F, -43.5F, -2.8F, 0F, 0F, -2.8F, 0F); // Box 144
		bodyModel[211].setRotationPoint(-20F, -12.8F, 9.55F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 44, 2, 3, 0F,0F, 0.3F, -0.3F, -0.55F, 0.3F, -0.3F, -0.55F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.5F, -0.3F, -0.55F, -0.5F, -0.3F, -0.55F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 33
		bodyModel[212].setRotationPoint(-21.5F, -1F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 44, 2, 3, 0F,0F, 0.3F, -0.2F, -0.55F, 0.3F, -0.2F, -0.55F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.5F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 33
		bodyModel[213].setRotationPoint(-21.5F, -1F, 8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 2
		bodyModel[214].setRotationPoint(5.5F, 3F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[215].setRotationPoint(7.5F, 3F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.5F, -2F, 0F); // Box 2
		bodyModel[216].setRotationPoint(9.5F, 1F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 9, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[217].setRotationPoint(9.5F, -8F, -2F);
	}
}