//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.08.2024 - 19:15:23
// Last changed on: 24.08.2024 - 19:15:23

package train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class Model4CorNonPoweredBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Model4CorNonPoweredBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[53];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1206
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1207
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1208
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1209
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1210
		bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1211
		bodyModel[6] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1212
		bodyModel[7] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1213
		bodyModel[8] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1214
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1216
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1217
		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1218
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1219
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 1220
		bodyModel[14] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1221
		bodyModel[15] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1222
		bodyModel[16] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1223
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 1224
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1225
		bodyModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1226
		bodyModel[20] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1227
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 1228
		bodyModel[22] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1229
		bodyModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1230
		bodyModel[24] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 1231
		bodyModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1232
		bodyModel[26] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 1233
		bodyModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 1238
		bodyModel[28] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1239
		bodyModel[29] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1240
		bodyModel[30] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 1241
		bodyModel[31] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1242
		bodyModel[32] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1243
		bodyModel[33] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1244
		bodyModel[34] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1245
		bodyModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1246
		bodyModel[36] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 1247
		bodyModel[37] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1248
		bodyModel[38] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1249
		bodyModel[39] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1250
		bodyModel[40] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1251
		bodyModel[41] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 64

		bodyModel[0].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1206
		bodyModel[0].setRotationPoint(4F, 2F, -5.51F);
		bodyModel[0].rotateAngleY = -0.01745329F;

		bodyModel[1].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1207
		bodyModel[1].setRotationPoint(-12F, 2F, -5.51F);
		bodyModel[1].rotateAngleY = -0.01745329F;

		bodyModel[2].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 1208
		bodyModel[2].setRotationPoint(-9F, 7.5F, -8.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1209
		bodyModel[3].setRotationPoint(-9F, 6.5F, -8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 1210
		bodyModel[4].setRotationPoint(-9F, 5F, -9.25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1211
		bodyModel[5].setRotationPoint(-8.5F, 4.25F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1212
		bodyModel[6].setRotationPoint(-9.5F, 3.75F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 1213
		bodyModel[7].setRotationPoint(-12.5F, 3.5F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 1214
		bodyModel[8].setRotationPoint(-6.5F, 3.5F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1216
		bodyModel[9].setRotationPoint(-12F, 3.75F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 4, 16, 0F); // Box 1217
		bodyModel[10].setRotationPoint(-3F, 3F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 1218
		bodyModel[11].setRotationPoint(7F, 5F, -9.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1219
		bodyModel[12].setRotationPoint(7.5F, 4.25F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1220
		bodyModel[13].setRotationPoint(7F, 6.5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 1221
		bodyModel[14].setRotationPoint(9.5F, 3.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1222
		bodyModel[15].setRotationPoint(6.5F, 3.75F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 1223
		bodyModel[16].setRotationPoint(3.5F, 3.5F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1224
		bodyModel[17].setRotationPoint(-12F, 2.75F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 1225
		bodyModel[18].setRotationPoint(12F, 2.75F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 1226
		bodyModel[19].setRotationPoint(-13F, 2.75F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 1227
		bodyModel[20].setRotationPoint(-8.5F, 5.5F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 24, 4, 10, 0F); // Box 1228
		bodyModel[21].setRotationPoint(-12F, 4.25F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 1229
		bodyModel[22].setRotationPoint(7.5F, 5.5F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1230
		bodyModel[23].setRotationPoint(4F, 2F, 5.51F);
		bodyModel[23].rotateAngleY = -0.01745329F;

		bodyModel[24].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 1231
		bodyModel[24].setRotationPoint(-9F, 7.5F, 7.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 1232
		bodyModel[25].setRotationPoint(-12F, 2F, 5.51F);
		bodyModel[25].rotateAngleY = -0.01745329F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 1233
		bodyModel[26].setRotationPoint(-5F, 1F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1238
		bodyModel[27].setRotationPoint(-12F, 3.75F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 1239
		bodyModel[28].setRotationPoint(-9F, 5F, 7.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1240
		bodyModel[29].setRotationPoint(-9F, 6.5F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1241
		bodyModel[30].setRotationPoint(7F, 6.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 1242
		bodyModel[31].setRotationPoint(7F, 5F, 7.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 1243
		bodyModel[32].setRotationPoint(7.5F, 4.25F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1244
		bodyModel[33].setRotationPoint(6.5F, 3.75F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 1245
		bodyModel[34].setRotationPoint(3.5F, 3.5F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 1246
		bodyModel[35].setRotationPoint(9.5F, 3.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1247
		bodyModel[36].setRotationPoint(-12F, 2.75F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 1248
		bodyModel[37].setRotationPoint(-6.5F, 3.5F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1249
		bodyModel[38].setRotationPoint(-9.5F, 3.75F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 1250
		bodyModel[39].setRotationPoint(-12.5F, 3.5F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 1251
		bodyModel[40].setRotationPoint(-8.5F, 4.25F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[41].setRotationPoint(-12.5F, 3F, -9.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[42].setRotationPoint(-4.5F, 3F, -9.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[43].setRotationPoint(11.5F, 3F, -9.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[44].setRotationPoint(3.5F, 3F, -9.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[45].setRotationPoint(-12.5F, 3F, 8.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[46].setRotationPoint(11.5F, 3F, 8.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[47].setRotationPoint(-3.5F, 4.5F, -9.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[48].setRotationPoint(-2F, 5.5F, -9.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[49].setRotationPoint(-4.5F, 3F, 8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[50].setRotationPoint(3.5F, 3F, 8.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(-3.5F, 4.5F, 8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		bodyModel[52].setRotationPoint(-2F, 5.5F, 8.75F);
	}
}