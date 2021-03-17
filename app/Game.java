package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.GridLayout;

public class Game extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JButton btn1 = new JButton("");
	private final JButton btn4 = new JButton("");
	private final JButton btn2 = new JButton("");
	private final JButton btn3 = new JButton("");
	private final JButton btn5 = new JButton("");
	private final JButton btn6 = new JButton("");
	private final JButton btn7 = new JButton("");
	private final JButton btn8 = new JButton("");
	private final JButton btn9 = new JButton("");
	private final JLabel lbl_player1 = new JLabel("Player O:");
	private final JLabel lbl_score1 = new JLabel("0");
	private final JLabel lbl_player2 = new JLabel("Player X:");
	private final JLabel lbl_score2 = new JLabel("0");
	private final JLabel lblScore = new JLabel("SCORE BOARD");
	private final JLabel lblTurn = new JLabel("O's Turn");
	private final JPanel settings = new JPanel();
	private final JButton btnRBoard = new JButton("Reset Board");
	private final JButton btnRScore = new JButton("Reset Score");
	private final JButton btnLockReset = new JButton("Lock/Unlock");
	private final JButton btnExit = new JButton("EXIT");
	private int turn=1;
	private boolean lock=true;
	private static Game game;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					game=frame;
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Game() {
		initGUI();
	}
	
	private void reset(){
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
	}
	
	public void resetScore(){
		if(!(lbl_score1.getText().equals("0")&&lbl_score2.equals("0"))){
			lbl_score1.setText("0");
			lbl_score2.setText("0");
			reset();
			turn=1;
		}
	}
	
	private void checkVictory(String whoseTurn){
		String str1=btn1.getText();
		String str2=btn2.getText();
		String str3=btn3.getText();
		String str4=btn4.getText();
		String str5=btn5.getText();
		String str6=btn6.getText();
		String str7=btn7.getText();
		String str8=btn8.getText();
		String str9=btn9.getText();
		int winC1=Integer.parseInt((lbl_score1.getText()));
		int winC2=Integer.parseInt((lbl_score2.getText()));
		
		if(str1==whoseTurn && str2==whoseTurn && str3==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText()+" WON!!!");				
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText()+" WON!!!");
			}
			reset();
		}
		else if(str1==whoseTurn && str4==whoseTurn && str7==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str1==whoseTurn && str5==whoseTurn && str9==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str2==whoseTurn && str5==whoseTurn && str8==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str3==whoseTurn && str6==whoseTurn && str9==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str7==whoseTurn && str5==whoseTurn && str3==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str5==whoseTurn && str6==whoseTurn && str4==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(str7==whoseTurn && str8==whoseTurn && str9==whoseTurn){
			if(whoseTurn=="O"){
				lbl_score1.setText(String.valueOf(winC1+1));
				JOptionPane.showMessageDialog(game, lbl_player1.getText().replace(":", "")+" WON!!!");				
			}
			else{
				lbl_score2.setText(String.valueOf(winC2+1));
				JOptionPane.showMessageDialog(game, lbl_player2.getText().replace(":", "")+" WON!!!");
			}
			reset();
		}
		else if(!(str1.isEmpty() || str2.isEmpty() || str3.isEmpty() || str4.isEmpty() || str5.isEmpty() || str6.isEmpty() || str7.isEmpty() || str8.isEmpty() || str9.isEmpty())){
			JOptionPane.showMessageDialog(game, "DRAW.");
			reset();			
		}
	}
	
	private String takeTurn(){
		turn++;
		if(turn%2==0){
			lblTurn.setText("X's Turn");
			return "O";			
		}
		else{
			lblTurn.setText("O's Turn");
			return "X";
		}
	}
	
	private void initGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("tictactoe.jpg"));
		setTitle("Tic Tac Toe:  N.A.Original");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 20, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 56));
		lblScore.setBounds(760, 11, 484, 58);
		
		panel.add(lblScore);
		lbl_player1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_player1.setBounds(752, 2, 248, 221);
		lbl_player1.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_player1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 46));
		
		panel.add(lbl_player1);
		lbl_score1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_score1.setBounds(1002, 2, 248, 221);
		lbl_score1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 46));
		lbl_score1.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(lbl_score1);
		lbl_player2.setBounds(752, 225, 248, 221);
		lbl_player2.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_player2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 46));
		
		panel.add(lbl_player2);
		lbl_score2.setBounds(1002, 225, 248, 221);
		lbl_score2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 46));
		lbl_score2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(lbl_score2);
		btn1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn1.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		lblTurn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTurn.setForeground(Color.RED);
		lblTurn.setBackground(Color.BLACK);
		lblTurn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblTurn.setBounds(752, 404, 92, 37);
		
		panel.add(lblTurn);
		btn1.setBounds(2, 2, 248, 221);
		
		panel.add(btn1);
		btn2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn2.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn2.setBounds(252, 2, 248, 221);
		
		panel.add(btn2);
		btn3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn3.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn3.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn3.setBounds(502, 2, 248, 221);
		
		panel.add(btn3);
		btn4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn4.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn4.setBounds(2, 225, 248, 221);
		
		panel.add(btn4);
		btn5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn5.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn5.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn5.setBounds(252, 225, 248, 221);
		
		panel.add(btn5);
		btn6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn6.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn6.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn6.setBounds(502, 225, 248, 221);
		
		panel.add(btn6);
		btn7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn7.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn7.setBounds(2, 448, 248, 221);
		
		panel.add(btn7);
		btn8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn8.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn8.setBounds(252, 448, 248, 221);
		
		panel.add(btn8);
		btn9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 77));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.getText().isEmpty()){
					String whoseTurn=takeTurn();
					btn9.setText(whoseTurn);
					checkVictory(whoseTurn);
				}
			}
		});
		btn9.setBounds(502, 448, 248, 221);
		
		panel.add(btn9);
		settings.setBounds(752, 448, 496, 221);
		
		panel.add(settings);
		settings.setLayout(new GridLayout(0, 2, 0, 0));
		settings.add(btnRBoard);
		btnRBoard.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 38));
		btnLockReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lock)
					lock=false;
				else
					lock=true;
				btnRBoard.setEnabled(lock);
				btnRScore.setEnabled(lock);
			}
		});
		settings.add(btnLockReset);
		btnLockReset.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 36));
		btnRScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetScore();
				JOptionPane.showMessageDialog(game, "score reseted!");
			}
		});
		settings.add(btnRScore);
		btnRScore.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 38));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(game, "Are You Sure You Want To EXIT?");
				if(a==0)
					System.exit(0);
			}
		});
		settings.add(btnExit);
		btnExit.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 38));
		btnRBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
	}
}
