package com.kh.jdbc;

import com.kh.jdbc.dao.EmpDAO;
import com.kh.jdbc.vo.EmpVo;

import java.util.List;
import java.util.Scanner;

public class JdbcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDAO dao = new EmpDAO();
        while (true) {
            System.out.println("======= [EMP Table Command] =======");
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.println("[1]SELECT ,[2]INSERT, [3]UPDATE, [4]DELETE, [5]EXIT : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    List<EmpVo> list = dao.empSelect();
                    dao.empSelectPint(list);
                    break;
                case 2 :
                    dao.empInsert();
                    break;
                case 3 :
                    dao.empUpdate();
                case 4 :
                    dao.empDelete();
                case 5 :
                    System.out.println("메뉴를 종료 합니다.");
                    return;
            }
        }
    }
}
