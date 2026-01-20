// Copyright © 2026-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.preview;
import goryachev.common.util.D;
import goryachev.fileviewer.file.FEntry;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;


/// Video Preview
///
public class VideoPreview extends ItemPreview
{
	private MediaPlayer player;

	
	public VideoPreview(FEntry en, Media media)
	{
		super(en);
		
		player = new MediaPlayer(media);
		D.print("media player=" + player);
		player.currentTimeProperty().addListener((s,pr,c) ->
		{
//			D.print(c);
//			Duration time = player.getCurrentTime();
//			timeField.setText(Utils.formatTime(time));
//			
//			Duration duration = player.getTotalDuration();
//			durationField.setText(Utils.formatTime(duration));
//					
//			timeSlider.setValue(time.toMillis() / duration.toMillis());
		});
		player.setOnEndOfMedia(() ->
		{
			D.print();
//			nextTrack();
		});

		player.play();
		player.statusProperty().addListener((x) ->
		{
			D.print(player.getStatus());
			//updateStatus();
		});
		
		MediaView v = new MediaView(player);
		v.setPreserveRatio(true);
		BorderPane p = new BorderPane(v);
		p.setMinHeight(0);
		p.setMinWidth(0);
		v.fitHeightProperty().bind(heightProperty());
		v.fitWidthProperty().bind(widthProperty());
		
		setCenter(p);
		setBackground(Background.fill(Color.BLACK));
	}
	

	@Override
	public void stop()
	{
		player.stop();
		player.dispose();
	}
}
