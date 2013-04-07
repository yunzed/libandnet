package com.dyz;

public class ProtoLog {
	public static void log(String msg) {
		long threadid = Thread.currentThread().getId();
		System.out.println("YYANDSDK - " + threadid + " - " + msg);
	}
	
	public static void error(String msg) {
		long threadid = Thread.currentThread().getId();
		System.out.println("YYANDSDK - ERROR - " + threadid + " - " + msg);
	}
}
