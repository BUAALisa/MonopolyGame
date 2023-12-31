package ui.config;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * @className Photo
 * @author hcr
 * @date  2023/11/20
 **/


public class Photo {
	
	/**
	 *  ���һѡ��ͼƬ
	 */
	public static ImageIcon PLAYER_01_SELECTED = new ImageIcon("images/config/playerChoose/selected_01.png");
	/**
	 *  ��Ҷ�ѡ��ͼƬ
	 */
	public static ImageIcon PLAYER_02_SELECTED = new ImageIcon("images/config/playerChoose/selected_02.png");
	/**
	 *  ��ť
	 */
	public static ImageIcon[] BUTTON_LEFT = {
		new ImageIcon("images/config/��ť/normal.png"),
		new ImageIcon("images/config/��ť/disabled.png"),
		new ImageIcon("images/config/��ť/mouseOver.png"),
		new ImageIcon("images/config/��ť/pressed.png")
	};
	/**
	 *  �Ұ�ť
	 */
	public static ImageIcon[] BUTTON_RIGHT = {
		new ImageIcon("images/config/�Ұ�ť/normal.png"),
		new ImageIcon("images/config/�Ұ�ť/disabled.png"),
		new ImageIcon("images/config/�Ұ�ť/mouseOver.png"),
		new ImageIcon("images/config/�Ұ�ť/pressed.png")
	};
	/**
	 * ��ѡ����ͼƬ
	 * */
	public static ImageIcon[] PLAYER_CHOOSE = {
		new ImageIcon("images/player/0/head_h5.png"),
		new ImageIcon("images/player/1/head_h5.png"),
		new ImageIcon("images/player/2/head_h5.png"),
		new ImageIcon("images/player/3/head_h5.png")
	};
}
