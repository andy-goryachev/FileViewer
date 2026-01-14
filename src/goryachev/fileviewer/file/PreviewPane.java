// Copyright © 2024-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.file;
import goryachev.common.util.D;
import java.io.File;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


/**
 * Preview Pane.
 */
public class PreviewPane
	extends BorderPane
{
	private MediaPlayer player;


	public PreviewPane()
	{
	}

	
	public void setItem(FEntry en)
	{
		if(player != null)
		{
			stop();
		}
		
		if(en == null)
		{
			setCenter(null);
			return;
		}
		
		File f = en.getFile();
		
		String uri = f.toURI().toString();
		Media media;
		try
		{
			media = new Media(uri);
			
			MediaPlayer p = new MediaPlayer(media);
			D.print("media player=" + p);
			p.currentTimeProperty().addListener((s,pr,c) ->
			{
//				D.print(c);
//				Duration time = player.getCurrentTime();
//				timeField.setText(Utils.formatTime(time));
//				
//				Duration duration = player.getTotalDuration();
//				durationField.setText(Utils.formatTime(duration));
//						
//				timeSlider.setValue(time.toMillis() / duration.toMillis());
			});
			p.setOnEndOfMedia(() ->
			{
				D.print();
//				nextTrack();
			});

			p.play();
			p.statusProperty().addListener((x) ->
			{
				D.print(p.getStatus());
				//updateStatus();
			});
			
			MediaView v = new MediaView(p);
			v.setPreserveRatio(true);

			BorderPane bp = new BorderPane(v);
			v.fitHeightProperty().bind(bp.heightProperty());
			v.fitWidthProperty().bind(bp.widthProperty());

			BorderPane bk = new BorderPane(bp);
			//bk.setBackground(Background.fill(Color.gray(10)));

			setCenter(bp);
			player = p;
		}
		catch(Exception e)
		{
			setCenter(new Label(e.toString()));
		}
		
		// image -> image
		// video -> video player
		// directory -> ??
		// text -> text in utf8 (or choose encoding)
		// unknown -> hex
	}
	
	
	private void stop()
	{
		if(player != null)
		{
			player.stop();
			player.dispose();
			player = null;
		}
	}
}
