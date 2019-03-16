/**
 * 
 */
package jsp.excercise.obj.nv;

/**
 * @author TechCare
 *
 */
public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, String diaChi, String gioiTinh, int namSinh, String congViec) {
		super(hoTen, diaChi, gioiTinh, namSinh);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	

}
