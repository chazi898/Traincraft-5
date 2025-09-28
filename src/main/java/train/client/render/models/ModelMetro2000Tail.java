package train.client.render.models;//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MetroMadrid2000Loco
// Model Creator:
// Created on: -
// Last changed on: -

//Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.common.api.Locomotive;

public class ModelMetro2000Tail extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMetro2000Tail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[326];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 277
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 278
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 174
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 175
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 182
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 183
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 184
		bodyModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 185
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 93
		bodyModel[13] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 170
		bodyModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 171
		bodyModel[15] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 183
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 184
		bodyModel[17] = new ModelRendererTurbo(this, 264, 17, textureX, textureY); // Box 201
		bodyModel[18] = new ModelRendererTurbo(this, 368, 1, textureX, textureY); // Box 202
		bodyModel[19] = new ModelRendererTurbo(this, 305, 25, textureX, textureY,"lamp"); // lamp
		bodyModel[20] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 229
		bodyModel[21] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 230
		bodyModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 231
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY,"lamp"); // lamp
		bodyModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 293
		bodyModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 294
		bodyModel[26] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 295
		bodyModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 296
		bodyModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 407
		bodyModel[29] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 411
		bodyModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 235
		bodyModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 236
		bodyModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 238
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 418
		bodyModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 419
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 421
		bodyModel[37] = new ModelRendererTurbo(this, 217, 9, textureX, textureY,"lamp"); // lamp
		bodyModel[38] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 292
		bodyModel[39] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 293
		bodyModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 294
		bodyModel[41] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 297
		bodyModel[42] = new ModelRendererTurbo(this, 130, 26, textureX, textureY); // Box 298
		bodyModel[43] = new ModelRendererTurbo(this, 130, 26, textureX, textureY); // Box 299
		bodyModel[44] = new ModelRendererTurbo(this, 133, 29, textureX, textureY); // Box 300
		bodyModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 305
		bodyModel[46] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 306
		bodyModel[47] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 307
		bodyModel[48] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 308
		bodyModel[49] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 309
		bodyModel[50] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 314
		bodyModel[51] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 315
		bodyModel[52] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 316
		bodyModel[53] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 317
		bodyModel[54] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 318
		bodyModel[55] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 319
		bodyModel[56] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 320
		bodyModel[57] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 321
		bodyModel[58] = new ModelRendererTurbo(this, 17, 1, textureX, textureY,"lamp"); // Box 332l
		bodyModel[59] = new ModelRendererTurbo(this, 449, 34, textureX, textureY,"lamp"); // lamp
		bodyModel[60] = new ModelRendererTurbo(this, 225, 1, textureX, textureY,"lamp"); // lamp
		bodyModel[61] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 360
		bodyModel[62] = new ModelRendererTurbo(this, 152, 49, textureX, textureY); // Box 387
		bodyModel[63] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 388
		bodyModel[64] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 394
		bodyModel[65] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 395
		bodyModel[66] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 396
		bodyModel[67] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 406
		bodyModel[68] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 407
		bodyModel[69] = new ModelRendererTurbo(this, 81, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[70] = new ModelRendererTurbo(this, 441, 9, textureX, textureY,"lamp"); // lamp
		bodyModel[71] = new ModelRendererTurbo(this, 273, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[72] = new ModelRendererTurbo(this, 313, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[73] = new ModelRendererTurbo(this, 217, 25, textureX, textureY,"lamp"); // lamp
		bodyModel[74] = new ModelRendererTurbo(this, 217, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[75] = new ModelRendererTurbo(this, 145, 9, textureX, textureY,"lamp"); // lamp
		bodyModel[76] = new ModelRendererTurbo(this, 249, 17, textureX, textureY,"lamp"); // lamp
		bodyModel[77] = new ModelRendererTurbo(this, 345, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[78] = new ModelRendererTurbo(this, 49, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[79] = new ModelRendererTurbo(this, 345, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[80] = new ModelRendererTurbo(this, 89, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[81] = new ModelRendererTurbo(this, 409, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[82] = new ModelRendererTurbo(this, 449, 17, textureX, textureY,"lamp"); // Box 219l
		bodyModel[83] = new ModelRendererTurbo(this, 473, 17, textureX, textureY,"lamp"); // lamp
		bodyModel[84] = new ModelRendererTurbo(this, 32, 121, textureX, textureY); // Box 221
		bodyModel[85] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 231
		bodyModel[86] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 235
		bodyModel[87] = new ModelRendererTurbo(this, 41, 41, textureX, textureY,"lamp"); // lamp
		bodyModel[88] = new ModelRendererTurbo(this, 481, 17, textureX, textureY,"lamp"); // lamp
		bodyModel[89] = new ModelRendererTurbo(this, 313, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[90] = new ModelRendererTurbo(this, 105, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[91] = new ModelRendererTurbo(this, 169, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[92] = new ModelRendererTurbo(this, 401, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[93] = new ModelRendererTurbo(this, 249, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[94] = new ModelRendererTurbo(this, 273, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[95] = new ModelRendererTurbo(this, 265, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[96] = new ModelRendererTurbo(this, 273, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[97] = new ModelRendererTurbo(this, 289, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[98] = new ModelRendererTurbo(this, 305, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[99] = new ModelRendererTurbo(this, 321, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[100] = new ModelRendererTurbo(this, 337, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[101] = new ModelRendererTurbo(this, 353, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[102] = new ModelRendererTurbo(this, 393, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[103] = new ModelRendererTurbo(this, 281, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[104] = new ModelRendererTurbo(this, 489, 58, textureX, textureY,"lamp"); // lamp
		bodyModel[105] = new ModelRendererTurbo(this, 409, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[106] = new ModelRendererTurbo(this, 273, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[107] = new ModelRendererTurbo(this, 401, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[108] = new ModelRendererTurbo(this, 1, 73, textureX, textureY,"lamp"); // lamp
		bodyModel[109] = new ModelRendererTurbo(this, 433, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[110] = new ModelRendererTurbo(this, 113, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[111] = new ModelRendererTurbo(this, 345, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[112] = new ModelRendererTurbo(this, 449, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[113] = new ModelRendererTurbo(this, 361, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[114] = new ModelRendererTurbo(this, 9, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[115] = new ModelRendererTurbo(this, 385, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[116] = new ModelRendererTurbo(this, 481, 41, textureX, textureY,"lamp"); // lamp
		bodyModel[117] = new ModelRendererTurbo(this, 49, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[118] = new ModelRendererTurbo(this, 369, 65, textureX, textureY,"lamp"); // Box 268l
		bodyModel[119] = new ModelRendererTurbo(this, 409, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[120] = new ModelRendererTurbo(this, 41, 57, textureX, textureY,"lamp"); // lamp
		bodyModel[121] = new ModelRendererTurbo(this, 89, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[122] = new ModelRendererTurbo(this, 73, 66, textureX, textureY,"lamp"); // lamp
		bodyModel[123] = new ModelRendererTurbo(this, 417, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[124] = new ModelRendererTurbo(this, 465, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[125] = new ModelRendererTurbo(this, 97, 73, textureX, textureY,"lamp"); // lamp
		bodyModel[126] = new ModelRendererTurbo(this, 233, 73, textureX, textureY,"lamp"); // lamp
		bodyModel[127] = new ModelRendererTurbo(this, 89, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[128] = new ModelRendererTurbo(this, 473, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[129] = new ModelRendererTurbo(this, 481, 65, textureX, textureY,"lamp"); // lamp
		bodyModel[130] = new ModelRendererTurbo(this, 105, 49, textureX, textureY,"lamp"); // lamp
		bodyModel[131] = new ModelRendererTurbo(this, 481, 33, textureX, textureY,"lamp"); // Box 281l
		bodyModel[132] = new ModelRendererTurbo(this, 353, 66, textureX, textureY,"lamp"); // lamp
		bodyModel[133] = new ModelRendererTurbo(this, 489, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[134] = new ModelRendererTurbo(this, 409, 73, textureX, textureY,"lamp"); // lamp
		bodyModel[135] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 4
		bodyModel[136] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 5
		bodyModel[137] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 56
		bodyModel[138] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 57
		bodyModel[139] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 45
		bodyModel[140] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 46
		bodyModel[141] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 43
		bodyModel[142] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 44
		bodyModel[143] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 45
		bodyModel[144] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 46
		bodyModel[145] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 47
		bodyModel[146] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 48
		bodyModel[147] = new ModelRendererTurbo(this, 502, 65, textureX, textureY); // Box 54
		bodyModel[148] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 57
		bodyModel[149] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 362
		bodyModel[150] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 363
		bodyModel[151] = new ModelRendererTurbo(this, 32, 109, textureX, textureY); // Box 368
		bodyModel[152] = new ModelRendererTurbo(this, 441, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[153] = new ModelRendererTurbo(this, 457, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[154] = new ModelRendererTurbo(this, 473, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[155] = new ModelRendererTurbo(this, 489, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[156] = new ModelRendererTurbo(this, 1, 97, textureX, textureY,"lamp"); // lamp
		bodyModel[157] = new ModelRendererTurbo(this, 17, 97, textureX, textureY,"lamp"); // lamp
		bodyModel[158] = new ModelRendererTurbo(this, 33, 97, textureX, textureY,"lamp"); // lamp
		bodyModel[159] = new ModelRendererTurbo(this, 49, 97, textureX, textureY,"lamp"); // lamp
		bodyModel[160] = new ModelRendererTurbo(this, 129, 105, textureX, textureY,"lamp"); // lamp
		bodyModel[161] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 401
		bodyModel[162] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 2l
		bodyModel[163] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 223
		bodyModel[164] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 83
		bodyModel[165] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 52
		bodyModel[166] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 413
		bodyModel[167] = new ModelRendererTurbo(this, 137, 97, textureX, textureY,"lamp"); // Lamp 4
		bodyModel[168] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 415
		bodyModel[169] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 424
		bodyModel[170] = new ModelRendererTurbo(this, 306, 106, textureX, textureY); // Box 425
		bodyModel[171] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 426
		bodyModel[172] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 466
		bodyModel[173] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 467
		bodyModel[174] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 468
		bodyModel[175] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 469
		bodyModel[176] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 470
		bodyModel[177] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 473
		bodyModel[178] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 287
		bodyModel[179] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 288
		bodyModel[180] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 289
		bodyModel[181] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 290
		bodyModel[182] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 291
		bodyModel[183] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 292
		bodyModel[184] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 293
		bodyModel[185] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 294
		bodyModel[186] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 308
		bodyModel[187] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 309
		bodyModel[188] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 310
		bodyModel[189] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 311
		bodyModel[190] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 326
		bodyModel[191] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 329
		bodyModel[192] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 333
		bodyModel[193] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 335
		bodyModel[194] = new ModelRendererTurbo(this, 147, 112, textureX, textureY); // Box 336
		bodyModel[195] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 337
		bodyModel[196] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Lamp 1l
		bodyModel[197] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 339
		bodyModel[198] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 340
		bodyModel[199] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 341
		bodyModel[200] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 342
		bodyModel[201] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 343
		bodyModel[202] = new ModelRendererTurbo(this, 137, 97, textureX, textureY,"lamp"); // Lamp3
		bodyModel[203] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 345
		bodyModel[204] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 332
		bodyModel[205] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 333
		bodyModel[206] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // Box 173l
		bodyModel[207] = new ModelRendererTurbo(this, 473, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[208] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[209] = new ModelRendererTurbo(this, 473, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[210] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 338
		bodyModel[211] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 339
		bodyModel[212] = new ModelRendererTurbo(this, 419, 99, textureX, textureY); // Box 340
		bodyModel[213] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[214] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[215] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[216] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[217] = new ModelRendererTurbo(this, 473, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[218] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[219] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[220] = new ModelRendererTurbo(this, 473, 33, textureX, textureY,"lamp"); // lamp
		bodyModel[221] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[222] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[223] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[224] = new ModelRendererTurbo(this, 419, 99, textureX, textureY,"lamp"); // lamp
		bodyModel[225] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 353
		bodyModel[226] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 354
		bodyModel[227] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 310
		bodyModel[228] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 311
		bodyModel[229] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 355
		bodyModel[230] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 356
		bodyModel[231] = new ModelRendererTurbo(this, 49, 142, textureX, textureY,"lamp"); // Box 357l
		bodyModel[232] = new ModelRendererTurbo(this, 41, 131, textureX, textureY,"lamp"); // lamp
		bodyModel[233] = new ModelRendererTurbo(this, 164, 139, textureX, textureY); // Box 221
		bodyModel[234] = new ModelRendererTurbo(this, 154, 127, textureX, textureY); // Box 368
		bodyModel[235] = new ModelRendererTurbo(this, 153, 160, textureX, textureY,"lamp"); // Box 357l
		bodyModel[236] = new ModelRendererTurbo(this, 153, 149, textureX, textureY,"lamp"); // lamp
		bodyModel[237] = new ModelRendererTurbo(this, 364, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[238] = new ModelRendererTurbo(this, 350, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[239] = new ModelRendererTurbo(this, 333, 89, textureX, textureY,"lamp"); // lamp
		bodyModel[240] = new ModelRendererTurbo(this, 353, 91, textureX, textureY,"lamp"); // lamp
		bodyModel[241] = new ModelRendererTurbo(this, 256, 152, textureX, textureY,"lamp"); // lamp
		bodyModel[242] = new ModelRendererTurbo(this, 30, 172, textureX, textureY,"lamp"); // lamp
		bodyModel[243] = new ModelRendererTurbo(this, 152, 182, textureX, textureY,"lamp"); // lamp
		bodyModel[244] = new ModelRendererTurbo(this, 152, 172, textureX, textureY,"lamp"); // lamp
		bodyModel[245] = new ModelRendererTurbo(this, 425, 17, textureX, textureY,"lamp"); // lamp
		bodyModel[246] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 13
		bodyModel[247] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 14
		bodyModel[248] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 16
		bodyModel[249] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 28
		bodyModel[250] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 35
		bodyModel[251] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 39
		bodyModel[252] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 41
		bodyModel[253] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 45
		bodyModel[254] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 46
		bodyModel[255] = new ModelRendererTurbo(this, 134, 81, textureX, textureY); // Box 47
		bodyModel[256] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 49
		bodyModel[257] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 58
		bodyModel[258] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 59
		bodyModel[259] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 60
		bodyModel[260] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 61
		bodyModel[261] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 62
		bodyModel[262] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 63
		bodyModel[263] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		bodyModel[265] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 43
		bodyModel[266] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 44
		bodyModel[267] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 45
		bodyModel[268] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 58
		bodyModel[269] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 59
		bodyModel[270] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 60
		bodyModel[271] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 61
		bodyModel[272] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 62
		bodyModel[273] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 63
		bodyModel[274] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 64
		bodyModel[275] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 65
		bodyModel[276] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 66
		bodyModel[277] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 289
		bodyModel[278] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 290
		bodyModel[279] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 291
		bodyModel[280] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 292
		bodyModel[281] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 295
		bodyModel[282] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 296
		bodyModel[283] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 297
		bodyModel[284] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 298
		bodyModel[285] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 299
		bodyModel[286] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 300
		bodyModel[287] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 301
		bodyModel[288] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 302
		bodyModel[289] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 303
		bodyModel[290] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 304
		bodyModel[291] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 305
		bodyModel[292] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 306
		bodyModel[293] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 312
		bodyModel[294] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 315
		bodyModel[295] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 316
		bodyModel[296] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 317
		bodyModel[297] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 318
		bodyModel[298] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 319
		bodyModel[299] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 320
		bodyModel[300] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 321
		bodyModel[301] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 322
		bodyModel[302] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 323
		bodyModel[303] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 324
		bodyModel[304] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 327
		bodyModel[305] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 328
		bodyModel[306] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 330
		bodyModel[307] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 334
		bodyModel[308] = new ModelRendererTurbo(this, 185, 42, textureX, textureY); // Box 332
		bodyModel[309] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 333
		bodyModel[310] = new ModelRendererTurbo(this, 328, 42, textureX, textureY); // Box 334
		bodyModel[311] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 335
		bodyModel[312] = new ModelRendererTurbo(this, 328, 34, textureX, textureY); // Box 336
		bodyModel[313] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 337
		bodyModel[314] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 338
		bodyModel[315] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 339
		bodyModel[316] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 336
		bodyModel[317] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 337
		bodyModel[318] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 338
		bodyModel[319] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 339
		bodyModel[320] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 340
		bodyModel[321] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 341
		bodyModel[322] = new ModelRendererTurbo(this, 416, 81, textureX, textureY); // Box 342
		bodyModel[323] = new ModelRendererTurbo(this, 502, 65, textureX, textureY); // Box 343
		bodyModel[324] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 405
		bodyModel[325] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 331

		bodyModel[0].addShapeBox(0F, 0F, 0F, 53, 1, 20, 0F,0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[0].setRotationPoint(-26.5F, 2.5F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[1].setRotationPoint(-23F, -5.5F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[2].setRotationPoint(-27.5F, -2.5F, -6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[3].setRotationPoint(-27.5F, -2.5F, -3.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 32
		bodyModel[4].setRotationPoint(-34.5F, 5F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 33
		bodyModel[5].setRotationPoint(-35.5F, 4.5F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
		bodyModel[6].setRotationPoint(-31.8F, -4.5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		bodyModel[7].setRotationPoint(-32.1F, -6.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		bodyModel[8].setRotationPoint(-25F, -7.5F, -5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[9].setRotationPoint(-25.5F, -6.5F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
		bodyModel[10].setRotationPoint(-25.5F, -6.5F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[11].setRotationPoint(-27.5F, -2.5F, -6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 62, 1, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 93
		bodyModel[12].setRotationPoint(-30.5F, -17.75F, -4.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,-0.5F, -0.25F, -2.1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.5F, -0.25F, -1.1F, -0.5F, -0.5F, -2.1F, 0F, 0F, -1.15F, 0F, 0F, -0.15F, -0.5F, -0.5F, -1.1F); // Box 170
		bodyModel[13].setRotationPoint(-33.5F, -5.5F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F,-0.5F, 0F, -1.85F, 0F, 0F, -0.75F, 0F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, -0.25F, -1.1F, 0F, -0.25F, 0F, 0F, -0.25F, -1.4F, -0.5F, -0.25F, -1.4F); // Box 171
		bodyModel[14].setRotationPoint(-33.5F, -16F, -9.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F,1F, -0.7F, 1.25F, 0F, -0.7F, 1.25F, 0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 183
		bodyModel[15].setRotationPoint(-30.5F, -18F, -7.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 62, 2, 2, 0F,1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.7F, 1.25F, 1F, -0.7F, 1.25F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F); // Box 184
		bodyModel[16].setRotationPoint(-30.5F, -18F, 5.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 201
		bodyModel[17].setRotationPoint(-31.5F, -16F, 7.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 202
		bodyModel[18].setRotationPoint(-26.5F, -5.5F, 8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // lamp
		bodyModel[19].setRotationPoint(-31.5F, -17F, -7.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[20].setRotationPoint(-23F, -15.5F, -9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[21].setRotationPoint(-23F, -17F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 231
		bodyModel[22].setRotationPoint(-28.5F, -19.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[23].setRotationPoint(-10F, -5.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
		bodyModel[24].setRotationPoint(-23F, -15.5F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 294
		bodyModel[25].setRotationPoint(-23F, -5.5F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		bodyModel[26].setRotationPoint(-23F, -15.5F, 7.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 296
		bodyModel[27].setRotationPoint(-23F, -5.5F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 407
		bodyModel[28].setRotationPoint(-23.25F, 4F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, -0.5F, 0F, -1.85F, -0.5F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, -1.1F); // Box 411
		bodyModel[29].setRotationPoint(-33.5F, -16F, 5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[30].setRotationPoint(-29F, -4.5F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[31].setRotationPoint(-30F, -4.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
		bodyModel[32].setRotationPoint(-29.5F, -5.3F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
		bodyModel[33].setRotationPoint(-29.5F, -6.1F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 418
		bodyModel[34].setRotationPoint(-30.5F, -3.5F, -8.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 419
		bodyModel[35].setRotationPoint(-31.5F, -3.5F, -1F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 421
		bodyModel[36].setRotationPoint(-26.5F, -1.5F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // lamp
		bodyModel[37].setRotationPoint(-9.99F, -15F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.132F, 0F, 0F, -0.15F); // Box 292
		bodyModel[38].setRotationPoint(-31.5F, -5.5F, 8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 293
		bodyModel[39].setRotationPoint(-31.5F, 2.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.2F); // Box 294
		bodyModel[40].setRotationPoint(-31.5F, 2.5F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,-0.5F, 0.5F, -2.1F, 0F, 0F, -1.15F, 0F, 0F, -0.15F, -0.5F, 0.5F, -1.1F, -0.75F, -0.45F, -2.9F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, -0.75F, -0.45F, -1.9F); // Box 297
		bodyModel[41].setRotationPoint(-33.5F, 1.5F, -10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 298
		bodyModel[42].setRotationPoint(-33.5F, 2.8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		bodyModel[43].setRotationPoint(-33.5F, 2.8F, 1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 300
		bodyModel[44].setRotationPoint(-33.5F, 2.8F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.7F, -1F, -0.9F, -0.7F, -1F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.85F); // Box 305
		bodyModel[45].setRotationPoint(-32.5F, -18F, 3.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, 0.5F, 0F, -1.85F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F); // Box 306
		bodyModel[46].setRotationPoint(-32.5F, -18F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 307
		bodyModel[47].setRotationPoint(-32.5F, -18F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.132F); // Box 308
		bodyModel[48].setRotationPoint(26.5F, -5.5F, 8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 309
		bodyModel[49].setRotationPoint(26.5F, 2.5F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F,0F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 314
		bodyModel[50].setRotationPoint(31.5F, -16F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, -0.25F, -2F, -0.5F, -0.25F, -2F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 315
		bodyModel[51].setRotationPoint(31.5F, -16F, 0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.75F, 0F, 0F, -0.75F); // Box 316
		bodyModel[52].setRotationPoint(31.5F, -18F, 3.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -0.25F, -1.25F, -0.9F, -0.25F, -1.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
		bodyModel[53].setRotationPoint(31.5F, -18F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.7F, -1F, -0.9F, -0.7F, -1F, -0.9F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 318
		bodyModel[54].setRotationPoint(31.5F, -18F, -9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 319
		bodyModel[55].setRotationPoint(26.5F, 2.5F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 320
		bodyModel[56].setRotationPoint(33F, -15.5F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 321
		bodyModel[57].setRotationPoint(33F, -5.5F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332l
		bodyModel[58].setRotationPoint(-7.5F, -16.4F, 4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // lamp
		bodyModel[59].setRotationPoint(-7.5F, -15.4F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[60].setRotationPoint(-7.5F, -16.4F, -5.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F,0F, 0F, -1.1F, 0.5F, 0F, -1.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.1F, 0.5F, -0.25F, -1.1F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 360
		bodyModel[61].setRotationPoint(-33F, -16F, 1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 387
		bodyModel[62].setRotationPoint(-31.5F, -16F, -8.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 388
		bodyModel[63].setRotationPoint(-26.5F, -5.5F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[64].setRotationPoint(-7.5F, 3.5F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 395
		bodyModel[65].setRotationPoint(-2F, -20.5F, -7F);

		bodyModel[66].addBox(0F, 0F, 0F, 16, 3, 12, 0F); // Box 396
		bodyModel[66].setRotationPoint(-18.5F, -20F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 406
		bodyModel[67].setRotationPoint(-34F, -9.5F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 407
		bodyModel[68].setRotationPoint(-34F, -9.5F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // lamp
		bodyModel[69].setRotationPoint(-7.5F, -0.5F, 6.5F);

		bodyModel[70].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[70].setRotationPoint(4F, -0.800000000000001F, 4.5F);
		bodyModel[70].rotateAngleX = -0.06981317F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[71].setRotationPoint(-7.5F, -1.5F, 4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[72].setRotationPoint(-7.5F, -5.5F, 7.5F);

		bodyModel[73].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[73].setRotationPoint(-7.5F, -0.800000000000001F, 4.5F);
		bodyModel[73].rotateAngleX = -0.06981317F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[74].setRotationPoint(4.25F, -12.5F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[75].setRotationPoint(4.25F, -3.5F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[76].setRotationPoint(4.25F, -15F, 4F);

		bodyModel[77].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // lamp
		bodyModel[77].setRotationPoint(-7.5F, -0.5F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // lamp
		bodyModel[78].setRotationPoint(-7.5F, -1.5F, -8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[79].setRotationPoint(4F, -3.6F, -7.7F);
		bodyModel[79].rotateAngleX = 0.06981317F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[80].setRotationPoint(-7.5F, -5.5F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[81].setRotationPoint(-7.5F, -3.6F, -7.7F);
		bodyModel[81].rotateAngleX = 0.06981317F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219l
		bodyModel[82].setRotationPoint(5F, -16.4F, 4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[83].setRotationPoint(5F, -16.4F, -5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 47, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 221
		bodyModel[84].setRotationPoint(-20.5F, -5.5F, -9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 231
		bodyModel[85].setRotationPoint(30.5F, -16F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 235
		bodyModel[86].setRotationPoint(31.5F, -16F, -2.5F);

		bodyModel[87].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[87].setRotationPoint(-2F, -0.800000000000001F, 4.5F);
		bodyModel[87].rotateAngleX = -0.06981317F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[88].setRotationPoint(-7.25F, -3.5F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[89].setRotationPoint(-7.25F, -12.5F, 4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[90].setRotationPoint(-7.25F, -15F, 4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[91].setRotationPoint(4.25F, -3.5F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[92].setRotationPoint(4.25F, -12.5F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[93].setRotationPoint(-7.25F, -3.5F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[94].setRotationPoint(-7.25F, -12.5F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[95].setRotationPoint(-7.25F, -15F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[96].setRotationPoint(4.25F, -15F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[97].setRotationPoint(-22.5F, -5.5F, -8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // lamp
		bodyModel[98].setRotationPoint(-22.49F, -15F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[99].setRotationPoint(3.5F, -5.5F, -8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // lamp
		bodyModel[100].setRotationPoint(3.51F, -15F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[101].setRotationPoint(16F, -5.5F, -8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // lamp
		bodyModel[102].setRotationPoint(16.01F, -15F, -8F);

		bodyModel[103].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[103].setRotationPoint(-2F, -0.6F, -7.5F);
		bodyModel[103].rotateAngleX = 0.06981317F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // lamp
		bodyModel[104].setRotationPoint(5F, -15.4F, -5F);

		bodyModel[105].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // lamp
		bodyModel[105].setRotationPoint(19F, -0.5F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[106].setRotationPoint(19F, -1.5F, 4.5F);

		bodyModel[107].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[107].setRotationPoint(19F, -0.800000000000001F, 4.5F);
		bodyModel[107].rotateAngleX = -0.06981317F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[108].setRotationPoint(19F, -5.5F, 7.5F);

		bodyModel[109].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[109].setRotationPoint(24.5F, -0.800000000000001F, 4.5F);
		bodyModel[109].rotateAngleX = -0.06981317F;

		bodyModel[110].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[110].setRotationPoint(30.5F, -0.800000000000001F, 4.5F);
		bodyModel[110].rotateAngleX = -0.06981317F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[111].setRotationPoint(30.75F, -3.5F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[112].setRotationPoint(30.75F, -12.5F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[113].setRotationPoint(19.25F, -3.5F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[114].setRotationPoint(19.25F, -12.5F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[115].setRotationPoint(19.25F, -15F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // lamp
		bodyModel[116].setRotationPoint(30.75F, -15F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // lamp
		bodyModel[117].setRotationPoint(19F, -1.5F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268l
		bodyModel[118].setRotationPoint(30.5F, -3.6F, -7.7F);
		bodyModel[118].rotateAngleX = 0.06981317F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[119].setRotationPoint(30.75F, -3.5F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[120].setRotationPoint(30.75F, -12.5F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[121].setRotationPoint(30.75F, -15F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // lamp
		bodyModel[122].setRotationPoint(31F, -15.4F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[123].setRotationPoint(31F, -16.4F, -5.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[124].setRotationPoint(31F, -16.4F, 4.5F);

		bodyModel[125].addShapeBox(0F, -3F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[125].setRotationPoint(24.5F, -0.6F, -7.5F);
		bodyModel[125].rotateAngleX = 0.05235988F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[126].setRotationPoint(19F, -3.6F, -7.7F);
		bodyModel[126].rotateAngleX = 0.06981317F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[127].setRotationPoint(19F, -5.5F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[128].setRotationPoint(19.25F, -3.5F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[129].setRotationPoint(19.25F, -12.5F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[130].setRotationPoint(19.25F, -15F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281l
		bodyModel[131].setRotationPoint(18.5F, -16.4F, -5.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // lamp
		bodyModel[132].setRotationPoint(18.5F, -15.4F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[133].setRotationPoint(18.5F, -16.4F, 4.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 12, 3, 2, 0F); // lamp
		bodyModel[134].setRotationPoint(19F, -0.5F, -8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[135].setRotationPoint(-16.25F, 6.5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		bodyModel[136].setRotationPoint(-28.75F, 6.5F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		bodyModel[137].setRotationPoint(-23.5F, 6F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		bodyModel[138].setRotationPoint(-21.5F, 6F, -5F);

		bodyModel[139].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		bodyModel[139].setRotationPoint(-18.5F, 6F, 3F);

		bodyModel[140].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
		bodyModel[140].setRotationPoint(-26.5F, 6F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[141].setRotationPoint(-32.5F, 4.5F, 5.5F);

		bodyModel[142].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 44
		bodyModel[142].setRotationPoint(-27.5F, 6F, 2F);

		bodyModel[143].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
		bodyModel[143].setRotationPoint(-17.5F, 6F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 46
		bodyModel[144].setRotationPoint(-32.5F, 7.5F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 47
		bodyModel[145].setRotationPoint(-32.5F, 7.5F, -6.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[146].setRotationPoint(-32.5F, 4.5F, -6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 54
		bodyModel[147].setRotationPoint(-31.5F, 4F, -7F);

		bodyModel[148].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 57
		bodyModel[148].setRotationPoint(-28.75F, 6.5F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[149].setRotationPoint(-2.5F, 3.5F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[150].setRotationPoint(8F, 3.5F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 51, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // Box 368
		bodyModel[151].setRotationPoint(-20.5F, -16F, -8.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[152].setRotationPoint(16F, -5.5F, 7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // lamp
		bodyModel[153].setRotationPoint(16.01F, -15F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // lamp
		bodyModel[154].setRotationPoint(3.51F, -15F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[155].setRotationPoint(3.5F, -5.5F, 7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // lamp
		bodyModel[156].setRotationPoint(-9.99F, -15F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[157].setRotationPoint(-10F, -5.5F, 7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[158].setRotationPoint(-22.5F, -5.5F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // lamp
		bodyModel[159].setRotationPoint(-22.49F, -15F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // lamp
		bodyModel[160].setRotationPoint(-31.5F, -17F, 5.75F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -1.75F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0.5F, -1F, -0.25F, -1F, -1F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 401
		bodyModel[161].setRotationPoint(33F, -16F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 2l
		bodyModel[162].setRotationPoint(-33.2F, 1.5F, -5.3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 223
		bodyModel[163].setRotationPoint(-33.2F, 0.4F, -6.1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 83
		bodyModel[164].setRotationPoint(-33.2F, 0.4F, -4.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		bodyModel[165].setRotationPoint(-33.2F, 0.35F, -7.2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 413
		bodyModel[166].setRotationPoint(-33.2F, 2.55F, -7.2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 4
		bodyModel[167].setRotationPoint(-33.2F, 1.5F, -6.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 415
		bodyModel[168].setRotationPoint(-33.2F, 0.4F, -7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 424
		bodyModel[169].setRotationPoint(-33.1F, 1.42F, -6.8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[170].setRotationPoint(28.5F, 4.5F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 426
		bodyModel[171].setRotationPoint(34.5F, 5.5F, -1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 466
		bodyModel[172].setRotationPoint(29F, 6.25F, 1.4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		bodyModel[173].setRotationPoint(31F, 7.25F, 1.4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		bodyModel[174].setRotationPoint(31F, 7.25F, -1.4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 469
		bodyModel[175].setRotationPoint(29F, 6.25F, -1.4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 470
		bodyModel[176].setRotationPoint(34F, 6.25F, 1.4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 473
		bodyModel[177].setRotationPoint(34F, 6.25F, -1.4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		bodyModel[178].setRotationPoint(-33F, 7.25F, 1.9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 288
		bodyModel[179].setRotationPoint(-35F, 6.25F, -1.9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F); // Box 289
		bodyModel[180].setRotationPoint(-35F, 6.25F, 1.9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		bodyModel[181].setRotationPoint(-33F, 7.25F, -1.9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 291
		bodyModel[182].setRotationPoint(-30F, 6.25F, -1.9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0F, 0F); // Box 292
		bodyModel[183].setRotationPoint(-30F, 6.25F, 1.9F);

		bodyModel[184].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 293
		bodyModel[184].setRotationPoint(16.5F, 6F, 2F);

		bodyModel[185].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 294
		bodyModel[185].setRotationPoint(17.5F, 6F, -2F);

		bodyModel[186].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 308
		bodyModel[186].setRotationPoint(25.5F, 6F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 309
		bodyModel[187].setRotationPoint(22.5F, 6F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		bodyModel[188].setRotationPoint(20.5F, 6F, -5F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 311
		bodyModel[189].setRotationPoint(20.5F, 4F, -1.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 326
		bodyModel[190].setRotationPoint(15.25F, 6.5F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 329
		bodyModel[191].setRotationPoint(27.75F, 6.5F, -6F);

		bodyModel[192].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 333
		bodyModel[192].setRotationPoint(26.5F, 6F, -2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[193].setRotationPoint(-7.5F, 3.5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[194].setRotationPoint(-2.5F, 3.5F, -7.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[195].setRotationPoint(8F, 3.5F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp 1l
		bodyModel[196].setRotationPoint(-33.2F, 1.5F, 4.2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.65F, 0F, 0.2F, 1.65F); // Box 339
		bodyModel[197].setRotationPoint(-33.1F, 1.42F, 4.2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 340
		bodyModel[198].setRotationPoint(-33.2F, 0.4F, 4.9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 341
		bodyModel[199].setRotationPoint(-33.2F, 0.35F, 3.8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.95F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.6F, -0.25F); // Box 342
		bodyModel[200].setRotationPoint(-33.2F, 0.4F, 3.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.05F, 0F, -0.8F, -0.05F); // Box 343
		bodyModel[201].setRotationPoint(-33.2F, 2.55F, 3.8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Lamp3
		bodyModel[202].setRotationPoint(-33.2F, 1.5F, 5.7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.95F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.85F, -0.5F); // Box 345
		bodyModel[203].setRotationPoint(-33.2F, 0.4F, 6.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -9F, 0F, -0.3F, -9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, -9F, 0F); // Box 332
		bodyModel[204].setRotationPoint(-33F, -10.5F, 8.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F,-9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, -9F, -9.25F, 0F); // Box 333
		bodyModel[205].setRotationPoint(-33F, -10F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173l
		bodyModel[206].setRotationPoint(24.5F, -4.6F, -7.05F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[207].setRotationPoint(24.75F, -3.6F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[208].setRotationPoint(-2F, -4.6F, -7.05F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // lamp
		bodyModel[209].setRotationPoint(-1.75F, -3.6F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[210].setRotationPoint(-2F, -4.6F, -7.05F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[211].setRotationPoint(-2F, -4.6F, -7.05F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[212].setRotationPoint(-2F, -4.6F, -7.05F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[213].setRotationPoint(-7.5F, -4.6F, -7.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[214].setRotationPoint(4F, -4.6F, -7.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[215].setRotationPoint(19F, -4.6F, -7.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[216].setRotationPoint(30.5F, -4.6F, -7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[217].setRotationPoint(-1.75F, -3.6F, 4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[218].setRotationPoint(-2F, -4.6F, 3.95F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[219].setRotationPoint(24.5F, -4.6F, 3.95F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // lamp
		bodyModel[220].setRotationPoint(24.75F, -3.6F, 4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[221].setRotationPoint(30.5F, -4.6F, 4.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[222].setRotationPoint(19F, -4.6F, 4.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[223].setRotationPoint(4F, -4.6F, 4.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[224].setRotationPoint(-7.5F, -4.6F, 4.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,-0.6F, 0F, -1.95F, 0F, 0F, -0.85F, 0F, 0F, 0.5F, -0.6F, 0F, 1.2F, -0.6F, -0.25F, -1.2F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0.5F); // Box 353
		bodyModel[225].setRotationPoint(-33.51F, -16F, -9.55F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.6F, -0.25F, -1.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0.5F, -0.55F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.555F, 0F, 0.75F); // Box 354
		bodyModel[226].setRotationPoint(-33.51F, -5.5F, -9.55F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 7, 20, 0F,0F, -0.25F, -1F, -0.5F, -0.25F, -2F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, -1.15F, -0.5F, -0.25F, -2.3F, -0.5F, -0.25F, -1.3F, 0F, 0F, -0.15F); // Box 310
		bodyModel[227].setRotationPoint(31.5F, -5.5F, -10.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, -1.15F, -0.5F, 0.25F, -2.3F, -0.5F, 0.25F, -1.3F, 0F, 0F, -0.15F, 0F, 0F, -2.25F, -0.85F, -0.25F, -3F, -0.85F, -0.25F, -2F, 0F, 0F, -1.25F); // Box 311
		bodyModel[228].setRotationPoint(31.5F, 1.5F, -10.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[229].setRotationPoint(-12.5F, 3.5F, -8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[230].setRotationPoint(-12.5F, 3.5F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 47, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 357l
		bodyModel[231].setRotationPoint(-20.5F, -5.5F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 51, 10, 1, 0F,0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // lamp
		bodyModel[232].setRotationPoint(-20.5F, -15F, -8.25F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 47, 8, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 221
		bodyModel[233].setRotationPoint(-20.5F, -5.5F, 8.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 52, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 368
		bodyModel[234].setRotationPoint(-20.5F, -16F, 7.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 47, 8, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 357l
		bodyModel[235].setRotationPoint(-20.5F, -5.5F, 8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 52, 10, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // lamp
		bodyModel[236].setRotationPoint(-20.5F, -15F, 7.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // lamp
		bodyModel[237].setRotationPoint(31.45F, -17F, -9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // lamp
		bodyModel[238].setRotationPoint(31.45F, -17F, -3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // lamp
		bodyModel[239].setRotationPoint(31.45F, -17F, 3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F); // lamp
		bodyModel[240].setRotationPoint(31.45F, -5.5F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 62, 1, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // lamp
		bodyModel[241].setRotationPoint(-30.5F, -17.25F, -4.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 54, 1, 17, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F); // lamp
		bodyModel[242].setRotationPoint(-22F, 2.45F, -8.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F,0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[243].setRotationPoint(-22.5F, -5.5F, -9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // lamp
		bodyModel[244].setRotationPoint(-22.5F, -15F, -9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[245].setRotationPoint(-22.5F, -17F, -9F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
		bodyModel[246].setRotationPoint(-17.5F, 4F, 7F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 14
		bodyModel[247].setRotationPoint(-29.5F, 4F, 7F);

		bodyModel[248].addShapeBox(0F, -1F, 0F, 5, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[248].setRotationPoint(-24.5F, 5.5F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 28
		bodyModel[249].setRotationPoint(-16.75F, 6.5F, 7.2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F); // Box 35
		bodyModel[250].setRotationPoint(-23.5F, 3.5F, -7.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[251].setRotationPoint(-29.5F, 6.5F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[252].setRotationPoint(-15.5F, 6.5F, 7F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 45
		bodyModel[253].setRotationPoint(-29.5F, 4F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[254].setRotationPoint(-26.5F, 4F, -8F);

		bodyModel[255].addShapeBox(0F, -1F, 0F, 5, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[255].setRotationPoint(-24.5F, 5.5F, -8F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 49
		bodyModel[256].setRotationPoint(-17.5F, 4F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[257].setRotationPoint(-20.5F, 3.5F, 8F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
		bodyModel[258].setRotationPoint(-24.5F, 3.5F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
		bodyModel[259].setRotationPoint(-23.5F, 5.5F, 8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
		bodyModel[260].setRotationPoint(-23.5F, 5.5F, -9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[261].setRotationPoint(-20.5F, 5.75F, -8.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
		bodyModel[262].setRotationPoint(-24.5F, 5.75F, 7.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
		bodyModel[263].setRotationPoint(-23F, 4.5F, -8.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[264].setRotationPoint(-26.5F, 4F, 7F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
		bodyModel[265].setRotationPoint(-23F, 4.5F, 6.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 44
		bodyModel[266].setRotationPoint(-19.5F, 4F, 7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 45
		bodyModel[267].setRotationPoint(-19.5F, 4F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[268].setRotationPoint(-18.75F, 6.5F, 7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 59
		bodyModel[269].setRotationPoint(-29.25F, 6.5F, 7.2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[270].setRotationPoint(-27.25F, 6.5F, 7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 61
		bodyModel[271].setRotationPoint(-16.75F, 6.5F, -8.2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[272].setRotationPoint(-18.75F, 6.5F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[273].setRotationPoint(-27.25F, 6.5F, -8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 64
		bodyModel[274].setRotationPoint(-29.25F, 6.5F, -8.2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[275].setRotationPoint(-15.5F, 6.5F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[276].setRotationPoint(-29.5F, 6.5F, -8F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 289
		bodyModel[277].setRotationPoint(14.5F, 4F, 6.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[278].setRotationPoint(14.5F, 6.5F, 6.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 291
		bodyModel[279].setRotationPoint(14.75F, 6.5F, 6.7F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[280].setRotationPoint(16.75F, 6.5F, 6.5F);

		bodyModel[281].addShapeBox(0F, -1F, 0F, 5, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[281].setRotationPoint(19.5F, 5.5F, 6.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[282].setRotationPoint(19.5F, 5.75F, 7.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 297
		bodyModel[283].setRotationPoint(20.5F, 5.5F, 8F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 298
		bodyModel[284].setRotationPoint(23.5F, 3.5F, 8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F); // Box 299
		bodyModel[285].setRotationPoint(20.5F, 3.5F, -7.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 300
		bodyModel[286].setRotationPoint(21F, 4.5F, 6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 301
		bodyModel[287].setRotationPoint(24.5F, 4F, 6.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[288].setRotationPoint(17.5F, 4F, 6.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 303
		bodyModel[289].setRotationPoint(25.25F, 6.5F, 6.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 304
		bodyModel[290].setRotationPoint(27.25F, 6.5F, 6.7F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 305
		bodyModel[291].setRotationPoint(26.5F, 4F, 6.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[292].setRotationPoint(28.5F, 6.5F, 6.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 312
		bodyModel[293].setRotationPoint(21F, 4.5F, -8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 315
		bodyModel[294].setRotationPoint(24.5F, 4F, -7.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 316
		bodyModel[295].setRotationPoint(25.25F, 6.5F, -7.5F);

		bodyModel[296].addShapeBox(0F, -1F, 0F, 5, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[296].setRotationPoint(19.5F, 5.5F, -7.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[297].setRotationPoint(23.5F, 5.75F, -8.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 319
		bodyModel[298].setRotationPoint(20.5F, 5.5F, -9F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 320
		bodyModel[299].setRotationPoint(19.5F, 3.5F, -9F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 321
		bodyModel[300].setRotationPoint(14.5F, 4F, -7.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[301].setRotationPoint(17.5F, 4F, -7.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[302].setRotationPoint(16.75F, 6.5F, -7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		bodyModel[303].setRotationPoint(14.75F, 6.5F, -7.7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 327
		bodyModel[304].setRotationPoint(27.25F, 6.5F, -7.7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[305].setRotationPoint(28.5F, 6.5F, -7.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 330
		bodyModel[306].setRotationPoint(26.5F, 4F, -7.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[307].setRotationPoint(14.5F, 6.5F, -7.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.132F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.695F, 0F, 0F, -0.15F); // Box 332
		bodyModel[308].setRotationPoint(26.5F, 1.5F, 8.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.132F, 0F, 0F, -0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.5F); // Box 333
		bodyModel[309].setRotationPoint(-31.5F, 1.5F, 8.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.132F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.695F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 334
		bodyModel[310].setRotationPoint(26.5F, 1.5F, -9.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.85F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[311].setRotationPoint(26.5F, 2.5F, -8.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.132F, 0F, 0F, -0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 336
		bodyModel[312].setRotationPoint(26.5F, -5.5F, -9.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[313].setRotationPoint(-31.5F, 2.5F, -8.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.132F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 338
		bodyModel[314].setRotationPoint(-31.5F, 1.5F, -9.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.132F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 339
		bodyModel[315].setRotationPoint(-31.5F, -5.5F, -9.5F);

		bodyModel[316].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 336
		bodyModel[316].setRotationPoint(-28.75F, 6.5F, 6F);

		bodyModel[317].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 337
		bodyModel[317].setRotationPoint(-16.25F, 6.5F, 6F);

		bodyModel[318].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 338
		bodyModel[318].setRotationPoint(-16.25F, 6.5F, -6F);

		bodyModel[319].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 339
		bodyModel[319].setRotationPoint(27.75F, 6.5F, 6F);

		bodyModel[320].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 340
		bodyModel[320].setRotationPoint(27.75F, 6.5F, -6F);

		bodyModel[321].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 341
		bodyModel[321].setRotationPoint(15.25F, 6.5F, -6F);

		bodyModel[322].addBox(-2.5F, -2.5F, 0F, 6, 6, 0, 0F); // Box 342
		bodyModel[322].setRotationPoint(15.25F, 6.5F, 6F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[323].setRotationPoint(-31.5F, 4F, 6F);

		bodyModel[324].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 405
		bodyModel[324].setRotationPoint(7.5F, -20F, -6F);

		bodyModel[325].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 331
		bodyModel[325].setRotationPoint(18.5F, -20F, -6F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 326; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")){
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