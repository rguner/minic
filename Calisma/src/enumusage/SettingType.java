package enumusage;

public enum SettingType {
	PRSAUTHORIZATION(1), THREEG(2), INTERNATIONALCALL(3), ROAMING(4);

	private int settingType;

	SettingType(int settingType) {
		this.settingType = settingType;
	}

	public int value() {
		return settingType;
	}

	public static SettingType valueOf(int settingType) {
		for (SettingType settingStatus : SettingType.values()) {
			if (settingStatus.value() == settingType) {
				return settingStatus;
			}
		}
		return null;
	}
}
