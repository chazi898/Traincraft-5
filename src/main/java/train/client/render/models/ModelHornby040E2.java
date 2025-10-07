//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.09.2023 - 20:59:32
// Last changed on: 12.09.2023 - 20:59:32

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelHornby040E2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHornby040E2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[254];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 116, 28, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 5
		bodyModel[57] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 5
		bodyModel[59] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 5
		bodyModel[60] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 100
		bodyModel[70] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 118
		bodyModel[71] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 119
		bodyModel[72] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 120
		bodyModel[73] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 121
		bodyModel[74] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 127
		bodyModel[75] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 129
		bodyModel[77] = new ModelRendererTurbo(this, 185, 142, textureX, textureY); // Box 130
		bodyModel[78] = new ModelRendererTurbo(this, 217, 148, textureX, textureY); // Box 131
		bodyModel[79] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 133
		bodyModel[80] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 134
		bodyModel[81] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 148
		bodyModel[95] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 149
		bodyModel[96] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 150
		bodyModel[97] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 151
		bodyModel[98] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 152
		bodyModel[99] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 153
		bodyModel[100] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 154
		bodyModel[101] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 155
		bodyModel[102] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 156
		bodyModel[103] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 157
		bodyModel[104] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 158
		bodyModel[105] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 159
		bodyModel[106] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 160
		bodyModel[107] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 161
		bodyModel[108] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 162
		bodyModel[109] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 149
		bodyModel[110] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 150
		bodyModel[111] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 151
		bodyModel[112] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 152
		bodyModel[113] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 153
		bodyModel[114] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 154
		bodyModel[115] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 155
		bodyModel[116] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 156
		bodyModel[117] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 157
		bodyModel[118] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 158
		bodyModel[119] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 159
		bodyModel[120] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 160
		bodyModel[121] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 161
		bodyModel[122] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 162
		bodyModel[123] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 148
		bodyModel[137] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 191
		bodyModel[138] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 192
		bodyModel[139] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 59
		bodyModel[140] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 59
		bodyModel[141] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 383
		bodyModel[142] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 383
		bodyModel[143] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // lamp
		bodyModel[144] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // lamp
		bodyModel[145] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // lamp
		bodyModel[146] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // lamp
		bodyModel[147] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 383
		bodyModel[148] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 383
		bodyModel[149] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 383
		bodyModel[150] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 383
		bodyModel[151] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 208
		bodyModel[152] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 209
		bodyModel[153] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 211
		bodyModel[154] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 212
		bodyModel[155] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 213
		bodyModel[156] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 124
		bodyModel[157] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 169
		bodyModel[158] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 169
		bodyModel[159] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 171
		bodyModel[160] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 172
		bodyModel[161] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 173
		bodyModel[162] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 174
		bodyModel[163] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 175
		bodyModel[164] = new ModelRendererTurbo(this, 142, 148, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 184
		bodyModel[166] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 185
		bodyModel[167] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 186
		bodyModel[168] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 187
		bodyModel[169] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 189
		bodyModel[170] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 190
		bodyModel[171] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 191
		bodyModel[172] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 192
		bodyModel[173] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 193
		bodyModel[174] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 195
		bodyModel[175] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 194
		bodyModel[176] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 195
		bodyModel[177] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 196
		bodyModel[178] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 197
		bodyModel[179] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 198
		bodyModel[180] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 199
		bodyModel[181] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 200
		bodyModel[182] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 201
		bodyModel[183] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 202
		bodyModel[184] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 203
		bodyModel[185] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 185
		bodyModel[186] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 94
		bodyModel[187] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 96
		bodyModel[188] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 96
		bodyModel[189] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 171
		bodyModel[190] = new ModelRendererTurbo(this, 97, 113, textureX, textureY, "Lamp"); // lamp
		bodyModel[191] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 89
		bodyModel[193] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 89
		bodyModel[194] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 89
		bodyModel[195] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 89
		bodyModel[196] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 1295
		bodyModel[197] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 1295
		bodyModel[198] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 1295
		bodyModel[199] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 1295
		bodyModel[200] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 1295
		bodyModel[201] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 1295
		bodyModel[202] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 1295
		bodyModel[203] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 1295
		bodyModel[204] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 1295
		bodyModel[205] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 1295
		bodyModel[206] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 100
		bodyModel[207] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 100
		bodyModel[208] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 100
		bodyModel[209] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 100
		bodyModel[210] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 100
		bodyModel[211] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 122
		bodyModel[212] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 122
		bodyModel[213] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 77
		bodyModel[214] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 77
		bodyModel[215] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 174
		bodyModel[216] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 77
		bodyModel[217] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 77
		bodyModel[218] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 77
		bodyModel[219] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 188
		bodyModel[220] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 188
		bodyModel[221] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 188
		bodyModel[222] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 188
		bodyModel[223] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 188
		bodyModel[224] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 188
		bodyModel[225] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 188
		bodyModel[226] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 188
		bodyModel[227] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 122
		bodyModel[228] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 122
		bodyModel[229] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 75
		bodyModel[230] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 75
		bodyModel[231] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 75
		bodyModel[232] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 75
		bodyModel[233] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 45
		bodyModel[234] = new ModelRendererTurbo(this, 57, 156, textureX, textureY); // Box 48
		bodyModel[235] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
		bodyModel[236] = new ModelRendererTurbo(this, 67, 143, textureX, textureY); // Box 122
		bodyModel[237] = new ModelRendererTurbo(this, 76, 143, textureX, textureY); // Box 122
		bodyModel[238] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 130
		bodyModel[239] = new ModelRendererTurbo(this, 200, 152, textureX, textureY); // Box 130
		bodyModel[240] = new ModelRendererTurbo(this, 185, 154, textureX, textureY); // Box 130
		bodyModel[241] = new ModelRendererTurbo(this, 151, 148, textureX, textureY); // Box 182
		bodyModel[242] = new ModelRendererTurbo(this, 151, 143, textureX, textureY); // Box 182
		bodyModel[243] = new ModelRendererTurbo(this, 142, 143, textureX, textureY); // Box 182
		bodyModel[244] = new ModelRendererTurbo(this, 142, 139, textureX, textureY); // Box 182
		bodyModel[245] = new ModelRendererTurbo(this, 142, 168, textureX, textureY); // Box 182
		bodyModel[246] = new ModelRendererTurbo(this, 151, 168, textureX, textureY); // Box 182
		bodyModel[247] = new ModelRendererTurbo(this, 151, 162, textureX, textureY); // Box 182
		bodyModel[248] = new ModelRendererTurbo(this, 142, 162, textureX, textureY); // Box 182
		bodyModel[249] = new ModelRendererTurbo(this, 142, 157, textureX, textureY); // Box 182
		bodyModel[250] = new ModelRendererTurbo(this, 185, 162, textureX, textureY); // Box 130
		bodyModel[251] = new ModelRendererTurbo(this, 112, 171, textureX, textureY, "Lamp"); // lamp
		bodyModel[252] = new ModelRendererTurbo(this, 112, 161, textureX, textureY, "Lamp"); // lamp
		bodyModel[253] = new ModelRendererTurbo(this, 112, 166, textureX, textureY, "Lamp"); // lamp

		bodyModel[0].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, -11.2F);

		bodyModel[1].addBox(0F, 0F, 0F, 56, 5, 12, 0F); // Box 1
		bodyModel[1].setRotationPoint(-56F, 0F, -6.2F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 2
		bodyModel[2].setRotationPoint(-57F, 0F, -11.2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 3
		bodyModel[3].setRotationPoint(-56F, 0F, -11.2F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 1, 22, 0F); // Box 6
		bodyModel[4].setRotationPoint(-5F, -1F, -11.2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 7
		bodyModel[5].setRotationPoint(-56F, 0F, 5.8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-52F, -1F, -11.2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-52F, -1F, 5.8F);

		bodyModel[8].addBox(0F, 0F, 0F, 43, 1, 5, 0F); // Box 12
		bodyModel[8].setRotationPoint(-48F, -1F, 5.8F);

		bodyModel[9].addBox(0F, 0F, 0F, 43, 1, 5, 0F); // Box 13
		bodyModel[9].setRotationPoint(-48F, -1F, -11.2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-45F, -4F, -11.2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-38F, -4F, -11.2F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 16
		bodyModel[12].setRotationPoint(-41F, -4F, -11.2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 17
		bodyModel[13].setRotationPoint(-41F, -4F, 5.8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(-45F, -4F, 5.8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-38F, -4F, 5.8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 75, 21, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -50F, -14F, 0F, -50F, -14F, 0F, 0F, -14F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-41F, -11F, 9.8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 54, 9, 1, 0F,0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -36F, -6F, 0F, -36F, -6F, 0F, 0F, -6F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-34F, -4F, 9.8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 54, 9, 1, 0F,0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -36F, -6F, 0F, -36F, -6F, 0F, 0F, -6F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-34F, -4F, -11.2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 75, 21, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -50F, -14F, 0F, -50F, -14F, 0F, 0F, -14F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-41F, -11F, -11.2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 75, 3, 4, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -50F, -2F, 0F, -50F, -2F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-41F, -12F, -11.2F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Box 26
		bodyModel[21].setRotationPoint(-41F, -11F, -10.2F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Box 27
		bodyModel[22].setRotationPoint(-41F, -11F, 6.8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 75, 3, 4, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -50F, -2F, 0F, -50F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-41F, -12F, 6.8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 29
		bodyModel[24].setRotationPoint(-34F, -6F, 5.8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 30
		bodyModel[25].setRotationPoint(-34F, -4F, -10.2F);

		bodyModel[26].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 31
		bodyModel[26].setRotationPoint(-41F, -8F, 5.8F);

		bodyModel[27].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 32
		bodyModel[27].setRotationPoint(-40F, -5F, -10.2F);

		bodyModel[28].addBox(0F, 0F, 0F, 35, 4, 1, 0F); // Box 30
		bodyModel[28].setRotationPoint(-51F, -12F, -7.2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		bodyModel[29].setRotationPoint(-51F, -15F, -6.2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		bodyModel[30].setRotationPoint(-51F, -17F, -3.2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 33
		bodyModel[31].setRotationPoint(-51F, -17F, 1.8F);

		bodyModel[32].addBox(0F, 0F, 0F, 35, 4, 1, 0F); // Box 34
		bodyModel[32].setRotationPoint(-51F, -12F, 5.8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 35
		bodyModel[33].setRotationPoint(-51F, -15F, 4.8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-51F, -18F, -3.2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 37
		bodyModel[35].setRotationPoint(-51F, -8F, -7.2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 38
		bodyModel[36].setRotationPoint(-51F, -5F, -6.2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 39
		bodyModel[37].setRotationPoint(-51F, -5F, 4.8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 40
		bodyModel[38].setRotationPoint(-51F, -8F, 5.8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		bodyModel[39].setRotationPoint(-51F, -3F, -3.2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 33, 44, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, 0F, -2F, -22F, 0F, -2F, -22F, -22F, 0F, -22F, -22F); // Box 42
		bodyModel[40].setRotationPoint(-16F, -12F, -11.2F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 1, 12, 0F); // Box 43
		bodyModel[41].setRotationPoint(-15F, -1F, -6.2F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 44
		bodyModel[42].setRotationPoint(-16F, -17F, -11.2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 24, 36, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -16F, -24F, 0F, -16F, -24F, 0F, 0F, -24F, 0F); // Box 45
		bodyModel[43].setRotationPoint(-15F, -13F, -11.2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 24, 36, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -16F, -24F, 0F, -16F, -24F, 0F, 0F, -24F, 0F); // Box 48
		bodyModel[44].setRotationPoint(-7F, -13F, -11.2F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 49
		bodyModel[45].setRotationPoint(0F, -19F, -10.2F);

		bodyModel[46].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 51
		bodyModel[46].setRotationPoint(-48F, -5F, -6.2F);

		bodyModel[47].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 52
		bodyModel[47].setRotationPoint(-48F, -5F, 4.8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-48F, -4F, -5.2F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 56
		bodyModel[49].setRotationPoint(-48F, -2F, -3.2F);

		bodyModel[50].addBox(0F, 0F, 0F, 35, 4, 12, 0F); // Box 57
		bodyModel[50].setRotationPoint(-51.4F, -12F, -6.2F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 58
		bodyModel[51].setRotationPoint(-16F, -21F, -11.2F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 65
		bodyModel[52].setRotationPoint(-56F, -1F, 4.8F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 66
		bodyModel[53].setRotationPoint(-56F, -1F, -6.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-57F, -1F, -6.2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(-57F, -1F, 4.8F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 5
		bodyModel[56].setRotationPoint(-44F, 0F, 6F);

		bodyModel[57].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 5
		bodyModel[57].setRotationPoint(-24F, 0F, 6F);

		bodyModel[58].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 5
		bodyModel[58].setRotationPoint(-44F, 0F, -6.3F);

		bodyModel[59].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 5
		bodyModel[59].setRotationPoint(-24F, 0F, -6.3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[60].setRotationPoint(-48F, -4F, 2.8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[61].setRotationPoint(-37.5F, 6F, 5.8F);

		bodyModel[62].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 75
		bodyModel[62].setRotationPoint(-41.5F, 3F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[63].setRotationPoint(0F, -19F, 9.8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[64].setRotationPoint(-4F, -19F, -11.2F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 78
		bodyModel[65].setRotationPoint(-5F, -17F, -10.2F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 4, 20, 0F); // Box 79
		bodyModel[66].setRotationPoint(-4F, -13F, -10.2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-48F, -3F, 0.8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[68].setRotationPoint(-48F, -3F, -3.2F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 100
		bodyModel[69].setRotationPoint(-11.5F, 1F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 35, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 118
		bodyModel[70].setRotationPoint(-51.4F, -15F, -5.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 35, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[71].setRotationPoint(-51.4F, -8F, -5.2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 35, 2, 10, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 120
		bodyModel[72].setRotationPoint(-51.4F, -5F, -5.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 35, 2, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 121
		bodyModel[73].setRotationPoint(-51.4F, -17F, -5.2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[74].setRotationPoint(-55F, -3F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-55F, -3F, -0.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[76].setRotationPoint(-55F, -3F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		bodyModel[77].setRotationPoint(-33F, -21F, -0.2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[78].setRotationPoint(-33F, -23F, -0.2F);

		bodyModel[79].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 133
		bodyModel[79].setRotationPoint(-15F, -21F, -11.2F);

		bodyModel[80].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 134
		bodyModel[80].setRotationPoint(-15F, -21F, 9.8F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[81].setRotationPoint(-59F, 1.5F, -7.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[82].setRotationPoint(-59F, 2.5F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(-59F, 1.5F, -8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-59F, 1.5F, -6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-59F, 3.5F, -8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[86].setRotationPoint(-59F, 3.5F, -6.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 0
		bodyModel[87].setRotationPoint(-60F, 0F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[88].setRotationPoint(-60F, 2F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[89].setRotationPoint(-60F, 2F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-60F, 0F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-60F, 4F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-60F, 0F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0
		bodyModel[93].setRotationPoint(-60F, 4F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 148
		bodyModel[94].setRotationPoint(-59F, 2.5F, -6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[95].setRotationPoint(-59F, 1.5F, 7.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150
		bodyModel[96].setRotationPoint(-59F, 2.5F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 151
		bodyModel[97].setRotationPoint(-59F, 3.5F, 7.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 152
		bodyModel[98].setRotationPoint(-59F, 1.5F, 6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[99].setRotationPoint(-59F, 3.5F, 5.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 154
		bodyModel[100].setRotationPoint(-59F, 2.5F, 5.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[101].setRotationPoint(-59F, 1.5F, 5.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[102].setRotationPoint(-60F, 0F, 4F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 157
		bodyModel[103].setRotationPoint(-60F, 0F, 6F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 158
		bodyModel[104].setRotationPoint(-60F, 2F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[105].setRotationPoint(-60F, 4F, 4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 160
		bodyModel[106].setRotationPoint(-60F, 4F, 8F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 161
		bodyModel[107].setRotationPoint(-60F, 2F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[108].setRotationPoint(-60F, 0F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[109].setRotationPoint(1F, 1.5F, 7.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150
		bodyModel[110].setRotationPoint(1F, 2.5F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 151
		bodyModel[111].setRotationPoint(1F, 3.5F, 7.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 152
		bodyModel[112].setRotationPoint(1F, 1.5F, 6.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[113].setRotationPoint(1F, 3.5F, 5.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 154
		bodyModel[114].setRotationPoint(1F, 2.5F, 5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[115].setRotationPoint(1F, 1.5F, 5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[116].setRotationPoint(3F, 0F, 4F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 157
		bodyModel[117].setRotationPoint(3F, 0F, 6F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 158
		bodyModel[118].setRotationPoint(3F, 2F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[119].setRotationPoint(3F, 4F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 160
		bodyModel[120].setRotationPoint(3F, 4F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 161
		bodyModel[121].setRotationPoint(3F, 2F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[122].setRotationPoint(3F, 0F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[123].setRotationPoint(1F, 1.5F, -7.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		bodyModel[124].setRotationPoint(1F, 2.5F, -8.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[125].setRotationPoint(1F, 1.5F, -8.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[126].setRotationPoint(1F, 1.5F, -6.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[127].setRotationPoint(1F, 3.5F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[128].setRotationPoint(1F, 3.5F, -6.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 0
		bodyModel[129].setRotationPoint(3F, 0F, -8F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[130].setRotationPoint(3F, 2F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[131].setRotationPoint(3F, 2F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[132].setRotationPoint(3F, 0F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(3F, 4F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[134].setRotationPoint(3F, 0F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0
		bodyModel[135].setRotationPoint(3F, 4F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 148
		bodyModel[136].setRotationPoint(1F, 2.5F, -6.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 191
		bodyModel[137].setRotationPoint(-52F, -12F, -7.2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 192
		bodyModel[138].setRotationPoint(-52F, -9F, -7.2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -2F, 0F); // Box 59
		bodyModel[139].setRotationPoint(-12F, -13F, -3.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 3.75F, -0.25F, -0.75F, 3.75F, -0.25F, -0.25F, -6.5F, -0.25F, -0.25F, -6.5F); // Box 59
		bodyModel[140].setRotationPoint(-15.25F, -10F, 2.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[141].setRotationPoint(-15F, -12.25F, 1F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[142].setRotationPoint(-15F, -12.25F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[143].setRotationPoint(-15F, -14.5F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[144].setRotationPoint(-15F, -14.5F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[145].setRotationPoint(-15F, -13.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[146].setRotationPoint(-15F, -13.5F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[147].setRotationPoint(-15F, -14.5F, 1.25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 383
		bodyModel[148].setRotationPoint(-15F, -14.5F, 2.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 383
		bodyModel[149].setRotationPoint(-15F, -13.5F, 1.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 383
		bodyModel[150].setRotationPoint(-15F, -13.5F, 2.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[151].setRotationPoint(-16F, -23F, -11.2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[152].setRotationPoint(-5F, -23F, -11.2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 12, 2, 18, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[153].setRotationPoint(-16F, -25F, -9.2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[154].setRotationPoint(-15F, -23F, -11.2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[155].setRotationPoint(-15F, -23F, 9.8F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 124
		bodyModel[156].setRotationPoint(-18F, -20.5F, -1.7F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 169
		bodyModel[157].setRotationPoint(-18F, -20.5F, 0.3F);

		bodyModel[158].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 169
		bodyModel[158].setRotationPoint(-41F, -8F, -7.2F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 171
		bodyModel[159].setRotationPoint(-15F, -20F, 9.8F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 172
		bodyModel[160].setRotationPoint(-12F, -20F, 9.8F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 173
		bodyModel[161].setRotationPoint(-6F, -20F, 9.8F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 174
		bodyModel[162].setRotationPoint(-6F, -20F, -11.2F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 175
		bodyModel[163].setRotationPoint(-12F, -20F, -11.2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F); // Box 182
		bodyModel[164].setRotationPoint(-40F, -13F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 184
		bodyModel[165].setRotationPoint(-16F, -21F, -5.2F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 185
		bodyModel[166].setRotationPoint(-16F, -21F, 8.8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[167].setRotationPoint(-16F, -21F, -6.2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 187
		bodyModel[168].setRotationPoint(-16F, -21F, -9.2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[169].setRotationPoint(-16F, -18F, -6.2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[170].setRotationPoint(-16F, -18F, 7.8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[171].setRotationPoint(-16F, -21F, 7.8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 192
		bodyModel[172].setRotationPoint(-16F, -21F, 4.8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[173].setRotationPoint(-16F, -18F, 4.8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[174].setRotationPoint(-16F, -18F, -9.2F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 194
		bodyModel[175].setRotationPoint(-5F, -21F, -10.2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[176].setRotationPoint(-5F, -18F, -9.2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[177].setRotationPoint(-5F, -18F, -6.2F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 197
		bodyModel[178].setRotationPoint(-5F, -21F, -5.2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[179].setRotationPoint(-5F, -21F, -6.2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 199
		bodyModel[180].setRotationPoint(-5F, -21F, -9.2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 200
		bodyModel[181].setRotationPoint(-5F, -21F, 4.8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[182].setRotationPoint(-5F, -18F, 4.8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[183].setRotationPoint(-5F, -18F, 7.8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[184].setRotationPoint(-5F, -21F, 7.8F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 185
		bodyModel[185].setRotationPoint(-5F, -21F, 8.8F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 94
		bodyModel[186].setRotationPoint(-52.5F, -10.5F, -0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 96
		bodyModel[187].setRotationPoint(-53.5F, -10.5F, -2.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F); // Box 96
		bodyModel[188].setRotationPoint(-53.5F, -9.5F, -0.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 171
		bodyModel[189].setRotationPoint(-15F, -20F, -11.2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[190].setRotationPoint(1F, -10F, -0.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[191].setRotationPoint(1F, -11F, -1.7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.7F, -0.05F, -0.4F, -0.7F, -0.05F, -0.4F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0.2F, -0.7F, -0.05F, -0.1F, -0.7F, -0.05F, -0.1F, 0.3F, -0.3F, 0.2F, 0.3F); // Box 89
		bodyModel[192].setRotationPoint(-58.9F, 2F, -1.1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, 0.3F, -0.1F, -1F, 0.3F, 0F, 0.5F, -0.7F, -0.4F, 0.5F, -0.7F, -0.4F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 89
		bodyModel[193].setRotationPoint(-58.9F, 1F, -1.1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.05F, -0.4F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.3F, -0.05F, -0.4F, 0.3F, -0.05F, -0.1F, -0.7F, -0.3F, 0.2F, -0.7F, -0.3F, 0.2F, 0.3F, -0.05F, -0.1F, 0.3F); // Box 89
		bodyModel[194].setRotationPoint(0.9F, 2F, -1.1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, -0.7F, -0.1F, -1F, -0.7F, -0.1F, -1F, 0.3F, -0.3F, -0.9F, 0.3F, -0.4F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0.3F, -0.4F, 0.5F, 0.3F); // Box 89
		bodyModel[195].setRotationPoint(1.9F, 1F, -1.1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -1F, 1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -1F, 1F, 0F); // Box 1295
		bodyModel[196].setRotationPoint(-45F, -5F, -11.21F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F); // Box 1295
		bodyModel[197].setRotationPoint(-41.5F, -5F, -11.21F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,-0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 1295
		bodyModel[198].setRotationPoint(-44F, -2.5F, -11.22F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.3F, 0F); // Box 1295
		bodyModel[199].setRotationPoint(-38F, -5F, -11.21F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -1F, 1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -1F, 1F, 0F); // Box 1295
		bodyModel[200].setRotationPoint(-45F, -5F, 10.81F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F); // Box 1295
		bodyModel[201].setRotationPoint(-41.5F, -5F, 10.81F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,-0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 1295
		bodyModel[202].setRotationPoint(-44F, -2.5F, 10.82F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.3F, 0F); // Box 1295
		bodyModel[203].setRotationPoint(-38F, -5F, 10.81F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 19, 5, 0, 0F,-0.3F, -0.9F, 0F, -13.3F, -0.9F, 0F, -13.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.3F, -2.5F, 0F, -13.3F, -2.5F, 0F, -13.3F, -2.5F, 0F, -0.3F, -2.5F, 0F); // Box 1295
		bodyModel[204].setRotationPoint(-6F, -9.1F, -11.24F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 19, 5, 0, 0F,-0.3F, -0.9F, 0F, -13.3F, -0.9F, 0F, -13.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.3F, -2.5F, 0F, -13.3F, -2.5F, 0F, -13.3F, -2.5F, 0F, -0.3F, -2.5F, 0F); // Box 1295
		bodyModel[205].setRotationPoint(-6F, -9.1F, 10.81F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 100
		bodyModel[206].setRotationPoint(-11.5F, 0F, 9F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 100
		bodyModel[207].setRotationPoint(-11.5F, 4F, 10F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 100
		bodyModel[208].setRotationPoint(-11.5F, 1F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 100
		bodyModel[209].setRotationPoint(-11.5F, 0F, -10F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 100
		bodyModel[210].setRotationPoint(-11.5F, 4F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[211].setRotationPoint(-47F, -25.5F, -1.6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1.5F, 0F, -0.6F, -1.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.4F, -0.6F, -1.3F, -0.4F, -0.6F, -0.3F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 122
		bodyModel[212].setRotationPoint(-48F, -25F, -2.6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[213].setRotationPoint(-4F, -17F, -11.2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[214].setRotationPoint(-4F, -15F, -11.2F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 174
		bodyModel[215].setRotationPoint(0F, -19F, -11.2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[216].setRotationPoint(-4F, -19F, 9.8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[217].setRotationPoint(-4F, -17F, 9.8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[218].setRotationPoint(-4F, -15F, 9.8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[219].setRotationPoint(-7F, -14F, -11.2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[220].setRotationPoint(-7F, -20F, -11.2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[221].setRotationPoint(-11F, -20F, -11.2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[222].setRotationPoint(-11F, -14F, -11.2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[223].setRotationPoint(-7F, -14F, 9.8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[224].setRotationPoint(-7F, -20F, 9.8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[225].setRotationPoint(-11F, -20F, 9.8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[226].setRotationPoint(-11F, -14F, 9.8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F); // Box 122
		bodyModel[227].setRotationPoint(-47F, -25.5F, 0.2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, -0.6F, -1.5F, 0F, -0.6F, -0.5F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.3F, -0.4F, -0.6F, -1.5F, -0.4F, -0.6F); // Box 122
		bodyModel[228].setRotationPoint(-48F, -25F, 0.2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 75
		bodyModel[229].setRotationPoint(-41.5F, 3F, -7.2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 75
		bodyModel[230].setRotationPoint(-21.5F, 3F, -7.2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 75
		bodyModel[231].setRotationPoint(-37.5F, 6F, 6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 75
		bodyModel[232].setRotationPoint(-17.5F, 6F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 24, 36, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -16F, -24F, 0F, -16F, -24F, 0F, 0F, -24F, 0F); // Box 45
		bodyModel[233].setRotationPoint(-15F, -13F, 9.8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 24, 36, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -16F, -24F, 0F, -16F, -24F, 0F, 0F, -24F, 0F); // Box 48
		bodyModel[234].setRotationPoint(-7F, -13F, 9.8F);

		bodyModel[235].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 32
		bodyModel[235].setRotationPoint(-40F, -5F, 5.8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[236].setRotationPoint(-47F, -25.5F, -0.8F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -1F, -0.5F, -0.4F, -1F); // Box 122
		bodyModel[237].setRotationPoint(-48F, -25F, -0.8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		bodyModel[238].setRotationPoint(-33F, -21F, -2.2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 130
		bodyModel[239].setRotationPoint(-33F, -21F, -0.2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -2F, 0F, -1F, -2F, 0F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		bodyModel[240].setRotationPoint(-33F, -23F, -2.2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[241].setRotationPoint(-40F, -13F, -9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.6F); // Box 182
		bodyModel[242].setRotationPoint(-39F, -13F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, 0F, 0F); // Box 182
		bodyModel[243].setRotationPoint(-40F, -13F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 182
		bodyModel[244].setRotationPoint(-39.5F, -13F, -9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F); // Box 182
		bodyModel[245].setRotationPoint(-40F, -13F, 7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[246].setRotationPoint(-40F, -13F, 8.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.6F); // Box 182
		bodyModel[247].setRotationPoint(-39F, -13F, 7.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, 0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, 0F, 0F); // Box 182
		bodyModel[248].setRotationPoint(-40F, -13F, 7.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 182
		bodyModel[249].setRotationPoint(-39.5F, -13F, 8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 130
		bodyModel[250].setRotationPoint(-33F, -23F, -0.2F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F); // lamp
		bodyModel[251].setRotationPoint(-55.5F, -2.5F, 7.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F); // lamp
		bodyModel[252].setRotationPoint(-55.5F, -2.5F, -9.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F); // lamp
		bodyModel[253].setRotationPoint(-55.5F, -2.5F, -0.5F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 254; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("Lamp")) {
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