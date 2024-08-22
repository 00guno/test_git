package ex1_printf;

public class Ex1_printf {

    public static void main(String[] args) {
        int age = 30;
        System.out.printf("제 나이는 %d살 입니다. \n", age);

        System.out.printf("회사에서 집까지 %d km 입니다. \n", 20);
        // 저는 25살이고 , 키가 160입니다
        System.out.printf("저는 %d세이고 , 키가 %d 입니다 \n.", 25, 160);
        System.out.println("-------------------------------");

        // 2024-08-21
        System.out.printf("%d-%02d-%02d\n", 2024, 8, 21);
        
        char last_name = '박';
        //저의 성은 박씨 입니다
        System.out.printf("저의 성은 %c씨 입니다\n" , last_name);
        //저는 A형 이고 , 키는 170.5입니다
        System.out.printf("저는 %c형이고 , 키는 %f 입니다\n" , 'A' , 170.5);
        
        //오늘 기온은 32.7도 입니다
        float temp = 32.7f;
        System.out.printf("오늘 기온은 %.1f 입니다\n" , temp);
        
        String region = "서울";
        System.out.printf("제 고향은 %s입니다\n", region);
        
        //저의 나이는 20이고 사는 곳은 경북입니다
        System.out.printf("제 나이는 %d이고 , 사는 곳은 %s 입니다\n" , 20 , "경북");
        
        //저는 상위 15% 입니다
        System.out.printf("저는 상위 %d%%입니다\n" , 15 );
        //formatter의 종류
        //%d : 정수
        //%c : 문자
        //%f : 실수 
        //%s : 문자열
        //%% : %문자
    }
}

