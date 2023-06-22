package fh.aalen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/")
public String sayHello() {
	return "Hey folks!";
}
@GetMapping("/bye")
public String sayBye() {
	return "Adiots!";
}
@GetMapping("/goodnight")
public String sayGoodnight() {
	return "Schlaf gut!";
}
}
