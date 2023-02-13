package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		// TODO - START
		
		// implement marshalling, call and unmarshalling for write RPC method
		
		// marhall parameter to write to the display server
		byte[] toSend = RPCUtils.marshallString(message);
		
		// make remote procedure call for write
		byte[] response = rpcclient.call((byte)Common.WRITE_RPCID, toSend);
		
		// unmarshall the retrun value from the write call
		String reply = RPCUtils.unmarshallString(response);
		
		
		
		// TODO - END
		
	}
}
