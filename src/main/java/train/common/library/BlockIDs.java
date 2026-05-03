/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.items.*;
import train.common.items.slabs.*;
import train.common.wellcar.ItemFortyFootContainer;

public enum BlockIDs {

	signal(false, null),
	
	//book(true, ItemBlockBook.class),

	stopper(false, null),
	embeddedStopper(false, null),
	americanstopper(false, null),


	oreTC(true, ItemBlockOreTC.class),
	dirtyBallast(false,null),
	dirtierBallast(false,null),
	highSpeedBallast(false, null),
	poweredGravel(false,null),
	snowGravel(false,null),
	asphalt(false, null),

	ballastSlab(true, ItemBallastSlab.class),
	ballastDoubleSlab(true, ItemBallastSlab.class),
	dirtyBallastSlab(true, ItemDirtyBallastSlab.class),
	dirtyBallastDoubleSlab(true, ItemDirtyBallastSlab.class),
	dirtierBallastSlab(true, ItemDirtierBallastSlab.class),
	dirtierBallastDoubleSlab(true, ItemDirtierBallastSlab.class),
	highSpeedBallastSlab(true, ItemHighSpeedBallastSlab.class),
	highSpeedBallastDoubleSlab(true, ItemHighSpeedBallastSlab.class),
	snowGravelSlab(true, ItemSnowGravelSlab.class),
	snowGravelDoubleSlab(true, ItemSnowGravelSlab.class),
	asphaltSlab(true, ItemAsphaltSlab.class),
	asphaltDoubleSlab(true, ItemAsphaltSlab.class),

	ballastStairs(false, null),
	dirtyBallastStairs(false, null),
	dirtierBallastStairs(false, null),
	highSpeedBallastStairs(false, null),
	snowGravelStairs(false, null),
	asphaltStairs(false, null),

	waterWheel(true, ItemBlockGeneratorWaterWheel.class),
	windMill(true, ItemBlockGeneratorWindMill.class),
	generatorDiesel(true, ItemBlockGeneratorDiesel.class),
	mtcTransmitterSpeed(false, null),
	mtcTransmitterMTC(false, null),
	mtcATOStopTransmitter(false, null),
	mtcReceiverMTC(false, null),
	mtcReceiverDestination(false, null),
	pdmInstructionBlock(false, null),
	//Liquids
	diesel(false, ItemBlockFluid.class),
	refinedFuel(false, ItemBlockFluid.class),
	
	tcRailGag(false,null),
	tcRail(false,null),

	MILWSwitchStand(false, null),
	autoSwtichStand(false, null),
	owoSwitchStand(true,ItemBlockOWOSwitchStand.class),
	circleSwitchStand(false,null),
	owoYardSwitchStand(true,ItemBlockOWOYardSwitch.class),
	overheadWire(false,null),
	overheadWireDouble(false,null),
	signalSpanish(false,null),//ItemsignalSpanish.class
	kSignal(false,null),
	metroMadridPole(false, null),
	FortyFootContainer(true, ItemFortyFootContainer.class),
	speedSign(false, null),
	BR_Modern_Buffer(true, ItemBR_Modern_Buffer.class),
	BR_2_Aspect_Signal(true, ItemBR_2_Aspect_Signal.class),
	BR_3_Aspect_Signal(true, ItemBR_3_Aspect_Signal.class),
	BR_4_Aspect_Signal(true, ItemBR_4_Aspect_Signal.class),
	BR_UK_SpeedSign(true, ItemBR_UK_SpeedSign.class),
	BR_UK_SpeedSign_Left(true, ItemBR_UK_SpeedSign_Left.class),
	BR_UK_SpeedSign_Right(true, ItemBR_UK_SpeedSign_Right.class),
	BR_UK_SpeedSign_ETCS(true, ItemBR_UK_SpeedSign_ETCS.class),
	BR_UK_SpeedSign_DoubleLeft(true, ItemBR_UK_SpeedSign_DoubleLeft.class),
	BR_UK_SpeedSign_DoubleRight(true, ItemBR_UK_SpeedSign_DoubleRight.class),
	BR_UK_SpeedSign_EPS(true, ItemBR_UK_SpeedSign_EPS.class),
	BR_UK_SpeedSign_Cutout(true, ItemBR_UK_SpeedSign_Cutout.class),
	BR_UK_SpeedSign_CutoutLeft(true, ItemBR_UK_SpeedSign_CutoutLeft.class),
	BR_UK_SpeedSign_CutoutRight(true, ItemBR_UK_SpeedSign_CutoutRight.class),
	Platform_Slab_Diagonal_Left(true, ItemPlatform_Slab_Diagonal_Left.class),
	Platform_Slab_Diagonal_Right(true, ItemPlatform_Slab_Diagonal_Right.class),
	Platform_Slab_Diagonal_End(true, ItemPlatform_Slab_Diagonal_End.class),
	Platform_Slab_End_Left(true, ItemPlatform_Slab_End_Left.class),
	Platform_Slab_End_Right(true, ItemPlatform_Slab_End_Right.class),
	Platform_Slab_10x10_Outside(true, ItemPlatform_Slab_10x10_Outside.class),
	EmbeddedBR_Modern_Buffer(true, ItemEmbeddedBR_Modern_Buffer.class),
	BR_UK_Whistleboard(true, ItemBR_UK_Whistleboard.class),
	Tram_Platform_Fenced(true, ItemTram_Platform_Fenced.class),



	;

	public Block block;
	public boolean hasItemBlock;
	public Class itemBlockClass;

	BlockIDs(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass) {
		this.hasItemBlock = hasItemBlock;
		this.itemBlockClass = itemBlockClass;
	}
}
