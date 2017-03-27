package test.annotation.fruit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果名称 默认""
 * @author huang_xiaohua
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	 /**
     * 颜色枚举
     *
     */
    public enum FColor{ BULE,RED,GREEN};
    
    /**
     * 颜色属性
     * @return
     */
    FColor fruitColor() default FColor.GREEN;

}
