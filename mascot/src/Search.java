
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Search extends JFrame implements ActionListener ,WindowListener{
	
	JFrame searchWindow = new JFrame("検索ウィンドウ");
	
	JTextField txfield = new JTextField(30);		// 最大30文字分のテキストボックス
	JButton resetButton = new JButton("リセット");	// 初期化ボタン
	JButton submitButton = new JButton("検索");		//検索ボタン
	//ImageIcon iconMenu = new ImageIcon("icon.jpg");
	
	//キーワード受け渡し用
	String keyword;
	
	public Search(){
		
		// GUI画面の設定
		searchWindow.getContentPane().setLayout(new FlowLayout());
		// テキストボックス設置
		searchWindow.getContentPane().add(txfield);
				
		// リセットボタンの設置
		searchWindow.getContentPane().add(resetButton);
				
		// 送信ボタンの設置
		searchWindow.getContentPane().add(submitButton);
				
		// リセットボタンの処理設定
		resetButton.addActionListener(this);
				
		// 送信ボタンの処理設定
		submitButton.addActionListener(this);
		
		// サイズを設定
		searchWindow.setSize(400, 100);
		
		//表示位置
		//searchWindow.setLocation(880,410);
		searchWindow.setLocation(450,250);
		
		//ウィンドウアイコン設定
		searchWindow.setIconImage(Character.iconMenu.getImage());
				
		// GUI画面の可視化
		searchWindow.setVisible(true);
		
		//前面表示
		searchWindow.setAlwaysOnTop(true);
		
		searchWindow.addWindowListener(this);
		
		
	}
	
	//ボタンクリック時処理
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton) {
			// リセットボタン押下時は、テキストボックス初期化
			txfield.setText("");
		}else if(e.getSource() == submitButton) {
			// 検索ボタン押下時
			
			keyword=txfield.getText();
			
			System.out.println(keyword);
			
			Character.windowCheck=false;
			
			searchWindow.dispose();
			
			new Browser(keyword);
			
		    }
		}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		searchWindow.dispose();
		System.out.println("プルダウンウィンドウ閉じる");
		Character.windowCheck=false;
		Main.closingCheck();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
