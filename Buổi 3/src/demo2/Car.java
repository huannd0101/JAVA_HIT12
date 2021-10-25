package demo2;

public class Car {
    //data hiding + đóng gói
    private String tenXe;
    private String mauSac;
    private int soBanhXe;

    public Car() {

    }

    public void setSoBanhXe(int soBanhXe) {
        if(soBanhXe % 2 != 0) {
            this.soBanhXe = soBanhXe - 1;
        }else {
            this.soBanhXe = soBanhXe;
        }
    }

    public int getSoBanhXe() {
        return soBanhXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }
    public String getTenXe() {
        return this.tenXe;
    }


    public Car(String tenXe, String mauSac, int soBanhXe) {
        this.tenXe = tenXe;
        this.mauSac = mauSac;
        this.soBanhXe = soBanhXe;
    }

    public Car(String tenXe, String mauSac) {
        this.tenXe = tenXe;
        this.mauSac = mauSac;
        this.soBanhXe = 4;
    }




    public void diThang() {
        System.out.println("Lái xe đi thẳng");
    }
    public void diLui() {
        System.out.println("Lái xe đi lùi");
    }


    @Override
    public String toString() {
        return "Car{" +
                "tenXe='" + tenXe + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", soBanhXe=" + soBanhXe +
                '}';
    }
}
