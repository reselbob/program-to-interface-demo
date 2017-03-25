package com.reselbob.interfacedemo;

public class OnlineDocument implements Storable, Writable {

	public void setContent(String content) {
		System.out.println(String.format("I am pretending to set the content, %1$s, to the Internet", content));
	}

	public String getContent() {
		System.out.println("I am pretending to get content from the Internet");
		return null;
	}

	public void open(String identifier) {
		System.out.println(String.format("I am pretending to open a document with id: %1$s from the Internet", identifier));
	}

	public void save() {
		System.out.println("I am pretending to save a document to the Internet");

	}

	public void delete() {
		System.out.println("I am pretending to delete a document from the Internet");
	}

}
