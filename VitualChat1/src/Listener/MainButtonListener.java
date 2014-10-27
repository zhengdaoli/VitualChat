package Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MainButtonListener implements MouseListener{

	private JButton search,info,startchat,set,exit=new JButton();
	
	public MainButtonListener(JButton search,JButton info,JButton startchat,JButton set,JButton exit) {
		// TODO Auto-generated constructor stub
		this.search=search;
		this.info=info;
		this.startchat=startchat;
		this.set=set;
		this.exit=exit;		
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==search){
			
		}
		else if(e.getSource()==info){
			
		}
		else if(e.getSource()==startchat){
			
		}
		else if(e.getSource()==set){
			
		}
		else if(e.getSource()==exit){
			System.exit(0);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton jb1=new JButton();
		
		if(e.getSource()==search){
			
		jb1 = (JButton)e.getSource();
		jb1.setIcon(new ImageIcon("img/search_small.png"));
			
			
		}
		else if(e.getSource()==info){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/info_small.png"));
		}
		else if(e.getSource()==startchat){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/startchat_small.png"));
		}
		else if(e.getSource()==set){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/set_small.png"));
		}
		else if(e.getSource()==exit){
			
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/exit_small.png"));
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton jb1=new JButton();
		
		if(e.getSource()==search){
			
		jb1 = (JButton)e.getSource();
		jb1.setIcon(new ImageIcon("img/search_big.png"));		
		}
		else if(e.getSource()==info){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/info_big.png"));
		}
		else if(e.getSource()==startchat){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/startchat_big.png"));
		}
		else if(e.getSource()==set){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/set_big.png"));
		}
		else if(e.getSource()==exit){
			
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/exit_big.png"));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton jb1=new JButton();
		
		if(e.getSource()==search){
			
		jb1 = (JButton)e.getSource();
		jb1.setIcon(new ImageIcon("img/search_big.png"));
			
			
		}
		else if(e.getSource()==info){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/info_big.png"));
		}
		else if(e.getSource()==startchat){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/startchat_big.png"));
		}
		else if(e.getSource()==set){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/set_big.png"));
		}
		else if(e.getSource()==exit){
			
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/exit_big.png"));
		}
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton jb1=new JButton();
		
		if(e.getSource()==search){
			
		jb1 = (JButton)e.getSource();
		jb1.setIcon(new ImageIcon("img/search_small.png"));
			
			
		}
		else if(e.getSource()==info){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/info_small.png"));
		}
		else if(e.getSource()==startchat){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/startchat_small.png"));
		}
		else if(e.getSource()==set){
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/set_small.png"));
		}
		else if(e.getSource()==exit){
			
			jb1 = (JButton)e.getSource();
			jb1.setIcon(new ImageIcon("img/exit_small.png"));
		}
		
	}

}
