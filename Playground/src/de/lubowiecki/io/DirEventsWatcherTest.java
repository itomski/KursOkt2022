package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;

import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchService;

public class DirEventsWatcherTest {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		Path p = Paths.get("data");
		
		// Beobachter
		try {
			WatchService watcher = FileSystems.getDefault().newWatchService();
			
			p.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
			
			
			WatchKey key;
			while((key = watcher.take()) != null) {
				for(WatchEvent event : key.pollEvents()) {
					System.out.println(event.kind() + ": " + event.context());
				}
				key.reset();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");

	}

}
