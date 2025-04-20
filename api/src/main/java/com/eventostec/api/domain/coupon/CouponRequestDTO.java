package com.eventostec.api.domain.coupon;

import java.util.Date;

public record CouponRequestDTO(Integer discount, String code, Long valid) {
}
