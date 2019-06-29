/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayfile;

import java.io.*;

/**
 *
 * @author gentamura
 */
public class DisplayFile {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("ファイル名 " + args[i] + "====");
      try {
        BufferedReader reader = new BufferedReader(new FileReader(args[i]));
        while (true) {
          String line = reader.readLine();
          if (line == null) {
            break;
          }
          System.out.println(line);
        }
        reader.close();
      } catch (FileNotFoundException e) {
        System.out.println("ファイルが見つかりません: " + e);
      } catch (IOException e) {
        System.out.println("I/Oエラーです:" + e);
      }
    }
  }
  
}
