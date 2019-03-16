/**
 * 
 */
package jsp.excercise.obj.nv;

/**
 * @author TechCare
 *
 */
public class CongNhan extends CanBo {
	private String bac;
	public CongNhan(String hoTen, String diaChi, String gioiTinh, int namSinh, String bac) {
		super(hoTen, diaChi, gioiTinh, namSinh);
		this.bac = bac;
	}
	public String getBac() {
		return bac;
	}
	public void setBac(String bac) {
		this.bac = bac;
	}
	
}
