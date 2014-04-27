/**
 * @author Valentine Chiwome
 * Distributed Systems Assignment 2
 * Spring 2014
 */

package network;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {
	/**
	 *This class defines valid messages that can be 
	 *sent over a network. The messages are of different
	 *types and each type is identified by one of the 
	 *types.
	 */	
	public static final int FIND_PEER_SUCCESSOR = 0;
	public static final int FIND_PEER_KEY_SUCCESSOR = 1;

	public static final int FIND_PEER_PREDECESSOR = 2;
	public static final int FIND_PEER_CLOSEST_PRED_FINGER = 3;

	public static final int SET_PEER_PREDECESSOR = 4;
	public static final int UPDATE_PEER_FINGER_TABLE = 5;
	
	public static final int REQUEST_ITEM_FROM_PEER = 6;
	public static final int REMOVE_ITEM_FROM_PEER = 7;
	public static final int ADD_ITEM_TO_PEER = 8;

	public static final int REPLY = 9;
	
	public static final int ASK_PEER_TO_PRINT__TABLE = 10;

	/**
	 * sourceId is the origin of the message,
	 * sourcePort is the port from which the message was sent
	 * destinationId is the target process
	 * data is a list of data items that the process likes to send
	 */
	private int sourceId;
	private int sourcePort;
	private int destinationId;
	private int type;
	private InetAddress sourceAddr;
	private List<Object> data = new ArrayList<Object>();
	
	public Message(int sourceId, int type) {
		this.sourceId = sourceId;
		this.type = type;
	}
	
	public List<Object> getData() {
		return data;
	}
	
	public void setData(List<Object> data) {
		this.data = data;
	}
	
	public void setData(Object o, int index) {
		if (data.size() >= index){
			data.add(o);
		}
		else {
			data.set(index, o);
		}
	}
	
	public int getSourcePort() {
		return sourcePort;
	}
	public void setSourcePort(int sourcePort) {
		this.sourcePort = sourcePort;
	}
	public InetAddress getSourceAddr() {
		return sourceAddr;
	}
	public void setSourceAddr(InetAddress sourceAddr) {
		this.sourceAddr = sourceAddr;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public int getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
