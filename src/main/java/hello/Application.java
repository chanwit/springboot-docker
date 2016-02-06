package hello;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public @ResponseBody Map<String, String> home() {
		return new HashMap<String, String>(){{
			put("edit", "docker world");
		}};
	}

        public static void main(String[] args) {
        	SpringApplication.run(Application.class, args);
        }
}
