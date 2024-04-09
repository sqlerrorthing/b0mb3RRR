package me.oneqxz.b0mb3rrr.data;

import lombok.Getter;
import me.oneqxz.b0mb3rrr.Format;

public record Phone(String phone) {

    public Phone(String phone) {
        this.phone = phone
                .replace(" ", "")
                .replace("(", "")
                .replace(")", "")
                .replace("-", "")
                .replaceFirst("\\+", "");
    }

    public String format(String mask, String maskSymbol) {
        return Format.format(this.phone, mask, maskSymbol);
    }

    public String format(String mask) {
        return this.format(mask, "*");
    }

    @Override
    public String toString() {
        return this.phone;
    }
}
