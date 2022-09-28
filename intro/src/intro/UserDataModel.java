package intro;

public interface UserDataModel {
	String name = "";
	int id = -1;
	boolean durum = false;
}

class UserModelCls {
	String name;
	int id;

	UserModelCls(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}
}