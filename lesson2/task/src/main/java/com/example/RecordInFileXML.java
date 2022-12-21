package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecordInFileXML extends RecordInFile {

  private List<String> list;

  public RecordInFileXML(List<String> list) {
    this.list = list;
  }

  public void createArrayXML(List<String> string) {
    List<String> xmlString = new ArrayList<>();
    xmlString.add("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
    xmlString.add("<students>\n");
    for (String item : string) {
      xmlString.add("\t<student>\n");
      xmlString.add("\t\t<name>" + item.split("=")[0] + "</name>\n");
      xmlString.add("\t\t<grade>" + item.split("=")[1] + "</grade>\n");
      xmlString.add("\t</student>\n");
    }
    xmlString.add("</students>\n");
    recordInFile(xmlString, "file.xml");

  }

  @Override
  public String toString() {
    createArrayXML(list);
    return "Файл успешно записан";
  }

}
