
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gentamura
 */
public class MyFileReader extends FileReader implements DebugPrintable {
  String filename = null;
  public MyFileReader(Sring filename) throws FileNotFoundException {
    super(filename);
    this.filename = filename;
  }
  public void debugPrint() {
    System.out.println("MyFileReaderのインスタンス:ファイル名は" + filename + "です。");
  }
}
