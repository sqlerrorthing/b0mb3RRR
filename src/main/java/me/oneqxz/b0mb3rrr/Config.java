package me.oneqxz.b0mb3rrr;

import lombok.Builder;
import lombok.Getter;
import me.oneqxz.b0mb3rrr.data.Phone;

@Builder
@Getter
public class Config {
    private Phone phone;
    private long delay;
    private boolean debug;
    private long cycles;
}
