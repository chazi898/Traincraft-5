//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.03.2024 - 23:13:23
// Last changed on: 10.03.2024 - 23:13:23

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Model4WheeledCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model4WheeledCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[203];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 211
		bodyModel[10] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 208
		bodyModel[11] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 212
		bodyModel[12] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 213
		bodyModel[13] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 17
		bodyModel[28] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 17
		bodyModel[29] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 17
		bodyModel[31] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 17
		bodyModel[33] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 17
		bodyModel[35] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 17
		bodyModel[37] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 17
		bodyModel[38] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 17
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 17
		bodyModel[41] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 17
		bodyModel[42] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 17
		bodyModel[43] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 17
		bodyModel[46] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 17
		bodyModel[49] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 17
		bodyModel[50] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 17
		bodyModel[51] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 17
		bodyModel[52] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 17
		bodyModel[53] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 17
		bodyModel[54] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 17
		bodyModel[55] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 17
		bodyModel[56] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 17
		bodyModel[57] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 17
		bodyModel[58] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 17
		bodyModel[59] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 17
		bodyModel[61] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 17
		bodyModel[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		bodyModel[63] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 17
		bodyModel[64] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 30
		bodyModel[65] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 35
		bodyModel[66] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 36
		bodyModel[67] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 77
		bodyModel[68] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 30
		bodyModel[89] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 35
		bodyModel[90] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 36
		bodyModel[91] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 77
		bodyModel[92] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 79
		bodyModel[93] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 80
		bodyModel[94] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 81
		bodyModel[95] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 82
		bodyModel[96] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 84
		bodyModel[97] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 85
		bodyModel[98] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 86
		bodyModel[99] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 87
		bodyModel[100] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 88
		bodyModel[101] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 89
		bodyModel[102] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 90
		bodyModel[103] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 91
		bodyModel[104] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 89
		bodyModel[113] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 89
		bodyModel[114] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 89
		bodyModel[115] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 89
		bodyModel[116] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 126
		bodyModel[127] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 127
		bodyModel[128] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 129
		bodyModel[130] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 130
		bodyModel[131] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 131
		bodyModel[132] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 132
		bodyModel[133] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 133
		bodyModel[134] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 148
		bodyModel[149] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 149
		bodyModel[150] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 150
		bodyModel[151] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 151
		bodyModel[152] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 152
		bodyModel[153] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 153
		bodyModel[154] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 155
		bodyModel[156] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 157
		bodyModel[158] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 160
		bodyModel[161] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 161
		bodyModel[162] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 162
		bodyModel[163] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 163
		bodyModel[164] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 164
		bodyModel[165] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 165
		bodyModel[166] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 166
		bodyModel[167] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 167
		bodyModel[168] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 168
		bodyModel[169] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 169
		bodyModel[170] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 170
		bodyModel[171] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 171
		bodyModel[172] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 172
		bodyModel[173] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 176
		bodyModel[174] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 178
		bodyModel[175] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 179
		bodyModel[176] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 180
		bodyModel[177] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 181
		bodyModel[178] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 182
		bodyModel[179] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 183
		bodyModel[180] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 184
		bodyModel[181] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 185
		bodyModel[182] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 186
		bodyModel[183] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 187
		bodyModel[184] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 188
		bodyModel[185] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 189
		bodyModel[186] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 190
		bodyModel[187] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 187
		bodyModel[188] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 188
		bodyModel[189] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 189
		bodyModel[190] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 190
		bodyModel[191] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 191
		bodyModel[192] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 192
		bodyModel[193] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 193
		bodyModel[194] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 194
		bodyModel[195] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 195
		bodyModel[196] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 196
		bodyModel[197] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 197
		bodyModel[198] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 198
		bodyModel[199] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 197
		bodyModel[200] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 199
		bodyModel[201] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 197
		bodyModel[202] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 198

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 2, 20, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[0].setRotationPoint(-29.5F, 0F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-29.5F, -6F, 9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-29.5F, -6F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 60, 3, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-29.5F, -21F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 60, 3, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-29.5F, -21F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29.5F, -21F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 6
		bodyModel[6].setRotationPoint(29.5F, -21F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		bodyModel[7].setRotationPoint(29.5F, -6F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[8].setRotationPoint(-29.5F, -6F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 60, 2, 18, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[9].setRotationPoint(-29.5F, -25F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[10].setRotationPoint(-29.5F, -23F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 58, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[11].setRotationPoint(-28.5F, -23F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 58, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[12].setRotationPoint(-28.5F, -23F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(29.5F, -23F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 17
		bodyModel[14].setRotationPoint(-20.5F, 4.5F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 18
		bodyModel[15].setRotationPoint(-23F, 2F, 6F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 19
		bodyModel[16].setRotationPoint(-23F, 2F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 20
		bodyModel[17].setRotationPoint(18F, 2F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 21
		bodyModel[18].setRotationPoint(18F, 2F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 23
		bodyModel[19].setRotationPoint(20.5F, 4.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 24
		bodyModel[20].setRotationPoint(-29.5F, 2F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 25
		bodyModel[21].setRotationPoint(29.5F, 2F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-29.5F, 5F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[23].setRotationPoint(-29.5F, 5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-20.5F, 2.5F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.9F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.9F, 0F); // Box 17
		bodyModel[25].setRotationPoint(-24F, 2.6F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[26].setRotationPoint(-20F, 2.6F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 17
		bodyModel[27].setRotationPoint(-16.5F, 2F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 17
		bodyModel[28].setRotationPoint(-24.5F, 2F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 17
		bodyModel[29].setRotationPoint(-9F, 2F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, 0F, -0.8F, -0.4F, 0F); // Box 17
		bodyModel[30].setRotationPoint(-11F, 2F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 17
		bodyModel[31].setRotationPoint(11F, 2F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, 0F, -0.8F, -0.4F, 0F); // Box 17
		bodyModel[32].setRotationPoint(9F, 2F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 17
		bodyModel[33].setRotationPoint(-0.5F, 2F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.2F, -2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 1.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, 1.6F, -0.5F); // Box 17
		bodyModel[34].setRotationPoint(-9.5F, 4F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-0.2F, 1.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, -0.5F, -0.2F, 1.6F, -0.5F, -0.2F, -2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, -2F, -0.5F); // Box 17
		bodyModel[35].setRotationPoint(-9.5F, 5F, 7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 17
		bodyModel[36].setRotationPoint(-28F, 2F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[37].setRotationPoint(20.5F, 2.5F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.9F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.9F, 0F); // Box 17
		bodyModel[38].setRotationPoint(17F, 2.6F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[39].setRotationPoint(21F, 2.6F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 17
		bodyModel[40].setRotationPoint(24.5F, 2F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 17
		bodyModel[41].setRotationPoint(16.5F, 2F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 17
		bodyModel[42].setRotationPoint(28F, 2F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[43].setRotationPoint(-20.5F, 2.5F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, -0.9F, -0.1F); // Box 17
		bodyModel[44].setRotationPoint(-24F, 2.6F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.1F, -0.5F, 0F, -0.1F); // Box 17
		bodyModel[45].setRotationPoint(-20F, 2.6F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F); // Box 17
		bodyModel[46].setRotationPoint(-16.5F, 2F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F); // Box 17
		bodyModel[47].setRotationPoint(-24.5F, 2F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.5F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F); // Box 17
		bodyModel[48].setRotationPoint(-9F, 2F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F); // Box 17
		bodyModel[49].setRotationPoint(-11F, 2F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.5F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F); // Box 17
		bodyModel[50].setRotationPoint(11F, 2F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F); // Box 17
		bodyModel[51].setRotationPoint(9F, 2F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F); // Box 17
		bodyModel[52].setRotationPoint(-0.5F, 2F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 17
		bodyModel[53].setRotationPoint(-28F, 2F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[54].setRotationPoint(20.5F, 2.5F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, -0.9F, -0.1F); // Box 17
		bodyModel[55].setRotationPoint(17F, 2.6F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.1F, -0.5F, 0F, -0.1F); // Box 17
		bodyModel[56].setRotationPoint(21F, 2.6F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F); // Box 17
		bodyModel[57].setRotationPoint(24.5F, 2F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F); // Box 17
		bodyModel[58].setRotationPoint(16.5F, 2F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 17
		bodyModel[59].setRotationPoint(28F, 2F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F); // Box 17
		bodyModel[60].setRotationPoint(-22.5F, 2F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F); // Box 17
		bodyModel[61].setRotationPoint(18.5F, 2F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F); // Box 17
		bodyModel[62].setRotationPoint(-22.5F, 2F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F); // Box 17
		bodyModel[63].setRotationPoint(18.5F, 2F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		bodyModel[64].setRotationPoint(-32F, 0.5F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[65].setRotationPoint(-32F, 0.5F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F); // Box 36
		bodyModel[66].setRotationPoint(-32F, -0.5F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F); // Box 77
		bodyModel[67].setRotationPoint(-32F, -0.5F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F); // Box 79
		bodyModel[68].setRotationPoint(-32F, 0.5F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 80
		bodyModel[69].setRotationPoint(-32F, 0.5F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Box 81
		bodyModel[70].setRotationPoint(-32F, -0.5F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F); // Box 82
		bodyModel[71].setRotationPoint(-32F, 0.5F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 84
		bodyModel[72].setRotationPoint(-32F, 0.5F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F); // Box 85
		bodyModel[73].setRotationPoint(-32F, -0.5F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F); // Box 86
		bodyModel[74].setRotationPoint(-32F, 0.5F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F); // Box 87
		bodyModel[75].setRotationPoint(-32F, -0.5F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F); // Box 88
		bodyModel[76].setRotationPoint(-32F, 0.5F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 89
		bodyModel[77].setRotationPoint(-32F, 0.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 90
		bodyModel[78].setRotationPoint(-32F, 0.5F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Box 91
		bodyModel[79].setRotationPoint(-32F, -0.5F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[80].setRotationPoint(-31.5F, 0F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 105
		bodyModel[81].setRotationPoint(-31.5F, 1F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 106
		bodyModel[82].setRotationPoint(-31.5F, 1F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 107
		bodyModel[83].setRotationPoint(-31.5F, 0F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[84].setRotationPoint(-31.5F, 0F, 6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 109
		bodyModel[85].setRotationPoint(-31.5F, 1F, 6.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 110
		bodyModel[86].setRotationPoint(-31.5F, 1F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 111
		bodyModel[87].setRotationPoint(-31.5F, 0F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		bodyModel[88].setRotationPoint(30F, 0.5F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[89].setRotationPoint(30F, 0.5F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F); // Box 36
		bodyModel[90].setRotationPoint(32F, -0.5F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F); // Box 77
		bodyModel[91].setRotationPoint(32F, -0.5F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F); // Box 79
		bodyModel[92].setRotationPoint(32F, 0.5F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 80
		bodyModel[93].setRotationPoint(32F, 0.5F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 81
		bodyModel[94].setRotationPoint(32F, -0.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F); // Box 82
		bodyModel[95].setRotationPoint(32F, 0.5F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 84
		bodyModel[96].setRotationPoint(32F, 0.5F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F); // Box 85
		bodyModel[97].setRotationPoint(32F, -0.5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F); // Box 86
		bodyModel[98].setRotationPoint(32F, 0.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F); // Box 87
		bodyModel[99].setRotationPoint(32F, -0.5F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F); // Box 88
		bodyModel[100].setRotationPoint(32F, 0.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 89
		bodyModel[101].setRotationPoint(32F, 0.5F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 90
		bodyModel[102].setRotationPoint(32F, 0.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 91
		bodyModel[103].setRotationPoint(32F, -0.5F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[104].setRotationPoint(30F, 0F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 105
		bodyModel[105].setRotationPoint(30F, 1F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 106
		bodyModel[106].setRotationPoint(30F, 1F, -7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 107
		bodyModel[107].setRotationPoint(30F, 0F, -7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[108].setRotationPoint(30F, 0F, 6.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 109
		bodyModel[109].setRotationPoint(30F, 1F, 6.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 110
		bodyModel[110].setRotationPoint(30F, 1F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 111
		bodyModel[111].setRotationPoint(30F, 0F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.7F, -0.05F, -0.4F, -0.7F, -0.05F, -0.4F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0.2F, -0.7F, -0.05F, -0.1F, -0.7F, -0.05F, -0.1F, 0.3F, -0.3F, 0.2F, 0.3F); // Box 89
		bodyModel[112].setRotationPoint(-31.4F, 0.5F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, 0.3F, -0.1F, -1F, 0.3F, 0F, 0.5F, -0.7F, -0.4F, 0.5F, -0.7F, -0.4F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 89
		bodyModel[113].setRotationPoint(-31.4F, -0.5F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.05F, -0.4F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.3F, -0.05F, -0.4F, 0.3F, -0.05F, -0.1F, -0.7F, -0.3F, 0.2F, -0.7F, -0.3F, 0.2F, 0.3F, -0.05F, -0.1F, 0.3F); // Box 89
		bodyModel[114].setRotationPoint(30.4F, 0.5F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, -0.7F, -0.1F, -1F, -0.7F, -0.1F, -1F, 0.3F, -0.3F, -0.9F, 0.3F, -0.4F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0.3F, -0.4F, 0.5F, 0.3F); // Box 89
		bodyModel[115].setRotationPoint(31.4F, -0.5F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		bodyModel[116].setRotationPoint(-23.5F, -5F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 117
		bodyModel[117].setRotationPoint(-15.5F, -5F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		bodyModel[118].setRotationPoint(-9.5F, -6F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119
		bodyModel[119].setRotationPoint(-28.5F, -5F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
		bodyModel[120].setRotationPoint(-14.5F, -5F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 121
		bodyModel[121].setRotationPoint(-9.5F, -21F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[122].setRotationPoint(-8.5F, -5F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 123
		bodyModel[123].setRotationPoint(4F, -5F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 124
		bodyModel[124].setRotationPoint(-3.5F, -5F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 125
		bodyModel[125].setRotationPoint(5F, -5F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 15, 20, 0F); // Box 126
		bodyModel[126].setRotationPoint(10F, -21F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 127
		bodyModel[127].setRotationPoint(10F, -6F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[128].setRotationPoint(24.5F, -5F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 129
		bodyModel[129].setRotationPoint(23.5F, -5F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 130
		bodyModel[130].setRotationPoint(16F, -5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[131].setRotationPoint(11F, -5F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 60, 2, 1, 0F); // Box 132
		bodyModel[132].setRotationPoint(-29.5F, -8F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[133].setRotationPoint(-29.5F, -18F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[134].setRotationPoint(-23.5F, -18F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[135].setRotationPoint(-17.5F, -18F, 10F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 136
		bodyModel[136].setRotationPoint(-27.5F, -18F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 137
		bodyModel[137].setRotationPoint(-21.5F, -18F, 10F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 138
		bodyModel[138].setRotationPoint(-15.5F, -18F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[139].setRotationPoint(8.5F, -18F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 140
		bodyModel[140].setRotationPoint(4.5F, -18F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[141].setRotationPoint(2.5F, -18F, 10F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 142
		bodyModel[142].setRotationPoint(-1.5F, -18F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[143].setRotationPoint(-3.5F, -18F, 10F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 144
		bodyModel[144].setRotationPoint(-7.5F, -18F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[145].setRotationPoint(-11.5F, -18F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[146].setRotationPoint(12.5F, -18F, 10F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 147
		bodyModel[147].setRotationPoint(18.5F, -18F, 10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[148].setRotationPoint(22.5F, -18F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 149
		bodyModel[149].setRotationPoint(24.5F, -18F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[150].setRotationPoint(28.5F, -18F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[151].setRotationPoint(16.5F, -18F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[152].setRotationPoint(-29.5F, -18F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 153
		bodyModel[153].setRotationPoint(-27.5F, -18F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[154].setRotationPoint(-23.5F, -18F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 155
		bodyModel[155].setRotationPoint(-21.5F, -18F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[156].setRotationPoint(-17.5F, -18F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 157
		bodyModel[157].setRotationPoint(-15.5F, -18F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[158].setRotationPoint(-11.5F, -18F, -11F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 159
		bodyModel[159].setRotationPoint(-7.5F, -18F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[160].setRotationPoint(-3.5F, -18F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 161
		bodyModel[161].setRotationPoint(-1.5F, -18F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[162].setRotationPoint(2.5F, -18F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 163
		bodyModel[163].setRotationPoint(4.5F, -18F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[164].setRotationPoint(8.5F, -18F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[165].setRotationPoint(12.5F, -18F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[166].setRotationPoint(16.5F, -18F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 167
		bodyModel[167].setRotationPoint(18.5F, -18F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[168].setRotationPoint(22.5F, -18F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 169
		bodyModel[169].setRotationPoint(24.5F, -18F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[170].setRotationPoint(28.5F, -18F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 60, 2, 1, 0F); // Box 171
		bodyModel[171].setRotationPoint(-29.5F, -8F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[172].setRotationPoint(-9.5F, -11F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[173].setRotationPoint(11F, -12F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[174].setRotationPoint(27.5F, -12F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[175].setRotationPoint(8F, -12F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[176].setRotationPoint(-8.5F, -12F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[177].setRotationPoint(-28.5F, -12F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[178].setRotationPoint(-11.5F, -12F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, -0.8F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, -0.8F, -17F); // Box 183
		bodyModel[179].setRotationPoint(-13.5F, -19F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, -4F, -0.8F, 0F, -4F, -0.8F, -17F, 0F, 0F, -17F); // Box 184
		bodyModel[180].setRotationPoint(-28.5F, -19F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, -0.8F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, -0.8F, -17F); // Box 185
		bodyModel[181].setRotationPoint(6F, -19F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, -4F, -0.8F, 0F, -4F, -0.8F, -17F, 0F, 0F, -17F); // Box 186
		bodyModel[182].setRotationPoint(-8.5F, -19F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, -0.8F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, -0.8F, -17F); // Box 187
		bodyModel[183].setRotationPoint(25.5F, -19F, -9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 8, 1, 35, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, -4F, -0.8F, 0F, -4F, -0.8F, -17F, 0F, 0F, -17F); // Box 188
		bodyModel[184].setRotationPoint(11F, -19F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[185].setRotationPoint(-9.5F, -23F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[186].setRotationPoint(10F, -23F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 187
		bodyModel[187].setRotationPoint(21F, -26F, 2F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 188
		bodyModel[188].setRotationPoint(21F, -26F, -3F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 189
		bodyModel[189].setRotationPoint(0F, -26F, -3F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 190
		bodyModel[190].setRotationPoint(0F, -26F, 2F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 191
		bodyModel[191].setRotationPoint(-21F, -26F, -3F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[192].setRotationPoint(-21F, -26F, 2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 193
		bodyModel[193].setRotationPoint(30F, -21F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[194].setRotationPoint(30F, -21F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 195
		bodyModel[195].setRotationPoint(-30F, -21F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[196].setRotationPoint(-30F, -21F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[197].setRotationPoint(-8.5F, -13F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[198].setRotationPoint(9F, -13F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[199].setRotationPoint(-28.5F, -13F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[200].setRotationPoint(-10.5F, -13F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[201].setRotationPoint(11F, -13F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[202].setRotationPoint(28.5F, -13F, -10F);
	}
}