package com.reselbob.interfacedemo.test;
import com.reselbob.interfacedemo.Storable;
import com.reselbob.interfacedemo.Writable;
import com.reselbob.interfacedemo.Document;
import com.reselbob.interfacedemo.OnlineDocument;

import org.testng.annotations.Test;

public class DocumenationTest {
  @Test
  public void CanAccessInterfaces() {
	  Document doc = new Document();
	  OnlineDocument iDoc = new OnlineDocument();
	  
	  System.out.println("--Document implementation--\n");
	  Writable writable = (Writable)(doc);
	  Storable storable = (Storable)(doc);
	  String id = "~/home/documents/abc.docx";
	  String content = "The quick brown fox rocks!";
	  storable.open(id);
	  writable.setContent(content);
	  storable.save();
	  
	  System.out.println("\n--OnlineDocument implementation--\n");
	  writable = (Writable)(iDoc);
	  storable = (Storable)(iDoc);
	  id = "http://www.example.com/docs?id=SOME_GUID";
	  content = "The quick brown fox rocks!";
	  storable.open(id);
	  writable.setContent(content);
	  storable.save();
  }
}
