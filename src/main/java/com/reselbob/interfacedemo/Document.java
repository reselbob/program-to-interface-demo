package com.reselbob.interfacedemo;

public class Document implements Writable, Storable {

	public void setContent(String content) {
		System.out.println(String.format("I am pretending to set the content, %1$s, to the local disk", content));
	}

	public String getContent() {
		System.out.println("I am pretending to get content from the local disk");
		return null;
	}

	public void open(String identifier) {
		System.out.println(String.format("I am pretending to open a document with id: %1$s from the local disk", identifier));
	}

	public void save() {
		System.out.println("I am pretending to save a document to the local disk");

	}

	public void delete() {
		System.out.println("I am pretending to delete a document from the local disk");
	}

}
