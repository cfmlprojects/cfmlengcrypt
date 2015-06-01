package cfmlengcrypt;

public class Main {

	public static void main(String[] args) {
		if (args.length > 1) {
			if (args[0].toLowerCase().equals("railo") | args[0].toLowerCase().equals("lucee")) {
				RailoEncrypt.encrypt(args[1]);
			} else if (args[0].toLowerCase().equals("sha")) {
				ShaHash.encrypt(args[1]);
			} else if (args[0].toLowerCase().equals("acf")) {
				ACFDSNEncrypt.encrypt(args[1]);
			} else {
				throw new RuntimeException("Unknown type: " + args[0]);
			}

		} else {
			System.out.println("Usage:");
			System.out.println("java -jar cfmlengcrypt lucee somepassword");
			System.out.println("java -jar cfmlengcrypt railo somepassword");
			System.out.println("java -jar cfmlengcrypt acf somepassword");
			System.out.println("java -jar cfmlengcrypt sha somepassword");
		}
	}

}