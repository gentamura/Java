/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gentamura
 */
public class MyNumber implements DebugPrintable {

  int a;
  public MyNumber(int a) {
    this.a = a;
  }
  
  public void debugPrint() {
    System.out.println("MyNuberのインスタンス：aの値は" + a + "です。");
  }
  
}