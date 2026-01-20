// Copyright © 2024-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.preview;
import goryachev.fdetect.FileFormatDetector;
import goryachev.fdetect.FileType;
import goryachev.fileviewer.file.FEntry;
import java.io.File;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;


/**
 * Preview Pane.
 */
public class PreviewPane
	extends BorderPane
{
	private ItemPreview preview;
	private static final FileFormatDetector detector = new FileFormatDetector();


	public PreviewPane()
	{
	}

	
	public void setItem(FEntry en)
	{
		if(preview != null)
		{
			preview.stop();
		}
		
		try
		{
			preview = create(en);
			if(preview == null)
			{
				setCenter(null);
				return;
			}
			else
			{
				setCenter(preview);	
			}
		}
		catch(Exception e)
		{
			// TODO
			setCenter(new Label(e.toString()));
		}
	}
	
	
	public static ItemPreview create(FEntry en) throws Exception
	{
		// TODO format detector
		if(en == null)
		{
			return null;
		}
		
		// image -> image
		// video -> video player
		// directory -> ??
		// text -> text in utf8 (or choose encoding)
		// unknown -> hex
		File f = en.getFile();
		FileType t = detectType(f);
		if(t.isVideo())
		{
			String uri = f.toURI().toString();
			Media m = new Media(uri);
			return new VideoPreview(en, m);
		}
		else if(t.isImage())
		{
			String uri = f.toURI().toString();
			Image im = new Image(uri);
			return new ImagePreview(en, im);
		}
		else
		{
			return new HexPreview(en);
		}
	}


	private static FileType detectType(File f) throws Exception
	{
		return detector.detect(f);
	}
}
