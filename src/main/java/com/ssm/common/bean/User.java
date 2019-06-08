package com.ssm.common.bean;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User implements Serializable {
    
    private static final long serialVersionUID = 8676131899637805511L;

    private String id;
    private String name;
}
