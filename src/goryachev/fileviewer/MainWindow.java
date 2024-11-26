// Copyright © 2023-2024 Andy Goryachev <andy@goryachev.com>
package goryachev.fileviewer;
import goryachev.fileviewer.file.FEntry;
import goryachev.fileviewer.file.FileTreePane;
import goryachev.fileviewer.file.PreviewPane;
import goryachev.fx.FX;
import goryachev.fx.FxFramework;
import goryachev.fx.FxMenuBar;
import goryachev.fx.FxToolBar;
import goryachev.fx.FxWindow;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


/**
 * Application Framework demo window.
 */
public class MainWindow
	extends FxWindow
{
	private final int ICON_SIZE = 20;

	protected final TextField searchField;
	protected final FileTreePane tree;
	protected final PreviewPane preview;


	public MainWindow()
	{
		super("MainWindow");

		setTitle("File Viewer");
		setSize(1150, 800);

		searchField = new TextField();
		searchField.setPrefColumnCount(20);

		tree = new FileTreePane();

		preview = new PreviewPane();

		VBox vb = new VBox(createMenu(), createToolBar());
		
		SplitPane sp = new SplitPane(tree, preview);
		SplitPane.setResizableWithParent(tree, Boolean.FALSE);

		setTop(vb);
		setCenter(sp);
		setBottom(createStatusBar());
		
		FX.addInvalidationListener(tree.getSelection(), () ->
		{
			updateSelection(tree.getSelection());
		});
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


	private void newWindow()
	{
		new MainWindow().open();
	}
	
	
	private void updateSelection(List<FEntry> sel)
	{
		if(sel.size() == 1)
		{
			preview.setItem(sel.get(0));
		}
		else
		{
			preview.setItem(null);
		}
	}
}
