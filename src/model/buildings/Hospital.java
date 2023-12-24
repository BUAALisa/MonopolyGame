package model.buildings;


import model.LandModel;
import model.PlayerModel;
import context.GameState;
import control.Control;

/**
 * @className Hospital
 * @author hcr
 * @date  2023/12/7
 **/

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
