//package miniProject;
//회원가입(이용자) 클래스
//이용자의 등급 결정을 위한 사용액 메서드 혹은 클래스 필요.
//이용자 테이블에 주문한 음식의 비용을 더해가는 컬럼 추가 필요할 듯. TOTAL_PRICE
//TOTAL_PRICE에 맞춰 등급 표시 -> 메인 클래스에서 구현?


//public class Test {
//    package com.kh.jdbc.dao;
//
//import com.kh.jdbc.util.Common;
//import com.kh.jdbc.vo.CustomerVO;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//

//    public class CustomerDAO {
//        Connection conn = null;
//        Statement stmt = null;
//        PreparedStatement pStmt = null;
//        ResultSet rs = null;
//
//        Scanner sc = new Scanner(System.in);
//
//        public List<CustomerVO> CustomerSelect() {
//            List<CustomerVO> list = new ArrayList<>(); // 반환할 리스트를 위해 리스트 객체 생성
//            try {
//                conn = Common.getConnection();
//                stmt = conn.createStatement();
//                String sql = "SELECT * FROM CUSTOMER ";
//                rs = stmt.executeQuery(sql);
//
//                while (rs.next()) {
//                    String USER_ID = rs.getString("USER_ID");
//                    String USER_PW = rs.getString("USER_PW");
//                    String USER_NAME = rs.getString("USER_NAME");
//                    String PHONE = rs.getString("PHONE");
//                    String ADDR = rs.getString("ADDR");
//                    int BIRTH = rs.getInt("BIRTH");
//                    String EMAIL = rs.getString("EMAIL");
//                    int MONTHFEE = rs.getInt("MONTHFEE");
//                    //TOTAL_PRICE 추가 필요
//                    int TOTAL_PRICE = rs.getInt("TOTAL_PRICE");
//                    CustomerVO vo = new CustomerVO(USER_ID, USER_PW, USER_NAME, PHONE,
//                    ADDR,BIRTH, EMAIL, MONTHFEE, TOTAL_PRICE); // 객체 생성?
//                    list.add(vo);
//                }
//                Common.close(rs); // 연결과 역순으로 해제
//                Common.close(stmt);
//                Common.close(conn);
//
//            } catch (Exception e) {   //???
//                e.printStackTrace();
//            }
//            return list;
//        }
//
//          //???
//        public void customerSelectPrint(List<CustomerVO> list) {
//
//            for (CustomerVO e : list) {
//                System.out.println("회원 아이디 : " + e.getUSER_ID());
//                System.out.println("회원 비밀번호 : " + e.getUSER_PW());
//                System.out.println("회원 이름 : " + e.getUSER_NAME());
//                System.out.println("회원 전화번호 : " + e.getPHONE());
//                System.out.println("주소 : " + e.getADDR());
//                System.out.println("생년월일 : " + e.getBIRTH());
//                System.out.println("이메일 : " + e.getEMAIL());
//                System.out.println("월정액 : " + e.getMONTHFEE());
//                System.out.println("등급 : " + e.getTOTAL_PRICE());
//                System.out.println("======================================");
//            }
//        }
//
//
//
//
//        public void customerPointPrint(CustomerVO vo) {
//            if (vo == null) {
//                System.out.println("해당하는 고객 정보가 없습니다.");
//                return;
//            }
//            System.out.println("------------------------------------------------------------------------");
//            System.out.println("회원 아이디 : " + e.getUSER_ID());
//            System.out.println("회원 비밀번호 : " + e.getUSER_PW());
//            System.out.println("회원 이름 : " + e.getUSER_NAME());
//            System.out.println("전화번호 : " + e.getPHONE());
//            System.out.println("주소 : " + e.getADDR());
//            System.out.println("생년월일 : " + e.getBIRTH());
//            System.out.println("이메일 : " + e.getEMAIL());
//            System.out.println("월정액 : " + e.getMONTHFEE());
//            System.out.println("======================================");
//
//
//        }
//
//
//        public void customerInsert () {
//            System.out.println("----------------------------회원 가입창-------------------------------------");
//            System.out.print("회원 아이디 : ");
//            int USER_ID = sc.nextInt();
//            System.out.print("회원 비밀번호 : ");
//            int USER_PW = sc.nextInt();
//            System.out.print("회원 이름 : ");
//            String USER_NAME = sc.next();
//            System.out.print("전화번호 : ");
//            String PHONE = sc.nextInt();
//            System.out.print("주소 : ");
//            String ADDR = sc.next();
//            System.out.print("생년월일 : ");
//            String USER_NAME = sc.next();
//            System.out.print("월정액 [1]5000 [2]15000 : ");
//            String MONTHFEE = sc.nextInt();
//


//            // 회원가입된 정보 추가
//            String sql = "INSERT INTO CUSTOMER(USER_ID, USER_PW, USER_NAME, ) VALUES (?, ?, ?
//            )";
//


//            try {
//                conn = Common.getConnection();
//                pStmt = conn.prepareStatement(sql);
//                pStmt.setString(1, cid);
//                pStmt.setString(2, cname);
//                pStmt.setString(3, phone);
//                int ret = pStmt.executeUpdate();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            Common.close(stmt);
//            Common.close(conn);
//        }
//
//        public void customerUpdate () {
//            System.out.print("변경할 회원의 아이디를 입력하세요 : ");
//            String USER_ID = sc.next();
//            System.out.print("변경할 주소를 입력하세요 : ");
//            String ADDR = sc.next();
//            System.out.print("변경할 전화번호를 입력하세요 : ");
//            String PHONE = sc.next();
//
//            String sql = "UPDATE CUSTOMER SET ADDR = ?, PHONE = ? WHERE USER_ID = ?";
//
//            try {
//                conn = Common.getConnection();
//                pStmt = conn.prepareStatement(sql);
//                pStmt.setString(1, ADDR);
//                pStmt.setString(2, PHONE);
//                pStmt.setString(3, USER_ID);
//                pStmt.executeUpdate();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            Common.close(pStmt);
//            Common.close(conn);
//
//        }
//
//        public void customerDelete() {
//            System.out.print("삭제(탈퇴)할 회원의 아이디를 입력 하세요  : ");
//            String csid = sc.next();
//            String sql = "DELETE FROM CUSTOMER WHERE USER_ID = ?";
//            try {
//                conn = Common.getConnection();
//                pStmt = conn.prepareStatement(sql);
//                pStmt.setString(1, USER_ID);
//                pStmt.executeUpdate();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            Common.close(pStmt);
//            Common.close(conn);
//
//        }
//
//
//
//        public boolean isCid(String id) { // 입력된 아이디와 일치하는 레코드가 고객 테이블에 존재하는지 확인하는 메소드
//            boolean isCid = false;
//            try {
//                conn = Common.getConnection();
//                String query = "SELECT COUNT(*) FROM CUSTOMER WHERE CS_ID = ? ";
//                // COUNT(*) 일치하는 레코드가 있는지 확인! 만약 반환된 값이 0보다 크면, 일치하는 레코드가 존재한다는 것을 의미
//                pStmt = conn.prepareStatement(query);
//                pStmt.setString(1, id);
//                rs = pStmt.executeQuery();
//
//                if (rs.next()) {
//                    int count = rs.getInt(1);
//                    if (count > 0) {
//                        isCid = true;
//                    }
//                }
//                Common.close(rs);
//                Common.close(pStmt);
//                Common.close(conn);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return isCid;
//        }
//
//        public boolean isName(String USER_ID) { // 입력된 아이디와 일치하는 레코드가 고객 테이블에 존재하는지 확인하는 메소드
//            boolean isUSER_ID = false;
//            try {
//                conn = Common.getConnection();
//                String query = "SELECT COUNT(*) FROM CUSTOMER WHERE USER_ID = ? ";
//                // COUNT(*) 일치하는 레코드가 있는지 확인! 만약 반환된 값이 0보다 크면, 일치하는 레코드가 존재한다는 것을 의미
//                pStmt = conn.prepareStatement(query);
//                pStmt.setString(1, USER_ID);
//                rs = pStmt.executeQuery();
//
//                if (rs.next()) {
//                    int count = rs.getInt(1); // 저장된 결과값을 가져와 count 변수에 저장
//                    if (count > 0) {
//                        isName = true;
//                    }
//                }
//                Common.close(rs);
//                Common.close(pStmt);
//                Common.close(conn);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return isName;
//        }
//


            //  여기를 잘 모르겠음
//        public CustomerVO customerTOTAL_PRINCE(String val) {
//                CustomerVO vo = null;
//                try {
//                conn = Common.getConnection();
//                stmt = conn.createStatement();
//                String sql = "SELECT * FROM CUSTOMER WHERE USER_ID = '" + val + "'";
//
//                rs = stmt.executeQuery(sql);
//                while (rs.next()) {
//                String cid = rs.getString("CS_ID");
//                String cname = rs.getString("CS_NAME");
//                String phone = rs.getString("PHONE");
//                int totalPoint = rs.getInt("TOTAL_POINT");
//                vo = new CustomerVO(cid, cname, phone, totalPoint); // 하나의 행(레코드)에 대한 정보 저장을 위한 객체 생성
//                }
//
//                } catch (Exception e) {
//                e.printStackTrace();
//                }
//                Common.close(rs);
//                Common.close(stmt);
//                Common.close(conn);
//                return vo;
//        }
//        public void customerPointPrint(CustomerVO vo) {
//                if (vo == null) {
//                    System.out.println("해당하는 고객 정보가 없습니다.");
//                    return;
//                }
//                System.out.println("------------------------------------------------------------------------");
//                System.out.println("회원 아이디 : " + vo.getCid());
//                System.out.println("회원 이름 : " + vo.getCname());
//                System.out.println("회원 전화번호 : " + vo.getPhone());
//                System.out.println("누적 포인트 : " + vo.getTotalPoint());
//                System.out.println("------------------------------------------------------------------------");
//          }



//
//
//    }
//}
