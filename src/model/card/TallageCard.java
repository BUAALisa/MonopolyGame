package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;

/**
 * 
 * ��˰��,ֱ�ӌ�����ʹ�ö�����������ȡ�F���10%���
 * 
 *
 */
/**
 * @className TallageCard
 * @author wly
 * @date  2023/12/6
 **/
public class TallageCard extends Card{

	public TallageCard(PlayerModel owner) {
		super(owner);
		this.name = "TallageCard";
		this.cName = "��˰��";
		this.price = 100;
	}

	@Override
	public int useCard() {
		return GameState.CARD_TALLAGE;
	}

}
