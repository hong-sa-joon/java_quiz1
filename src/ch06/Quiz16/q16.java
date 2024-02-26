package ch06.Quiz16;

public class q16 {
    class Marine {
        int x=0, y=0; // Marine의 위치좌표(x,y)
        int hp = 60; // 현재 체력
        static int weapon = 6; // 공격력
        static int armor = 0; // 방어력
        //체력을 공유하면 맞지않아도 한명만 맞으면 다 같이 죽기때문에 공유하지않는다
        //공격력과 방어력은 한번에 올리기 위해 공유한다 수많은 병사들을 하나씩 올리기엔 복작하고 필요가없기에
        //위치좌표도 공유하지않는다 공유하면 개별로 활용할 수 없고 같이 사용 할 수 밖에 없어서
        void weaponUp() {
            weapon++;
        }
        void armorUp() {
            armor++;
        }
        void move(int x, int y) {
            this.x = x; // this.x는 인스턴스 변수, x는 지역변수
            this.y = y; // this.y는 인스턴스 변수, y는 지역변수
        }
    }

}
