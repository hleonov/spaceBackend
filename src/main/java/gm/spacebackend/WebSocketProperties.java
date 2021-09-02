package gm.spacebackend;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("app.websocket")
public class WebSocketProperties {
    /**
     * Prefix used for WebSocket destination mappings
     */
    private String applicationPrefix = "/topic";
    /**
     * Prefix used by topics
     */
    private String topicPrefix = "/topic";
    /**
     * Endpoint that can be used to connect to
     */
    private String endpoint = "/live";
    /**
     * Allowed origins
     */
    private String[] allowedOrigins = new String[0];
    
	public String getApplicationPrefix() {
		return applicationPrefix;
	}
	public void setApplicationPrefix(String applicationPrefix) {
		this.applicationPrefix = applicationPrefix;
	}
	public String getTopicPrefix() {
		return topicPrefix;
	}
	public void setTopicPrefix(String topicPrefix) {
		this.topicPrefix = topicPrefix;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String[] getAllowedOrigins() {
		return allowedOrigins;
	}
	public void setAllowedOrigins(String[] allowedOrigins) {
		this.allowedOrigins = allowedOrigins;
	}

}