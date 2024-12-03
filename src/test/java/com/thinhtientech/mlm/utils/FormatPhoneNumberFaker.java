package com.thinhtientech.mlm.utils;
import com.github.javafaker.Faker;
public class FormatPhoneNumberFaker extends Faker{
    public String phoneNumberVietnam() {
        // Các tiền tố phổ biến của số điện thoại di động tại Việt Nam
        String[] prefixes = {"09", "08", "03", "07"};
        // Chọn ngẫu nhiên một tiền tố từ danh sách
        String prefix = prefixes[this.random().nextInt(prefixes.length)];

        // Tạo 8 chữ số ngẫu nhiên còn lại
        String remainingDigits = String.format("%08d", this.number().numberBetween(0, 100000000));

        // Kết hợp tiền tố và 8 chữ số để tạo thành số điện thoại hoàn chỉnh
        return prefix + remainingDigits;
    }
}
