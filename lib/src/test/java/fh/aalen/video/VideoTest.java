package fh.aalen.video;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import fh.aalen.video.Video;

class VideoTest {

	@Test
	void settingUniquqIdsShouldWork() {
		Video video1 = new Video("Title 1", 18, "Description 1", "Genre 1");
        Video video2 = new Video("Title 2", 12, "Description 2", "Genre 2");
        Video video3 = new Video("Title 3", 16, "Description 3", "Genre 3");
        Video video4 = new Video("Title 4", 14, "Description 4", "Genre 4");

        Set<String> ids = new HashSet<>();
        ids.add(video1.getTitle());
        ids.add(video2.getTitle());
        ids.add(video3.getTitle());
        ids.add(video4.getTitle());

        assertEquals(4, ids.size()); // Assert that there are 4 unique IDs
	}
	
	@Test
	void settingRedundandIdsShouldNotWork() {
		Video video1 = new Video("Title 1", 18, "Description 1", "Genre 1");
        Video video2 = new Video("Title 1", 18, "Description 2", "Genre 2");
        Video video3 = new Video("Title 3", 16, "Description 3", "Genre 3");
        Video video4 = new Video("Title 4", 14, "Description 4", "Genre 4");

        Set<String> ids = new HashSet<>();
        ids.add(video1.getTitle());
        ids.add(video2.getTitle());
        ids.add(video3.getTitle());
        ids.add(video4.getTitle());

        assertEquals(4, ids.size()); // Assert that there are 4 unique IDs
	}
	
	@Test
	void IdShouldBeString() {
		Video video1 = new Video("Title 1", 18, "Description 1", "Genre 1");
		
		assertTrue(video1.getTitle() instanceof String);
	}
	
	@Test
	void IdShouldNotBeNull() {
		Video video1 = new Video(null, 18, "Description 1", "Genre 1");
		
		assertNotNull(video1.getTitle());
	}
}
