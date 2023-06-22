package fh.aalen.video;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
public interface VideoRepository extends JpaRepository<Video, String>{
	public List<Video> findByGenreOrderByTitle(String genre);
	
	public List<GenresOnly> findAllProjectedBy();
}
