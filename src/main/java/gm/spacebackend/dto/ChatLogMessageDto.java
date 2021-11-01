package gm.spacebackend.dto;

public class ChatLogMessageDto {
	public String message;
	public MessageSource source;
	public String color;
}

enum MessageSource {
  USER, SYSTEM
}
