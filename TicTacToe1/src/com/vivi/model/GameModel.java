package com.vivi.model;


public class GameModel {
	private String pos1;  
	private String pos2;  
	private String pos3;
	private String pos4;
	private String pos5;
	private String pos6;
	private String pos7;
	private String pos8;
	private String pos9;
	private String flag;
	private int qMove;	
	private String nameButton;
	private int numberButton;
	private String Player;
	
	public GameModel(){
		this.setPos1("");
		this.setPos2("");
		this.setPos3("");
		this.setPos4("");
		this.setPos5("");
		this.setPos6("");
		this.setPos7("");
		this.setPos8("");
		this.setPos9("");
	}
	

	public int getqMove() {
		return qMove;
	}
	public void setqMove(int qMove) {
		this.qMove = qMove;
	}

	public String getNameButton() {
		return nameButton;
	}


	public void setNameButton(String nameButton) {
		this.nameButton = nameButton;
	}

	public int getNumberButton() {
		return numberButton;
	}

	public void setNumberButton(int numberButton) {
		this.numberButton = numberButton;
	}

	public String getPlayer() {
		return Player;
	}

	public void setPlayer(String Player) {
		this.Player = Player;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPos4() {
		return pos4;
	}

	public void setPos4(String pos4) {
		this.pos4 = pos4;
	}

	public String getPos5() {
		return pos5;
	}

	public void setPos5(String pos5) {
		this.pos5 = pos5;
	}

	public String getPos6() {
		return pos6;
	}

	public void setPos6(String pos6) {
		this.pos6 = pos6;
	}

	public String getPos7() {
		return pos7;
	}

	public void setPos7(String pos7) {
		this.pos7 = pos7;
	}

	public String getPos8() {
		return pos8;
	}

	public void setPos8(String pos8) {
		this.pos8 = pos8;
	}

	public String getPos9() {
		return pos9;
	}

	public void setPos9(String pos9) {
		this.pos9 = pos9;
	}

	
	
	public String getPos1() {
		return pos1;
	}
	public void setPos1(String pos1) {
		this.pos1 = pos1;
	}
	public String getPos2() {
		return pos2;
	}
	public void setPos2(String pos2) {
		this.pos2 = pos2;
	}
	public String getPos3() {
		return pos3;
	}
	public void setPos3(String pos3) {
		this.pos3 = pos3;
	}
	public String VerifPlayer(String player){
		if(player == null || player==""){
			return "X";
		}else if(player.equals("X")){
			return "0";
		}else if(player.equals("0")){
			return ""; 
		}
		return "";
	}
	public String CheckButton(int button){
		String nmbutton = null;
		switch (button) {
		case 1:
			nmbutton = "player1";
			break;
		case 2:
			nmbutton = "player2";
			break;
		case 3:
			nmbutton = "player3";
			break;
		case 4:
			nmbutton = "player4";
			break;
		case 5:
			nmbutton = "player5";
			break;
		case 6:
			nmbutton = "player6";
			break;
		case 7:
			nmbutton = "player7";
			break;
		case 8:
			nmbutton = "player8";
			break;
		case 9:
			nmbutton = "player9";
			break;

		default:
			break;
		}
		return nmbutton;
	}
	
}

