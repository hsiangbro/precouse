package com.tom;

public class Precouse {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.hello();

        //8個常用基本資料型態
        //包裝類別 Integer Short Long Character Byte Float Double Boolean
        int age = 19;           //整數值 int 32位元 short 16位元 long 64位元
        Integer age2 = 33;
        char c = 'A';           //字元整數值16位元
        Character c2 = 'a';
        byte b = 120;           //8位元
        float weight = 66.5f;   //浮點數32位元，因等號右邊是雙精確浮點數，要用float執行後面需加 f
        double height = 1.7;    //雙精確度64位元浮點數
        boolean adult = false;  //布林值定義儲存兩種資訊：true & false
        boolean enroll = true;
        String name ="Hank";    //字串
    }
}
