/**
 * 
 */
package jsp.excercise.obj.nv;

/**
 * @author TechCare
 *
 */
public class KySu extends CanBo {
	private String nganhDaoTao;
	public KySu(String hoTen, String diaChi, String gioiTinh, int namSinh, String nganhDaoTao) {
		super(hoTen, diaChi, gioiTinh, namSinh);
		this.nganhDaoTao = nganhDaoTao;
	}
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
}
