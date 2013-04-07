package com.dyz;


public interface IProtoLinkHandler
{
	void onConnected();	
	void onData(int uri, byte[] buf);
	void onDisconnected();
	void onTimer(int id);
}