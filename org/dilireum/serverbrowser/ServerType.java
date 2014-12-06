package org.dilireum.serverbrowser;

/**
 * Enum for the various master server types.
 * 
 * @author brapp
 *
 */
public enum ServerType {
	
	q2s("q2s", "Quake 2"),
	q3s("q3s", "Quake 3"),
	q3i("q3i", "Quake 3 extended"),
	cod("cod", "Call of Duty"),
	doom3("doom3", "Doom 3"),
	etqw("etqw", "ET: Quake Wars");
	
	String		serverId;
	String		serverName;
	
	private ServerType(String mid, String mName) {
		serverId	= mid;
		serverName	= mName;
	}
	
	public String getMasterId() {
		return serverId;
	}
	
	public String getMasterName() {
		return serverName;
	}
	
	public ServerType getMasterFromId(String mid) {
		for (ServerType st : ServerType.values()) {
			if (st.serverId.equalsIgnoreCase(mid)) {
				return st;
			}
		}
		return null;
	}

	public ServerType getMasterFromName(String mName) {
		for (ServerType st : ServerType.values()) {
			if (st.serverName.equalsIgnoreCase(mName)) {
				return st;
			}
		}
		return null;
	}
}
