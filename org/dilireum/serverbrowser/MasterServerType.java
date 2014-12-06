package org.dilireum.serverbrowser;

/**
 * Enum for the various master server types.
 * 
 * @author brapp
 *
 */
public enum MasterServerType {
	
	q2m("q2m", "Quake 2"),
	q3m("q3m", "Quake 3"),
	cod("cod", "Call of Duty"),
	doom3("doom3", "Doom 3"),
	http("http", "HTTP");
	
	String		masterId;
	String		masterName;
	
	private MasterServerType(String mid, String mName) {
		masterId	= mid;
		masterName	= mName;
	}
	
	public String getMasterId() {
		return masterId;
	}
	
	public String getMasterName() {
		return masterName;
	}
	
	public static MasterServerType getMasterFromId(String mid) {
		for (MasterServerType ms : MasterServerType.values()) {
			if (ms.masterId.equalsIgnoreCase(mid)) {
				return ms;
			}
		}
		return null;
	}

	public static MasterServerType getMasterFromName(String mName) {
		for (MasterServerType ms : MasterServerType.values()) {
			if (ms.masterName.equalsIgnoreCase(mName)) {
				return ms;
			}
		}
		return null;
	}
}
