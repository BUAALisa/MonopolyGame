package main;

import jmp123.PlayBack;


public class Music {
	
	static void start() throws Exception{
		String url = "music/��������.mp3";
		PlayBack player = new PlayBack(new jmp123.output.Audio());
        player.open(url,"");
        player.start(true);
	}
}