
public class Client {

	public static void main(String[] args) {
		Dengen dengen;

		dengen = new AcAdaper();
		int denatsu = dengen.kyuuden();
		System.out.println(denatsu + "Vで給電されています");
	}
}
