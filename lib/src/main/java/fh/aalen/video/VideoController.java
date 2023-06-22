package fh.aalen.video;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VideoController {
	@Autowired
	VideoService videoService;

	@GetMapping("/videos")
	public List<Video> getVideoList() {
		return videoService.getVideoList();
	}

	@GetMapping("/videos/{title}")
	public Video getVideo(@PathVariable String title) {
		return videoService.getVideo(title);
	}
	
	@PostMapping("/videos")
	public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}

	@PutMapping("/videos/{title}")
	public void updateVideo(@PathVariable String title, @RequestBody Video video) {
		videoService.updateVideo(title, video);
	}

	@DeleteMapping("/videos/{title}")
	public void deleteVideo(@PathVariable String title) {
		videoService.deleteVideo(title);
	}
	@GetMapping("/videosbygenre/{genre}")
	public List<Video> getAllVideosOfGenre(@PathVariable String genre) {
	return videoService.getAllVideosOfGenre(genre);
	}
	@GetMapping("/videogenres")
	public List<GenresOnly> getAllGenres() {
	return videoService.getAllGenres();
	}
	
	
}
