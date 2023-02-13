package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold, + 1 for length
	private byte[] data;

	public Message(byte[] data) {
		if(data == null || data.length > 127) return;
		
		this.data = data;
	}

	public byte[] getData() {
		return this.data; 
	}

}
