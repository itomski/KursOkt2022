package de.lubowiecki.threads;

import java.time.LocalDateTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockingQueueTest {

	public static void main(String[] args) {
		
		BlockingQueue<Request> queue = new ArrayBlockingQueue<>(5, true);
		
		Client client = new Client(queue);
		Server server = new Server(queue);
		
		new Thread(client).start();
		new Thread(server).start();

	}
}

class Request {
	
	private final LocalDateTime createdAt;
	
	private final RequestType type;
	
	private final String uri;

	public Request(RequestType type, String uri) {
		this.createdAt = LocalDateTime.now();
		this.type = type;
		this.uri = uri;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public RequestType getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [createdAt=");
		builder.append(createdAt);
		builder.append(", type=");
		builder.append(type);
		builder.append(", uri=");
		builder.append(uri);
		builder.append("]");
		return builder.toString();
	}
}

enum RequestType {
	
	GET, POST, PUT, DELETE;
	
}

class Server  implements Runnable {

	private final Logger LOG = Logger.getLogger("Server");
	
	private final BlockingQueue<Request> channel;
	
	public Server(BlockingQueue<Request> queue) {
		LOG.setLevel(Level.INFO);
		this.channel = queue;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				Request r = channel.take(); // Entnimmt ein Element aus der Warteschlange
				LOG.info("Request: (" + r + ")");
				
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Client implements Runnable {
	
	private final Logger LOG = Logger.getLogger("Client");
	
	private final BlockingQueue<Request> channel;
	
	public Client(BlockingQueue<Request> queue) {
		LOG.setLevel(Level.INFO);
		this.channel = queue;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				// Fügt ein Element in die Warteschlange
				channel.put(new Request(RequestType.GET, "https://www.xyz.de/index.html"));
	//			LOG.severe("..."); // Schwerwigende Fehler
	//			LOG.warning("..."); // Warnungen
				LOG.info("Request wurde abgeschickt."); // Informationen
	//			LOG.config("..."); // Konfiguration
	//			LOG.fine("Ein GET-Request an https://www.xyz.de/index.html wurde abgeschickt"); // Fein
	//			LOG.finer("..."); // feiner
	//			LOG.finest("..."); // Noch feiner
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}