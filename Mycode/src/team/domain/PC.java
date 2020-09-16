package team.domain;

public class PC implements Equipment {
    private String model;//主机
    private String display;//显示器
    @Override
    public String getDescription() {
        return model+"("+display+")";
    }
    public PC(){
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
}
