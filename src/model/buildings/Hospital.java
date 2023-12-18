package model.buildings;


import model.LandModel;
import model.PlayerModel;
import context.GameState;
import control.Control;

/**
 * 
 * ҽԺ ��ɫ����˵ص㣬�����ò�����Ժ����ɫסԺ��Ϻ󣬻�����������Ϸ סԺʱ�䣺1 - 4��
 * 
 *
 * 
 */
public class Hospital extends Building {
	
	private String[] events = {
			"��ҽԺ�������С�",
			"�����񾭲����ߣ���ǰһ���о����顣",
			"��ҽԺ�ſ����ϴ�٣���ȺŹ����ҪסԺ�۲졣",
			"��ҽԺ����סԺ���ѡ�"
	};
	
	public Hospital(int posX, int posY) {
		super(posX, posY);
		this.name = "ҽԺ";
	}
	public String[] getEvents() {
		return events;
	}
	@Override
	public int getEvent() {
		return GameState.HOSPITAL_EVENT;
	}
}
