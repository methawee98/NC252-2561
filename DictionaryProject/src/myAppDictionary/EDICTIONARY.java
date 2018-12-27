package myAppDictionary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.JTable;
import java.awt.Label;
import java.awt.List;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class EDICTIONARY {
	String[] text = new String[3];
	private JFrame frmEdictionary;
	private JTextField textField;
	private JTextField txtMeaning;
	private JTextField textField_3;
	static linkVorcab test = new linkVorcab(30);
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JButton btnSave;
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		  FileReader file = new FileReader("vocab.txt");
		  BufferedReader Readf = new BufferedReader(file);
		  String text ;
		  while ((text = Readf.readLine()) != null) {
			  String[] tokens = text.split("\t");
			  test.insert(tokens[0],tokens[1],tokens[2]);
		  }
		  file.close();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EDICTIONARY window = new EDICTIONARY();
					window.frmEdictionary.setVisible(true);
					window.frmEdictionary.setSize(770, 400);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EDICTIONARY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdictionary = new JFrame();
		frmEdictionary.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Methawee\\Downloads\\avatar (2).png"));
		frmEdictionary.addWindowListener(new WindowAdapter() {
		
		});
		frmEdictionary.setType(Type.UTILITY);
		frmEdictionary.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmEdictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEdictionary.setTitle("e-Dictionary");
		frmEdictionary.getContentPane().setBackground(new Color(173, 216, 230));
		frmEdictionary.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(test.find(textField.getText())!=null) {
					textField_3.setText(test.find(textField.getText()));
					textField_1.setText("");
					textField_2.setText("");
					textField_4.setText("");
				}
				
			}
		});
        
		
		textField.setBackground(new Color(175, 238, 238));
		textField.setBounds(154, 58, 370, 36);
		frmEdictionary.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPleaseEnterVocabulary = new JLabel("Please Enter Vocabulary");
		lblPleaseEnterVocabulary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPleaseEnterVocabulary.setBounds(154, 11, 251, 36);
		frmEdictionary.getContentPane().add(lblPleaseEnterVocabulary);
		
		txtMeaning = new JTextField();
		txtMeaning.setBackground(new Color(173, 216, 230));
		txtMeaning.setEditable(false);
		txtMeaning.setText("Word/parts of speech/Meaning");
		txtMeaning.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeaning.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtMeaning.setColumns(10);
		txtMeaning.setBounds(26, 201, 689, 34);
		frmEdictionary.getContentPane().add(txtMeaning);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.info);
		textField_3.setBounds(26, 246, 689, 107);
		frmEdictionary.getContentPane().add(textField_3);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText()!=null&&textField_2.getText()!=null&&textField_4.getText()!=null) {
					 test.insert(textField_1.getText(), textField_4.getText(), textField_2.getText());
					 textField_3.setText("add success! \n " +textField_1.getText()+" "+textField_2.getText()+""
					 				+textField_4.getText());
				}
				else textField_3.setText("add fail Please check");
			}
		});
		btnAdd.setForeground(new Color(255, 255, 240));
		btnAdd.setBackground(new Color(152, 251, 152));
		btnAdd.setBounds(534, 65, 89, 23);
		frmEdictionary.getContentPane().add(btnAdd);
		
		JButton button = new JButton("Delete");
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null) {
					test.delete(textField.getText());
					textField_3.setText("Delete Success : "+test.find(textField.getText()));
				}
				else textField_3.setText("Delete fail");
			}
		});
		button.setBackground(new Color(250, 128, 114));
		button.setBounds(626, 65, 89, 23);
		frmEdictionary.getContentPane().add(button);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(55, 105, 161, 36);
		frmEdictionary.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(226, 105, 140, 36);
		frmEdictionary.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setBounds(376, 105, 339, 85);
		frmEdictionary.getContentPane().add(textField_4);
		
		JButton button_1 = new JButton("EDIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText()!=null) {
					textField_1.setText(test.getWord(textField.getText()));
					textField_2.setText(test.getType(textField.getText()));
					textField_4.setText(test.getMean(textField.getText()));
					text[0]= test.getWord(textField.getText());
					text[1]= test.getType(textField.getText());
					text[2]= test.getMean(textField.getText());
				}
				else textField_3.setText("Edit fail");
			}
			
		});
		button_1.setForeground(new Color(255, 255, 240));
		button_1.setBackground(new Color(152, 251, 152));
		button_1.setBounds(55, 65, 89, 23);
		frmEdictionary.getContentPane().add(button_1);
		
		btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 test.update(textField.getText(), text[0], textField_1.getText());
			 test.update(textField.getText(), text[1], textField_2.getText());
			 test.update(textField.getText(), text[2], textField_4.getText());
			 textField_3.setText("just UPDATE : "+test.find(textField_1.getText()));
			}
		});
		btnSave.setForeground(new Color(255, 255, 240));
		btnSave.setBackground(Color.PINK);
		btnSave.setBounds(65, 152, 89, 23);
		frmEdictionary.getContentPane().add(btnSave);
		//frmEdictionary.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmEdictionary.getContentPane(), textField, lblPleaseEnterVocabulary, txtMeaning}));
	}
}
