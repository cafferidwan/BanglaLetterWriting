package com.example.banglaletterwriting;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.LoopEntityModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.RotationModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.IModifier;

import Letters.LetterStructureA;
import Letters.LetterStructureAa;
import Letters.LetterStructureAkar;
import Letters.LetterStructureBo;
import Letters.LetterStructureCho;
import Letters.LetterStructureDo;
import Letters.LetterStructureDoh;
import Letters.LetterStructureE;
import Letters.LetterStructureEkar;
import Letters.LetterStructureGo;
import Letters.LetterStructureHo;
import Letters.LetterStructureKho;
import Letters.LetterStructureKo;
import Letters.LetterStructureLo;
import Letters.LetterStructureMo;
import Letters.LetterStructureNo;
import Letters.LetterStructurePo;
import Letters.LetterStructureRaw;
import Letters.LetterStructureTalibaSha;
import Letters.LetterStructureTo;
import Letters.LetterStructureToh;
import Letters.LetterStructureU;
import Letters.LetterStructureUkar;

import com.example.banglaletterwriting.GameActivity;

public class StructureDrawAnimation 
{
	//scale animation for number sprite and setting the structure of the letter
	public static void scale(float x, float y, int c)
	{
			
			if(c<=GameActivity.spriteCounterLimit)
			{
			
				GameActivity.numberSprites[GameActivity.spriteCounter] = new Sprite(x, y, 
						GameActivity.mTextureRegionNumber[GameActivity.spriteCounter], GameActivity.vertexBufferObjectManager);
				
				GameActivity.numberSprites[GameActivity.spriteCounter].setScale((float)0.1);
				GameActivity.numberSprites[GameActivity.spriteCounter].setZIndex(0);
				GameActivity.mScene.attachChild(GameActivity.numberSprites[GameActivity.spriteCounter]);
				GameActivity.mScene.registerTouchArea(GameActivity.numberSprites[GameActivity.spriteCounter]);
		
				ScaleModifier scaleModifier = new ScaleModifier((float) 0.05, 0.1f, 0.25f);
				LoopEntityModifier loopRotateMod = new LoopEntityModifier( new RotationModifier(4, 0, 360));
				DelayModifier delayMod = new DelayModifier((float) 0.01, new IEntityModifierListener()
				{ 

						@Override
						public void onModifierStarted(IModifier<IEntity> arg0,
								IEntity arg1)
						{
							GameActivity.isActionMoving =false;
						}

						@Override
						public void onModifierFinished(IModifier<IEntity> arg0,
								IEntity arg1)
						{
							GameActivity.isActionMoving = true;
							//For letter Mo
							if(GameActivity.letter == 1)
							{
								LetterStructureMo.Structure();
							}
							//For letter Aa
							else if(GameActivity.letter == 2)
							{
								LetterStructureAa.Structure();
							}
							//For letter E
							else if(GameActivity.letter == 3)
							{
								LetterStructureE.Structure();
							}
							//For letter Raw
							else if(GameActivity.letter == 4)
							{
								LetterStructureRaw.Structure();
							}
							//For letter Ko
							else if(GameActivity.letter == 5)
							{
								LetterStructureKo.Structure();
							}
							//For letter Bo
							else if(GameActivity.letter == 6)
							{
								LetterStructureBo.Structure();
							}
							//For letter TalibaSha
							else if(GameActivity.letter == 7)
							{
								LetterStructureTalibaSha.Structure();
							}
							//For letter Lo
							else if(GameActivity.letter == 8)
							{
								LetterStructureLo.Structure();
							}
							//For letter Po
							else if(GameActivity.letter == 9)
							{
								LetterStructurePo.Structure();
							}
							//For letter Go
							else if(GameActivity.letter == 10)
							{
								LetterStructureGo.Structure();
							}
							//For letter Ho
							else if(GameActivity.letter == 11)
							{
								LetterStructureHo.Structure();
							}
							//For letter Kho
							else if(GameActivity.letter == 12)
							{
								LetterStructureKho.Structure();
							}
							//For letter Cho
							else if(GameActivity.letter == 13)
							{
								LetterStructureCho.Structure();
							}
							//For letter No
							else if(GameActivity.letter == 14)
							{
								LetterStructureNo.Structure();
							}
							//For letter A
							else if(GameActivity.letter == 15)
							{
								LetterStructureA.Structure();
							}
							//For letter Do
							else if(GameActivity.letter == 16)
							{
								LetterStructureDo.Structure();
							}
							//For letter U
							else if(GameActivity.letter == 17)
							{
								LetterStructureU.Structure();
							}
							//For letter To
							else if(GameActivity.letter == 18)
							{
								LetterStructureTo.Structure();
							}
							//For letter Toh
							else if(GameActivity.letter == 19)
							{
								LetterStructureToh.Structure();
							}
							//For letter Doh
							else if(GameActivity.letter == 20)
							{
								LetterStructureDoh.Structure();
							}
							//For letter Ukar
							else if(GameActivity.letter == 21)
							{
								LetterStructureUkar.Structure();
							}
							//For letter Ekar
							else if(GameActivity.letter == 22)
							{
								LetterStructureEkar.Structure();
							}
							//For letter Akar
							else if(GameActivity.letter == 23)
							{
								LetterStructureAkar.Structure();
							}
							
						}
					});
			
				SequenceEntityModifier sequenceMod = new SequenceEntityModifier(scaleModifier,delayMod, loopRotateMod);
				GameActivity.numberSprites[GameActivity.spriteCounter].registerEntityModifier(sequenceMod);
			}
			else
			{

			}
	}

	
	//shake animation
	public static void shake(int a, final Sprite sp, float x)
	{
		if(a<5) 
		{
		
		GameActivity.isShaking = true;
		MoveModifier moveMod = new MoveModifier((float)0.08, sp.getX(), sp.getX()+x, sp.getY(), sp.getY());
		DelayModifier delayMod = new DelayModifier((float) 0.01 , new IEntityModifierListener()
		{

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						//sp.setVisible(true);
						
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						GameActivity.shakeCounter++;
						sp.setPosition(sp.getX()-20, sp.getY());
						shake(GameActivity.shakeCounter,sp, 20);
					} 
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(moveMod, delayMod);
		sp.registerEntityModifier(sequenceMod);
		}
		else if(a==5)
		{
			sp.setPosition(sp.getX()+10, sp.getY());
			GameActivity.shakeCounter=0;
			GameActivity.isShaking = false;
		}
	}
	
	//Drawing with touch when in the right range
	public static void Draw(float x, float y)
	{
		GameActivity.aCounter++;
		GameActivity.whiteChalk[GameActivity.aCounter] = new Sprite(x -25, y-30, 
				GameActivity.mWhiteChalkTextureRegion, GameActivity.vertexBufferObjectManager);
//		MainActivity.whiteChalk[MainActivity.aCounter].setZIndex(1);
		GameActivity.mScene.attachChild(GameActivity.whiteChalk[GameActivity.aCounter]);
		GameActivity.whiteChalk[GameActivity.aCounter].setScale((float) 0.5);
		//MainActivity.mScene.sortChildren();
		//Debug.d("I:"+MainActivity.aCounter); 
	}
}
