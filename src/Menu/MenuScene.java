package Menu;

import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;

import com.example.banglaletterwriting.GameActivity;
import com.example.banglaletterwriting.R.menu;

public class MenuScene extends Scene
{
	
	public static Sprite menuBackground;
	public static Sprite[][] menuLetters = new Sprite[50][50];
	public int i,j;
	public int menuLetterBlockSize;
	
	public MenuScene() 
	{
		// TODO Auto-generated constructor stub
		menuLetterBlockSize = 50;
		
		menuBackground = new Sprite(0, 0, GameActivity.mMenuBackGroundTextureRegion, GameActivity.vertexBufferObjectManager);
		menuBackground.setHeight(GameActivity.CAMERA_HEIGHT);
		menuBackground.setWidth(GameActivity.CAMERA_WIDTH);
		attachChild(menuBackground);
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++) 
			{
				menuLetters[i][j] = new Sprite(i*130-120, j*100-120, GameActivity.mMenuTextureRegionMenuLetters[i][j],
						GameActivity.vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
							Debug.d("Touch:"+(pSceneTouchEvent.getX()- this.getWidth()/2));
							Debug.d("Letter2.x:"+menuLetters[2][2].getX());
							Debug.d("Letter2.y:"+menuLetters[2][2].getY());
							
							if(pSceneTouchEvent.getX()- this.getWidth()/2> menuLetters[1][1].getX() &&
									pSceneTouchEvent.getX()-this.getWidth()/2<menuLetters[1][1].getX()+menuLetterBlockSize &&
									pSceneTouchEvent.getY()-this.getHeight()/2>menuLetters[1][1].getY() &&
									pSceneTouchEvent.getY()-this.getHeight()/2<menuLetters[1][1].getY()+menuLetterBlockSize
									)
							{
								Debug.d("value:1");
								GameActivity.setCurrentScene(new MainScene());
							}
							if(pSceneTouchEvent.getX()- this.getWidth()/2> menuLetters[1][2].getX() &&
									pSceneTouchEvent.getX()-this.getWidth()/2<menuLetters[1][2].getX()+menuLetterBlockSize &&
									pSceneTouchEvent.getY()-this.getHeight()/2>menuLetters[1][2].getY() &&
									pSceneTouchEvent.getY()-this.getHeight()/2<menuLetters[1][2].getY()+menuLetterBlockSize
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
		
//		Rectangle rectangle = new Rectangle(140,80, 40, 40, MainActivity.vertexBufferObjectManager)
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
