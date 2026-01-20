// Copyright © 2026-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer.preview;
import goryachev.fileviewer.file.FEntry;
import javafx.scene.layout.BorderPane;

/// ItemPreview
/// 
public abstract class ItemPreview extends BorderPane
{
	public abstract void stop();

	
	//
	
	
	private final FEntry entry;
	
	
	public ItemPreview(FEntry en)
	{
		this.entry = en;
	}
}
