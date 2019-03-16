/**
 * 
 */
package jsp.excercise.obj.nv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author TechCare
 *
 */
public class QuanLycanBoImpl implements IQuanLyCanBo {
	public static List<NhanVien> nhanViens;
	public static Set<KySu> kySus;
	public static HashMap<String, CongNhan> congNhans;
	
	public static void main(String arg[]) {
		IQuanLyCanBo quanLyCanBo = new QuanLycanBoImpl();
		nhanViens = quanLyCanBo.khoiTaoNhanVien();
		kySus = quanLyCanBo.khoiTaoKySu();
		congNhans = quanLyCanBo.khoiTaoCongNhan();
		
		// Hien thi danh sach can bo da khoi tao
		System.out.println("---------------- Danh sach Can Bo -------------------");
		quanLyCanBo.hienThiDanhSachCanBo(LoaiCanBo.NV);
		quanLyCanBo.hienThiDanhSachCanBo(LoaiCanBo.KS);
		quanLyCanBo.hienThiDanhSachCanBo(LoaiCanBo.CN);
		
		System.out.println("---------------- Ket qua tim kiem -------------------");
		quanLyCanBo.timKiemCanBo("Nguyen Van A", LoaiCanBo.NV);
		System.out.println("---------------- Ket qua tim kiem -------------------");
		quanLyCanBo.timKiemCanBo("Le Thi B", LoaiCanBo.KS);
		System.out.println("---------------- Ket qua tim kiem -------------------");
		quanLyCanBo.timKiemCanBo("Tran Van C", LoaiCanBo.CN);
	}

	@Override
	public List<NhanVien> khoiTaoNhanVien() {
		// khoi tao du lieu
		NhanVien nv1 = new NhanVien("Nguyen Van A", "Tran Cao Van", "nam", 1999, "ctv");
		NhanVien nv2 = new NhanVien("Nguyen Thi B", "Le Duan", "nu", 1995, "giam sat");
		NhanVien nv3 = new NhanVien("Nguyen Van C", "Le Do", "nam", 1997, "ho tro");
		List<NhanVien> nhanViens = new ArrayList<NhanVien>();
		nhanViens.add(nv1);
		nhanViens.add(nv2);
		nhanViens.add(nv3);
		return nhanViens;
	}
	
	@Override
	public Set<KySu> khoiTaoKySu() {
		// khoi tao du lieu
		KySu ks1 = new KySu("Le Thai A", "Tran Cao Van", "nam", 1999, "ky su cong trinh");
		KySu ks2 = new KySu("Le Thi B", "Le Duan", "nu", 1992, "ky su co dien");
		KySu ks3 = new KySu("Le Thai C", "Ly Thai To", "nam", 1999, "ky su truong");
		Set<KySu> kySus = new HashSet<KySu>();
		kySus.add(ks1);
		kySus.add(ks2);
		kySus.add(ks3);
		return kySus;
	}

	@Override
	public HashMap<String, CongNhan> khoiTaoCongNhan() {
		// khoi tao du lieu
		CongNhan cn1 = new CongNhan("Tran Van A", "Nguyen Du", "nam", 1993, "3/7");
		CongNhan cn2 = new CongNhan("Tran Thi B", "Hai Phong", "nu", 1996, "4/7");
		CongNhan cn3 = new CongNhan("Tran Van C", "Le Thanh Nghi", "nam", 1997, "5/7");
		HashMap<String, CongNhan> congNhans = new HashMap<String, CongNhan>();
		congNhans.put(cn1.getHoTen(), cn1);
		congNhans.put(cn2.getHoTen(), cn2);
		congNhans.put(cn3.getHoTen(), cn3);
		return congNhans;
		
	}

	@Override
	public void hienThiDanhSachCanBo(LoaiCanBo loaiCB) {
		switch (loaiCB) {
		case NV:
			hienThiDanhSachNhanVien();
			break;
		case KS:
			hienThiDanhSachKySu();
			break;
		case CN:
			hienThiDanhSachCongNhan();
			break;
		default:
			break;
		}
		
	}
	
	@Override
	public void timKiemCanBo(String name, LoaiCanBo loaiCB) {
		switch (loaiCB) {
		case NV:
			NhanVien nv = timNhanVien(name);
			if (nv != null && nv.getHoTen() != null) {
				System.out.println("   Ho Ten   | Loai Can Bo | Cong Viec");
				System.out.println(nv.getHoTen() + "    nhan vien    " + nv.getCongViec());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		case KS:
			KySu ks = timKySu(name);
			if (ks != null && ks.getHoTen() != null) {
				System.out.println("   Ho Ten  | Loai Can Bo | Cong Viec");
        		System.out.println(ks.getHoTen() + "    ky su    " + ks.getNganhDaoTao());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		case CN:
			CongNhan cn = timCongNhan(name);
			if (cn != null && cn.getHoTen() != null) {
				System.out.println("   Ho Ten  | Loai Can Bo | Cong Viec");
        		System.out.println(cn.getHoTen() + "    cong nhan    " + cn.getBac());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		default:
			break;
		}
		
	}
	
	public static void hienThiDanhSachNhanVien() {
		System.out.println("     Ho Ten         | Loai Can Bo | Cong Viec");
		for (int i = 0 ; i < nhanViens.size(); i++) {
			NhanVien nv = nhanViens.get(i);
			System.out.println(i+1 + ", " + nv.getHoTen() + "    nhan vien    " + nv.getCongViec());
		}
	}
	
	public static void hienThiDanhSachKySu() {
		System.out.println("     Ho Ten         | Loai Can Bo | Cong Viec");
		Iterator<KySu> it = kySus.iterator();
		int i = 1;
        while (it.hasNext()) {
        	KySu element = (KySu) it.next();
        	System.out.println(i + ", " + element.getHoTen() + "    ky su    " + element.getNganhDaoTao());
        	i++;
        }
	}
	
	public static void hienThiDanhSachCongNhan() {
		System.out.println("     Ho Ten         | Loai Can Bo | Cong Viec");
		int i = 1;
	    for (HashMap.Entry<String, CongNhan> entry : congNhans.entrySet()) {
	    	CongNhan cn = (CongNhan) entry.getValue();
	    	System.out.println(i + ", " + cn.getHoTen() + "    cong nhan    " + cn.getBac());
		}
	}
	
	public static NhanVien timNhanVien(String name) {
		for (int i = 0 ; i < nhanViens.size(); i++) {
			NhanVien nv = nhanViens.get(i);
			if (name != null && nv.getHoTen().equals(name)) {
				return nv;
			}
		}
		return null;
	}
	
	public static KySu timKySu(String name) {
		Iterator<KySu> it = kySus.iterator();
		while (it.hasNext()) {
        	KySu kySu = (KySu) it.next();
        	if (kySu != null && kySu.getHoTen() != null) {
        		return kySu;
        	}
        }
		return null;
	}
	
	public static CongNhan timCongNhan(String name) {
		for (HashMap.Entry<String, CongNhan> entry : congNhans.entrySet()) {
	    	CongNhan cn = (CongNhan) entry.getValue();
	    	if (cn != null && cn.getHoTen() != null) {
	    		return cn;
	    	}
		}
		return null;
	}


	
}
