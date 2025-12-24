//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 06.07.2022 - 13:19:08
// Last changed on: 06.07.2022 - 13:19:08

package train.client.render.models; //Path where the model is located


import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelMWClass88BTE extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelMWClass88BTE() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[304];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[18] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 1
		bodyModel[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 1
		bodyModel[25] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 5
		bodyModel[37] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 5
		bodyModel[38] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 5
		bodyModel[41] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 5
		bodyModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[43] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 5
		bodyModel[45] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[51] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[53] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 29, 41, textureX, textureY); // Box 1
		bodyModel[57] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 1
		bodyModel[62] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 5
		bodyModel[63] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 5
		bodyModel[64] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 5
		bodyModel[65] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 5
		bodyModel[66] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 5
		bodyModel[67] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 5
		bodyModel[68] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[72] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[73] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[74] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[75] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[78] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[81] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1
		bodyModel[83] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 1
		bodyModel[87] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 1
		bodyModel[89] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 1
		bodyModel[92] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 5
		bodyModel[95] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 5
		bodyModel[96] = new ModelRendererTurbo(this, 86, 135, textureX, textureY); // Box 5
		bodyModel[97] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 5
		bodyModel[98] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 5
		bodyModel[99] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 5
		bodyModel[100] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 5
		bodyModel[101] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 212
		bodyModel[102] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 212
		bodyModel[103] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 212
		bodyModel[104] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 212
		bodyModel[105] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 5
		bodyModel[106] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 212
		bodyModel[107] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 5
		bodyModel[108] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 5
		bodyModel[109] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 5
		bodyModel[110] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 212
		bodyModel[111] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 212
		bodyModel[113] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 212
		bodyModel[114] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 5
		bodyModel[115] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 212
		bodyModel[116] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 5
		bodyModel[117] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 5
		bodyModel[119] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 5
		bodyModel[120] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 5
		bodyModel[121] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 5
		bodyModel[122] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 5
		bodyModel[123] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 5
		bodyModel[124] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 5
		bodyModel[125] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 5
		bodyModel[126] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 5
		bodyModel[127] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 5
		bodyModel[128] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 5
		bodyModel[129] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 5
		bodyModel[130] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 5
		bodyModel[131] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 5
		bodyModel[132] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 5
		bodyModel[133] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 5
		bodyModel[134] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 5
		bodyModel[135] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 5
		bodyModel[136] = new ModelRendererTurbo(this, 322, 66, textureX, textureY); // Box 5
		bodyModel[137] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 5
		bodyModel[139] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 5
		bodyModel[140] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[145] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[146] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[147] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[148] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 1
		bodyModel[151] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 5
		bodyModel[152] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 5
		bodyModel[153] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 5
		bodyModel[154] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 5
		bodyModel[155] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 5
		bodyModel[156] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 5
		bodyModel[157] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 5
		bodyModel[158] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 5
		bodyModel[159] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 5
		bodyModel[160] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 5
		bodyModel[161] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 5
		bodyModel[162] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 5
		bodyModel[163] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 5
		bodyModel[164] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 5
		bodyModel[165] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 5
		bodyModel[166] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 5
		bodyModel[167] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 5
		bodyModel[168] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 5
		bodyModel[169] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 5
		bodyModel[170] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 5
		bodyModel[171] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 5
		bodyModel[172] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 5
		bodyModel[173] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 5
		bodyModel[174] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 5
		bodyModel[175] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 1
		bodyModel[176] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 101
		bodyModel[177] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 102
		bodyModel[178] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[179] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 111
		bodyModel[180] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 5
		bodyModel[181] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 5
		bodyModel[182] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 5
		bodyModel[183] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 5
		bodyModel[184] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 5
		bodyModel[185] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 5
		bodyModel[186] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 5
		bodyModel[187] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 5
		bodyModel[188] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 5
		bodyModel[189] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 5
		bodyModel[190] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[191] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 5
		bodyModel[192] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 5
		bodyModel[193] = new ModelRendererTurbo(this, 196, 69, textureX, textureY); // Box 5
		bodyModel[194] = new ModelRendererTurbo(this, 227, 66, textureX, textureY); // Box 5
		bodyModel[195] = new ModelRendererTurbo(this, 243, 66, textureX, textureY); // Box 5
		bodyModel[196] = new ModelRendererTurbo(this, 227, 67, textureX, textureY); // Box 5
		bodyModel[197] = new ModelRendererTurbo(this, 227, 67, textureX, textureY); // Box 5
		bodyModel[198] = new ModelRendererTurbo(this, 227, 67, textureX, textureY); // Box 5
		bodyModel[199] = new ModelRendererTurbo(this, 226, 67, textureX, textureY); // Box 5
		bodyModel[200] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 5
		bodyModel[201] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 5
		bodyModel[202] = new ModelRendererTurbo(this, 427, 73, textureX, textureY); // Box 5
		bodyModel[203] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 5
		bodyModel[204] = new ModelRendererTurbo(this, 427, 73, textureX, textureY); // Box 5
		bodyModel[205] = new ModelRendererTurbo(this, 322, 66, textureX, textureY); // Box 5
		bodyModel[206] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 5
		bodyModel[207] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 5
		bodyModel[208] = new ModelRendererTurbo(this, 318, 36, textureX, textureY); // Box 125
		bodyModel[209] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 59
		bodyModel[210] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 60
		bodyModel[211] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 59
		bodyModel[212] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 59
		bodyModel[215] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 383
		bodyModel[216] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 383
		bodyModel[217] = new ModelRendererTurbo(this, 73, 233, textureX, textureY,"lamp"); // lamp
		bodyModel[218] = new ModelRendererTurbo(this, 81, 233, textureX, textureY,"lamp"); // lamp
		bodyModel[219] = new ModelRendererTurbo(this, 89, 233, textureX, textureY,"lamp"); // lamp
		bodyModel[220] = new ModelRendererTurbo(this, 97, 233, textureX, textureY,"lamp"); // lamp
		bodyModel[221] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 383
		bodyModel[222] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 383
		bodyModel[223] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Box 383
		bodyModel[224] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 383
		bodyModel[225] = new ModelRendererTurbo(this, 457, 126, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 5
		bodyModel[227] = new ModelRendererTurbo(this, 66, 41, textureX, textureY); // Box 1
		bodyModel[228] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 167, 4, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 65, 46, textureX, textureY); // Box 1
		bodyModel[231] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 1
		bodyModel[232] = new ModelRendererTurbo(this, 179, 5, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 65, 130, textureX, textureY); // Box 1
		bodyModel[235] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[236] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[237] = new ModelRendererTurbo(this, 29, 41, textureX, textureY); // Box 1
		bodyModel[238] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 1
		bodyModel[242] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 1
		bodyModel[243] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 5
		bodyModel[244] = new ModelRendererTurbo(this, 66, 41, textureX, textureY); // Box 1
		bodyModel[245] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 167, 4, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 65, 46, textureX, textureY); // Box 1
		bodyModel[248] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 1
		bodyModel[249] = new ModelRendererTurbo(this, 179, 5, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 65, 130, textureX, textureY); // Box 1
		bodyModel[252] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 29, 41, textureX, textureY); // Box 1
		bodyModel[256] = new ModelRendererTurbo(this, 29, 41, textureX, textureY); // Box 1
		bodyModel[257] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[258] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[259] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[260] = new ModelRendererTurbo(this, 417, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[261] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 101
		bodyModel[262] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 111
		bodyModel[263] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[265] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 0
		bodyModel[267] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 330
		bodyModel[268] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 331
		bodyModel[269] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 332
		bodyModel[270] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 333
		bodyModel[271] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 334
		bodyModel[272] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 335
		bodyModel[273] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 336
		bodyModel[274] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 337
		bodyModel[275] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 338
		bodyModel[276] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 339
		bodyModel[277] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 340
		bodyModel[278] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 341
		bodyModel[279] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 342
		bodyModel[280] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 343
		bodyModel[281] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 344
		bodyModel[282] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 345
		bodyModel[283] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 346
		bodyModel[284] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 347
		bodyModel[285] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 348
		bodyModel[286] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 349
		bodyModel[287] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 350
		bodyModel[288] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 351
		bodyModel[289] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 352
		bodyModel[290] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 353
		bodyModel[291] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 354
		bodyModel[292] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 355
		bodyModel[293] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 356
		bodyModel[294] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 357
		bodyModel[295] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 358
		bodyModel[296] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 359
		bodyModel[297] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 171
		bodyModel[298] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 172
		bodyModel[299] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 173
		bodyModel[300] = new ModelRendererTurbo(this, 318, 36, textureX, textureY); // Box 363
		bodyModel[301] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 364
		bodyModel[302] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 365
		bodyModel[303] = new ModelRendererTurbo(this, 307, 40, textureX, textureY); // Box 366

		bodyModel[0].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-18.5F, 0F, 6F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[1].setRotationPoint(-7.5F, 0F, 6F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[2].setRotationPoint(3.5F, 0F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[3].setRotationPoint(14.5F, 0F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[4].setRotationPoint(-18.5F, 0F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[5].setRotationPoint(-7.5F, 0F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[6].setRotationPoint(3.5F, 0F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[7].setRotationPoint(14.5F, 0F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[8].setRotationPoint(-14F, 4.5F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[9].setRotationPoint(-3F, 4.5F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[10].setRotationPoint(8F, 4.5F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[11].setRotationPoint(19F, 4.5F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 44, 6, 1, 0F); // Box 0
		bodyModel[12].setRotationPoint(-19F, 0F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 44, 6, 1, 0F); // Box 0
		bodyModel[13].setRotationPoint(-19F, 0F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 1
		bodyModel[14].setRotationPoint(-25F, -1F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-27F, 0F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-28F, -1F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 49, 1, 22, 0F); // Box 1
		bodyModel[17].setRotationPoint(-24F, -1F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 1
		bodyModel[18].setRotationPoint(25F, -1F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 24, 14, 22, 0F); // Box 1
		bodyModel[19].setRotationPoint(-18F, -15F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[20].setRotationPoint(-24.25F, -4F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(-24.25F, -8F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-24.25F, -4F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(-24.25F, -8F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[24].setRotationPoint(-24.25F, -6F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[25].setRotationPoint(-24.25F, -4F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[26].setRotationPoint(-24.25F, -8F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-24.25F, -10F, -3F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 6
		bodyModel[28].setRotationPoint(-24.25F, -10F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[29].setRotationPoint(-24.25F, -10F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[30].setRotationPoint(-24.25F, -9F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[31].setRotationPoint(-24.25F, -9F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[32].setRotationPoint(-24.25F, -9F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[33].setRotationPoint(-24.25F, -2F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[34].setRotationPoint(-24.25F, -2F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(-24.25F, -2F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,1F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[36].setRotationPoint(-22F, -22F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 1F, 1F, -0.75F, 1F, 1F, 1F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[37].setRotationPoint(-20F, -22F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 1F, 1F, -0.25F, 1F, 1F, 0F, 0F, 0F, 1F, 1F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[38].setRotationPoint(-22F, -22F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1F, 1F, 0.25F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[39].setRotationPoint(-21F, -22F, 0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 1F, 1F, -0.25F, -0.75F, 1F, 1F, -0.25F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[40].setRotationPoint(-20F, -22F, 0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,1F, 1F, -0.25F, 0F, 0F, 0F, -0.25F, 1F, 1F, -0.75F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		bodyModel[41].setRotationPoint(-22F, -22F, 0.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 5
		bodyModel[42].setRotationPoint(-21F, -22F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.25F, 1F, 1F, 0.25F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[43].setRotationPoint(-21F, -22F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 1F, 1F, 0.25F, 1F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[44].setRotationPoint(-20F, -22F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[45].setRotationPoint(-15.5F, 3F, 6.02F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 0
		bodyModel[46].setRotationPoint(-4.5F, 3F, 6.12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[47].setRotationPoint(-15.5F, 3.75F, 6.02F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[48].setRotationPoint(-15.5F, 3F, 6.02F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[49].setRotationPoint(-17.5F, 6F, -7.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[50].setRotationPoint(-16.5F, 6F, -7.01F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[51].setRotationPoint(-16.5F, 6.75F, -7.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[52].setRotationPoint(-16.5F, 6F, -7.01F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[53].setRotationPoint(-16.5F, 3F, 6.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[54].setRotationPoint(-17.5F, 3F, 7.43F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[55].setRotationPoint(-17.5F, 3.75F, 7.43F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[56].setRotationPoint(-17.5F, 3F, 7.43F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[57].setRotationPoint(-17.45F, 2.5F, 7.33F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(-18.45F, 2.5F, 7.33F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(-18.45F, 3.5F, 7.33F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[60].setRotationPoint(-19.45F, 4F, 7.58F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[61].setRotationPoint(-19.45F, 2F, 7.57F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 2, 18, 0F); // Box 5
		bodyModel[62].setRotationPoint(-24F, 2.5F, -8.91F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[63].setRotationPoint(-24F, -0.5F, -8.91F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[64].setRotationPoint(-24F, 4.5F, 7.09F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[65].setRotationPoint(-24F, 4.5F, -6.91F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[66].setRotationPoint(-24F, 4.5F, -8.91F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[67].setRotationPoint(-24F, -0.5F, 8.09F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 3, 16, 0F); // Box 5
		bodyModel[68].setRotationPoint(-24F, -0.5F, -7.91F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[69].setRotationPoint(-3.5F, 3F, 6.02F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[70].setRotationPoint(-3.5F, 3.75F, 6.02F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[71].setRotationPoint(-3.5F, 3F, 6.02F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[72].setRotationPoint(-4.5F, 6F, -7.01F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[73].setRotationPoint(-4.5F, 6.75F, -7.01F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[74].setRotationPoint(-4.5F, 6F, -7.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[75].setRotationPoint(6.5F, 6F, -7.01F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[76].setRotationPoint(7.5F, 3F, 6.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[77].setRotationPoint(8.5F, 3F, 6.02F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1
		bodyModel[78].setRotationPoint(8.5F, 3.75F, 6.02F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[79].setRotationPoint(8.5F, 3F, 6.02F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[80].setRotationPoint(7.5F, 6F, -7.01F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[81].setRotationPoint(7.5F, 6.75F, -7.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[82].setRotationPoint(7.5F, 6F, -7.01F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[83].setRotationPoint(18.5F, 6F, -7.01F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[84].setRotationPoint(19.5F, 3F, 6.01F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 12, 22, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 90
		bodyModel[85].setRotationPoint(18F, -13F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[86].setRotationPoint(18F, -15F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[87].setRotationPoint(18F, -15F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[88].setRotationPoint(18F, -19F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(26F, -13F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 18, 22, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.99F, -0.5F, 0F, -0.99F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		bodyModel[90].setRotationPoint(6F, -18.5F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 18, 22, 0F,0F, -0.5F, -0.01F, -0.99F, -0.5F, -0.01F, -0.99F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, -0.99F, 0F, -0.01F, -0.99F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 1
		bodyModel[91].setRotationPoint(18F, -19F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.01F, 0F, -0.9F, -0.01F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, -0.01F, -0.5F, -0.9F); // Box 1
		bodyModel[92].setRotationPoint(6F, -18.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-0.01F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.95F, 0F, -0.5F, -0.95F, 0F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 1
		bodyModel[93].setRotationPoint(6F, -18.5F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 5
		bodyModel[94].setRotationPoint(6F, -20.5F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[95].setRotationPoint(6F, -21.5F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 5
		bodyModel[96].setRotationPoint(6F, -22.5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[97].setRotationPoint(6F, -20.5F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[98].setRotationPoint(6F, -21.5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.05F, 0F, -1F, 0.05F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[99].setRotationPoint(6F, -22.5F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 5
		bodyModel[100].setRotationPoint(6F, -22.5F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, -0.99F, 0F, -1F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[101].setRotationPoint(6F, -20.5F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[102].setRotationPoint(6F, -20.5F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[103].setRotationPoint(6F, -20.5F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[104].setRotationPoint(6F, -21.5F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[105].setRotationPoint(6F, -21.5F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[106].setRotationPoint(6F, -22.5F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[107].setRotationPoint(6F, -22.5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[108].setRotationPoint(6F, -22.5F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[109].setRotationPoint(18F, -21.5F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[110].setRotationPoint(18F, -20.5F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[111].setRotationPoint(18F, -20.5F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[112].setRotationPoint(18F, -20.5F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[113].setRotationPoint(18F, -21.5F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[114].setRotationPoint(18F, -21.5F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[115].setRotationPoint(18F, -22.5F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -4F, -0.99F, 0F, -4F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[116].setRotationPoint(18F, -22.5F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[117].setRotationPoint(18F, -22.5F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[118].setRotationPoint(6F, -10F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[119].setRotationPoint(6F, -17F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[120].setRotationPoint(8F, -12F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[121].setRotationPoint(8F, -17F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, 0F, -0.95F, -0.05F, 0F, -0.95F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.05F, 0F, -0.95F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[122].setRotationPoint(6F, -10F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[123].setRotationPoint(6F, -17F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.95F, 0F, -2F, -0.95F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[124].setRotationPoint(8F, -12F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -1F, -1F, -0.95F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[125].setRotationPoint(8F, -17F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -2F, 0F, -0.95F); // Box 5
		bodyModel[126].setRotationPoint(14.9F, -17F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 5
		bodyModel[127].setRotationPoint(14.9F, -17F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[128].setRotationPoint(6F, -21.5F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 5
		bodyModel[129].setRotationPoint(16.9F, -17F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.1F, 0F, -0.95F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[130].setRotationPoint(16.9F, -17F, 10F);

		bodyModel[131].addBox(0F, 0F, -2F, 8, 8, 2, 0F); // Box 5
		bodyModel[131].setRotationPoint(-7.5F, -18.5F, 1F);

		bodyModel[132].addBox(0F, 0F, -2F, 2, 9, 3, 0F); // Box 5
		bodyModel[132].setRotationPoint(-4.5F, -18.5F, -2F);

		bodyModel[133].addBox(0F, 0F, -2F, 2, 9, 3, 0F); // Box 5
		bodyModel[133].setRotationPoint(-4.5F, -18.5F, 3F);

		bodyModel[134].addBox(0F, 0F, -2F, 2, 3, 2, 0F); // Box 5
		bodyModel[134].setRotationPoint(-4.5F, -21.5F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F); // Box 5
		bodyModel[135].setRotationPoint(-7.5F, -18.5F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[136].setRotationPoint(-7.5F, -21.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F); // Box 5
		bodyModel[137].setRotationPoint(-2.5F, -18.5F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[138].setRotationPoint(-7.5F, -18.5F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[139].setRotationPoint(-2.5F, -18.5F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-25F, -14.5F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-25F, -14.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 0
		bodyModel[142].setRotationPoint(-25F, -12.5F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-25F, -12.5F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[144].setRotationPoint(-25.49F, -13.5F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[145].setRotationPoint(-25.49F, -13.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[146].setRotationPoint(-25.49F, -12.5F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[147].setRotationPoint(-25.49F, -12.5F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[148].setRotationPoint(-25F, -5.5F, -0.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 0
		bodyModel[149].setRotationPoint(-25F, -6.5F, -1.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 6, 14, 22, 0F); // Box 1
		bodyModel[150].setRotationPoint(-24F, -15F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 5
		bodyModel[151].setRotationPoint(-22F, -15F, -0.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 5
		bodyModel[152].setRotationPoint(-21F, -15F, -1.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 5
		bodyModel[153].setRotationPoint(-21F, -15F, 0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		bodyModel[154].setRotationPoint(-22F, -15F, 0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[155].setRotationPoint(-20F, -15F, 0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[156].setRotationPoint(-22F, -15F, -1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[157].setRotationPoint(-20F, -15F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[158].setRotationPoint(-24F, -11F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[159].setRotationPoint(-24F, -9F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[160].setRotationPoint(-24F, -9F, 5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[161].setRotationPoint(-24F, -10F, -4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[162].setRotationPoint(-24F, -10F, -5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[163].setRotationPoint(-24F, -10F, 4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[164].setRotationPoint(-24F, -9F, -5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[165].setRotationPoint(-24F, -9F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[166].setRotationPoint(-24F, -11F, 2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[167].setRotationPoint(-24F, -11F, -2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[168].setRotationPoint(-24F, -3F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[169].setRotationPoint(-24F, -3F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[170].setRotationPoint(-24F, -3F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[171].setRotationPoint(-24F, -1F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[172].setRotationPoint(-24F, -1F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[173].setRotationPoint(-24F, -3F, -5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[174].setRotationPoint(-24F, -3F, 4F);

		bodyModel[175].addBox(0F, 0F, 0F, 6, 4, 12, 0F); // Box 1
		bodyModel[175].setRotationPoint(-24F, -7F, -6F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[176].setRotationPoint(-25F, -14F, -1F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 102
		bodyModel[177].setRotationPoint(-22.5F, -13F, -0.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 103
		bodyModel[178].setRotationPoint(-23F, -14F, -1F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 111
		bodyModel[179].setRotationPoint(-24F, -16F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[180].setRotationPoint(-19F, 0F, -4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[181].setRotationPoint(-19F, 0F, 2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[182].setRotationPoint(-19F, 0F, -2F);

		bodyModel[183].addBox(0F, 0F, 0F, 7, 16, 8, 0F); // Box 5
		bodyModel[183].setRotationPoint(4F, -14F, -4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.25F); // Box 5
		bodyModel[184].setRotationPoint(-14F, -16F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.75F, 0F, 1F, 1F, 0F, -0.25F, 0F, 0F, 0F); // Box 5
		bodyModel[185].setRotationPoint(-12F, -16F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -0.25F); // Box 5
		bodyModel[186].setRotationPoint(-14F, -16F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F); // Box 5
		bodyModel[187].setRotationPoint(-13F, -16F, 0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -0.75F, 0F, 1F, -0.25F, 0F, 1F); // Box 5
		bodyModel[188].setRotationPoint(-12F, -16F, 0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.75F, 0F, 1F); // Box 5
		bodyModel[189].setRotationPoint(-14F, -16F, 0.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 5
		bodyModel[190].setRotationPoint(-13F, -16F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[191].setRotationPoint(-13F, -16F, -1.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0F); // Box 5
		bodyModel[192].setRotationPoint(-12F, -16F, -0.5F);

		bodyModel[193].addBox(0F, 0F, -2F, 5, 3, 2, 0F); // Box 5
		bodyModel[193].setRotationPoint(1F, -17F, 1F);

		bodyModel[194].addBox(0F, 0F, -2F, 1, 4, 2, 0F); // Box 5
		bodyModel[194].setRotationPoint(3F, -17F, -1F);

		bodyModel[195].addBox(0F, 0F, -2F, 1, 4, 2, 0F); // Box 5
		bodyModel[195].setRotationPoint(3F, -17F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Box 5
		bodyModel[196].setRotationPoint(4F, -17F, 1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F); // Box 5
		bodyModel[197].setRotationPoint(1F, -17F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[198].setRotationPoint(4F, -17F, -3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[199].setRotationPoint(1F, -17F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		bodyModel[200].setRotationPoint(2.5F, -19F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -1.75F, -1.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F); // Box 5
		bodyModel[201].setRotationPoint(-7.5F, -21.5F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[202].setRotationPoint(-4.5F, -21.5F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-1.75F, -1.5F, -1.75F, 0F, -1.5F, -1F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[203].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[204].setRotationPoint(-4.5F, -21.5F, -4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[205].setRotationPoint(-2.5F, -21.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1.5F, 0F, -1.75F, -1.5F, -1.75F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F); // Box 5
		bodyModel[206].setRotationPoint(-2.5F, -21.5F, 1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -1.5F, -1F, -1.75F, -1.5F, -1.75F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[207].setRotationPoint(-2.5F, -21.5F, -4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 125
		bodyModel[208].setRotationPoint(-26.5F, 0F, -2F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 59
		bodyModel[209].setRotationPoint(11F, -10F, 7.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 60
		bodyModel[210].setRotationPoint(10F, -13F, -7.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -2F, 0F); // Box 59
		bodyModel[211].setRotationPoint(14F, -13F, -3.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[212].setRotationPoint(8F, -5F, -7.26F);

		bodyModel[213].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[213].setRotationPoint(8F, -5F, -6.74F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 3.75F, -0.25F, -0.75F, 3.75F, -0.25F, -0.25F, -6.5F, -0.25F, -0.25F, -6.5F); // Box 59
		bodyModel[214].setRotationPoint(10.75F, -10F, 2.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[215].setRotationPoint(11F, -12.25F, 1F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[216].setRotationPoint(11F, -12.25F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[217].setRotationPoint(11F, -14.5F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[218].setRotationPoint(11F, -14.5F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[219].setRotationPoint(11F, -13.5F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[220].setRotationPoint(11F, -13.5F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[221].setRotationPoint(11F, -14.5F, 1.25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 383
		bodyModel[222].setRotationPoint(11F, -14.5F, 2.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 383
		bodyModel[223].setRotationPoint(11F, -13.5F, 1.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 383
		bodyModel[224].setRotationPoint(11F, -13.5F, 2.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[225].setRotationPoint(-10.25F, -4F, -6.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0.75F, -1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, -1F, 0F); // Box 5
		bodyModel[226].setRotationPoint(-11F, -0.5F, 6.83F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[227].setRotationPoint(-19.45F, 3F, 7.43F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[228].setRotationPoint(-18F, 5.25F, 7.83F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 0
		bodyModel[229].setRotationPoint(-17F, 4.5F, 7.83F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[230].setRotationPoint(-22.5F, 0F, 7.07F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.75F, -0.5F); // Box 1
		bodyModel[231].setRotationPoint(-18.5F, -1F, 7.58F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 0
		bodyModel[232].setRotationPoint(-8F, 1.5F, 4.83F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 0
		bodyModel[233].setRotationPoint(-10F, 1.5F, 7.84F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 1
		bodyModel[234].setRotationPoint(-18.75F, 0.25F, 7.58F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 2.25F, -0.25F, 0F, 2.25F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[235].setRotationPoint(-15.5F, 3F, -8.43F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 2.25F, -0.25F, 0F, 2.25F, 0F, 0F, -0.75F, 0F); // Box 1
		bodyModel[236].setRotationPoint(-15.5F, 3.75F, -8.43F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 2.75F, -0.5F, 0F, 2.75F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[237].setRotationPoint(-15.5F, 3F, -8.43F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[238].setRotationPoint(-16.45F, 2.5F, -8.33F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[239].setRotationPoint(-17.45F, 2.5F, -8.33F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[240].setRotationPoint(-17.45F, 3.5F, -8.33F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[241].setRotationPoint(-19.45F, 4F, -8.56F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[242].setRotationPoint(-19.45F, 2F, -8.57F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -1.25F, 0F, 0F); // Box 5
		bodyModel[243].setRotationPoint(-11F, 0.5F, -7.53F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 1
		bodyModel[244].setRotationPoint(-18.45F, 3F, -8.58F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[245].setRotationPoint(-17F, 5.25F, -8.83F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 0
		bodyModel[246].setRotationPoint(-16F, 4.5F, -8.83F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		bodyModel[247].setRotationPoint(-21.5F, 0F, -8.07F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F); // Box 1
		bodyModel[248].setRotationPoint(-17.5F, 1F, -8.58F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 0
		bodyModel[249].setRotationPoint(-8F, 1.5F, -7.55F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 0
		bodyModel[250].setRotationPoint(-10F, 1.5F, -7.56F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 1
		bodyModel[251].setRotationPoint(-17.75F, 0.25F, -8.58F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(-5.5F, 6F, -8.12F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[253].setRotationPoint(-6.5F, -4.5F, -6.75F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[254].setRotationPoint(-10F, -0.5F, -6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -2.25F, 0F, 0F, -2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 1.75F, 0F, 0F, 1.75F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
		bodyModel[255].setRotationPoint(-10.5F, 1F, 7.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0F, 0F, -0.25F, 0.25F); // Box 1
		bodyModel[256].setRotationPoint(-10.5F, 2F, -8.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[257].setRotationPoint(27F, -8.5F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[258].setRotationPoint(27F, -8.5F, -1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // lamp
		bodyModel[259].setRotationPoint(27F, -7.5F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[260].setRotationPoint(27F, -7.5F, -1F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		bodyModel[261].setRotationPoint(25.59F, -9F, -1F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 111
		bodyModel[262].setRotationPoint(26.59F, -11F, -0.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[263].setRotationPoint(26F, -9.5F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[264].setRotationPoint(26F, -9.5F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 0
		bodyModel[265].setRotationPoint(26F, -7.5F, 0F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[266].setRotationPoint(26F, -7.5F, -2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[267].setRotationPoint(-27F, 1F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331
		bodyModel[268].setRotationPoint(-27F, 1F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[269].setRotationPoint(-27F, 0F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[270].setRotationPoint(-28F, 1F, -9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 334
		bodyModel[271].setRotationPoint(-28F, 1F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[272].setRotationPoint(-28F, -1F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[273].setRotationPoint(-27F, 0F, 7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[274].setRotationPoint(-28F, -1F, 7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338
		bodyModel[275].setRotationPoint(-27F, 1F, 7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[276].setRotationPoint(-27F, 1F, 6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[277].setRotationPoint(-27F, 0F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 341
		bodyModel[278].setRotationPoint(-28F, 1F, 7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[279].setRotationPoint(-28F, 1F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[280].setRotationPoint(-28F, -1F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[281].setRotationPoint(25F, 0F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[282].setRotationPoint(27F, -1F, -9F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[283].setRotationPoint(25F, 1F, -8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 347
		bodyModel[284].setRotationPoint(25F, 1F, -7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[285].setRotationPoint(25F, 0F, -7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[286].setRotationPoint(27F, 1F, -9F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 350
		bodyModel[287].setRotationPoint(27F, 1F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[288].setRotationPoint(27F, -1F, -7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[289].setRotationPoint(25F, 0F, 7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353
		bodyModel[290].setRotationPoint(25F, 1F, 7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[291].setRotationPoint(25F, 0F, 6F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[292].setRotationPoint(25F, 1F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[293].setRotationPoint(27F, -1F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 357
		bodyModel[294].setRotationPoint(27F, 1F, 7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[295].setRotationPoint(27F, -1F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[296].setRotationPoint(27F, 1F, 5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[297].setRotationPoint(-25.5F, 0F, -0.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[298].setRotationPoint(-26.5F, 1F, -0.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 173
		bodyModel[299].setRotationPoint(-27.5F, 0F, -0.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[300].setRotationPoint(26.5F, 0F, -2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[301].setRotationPoint(24.5F, 0F, -0.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[302].setRotationPoint(25.5F, 1F, -0.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[303].setRotationPoint(26.5F, 0F, -0.5F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 304; i++) {
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