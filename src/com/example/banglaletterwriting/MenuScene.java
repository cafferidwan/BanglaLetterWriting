package com.example.banglaletterwriting;

import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;

import com.example.banglaletterwriting.R.menu;

public class MenuScene extends Scene
{
	
	public static Sprite menuBackground;
	public static Sprite[][] menuLetters = new Sprite[50][50];
	public int i,j;
	public int letterBlockSize;
	
	public MenuScene() 
	{
		// TODO Auto-generated constructor stub
		letterBlockSize = 50;
		
		menuBackground = new Sprite(0, 0, MainActivity.mMenuBackGroundTextureRegion, MainActivity.vertexBufferObjectManager);
		menuBackground.setHeight(MainActivity.CAMERA_HEIGHT);
		menuBackground.setWidth(MainActivity.CAMERA_WIDTH);
		attachChild(menuBackground);
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++) 
			{
				menuLetters[i][j] = new Sprite(i*130-120, j*100-120, MainActivity.mMenuTextureRegionMenuLetters[i][j],
						MainActivity.vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
							Debug.d("Touch:"+(pSceneTouchEvent.getX()- this.getWidth()/2));
//							Debug.d("Letter1:"+menuLetters[1][2].getX());
//							Debug.d("Letter2:"+menuLetters[4][2].getX());
							
							if(pSceneTouchEvent.getX()- this.getWidth()/2> menuLetters[1][1].getX() &&
									pSceneTouchEvent.getX()-this.getWidth()/2<menuLetters[1][1].getX()+letterBlockSize &&
									pSceneTouchEvent.getY()-this.getHeight()/2>menuLetters[1][1].getY() &&
									pSceneTouchEvent.getY()-this.getHeight()/2<menuLetters[1][1].getY()+letterBlockSize
									)
							{
								Debug.d("value:1");
							}
							if(pSceneTouchEvent.getX()- this.getWidth()/2> menuLetters[1][2].getX() &&
									pSceneTouchEvent.getX()-this.getWidth()/2<menuLetters[1][2].getX()+letterBlockSize &&
									pSceneTouchEvent.getY()-this.getHeight()/2>menuLetters[1][2].getY() &&
									pSceneTouchEvent.getY()-this.getHeight()/2<menuLetters[1][2].getY()+letterBlockSize
									)
							{
								Debug.d("value:2");
							}
						break;
						case TouchEvent.ACTION_UP:
		
						break;
						}
						return true;
					}
			
				};
				menuLetters[i][j].setScale((float) 0.4);
				registerTouchArea(menuLetters[i][j]);
				attachChild(menuLetters[i][j]);
			}
		}
		
//		Rectangle rectangle = new Rectangle(100, 100, 40, 40, MainActivity.vertexBufferObjectManager)
//		{
//			@Override
//			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
//			{
//				switch (pSceneTouchEvent.getAction()) 
//				{
//				case TouchEvent.ACTION_DOWN:
//					MainActivity.setCurrentScene(new MainScene());
//				break;
//				case TouchEvent.ACTION_UP:
//
//				break;
//				}
//				return true;
//			}
//	
//		};
//		rectangle.setColor(Color.RED);
//		registerTouchArea(rectangle);
//		attachChild(rectangle);
		
		
		
	}
}
