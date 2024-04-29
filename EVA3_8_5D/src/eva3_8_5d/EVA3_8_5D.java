/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_5d;

/**
 *
 * @author Jennis
 */
public class EVA3_8_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int cubo [][][][][] = new int [10][5][3][2][1]; //150 ENTEROS
        for(int i = 0; i < cubo.length; i++){
          for(int j = 0; j < cubo[i].length; j++){
            for(int k = 0; k < cubo[i][j].length; k++){
                for(int m = 0; m< cubo[i][j][k].length; m++){
            for(int n = 0; n < cubo[i][j][k][m].length; n++){
                    cubo[i][j][k][m][n] = (int)(Math.random() * 100);
                    
            }
          }
        }
          }
        }
             for(int i = 0; i < cubo.length; i++){
          for(int j = 0; j < cubo[i].length; j++){
            for(int k = 0; k < cubo[i][j].length; k++){
                for(int m = 0; m< cubo[i][j][k].length; m++){
            for(int n = 0; n < cubo[i][j][k][m].length; n++){
                System.out.println("[" + cubo [i][j][k][m][n]+"]");
            }
                    
    }
          }
             }
    }
  }
        }
    