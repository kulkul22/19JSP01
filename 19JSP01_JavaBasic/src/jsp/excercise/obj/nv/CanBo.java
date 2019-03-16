/**
 * 
 */
package jsp.excercise.obj.nv;

/**
 * @author TechCare
 *
 */
public class CanBo {
	private String hoTen, diaChi, gioiTinh;          
	private int namSinh;
	
	public CanBo(String hoTen, String diaChi, String gioiTinh, int namSinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	 
	 
}
