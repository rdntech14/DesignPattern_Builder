package pattern;

public class Driver {

	// mandatory parameter
	private String driverName;

	// optional parameter
	private boolean maximize;
	private String allowPopUP;

	private Driver(DriverBuilder builder) {
		this.driverName = builder.driverName;
		this.maximize = builder.maximize;
		this.allowPopUP = builder.allowPopUP;
	}

	// all getters
	public String getDriverName() {
		return driverName;
	}

	public boolean isMaximize() {
		return maximize;
	}

	public String getAllowPopUP() {
		return allowPopUP;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", maximize=" + maximize + ", allowPopUP=" + allowPopUP + "]";
	}

	// static builder class
	public static class DriverBuilder {

		// mandatory parameter
		private String driverName;

		// optional parameter
		private boolean maximize;
		private String allowPopUP;

		// constructor with all mandatory fields
		public DriverBuilder(String driverName) {
			this.driverName = driverName;
		}

		// setters only for optional parameters

		public DriverBuilder setMaximize(boolean maximize) {
			this.maximize = maximize;
			return this;
		}

		public DriverBuilder setAllowPopUP(String allowPopUP) {
			this.allowPopUP = allowPopUP;
			return this;
		}

		public Driver build() {
			return new Driver(this);
		}

	}

}
