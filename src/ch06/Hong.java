package ch06;

public class Hong {
    //이름
    String name;
    //아이디
    String id;
    //비밀번호
    String pw;
    //이메일
    String emali;
    //휴대폰번호
    int tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Hong(String name, String id, String pw, String emali, int tel) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.emali = emali;
        this.tel = tel;
    }
}
