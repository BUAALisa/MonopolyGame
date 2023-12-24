package model.buildings;

import java.awt.Graphics;

import model.Port;
import model.PlayerModel;

import control.Control;

/**
 * @className Building
 * @author hcr
 * @date  2023/12/7
 **/

public class Building{
	/**
	 * 
	 * ����ӵ����
	 * 
	 */
	protected PlayerModel owner = null;

	/**
	 * ��������
	 */
	protected String name;

	/**
	 * �ɹ�����
	 */
	protected boolean purchasability = false;

	/**
	 * ����յصļ۸�
	 */
	protected int price;
	/**
	 * ˰
	 */
	protected int revenue;
	/**
	 * ��ǰ���ݵȼ�
	 */
	protected int level;

	/**
	 * 
	 * ������
	 * 
	 */
	protected int posX;
	/**
	 * ������
	 */
	protected int posY;
	/**
	 * ���ȼ�
	 */
	protected int maxLevel;

	/**
	 *
	 * @param posX
	 * @param posY
	 */
	public Building(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	/**
	 *
	 * @return boolean
	 */
	public boolean isPurchasability() {
		return purchasability;
	}

	/**
	 *
	 * @param purchasability
	 */
	public void setPurchasability(boolean purchasability) {
		this.purchasability = purchasability;
	}

	/**
	 * �Ƿ��������
	 * @return boolean
	 */
	public boolean canUpLevel() {
		return this.level < maxLevel;
	}

	/**
	 *
	 * @return PlayerModel
	 */
	public PlayerModel getOwner() {
		return owner;
	}

	/**
	 * ���õ�ǰ���
	 * @param owner
	 */
	public void setOwner(PlayerModel owner) {
		this.owner = owner;
	}

	/**
	 *
	 * @return int
	 */
	public int getLevel() {
		return level;
	}

	/**
	 *
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * ��ȡ����
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * ��ȡ����
	 * @return String
	 */
	public String getUpName() {
		return name;
	}

	/**
	 *
	 * @return int
	 */
	public int getUpLevelPrice() {
		return price;
	}
	/**
	 * ��ȡ�����ܼ�ֵ
	 * @return int
	 */
	public int getAllPrice() {
		return 0;
	}

	/**
	 * ��ȡ��·��
	 * @return int
	 */
	public int getRevenue() {
		return revenue;
	}

	/**
	 * ��ȡ������
	 * @return int
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * ��ȡ������
	 * @return int
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * �����¼�
	 * @return int
	 */
	public int getEvent() { return 0;}
	
	/**
	 * ·���¼�
	 * @return int
	 */
	public int passEvent() { return 0;}

	/**
	 * ����
	 * @param g
	 */

	public void paint(Graphics g){}

	
}	
