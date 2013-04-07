libandnet
=========

Wrapper of NIO, use a single thread to handle the select operation. To use it, create a class to derive from IProtoLinkHandler,
and handle the onConnected, onData, onDisconnect, onTimer events.

Example:

public class SomeLink implements IProtoLinkHandler {
	private ProtoLink mLink = null;
	
	public SomeLink() {
		mLink = new ProtoLink(true, this);
		mLink.addTimer(0, 10*1000);
	}
	
	public void connect() {		
		mLink.connect(ip.ip, ip.ports[0]);
	}
	
	public void send(byte[] buf) {
		mLink.send(buf);
	}
	
	@Override
	public void onConnected() {
	}

	@Override
	public void onData(int uri, byte[] buf) {
	}

	@Override
	public void onDisconnected() {
	}

	@Override
	public void onTimer(int id) {
	}
}
