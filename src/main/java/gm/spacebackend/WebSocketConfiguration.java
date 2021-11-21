package gm.spacebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import lombok.AllArgsConstructor;

@Configuration
@ConfigurationProperties
@EnableWebSocketMessageBroker
@EnableConfigurationProperties(WebSocketProperties.class)
@AllArgsConstructor
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
    @Autowired
	private WebSocketProperties properties;

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker(properties.getTopicPrefix())
        	.setTaskScheduler(new DefaultManagedTaskScheduler())
        	.setHeartbeatValue(new long[] {5000, 5000});
        registry.setApplicationDestinationPrefixes(properties.getApplicationPrefix());
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint(properties.getEndpoint())
        .setAllowedOrigins(properties.getAllowedOrigins()).withSockJS();
    }
}