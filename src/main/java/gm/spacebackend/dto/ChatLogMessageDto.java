package gm.spacebackend.dto;

public class ChatLogMessageDto {
	public String message;
	public MessageSource source;
}

enum MessageSource {
  USER, SYSTEM
}
