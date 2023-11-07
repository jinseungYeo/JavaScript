package chapter16;

import java.util.StringTokenizer;

public class StringTokenizerExam {

    public static void main(String[] args) {
        String s1 = "name yeojs gender M age 23";
        String s2 = "name,yeojs,gender,M,age,23"; // Fixed the string with commas
        String s3 = "name/yeojs/gender/M/age/23"; // Fixed the string with slashes

        System.out.println(":: 빈칸을 기준으로 분리 ::");
        StringTokenizer st1 = new StringTokenizer(s1, " ");
        while (st1.hasMoreTokens()) {
            String token = st1.nextToken();
            System.out.println(token);
        }

        System.out.println(":: ,를 기준으로 분리 ::");
        StringTokenizer st2 = new StringTokenizer(s2, ",");
        while (st2.hasMoreTokens()) {
            String token = st2.nextToken();
            System.out.println(token);
        }

        System.out.println(":: /를 기준으로 분리 ::");
        StringTokenizer st3 = new StringTokenizer(s3, "/");
        while (st3.hasMoreTokens()) {
            String token = st3.nextToken();
            System.out.println(token);
        }
    }
}

