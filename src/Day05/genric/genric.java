package Day05.genric;

public class genric <T,S> {
    T num;
    S name;

    public T getNum() {
        return num;
    }

    public S getName() {
        return name;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public void setName(S name) {
        this.name = name;
    }


}
