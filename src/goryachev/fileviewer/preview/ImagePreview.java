// Copyright © 2026-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.preview;
import goryachev.fileviewer.file.FEntry;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


/// ImagePreview
public class ImagePreview
	extends ItemPreview
{
	public ImagePreview(FEntry en, Image im)
	{
		super(en);
		
		ImageView v = new ImageView(im);
		v.setSmooth(true);
		v.setPreserveRatio(true);
		BorderPane p = new BorderPane(v);
		p.setMinHeight(0);
		p.setMinWidth(0);
		v.fitHeightProperty().bind(heightProperty());
		v.fitWidthProperty().bind(widthProperty());
		
		setCenter(p);
	}
	

	@Override
	public void stop()
	{
	}
}
