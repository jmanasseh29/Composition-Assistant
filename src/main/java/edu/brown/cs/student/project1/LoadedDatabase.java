package edu.brown.cs.student.project1;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public interface LoadedDatabase<T> {

  //add others

  void createObject(String[] line);

  String getDataType();

  List<T> getObjectDatabase();



}