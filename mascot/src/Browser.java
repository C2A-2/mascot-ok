
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.Duration;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser implements WindowListener {
	
  	private JFrame errorWindow;

	public Browser(String keyword){
		// driverの設定 chrome
  		//System.setProperty("webdriver.chrome.driver","C:/workspace/mascot/driver/chromedriver.exe");
  		
  		// driverの設定 edge
  		System.setProperty("webdriver.msedge.driver","C:/workspace/mascot/driver/msedgedriver.exe");
  		
  	    // Webdriverのインスタンスを作成 chrome
  	    //WebDriver driver = new ChromeDriver();  
  		
  		// Webdriverのインスタンスを作成 edge
  	    WebDriver driver = new EdgeDriver();  

  	    // 開くサイトのURLを設定する
  	    //driver.get("https://www.google.com");
  	    
  	    // 開くサイトのURLを設定する
  	    driver.get("https://www.google.com");
  	    
  	    System.out.println(keyword);
  	    
  	    
  	    // 入力フォームの要素を取得 chrome
  		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(keyword);

  		// 検索ボタンの要素を取得する chrome
  	    //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
  	    
  	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
  	    
  	    try {
  	    // 入力フォームの要素を取得 edge
  	    driver.findElement(By.xpath("//html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys(keyword);

  		// 検索ボタンの要素を取得する edge
  	    //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
  	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
  	    }catch(NoSuchElementException e){
  	    	System.out.println("ERROR");
  	    	driver.quit();
  	    	errorWindow = new JFrame("エラー");
  	    	//終了設定
  	    	errorWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  			
  			// サイズを設定
  	    	errorWindow.setSize(230, 150);
  			
  			//ウィンドウ位置座標
  	    	errorWindow.setLocation(500,250);
  	    	
  	    	//Container c = errorWindow.getContentPane();
  			
  			//ウィンドウアイコン設定
  	    	errorWindow.setIconImage(Character.iconMenu.getImage());
  			
  			// GUI画面の可視化
  	    	errorWindow.setVisible(true);
  			
  			//前面表示
  	    	errorWindow.setAlwaysOnTop(true);
  	    	
  	    	errorWindow.addWindowListener(this);
  	    	
  	    	JLabel errormessage=new JLabel("<html><body>要素が見つかりません。<br/>ページ内の要素が変更された<br/>可能性があります。</body></html>");
  	    	errormessage.setFont(new Font("Arial",Font.PLAIN,15));
  	    	errormessage.setForeground(Color.RED);
  	    	errorWindow.add(errormessage);
  	    	//c.add(errorWindow,BorderLayout.CENTER);
  	    	
  	    	Character.windowCheck=true;
  	    	
  	    }
  	    
  	    
  	    }

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		Character.windowCheck=false;
		errorWindow.dispose();
	    System.out.println("エラーウィンドウ閉じる");
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
