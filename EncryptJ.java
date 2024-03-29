import java.util.*;


public class EncryptJ {
	public static void main (String[] args){
		int[] key = {5, 12, -3, 8, -9, 4, 10};
		Integer keyValue;
		String encoded = "", decoded = "";
		String message = "All programmers are playwrights and all " + 
			"computers are lousy actors.";
		Queue<Integer> encodingQueue = new LinkedList<Integer>();
		Queue<Integer> decodingQueue = new LinkedList<Integer>();

		//Load key queues
		for (int scan = 0; scan < key.length; scan++){
			encodingQueue.add(key[scan]);
			decodingQueue.add(key[scan]);
		}
		
		//Encode message
		for (int scan = 0; scan < message.length(); scan++){
			keyValue = encodingQueue.remove();
			encoded += (char) (message.charAt(scan) + keyValue);
			encodingQueue.add(keyValue);
		}

		System.out.println("Encoded Message:\n" + encoded +"\n");

		//Decode message
		for (int scan = 0; scan < encoded.length(); scan++){
			keyValue = decodingQueue.remove();
			decoded += (char) (encoded.charAt(scan) - keyValue);
			decodingQueue.add(keyValue);
		}

		System.out.println("Decoded Message:\n" + decoded +"\n");

	}
}
