
import java.awt.Color;
import java.util.Scanner;

public class ImageProcess {
	
	public static void main(String [] args) {
		
		ImageUtils utils = new ImageUtils();
		
		// Load in an image.
		
		  Color[][] orig=utils.loadImage("src/LennaCV.png");
		  Color[][] greyscale=utils.loadImage("src/LennaCV.png");
		  
		  
		  Color[][] red = utils.loadImage("src/LennaCV.png");
		  Color[][] green = utils.loadImage("src/LennaCV.png");
		  Color[][] blue = utils.loadImage("src/LennaCV.png");
		  
		  
		  Color[][] redreplacedblue = utils.loadImage("src/LennaCV.png");
		  Color[][] redreplacedgreen = utils.loadImage("src/LennaCV.png");
		  Color[][] rednullgreenblue = utils.loadImage("src/LennaCV.png");
		
		  
		  Color[][] greenreplacedred = utils.loadImage("src/LennaCV.png");
		  Color[][] greenreplacedblue = utils.loadImage("src/LennaCV.png");
		
		
		  
		  
		  Color[][] bluereplacedred = utils.loadImage("src/LennaCV.png");
		  Color[][] bluereplacedgreen = utils.loadImage("src/LennaCV.png");
	
		  
	
		  
		  
		  
		  
		// Add original Image tab
		
		  utils.addImage(orig, "Original image.");

		
		// Process the image/
		  Color [][] halfBlack = process(orig);
		  Color [][] halfBlack1 = greyscale(greyscale);
		  Color [][] halfBlack2 = Red(red);
		  Color [][] halfBlack3 = Green(green);
		  Color [][] halfBlack4 = Blue(blue);
		  
		  
		  
		  Color [][] halfBlack5 = redreplacedBlue(redreplacedblue);
		  Color [][] halfBlack6 = redreplacedGreen(redreplacedblue);
		  Color [][] halfBlack7 =  rednullGreenBlue(rednullgreenblue);
		  
		  Color [][] halfBlack8 = GreenreplacedRed(greenreplacedred);
		  Color [][] halfBlack9 = GreenreplacedBlue(greenreplacedblue);

		  
		  Color [][] halfBlack10 = BluereplacedRed(bluereplacedred);
		  Color [][] halfBlack11 = BluereplacedGreen(bluereplacedred);
		 
		  
		  
		  

		  
		  
		utils.addImage(halfBlack, "Negative");
		utils.addImage(halfBlack1, "GreyScale");
		utils.addImage(halfBlack2, "Red");
		utils.addImage(halfBlack3, "Green");	
		utils.addImage(halfBlack4, "Blue");
		
		utils.addImage(halfBlack5, "RedReplacedBlue");
		utils.addImage(halfBlack6, "RedReplacedGreen");
		utils.addImage(halfBlack7, "RedNullGreenBlue");
		
		
		utils.addImage(halfBlack8, "GreenReplacedRed");
		utils.addImage(halfBlack9, "GreenReplacedBlue");
	
		
		
		utils.addImage(halfBlack10, "BlueReplacedRed");
		utils.addImage(halfBlack11, "BlueReplacedGreen");
		
		// Display the Image
		
		
		utils.display();
	
		
		
		
	}
	
	
	public static Color[][] process (Color [][] img) {
		
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel = tmp[i][j];
					
					
					int r = 255-pixel.getRed();
					int g = 255-pixel.getGreen();
					int b = 255-pixel.getBlue();
					
					tmp[i][j]= new Color(r,g,b);
					
				}
			}
		}
		return tmp;
	}
	
	
				
		public static Color [][] greyscale(Color [][] img){			
			Color [][] tmp= ImageUtils.cloneArray(img);		
			for(int i=0; i<tmp.length; i++) {
				for ( int j=0; j<tmp[i].length;j++) {
					
					if(i<tmp.length) {
						// Red, Green, Blue : 0-255
						
						Color pixel = tmp[i][j];
						
						
						int r = pixel.getRed();
						int g = pixel.getGreen();
						int b = pixel.getBlue();	
					
						
						
					
					int avg= ((r+g+b)/3);
					tmp[i][j]= new Color(avg,avg,avg);
					
					
			}
			}
		}
		
		return tmp;
		}
	
		
		public static Color[][] Red (Color [][] img) {
		// replacing red with green and blue to 0	
			Color [][] tmp = ImageUtils.cloneArray(img);
	    		
			for(int i=0; i<tmp.length; i++) {
				for ( int j=0; j<tmp[i].length;j++) {
					
					
						if(i<tmp.length) {
							// Red, Green, Blue : 0-255
							
							Color pixel1 = tmp[i][j];
							
							
							int r1 = pixel1.getRed();
							int g1 = pixel1.getGreen();
							int b1 = pixel1.getBlue();
							
							tmp[i][j]= new Color(r1,0,0);
					}
				}
			}
			return tmp;
		}
		
		
	public static Color[][] Green (Color [][] img) {
			// replacing green with blue
			Color [][] tmp = ImageUtils.cloneArray(img);
	    		
			for(int i=0; i<tmp.length; i++) {
				for ( int j=0; j<tmp[i].length;j++) {
					
					
					if(i<tmp.length) {
						// Red, Green, Blue : 0-255
						
						Color pixel2 = tmp[i][j];
						
						
						int r2 = pixel2.getRed();
						int g2 = pixel2.getGreen();
						int b2 = pixel2.getBlue();
						
					
					
							
							tmp[i][j]= new Color(0,g2,0);
					}
				}
			}
			return tmp;
		}
		
	
	public static Color[][] Blue (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(0,0,b2);
				}
			}
		}
		return tmp;
	}
	
	
    
	public static Color[][] redreplacedBlue (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(r2,g2,r2);
				}
			}
		}
		return tmp;
	}
	
	public static Color[][] redreplacedGreen (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(r2,r2,b2);
				}
			}
		}
		return tmp;
	}
   
	public static Color[][] rednullGreenBlue (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(0,g2,b2);
				}
			}
		}
		return tmp;
	}
	
	
	
	
    
	public static Color[][] GreenreplacedRed (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(g2,g2,b2);
				}
			}
		}
		return tmp;
	}
	
	public static Color[][] GreenreplacedBlue (Color [][] img) {
		// replacing green with blue
		Color [][] tmp = ImageUtils.cloneArray(img);
    		
		for(int i=0; i<tmp.length; i++) {
			for ( int j=0; j<tmp[i].length;j++) {
				
				
				if(i<tmp.length) {
					// Red, Green, Blue : 0-255
					
					Color pixel2 = tmp[i][j];
					
					
					int r2 = pixel2.getRed();
					int g2 = pixel2.getGreen();
					int b2 = pixel2.getBlue();
					
				
				
						
						tmp[i][j]= new Color(r2,g2,g2);
				}
			}
		}
		return tmp;
	}
   
	
	
	
	
	
	
	  
		public static Color[][] BluereplacedRed (Color [][] img) {
			// replacing green with blue
			Color [][] tmp = ImageUtils.cloneArray(img);
	    		
			for(int i=0; i<tmp.length; i++) {
				for ( int j=0; j<tmp[i].length;j++) {
					
					
					if(i<tmp.length) {
						// Red, Green, Blue : 0-255
						
						Color pixel2 = tmp[i][j];
						
						
						int r2 = pixel2.getRed();
						int g2 = pixel2.getGreen();
						int b2 = pixel2.getBlue();
						
					
					
				tmp[i][j]= new Color(b2,g2,b2);
					}
				}
			}
			return tmp;
		}
		
		public static Color[][] BluereplacedGreen (Color [][] img) {
			// replacing green with blue
			Color [][] tmp = ImageUtils.cloneArray(img);
	    		
			for(int i=0; i<tmp.length; i++) {
				for ( int j=0; j<tmp[i].length;j++) {
					
					
					if(i<tmp.length) {
						// Red, Green, Blue : 0-255
						
						Color pixel2 = tmp[i][j];
						
						
						int r2 = pixel2.getRed();
						int g2 = pixel2.getGreen();
						int b2 = pixel2.getBlue();
						
					
					
							
							tmp[i][j]= new Color(r2,b2,b2);
					}
				}
			}
			return tmp;
		}
	   

		
		
}

	
	
	
		
		
	
	

