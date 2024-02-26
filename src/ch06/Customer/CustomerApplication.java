package ch06.Customer;

import ch06.Customer.Customer;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    //    Customer객체 저장가능 50개
    private static Customer[] customersArray = new Customer[50];


    public static void main(String[] args) {
        boolean run = true;
        while (run) {

            System.out.println("========================");
            System.out.println("1.고객등록 | 2.고객 목록 | 3.포인트 적립 | 4.포인트 사용 | 5. 종료");
            System.out.println("========================");


            System.out.println("선택 >");

            int select = scanner.nextInt();//입력 받기
            switch (select) {
                case 1:createCustomer();
                    break;
                case 2:customerList();
                    break;
                case 3:point();
                    break;
                case 4:use();
                    break;
                case 5:run=false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    //1.고객 등록
    private static void createCustomer() {
        System.out.println("========================");
        System.out.println("고객등록");
        System.out.println("========================");

        System.out.println("이름: ");
        String name = scanner.next();

        System.out.println("휴대폰 번호: ");
        String tel = scanner.next();

        System.out.println("집주소: ");
        String home = scanner.next();

        System.out.println("보유포인트 :");
        int point = scanner.nextInt();

        //입력받은 정보를 이용해 Customer객체 생성
        Customer newCustomer = new Customer(name, tel, home, point);

        //CustomerArray 배열에 Customer 객체를 저장
        for (int i = 0; i < customersArray.length; i++) {

            //고객정보 순서대로 저장
            if (customersArray[i] == null) {
                customersArray[i] = newCustomer;
                System.out.println("고객정보가 등록 되었습니다");

                break;
            }

        }
    }


    //2.고객 목록
    private static void customerList() {
        System.out.println("========================");
        System.out.println("고객목록");
        System.out.println("========================");

        //배열안에서 Customer객체가 있는 부분 가져오기
        for (int i = 0; i < customersArray.length; i++) {
            Customer customer = customersArray[i];
            if (customer != null) {
                System.out.println(customer.getName() + " " + customer.getTel() + " " + customer.getHome() + " " + customer.getPoint());
            } else {
                break;
            }
        }

    }

    //3.포인트 적립
    private static void point() {
        System.out.println("========================");
        System.out.println("포인트 적립");
        System.out.println("========================");

        System.out.println("휴대폰 번호: ");
        String tel = scanner.next();

        Customer customer = findCustomer(tel);//전화번호로 고객 찾기

        if (customer == null) {
            System.out.println("고객이 아닙니다.");
            return;
        }
        System.out.println("적립 포인트: ");
        int accumulate = scanner.nextInt();


        if (accumulate >= 2000) {
            accumulate += accumulate * 0.1;

        }
        //적립한 포인트를 기존포인트랑 더한다
        customer.setPoint(customer.getPoint() + accumulate);
        System.out.println("적립되었습니다.");

    }


    //    4.포인트 사용
    private static void use() {

        System.out.println("========================");
        System.out.println("포인트사용");
        System.out.println("========================");


        System.out.println("휴대폰 번호: ");
        String tel = scanner.next();

                Customer customer = findCustomer(tel);//전화번호로 고객 찾기
        if (customer == null) {
            System.out.println("등록되지않은 고객입니다.");
            return;
        }

        System.out.println("사용포인트");
        int accumulate=scanner.nextInt();
            if (customer.getPoint()<accumulate){
                System.out.println("보유포인트가 적습니다.");
                return;
            }


        if (customer.getPoint() < 500) {
            System.out.println("500포인트 이상만 사용가능합니다.");
            return;
        }

        customer.setPoint(customer.getPoint() - accumulate);
        System.out.println("사용되었습니다.");
    }


    //5.핸드폰 번호로 고객 찾기
    private static Customer findCustomer(String tel) {
        Customer customer = null;

        for (int i = 0; i < customersArray.length; i++) {

            if (customersArray[i] != null) {

                String phon = customersArray[i].getTel();

                if (phon.equals(tel)) {
                    customer = customersArray[i];
                    break;
                }

            }

        }

        return customer;

        }
    }




