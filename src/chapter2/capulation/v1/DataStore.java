package chapter2.capulation.v1;

// 핵 시설을 관리하는 개발자
public class DataStore {
    // "B" 문자열이 들어오면 핵폭발 발생..!
    private String store;

    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B가 입력되면 안됩니다.");
        } else {
            this.store = store;
        }
    }
}
