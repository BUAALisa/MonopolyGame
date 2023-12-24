package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;

/**
 * 
 * 
 * ң������,ʹ���b�����ӣ��������ɿ�����һ�������c����
 * OK
 *
 */
/**
 * @className ControlDiceCard
 * @author wly
 * @date  2023/11/20
 **/
public class ControlDiceCard extends Card{

	int diceNumber;
	
	public ControlDiceCard(PlayerModel owner) {
		super(owner);
		this.name = "ControlDiceCard";
		this.cName = "ң�����ӿ�";
		this.price = 30;
	}

	@Override
	public int useCard() {
		return GameState.CARD_CONTROLDICE;
	}
}
