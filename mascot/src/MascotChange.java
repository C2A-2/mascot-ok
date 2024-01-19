import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MascotChange extends JFrame implements ActionListener,WindowListener {

	JFrame mascotChangeWindow = new JFrame("画像切替");
	JRadioButton radio1;
	JRadioButton radio2;
	
	ImageIcon left1A = new ImageIcon("walk1A.png");
	ImageIcon left2A = new ImageIcon("walk2A.png");
	ImageIcon left3A = new ImageIcon("walk3A.png");
	ImageIcon left4A = new ImageIcon("walk4A.png");
	ImageIcon left5A = new ImageIcon("walk5A.png");
	ImageIcon left6A = new ImageIcon("walk6A.png");
	ImageIcon left7A = new ImageIcon("walk7A.png");
	ImageIcon right1A = new ImageIcon("walk1AR.png");
	ImageIcon right2A = new ImageIcon("walk2AR.png");
	ImageIcon right3A = new ImageIcon("walk3AR.png");
	ImageIcon right4A = new ImageIcon("walk4AR.png");
	ImageIcon right5A = new ImageIcon("walk5AR.png");
	ImageIcon right6A = new ImageIcon("walk6AR.png");
	ImageIcon right7A = new ImageIcon("walk7AR.png");
	ImageIcon dragg1A = new ImageIcon("drag1A.png");
	ImageIcon dragg2A = new ImageIcon("drag2A.png");
	ImageIcon pauseA = new ImageIcon("topA.png");
	ImageIcon iconMenuA = new ImageIcon("iconA.png");
	
	ImageIcon left1B = new ImageIcon("walk1B.png");
	ImageIcon left2B = new ImageIcon("walk2B.png");
	ImageIcon left3B = new ImageIcon("walk3B.png");
	ImageIcon left4B = new ImageIcon("walk4B.png");
	ImageIcon left5B = new ImageIcon("walk5B.png");
	ImageIcon left6B = new ImageIcon("walk6B.png");
	ImageIcon left7B = new ImageIcon("walk7B.png");
	ImageIcon right1B = new ImageIcon("walk1BR.png");
	ImageIcon right2B = new ImageIcon("walk2BR.png");
	ImageIcon right3B = new ImageIcon("walk3BR.png");
	ImageIcon right4B = new ImageIcon("walk4BR.png");
	ImageIcon right5B = new ImageIcon("walk5BR.png");
	ImageIcon right6B = new ImageIcon("walk6BR.png");
	ImageIcon right7B = new ImageIcon("walk7BR.png");
	ImageIcon dragg1B = new ImageIcon("drag1B.png");
	ImageIcon dragg2B = new ImageIcon("drag2B.png");
	ImageIcon pauseB = new ImageIcon("topB.png");
	ImageIcon iconMenuB = new ImageIcon("iconB.png");
	
	
	
	public MascotChange() {
		
		if(Character.radioButtonCheck==true) {
			radio1 = new JRadioButton("メイド", true);
			radio2 = new JRadioButton("ライスシャワー");
		}else {
			radio1 = new JRadioButton("メイド");
			radio2 = new JRadioButton("ライスシャワー", true);
		}
		
		// GUI画面の設定
		mascotChangeWindow.setLayout(new FlowLayout());
				
		// サイズを設定
		mascotChangeWindow.setSize(300, 70);
				
		//表示位置
		mascotChangeWindow.setLocation(450,250);
						
		//ウィンドウアイコン設定
		mascotChangeWindow.setIconImage(Character.iconMenu.getImage());
								
		// GUI画面の可視化
		mascotChangeWindow.setVisible(true);
						
		//前面表示
		mascotChangeWindow.setAlwaysOnTop(true);
		
		//WindowListener登録
		mascotChangeWindow.addWindowListener(this);
		
		//ラジオボタン追加
		mascotChangeWindow.add(radio1);
		mascotChangeWindow.add(radio2);
		
		//ラジオボタングループ化
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(radio1);
		bgroup.add(radio2);
		
		//addActionListener登録
		radio1.addActionListener(this);
		radio2.addActionListener(this);
		
		radio1.setBounds(50,50,70,50);
		radio2.setBounds(140,50,150,50);
		
		//決定ボタンの生成
		JButton btn = new JButton("決定");
		
		//決定ボタン
		mascotChangeWindow.add(btn);
				
		//ボタン座標
		btn.setBounds(200,50,70,30);
						
		// ボタン押下時の処理を設定
		btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (radio1.isSelected()) {
        			//メイド
        			Character.left1=left1A;
        			Character.left2=left2A;
        			Character.left3=left3A;
        			Character.left4=left4A;
        			Character.left5=left5A;
        			Character.left6=left6A;
        			Character.left7=left7A;
        			Character.right1=right1A;
        			Character.right2=right2A;
        			Character.right3=right3A;
        			Character.right4=right4A;
        			Character.right5=right5A;
        			Character.right6=right6A;
        			Character.right7=right7A;
        			Character.dragg1=dragg1A;
        			Character.dragg2=dragg2A;
        			Character.pause=pauseA;
        			Character.iconMenu = iconMenuA;
        			Character.radioButtonCheck=true;
        		}else if (radio2.isSelected()){
        			//アンドロイド
        			Character.left1=left1B;
        			Character.left2=left2B;
        			Character.left3=left3B;
        			Character.left4=left4B;
        			Character.left5=left5B;
        			Character.left6=left6B;
        			Character.left7=left7B;
        			Character.right1=right1B;
        			Character.right2=right2B;
        			Character.right3=right3B;
        			Character.right4=right4B;
        			Character.right5=right5B;
        			Character.right6=right6B;
        			Character.right7=right7B;
        			Character.dragg1=dragg1B;
        			Character.dragg2=dragg2B;
        			Character.pause=pauseB;
        			Character.iconMenu = iconMenuB;
        			Character.radioButtonCheck=false;
        		}
            	mascotChangeWindow.dispose();
    			Character.windowCheck=false;
    			System.out.println("決定ボタン押下");
    			Main.closingCheck();
            }
        });
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		mascotChangeWindow.dispose();
		System.out.println("プルダウンウィンドウ閉じる");
		System.out.println(Character.windowCheck);
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
