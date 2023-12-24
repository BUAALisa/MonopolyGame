package model.card;

import java.awt.Image;

import model.PlayerModel;

/**
 * @className Card
 * @author xjy
 * @date  2023/12/3
 **/


public abstract class Card {

	/**
	 * 
	 * ��ƬӢ������
	 * 
	 */
	protected String name;
	/**
	 * 
	 * ��Ƭ��������
	 * 
	 */
	protected String cName;
	
	/**
	 * 
	 * ��ƬͼƬ
	 * 
	 */
	protected Image img;
	
	/**
	 * 
	 * ӵ����
	 * 
	 * 
	 */
	protected PlayerModel owner;
	
	/**
	 * 
	 * ���ö���
	 * 
	 */
	protected PlayerModel eOwner;
	
	/**
	 * 
	 * ��Ƭ�۸�
	 * 
	 */
	protected int price = 100;
	
	protected Card (PlayerModel owner) {
		this.owner =owner;
	}
	
	/**
	 * @return int
	 * ʹ�ÿ�ƬЧ��
	 * 
	 * 
	 */
	public abstract int useCard ();
	/**
	 *
	 *  ��Ƭ����Ч��
	 * @return int
	 * 
	 */
	public int cardBuff(){ return 0;}


	/**
	 *
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return Image
	 */
	public Image getImg() {
		return img;
	}

	/**
	 *
	 * @return PlayerModel
	 */
	public PlayerModel getOwner() {
		return owner;
	}

	public void setOwner(PlayerModel owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public String getcName() {
		return cName;
	}
	

	public PlayerModel geteOwner() {
		return eOwner;
	}

	public void seteOwner(PlayerModel eOwner) {
		this.eOwner = eOwner;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
