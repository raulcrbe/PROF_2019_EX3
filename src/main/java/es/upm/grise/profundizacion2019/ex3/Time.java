package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {	
	protected  LocalDateTime time;
	
	protected Time(LocalDateTime t) {
		time = t;
	}
	
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		return formatter.format(time.plusSeconds(seconds));	
	}

}
