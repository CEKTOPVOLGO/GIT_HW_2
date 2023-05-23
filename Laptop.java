public class Laptop {
    private String model;
    private int valueRAM;
    private int valueROM;
    private String operatingSystem;
    private String color;
    private boolean check;

    public Laptop (String model, int valueRAM, int valueROM, String operatingSystem, String color){
        this.model = model;
        this.valueROM = valueROM;
        this.valueRAM = valueRAM;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.check = true;
    }

    public String getModel() {
        return model;
    }
    public int getValueRAM() {
        return valueRAM;
    }
    public int getValueROM() {
        return valueROM;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getColor() {
        return color;
    }
    public boolean getCheck() {
        return check;
    }
    
    public void setCheck(boolean check) {
        this.check = check;
    }
    public String toString() {        
        return "Модель: " + model + ", Объём ОЗУ: " + valueRAM + ", Объём ПЗУ: " + valueROM + ", ОС: " + operatingSystem + " Цвет: " + color;
    }    
}
