import java.awt.Color;
import java.util.Scanner;

public class TryOut {
  public static void main(String [] args) {
        
    ImageUtils utils = new ImageUtils();
        
    Color[][] variation = utils.loadImage("src/LennaCV.png");   
    Color [][] halfBlack5 = Variation(variation);
    utils.addImage(halfBlack5, "Variation");
    utils.display();
  
  }         
  public static Color[][] Variation (Color [][] img){
    Color [][] tmp = ImageUtils.cloneArray(img);
    
    Scanner in = new Scanner(System.in);    
    System.out.println("Please select 1) if r2 is red 2) if r2 is replaced with green or any other number to replace r2 with blue");            
    int r2=in.nextInt();
    System.out.println("Please select 1) if g2 is replaced with red 2) if g2 is green or any other number to replace g2 with blue"); 
    int g2= in.nextInt();
    System.out.println("Please select 1) if b2 is replaced with red 2) if b2 is replaced with green or any other number to keep b2 blue"); 
    int b2= in.nextInt();
    in.close();
    if(r2 < 1 || r2 > 3 ||
       g2 < 1 || g2 > 3 ||
       b2 < 1 || b2 > 3) {
      System.out.println("Please enter valid entries");
      return tmp;
    }
    for(int i=0; i<tmp.length; i++) {
      for ( int j=0; j<tmp[i].length;j++) {
        if(i<tmp.length) {
          // Red, Green, Blue : 0-255
          Color pixel2 = tmp[i][j];   
          int red = 0;
          int green = 0;
          int blue = 0;
          switch(r2) {
            case 1:
              red = pixel2.getRed();
              break;
            case 2:
              red = pixel2.getGreen();
              break;
            case 3:        
              red = pixel2.getBlue();
              break;
          }
          switch(g2) {
            case 1:
              green = pixel2.getRed();
              break;
            case 2:
              green = pixel2.getGreen();
              break;
            case 3:       
              green = pixel2.getBlue();
              break;
          }
          switch(b2) {
            case 1:
              blue = pixel2.getRed();
              break;
            case 2:
              blue = pixel2.getGreen();
              break;
            case 3:       
              blue = pixel2.getBlue();
              break;
          }
          tmp[i][j]= new Color(red,green,blue);
        }   
      }
    }
    return tmp;
  }
  
}