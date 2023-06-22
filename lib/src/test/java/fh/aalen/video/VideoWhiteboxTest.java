package fh.aalen.video;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fh.aalen.video.Video;
import fh.aalen.person.Person;

public class VideoWhiteboxTest {

    @Test
    public void testGettersAndSetters() {
        // Create a Video object
        Video video = new Video();

        // Test the getters and setters
        video.setTitle("Video Title");
        assertEquals("Video Title", video.getTitle());

        video.setAge_rating(18);
        assertEquals(18, video.getAge_rating());

        video.setDescription("Video Description");
        assertEquals("Video Description", video.getDescription());

        video.setGenre("Action");
        assertEquals("Action", video.getGenre());
    }

    @Test
    public void testPersonFavourites() {
        // Create a Video object
        Video video = new Video();

        // Create a Person object
        Person person = new Person();
        person.setSurename("John");

        // Add the Person to the Video's personFavourites list
        video.getPersonFavourites().add(person);

        // Check if the Person is in the Video's personFavourites list
        assertTrue(video.getPersonFavourites().contains(person));

        // Remove the Person from the Video's personFavourites list
        video.getPersonFavourites().remove(person);

        // Check if the Person is no longer in the Video's personFavourites list
        assertFalse(video.getPersonFavourites().contains(person));
    }
}

