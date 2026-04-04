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

public class ModelClass17bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelClass17bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 53
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 125
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 66
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		bodyModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 55
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 56
		bodyModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 69
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 70
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 71
		bodyModel[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 72
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 73
		bodyModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 74
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 75
		bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 76
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 77
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 78
		bodyModel[40] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 80
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 81
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 82
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 85
		bodyModel[82] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 92
		bodyModel[90] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 114

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 1
		bodyModel[0].setRotationPoint(5.5F, 6.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[1].setRotationPoint(-9F, 4F, 6F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 51
		bodyModel[2].setRotationPoint(-6.5F, 6.5F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[3].setRotationPoint(3F, 4F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[4].setRotationPoint(-9F, 4F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[5].setRotationPoint(3F, 4F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 53
		bodyModel[6].setRotationPoint(-7F, 6F, -9.25F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[7].setRotationPoint(-1.5F, 7.5F, -8.8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[8].setRotationPoint(1.5F, 7.5F, -8.8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F); // Box 36
		bodyModel[9].setRotationPoint(-4.25F, 5.5F, -9.1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F); // Box 39
		bodyModel[10].setRotationPoint(-4.5F, 7.5F, -8.8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[11].setRotationPoint(-7F, 4.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 41
		bodyModel[12].setRotationPoint(5F, 6F, -9.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[13].setRotationPoint(5F, 4.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[14].setRotationPoint(-10F, 3.5F, -8.8F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 48
		bodyModel[15].setRotationPoint(9F, 5.5F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[16].setRotationPoint(-5F, 2F, -8.8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[17].setRotationPoint(-10F, 2F, -8.8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[18].setRotationPoint(5F, 2F, -8.8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 52
		bodyModel[19].setRotationPoint(-10.5F, 7.25F, -8.75F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 53
		bodyModel[20].setRotationPoint(-10F, 5.5F, -8.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[21].setRotationPoint(-1F, 5.5F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[22].setRotationPoint(-0.5F, 5.5F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[23].setRotationPoint(-11.5F, 3.5F, -9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 58
		bodyModel[24].setRotationPoint(-11F, 5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.5F, 0F); // Box 59
		bodyModel[25].setRotationPoint(-10.75F, 9F, -7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 60
		bodyModel[26].setRotationPoint(10F, 5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 1F); // Box 61
		bodyModel[27].setRotationPoint(8.75F, 9F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		bodyModel[28].setRotationPoint(6.5F, 7.25F, -8.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[29].setRotationPoint(-3F, 4.5F, -9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[30].setRotationPoint(-5F, 7.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 70
		bodyModel[31].setRotationPoint(-8F, 7.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[32].setRotationPoint(-5F, 4.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[33].setRotationPoint(-8F, 4.5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 73
		bodyModel[34].setRotationPoint(-10F, 3.5F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[35].setRotationPoint(2F, 4.5F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[36].setRotationPoint(2F, 7.25F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[37].setRotationPoint(-3F, 7.25F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 77
		bodyModel[38].setRotationPoint(-3F, 5.5F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 78
		bodyModel[39].setRotationPoint(8.5F, 3.5F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F); // Box 79
		bodyModel[40].setRotationPoint(3.25F, 5.5F, -9.1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 80
		bodyModel[41].setRotationPoint(4F, 7.5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[42].setRotationPoint(4F, 4.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[43].setRotationPoint(7F, 7.5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[44].setRotationPoint(7F, 4.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 47
		bodyModel[45].setRotationPoint(-7F, 6F, 7.25F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 48
		bodyModel[46].setRotationPoint(-1.5F, 7.5F, 7.8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(1.5F, 7.5F, 7.8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F); // Box 50
		bodyModel[48].setRotationPoint(-4.25F, 5.5F, 8.1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F); // Box 51
		bodyModel[49].setRotationPoint(-4.5F, 7.5F, 7.8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[50].setRotationPoint(-7F, 4.5F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 53
		bodyModel[51].setRotationPoint(5F, 6F, 7.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(5F, 4.5F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[53].setRotationPoint(-10F, 3.5F, 7.8F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 56
		bodyModel[54].setRotationPoint(9F, 5.5F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-5F, 2F, 7.8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[56].setRotationPoint(-10F, 2F, 7.8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(5F, 2F, 7.8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 60
		bodyModel[58].setRotationPoint(-10.5F, 7.25F, 7.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 61
		bodyModel[59].setRotationPoint(-10F, 5.5F, 7.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[60].setRotationPoint(-0.5F, 5.5F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 63
		bodyModel[61].setRotationPoint(-11.5F, 3.5F, 7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 64
		bodyModel[62].setRotationPoint(-11F, 5F, 8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.5F, 0F); // Box 65
		bodyModel[63].setRotationPoint(-10.75F, 9F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 66
		bodyModel[64].setRotationPoint(10F, 5F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1F); // Box 67
		bodyModel[65].setRotationPoint(8.75F, 9F, 7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 68
		bodyModel[66].setRotationPoint(6.5F, 7.25F, 7.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[67].setRotationPoint(-3F, 4.5F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[68].setRotationPoint(-5F, 7.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(-8F, 7.5F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(-5F, 4.5F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[71].setRotationPoint(-8F, 4.5F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[72].setRotationPoint(2F, 4.5F, 8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 76
		bodyModel[73].setRotationPoint(2F, 7.25F, 8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[74].setRotationPoint(-3F, 7.25F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 79
		bodyModel[75].setRotationPoint(8.5F, 3.5F, 7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F); // Box 80
		bodyModel[76].setRotationPoint(3.25F, 5.5F, 8.1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[77].setRotationPoint(4F, 7.5F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(4F, 4.5F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[79].setRotationPoint(7F, 7.5F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[80].setRotationPoint(7F, 4.5F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[81].setRotationPoint(-8F, 2.5F, -5.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 86
		bodyModel[82].setRotationPoint(9F, 3.5F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(-2F, 1.5F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[84].setRotationPoint(5F, 5.8F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[85].setRotationPoint(-7F, 5.8F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[86].setRotationPoint(-7F, 5.8F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[87].setRotationPoint(5F, 5.8F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 91
		bodyModel[88].setRotationPoint(-3F, 5.5F, 8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 92
		bodyModel[89].setRotationPoint(2F, 5.5F, -9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 93
		bodyModel[90].setRotationPoint(2F, 5.5F, 8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[91].setRotationPoint(5F, 2.5F, 8.8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 92
		bodyModel[92].setRotationPoint(4F, 2.5F, 8.8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 114
		bodyModel[93].setRotationPoint(9F, 3.5F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 115
		bodyModel[94].setRotationPoint(9F, 4F, 9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[95].setRotationPoint(9F, 4.5F, 9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[96].setRotationPoint(9F, 3.5F, 8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[97].setRotationPoint(-11F, 4F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 98
		bodyModel[98].setRotationPoint(-11F, 3.5F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(-11F, 4.5F, -10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(-11F, 3.5F, -9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[101].setRotationPoint(-7F, 2.5F, -9.8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 102
		bodyModel[102].setRotationPoint(-5F, 2.5F, -9.8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[103].setRotationPoint(-11F, 4F, 9.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 104
		bodyModel[104].setRotationPoint(-11F, 3.5F, 9.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 105
		bodyModel[105].setRotationPoint(-11F, 4.5F, 9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-11F, 3.5F, 8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[107].setRotationPoint(-7F, 2.5F, 8.8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 108
		bodyModel[108].setRotationPoint(-5F, 2.5F, 8.8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[109].setRotationPoint(9F, 4F, -10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[110].setRotationPoint(9F, 3.5F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[111].setRotationPoint(9F, 4.5F, -10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[112].setRotationPoint(9F, 3.5F, -9.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[113].setRotationPoint(5F, 2.5F, -9.8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 114
		bodyModel[114].setRotationPoint(4F, 2.5F, -9.8F);
	}
}