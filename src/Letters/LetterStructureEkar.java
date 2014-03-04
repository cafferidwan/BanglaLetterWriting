package Letters;

import org.andengine.entity.sprite.AnimatedSprite;
import Duster.Duster;
import Popup.PopUp;

import com.example.banglaletterwriting.MainActivity;
import com.example.banglaletterwriting.NumberSprites;
import com.example.banglaletterwriting.R;
import com.example.banglaletterwriting.StructureDrawAnimation;

public class LetterStructureEkar
{

	//create numberSprite and cursor
	public static void createNumberSpriteAndCursor()
	{
			 
		//creating the first line of numbers
		MainActivity.spriteCounterLimit = 2;
		StructureDrawAnimation.scale(MainActivity.moOutLineX-50, MainActivity.moOutLineY , 1);
					
		//creating the fish cursor
		MainActivity.cursor = new AnimatedSprite(MainActivity.moOutLineX, MainActivity.moOutLineY, 
				MainActivity.mFishTextureRegion, MainActivity.vertexBufferObjectManager);
		MainActivity.cursor.animate(new long[]{100, 100, 100, 100, 100, 100}, 0, 5, true);
		MainActivity.cursor.setZIndex(3);
		MainActivity.mScene.attachChild(MainActivity.cursor);
					
		//setting the cursor to top of first number sprite
		NumberSprites.setCursorPosition(MainActivity.numberSprites[1]);
					

	}
		
	//Creating the structure for the Letter by positioning co-ordinates and also drawing with chalk
	public static void getStructure(float x, float y)
	{
			
		if(MainActivity.state==1)
		{
			//Drawing the chalk
			StructureDrawAnimation.Draw(x, y); 
			
			//setting the position of posX, posY
			MainActivity.posX = MainActivity.numberSprites[1].getX()+MainActivity.numberSprites[1].getWidth()/2-20;
			MainActivity.posY = MainActivity.numberSprites[1].getY()+MainActivity.numberSprites[1].getHeight()/2-20;

			if( 
				   MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -65 
				||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>60 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
					)
			{ 
				//set the cursor to the last collided number sprite
				NumberSprites.setCursorPosition(MainActivity.numberSprites[1]);
					
				//if out of the area the remove white chalks
				for(int a=0; a<=MainActivity.aCounter; a++)
				{
					MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
					//if wrong and not shaking the shake as wrong signal
					if(MainActivity.isShaking == false)
					{
						StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
					}
				}
				
			}
			//if in the area and collides the right number sprite then remove and pass to the next number sprite
			else 
			{
				NumberSprites.setCursorRotation(x, y);
					
				remove(2, 1,2);
			}
				
		}  
		else if(MainActivity.state==2)
		{
			MainActivity.mScene.detachChild(MainActivity.numberSprites[2]);
			//creating new line of numbers
			MainActivity.spriteCounterLimit=5;
			StructureDrawAnimation.scale(MainActivity.moOutLineX ,
					MainActivity.moOutLineY, MainActivity.spriteCounter); 
			MainActivity.state=3;
		}
		else if(MainActivity.state==3)
		{
			StructureDrawAnimation.Draw(x, y);
				
			MainActivity.posX = MainActivity.numberSprites[3].getX()+MainActivity.numberSprites[3].getWidth()/2-20;
			MainActivity.posY = MainActivity.numberSprites[3].getY()+MainActivity.numberSprites[3].getHeight()/2-20;

			if(
					 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
					 ||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>60 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[3]);
					
					//if out of the area the remove white chalks
					for(int a=MainActivity.wCounter; a<=MainActivity.aCounter; a++)
					{
						MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(MainActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(4,3,4);
				}
			}
			else if(MainActivity.state==4)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[4].getX()+MainActivity.numberSprites[4].getWidth()/2-20;
				MainActivity.posY = MainActivity.numberSprites[4].getY()+MainActivity.numberSprites[4].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 ||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
					|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>60 
					|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
					)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[4]);
					
					//if out of the area the remove white chalks
					for(int a=MainActivity.wCounter; a<=MainActivity.aCounter; a++)
					{
						MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(MainActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
							//if wrong and not shaking the shake as wrong signal
							if(MainActivity.isShaking == false)
							{
								StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);

							}
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(5,4,5);
				} 
			}
			else if(MainActivity.state==5)
			{
				MainActivity.mScene.detachChild(MainActivity.numberSprites[5]);
				//creating new line of numbers
				MainActivity.spriteCounterLimit=8;
				StructureDrawAnimation.scale(MainActivity.moOutLineX -20,
						MainActivity.moOutLineY, MainActivity.spriteCounter); 
				MainActivity.state=6;
			}
			else if(MainActivity.state==6)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[6].getX()+MainActivity.numberSprites[6].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[6].getY()+MainActivity.numberSprites[6].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -60 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>100 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>60 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-100 
						)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[6]);
					
					//if out of the area the remove white chalks
					for(int a=MainActivity.wCounter; a<=MainActivity.aCounter; a++)
					{
						MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(MainActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(7,6,7);
				}
			}
			else if(MainActivity.state==7)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[7].getX()+MainActivity.numberSprites[7].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[7].getY()+MainActivity.numberSprites[7].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -65 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>60 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>60 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-65 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[7]);
					
					//if out of the area the remove white chalks
					for(int a=MainActivity.wCounter; a<=MainActivity.aCounter; a++)
					{
						MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(MainActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
						}
					}
					
				}
				else 
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(8,7,8);
				}
			}  
//			else if(MainActivity.state==7)
//			{
//				MainActivity.spriteCounterLimit=9;
//				StructureDrawAnimation.scale(MainActivity.moOutLineX-50*MainActivity.spriteCounter +410 ,
//						MainActivity.moOutLineY-30*MainActivity.spriteCounter + 340, MainActivity.spriteCounter); 
//				MainActivity.state=8;
//			}
			else if(MainActivity.state==8)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[8].getX()+MainActivity.numberSprites[8].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[8].getY()+MainActivity.numberSprites[8].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-35  
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[8]);
					
					
					//if out of the area the remove white chalks
					for(int a=MainActivity.wCounter; a<=MainActivity.aCounter; a++)
					{
						MainActivity.mScene.detachChild(MainActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(MainActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, MainActivity.OutLine, 10);
						}
					} 
				}
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(8,8,89);
				}
			}
		
		
	}
		
		
		
	public static void Structure()
	{
		
		if(MainActivity.spriteCounterLimit == 2)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX+70*MainActivity.spriteCounter - 90, 
					MainActivity.moOutLineY , MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 5)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX, 
					MainActivity.moOutLineY +90*MainActivity.spriteCounter - 260,
					MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 8)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX+90*MainActivity.spriteCounter - 540 ,
					MainActivity.moOutLineY+50*MainActivity.spriteCounter - 420,
					MainActivity.spriteCounter);
		}
		
	}
	
	//when a sprite collides a number sprite then it is called;
	//it removes the number sprite and enables the next state for drawing
	public static void remove(int collisionSprite, int removeSpriteNumber, int stateNumber)
	{
		
		if(MainActivity.whiteChalk[MainActivity.aCounter].collidesWith(MainActivity.numberSprites[collisionSprite]))
		{
			//removing when it is in the last state
			if(collisionSprite == 8)
			{ 
				MainActivity.mScene.detachChild(MainActivity.numberSprites[8]);
				
				//trigger for taking screen shot
				MainActivity.screenShotCounter = 1;
				//create book icon
				PopUp.createBookIcon();
				
				//start duster
				Duster.startDuster();
				
				MainActivity.isActionMoving = false;
				
				//start the hand tutorial 
//				MainActivity.tutorialCounter++;
//				if(MainActivity.tutorialCounter==1)
//				{
//					HandTutorial.handTutorialCreate();
//				}
			}
			MainActivity.mScene.detachChild(MainActivity.numberSprites[removeSpriteNumber]);
			MainActivity.numberSprites[removeSpriteNumber].setY(MainActivity.CAMERA_HEIGHT+500);
			MainActivity.wCounter =MainActivity. aCounter+2;
			MainActivity.state = stateNumber;
			
			//play sound
			MainActivity.audioPlay = true;
			NumberSprites.playAudio(R.raw.star);
			
		}
	}
	
}
