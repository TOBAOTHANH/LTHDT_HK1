package tuan3.bai8_CD;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        this.maCD = 0;
        this.tuaCD = "";
        this.caSy = "";
        this.soBaiHat = 1;
        this.giaThanh = 1.0;
    }

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        setSoBaiHat(soBaiHat); 
        setGiaThanh(giaThanh); 
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            this.soBaiHat = 1; 
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            this.giaThanh = 1.0; 
        }
    }

    @Override
    public String toString() {
        return "Mã CD: " + maCD + ", Tựa CD: " + tuaCD + ", Ca sĩ: " + caSy +
               ", Số bài hát: " + soBaiHat + ", Giá thành: " + giaThanh;
    }
}
