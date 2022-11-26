# opentelemetry


# Observability in Distributed Systems
https://www.baeldung.com/distributed-systems-observability


# Test rest controller
http://localhost:8080/
Greetings from Spring Boot!my-microservice


# Jaeger UI
http://localhost:16686/search

# opentelemetry-java-instrumentation
https://github.com/open-telemetry/opentelemetry-java-instrumentation

java -javaagent:/c/git/otel/opentelemetry-javaagent.jar \
     -Dotel.resource.attributes=service.name=your-service-name \
     -Dotel.traces.exporter=jaeger \
     -jar target/jaegerauto-0.0.1-SNAPSHOT.jar
	 
