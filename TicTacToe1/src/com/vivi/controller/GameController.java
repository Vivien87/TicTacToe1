package com.vivi.controller;

import com.vivi.model.GameModel;

public class GameController {

	 public String verifplayer(int player){
		 if(player % 2 == 0){
			
			 	return "0";
			
			}else{
			
				return "X";
			}		 
	 }
	 
	 public GameModel SetPosicaoModel(GameModel gm){
		 String Player = gm.getPlayer();
		 switch (gm.getNumberButton()) {
			case 1:
				gm.setPos1(Player);				
				break;
			case 2:
				gm.setPos2(Player);
				break;
			case 3:
				gm.setPos3(Player);
				break;
			case 4:
				gm.setPos4(Player);				
				break;
			case 5:
				gm.setPos5(Player);
				break;
			case 6:
				gm.setPos6(Player);
				break;
			case 7:
				gm.setPos7(Player);
				break;
			case 8:
				gm.setPos8(Player);				
				break;
			case 9:
				gm.setPos9(Player);
				break;

			default:
				break;
			}
			return gm;
	 }
	 
	 public GameModel VerifButton(GameModel gm){
			switch (gm.getNumberButton()) {
			case 1:
				gm.setFlag("player1");				
				break;
			case 2:
				gm.setFlag("player2");
				break;
			case 3:
				gm.setFlag("player3");
				break;
			case 4:
				gm.setFlag("player4");				
				break;
			case 5:
				gm.setFlag("player5");
				break;
			case 6:
				gm.setFlag("player6");
				break;
			case 7:
				gm.setFlag("player7");
				break;
			case 8:
				gm.setFlag("player8");				
				break;
			case 9:
				gm.setFlag("player9");
				break;

			default:
				break;
			}		
			return gm;
		}
	 public String VerifWinner(GameModel gm){
	        //horizontalX
	        if ( gm.getPos1().equals("X") && gm.getPos2().equals("X") && gm.getPos3().equals("X")) {
	            return "X Won!";
	        }
	        if ( gm.getPos4().equals("X") && gm.getPos4().equals(gm.getPos5()) && gm.getPos4().equals(gm.getPos6()) ) {
	        	return "X Won!";
	        }
	        if ( gm.getPos7().equals("X") && gm.getPos7().equals(gm.getPos8()) && gm.getPos7().equals(gm.getPos9()) ){
	        	return "X Won!";
	        }
	        //verticalx
	        if ( gm.getPos1().equals("X") && gm.getPos1().equals(gm.getPos4()) && gm.getPos1().equals(gm.getPos7()) ){
	        	return "X Won!";
	        }
	        if ( (gm.getPos2().equals("X") && gm.getPos2().equals(gm.getPos5()) && gm.getPos2().equals(gm.getPos8())) ){
	        	return "X Won!";
	        }
	        if ( (gm.getPos3().equals("X") && gm.getPos3().equals(gm.getPos6()) && gm.getPos3().equals(gm.getPos9())) ){
	        	return "X Won!";
	        }
	        //diagonalX
	        if ( (gm.getPos1().equals("X") && gm.getPos1().equals(gm.getPos5()) && gm.getPos1().equals(gm.getPos9())) ){
	        	return "X Won!";
	        }
	        if ( (gm.getPos3().equals("X") && gm.getPos3().equals(gm.getPos5()) && gm.getPos3().equals(gm.getPos7())) ){
	        	return "X Won!";
	        }
	        
	        //horizontal0
	        if ( (gm.getPos1().equals("0") && gm.getPos1().equals(gm.getPos2()) && gm.getPos1().equals(gm.getPos3())) ){
	        	return "0 Won!";
	        }
	        if ( (gm.getPos4().equals("0") && gm.getPos4().equals(gm.getPos5()) && gm.getPos4().equals(gm.getPos6())) ){
	        	return "0 Won!";
	        }
	        if ( (gm.getPos7().equals("0") && gm.getPos7().equals(gm.getPos8()) && gm.getPos7().equals(gm.getPos9())) ){
	        	return "0 Won!!";
	        }
	        //vertical0
	        if ( (gm.getPos1().equals("0") && gm.getPos1().equals(gm.getPos4()) && gm.getPos1().equals(gm.getPos7())) ){
	        	return "0 Won!";
	        }
	        if ( (gm.getPos2().equals("0") && gm.getPos2().equals(gm.getPos5()) && gm.getPos2().equals(gm.getPos8())) ){
	        	return "0 Won!";
	        }
	        if ( (gm.getPos3().equals("0") && gm.getPos3().equals(gm.getPos6()) && gm.getPos3().equals(gm.getPos9())) ){
	        	return "0 Won!";
	        }
	        //diagonal0
	        if ( (gm.getPos1().equals("0") && gm.getPos1().equals(gm.getPos5()) && gm.getPos1().equals(gm.getPos9())) ){
	        	return "0 Won!";
	        }
	        if ( (gm.getPos3().equals("0") && gm.getPos3().equals(gm.getPos5()) && gm.getPos3().equals(gm.getPos7())) ){
	        	return "0 Won!";
	        }
	        
	       
	        else {
	            if(!gm.getPos1().equals("") && !gm.getPos2().equals("") && !gm.getPos3().equals("") && !gm.getPos4().equals("") && 
	                    !gm.getPos5().equals("") && !gm.getPos6().equals("") && !gm.getPos7().equals("") && !gm.getPos8().equals("") && 
	                    !gm.getPos9().equals("")){
	            	return "GAME PLAYED!";
	            }
	            return " ";
	        }
	        
	        
	    }
	 
}
