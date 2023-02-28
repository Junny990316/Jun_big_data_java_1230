package miniProject;
import miniProject.dao.CustomerDAO;
import miniProject.vo.CustomerVo;
import java.util.List;
import java.util.Scanner;

public class MiniMain {
    public static void main(String[] args) {
        customerSelect();
    }
    public static void customerSelect() {
        Scanner sc = new Scanner(System.in);
        CustomerDAO dao = new CustomerDAO();
        while (true) {
            System.out.println("===== [EMP Table 조회] =====");
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.println("[1]SELECT, [2]INSERT, [3]UPDATE, [4]DELETE, [5]EXIT");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    List<CustomerVo> list = dao.CustomerSelect();
                    dao.CustomerSelectPrint(list);
                    break;
                case 2 :
                    dao.CustomerInsert();
                    break;
                case 3 :
                    dao.customerUpdate();
                    break;
                case 4 :
                    dao.customerDelete();
                    break;
                case 5 :
                    System.out.println("메뉴를 종료 합니다");
                    return;
            }
        }
    }
}
