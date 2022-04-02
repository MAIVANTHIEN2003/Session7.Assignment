package Session7.Assignment;


public final class Sp {
    public String Name;
    public Double Gia;
    public String Donvi;
    public Integer SoLuong;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double gia) {
        Gia = gia;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String donvi) {
        Donvi = donvi;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public Sp(String Name, Double Gia, String Donvi, Integer Soluong){
        this.Name = Name;
        this.Gia = Gia;
        this.Donvi = Donvi;
        this.SoLuong = Soluong;
    }
    public String toString(){
        String s = "\n -----------";
        s +="\n" + getName();
        s +="\n" + getGia();
        s +="\n" + getDonvi();
        s +="\n" + getSoLuong();
        return s;
    }
}
