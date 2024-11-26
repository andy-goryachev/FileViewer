// Copyright © 2024 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer;
import goryachev.fx.FxWindow;


/**
 * Secondary Window.
 */
public class SecondaryWindow extends FxWindow
{
	public static final String NAME = "SecondaryWindow";
	
	
	public SecondaryWindow()
	{
		super(NAME);
		
		setSize(600, 300);
		setTitle("Secondary Window");
		setNonEssentialWindow();
	}
}