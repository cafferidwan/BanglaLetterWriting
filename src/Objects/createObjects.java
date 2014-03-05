package Objects;

import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.color.Color;
import Animation.MonkeyTutorial;
import Duster.Duster;
import Letters.LetterStructureA;
import Letters.LetterStructureAkar;
import Letters.LetterStructureBo;
import Letters.LetterStructureCho;
import Letters.LetterStructureDo;
import Letters.LetterStructureDoh;
import Letters.LetterStructureEkar;
import Letters.LetterStructureGo;
import Letters.LetterStructureHo;
import Letters.LetterStructureKho;
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

public class createObjects 
{
	
	public static void createObject()
	{
		GameActivity.backGround = new Sprite(0, 0, GameActivity.mbackGroundTextureRegion,
				GameActivity.vertexBufferObjectManager);
		GameActivity.backGround.setHeight(GameActivity.CAMERA_HEIGHT);
		GameActivity.backGround.setWidth(GameActivity.CAMERA_WIDTH);
		GameActivity.mScene.attachChild(GameActivity.backGround);
		
		
		GameActivity.blackBoard = new Sprite(GameActivity.moOutLineX - 100, GameActivity.moOutLineY -170,
				GameActivity.mBlackBoardTextureRegion, GameActivity.vertexBufferObjectManager);
		GameActivity.blackBoard.setHeight((float) (GameActivity.blackBoard.getHeight() * 1.5));
		GameActivity.blackBoard.setWidth((float) (GameActivity.blackBoard.getWidth() * 1.2));
		GameActivity.mScene.attachChild(GameActivity.blackBoard);
		

		//Rectangle for drawing during tutorial
		GameActivity.rectangle = new Rectangle(10, 10, 40, 40, GameActivity.vertexBufferObjectManager);
		GameActivity.mScene.attachChild(GameActivity.rectangle);
		GameActivity.rectangle.setVisible(false);
		
		//invisible rectangle for better collision detection
		GameActivity.rect = new Rectangle(0, 0, 40, 40, GameActivity.vertexBufferObjectManager);
		GameActivity.mScene.attachChild(GameActivity.rect);
		GameActivity.rect.setColor(Color.RED);
		GameActivity.rect.setVisible(false);
		
		//MonkeyTutorial Create
		MonkeyTutorial.monkeyTutorialCreate();
		
		Duster.createDuster();
		
		//Outline of letter Mo
		if(GameActivity.letter == 1)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX, GameActivity.moOutLineY,
					GameActivity.mMoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
//			MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 30,
					GameActivity.moOutLineY - 30,
					GameActivity.moOutLineX + 180,
					GameActivity.moOutLineY - 30,
					
					GameActivity.moOutLineX+10, GameActivity.moOutLineY-15, 
					GameActivity.moOutLineX+80, GameActivity.moOutLineY+70,
					GameActivity.moOutLineX+70, GameActivity.moOutLineY+120,
					GameActivity.moOutLineX+30, GameActivity.moOutLineY+140,
					GameActivity.moOutLineX, 	GameActivity.moOutLineY+110,
					GameActivity.moOutLineX+20, GameActivity.moOutLineY+80,
					GameActivity.moOutLineX+90, GameActivity.moOutLineY+90,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY+160,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					
					GameActivity.moOutLineX+150, GameActivity.moOutLineY,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY
					);
			
//			LetterStructureMo.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Aa
		else if(GameActivity.letter == 2)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-200, GameActivity.moOutLineY-180,
					GameActivity.mAaOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.5);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(4,
					GameActivity.moOutLineX - 20,
					GameActivity.moOutLineY - 20,
					GameActivity.moOutLineX + 220,
					GameActivity.moOutLineY - 20,
			
					//Edit From Here
					GameActivity.moOutLineX+41, GameActivity.moOutLineY+56, 
					GameActivity.moOutLineX+73, GameActivity.moOutLineY+18,
					GameActivity.moOutLineX+107, GameActivity.moOutLineY+51,
					GameActivity.moOutLineX+100, GameActivity.moOutLineY+119,
					GameActivity.moOutLineX+54, GameActivity.moOutLineY+134,
					GameActivity.moOutLineX-8, GameActivity.moOutLineY+99,
					GameActivity.moOutLineX-38, GameActivity.moOutLineY+13,
					GameActivity.moOutLineX-38, GameActivity.moOutLineY+13,
					GameActivity.moOutLineX-38, GameActivity.moOutLineY+13,
					
					GameActivity.moOutLineX+104, GameActivity.moOutLineY+110, 
					GameActivity.moOutLineX+159, GameActivity.moOutLineY+183,
					GameActivity.moOutLineX+159, GameActivity.moOutLineY-12,
					GameActivity.moOutLineX+163, GameActivity.moOutLineY-12,
					
					GameActivity.moOutLineX+224, GameActivity.moOutLineY-8, 
					GameActivity.moOutLineX+224, GameActivity.moOutLineY+185
					);
		}
		//Outline of letter e
		else if(GameActivity.letter == 3)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mEOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.8);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 9,
					GameActivity.moOutLineY + 3,
					GameActivity.moOutLineX + 165,
					GameActivity.moOutLineY + 3,
					
					GameActivity.moOutLineX+50, GameActivity.moOutLineY+65, 
					GameActivity.moOutLineX+91, GameActivity.moOutLineY+40,
					GameActivity.moOutLineX+118, GameActivity.moOutLineY+54,
					GameActivity.moOutLineX+123, GameActivity.moOutLineY+105,
					GameActivity.moOutLineX+54, GameActivity.moOutLineY+134,
					GameActivity.moOutLineX+45, GameActivity.moOutLineY+140,
					GameActivity.moOutLineX+107, GameActivity.moOutLineY+167,
					GameActivity.moOutLineX+155, GameActivity.moOutLineY+205,
					GameActivity.moOutLineX+155, GameActivity.moOutLineY+205,
					
					GameActivity.moOutLineX+134, GameActivity.moOutLineY-3, 
					GameActivity.moOutLineX+104, GameActivity.moOutLineY-40,
					GameActivity.moOutLineX+19, GameActivity.moOutLineY-39,
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
					
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70
					); 
			 
		}
		//Outline of letter raw
		else if(GameActivity.letter == 4)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mRawOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 23,
					GameActivity.moOutLineY - 48,
					GameActivity.moOutLineX + 186,
					GameActivity.moOutLineY -48,
					
					GameActivity.moOutLineX+138, GameActivity.moOutLineY-10, 
					GameActivity.moOutLineX+15, GameActivity.moOutLineY+53,
					GameActivity.moOutLineX+41, GameActivity.moOutLineY+81,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY+158,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					
					GameActivity.moOutLineX+58, GameActivity.moOutLineY+159, 
					GameActivity.moOutLineX+58, GameActivity.moOutLineY+159, 
					GameActivity.moOutLineX+63, GameActivity.moOutLineY+159, 
					GameActivity.moOutLineX+63, GameActivity.moOutLineY+159, 
					
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70
					); 
			
//			LetterStructureRaw.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Ko
		else if(GameActivity.letter == 5)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mKoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 23,
					GameActivity.moOutLineY - 48,
					GameActivity.moOutLineX + 190,
					GameActivity.moOutLineY -48,
					
					GameActivity.moOutLineX+138, GameActivity.moOutLineY-10, 
					GameActivity.moOutLineX+15, GameActivity.moOutLineY+53,
					GameActivity.moOutLineX+41, GameActivity.moOutLineY+81,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY+158,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					
					GameActivity.moOutLineX+159, GameActivity.moOutLineY-8, 
					GameActivity.moOutLineX+220, GameActivity.moOutLineY+21, 
					GameActivity.moOutLineX+238, GameActivity.moOutLineY+88, 
					GameActivity.moOutLineX+190, GameActivity.moOutLineY+98, 
					
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70
					); 
			
//			LetterStructureRaw.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Bo
		else if(GameActivity.letter == 6)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mBoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 23,
					GameActivity.moOutLineY - 48,
					GameActivity.moOutLineX + 190,
					GameActivity.moOutLineY -48,
					
					GameActivity.moOutLineX+138, GameActivity.moOutLineY-10, 
					GameActivity.moOutLineX+15, GameActivity.moOutLineY+53,
					GameActivity.moOutLineX+41, GameActivity.moOutLineY+81,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY+158,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+145, GameActivity.moOutLineY-25,
					
					GameActivity.moOutLineX+159, GameActivity.moOutLineY-8, 
					GameActivity.moOutLineX+220, GameActivity.moOutLineY+21, 
					GameActivity.moOutLineX+238, GameActivity.moOutLineY+88, 
					GameActivity.moOutLineX+190, GameActivity.moOutLineY+98, 
					
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
					GameActivity.moOutLineX+1, GameActivity.moOutLineY-70
					); 
			
//			LetterStructureBo.createNumberSpriteAndCursor();
		}
		//Outline of letter TalibaSha
		else if(GameActivity.letter == 7)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mTalibaShaOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
				GameActivity.OutLine.setScale((float)0.9);
				GameActivity.mScene.attachChild(GameActivity.OutLine);
					
				//MonkeyTutorial start 
				MonkeyTutorial.monkeyTutorialstart(3,
						GameActivity.moOutLineX - 33,
						GameActivity.moOutLineY - 25,
						GameActivity.moOutLineX + 50,
						GameActivity.moOutLineY -19,

						GameActivity.moOutLineX + 50,GameActivity.moOutLineY -19,
						GameActivity.moOutLineX+13, GameActivity.moOutLineY+74, 
						GameActivity.moOutLineX+57, GameActivity.moOutLineY+21,
						GameActivity.moOutLineX+90, GameActivity.moOutLineY+78,
						GameActivity.moOutLineX+65, GameActivity.moOutLineY+1,
						GameActivity.moOutLineX+114, GameActivity.moOutLineY-22,
						GameActivity.moOutLineX+168, GameActivity.moOutLineY+26,
						GameActivity.moOutLineX+168, GameActivity.moOutLineY-25,
						GameActivity.moOutLineX+168, GameActivity.moOutLineY+200, 
						
						GameActivity.moOutLineX+168, GameActivity.moOutLineY-25, 
						GameActivity.moOutLineX+187, GameActivity.moOutLineY-25, 
						GameActivity.moOutLineX+187, GameActivity.moOutLineY-25,
						GameActivity.moOutLineX+187, GameActivity.moOutLineY-25,
						
						GameActivity.moOutLineX+1, GameActivity.moOutLineY-70,
						GameActivity.moOutLineX+1, GameActivity.moOutLineY-70
						); 
					
//				LetterStructureTalibaSha.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Lo
		else if(GameActivity.letter == 8)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-60,
					GameActivity.mLoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
				GameActivity.OutLine.setScale((float)0.9);
				GameActivity.mScene.attachChild(GameActivity.OutLine);
					
				//MonkeyTutorial start 
				MonkeyTutorial.monkeyTutorialstart(3,
						GameActivity.moOutLineX - 33,
						GameActivity.moOutLineY - 25,
						GameActivity.moOutLineX + 190,
						GameActivity.moOutLineY -25,
						
						GameActivity.moOutLineX+59,GameActivity.moOutLineY+91,
						GameActivity.moOutLineX+25, GameActivity.moOutLineY+122, 
						GameActivity.moOutLineX-6, GameActivity.moOutLineY+79,
						GameActivity.moOutLineX+34, GameActivity.moOutLineY+20,
						GameActivity.moOutLineX+92, GameActivity.moOutLineY+46,
						GameActivity.moOutLineX+125, GameActivity.moOutLineY+21,
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+41,
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+41,
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+41, 
						
						GameActivity.moOutLineX+164, GameActivity.moOutLineY-25, 
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+147, 
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+203,
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+203,
						
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+203,
						GameActivity.moOutLineX+164, GameActivity.moOutLineY+203
						); 
					
//				LetterStructureLo.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Po
		else if(GameActivity.letter == 9)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mPoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
				GameActivity.OutLine.setScale((float)0.9);
				GameActivity.mScene.attachChild(GameActivity.OutLine);
					
				//MonkeyTutorial start 
				MonkeyTutorial.monkeyTutorialstart(4,
						GameActivity.moOutLineX - 20,
						GameActivity.moOutLineY + 47, 
						GameActivity.moOutLineX + 31,
						GameActivity.moOutLineY + 59,
						
						GameActivity.moOutLineX+31,GameActivity.moOutLineY+59,
						GameActivity.moOutLineX+46, GameActivity.moOutLineY+84, 
						GameActivity.moOutLineX+26, GameActivity.moOutLineY+114,
						GameActivity.moOutLineX+67, GameActivity.moOutLineY+68,
						GameActivity.moOutLineX+92, GameActivity.moOutLineY+46,
						GameActivity.moOutLineX+114, GameActivity.moOutLineY+23,
						GameActivity.moOutLineX+114, GameActivity.moOutLineY+23,
						GameActivity.moOutLineX+114, GameActivity.moOutLineY+23,
						GameActivity.moOutLineX+114, GameActivity.moOutLineY+23, 
						
						GameActivity.moOutLineX-20, GameActivity.moOutLineY+47, 
						GameActivity.moOutLineX+52, GameActivity.moOutLineY-11, 
						GameActivity.moOutLineX+152, GameActivity.moOutLineY+64,
						GameActivity.moOutLineX+152, GameActivity.moOutLineY+64,
						
						GameActivity.moOutLineX+159, GameActivity.moOutLineY-46,
						GameActivity.moOutLineX+159, GameActivity.moOutLineY+207
						);
					
				
//				LetterStructurePo.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Go
		else if(GameActivity.letter == 10)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mGoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
				GameActivity.OutLine.setScale((float)0.9);
				GameActivity.mScene.attachChild(GameActivity.OutLine);
					
				//MonkeyTutorial start 
				MonkeyTutorial.monkeyTutorialstart(4,
						GameActivity.moOutLineX + 25,
						GameActivity.moOutLineY + 136,
						GameActivity.moOutLineX + 75,
						GameActivity.moOutLineY + 55,

						GameActivity.moOutLineX+75, GameActivity.moOutLineY+55,
						GameActivity.moOutLineX-18, GameActivity.moOutLineY+52, 
						GameActivity.moOutLineX+4, GameActivity.moOutLineY+1,
						GameActivity.moOutLineX+40, GameActivity.moOutLineY-15,
						GameActivity.moOutLineX+65, GameActivity.moOutLineY-15,
						GameActivity.moOutLineX+93, GameActivity.moOutLineY-2,
						GameActivity.moOutLineX+136, GameActivity.moOutLineY+66,
						GameActivity.moOutLineX+136, GameActivity.moOutLineY+66,
						GameActivity.moOutLineX+136, GameActivity.moOutLineY+66, 
						
						GameActivity.moOutLineX+142, GameActivity.moOutLineY-48, 
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208, 
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208,
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208,
						
						GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
						GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
						); 
					
//				LetterStructureGo.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Ho
		else if(GameActivity.letter == 11)
		{
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-110,
					GameActivity.mHoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
				GameActivity.OutLine.setScale((float)0.8);
				GameActivity.mScene.attachChild(GameActivity.OutLine);
					
				//MonkeyTutorial start 
				MonkeyTutorial.monkeyTutorialstart(2,
						GameActivity.moOutLineX - 7,
						GameActivity.moOutLineY - 20,
						GameActivity.moOutLineX + 168,
						GameActivity.moOutLineY - 20,

						GameActivity.moOutLineX+51, GameActivity.moOutLineY+37,
						GameActivity.moOutLineX+75, GameActivity.moOutLineY+11, 
						GameActivity.moOutLineX+111, GameActivity.moOutLineY+19,
						GameActivity.moOutLineX+130, GameActivity.moOutLineY+45,
						GameActivity.moOutLineX+111, GameActivity.moOutLineY+89,
						GameActivity.moOutLineX+73, GameActivity.moOutLineY+99,
						GameActivity.moOutLineX+38, GameActivity.moOutLineY+98,
						GameActivity.moOutLineX+91, GameActivity.moOutLineY+127,
						GameActivity.moOutLineX+158, GameActivity.moOutLineY+178, 
						
						//no need
						GameActivity.moOutLineX+142, GameActivity.moOutLineY-48, 
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208, 
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208,
						GameActivity.moOutLineX+142, GameActivity.moOutLineY+208,
						
						GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
						GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
						); 
					
				
//				LetterStructureHo.createNumberSpriteAndCursor(); 
		}
		//Outline of letter Kho
		else if(GameActivity.letter == 12)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-80,
					GameActivity.mKhoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 11,
					GameActivity.moOutLineY - 5,
					GameActivity.moOutLineX + 23,
					GameActivity.moOutLineY + 15,

					GameActivity.moOutLineX+23, GameActivity.moOutLineY+15,
					GameActivity.moOutLineX+72, GameActivity.moOutLineY-11,
					GameActivity.moOutLineX+100, GameActivity.moOutLineY+26, 
					GameActivity.moOutLineX+68, GameActivity.moOutLineY+68,
					GameActivity.moOutLineX+20, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+83, GameActivity.moOutLineY+116,
					GameActivity.moOutLineX+126, GameActivity.moOutLineY+155,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY+193,
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-52, 
					
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+175, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+175, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+175, GameActivity.moOutLineY-20,
					
					//no need
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureKho.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Cho
		else if(GameActivity.letter == 13)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mChoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 16,
					GameActivity.moOutLineY - 28,
					GameActivity.moOutLineX + 191,
					GameActivity.moOutLineY - 28,

					GameActivity.moOutLineX+39, GameActivity.moOutLineY-26,
					GameActivity.moOutLineX+39, GameActivity.moOutLineY+161,
					GameActivity.moOutLineX+65, GameActivity.moOutLineY+185, 
					GameActivity.moOutLineX+124, GameActivity.moOutLineY+155,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+75,
					GameActivity.moOutLineX+74, GameActivity.moOutLineY+37,
					GameActivity.moOutLineX+39, GameActivity.moOutLineY-26,
					GameActivity.moOutLineX+39, GameActivity.moOutLineY-26,
					GameActivity.moOutLineX+39, GameActivity.moOutLineY-26, 
					
					//no need
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			 
//			LetterStructureCho.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter No
		else if(GameActivity.letter == 14)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mNoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 16,
					GameActivity.moOutLineY - 40,
					GameActivity.moOutLineX + 191,
					GameActivity.moOutLineY - 40,

					GameActivity.moOutLineX+41, GameActivity.moOutLineY+100,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+70,
					GameActivity.moOutLineX+50, GameActivity.moOutLineY+40, 
					GameActivity.moOutLineX+94, GameActivity.moOutLineY+43,
					GameActivity.moOutLineX+131, GameActivity.moOutLineY+81,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+131,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+198,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY-40,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY-40, 
					
					//no need
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20, 
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureNo.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter A
		else if(GameActivity.letter == 15)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mAOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX + 104,
					GameActivity.moOutLineY + 72,
					GameActivity.moOutLineX + 73,
					GameActivity.moOutLineY + 67,

					GameActivity.moOutLineX+73, GameActivity.moOutLineY+67,
					GameActivity.moOutLineX+90, GameActivity.moOutLineY+3,
					GameActivity.moOutLineX+138, GameActivity.moOutLineY-26, 
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-15,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY+170,
					GameActivity.moOutLineX+144, GameActivity.moOutLineY+141,
					GameActivity.moOutLineX+87, GameActivity.moOutLineY+134,
					GameActivity.moOutLineX+12, GameActivity.moOutLineY+123,
					GameActivity.moOutLineX, GameActivity.moOutLineY+40, 
					
					//no need
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			
//			LetterStructureA.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Do
		else if(GameActivity.letter == 16)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mDoOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 33,
					GameActivity.moOutLineY - 25,
					GameActivity.moOutLineX + 204,
					GameActivity.moOutLineY - 25,

					GameActivity.moOutLineX+80, GameActivity.moOutLineY-25,
					GameActivity.moOutLineX+80, GameActivity.moOutLineY+93,
					GameActivity.moOutLineX+125, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+48, 
					GameActivity.moOutLineX+182, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+175, 
					GameActivity.moOutLineX+87, GameActivity.moOutLineY+181,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+128,
					GameActivity.moOutLineX-5, GameActivity.moOutLineY+19, 
					
					//no need
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			
//			LetterStructureDo.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter U
		else if(GameActivity.letter == 17)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mUOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 33,
					GameActivity.moOutLineY + 15,
					GameActivity.moOutLineX + 204,
					GameActivity.moOutLineY + 15,

					GameActivity.moOutLineX+80, GameActivity.moOutLineY+15,
					GameActivity.moOutLineX+80, GameActivity.moOutLineY+133,
					GameActivity.moOutLineX+125, GameActivity.moOutLineY+135,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+88, 
					GameActivity.moOutLineX+182, GameActivity.moOutLineY+135,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+215, 
					GameActivity.moOutLineX+87, GameActivity.moOutLineY+221,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+168,
					GameActivity.moOutLineX-5, GameActivity.moOutLineY+59, 
					
					GameActivity.moOutLineX+146, GameActivity.moOutLineY+6,
					GameActivity.moOutLineX+139, GameActivity.moOutLineY-40,
					GameActivity.moOutLineX+14, GameActivity.moOutLineY-50,
					GameActivity.moOutLineX, GameActivity.moOutLineY-82,
					
					//no need
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			
//			LetterStructureU.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter To
		else if(GameActivity.letter == 18)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-100,
					GameActivity.mToOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 

			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 33,
					GameActivity.moOutLineY - 15,
					GameActivity.moOutLineX + 204,
					GameActivity.moOutLineY - 15,

					GameActivity.moOutLineX+94, GameActivity.moOutLineY+85,
					GameActivity.moOutLineX+94, GameActivity.moOutLineY+44,
					GameActivity.moOutLineX+125, GameActivity.moOutLineY+40,
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+48, 
					GameActivity.moOutLineX+188, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY+175, 
					GameActivity.moOutLineX+87, GameActivity.moOutLineY+181,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+128,
					GameActivity.moOutLineX-5, GameActivity.moOutLineY+19, 
					
					//no need
					GameActivity.moOutLineX+150, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureTo.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Toh
		else if(GameActivity.letter == 19)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-100,
					GameActivity.mTohOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 20,
					GameActivity.moOutLineY +5,
					GameActivity.moOutLineX + 200,
					GameActivity.moOutLineY +5,

					GameActivity.moOutLineX+34, GameActivity.moOutLineY+5,
					GameActivity.moOutLineX+34, GameActivity.moOutLineY+187,
					GameActivity.moOutLineX+80, GameActivity.moOutLineY+208,
					GameActivity.moOutLineX+128, GameActivity.moOutLineY+181, 
					GameActivity.moOutLineX+160, GameActivity.moOutLineY+134,
					GameActivity.moOutLineX+138, GameActivity.moOutLineY+80, 
					GameActivity.moOutLineX+115, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+115, GameActivity.moOutLineY+95,
					GameActivity.moOutLineX+115, GameActivity.moOutLineY+95, 
					
					GameActivity.moOutLineX+152, GameActivity.moOutLineY-4,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY-55,
					GameActivity.moOutLineX+24, GameActivity.moOutLineY-68,
					GameActivity.moOutLineX-1, GameActivity.moOutLineY-99,
					
					//no need
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureToh.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Doh
		else if(GameActivity.letter == 20)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mDohOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX - 20,
					GameActivity.moOutLineY -35,
					GameActivity.moOutLineX + 204,
					GameActivity.moOutLineY -35,

					GameActivity.moOutLineX+20, GameActivity.moOutLineY-35,
					GameActivity.moOutLineX+20, GameActivity.moOutLineY+86,
					GameActivity.moOutLineX+35, GameActivity.moOutLineY+114,
					GameActivity.moOutLineX+110, GameActivity.moOutLineY+45, 
					GameActivity.moOutLineX+140, GameActivity.moOutLineY+26,
					GameActivity.moOutLineX+158, GameActivity.moOutLineY+50, 
					GameActivity.moOutLineX+139, GameActivity.moOutLineY+115,
					GameActivity.moOutLineX+140, GameActivity.moOutLineY+190,
					GameActivity.moOutLineX+140, GameActivity.moOutLineY+190,
					
					//no need
					GameActivity.moOutLineX+152, GameActivity.moOutLineY-4,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY-55,
					GameActivity.moOutLineX+24, GameActivity.moOutLineY-68,
					GameActivity.moOutLineX-1, GameActivity.moOutLineY-99,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			
//			LetterStructureDoh.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Ukar
		else if(GameActivity.letter == 21)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mUkarOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScale((float)0.9);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX + 100, 
					GameActivity.moOutLineY - 17,
					GameActivity.moOutLineX + 104,
					GameActivity.moOutLineY + 87,

					GameActivity.moOutLineX+104, GameActivity.moOutLineY+87,
					GameActivity.moOutLineX+34, GameActivity.moOutLineY+132,
					GameActivity.moOutLineX-26, GameActivity.moOutLineY+103,
					GameActivity.moOutLineX-28, GameActivity.moOutLineY+64, 
					GameActivity.moOutLineX+21, GameActivity.moOutLineY+40,
					GameActivity.moOutLineX+84, GameActivity.moOutLineY+63, 
					GameActivity.moOutLineX+139, GameActivity.moOutLineY+98,
					GameActivity.moOutLineX+201, GameActivity.moOutLineY+174,
					GameActivity.moOutLineX+201, GameActivity.moOutLineY+174,
					
					//no need
					GameActivity.moOutLineX+152, GameActivity.moOutLineY-4,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY-55,
					GameActivity.moOutLineX+24, GameActivity.moOutLineY-68,
					GameActivity.moOutLineX-1, GameActivity.moOutLineY-99,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
			
//			LetterStructureUkar.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Ekar
		else if(GameActivity.letter == 22)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mEkarOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScaleX((float)0.8);
			GameActivity.OutLine.setScaleY((float)0.7);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(3,
					GameActivity.moOutLineX - 32, 
					GameActivity.moOutLineY + 31,
					GameActivity.moOutLineX + 66,
					GameActivity.moOutLineY + 31,

					GameActivity.moOutLineX+25, GameActivity.moOutLineY+31,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201,
					GameActivity.moOutLineX+25, GameActivity.moOutLineY+201, 
					
					//no need
					GameActivity.moOutLineX+15, GameActivity.moOutLineY+25,
					GameActivity.moOutLineX+14, GameActivity.moOutLineY-19,
					GameActivity.moOutLineX+81, GameActivity.moOutLineY-46,
					GameActivity.moOutLineX+195, GameActivity.moOutLineY-13,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureEkar.createNumberSpriteAndCursor(); 
			
		}
		//Outline of letter Akar
		else if(GameActivity.letter == 23)
		{
			
			GameActivity.OutLine = new Sprite(GameActivity.moOutLineX-70, GameActivity.moOutLineY-70,
					GameActivity.mAkarOutLineTextureRegion, GameActivity.vertexBufferObjectManager);
			GameActivity.OutLine.setScaleX((float)0.8);
			GameActivity.OutLine.setScaleY((float)0.7);
			GameActivity.mScene.attachChild(GameActivity.OutLine);
			 
			//MonkeyTutorial start 
			MonkeyTutorial.monkeyTutorialstart(2,
					GameActivity.moOutLineX + 1, 
					GameActivity.moOutLineY - 8,
					GameActivity.moOutLineX + 148,
					GameActivity.moOutLineY - 8,

					GameActivity.moOutLineX+114, GameActivity.moOutLineY+1,
					GameActivity.moOutLineX+67, GameActivity.moOutLineY+51,
					GameActivity.moOutLineX+57, GameActivity.moOutLineY+106,
					GameActivity.moOutLineX+77, GameActivity.moOutLineY+156,
					GameActivity.moOutLineX+140, GameActivity.moOutLineY+165,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY+155,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY+155,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY+155,
					GameActivity.moOutLineX+135, GameActivity.moOutLineY+155, 
					
					//no need
					GameActivity.moOutLineX+15, GameActivity.moOutLineY+25,
					GameActivity.moOutLineX+14, GameActivity.moOutLineY-19,
					GameActivity.moOutLineX+81, GameActivity.moOutLineY-46,
					GameActivity.moOutLineX+195, GameActivity.moOutLineY-13,
					
					GameActivity.moOutLineX+142, GameActivity.moOutLineY-20,
					GameActivity.moOutLineX+165, GameActivity.moOutLineY-20
					); 
			
//			LetterStructureAkar.createNumberSpriteAndCursor(); 
			
		}
	}
	
}
