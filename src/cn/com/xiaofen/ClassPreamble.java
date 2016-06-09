package cn.com.xiaofen;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author XiaoFen
 * ����ע������
 * 
 * */

@Retention(RetentionPolicy.RUNTIME)
@Documented()
@Target(value={ElementType.METHOD,ElementType.TYPE})
@interface ClassPreamble {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	// ��������
	String[] reviewers();
}