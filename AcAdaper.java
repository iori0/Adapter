class AcAdaper extends Dengen{		//Adapter
	private JapaneseConsent con = new JapaneseConsent();
	public int kyuuden() {
		return (int)(con.power()*0.16);
	}
}
