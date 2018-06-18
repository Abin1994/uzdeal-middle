package com.itcat.uzdealmiddle.vo;

import lombok.Data;

/*
  *@Data
  * @Data直接修饰POJO or beans， getter所有的变量，setter所有不为final的变量。
  * 如果你不需要默认的生成方式，直接填写你需要的annotation的就可以了。
  * 默认生成的所有的annotation都是public的，如果需要不同权限修饰符可以使用AccessLevel.NONE选项。当
  * 然@Data也可以使用staticConstructor选项生成一个静态方法。
     =@Setter+@Getter+@EqualsAndHashCode+@NoArgsConstructor
  *
 */
@Data
public class User {

    private String name;
    private int age;
}
