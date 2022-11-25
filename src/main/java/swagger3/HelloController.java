package swagger3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.opentracing.Span;
import io.opentracing.Tracer;

@RestController
public class HelloController {

	@Autowired
	Tracer tracer;
	
    @Value("${spring.application.name}")
    private String appName;
	
    @RequestMapping("/")
    public String index() {
    	Span span = tracer.buildSpan("my-span").start();
    	// Some code for which which the span needs to be reported
    	span.finish();
    	StringBuilder stringBuilder = new StringBuilder(100);
    	stringBuilder.append("Greetings from Spring Boot!");
    	stringBuilder.append(appName);
        return stringBuilder.toString();
    }

}