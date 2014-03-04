package Letters;

import org.andengine.entity.sprite.AnimatedSprite;
import Duster.Duster;
import Popup.PopUp;

import com.example.banglaletterwriting.MainActivity;
import com.example.banglaletterwriting.NumberSprites;
import com.example.banglaletterwriting.R;
import com.example.banglaletterwriting.StructureDrawAnimation;

public class LetterStructureU
{

	//create numberSprite and cursor
	public static void createNumberSpriteAndCursor()
	{
			 
		//creating the first line of numbers
		MainActivity.spriteCounterLimit = 4;
		StructureDrawAnimation.scale(MainActivity.moOutLineX + 70 - 100, MainActivity.moOutLineY - 20, 1);
					
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
				   MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
				||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
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
			StructureDrawAnimation.Draw(x, y);
				
			MainActivity.posX = MainActivity.numberSprites[2].getX()+MainActivity.numberSprites[2].getWidth()/2-20;
			MainActivity.posY = MainActivity.numberSprites[2].getY()+MainActivity.numberSprites[2].getHeight()/2-20;

			if(
					 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
					 ||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
				|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[2]);
					
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
					
					remove(3,2,3);
				}
			}
			else if(MainActivity.state==3)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[3].getX()+MainActivity.numberSprites[3].getWidth()/2-20;
				MainActivity.posY = MainActivity.numberSprites[3].getY()+MainActivity.numberSprites[3].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 ||MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
					|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
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
					
					remove(4,3,4);
				}
			}
			else if(MainActivity.state==4)
			{
				MainActivity.mScene.detachChild(MainActivity.numberSprites[4]);
				//creating new line of numbers
				MainActivity.spriteCounterLimit=7;
				StructureDrawAnimation.scale(MainActivity.moOutLineX +50,
						MainActivity.moOutLineY-20, MainActivity.spriteCounter); 
				MainActivity.state=5;
			}
			else if(MainActivity.state==5)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[5].getX()+MainActivity.numberSprites[5].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[5].getY()+MainActivity.numberSprites[5].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[5]);
					
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
					
					remove(6,5,6);
				}
			}
			else if(MainActivity.state==6)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[6].getX()+MainActivity.numberSprites[6].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[6].getY()+MainActivity.numberSprites[6].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
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
				MainActivity.spriteCounterLimit=9;
				StructureDrawAnimation.scale(MainActivity.moOutLineX-50*MainActivity.spriteCounter +530 ,
						MainActivity.moOutLineY-30*MainActivity.spriteCounter + 310, MainActivity.spriteCounter); 
				MainActivity.state=8;
			}
			else if(MainActivity.state==8)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[7].getX()+MainActivity.numberSprites[7].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[7].getY()+MainActivity.numberSprites[7].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55  
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
					
					remove(8,7,9);
				}
			}
			else if(MainActivity.state==9)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[8].getX()+MainActivity.numberSprites[8].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[8].getY()+MainActivity.numberSprites[8].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>70 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-65 
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
					
					remove(9,8,10);
				} 
			}
			else if(MainActivity.state==10)
			{
				MainActivity.spriteCounterLimit=12;
				StructureDrawAnimation.scale(MainActivity.moOutLineX+40*MainActivity.spriteCounter -355 ,
						MainActivity.moOutLineY+50*MainActivity.spriteCounter-330, MainActivity.spriteCounter); 
				MainActivity.state=11;
			} 
			
			else if(MainActivity.state==11)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[9].getX()+MainActivity.numberSprites[9].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[9].getY()+MainActivity.numberSprites[9].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-35 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[9]);
					
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
					
					remove(10,9,12);
				}
			}
			else if(MainActivity.state==12)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[10].getX()+MainActivity.numberSprites[10].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[10].getY()+MainActivity.numberSprites[10].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-65 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[10]);
					
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
					
					remove(11,10,13);
				}
			}
			else if(MainActivity.state==13)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[11].getX()+MainActivity.numberSprites[11].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[11].getY()+MainActivity.numberSprites[11].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-65 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[11]);
					
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
		                
					remove(12,11,14);
				}
			}
			else if(MainActivity.state==14)
			{
				MainActivity.mScene.detachChild(MainActivity.numberSprites[12]);
				MainActivity.spriteCounterLimit=15;
				StructureDrawAnimation.scale(MainActivity.moOutLineX+130 , 
						80+MainActivity.moOutLineY-70*MainActivity.spriteCounter+810, MainActivity.spriteCounter); 
				MainActivity.state=15; 
			}
			else if(MainActivity.state==15)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[13].getX()+MainActivity.numberSprites[13].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[13].getY()+MainActivity.numberSprites[13].getHeight()/2-20;
				
				//rect(MainActivity.posX, MainActivity.posY);
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[13]);
					
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
					
					remove(14,13,16);
				}
			}
			else if(MainActivity.state==16)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[14].getX()+MainActivity.numberSprites[14].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[14].getY()+MainActivity.numberSprites[14].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -65 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>60 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>60 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-65 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[14]);
					
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
		                
					remove(15,14,17);
				}
			} 
			else if(MainActivity.state==17)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[14].getX()+MainActivity.numberSprites[14].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[14].getY()+MainActivity.numberSprites[14].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>50 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[14]);
					
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
					
					remove(15,14,29); 
				}
			} 
			else if(MainActivity.state==19)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[15].getX()+MainActivity.numberSprites[15].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[15].getY()+MainActivity.numberSprites[15].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[15]);
					
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
					
					remove(16,15,20); 
				}
			}
			else if(MainActivity.state==20)
			{
				StructureDrawAnimation.Draw(x, y);
				
				MainActivity.posX = MainActivity.numberSprites[16].getX()+MainActivity.numberSprites[16].getWidth()/2-20; 
				MainActivity.posY = MainActivity.numberSprites[16].getY()+MainActivity.numberSprites[16].getHeight()/2-20;
				
				if(
						 MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX< -55 
						 	|| MainActivity.whiteChalk[MainActivity.aCounter].getX() - MainActivity.posX>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY>30 
							|| MainActivity.whiteChalk[MainActivity.aCounter].getY() - MainActivity.posY<-55 
						)
				{

					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(MainActivity.numberSprites[16]);
					
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
		                
					remove(17,16,21); 
				}
			}
		}
		
		
		
	public static void Structure()
	{
		
		if(MainActivity.spriteCounterLimit == 4)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX+70*MainActivity.spriteCounter - 100, 
					MainActivity.moOutLineY -20, MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 7)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX+50 ,
					MainActivity.moOutLineY+60*MainActivity.spriteCounter - 320,
					MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 9) 
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX-50*MainActivity.spriteCounter +580 ,
					MainActivity.moOutLineY-30*MainActivity.spriteCounter + 430,
					MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 12)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX-40*MainActivity.spriteCounter +430 ,
					MainActivity.moOutLineY-80*MainActivity.spriteCounter+980,
					MainActivity.spriteCounter);
		}
		else if(MainActivity.spriteCounterLimit == 15)
		{
			MainActivity.spriteCounter++;
			StructureDrawAnimation.scale(MainActivity.moOutLineX-90*MainActivity.spriteCounter+1310 , 
					70+MainActivity.moOutLineY-30*MainActivity.spriteCounter+290,
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
			if(collisionSprite == 15)
			{ 
				MainActivity.mScene.detachChild(MainActivity.numberSprites[15]);
				
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
