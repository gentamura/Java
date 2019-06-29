/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gentamura
 */
public interface DebugPrintable {
  enum Type {
    NO_ERROR, FILE_ERROR, MEMORY_ERROR,
  }
  String PREFIX = "ERROR:";
  void debugPrint();
}
