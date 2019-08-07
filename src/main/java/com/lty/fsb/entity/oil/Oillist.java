package com.lty.fsb.entity.oil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lty
 * @since 2019-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Oillist implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String location;

    private BigDecimal price;

    private LocalDateTime createtime;

    private LocalDateTime changetime;

    private String oilnum;


}
