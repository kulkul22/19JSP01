/**
 * 
 */
package jsp.excercise.obj.nv;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author TechCare
 *
 */
public interface IQuanLyCanBo {
	public List<NhanVien> khoiTaoNhanVien();
	public Set<KySu> khoiTaoKySu();
	public HashMap<String, CongNhan> khoiTaoCongNhan();
	public void hienThiDanhSachCanBo(LoaiCanBo loaiCB);
	public void timKiemCanBo(String name, LoaiCanBo loaiCB);
	
}
