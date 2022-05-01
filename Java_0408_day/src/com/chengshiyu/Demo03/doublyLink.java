package com.chengshiyu.Demo03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class doublyLink {
    private doublyLink head;

    private Object data;

    private doublyLink next;

}
