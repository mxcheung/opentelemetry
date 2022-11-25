package swagger3;

import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.opentracing.Tracer;

public class HelloWorldConfig {

	@Bean
	public Tracer getTracer() {
		Configuration.SamplerConfiguration samplerConfig = Configuration.SamplerConfiguration.fromEnv()
				.withType("const").withParam(1);
		Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv()
				.withLogSpans(true);
		Configuration config = new Configuration("math-service").withSampler(samplerConfig)
				.withReporter(reporterConfig);
		return config.getTracer();
	}

}
