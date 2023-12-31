package model.card;

import javax.swing.JOptionPane;

import context.GameState;

import model.PlayerModel;

/**
 * 
 * 查税卡,直接對對手使用而從其手中收取現金的10%稅款。
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
		this.cName = "查税卡";
		this.price = 100;
	}

	@Override
	public int useCard() {
		return GameState.CARD_TALLAGE;
	}

}
