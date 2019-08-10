package com.lty.fsb.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lty
 * @since 2019-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Oillist implements Serializable {
    @TableId(type = IdType.AUTO)
    private  Integer id;
    private static final long serialVersionUID = 1L;

    private String username;

    private String location;

    private BigDecimal price;

    private LocalDateTime createtime;

    private LocalDateTime changetime;

    private String oilnum;

    public Oillist(String username) {
        this.username = username;
    }
}
