package model;

/**
 * @className TextTipModel
 * @author wly
 * @date  2023/12/5
 **/
public interface Port {
	/**
	 * @param tick
	 * ģ�͸���
	 * 
	 */
	public abstract void updata(long tick);
	
	/**
	 * 
	 * ��Ϸ��ʼ��
	 * 
	 */
	public abstract void startGameInit();
}
