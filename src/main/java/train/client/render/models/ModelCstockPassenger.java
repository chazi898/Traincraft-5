//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.10.2022 - 16:33:02
// Last changed on: 29.10.2022 - 16:33:02

package train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelCstockPassenger extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelCstockPassenger() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[182];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 26
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 35
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 37
		bodyModel[10] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 40
		bodyModel[11] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 44
		bodyModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 45
		bodyModel[14] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 46
		bodyModel[15] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 47
		bodyModel[16] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 54
		bodyModel[21] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 62
		bodyModel[27] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 63
		bodyModel[28] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 64
		bodyModel[29] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 66
		bodyModel[30] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 67
		bodyModel[31] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 68
		bodyModel[32] = new ModelRendererTurbo(this, 267, 97, textureX, textureY); // Box 75
		bodyModel[33] = new ModelRendererTurbo(this, 279, 97, textureX, textureY); // Box 78
		bodyModel[34] = new ModelRendererTurbo(this, 429, 90, textureX, textureY); // Box 82
		bodyModel[35] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 1
		bodyModel[37] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 3
		bodyModel[39] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 5
		bodyModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 84
		bodyModel[45] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 92
		bodyModel[53] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 93
		bodyModel[54] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 94
		bodyModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 95
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 96
		bodyModel[57] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 97
		bodyModel[58] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 98
		bodyModel[59] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 99
		bodyModel[60] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 101
		bodyModel[62] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 104
		bodyModel[65] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 105
		bodyModel[66] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 107
		bodyModel[68] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 109
		bodyModel[70] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 111
		bodyModel[72] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 112
		bodyModel[73] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 113
		bodyModel[74] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 114
		bodyModel[75] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 115
		bodyModel[76] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 116
		bodyModel[77] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 117
		bodyModel[78] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 121
		bodyModel[79] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 122
		bodyModel[80] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 134
		bodyModel[81] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 133
		bodyModel[82] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 134
		bodyModel[83] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 137
		bodyModel[84] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 138
		bodyModel[85] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 141
		bodyModel[86] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 142
		bodyModel[87] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 143
		bodyModel[88] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 144
		bodyModel[89] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 145
		bodyModel[90] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 40
		bodyModel[91] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 41
		bodyModel[92] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 153
		bodyModel[93] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 155
		bodyModel[95] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 156
		bodyModel[96] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 157
		bodyModel[97] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 158
		bodyModel[98] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 160
		bodyModel[99] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 161
		bodyModel[100] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 162
		bodyModel[101] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 164
		bodyModel[103] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 169
		bodyModel[104] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 170
		bodyModel[105] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 171
		bodyModel[106] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 172
		bodyModel[107] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 175
		bodyModel[108] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 176
		bodyModel[109] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 177
		bodyModel[110] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 178
		bodyModel[111] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 179
		bodyModel[112] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 180
		bodyModel[113] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 181
		bodyModel[114] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 182
		bodyModel[115] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 183
		bodyModel[116] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 184
		bodyModel[117] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 185
		bodyModel[118] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 186
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 195
		bodyModel[120] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 196
		bodyModel[121] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 197
		bodyModel[122] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 198
		bodyModel[123] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 199
		bodyModel[124] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 200
		bodyModel[125] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 201
		bodyModel[126] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 202
		bodyModel[127] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 203
		bodyModel[128] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 204
		bodyModel[129] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 205
		bodyModel[130] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 206
		bodyModel[131] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 207
		bodyModel[132] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 208
		bodyModel[133] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 209
		bodyModel[134] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 210
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 211
		bodyModel[136] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 212
		bodyModel[137] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 213
		bodyModel[138] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 214
		bodyModel[139] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 215
		bodyModel[140] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 216
		bodyModel[141] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 217
		bodyModel[142] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 218
		bodyModel[143] = new ModelRendererTurbo(this, 441, 90, textureX, textureY); // Box 183
		bodyModel[144] = new ModelRendererTurbo(this, 441, 90, textureX, textureY); // Box 184
		bodyModel[145] = new ModelRendererTurbo(this, 429, 90, textureX, textureY); // Box 185
		bodyModel[146] = new ModelRendererTurbo(this, 441, 90, textureX, textureY); // Box 186
		bodyModel[147] = new ModelRendererTurbo(this, 429, 90, textureX, textureY); // Box 187
		bodyModel[148] = new ModelRendererTurbo(this, 441, 90, textureX, textureY); // Box 188
		bodyModel[149] = new ModelRendererTurbo(this, 429, 90, textureX, textureY); // Box 189
		bodyModel[150] = new ModelRendererTurbo(this, 267, 97, textureX, textureY); // Box 190
		bodyModel[151] = new ModelRendererTurbo(this, 279, 97, textureX, textureY); // Box 191
		bodyModel[152] = new ModelRendererTurbo(this, 279, 97, textureX, textureY); // Box 192
		bodyModel[153] = new ModelRendererTurbo(this, 267, 97, textureX, textureY); // Box 193
		bodyModel[154] = new ModelRendererTurbo(this, 279, 97, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 197
		bodyModel[156] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 198
		bodyModel[157] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 199
		bodyModel[158] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 200
		bodyModel[159] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 201
		bodyModel[160] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 202
		bodyModel[161] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 117
		bodyModel[162] = new ModelRendererTurbo(this, 209, 93, textureX, textureY); // Box 138
		bodyModel[163] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 186
		bodyModel[164] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 185
		bodyModel[165] = new ModelRendererTurbo(this, 177, 93, textureX, textureY); // Box 137
		bodyModel[166] = new ModelRendererTurbo(this, 305, 85, textureX, textureY); // Box 143
		bodyModel[167] = new ModelRendererTurbo(this, 321, 87, textureX, textureY); // Box 144
		bodyModel[168] = new ModelRendererTurbo(this, 73, 86, textureX, textureY); // Box 141
		bodyModel[169] = new ModelRendererTurbo(this, 241, 92, textureX, textureY); // Box 142
		bodyModel[170] = new ModelRendererTurbo(this, 401, 77, textureX, textureY); // Box 145
		bodyModel[171] = new ModelRendererTurbo(this, 274, 95, textureX, textureY); // Box 32
		bodyModel[172] = new ModelRendererTurbo(this, 33, 86, textureX, textureY); // Box 24
		bodyModel[173] = new ModelRendererTurbo(this, 42, 86, textureX, textureY); // Box 28
		bodyModel[174] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 54
		bodyModel[175] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 57
		bodyModel[176] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 58
		bodyModel[177] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 63
		bodyModel[178] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 66
		bodyModel[179] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 67
		bodyModel[180] = new ModelRendererTurbo(this, 267, 97, textureX, textureY); // Box 193
		bodyModel[181] = new ModelRendererTurbo(this, 279, 97, textureX, textureY); // Box 194

		bodyModel[0].addShapeBox(0F, 0F, 0F, 57, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28F, 3.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(-15F, -14.5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, 0F, -0.35F, 5F, 0F, -0.35F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 5F, 0F, -0.2F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[2].setRotationPoint(-27F, -15.5F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 27
		bodyModel[3].setRotationPoint(-27F, -15.5F, 9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.35F, 0F, -2F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[4].setRotationPoint(28F, -17.5F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[5].setRotationPoint(28F, -17.5F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.35F, 0F, -2F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 33
		bodyModel[6].setRotationPoint(28F, -17.5F, 8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 57, 4, 17, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 35
		bodyModel[7].setRotationPoint(-28F, -18.5F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.1F, 0F, -1F, -0.1F); // Box 36
		bodyModel[8].setRotationPoint(-27F, -17.5F, 9.25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -1F, -0.2F, 0F, -1F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 37
		bodyModel[9].setRotationPoint(-27F, -17.5F, -10.25F);

		bodyModel[10].addBox(0F, 0F, 0F, 56, 1, 1, 0F); // Box 40
		bodyModel[10].setRotationPoint(-27F, 4.5F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 56, 1, 1, 0F); // Box 41
		bodyModel[11].setRotationPoint(-27F, 4.5F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 44
		bodyModel[12].setRotationPoint(6F, -2.5F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 45
		bodyModel[13].setRotationPoint(6F, -2.5F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 46
		bodyModel[14].setRotationPoint(-6F, -2.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[15].setRotationPoint(-6F, 0.5F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[16].setRotationPoint(-6F, 0.5F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 49
		bodyModel[17].setRotationPoint(-6F, -2.5F, 5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 50
		bodyModel[18].setRotationPoint(-16F, -2.5F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 53
		bodyModel[19].setRotationPoint(-16F, -2.5F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 54
		bodyModel[20].setRotationPoint(16F, 0.5F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 55
		bodyModel[21].setRotationPoint(16F, -2.5F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 56
		bodyModel[22].setRotationPoint(16F, -2.5F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[23].setRotationPoint(16F, 0.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[24].setRotationPoint(17F, -0.5F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[25].setRotationPoint(-5F, -0.5F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[26].setRotationPoint(-5F, -0.5F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[27].setRotationPoint(17F, -0.5F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[28].setRotationPoint(-5F, -4.5F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		bodyModel[29].setRotationPoint(17F, -4.5F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[30].setRotationPoint(17F, -4.5F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[31].setRotationPoint(-5F, -4.5F, 9F);

		bodyModel[32].addBox(0F, 0F, -4F, 0, 3, 4, 0F); // Box 75
		bodyModel[32].setRotationPoint(-1.5F, -3.5F, -5F);
		bodyModel[32].rotateAngleX = 0.10471976F;

		bodyModel[33].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 78
		bodyModel[33].setRotationPoint(-1.5F, -3.5F, 5F);
		bodyModel[33].rotateAngleX = -0.08726646F;

		bodyModel[34].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[34].setRotationPoint(-5.5F, -11.5F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[35].setRotationPoint(-14.75F, 5F, 5F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[36].setRotationPoint(-25.25F, 5F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
		bodyModel[37].setRotationPoint(-14.75F, 5F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
		bodyModel[38].setRotationPoint(-25.25F, 5F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[39].setRotationPoint(-12.75F, 7F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		bodyModel[40].setRotationPoint(-23.25F, 7F, -6F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 81
		bodyModel[41].setRotationPoint(-14F, 6F, 6F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 82
		bodyModel[42].setRotationPoint(-23F, 6F, 6F);

		bodyModel[43].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 83
		bodyModel[43].setRotationPoint(-22F, 6F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 84
		bodyModel[44].setRotationPoint(-24.25F, 6F, 2F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 85
		bodyModel[45].setRotationPoint(-13.75F, 6F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[46].setRotationPoint(-21.25F, 6F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 87
		bodyModel[47].setRotationPoint(-22F, 6F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 88
		bodyModel[48].setRotationPoint(-23F, 6F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 89
		bodyModel[49].setRotationPoint(-14F, 6F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 90
		bodyModel[50].setRotationPoint(-19F, 4.5F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 91
		bodyModel[51].setRotationPoint(-16F, 4.5F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[52].setRotationPoint(-7F, 4.5F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 93
		bodyModel[53].setRotationPoint(15F, 6F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 94
		bodyModel[54].setRotationPoint(14F, 6F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		bodyModel[55].setRotationPoint(13.75F, 7F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 96
		bodyModel[56].setRotationPoint(11.75F, 5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[57].setRotationPoint(15.75F, 6F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 98
		bodyModel[58].setRotationPoint(12.75F, 6F, 2F);

		bodyModel[59].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 99
		bodyModel[59].setRotationPoint(11.75F, 5F, 5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 100
		bodyModel[60].setRotationPoint(14F, 6F, 6F);

		bodyModel[61].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 101
		bodyModel[61].setRotationPoint(15F, 6F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 102
		bodyModel[62].setRotationPoint(23F, 6F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 103
		bodyModel[63].setRotationPoint(24.25F, 7F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 104
		bodyModel[64].setRotationPoint(22.25F, 5F, 5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
		bodyModel[65].setRotationPoint(21F, 4.5F, 6F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 106
		bodyModel[66].setRotationPoint(23.25F, 6F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 107
		bodyModel[67].setRotationPoint(23F, 6F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 108
		bodyModel[68].setRotationPoint(18F, 4.5F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 109
		bodyModel[69].setRotationPoint(22.25F, 5F, -5F);

		bodyModel[70].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 110
		bodyModel[70].setRotationPoint(-2.5F, 4.5F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 111
		bodyModel[71].setRotationPoint(-30F, 5.5F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[72].setRotationPoint(23F, 5.5F, -1F);

		bodyModel[73].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 113
		bodyModel[73].setRotationPoint(-7.5F, 4.5F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[74].setRotationPoint(4F, 4.5F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[75].setRotationPoint(27.5F, 3.7F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[76].setRotationPoint(27.5F, 3.7F, 5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 117
		bodyModel[77].setRotationPoint(28.5F, 3.5F, -3.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 121
		bodyModel[78].setRotationPoint(-17.5F, 4.5F, 0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 122
		bodyModel[79].setRotationPoint(19.5F, 4.5F, 0.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[80].setRotationPoint(-15F, -4.5F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[81].setRotationPoint(-6F, -4.5F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[82].setRotationPoint(-6F, -14.5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[83].setRotationPoint(16F, -14.5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[84].setRotationPoint(16F, -4.5F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 141
		bodyModel[85].setRotationPoint(28F, -4.5F, 3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[86].setRotationPoint(28F, -14.5F, 3F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 18, 6, 0F); // Box 143
		bodyModel[87].setRotationPoint(28F, -14.5F, -3F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 144
		bodyModel[88].setRotationPoint(28F, -4.5F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[89].setRotationPoint(28F, -14.5F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 40
		bodyModel[90].setRotationPoint(-28F, 3.5F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 41
		bodyModel[91].setRotationPoint(-28F, 3.5F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[92].setRotationPoint(-10.5F, -4.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[93].setRotationPoint(-10.5F, -14.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[94].setRotationPoint(11.5F, -14.5F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[95].setRotationPoint(11.5F, -4.5F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[96].setRotationPoint(7F, -4.5F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[97].setRotationPoint(7F, -14.5F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 160
		bodyModel[98].setRotationPoint(-6F, -6.5F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 161
		bodyModel[99].setRotationPoint(-6F, -14.5F, -9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 162
		bodyModel[100].setRotationPoint(-6F, -16.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 49, 2, 5, 0F,0F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
		bodyModel[101].setRotationPoint(-27F, -17F, -2.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 164
		bodyModel[102].setRotationPoint(-6F, -17.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 169
		bodyModel[103].setRotationPoint(-6F, -14.5F, 8.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 170
		bodyModel[104].setRotationPoint(-6F, -6.5F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 171
		bodyModel[105].setRotationPoint(-6F, -16.5F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 172
		bodyModel[106].setRotationPoint(-6F, -17.5F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[107].setRotationPoint(-15F, -4.5F, 9.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176
		bodyModel[108].setRotationPoint(-15F, -14.5F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 177
		bodyModel[109].setRotationPoint(-10.5F, -14.5F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[110].setRotationPoint(-10.5F, -4.5F, 9.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[111].setRotationPoint(-6F, -4.5F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[112].setRotationPoint(-6F, -14.5F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 181
		bodyModel[113].setRotationPoint(7F, -14.5F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[114].setRotationPoint(7F, -4.5F, 9.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[115].setRotationPoint(11.5F, -4.5F, 9.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[116].setRotationPoint(11.5F, -14.5F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[117].setRotationPoint(16F, -14.5F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[118].setRotationPoint(16F, -4.5F, 10F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 195
		bodyModel[119].setRotationPoint(-16F, -6.5F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 196
		bodyModel[120].setRotationPoint(-16F, -14.5F, 8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 197
		bodyModel[121].setRotationPoint(-16F, -16.5F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 198
		bodyModel[122].setRotationPoint(-16F, -17.5F, 3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 199
		bodyModel[123].setRotationPoint(-16F, -17.5F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 200
		bodyModel[124].setRotationPoint(-16F, -16.5F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 201
		bodyModel[125].setRotationPoint(-16F, -14.5F, -9.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 202
		bodyModel[126].setRotationPoint(-16F, -6.5F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 203
		bodyModel[127].setRotationPoint(6F, -6.5F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 204
		bodyModel[128].setRotationPoint(6F, -14.5F, 8.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 205
		bodyModel[129].setRotationPoint(6F, -16.5F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 206
		bodyModel[130].setRotationPoint(6F, -17.5F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 207
		bodyModel[131].setRotationPoint(6F, -17.5F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 208
		bodyModel[132].setRotationPoint(6F, -16.5F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[133].setRotationPoint(6F, -14.5F, -9.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 210
		bodyModel[134].setRotationPoint(6F, -6.5F, -10F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 211
		bodyModel[135].setRotationPoint(16F, -6.5F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 212
		bodyModel[136].setRotationPoint(16F, -14.5F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 213
		bodyModel[137].setRotationPoint(16F, -16.5F, 8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 214
		bodyModel[138].setRotationPoint(16F, -17.5F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 215
		bodyModel[139].setRotationPoint(16F, -17.5F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 216
		bodyModel[140].setRotationPoint(16F, -16.5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bodyModel[141].setRotationPoint(16F, -14.5F, -9.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 218
		bodyModel[142].setRotationPoint(16F, -6.5F, -10F);

		bodyModel[143].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[143].setRotationPoint(-5.5F, -11.5F, 5F);

		bodyModel[144].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		bodyModel[144].setRotationPoint(-15.5F, -11.5F, 5F);

		bodyModel[145].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[145].setRotationPoint(-15.5F, -11.5F, -10F);

		bodyModel[146].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		bodyModel[146].setRotationPoint(6.5F, -11.5F, 5F);

		bodyModel[147].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[147].setRotationPoint(6.5F, -11.5F, -10F);

		bodyModel[148].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 188
		bodyModel[148].setRotationPoint(16.5F, -11.5F, 5F);

		bodyModel[149].addShapeBox(0F, -4F, 0F, 0, 14, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[149].setRotationPoint(16.5F, -11.5F, -10F);

		bodyModel[150].addBox(0F, 0F, -4F, 0, 3, 4, 0F); // Box 190
		bodyModel[150].setRotationPoint(2.5F, -3.5F, -5F);
		bodyModel[150].rotateAngleX = 0.10471976F;

		bodyModel[151].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 191
		bodyModel[151].setRotationPoint(2.5F, -3.5F, 5F);
		bodyModel[151].rotateAngleX = -0.08726646F;

		bodyModel[152].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 192
		bodyModel[152].setRotationPoint(2.5F, -3.5F, 5F);
		bodyModel[152].rotateAngleX = -0.08726646F;

		bodyModel[153].addBox(0F, 0F, -4F, 0, 3, 4, 0F); // Box 193
		bodyModel[153].setRotationPoint(22.5F, -3.5F, -5F);
		bodyModel[153].rotateAngleX = 0.10471976F;

		bodyModel[154].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 194
		bodyModel[154].setRotationPoint(22.5F, -3.5F, 5F);
		bodyModel[154].rotateAngleX = -0.08726646F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 197
		bodyModel[155].setRotationPoint(-18.5F, 9F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 198
		bodyModel[156].setRotationPoint(-18.5F, 9F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 199
		bodyModel[157].setRotationPoint(-18.5F, 9F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 200
		bodyModel[158].setRotationPoint(18.5F, 9F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 201
		bodyModel[159].setRotationPoint(18.5F, 9F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 202
		bodyModel[160].setRotationPoint(18.5F, 9F, -8F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 117
		bodyModel[161].setRotationPoint(-28.5F, 3.5F, -3.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[162].setRotationPoint(-28F, -4.5F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[163].setRotationPoint(-28F, -4.5F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[164].setRotationPoint(-28F, -14.5F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[165].setRotationPoint(-28F, -14.5F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 18, 6, 0F); // Box 143
		bodyModel[166].setRotationPoint(-28F, -14.5F, -3F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 144
		bodyModel[167].setRotationPoint(-28F, -4.5F, -10F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 141
		bodyModel[168].setRotationPoint(-28F, -4.5F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[169].setRotationPoint(-28F, -14.5F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[170].setRotationPoint(-28F, -14.5F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[171].setRotationPoint(-28F, -17.5F, -8.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.35F, 0F, -2F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[172].setRotationPoint(-28F, -17.5F, -10.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.35F, 0F, -2F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 28
		bodyModel[173].setRotationPoint(-28F, -17.5F, 8.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 54
		bodyModel[174].setRotationPoint(-27F, 0.5F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[175].setRotationPoint(-27F, 0.5F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[176].setRotationPoint(-27F, -0.5F, 5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[177].setRotationPoint(-27F, -0.5F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		bodyModel[178].setRotationPoint(-27F, -4.5F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[179].setRotationPoint(-27F, -4.5F, 9F);

		bodyModel[180].addBox(0F, 0F, -4F, 0, 3, 4, 0F); // Box 193
		bodyModel[180].setRotationPoint(-21.5F, -3.5F, -5F);
		bodyModel[180].rotateAngleX = 0.10471976F;

		bodyModel[181].addBox(0F, 0F, 0F, 0, 3, 4, 0F); // Box 194
		bodyModel[181].setRotationPoint(-21.5F, -3.5F, 5F);
		bodyModel[181].rotateAngleX = -0.08726646F;
	}
}