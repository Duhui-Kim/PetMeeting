package com.petmeeting.springboot.dto.charge;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KakaoReadyResDto {
    private String tid;
    private String next_redirect_pc_url;
}
