package draw.view;

import javax.swing.*;
import draw.controller.DrawController;
import java.awt.*;
import java.util.Hashtable;
import java.awt.event.*;

public class DrawAppPanel extends JPanel
{
	private DrawController app;
	private SpringLayout appLayout;
	
	private JScrollPane canvasPane;
	
	private JButton redButton;
	private JButton orangeButton;
	private JButton yellowButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton violetButton;
	private JButton blackButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton clearButton;
	
	private JLabel widthLabel;
	private JLabel imageLabel;
	
	private JSlider widthSlider;
	
	private JPanel colorPanel;
	private JPanel menuPanel;
	private DrawPanel canvas;
	
	private final int MINIMUM_LINE = 1;
	private final int MAXIMUM_LINE = 25;
	
	
	
	public DrawAppPanel(DrawController app)
	{
		super();
		this.app = app;
		canvas = new DrawPanel(app);
		
		redButton = new JButton ("Red");
		orangeButton = new JButton ("Orange");
		yellowButton = new JButton ("Yellow");
		greenButton = new JButton ("Green");
		blueButton = new JButton ("Blue");
		violetButton = new JButton ("Violet");
		blackButton = new JButton ("Black");
		loadButton = new JButton ("Load");
		saveButton = new JButton ("Save");
		clearButton = new JButton ("Clear");
		
		imageLabel = new JLabel();
		widthLabel = new JLabel("Width");
		
		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		
		colorPanel = new JPanel(new GridLayout(0,1));
		menuPanel = new JPanel(new GridLayout(0,1));
		
		
		setupMenuPanels();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupMenuPanels()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
