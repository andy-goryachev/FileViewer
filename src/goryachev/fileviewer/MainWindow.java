// Copyright © 2023-2024 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer;
import goryachev.fx.FxFramework;
import goryachev.fx.FxMenuBar;
import goryachev.fx.FxToolBar;
import goryachev.fx.FxWindow;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


/**
 * Application Framework demo window.
 */
public class MainWindow extends FxWindow
{
	private final int ICON_SIZE = 20;

	protected final TextField searchField;
	protected final TreeTableWithPreviewPane treeView;
	
	
	public MainWindow()
	{
		super("MainWindow");
		
		setTitle("File Viewer");
		setSize(1150, 800);
		
		searchField = new TextField();
		searchField.setPrefColumnCount(20);

		treeView = new TreeTableWithPreviewPane();
		
		VBox vb = new VBox
		(
			createMenu(),
			createToolBar()
		);
		
		setTop(vb);
		setCenter(treeView);
		setBottom(createStatusBar());
	}
	
	
	private FxMenuBar createMenu()
	{
		FxMenuBar m = new FxMenuBar();
		// file
		m.menu("File");
		m.separator();
		m.item("Close Window", this::close);
		m.separator();
		m.item("Quit", FxFramework::exit);
		// edit
		m.menu("Edit");
		m.item("Undo");
		m.item("Redo");
		m.separator();
		m.item("Cut");
		m.item("Copy");
		m.item("Paste");
		// window
		m.menu("Window");
		m.item("New Window", this::newWindow);
		// help
		m.menu("Help");
		m.item("About");
		return m;
	}
	
	
	private FxToolBar createToolBar()
	{
		FxToolBar t = new FxToolBar();
		t.add(new Button("Btn 2"));
		t.add(new Button("Btn 3"));
		t.add(new Button("Btn 4"));
		t.fill();
		t.add(new Label("Find: "));
		t.add(searchField);
		return t;
	}
	
	
	private Node createStatusBar()
	{
		BorderPane p = new BorderPane();
		p.setRight(new Label("     " + FileViewerApp.COPYRIGHT + "     "));
		return p;
	}
	
	
	protected void newWindow()
	{
		new MainWindow().open();
	}
}
