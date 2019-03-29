public enum Capacity {
    BOEING747(100),
    GOENGR282(200),
    BIRLIN292(200),
    TURKIS272(200),
    FRANCE229(500),
    EGYPTI191(700);


    private final int value;

    Capacity(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
