package Products;

public class PC extends Product{
    private String brand;
    private String cpu;
    private String gpu;
    private int memorySize;

    public PC(String brand, String cpu, String gpu, int memorySize, String name, int price) {
        this.brand = brand;
        this.cpu = cpu;
        this.gpu = gpu;
        this.memorySize = memorySize;
        this.productName = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public static void main(String[] args) {

    }
}
