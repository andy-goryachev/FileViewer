// Copyright © 2024-2024 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.file;
import java.io.File;
import javafx.scene.layout.BorderPane;


/**
 * Preview Pane.
 */
public class PreviewPane
	extends BorderPane
{
	public PreviewPane()
	{
	}

	
	public void setItem(FEntry en)
	{
		if(en == null)
		{
			setCenter(null);
			return;
		}
		
		File f = en.getFile();
		
		
		// image -> image
		// video -> video player
		// directory -> ??
		// text -> text in utf8 (or choose encoding)
		// unknown -> hex
	}
}
