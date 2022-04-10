package inTerface;

public abstract interface YouTuber {
	
	abstract void makeVideo();
	
	default void uplodeVideo() {
		System.out.println("Uplode the video");
	}

}
