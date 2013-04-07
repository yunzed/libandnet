package com.dyz.net;

public class NetLog {
	public static void log(String msg) {
		//System.out.println("YYANDSDK - " + msg);
		long threadid = Thread.currentThread().getId();
		System.out.println("YYANDSDK - " + threadid + " - " + msg);
	}
}
